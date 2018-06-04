package com.example.elaine.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    // LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        abc();

        Button button = (Button)findViewById(R.id.button);
        final EditText editText = (EditText) findViewById(R.id.textOne);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String x = editText.getText().toString();
                //Log.v("ziufh",x);
                Intent intent=new Intent(MainActivity.this,Another.class);

                intent.putExtra("name",x);
                startActivityForResult(intent,0);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==0 && resultCode==0){
            String str=data.getStringExtra("result");
            Toast.makeText(this,str, Toast.LENGTH_LONG).show();
        }

    }


    @Override
    protected void onNewIntent(Intent intent){
        super.onNewIntent(intent);
        setIntent(intent);
        abc();
    }

    private void abc(){
        Intent intent = getIntent();
        String name = intent.getStringExtra("name2");
        Toast.makeText(this,name,Toast.LENGTH_LONG).show();

    }


}
