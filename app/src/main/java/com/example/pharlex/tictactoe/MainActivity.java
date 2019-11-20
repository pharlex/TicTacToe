package com.example.pharlex.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int turn;
    Button topL;
    Button topM;
    Button topR;
    Button midL;
    Button midM;
    Button midR;
    Button botL;
    Button botM;
    Button botR;
    Button newGame;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        topL = (Button) findViewById(R.id.topL);
        topM = (Button) findViewById(R.id.topM);
        topR = (Button) findViewById(R.id.topR);
        midL = (Button) findViewById(R.id.midL);
        midM = (Button) findViewById(R.id.midM);
        midR = (Button) findViewById(R.id.midR);
        botL = (Button) findViewById(R.id.botL);
        botM = (Button) findViewById(R.id.botM);
        botR = (Button) findViewById(R.id.botR);
        newGame = (Button) findViewById(R.id.newGame);
        text = (TextView) findViewById(R.id.text);
        if (savedInstanceState == null) {
            turn = 0; //0 for X 1 for O
        }
        else {
            turn = savedInstanceState.getInt("t");
            text.setText(savedInstanceState.getCharSequence("tx"));
            topL.setText(savedInstanceState.getCharSequence("tL"));
            topM.setText(savedInstanceState.getCharSequence("tM"));
            topR.setText(savedInstanceState.getCharSequence("tR"));
            midL.setText(savedInstanceState.getCharSequence("mL"));
            midM.setText(savedInstanceState.getCharSequence("mM"));
            midR.setText(savedInstanceState.getCharSequence("mR"));
            botL.setText(savedInstanceState.getCharSequence("bL"));
            botM.setText(savedInstanceState.getCharSequence("bM"));
            botR.setText(savedInstanceState.getCharSequence("bR"));
            if(!topL.getText().equals("")){
                topL.setClickable(false);
            }
            if(!topM.getText().equals("")){
                topM.setClickable(false);
            }
            if(!topR.getText().equals("")){
                topR.setClickable(false);
            }
            if(!midL.getText().equals("")){
                midL.setClickable(false);
            }
            if(!midM.getText().equals("")){
                midM.setClickable(false);
            }
            if(!midR.getText().equals("")){
                midR.setClickable(false);
            }
            if(!botL.getText().equals("")){
                botL.setClickable(false);
            }
            if(!botM.getText().equals("")){
                botM.setClickable(false);
            }
            if(!botR.getText().equals("")){
                botR.setClickable(false);
            }
        }
        topL.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(turn==0){
                    topL.setClickable(false);
                    topL.setText("X");
                    text.setText(getResources().getString(R.string.oturn));
                    turn = 1;
                }
                else{
                    topL.setClickable(false);
                    topL.setText("O");
                    text.setText(getResources().getString(R.string.xturn));
                    turn = 0;
                }
                if(topL.getText().equals("X")){
                    if(topM.getText().equals("X") && topR.getText().equals("X") ||
                            midL.getText().equals("X") && botL.getText().equals("X") ||
                            midM.getText().equals("X") && botR.getText().equals("X")){
                        text.setText("X wins!");
                        gameOver();
                    }
                }
                else if(topL.getText().equals("O")){
                    if(topM.getText().equals("O") && topR.getText().equals("O") ||
                            midL.getText().equals("O") && botL.getText().equals("O") ||
                            midM.getText().equals("O") && botR.getText().equals("O")){
                        text.setText("O wins!");
                        gameOver();
                    }
                }
                if(!topL.getText().equals("") && !topM.getText().equals("") && !topR.getText().equals("") &&
                        !midL.getText().equals("") && !midM.getText().equals("") && !midR.getText().equals("") &&
                        !botL.getText().equals("") && !botM.getText().equals("") && !botR.getText().equals("")){
                    text.setText("It's a tie!");
                }
            }
        });
        topM.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(turn==0){
                    topM.setClickable(false);
                    topM.setText("X");
                    text.setText(getResources().getString(R.string.oturn));
                    turn = 1;
                }
                else{
                    topM.setClickable(false);
                    topM.setText("O");
                    text.setText(getResources().getString(R.string.xturn));
                    turn = 0;
                }
                if(topM.getText().equals("X")){
                    if(topL.getText().equals("X") && topR.getText().equals("X") ||
                            midM.getText().equals("X") && botM.getText().equals("X")){
                        text.setText("X wins!");
                        gameOver();
                    }
                }
                else if(topL.getText().equals("O")){
                    if(topL.getText().equals("O") && topR.getText().equals("O") ||
                            midM.getText().equals("O") && botM.getText().equals("O")){
                        text.setText("O wins!");
                        gameOver();
                    }
                }
                if(!topL.getText().equals("") && !topM.getText().equals("") && !topR.getText().equals("") &&
                        !midL.getText().equals("") && !midM.getText().equals("") && !midR.getText().equals("") &&
                        !botL.getText().equals("") && !botM.getText().equals("") && !botR.getText().equals("")){
                    text.setText("It's a tie!");
                }

            }
        });
        topR.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(turn==0){
                    topR.setClickable(false);
                    topR.setText("X");
                    text.setText(getResources().getString(R.string.oturn));
                    turn = 1;
                }
                else{
                    topR.setClickable(false);
                    topR.setText("O");
                    text.setText(getResources().getString(R.string.xturn));
                    turn = 0;
                }
                if(topR.getText().equals("X")){
                    if(topL.getText().equals("X") && topM.getText().equals("X") ||
                            midL.getText().equals("X") && botL.getText().equals("X") ||
                            midM.getText().equals("X") && botL.getText().equals("X")){
                        text.setText("X wins!");
                        gameOver();
                    }
                }
                else if(topR.getText().equals("O")){
                    if(topL.getText().equals("O") && topM.getText().equals("O") ||
                            midR.getText().equals("O") && botR.getText().equals("O") ||
                            midM.getText().equals("O") && botL.getText().equals("O")){
                        text.setText("O wins!");
                        gameOver();
                    }
                }
                if(!topL.getText().equals("") && !topM.getText().equals("") && !topR.getText().equals("") &&
                        !midL.getText().equals("") && !midM.getText().equals("") && !midR.getText().equals("") &&
                        !botL.getText().equals("") && !botM.getText().equals("") && !botR.getText().equals("")){
                    text.setText("It's a tie!");
                }
            }
        });
        midL.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(turn==0){
                    midL.setClickable(false);
                    midL.setText("X");
                    text.setText(getResources().getString(R.string.oturn));
                    turn = 1;
                }
                else{
                    midL.setClickable(false);
                    midL.setText("O");
                    text.setText(getResources().getString(R.string.xturn));
                    turn = 0;
                }
                if(midL.getText().equals("X")){
                    if(midM.getText().equals("X") && midR.getText().equals("X") ||
                            topL.getText().equals("X") && botL.getText().equals("X")){
                        text.setText("X wins!");
                        gameOver();
                    }
                }
                else if(midL.getText().equals("O")){
                    if(midM.getText().equals("O") && midR.getText().equals("O") ||
                            topL.getText().equals("O") && botL.getText().equals("O")){
                        text.setText("O wins!");
                        gameOver();
                    }
                }
                if(!topL.getText().equals("") && !topM.getText().equals("") && !topR.getText().equals("") &&
                        !midL.getText().equals("") && !midM.getText().equals("") && !midR.getText().equals("") &&
                        !botL.getText().equals("") && !botM.getText().equals("") && !botR.getText().equals("")){
                    text.setText("It's a tie!");
                }
            }
        });
        midM.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(turn==0){
                    midM.setClickable(false);
                    midM.setText("X");
                    text.setText(getResources().getString(R.string.oturn));
                    turn = 1;
                }
                else{
                    midM.setClickable(false);
                    midM.setText("O");
                    text.setText(getResources().getString(R.string.xturn));
                    turn = 0;
                }
                if(midM.getText().equals("X")){
                    if(midL.getText().equals("X") && midR.getText().equals("X") ||
                            topM.getText().equals("X") && botM.getText().equals("X") ||
                            topL.getText().equals("X") && botR.getText().equals("X") ||
                            topR.getText().equals("X") && botL.getText().equals("X")){
                        text.setText("X wins!");
                        gameOver();
                    }
                }
                else if(midM.getText().equals("O")){
                    if(midL.getText().equals("O") && midR.getText().equals("O") ||
                            topM.getText().equals("O") && botM.getText().equals("O") ||
                            topL.getText().equals("O") && botR.getText().equals("O") ||
                            topR.getText().equals("O") && botL.getText().equals("O")){
                        text.setText("O wins!");
                        gameOver();
                    }
                }
                if(!topL.getText().equals("") && !topM.getText().equals("") && !topR.getText().equals("") &&
                        !midL.getText().equals("") && !midM.getText().equals("") && !midR.getText().equals("") &&
                        !botL.getText().equals("") && !botM.getText().equals("") && !botR.getText().equals("")){
                    text.setText("It's a tie!");
                }
            }
        });
        midR.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(turn==0){
                    midR.setClickable(false);
                    midR.setText("X");
                    text.setText(getResources().getString(R.string.oturn));
                    turn = 1;
                }
                else{
                    midR.setClickable(false);
                    midR.setText("O");
                    text.setText(getResources().getString(R.string.xturn));
                    turn = 0;
                }
                if(midR.getText().equals("X")){
                    if(midL.getText().equals("X") && midM.getText().equals("X") ||
                            topR.getText().equals("X") && botR.getText().equals("X")){
                        text.setText("X wins!");
                        gameOver();
                    }
                }
                else if(midR.getText().equals("O")){
                    if(midL.getText().equals("O") && midM.getText().equals("O") ||
                            topR.getText().equals("O") && botR.getText().equals("O")){
                        text.setText("O wins!");
                        gameOver();
                    }
                }
                if(!topL.getText().equals("") && !topM.getText().equals("") && !topR.getText().equals("") &&
                        !midL.getText().equals("") && !midM.getText().equals("") && !midR.getText().equals("") &&
                        !botL.getText().equals("") && !botM.getText().equals("") && !botR.getText().equals("")){
                    text.setText("It's a tie!");
                }
            }
        });
        botL.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(turn==0){
                    botL.setClickable(false);
                    botL.setText("X");
                    text.setText(getResources().getString(R.string.oturn));
                    turn = 1;
                }
                else{
                    botL.setClickable(false);
                    botL.setText("O");
                    text.setText(getResources().getString(R.string.xturn));
                    turn = 0;
                }
                if(botL.getText().equals("X")){
                    if(botM.getText().equals("X") && botR.getText().equals("X") ||
                            topL.getText().equals("X") && midL.getText().equals("X") ||
                            topR.getText().equals("X") && midM.getText().equals("X")){
                        text.setText("X wins!");
                        gameOver();
                    }
                }
                else if(botL.getText().equals("O")){
                    if(botM.getText().equals("O") && botR.getText().equals("O") ||
                            topL.getText().equals("O") && midL.getText().equals("O") ||
                            topR.getText().equals("O") && midM.getText().equals("O")){
                        text.setText("O wins!");
                        gameOver();
                    }
                }
                if(!topL.getText().equals("") && !topM.getText().equals("") && !topR.getText().equals("") &&
                        !midL.getText().equals("") && !midM.getText().equals("") && !midR.getText().equals("") &&
                        !botL.getText().equals("") && !botM.getText().equals("") && !botR.getText().equals("")){
                    text.setText("It's a tie!");
                }
            }
        });
        botM.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(turn==0){
                    botM.setClickable(false);
                    botM.setText("X");
                    text.setText(getResources().getString(R.string.oturn));
                    turn = 1;
                }
                else{
                    botM.setClickable(false);
                    botM.setText("O");
                    text.setText(getResources().getString(R.string.xturn));
                    turn = 0;
                }
                if(botM.getText().equals("X")){
                    if(botL.getText().equals("X") && botR.getText().equals("X") ||
                            topM.getText().equals("X") && midM.getText().equals("X")){
                        text.setText("X wins!");
                        gameOver();
                    }
                }
                else if(botM.getText().equals("O")){
                    if(botL.getText().equals("O") && botR.getText().equals("O") ||
                            topM.getText().equals("O") && midM.getText().equals("O")){
                        text.setText("O wins!");
                        gameOver();
                    }
                }
                if(!topL.getText().equals("") && !topM.getText().equals("") && !topR.getText().equals("") &&
                        !midL.getText().equals("") && !midM.getText().equals("") && !midR.getText().equals("") &&
                        !botL.getText().equals("") && !botM.getText().equals("") && !botR.getText().equals("")){
                    text.setText("It's a tie!");
                }
            }
        });
        botR.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(turn==0){
                    botR.setClickable(false);
                    botR.setText("X");
                    text.setText(getResources().getString(R.string.oturn));
                    turn = 1;
                }
                else{
                    botR.setClickable(false);
                    botR.setText("O");
                    text.setText(getResources().getString(R.string.xturn));
                    turn = 0;
                }
                if(botR.getText().equals("X")){
                    if(botL.getText().equals("X") && botM.getText().equals("X") ||
                            topR.getText().equals("X") && midR.getText().equals("X") ||
                            topL.getText().equals("X") && midM.getText().equals("X")){
                        text.setText("X wins!");
                        gameOver();
                    }
                }
                else if(botR.getText().equals("O")){
                    if(botL.getText().equals("O") && botM.getText().equals("O") ||
                            topR.getText().equals("O") && midR.getText().equals("O") ||
                            topL.getText().equals("O") && midM.getText().equals("O")){
                        text.setText("O wins!");
                        gameOver();
                    }
                }
                if(!topL.getText().equals("") && !topM.getText().equals("") && !topR.getText().equals("") &&
                        !midL.getText().equals("") && !midM.getText().equals("") && !midR.getText().equals("") &&
                        !botL.getText().equals("") && !botM.getText().equals("") && !botR.getText().equals("")){
                    text.setText("It's a tie!");
                }
            }
        });
        newGame.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                topL.setClickable(true);
                topM.setClickable(true);
                topR.setClickable(true);
                midL.setClickable(true);
                midM.setClickable(true);
                midR.setClickable(true);
                botL.setClickable(true);
                botM.setClickable(true);
                botR.setClickable(true);
                topL.setText("");
                topM.setText("");
                topR.setText("");
                midL.setText("");
                midM.setText("");
                midR.setText("");
                botL.setText("");
                botM.setText("");
                botR.setText("");
                text.setText(getResources().getString(R.string.xturn));
                turn = 0;
            }
            });
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        savedInstanceState.putInt("t", turn);
        savedInstanceState.putCharSequence("tx", text.getText());
        savedInstanceState.putCharSequence("tL", topL.getText());
        savedInstanceState.putCharSequence("tM", topM.getText());
        savedInstanceState.putCharSequence("tR", topR.getText());
        savedInstanceState.putCharSequence("mL", midL.getText());
        savedInstanceState.putCharSequence("mM", midM.getText());
        savedInstanceState.putCharSequence("mR", midR.getText());
        savedInstanceState.putCharSequence("bL", botL.getText());
        savedInstanceState.putCharSequence("bM", botM.getText());
        savedInstanceState.putCharSequence("bR", botR.getText());
        super.onSaveInstanceState(savedInstanceState);
    }
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        turn = savedInstanceState.getInt("t");
        topL.setText(savedInstanceState.getCharSequence("tL"));
        topM.setText(savedInstanceState.getCharSequence("tM"));
        topR.setText(savedInstanceState.getCharSequence("tR"));
        midL.setText(savedInstanceState.getCharSequence("mL"));
        midM.setText(savedInstanceState.getCharSequence("mM"));
        midR.setText(savedInstanceState.getCharSequence("mR"));
        botL.setText(savedInstanceState.getCharSequence("bL"));
        botM.setText(savedInstanceState.getCharSequence("bM"));
        botR.setText(savedInstanceState.getCharSequence("bR"));
        text.setText(savedInstanceState.getCharSequence("tx"));
    }
    void gameOver(){
        topL.setClickable(false);
        topM.setClickable(false);
        topR.setClickable(false);
        midL.setClickable(false);
        midM.setClickable(false);
        midR.setClickable(false);
        botL.setClickable(false);
        botM.setClickable(false);
        botR.setClickable(false);
    }
}