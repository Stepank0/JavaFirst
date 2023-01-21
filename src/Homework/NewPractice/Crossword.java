package Homework.NewPractice;

import java.util.ArrayList;
import java.util.List;

public class Crossword {
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };
        detectAllWords(crossword, "home", "same");
        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) {
        List<Word> list = new ArrayList<>();

        for (String word : words) {
            boolean isFound = false;
            int startY = 0;
            int startX = -1;
            char[] letters = word.toCharArray();

            Word obj = new Word(word);


            for (int i = startY; i < crossword.length; i++) {
                isFound = false;
                for (int j = startX + 1; j < crossword[i].length; j++) {
                    startY = i;
                    startX = j;
                    if (crossword[i][j] == letters[0]) {
                        isFound = true;
                        break;
                    }
                }


                if (isFound) {

                    int lenLetters = letters.length - 1;

                    boolean left = startX - lenLetters >= 0;
                    boolean up = startY - lenLetters >= 0;
                    boolean right = startX + lenLetters < crossword[i].length;
                    boolean down = startY + lenLetters < crossword.length;

                    boolean diagonal = false;
                    boolean planar = false;

                    obj.setStartPoint(startX, startY);

                    if (left) {
                        planar = true;

                        diagonal = up;


                        for (int X = startX - 1; X >= startX - lenLetters; X--) {
                            if (planar && crossword[i][X] != letters[startX - X]) {
                                planar = false;
                            }

                            if (diagonal && crossword[i - (startX - X)][X] != letters[startX - X]) {
                                diagonal = false;
                            }
                        }

                        if (planar) {
                            obj.setEndPoint(startX - lenLetters, i);
                        }
                        if (diagonal) {
                            obj.setEndPoint(startX - lenLetters, startY - lenLetters);
                        }

                        if (planar || diagonal) break;
                    }


                    if (up) {
                        planar = true;
                        diagonal = right;
                        for (int Y = startY - 1; Y >= startY - lenLetters; Y--) {
                            if (planar && crossword[Y][startX] != letters[startY - Y])
                                planar = false;

                            if (diagonal && crossword[Y][startX + startY - Y] != letters[startY - Y]) {
                                diagonal = false;
                            }
                        }
                        if (planar) {
                            obj.setEndPoint(startX, startY - lenLetters);
                        }
                        if (diagonal) {
                            obj.setEndPoint(startX + lenLetters, startY - lenLetters);
                        }
                        if (planar || diagonal) break;
                    }

                    if (right) {
                        planar = true;
                        diagonal = down;
                        for (int X = startX + 1; X <= startX + lenLetters; X++) {
                            if (planar && crossword[i][X] != letters[X - startX])
                                planar = false;

                            if (diagonal && crossword[i + (X - startX)][X] != letters[X - startX]) {
                                diagonal = false;
                            }
                        }
                        if (planar) {
                            obj.setEndPoint(startX + lenLetters, i);
                        }
                        if (diagonal) {
                            obj.setEndPoint(startX + lenLetters, startY + lenLetters);
                        }
                        if (planar || diagonal) break;
                    }

                    if (down) {
                        planar = true;
                        diagonal = left;
                        for (int Y = startY + 1; Y <= startY + lenLetters; Y++) {
                            if (planar && crossword[Y][startX] != letters[Y - startY])
                                planar = false;

                            if (diagonal && crossword[Y][startX - Y + startY] != letters[Y - startY]) {
                                diagonal = false;
                            }
                        }
                        if (planar) {
                            obj.setEndPoint(startX, startY + lenLetters);
                        }
                        if (diagonal) {
                            obj.setEndPoint(startX - lenLetters, startY + lenLetters);
                        }
                        if (planar || diagonal) break;
                    }
                }
                if (startX + 1 == crossword[i].length) startX = -1;
                else {
                    i--;
                }

            }
            if (isFound) list.add(obj);
        }
        return list;
    }

    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}
