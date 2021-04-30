public class Model extends View{


public void resetBoard(){


for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttons[i].setText("");
            }

}

private void player1Wins() {
        player1Points++;
        Toast.makeText(this, "Player 1 wins!", Toast.LENGTH_SHORT).show();

        updatePointsText();

        resetBoard();
    }

private void updatePointsText() {
        textViewPlayer1.setText("Player 1: " + player1Points);
        textViewPlayer2.setText("Player 2: " + player2Points);
    }
}




