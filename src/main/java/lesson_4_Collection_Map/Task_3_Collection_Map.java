package lesson_4_Collection_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Используя HashMap создать мапу символов и их количества в данной строке.
//        Например: Мама мыла раму
//        М, 1
//        а, 4
//        м, 3
//        , 2
//        ы, 1
//        л, 1
//        р, 1
//        у, 1

public class Task_3_Collection_Map {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Please print some text:");
        String text = scaner.nextLine();

        System.out.println(parserString(text));
    }

    public static  Map<Character, Integer> parserString (String text) {
        Map<Character, Integer> map = new HashMap<>();

        for (Character ch : text.toCharArray()) {
            if (map.containsKey(ch)) {
                Integer total = map.get(ch);
                map.put(ch, total + 1);
            } else {
                map.put(ch, 1);
            }
        }

        return map;
    }
}
