package compsat.chatapplication.Login_Session2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import compsat.chatapplication.Fragment_Session3.ChatFragment;
import compsat.chatapplication.Fragment_Session3.EditProfileFragment;
import compsat.chatapplication.Fragment_Session3.HomeFragment;
import compsat.chatapplication.Fragment_Session3.ProfileFragment;
import compsat.chatapplication.R;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        View.OnClickListener listener = new View.OnClickListener() {
            public void onClick(View view) {
                Fragment fragment;
                if(view == findViewById(R.id.viewProfile)){
                    fragment = new ProfileFragment();
                } else if(view == findViewById(R.id.editProfile)) {
                    fragment = new EditProfileFragment();
                } else if(view == findViewById(R.id.chat)) {
                    fragment = new ChatFragment();
                }
                  else {
                    fragment = new HomeFragment();
                }
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.mainFrame, fragment);
                transaction.commit();
            }
        };
        Button viewProfile = (Button)findViewById(R.id.viewProfile);
        viewProfile.setOnClickListener(listener);
        Button editProfile = (Button)findViewById(R.id.editProfile);
        editProfile.setOnClickListener(listener);
        Button chat = (Button)findViewById(R.id.chat);
        chat.setOnClickListener(listener);
        Button home = (Button)findViewById(R.id.home);
        home.setOnClickListener(listener);

//        //get TextView username
//        TextView usernameText = (TextView) findViewById(R.id.username);
//
//        //get the actual username from the Intent
//        String username = Home.this.getIntent().getStringExtra("username");
//
//        //set the text to the username gotten
//        usernameText.setText(username);


    }
}
