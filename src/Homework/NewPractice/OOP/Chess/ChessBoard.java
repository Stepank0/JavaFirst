package Homework.NewPractice.OOP.Chess;

import java.util.ArrayList;

public class ChessBoard {

    public static void main(String[] args) {
        drawAllChessItems();
    }

    public static void drawAllChessItems(){

        ArrayList<ChessItem> items = new ArrayList<>();
        items.add(new King());
        items.add(new Queen());

        for (ChessItem item : items){
            item.draw();
        }

    }

}
