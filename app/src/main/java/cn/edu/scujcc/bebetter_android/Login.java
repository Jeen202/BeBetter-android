package cn.edu.scujcc.bebetter_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static cn.edu.scujcc.bebetter_android.R.id.top;


public class Login extends AppCompatActivity {

    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login = (Button)findViewById(top);
        login.setOnClickListener(new View.OnClickListener() {
            class Welcome {
            }

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Login.this,Welcome.class);
                startActivity(intent);

            }
        });
    }
}