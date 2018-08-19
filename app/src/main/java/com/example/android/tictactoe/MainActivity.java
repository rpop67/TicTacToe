package com.example.android.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

import at.markushi.ui.CircleButton;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity {

    int count;
    int prev;
    int winFlag;
    CircleButton b1;
    CircleButton b2;
    CircleButton b3;
    CircleButton b4;
    CircleButton b5;
    CircleButton b6;
    CircleButton b7;
    CircleButton b8;
    CircleButton b9;
    CircleButton resetButton;
    TextView display;
    Player playerA;
    Player playerB;
    CardView card;
    int[] TicTacToeMatrix = new int[9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        prev = 0;
        count = 0;

        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);
        resetButton=findViewById(R.id.resetButton);
        display = findViewById(R.id.displayPlayer);
        playerA = new Player();
        playerB = new Player();
        card = findViewById(R.id.card);
        display.setText("player name goes here");
        winFlag=0;

        startGame();

        b1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                count++;
                b1.setColor(whichColor());
                b1.setEnabled(false);
                if (playerA.isPlaying() == 1) {
                    TicTacToeMatrix[0] = 1;
                    playerA.setNotPlaying();
                    playerB.setPlaying();


                } else {
                    TicTacToeMatrix[0] = 2;
                    playerB.setNotPlaying();
                    playerA.setPlaying();

                }
                check();

            }
        });
        b2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;

                b2.setColor(whichColor());
                b2.setEnabled(false);

                if (playerA.isPlaying() == 1) {
                    TicTacToeMatrix[1] = 1;
                    playerA.setNotPlaying();
                    playerB.setPlaying();

                } else {
                    TicTacToeMatrix[1] = 2;
                    playerB.setNotPlaying();
                    playerA.setPlaying();

                }
                check();

            }
        });
        b3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;

                b3.setColor(whichColor());
                b3.setEnabled(false);
                if (playerA.isPlaying() == 1) {
                    TicTacToeMatrix[2] = 1;
                    playerA.setNotPlaying();
                    playerB.setPlaying();

                } else {
                    TicTacToeMatrix[2] = 2;
                    playerB.setNotPlaying();
                    playerA.setPlaying();

                }
                check();

            }
        });
        b4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;

                b4.setColor(whichColor());
                b4.setEnabled(false);
                if (playerA.isPlaying() == 1) {
                    TicTacToeMatrix[3] = 1;
                    playerA.setNotPlaying();
                    playerB.setPlaying();

                } else {
                    TicTacToeMatrix[3] = 2;
                    playerB.setNotPlaying();
                    playerA.setPlaying();

                }
                check();

            }
        });
        b5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;

                b5.setColor(whichColor());
                b5.setEnabled(false);
                if (playerA.isPlaying() == 1) {
                    TicTacToeMatrix[4] = 1;
                    playerA.setNotPlaying();
                    playerB.setPlaying();
                } else {
                    TicTacToeMatrix[4] = 2;
                    playerB.setNotPlaying();
                    playerA.setPlaying();

                }
                check();

            }
        });
        b6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;

                b6.setColor(whichColor());
                b6.setEnabled(false);
                if (playerA.isPlaying() == 1) {
                    TicTacToeMatrix[5] = 1;
                    playerA.setNotPlaying();
                    playerB.setPlaying();

                } else {
                    TicTacToeMatrix[5] = 2;
                    playerB.setNotPlaying();
                    playerA.setPlaying();

                }
                check();

            }
        });

        b7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;

                b7.setColor(whichColor());
                b7.setEnabled(false);
                if (playerA.isPlaying() == 1) {
                    TicTacToeMatrix[6] = 1;
                    playerA.setNotPlaying();
                    playerB.setPlaying();

                } else {
                    TicTacToeMatrix[6] = 2;
                    playerB.setNotPlaying();
                    playerA.setPlaying();

                }
                check();

            }
        });
        b8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;

                b8.setColor(whichColor());
                b8.setEnabled(false);
                if (playerA.isPlaying() == 1) {
                    TicTacToeMatrix[7] = 1;
                    playerA.setNotPlaying();
                    playerB.setPlaying();

                } else {
                    TicTacToeMatrix[7] = 2;
                    playerB.setNotPlaying();
                    playerA.setPlaying();

                }
                check();

            }
        });
        b9.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                TicTacToeMatrix[8] = 1;
                b9.setColor(whichColor());
                b9.setEnabled(false);
                if (playerA.isPlaying() == 1) {
                    playerA.setNotPlaying();
                    playerB.setPlaying();

                } else {
                    playerB.setNotPlaying();
                    playerA.setPlaying();

                }
                check();

            }
        });

        resetButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Reset();
            }
        });

    }


    public void startGame() {

        playerA.setPlaying();
        display.setText("Player A on the roll");
        for(int i=0;i<9;i++)
        {
            TicTacToeMatrix[i]=-1;
        }
        winFlag=0;
        count=0;
    }



    public void checkTurns() {
        if (playerA.getTurns() + playerB.getTurns() >= 10) {
            if(winFlag==0)
            {
                display.setText(" OOPS! It is a tie");
            }

        }
        else
        {
            if(playerB.isPlaying()==1)
            {
                display.setText("Player B on the roll");
            }
            else if(playerA.isPlaying()==1)
            {
                display.setText("Player A on the roll");
            }
        }
    }

    public void check() {
        checkTurns();

        //logic to know if a line has been formed by any player


        if(topRow()==1|| secondRow()==1 || thirdRow()==1 || firstCol()==1 || secondCol()==1 ||thirdCol()==1 || rightDiag()==1 || leftDiag()==1 )
        {
            display.setText("Player A is winner !!");
            winFlag=1;
            disableAll();

        }
        if(topRow()==2|| secondRow()==2 || thirdRow()==2 || firstCol()==2 || secondCol()==2 ||thirdCol()==2 || rightDiag()==2 || leftDiag()==2 )
        {
            display.setText("Player B is winner !!");
            winFlag=1;
            disableAll();

        }
    }

    public int topRow() {
        if (TicTacToeMatrix[0]!=0 && TicTacToeMatrix[0] ==  TicTacToeMatrix[1]  && TicTacToeMatrix[2] == TicTacToeMatrix[1]  ) {
            return TicTacToeMatrix[0];
        } else
            return -1;
    }

    public int secondRow() {
        if (TicTacToeMatrix[3]!=0 && TicTacToeMatrix[3] == TicTacToeMatrix[4]  && TicTacToeMatrix[5] ==TicTacToeMatrix[4] ) {
            return TicTacToeMatrix[3];
        } else
            return -1;

    }
    public int thirdRow()
    {
        if (TicTacToeMatrix[6]!=0 && TicTacToeMatrix[6]== TicTacToeMatrix[7] && TicTacToeMatrix[8]==TicTacToeMatrix[7])
        {
            return TicTacToeMatrix[6];
        }
        else
            return -1;
    }

    public int firstCol()
    {
        if (TicTacToeMatrix[0]!=0 && TicTacToeMatrix[0]==TicTacToeMatrix[3] && TicTacToeMatrix[3]== TicTacToeMatrix[6])
        {
            return TicTacToeMatrix[0];
        }
        else
            return -1;
    }

    public int secondCol()
    {
        if (TicTacToeMatrix[1]!=0 && TicTacToeMatrix[1]== TicTacToeMatrix[4] && TicTacToeMatrix[7]==TicTacToeMatrix[4])
        {
            return TicTacToeMatrix[1];
        }
        else
            return -1;
    }

    public int thirdCol()
    {
        if (TicTacToeMatrix[2]!=0 && TicTacToeMatrix[2]== TicTacToeMatrix[5] && TicTacToeMatrix[8]==TicTacToeMatrix[5])
        {
            return TicTacToeMatrix[2];
        }
        else
            return -1;
    }

    public int rightDiag()
    {
        if (TicTacToeMatrix[2]!=0 && TicTacToeMatrix[2]== TicTacToeMatrix[4] && TicTacToeMatrix[6]==TicTacToeMatrix[4])
        {
            return TicTacToeMatrix[2];
        }
        else
            return -1;
    }

    public int leftDiag()
    {
        if (TicTacToeMatrix[0]!=0 && TicTacToeMatrix[0]== TicTacToeMatrix[4] && TicTacToeMatrix[8]==TicTacToeMatrix[4] )
        {
            return TicTacToeMatrix[0];
        }
        else
            return -1;
    }

    public int whichColor() {
        int color = getResources().getColor(R.color.colorB);
        if (playerA.isPlaying() == 1) {
            color = getResources().getColor(R.color.colorA);
        } else if (playerB.isPlaying() == 1) {
            color = getResources().getColor(R.color.colorB);
        }
        return color;
    }

    public void disableAll()
    {
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);


    }
    public void Reset()
    {
        b1.setColor(getResources().getColor(R.color.lightgray));
        b2.setColor(getResources().getColor(R.color.lightgray));
        b3.setColor(getResources().getColor(R.color.lightgray));
        b4.setColor(getResources().getColor(R.color.lightgray));
        b5.setColor(getResources().getColor(R.color.lightgray));
        b6.setColor(getResources().getColor(R.color.lightgray));
        b7.setColor(getResources().getColor(R.color.lightgray));
        b8.setColor(getResources().getColor(R.color.lightgray));
        b9.setColor(getResources().getColor(R.color.lightgray));
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);

        startGame();
    }


}
