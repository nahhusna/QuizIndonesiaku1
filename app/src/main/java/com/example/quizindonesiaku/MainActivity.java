package com.example.quizindonesiaku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String selectedTopicName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout sejarah = findViewById(R.id.sejarahlayout);
        final LinearLayout budaya = findViewById(R.id.budayalayout);
        final LinearLayout bahasa = findViewById(R.id.bahasalayout);
        final LinearLayout makanan = findViewById(R.id.makananlayout);

        final Button mulaiBtn = findViewById(R.id.mulaiQuizBtn);

        sejarah.setOnClickListener(new View.OnClickListener(){
            @Override
                public void onClick(View v){
                    selectedTopicName = "Sejarah";
                    sejarah.setBackgroundResource(R.drawable.round_back_white_stroke10);

                    budaya.setBackgroundResource(R.drawable.round_back_white10);
                    bahasa.setBackgroundResource(R.drawable.round_back_white10);
                    makanan.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        budaya.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                selectedTopicName = "Budaya";
                budaya.setBackgroundResource(R.drawable.round_back_white_stroke10);

                sejarah.setBackgroundResource(R.drawable.round_back_white10);
                bahasa.setBackgroundResource(R.drawable.round_back_white10);
                makanan.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        bahasa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                selectedTopicName = "Bahasa";
                bahasa.setBackgroundResource(R.drawable.round_back_white_stroke10);

                sejarah.setBackgroundResource(R.drawable.round_back_white10);
                budaya.setBackgroundResource(R.drawable.round_back_white10);
                makanan.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        makanan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                selectedTopicName = "Makanan";
                makanan.setBackgroundResource(R.drawable.round_back_white_stroke10);

                budaya.setBackgroundResource(R.drawable.round_back_white10);
                bahasa.setBackgroundResource(R.drawable.round_back_white10);
                sejarah.setBackgroundResource(R.drawable.round_back_white10);

            }
        });

        mulaiBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (selectedTopicName.isEmpty()){
                    Toast.makeText(MainActivity.this, "Mohon pilih topiknya", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent Intent = new Intent(MainActivity.this, QuizActivity.class);
                    Intent.putExtra("selectedTopic", selectedTopicName);
                    startActivity(Intent);
                }
            }
        });
    }
}