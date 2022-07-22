package com.example.quizindonesiaku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class QuizActivity extends AppCompatActivity {

    private TextView questions;
    private TextView question;

    private AppCompatButton pilihan1, pilihan2, pilihan3, pilihan4;

    private AppCompatButton lanjutBtn;

    private Timer quizTimer;

    private int totalTimeInMins = 1;

    private int seconds = 0;

    private List<QuestionsList> questionsLists;

    private int currentQuestionPositions = 0; //40.03

    private String selectedOptionByUser = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        final ImageView backBtn = findViewById(R.id.backBtn);
        final TextView timer = findViewById(R.id.timer);
        final TextView selectedTopicName = findViewById(R.id.topicName);

        questions = findViewById(R.id.questions); //27.10
        question = findViewById(R.id.question);

        pilihan1 = findViewById(R.id.pilihan1);
        pilihan2 = findViewById(R.id.pilihan2);
        pilihan3 = findViewById(R.id.pilihan3);
        pilihan4 = findViewById(R.id.pilihan4);

        lanjutBtn = findViewById(R.id.lanjutBtn);

        final String getSelectedTopicName = getIntent().getStringExtra("selectedTopic");

        selectedTopicName.setText(getSelectedTopicName);

        questionsLists = QuestionsBank.getQuestions(getSelectedTopicName);

        startTimer(timer);

        questions.setText((currentQuestionPositions+1)+"/"+questionsLists.size());
        question.setText(questionsLists.get(0).getQuestion());
        pilihan1.setText(questionsLists.get(0).getPilihan1());
        pilihan2.setText(questionsLists.get(0).getPilihan2());
        pilihan3.setText(questionsLists.get(0).getPilihan3());
        pilihan4.setText(questionsLists.get(0).getPilihan4());

        pilihan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (selectedOptionByUser.isEmpty()){

                    selectedOptionByUser = pilihan1.getText().toString();

                    pilihan1.setBackgroundResource(R.drawable.round_back_red10);
                    pilihan1.setTextColor(Color.WHITE);

                    revealAnswer();

                    questionsLists.get(currentQuestionPositions).setUserSelectedAnswer(selectedOptionByUser);

                }
            }
        });

        pilihan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (selectedOptionByUser.isEmpty()){

                    selectedOptionByUser = pilihan2.getText().toString();

                    pilihan2.setBackgroundResource(R.drawable.round_back_red10);
                    pilihan2.setTextColor(Color.WHITE);

                    revealAnswer();

                    questionsLists.get(currentQuestionPositions).setUserSelectedAnswer(selectedOptionByUser);

                }
            }
        });

        pilihan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (selectedOptionByUser.isEmpty()){

                    selectedOptionByUser = pilihan3.getText().toString();

                    pilihan3.setBackgroundResource(R.drawable.round_back_red10);
                    pilihan3.setTextColor(Color.WHITE);

                    revealAnswer();

                    questionsLists.get(currentQuestionPositions).setUserSelectedAnswer(selectedOptionByUser);

                }
            }
        });

        pilihan4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (selectedOptionByUser.isEmpty()){

                    selectedOptionByUser = pilihan4.getText().toString();

                    pilihan4.setBackgroundResource(R.drawable.round_back_red10);
                    pilihan4.setTextColor(Color.WHITE);

                    revealAnswer();

                    questionsLists.get(currentQuestionPositions).setUserSelectedAnswer(selectedOptionByUser);

                }
            }
        });

        lanjutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedOptionByUser.isEmpty()){
                    Toast.makeText(QuizActivity.this, "Silahkan pilih 1 pilihan", Toast.LENGTH_SHORT).show(); //47.15
                }
                else{
                    changeNextQuestion();
                }
            }
        }); //37.50

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                quizTimer.purge();
                quizTimer.cancel();

                startActivity(new Intent(QuizActivity.this, MainActivity.class));
                finish();
            }
        });
    }

    private void changeNextQuestion(){
        currentQuestionPositions++;

        if ((currentQuestionPositions+1) == questionsLists.size()){

            lanjutBtn.setText("Kirim Quiz");

        }

        if (currentQuestionPositions < questionsLists.size()){

            selectedOptionByUser = "";

            pilihan1.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
            pilihan1.setTextColor(Color.parseColor("#1F6BB8"));

            pilihan2.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
            pilihan2.setTextColor(Color.parseColor("#1F6BB8"));

            pilihan3.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
            pilihan3.setTextColor(Color.parseColor("#1F6BB8"));

            pilihan4.setBackgroundResource(R.drawable.round_back_white_stroke2_10);
            pilihan4.setTextColor(Color.parseColor("#1F6BB8"));

            questions.setText((currentQuestionPositions+1)+"/"+questionsLists.size());
            question.setText(questionsLists.get(currentQuestionPositions).getQuestion());
            pilihan1.setText(questionsLists.get(currentQuestionPositions).getPilihan1());
            pilihan2.setText(questionsLists.get(currentQuestionPositions).getPilihan2());
            pilihan3.setText(questionsLists.get(currentQuestionPositions).getPilihan3());
            pilihan4.setText(questionsLists.get(currentQuestionPositions).getPilihan4());

        }

        else{

            Intent intent = new Intent(QuizActivity.this, QuizResults.class); //49.39
            intent.putExtra("correct", getCorrectAnswers());
            intent.putExtra("incorrect", getInCorrectAnswers());
            startActivity(intent); //50.07

            finish();

        }
    }

    private void startTimer(TextView timerTextView){
        quizTimer = new Timer();

        quizTimer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                /* if (seconds == 0) {
                    totalTimeInMins--;
                    seconds = 59;
                } */
                if(seconds == 0 && totalTimeInMins == 0){
                    //quizTimer.purge();
                    //quizTimer.cancel();

                    Toast.makeText(QuizActivity.this, "Time Over", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(QuizActivity.this, QuizResults.class);
                    intent.putExtra("correct", getCorrectAnswers());
                    intent.putExtra("incorrect", getInCorrectAnswers());
                    startActivity(intent);

                    //finish();
                }
                /*else if(seconds == 0 && totalTimeInMins == 0){
                    quizTimer.purge();
                    quizTimer.cancel();

                    Toast.makeText(QuizActivity.this, "Time Over", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(QuizActivity.this, QuizResults.class);
                    intent.putExtra("correct", getCorrectAnswers());
                    intent.putExtra("incorrect", getInCorrectAnswers());
                    startActivity(intent);

                    finish();
                } */
                else if(seconds == 0){
                    totalTimeInMins--;
                    seconds = 59;
                }
                else{
                    seconds--;
                }
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                        String finalMinutes = String.valueOf(totalTimeInMins);
                        String finalSeconds = String.valueOf(seconds);

                        if (finalMinutes.length() == 1){
                            finalMinutes = "0"+finalMinutes;
                        }

                        if (finalSeconds.length() == 1){
                            finalSeconds = "0"+finalSeconds;
                        }

                        timerTextView.setText(finalMinutes+":"+finalSeconds);
                    }
                });
            }
        }, 1000, 1000);
    }

    private int getCorrectAnswers(){
        int correctAnswers = 0;
        for (int i=0; i<questionsLists.size(); i++){

            final String getUserSelectedAnswer = questionsLists.get(i).getUserSelectedAnswer();
            final String getAnswer = questionsLists.get(i).getAnswer();

            if (getUserSelectedAnswer.equals(getAnswer)){
                correctAnswers++;

            }

        }
        return correctAnswers;
    }

    private int getInCorrectAnswers(){
        int correctAnswers = 0;
        for (int i=0; i<questionsLists.size(); i++){

            final String getUserSelectedAnswer = questionsLists.get(i).getUserSelectedAnswer();
            final String getAnswer = questionsLists.get(i).getAnswer();

            if (!getUserSelectedAnswer.equals(getAnswer)){
                correctAnswers++;

            }

        }
        return correctAnswers; //36.40
    }

    @Override
    public void onBackPressed() {
        quizTimer.purge();
        quizTimer.cancel();

        startActivity(new Intent(QuizActivity.this, MainActivity.class));
        finish();
    }

    private void revealAnswer(){

        final String getAnswer = questionsLists.get(currentQuestionPositions).getAnswer();

        if (pilihan1.getText().toString().equals(getAnswer)){
            pilihan1.setBackgroundResource(R.drawable.round_back_green10); //44.09
            pilihan1.setTextColor(Color.WHITE);
        }
        else if (pilihan2.getText().toString().equals(getAnswer)){
            pilihan2.setBackgroundResource(R.drawable.round_back_green10); //44.09
            pilihan2.setTextColor(Color.WHITE);
        }
        else if (pilihan3.getText().toString().equals(getAnswer)){
            pilihan3.setBackgroundResource(R.drawable.round_back_green10); //44.09
            pilihan3.setTextColor(Color.WHITE);
        }
        else if (pilihan4.getText().toString().equals(getAnswer)){
            pilihan4.setBackgroundResource(R.drawable.round_back_green10); //44.09
            pilihan4.setTextColor(Color.WHITE);
        }
    }
}