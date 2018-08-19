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
    CircleButton b1;
    CircleButton b2;
    CircleButton b3;
    CircleButton b4;
    CircleButton b5;
    CircleButton b6;
    CircleButton b7;
    CircleButton b8;
    CircleButton b9;
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
        display = findViewById(R.id.displayPlayer);
        playerA = new Player();
        playerB = new Player();
        card = findViewById(R.id.card);
        display.setText("player name goes here");
        startGame();

        b1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                count++;
                TicTacToeMatrix[0] = 1;
                b1.setColor(whichColor());
                b1.setEnabled(false);
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
                TicTacToeMatrix[6] = 1;
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
                TicTacToeMatrix[7] = 1;
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


    }


    public void startGame() {

        playerA.setPlaying();
        display.setText("Player A on the roll");
    }


    public int playedTurn() {


        if (count == prev + 1) {
            prev = count;
            return 1;
        } else
            return 0;
    }

    public void checkTurns() {
        if (playerA.getTurns() + playerB.getTurns() == 10) {
            display.setText("A : " + playerA.getTurns() + " B: " + playerB.getTurns());
        }
    }

    public void check() {
        checkTurns();
        //logic to know if a line has been formed by any player

        //first row


    }

    public boolean topRow() {
        if (TicTacToeMatrix[0] == 1 && TicTacToeMatrix[1] == 1 && TicTacToeMatrix[2] == 1) {
            return true;
        } else
            return false;
    }

    public boolean secondRow() {
        if (TicTacToeMatrix[3] == 1 && TicTacToeMatrix[4] == 1 && TicTacToeMatrix[5] == 1) {
            return true;
        } else
            return false;

    }
    public boolean thirdRow()
    {
        if (TicTacToeMatrix[6]==1 && TicTacToeMatrix[7]==1 && TicTacToeMatrix[8]==1)
        {
            return true;
        }
        else
            return false;
    }

    public boolean firstCol()
    {
        if (TicTacToeMatrix[0]==1 && TicTacToeMatrix[3]==1 && TicTacToeMatrix[6]==1)
        {
            return true;
        }
        else
            return false;
    }

    public boolean secondCol()
    {
        if (TicTacToeMatrix[1]==1 && TicTacToeMatrix[4]==1 && TicTacToeMatrix[7]==1)
        {
            return true;
        }
        else
            return false;
    }

    public boolean thirdCol()
    {
        if (TicTacToeMatrix[2]==1 && TicTacToeMatrix[5]==1 && TicTacToeMatrix[8]==1)
        {
            return true;
        }
        else
            return false;
    }

    public boolean rightDiag()
    {
        if (TicTacToeMatrix[2]==1 && TicTacToeMatrix[4]==1 && TicTacToeMatrix[6]==1)
        {
            return true;
        }
        else
            return false;
    }

    public boolean leftDiag()
    {
        if (TicTacToeMatrix[0]==1 && TicTacToeMatrix[4]==1 && TicTacToeMatrix[8]==1)
        {
            return true;
        }
        else
            return false;
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


}
