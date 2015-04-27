package com.example.okano56.test;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import static com.example.okano56.test.R.id.buttonToDBSite;


public class MainActivity extends ActionBarActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        //ボタンのリスナーセット
//        Button btn = (Button)findViewById(R.id.button);
//        btn.setOnClickListener(clicked);   //test dada
    }
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btnToSecond:
                //Intent intent = new Intent(this,ActivitySecond.class);
                Intent intent = new Intent(this,MapsActivity.class);
                startActivity(intent);
                break;
            case buttonToDBSite:
                Intent intent2 = new Intent(this,DBSampleA.class);
                startActivity(intent2);
                break;
        }
    }
//    //ボタンの処理
//    public View.OnClickListener clicked = new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            switch (v.getId()){
//                case R.id.btnToSecond:
//                    Intent intent = new Intent(this,ActivitySecond.class);
//                    startActivity(intent);
//                    break;
//            }
//            Log.v("Button", "onClick");
//       }
//    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
