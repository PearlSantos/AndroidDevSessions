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

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginButton = (Button) findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //get username
                EditText usernameText = (EditText) findViewById(R.id.username);
                String username = usernameText.getText().toString();
                //get password
                EditText passText = (EditText) findViewById(R.id.password);
                String password = passText.getText().toString();

                //get the username and password from Register from the sharedPreference
                SharedPreferences prefs = Login.this.getSharedPreferences("NAME_OF_PREFS", Context.MODE_PRIVATE);
                String usernameReg = prefs.getString("username", "Default_Val");
                String passwordReg = prefs.getString("password", "Default_val");

                //check if it matches the one in Login
                if(username.equals(usernameReg) && password.equals(passwordReg)){
                    //if yes, successful login!
                    //go to home screen. Send the username in the intent
                    Intent loginIntent = new Intent(Login.this, Home.class);
                    loginIntent.putExtra("username", username);
                    Login.this.startActivity(loginIntent);
                } else{
                    //if they don't match, show an error message
                    Toast.makeText(Login.this, "No such user", Toast.LENGTH_SHORT).show();

                }


            }
        });
    }
}
