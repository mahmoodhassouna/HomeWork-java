/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigned_3;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Q2_Frequency {
   public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(new File("./src/assigned_3/input.txt"));
       HashMap<String, Integer> words = new HashMap<String, Integer>();
       while (sc.hasNext()) {
           String key = sc.next();
           if (words.containsKey(key)) {
               words.put(key, words.get(key) + 1);
           } else {
               words.put(key, 1);
           }
       }
       for (String k : words.keySet()) {
           int val = words.get(k);
           System.out.println(k + " : " + val);
           HashMap<Character, Integer> chars = new HashMap<Character, Integer>();
           for (int i = 0; i < k.length(); i++) {
               char ch = k.charAt(i);
               if (chars.containsKey(ch)) {
                   chars.put(ch, chars.get(ch) + 1);
               } else {
                   chars.put(ch, 1);
               }
           }
           for (Character c : chars.keySet())
               System.out.println("\t"+c + " : " + chars.get(c));
       }
   }
}
