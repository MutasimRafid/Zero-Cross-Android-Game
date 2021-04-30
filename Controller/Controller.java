package rafid.com.example.zerocrossgame2.Controller;

public class Controller extends Model {
    int c = 0;
    int value = 1;
    int newWin = 0;


     winner1();


   private boolean checkForWin() {
        //using string array
        String[][] field = new String[3][3];

        //passing button value to the screen
        //checkin the row wise ----->

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                field[i][j] = buttons[i][j].getText().toString();
            }
        }
    
    public void onClick2() {
        // if it passes a empty string then go, else it is filled up
        String button;
        String button2;
        String button3;
        String button4;
        String button5;
        String button6;
        control();



    }


    public void control() {
        if(c==0) {
            value++;

        }
        else {
            value = 0;
        }
        winner1();
    }

    public void winner1() {
        if(value>1) {
            newWin++;
        }

        //winner1();
    }
}
