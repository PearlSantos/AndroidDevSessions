package compsat.chatapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button hi;
    private TextView hello;
    private TextView name;
    private EditText textbox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hi = (Button) findViewById(R.id.button);
        textbox = (EditText) findViewById(R.id.editText);
        name = (TextView) findViewById(R.id.textView2);
        hi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String sayHiTo = textbox.getText().toString();
                if(!sayHiTo.equals("")){
                    name.setText(sayHiTo + "!");
                }
                else{

                }
            }
        });

    }
}
