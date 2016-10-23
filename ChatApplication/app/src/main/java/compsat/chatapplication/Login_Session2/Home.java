package compsat.chatapplication.Login_Session2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import compsat.chatapplication.R;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //get TextView username
        TextView usernameText = (TextView) findViewById(R.id.username);

        //get the actual username from the Intent
        String username = Home.this.getIntent().getStringExtra("username");

        //set the text to the username gotten
        usernameText.setText(username);
    }
}
