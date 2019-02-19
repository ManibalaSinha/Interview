package com.example.manibala.interview;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    ArrayList<HashMap<String,String>> contactList;
    Button buttonParse;
   // String msg = "Android:";
   // Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactList = new ArrayList<>();
        buttonParse = (Button) findViewById(R.id.button);
        buttonParse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
            }
        });
        //button=(Button) findViewById(R.id.button);
        //Log.d(msg, "the onCreate() event");
    }
    private  void beginJsonParsing(){
        Toast.makeText(this,"",Toast.LENGTH_SHORT).show();
        JSONObject reader = new JSONObject(loadJsonFromAsset());
    }
    public String loadJsonFromAsset(){
        String json =null;
        return json;
    }
    
   /* public void onClickAddName(View view){
        //add a new student record
        ContentValues values = new ContentValues();
        //values.put();
    }*/
   /* public void broadcastIntent(View view){
        Intent intent = new Intent();
        intent.setAction("customIntent");
        sendBroadcast(intent);
    }*/
    /*public  void  startService(View view){
        startService(new Intent(getBaseContext(),MyService.class));
    }
    public void stopService(View view){
        stopService(new Intent(getBaseContext(), MyService.class));
    }*/
    /*public void onClick(View view){
        Intent intent= new Intent(MainActivity.this, Activity2.class);
        startActivity(intent);
    }*/
}
