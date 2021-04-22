package com.xuanwu.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NumTest {

    public static void main(String[] args) {
        int i = 22;
        change(i);
    }

    private static void change(int i) {
        List<String> str2 = new ArrayList<String>() {
            {
                add("A");
                add("B");
                add("C");
            }
        };
        List<String> str3 = new ArrayList<String>() {
            {
                add("D");
                add("E");
                add("F");
            }
        };
        List<String> str4 = new ArrayList<String>() {
            {
                add("G");
                add("H");
                add("I");
            }
        };
        List<String> str5 = new ArrayList<String>() {
            {
                add("J");
                add("K");
                add("L");
            }
        };
        List<String> str6 = new ArrayList<String>() {
            {
                add("M");
                add("N");
                add("O");
            }
        };
        List<String> str7 = new ArrayList<String>() {
            {
                add("P");
                add("Q");
                add("R");
                add("S");
            }
        };
        List<String> str8 = new ArrayList<String>() {
            {
                add("T");
                add("U");
                add("V");
            }
        };
        List<String> str9 = new ArrayList<String>() {
            {
                add("W");
                add("X");
                add("Y");
                add("Z");
            }
        };
        HashMap<String, List<String>> map

                = new HashMap<>();
        map.put("0", new ArrayList<>());
        map.put("1", new ArrayList<>());
        map.put("2", str2);
        map.put("3", str3);
        map.put("4", str4);
        map.put("5", str5);
        map.put("6", str6);
        map.put("7", str7);
        map.put("8", str8);
        map.put("9", str9);
        String s = i + "";
        String[] arr = s.split("");
        if (arr.length == 1) {
            List<String> letter = map.get(s);
            for (String s1 : letter) {
                System.out.print(s1+" ");
            }
        } else if (arr.length > 1) {
            List<String> letter0 = map.get(arr[0]);
            List<String> letter1 = map.get(arr[1]);
            for (String s1 : letter0) {
                for (String s2 : letter1) {
                    System.out.print(s1 + s2 + " ");
                }
            }
        }
    }
}
