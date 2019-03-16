package com.vogella.android.nc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class NcLogin extends AppCompatActivity {
    EditText userID,pass;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nc_login);

        userID=findViewById(R.id.userID);
        pass=findViewById(R.id.password);
        login=findViewById(R.id.login);


    }
}
