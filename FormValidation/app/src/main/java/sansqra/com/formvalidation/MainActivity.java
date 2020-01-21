package sansqra.com.formvalidation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name, email, password, phone;
    String gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SelectGenderMale(View v){
        gender = "M";
    }

    public void SelectGenderFemale(View v){
        gender = "F";
    }
    
    public void Submit(View v){
        name = (EditText)findViewById(R.id.name);
        email = (EditText)findViewById(R.id.email);
        password = (EditText)findViewById(R.id.email);
        phone = (EditText)findViewById(R.id.email);
        String name_text = name.getText().toString();
        char[] email_text = email.getText().toString().toCharArray();
        String password_text = password.getText().toString();
        String phone_text = phone.getText().toString();
        String gender_text = gender;
        //empty validation
        if(name_text.isEmpty()){
            Toast t = Toast.makeText(getApplicationContext(), "Enter name", Toast.LENGTH_SHORT);
            t.show(); return;
        }
        else if(email_text.toString().isEmpty()){
            Toast t = Toast.makeText(getApplicationContext(), "Enter email", Toast.LENGTH_SHORT);
            t.show(); return;
        }
        else if(phone_text.isEmpty()){
            Toast t = Toast.makeText(getApplicationContext(), "Enter phone number", Toast.LENGTH_SHORT);
            t.show(); return;
        }
        else if(gender_text.isEmpty()){
            Toast t = Toast.makeText(getApplicationContext(), "Select gender", Toast.LENGTH_SHORT);
            t.show(); return;
        }
        //email validation
        int dot_pos = 0, at_pos = 0;
        if(!email_text.toString().contains("@")){
            Toast t = Toast.makeText(getApplicationContext(), "Email must contain a '@'", Toast.LENGTH_SHORT);
            t.show(); return;
        }
        else if(!email_text.toString().contains(".")){
            Toast t = Toast.makeText(getApplicationContext(), "Email must contain a '.'", Toast.LENGTH_SHORT);
            t.show(); return;
        }
        else{
            for(int i = 0; i < email_text.length; i++){
                if(email_text[i] == '@'){
                    at_pos = i;
                }
                else if(email_text[i] == '.'){
                    dot_pos = i;
                }
            }
            if(dot_pos < at_pos){
                Toast t = Toast.makeText(getApplicationContext(), "Invalid email", Toast.LENGTH_SHORT);
                t.show(); return;
            }
        }
        //phone validation
        if (phone_text.length() != 10){
            Toast t = Toast.makeText(getApplicationContext(), "Invalid phone number", Toast.LENGTH_SHORT);
            t.show(); return;
        }
        Toast t = Toast.makeText(getApplicationContext(), "Valid Details !!!", Toast.LENGTH_SHORT);
        t.show();
    }
}
/*
        name.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(!b) {
                    Toast t = Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_LONG);
                    t.show();
                }
            }
        });
*/