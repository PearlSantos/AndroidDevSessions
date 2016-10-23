package compsat.chatapplication.Login_Session2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import compsat.chatapplication.R;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button registerButton = (Button) findViewById(R.id.registerButton);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //get username
                EditText usernameText = (EditText) findViewById(R.id.username);
                String username = usernameText.getText().toString();
                //get password
                EditText passText = (EditText) findViewById(R.id.password);
                String password = passText.getText().toString();
                //get confirm password
                EditText conText = (EditText) findViewById(R.id.confirmPassword);
                String confirmPassword = conText.getText().toString();

                //check if password and confirmPassword is the same
                if(password.equals(confirmPassword)){
                    //if yes, proceed to next steps

                    //store the username and password in sharedPreference
                    SharedPreferences prefs = Register.this.getSharedPreferences("NAME_OF_PREFS", Context.MODE_PRIVATE);
                    SharedPreferences.Editor edit = prefs.edit();
                    edit.putString("username", username);
                    edit.putString("password", password);

                    //don't forget to save the changes
                    edit.commit();

                    //go to login screen
                    Intent loginIntent = new Intent(Register.this, Login.class);
                    Register.this.startActivity(loginIntent);

                } else{
                    //if password and confirm password are not the same, show an error message
                    Toast.makeText(Register.this, "Password and confirm password are not the same", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
