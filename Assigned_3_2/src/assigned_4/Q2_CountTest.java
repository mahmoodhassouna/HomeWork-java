/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigned_4;

/**
 *
 * @author Hassouna
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Q2_CountTest {

    interface CountInterface {

        void countOccurences(String fileName);
    }

    public static void main(String args[]) {
        // lambda expression for getting count of characters
        CountInterface count = (String fileName) -> {
            HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
            BufferedReader bufferedReader; // bufferedreader object for reading file
            try {
                bufferedReader = new BufferedReader(new FileReader(fileName));
                String inputString = bufferedReader.readLine();
                while (inputString != null) { // read file line by line
                    char[] charArray = inputString.toCharArray();
                    for (char a : charArray) {
                        if (a != ' ') {
                            if (charMap.containsKey(a)) {

                                charMap.put(a, charMap.get(a) + 1); // increase count of character if already present in map
                            } else {

                                charMap.put(a, 1); // put char in map with count 1
                            }
                        }
                    }

                    inputString = bufferedReader.readLine();
                }
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            for (Map.Entry element : charMap.entrySet()) { // print char and count
                System.out.println(element.getKey() + " " + element.getValue());
            }

        };

        count.countOccurences("./src/assigned_4/count.txt"); // file count.txt is passed to countOccurences function

    }
}
