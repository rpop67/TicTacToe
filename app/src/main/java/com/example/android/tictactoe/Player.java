package com.example.android.tictactoe;

/**
 * Created by Akanksha_Rajwar on 19-08-2018.
 */

public class Player {
     private int playing ;
     private int turns;
     public Player()
     {
         playing=0;
         turns=0;
     }

     public int isPlaying()
     {
         if(playing ==1)
             return 1;
         else
             return 0;

     }

     public void setPlaying()
     {
         playing=1;
         turns++;
     }


     public int getTurns()
     {
         return turns;
     }

     public void setNotPlaying()
     {
         playing=0;
     }

}
