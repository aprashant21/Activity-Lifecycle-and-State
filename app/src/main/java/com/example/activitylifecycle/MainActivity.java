package com.example.activitylifecycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10;
    private Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getting reference
        textView1=findViewById(R.id.textView1);
        textView2=findViewById(R.id.textView2);
        textView3=findViewById(R.id.textView3);
        textView4=findViewById(R.id.textView4);
        textView5= findViewById(R.id.textView5);
        textView6=findViewById(R.id.textView6);
        textView7=findViewById(R.id.textView7);
        textView8=findViewById(R.id.textView8);
        textView9=findViewById(R.id.textView9);
        textView10=findViewById(R.id.textView10);

        button1 = findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        button6=findViewById(R.id.button6);
        button7=findViewById(R.id.button7);
        button8=findViewById(R.id.button8);
        button9=findViewById(R.id.button9);
        button10=findViewById(R.id.button10);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivityForResult(intent,1);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivityForResult(intent,2);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivityForResult(intent,3);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivityForResult(intent,4);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivityForResult(intent,5);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivityForResult(intent,6);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivityForResult(intent,7);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivityForResult(intent,8);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivityForResult(intent,9);
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivityForResult(intent,10);
            }
        });

        // Restore the state.
        if (savedInstanceState != null) {
            boolean isVisible = savedInstanceState.getBoolean("reply_visible");
            if (isVisible) {
            }
        }

    }
    @Override
    public void onActivityResult(int requestCode,
                                 int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
            if (resultCode == RESULT_OK) {
                String applesText = data.getStringExtra("appleReply");
                String bananaText = data.getStringExtra("bananaReply");
                String pumpkinText = data.getStringExtra("pumpkinReply");
                String cheeseText = data.getStringExtra("cheeseReply");
                String riceText = data.getStringExtra("riceReply");
                String eggText = data.getStringExtra("eggReply");
                String grapesText = data.getStringExtra("grapesReply");

                if(requestCode==1 ) {
                    if(applesText!=null){
                        textView1.setText(applesText);
                    }
                    else if(bananaText!=null){
                        textView1.setText(bananaText);
                    }
                    else if(pumpkinText!=null){
                        textView1.setText(pumpkinText);
                    }
                    else if(cheeseText!=null){
                        textView1.setText(cheeseText);
                    }
                    else if(riceText!=null){
                        textView1.setText(riceText);
                    }
                    else if(eggText!=null){
                        textView1.setText(eggText);
                    }
                    else{
                        textView1.setText(grapesText);
                    }
                }
                else if(requestCode==2){
                    if(applesText!=null){
                        textView2.setText(applesText);
                    }
                    else if(bananaText!=null){
                        textView2.setText(bananaText);
                    }
                    else if(pumpkinText!=null){
                        textView2.setText(pumpkinText);
                    }
                    else if(cheeseText!=null){
                        textView2.setText(cheeseText);
                    }
                    else if(riceText!=null){
                        textView2.setText(riceText);
                    }
                    else if(eggText!=null){
                        textView2.setText(eggText);
                    }
                    else{
                        textView2.setText(grapesText);
                    }
                }
                else if(requestCode==3){
                    if(applesText!=null){
                        textView3.setText(applesText);
                    }
                    else if(bananaText!=null){
                        textView3.setText(bananaText);
                    }
                    else if(pumpkinText!=null){
                        textView3.setText(pumpkinText);
                    }
                    else if(cheeseText!=null){
                        textView3.setText(cheeseText);
                    }
                    else if(riceText!=null){
                        textView3.setText(riceText);
                    }
                    else if(eggText!=null){
                        textView3.setText(eggText);
                    }
                    else{
                        textView3.setText(grapesText);
                    }
                }
                else if(requestCode==4){
                    if(applesText!=null){
                        textView4.setText(applesText);
                    }
                    else if(bananaText!=null){
                        textView4.setText(bananaText);
                    }
                    else if(pumpkinText!=null){
                        textView4.setText(pumpkinText);
                    }
                    else if(cheeseText!=null){
                        textView4.setText(cheeseText);
                    }
                    else if(riceText!=null){
                        textView4.setText(riceText);
                    }
                    else if(eggText!=null){
                        textView4.setText(eggText);
                    }
                    else{
                        textView4.setText(grapesText);
                    }
                }
                else if(requestCode==5){
                    if(applesText!=null){
                        textView5.setText(applesText);
                    }
                    else if(bananaText!=null){
                        textView5.setText(bananaText);
                    }
                    else if(pumpkinText!=null){
                        textView5.setText(pumpkinText);
                    }
                    else if(cheeseText!=null){
                        textView5.setText(cheeseText);
                    }
                    else if(riceText!=null){
                        textView5.setText(riceText);
                    }
                    else if(eggText!=null){
                        textView5.setText(eggText);
                    }
                    else{
                        textView5.setText(grapesText);
                    }
                }
                else if(requestCode==6){
                    if(applesText!=null){
                        textView6.setText(applesText);
                    }
                    else if(bananaText!=null){
                        textView6.setText(bananaText);
                    }
                    else if(pumpkinText!=null){
                        textView6.setText(pumpkinText);
                    }
                    else if(cheeseText!=null){
                        textView6.setText(cheeseText);
                    }
                    else if(riceText!=null){
                        textView6.setText(riceText);
                    }
                    else if(eggText!=null){
                        textView6.setText(eggText);
                    }
                    else{
                        textView6.setText(grapesText);
                    }
                }
                else if(requestCode==7){
                    if(applesText!=null){
                        textView7.setText(applesText);
                    }
                    else if(bananaText!=null){
                        textView7.setText(bananaText);
                    }
                    else if(pumpkinText!=null){
                        textView7.setText(pumpkinText);
                    }
                    else if(cheeseText!=null){
                        textView7.setText(cheeseText);
                    }
                    else if(riceText!=null){
                        textView7.setText(riceText);
                    }
                    else if(eggText!=null){
                        textView7.setText(eggText);
                    }
                    else{
                        textView7.setText(grapesText);
                    }
                }
                else if(requestCode==8){
                    if(applesText!=null){
                        textView8.setText(applesText);
                    }
                    else if(bananaText!=null){
                        textView8.setText(bananaText);
                    }
                    else if(pumpkinText!=null){
                        textView8.setText(pumpkinText);
                    }
                    else if(cheeseText!=null){
                        textView8.setText(cheeseText);
                    }
                    else if(riceText!=null){
                        textView8.setText(riceText);
                    }
                    else if(eggText!=null){
                        textView8.setText(eggText);
                    }
                    else{
                        textView8.setText(grapesText);
                    }
                }
                else if(requestCode==9){
                    if(applesText!=null){
                        textView9.setText(applesText);
                    }
                    else if(bananaText!=null){
                        textView9.setText(bananaText);
                    }
                    else if(pumpkinText!=null){
                        textView9.setText(pumpkinText);
                    }
                    else if(cheeseText!=null){
                        textView9.setText(cheeseText);
                    }
                    else if(riceText!=null){
                        textView9.setText(riceText);
                    }
                    else if(eggText!=null){
                        textView9.setText(eggText);
                    }
                    else{
                        textView9.setText(grapesText);
                    }
                }
                else if(requestCode==10){
                    if(applesText!=null){
                        textView10.setText(applesText);
                    }
                    else if(bananaText!=null){
                        textView10.setText(bananaText);
                    }
                    else if(pumpkinText!=null){
                        textView10.setText(pumpkinText);
                    }
                    else if(cheeseText!=null){
                        textView10.setText(cheeseText);
                    }
                    else if(riceText!=null){
                        textView10.setText(riceText);
                    }
                    else if(eggText!=null){
                        textView10.setText(eggText);
                    }
                    else{
                        textView10.setText(grapesText);
                    }
                }
            }
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);

    }
}