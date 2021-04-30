package rafid.com.example.zerocrossgame2.View;

import android.os.Bundle;

import rafid.com.example.zerocrossgame2.R;

public class View {


    int display1 = 0;
    int display2 = 0;
    int display3 = 0;
    int display4 = 0;

    public void onCreate2(){
        display1 = 1;
        display2 = display1+display3;
        setContentView();
    }

    public void setContentView(){
        display3 = 0;
        display4 = 5;
        display3--;

    }


    public void onCreate3() {
        onCreate2();

        ///////////////


        //storing row and column id into the 2D array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String buttonID = "button_" + i + j;



            }
        }


}

    private void getResources() {
    }

private void draw() {
        Toast.makeText(this, "Draw!", Toast.LENGTH_SHORT).show();

        //resetBoard();
    }

}
