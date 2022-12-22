package LeetCode;

import java.util.HashMap;

import javax.swing.plaf.basic.BasicBorders.SplitPaneBorder;

public class KeyBoardRow {
    public static void main(String[] args) {
        String[] words = {"Anand" , "Soni" , "Ashfak" , "Turipo"};
        String result[] = findWords(words);
        for(String word : result)
            System.out.print(word + " ");
    }

    private static String[] findWords(String[] words) {
        HashMap<Character, Integer> rowId = new HashMap<>();
        
        String temp = "qwertyuiop";
        for(char i : temp.toCharArray()){
            rowId.put(i, 1);
        }
        temp = "asdfghjkl";
        for(char i : temp.toCharArray()){
            rowId.put(i, 2);
        }
        temp = "zxcvbnm";
        for(char i : temp.toCharArray()){
            rowId.put(i, 2);
        }

        return ;
    }
}
