package com.example.elaine.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Another extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_another);

        abc();

        Button button=(Button)findViewById(R.id.button2);

        final EditText editText = (EditText) findViewById(R.id.textTwo); //1111

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String x2 = editText.getText().toString();
                Intent intent=new Intent(Another.this,MainActivity.class);

                intent.putExtra("name2",x2);
                startActivityForResult(intent,0);
            }
        });



    }

    @Override
    protected void onNewIntent(Intent intent){
        super.onNewIntent(intent);
        setIntent(intent);
        abc();
    }

    private void abc(){
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        Toast.makeText(this,name,Toast.LENGTH_LONG).show();

    }

}
