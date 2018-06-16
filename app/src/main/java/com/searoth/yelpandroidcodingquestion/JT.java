package com.searoth.yelpandroidcodingquestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class JT {
    /**
     * @param args
     *
     * Given a List of Lists, find the color(s) that occurs the most and return an alphabetized list
     * of the most frequent color(s)     *
     *
     */
    public static void main(String args[]) {
        List<List<String>> mainList = new ArrayList<List<String>>();

        List<String> one = new ArrayList<>();
        one.add("green");
        one.add("green");
        one.add("green");
        one.add("green");

        List<String> two = new ArrayList<>();
        two.add("green");
        two.add("green");
        two.add("green");
        two.add("green");

        List<String> three = new ArrayList<>();
        three.add("green");
        three.add("green");
        three.add("green");
        three.add("green");

        mainList.add(one);
        mainList.add(two);
        mainList.add(three);

        System.out.println(topColor(mainList));
    }

    /**
     *
     * @param image List of Lists of Strings
     * @return alphabatized list of the most frequent colors found in all lists
     */
    public static List<String> topColor(List<List<String>> image) {
        List<String> ret = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int max = 1;

        for(List<String> inner : image){
            for(String color : inner){
                if(map.containsKey(color)) {//does color already exist?
                    int count = map.get(color)+1;
                    max = count > max ? count : max;
                    map.put(color, count);
                }else map.put(color,1);
            }
        }
        ret = buildColorList(map, max);//build unsorted list
        if(map.size() > 1) {
            ret = ret.size() > 1 ? sortListString(ret) : ret; //sort if size > 1
        }
        return ret;
    }

    /**
     *
     * @param map colors and their frequency
     * @param key frequency of color to find and add to ArrayList<String>
     * @return unsorted list of colors
     */
    private static List<String> buildColorList(HashMap<String, Integer> map, int key){
        List<String> ret = new ArrayList<>();
        Set<String> set = map.keySet();
        for(String s : set){
            if(map.get(s) == key)
                ret.add(s);
        }
        return ret;
    }

    /**
     *
     * @param arr unsorted list
     * @return sorted list using BibbleSort
     */
    private static List<String> sortListString(List<String> arr){
        String temp;

        for(int i = 0; i < arr.size(); i++){
            for(int j = 0; j < arr.size(); j++){
                if(j+1 < arr.size()) {
                    int isBigger = arr.get(j).compareTo(arr.get(j + 1));
                    if (isBigger > 0) {
                        temp = arr.get(j + 1);
                        arr.set(j + 1, arr.get(j));
                        arr.set(j, temp);
                    }
                }
            }
        }
        return arr;
    }



}

