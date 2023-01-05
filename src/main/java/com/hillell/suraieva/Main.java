package com.hillell.suraieva;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;



public class Main {
    public static void main(String[] args) {

        ArrayList<String> countOccuranceList = new ArrayList<String>();
        countOccuranceList.add("мужчина");
        countOccuranceList.add("мужчина");
        countOccuranceList.add("женщина");
        countOccuranceList.add("женщина");
        countOccuranceList.add("женщина");
        countOccuranceList.add("мужчина");
        countOccuranceList.add("мужчина");
        countOccuranceList.add("мужчина");
        countOccuranceList.add("мужчина");
        countOccuranceList.add("женщина");
        countOccuranceList.add("мужчина");
        countOccuranceList.add("женщина");
        countOccuranceList.add("мужчина");
        String str = "женщина";
        countOccurance(countOccuranceList, str);


        int[] array = {1, 2, 3};
        System.out.println(toList(array));


        ArrayList<Integer> findUniqueList = new ArrayList<>();
        findUniqueList.add(1);
        findUniqueList.add(1);
        findUniqueList.add(2);
        findUniqueList.add(3);
        findUniqueList.add(3);
        findUniqueList.add(3);
        findUniqueList.add(4);
        findUniqueList.add(5);
        findUniqueList.add(6);
        findUniqueList.add(6);
        System.out.println(findUnique(findUniqueList));

        System.out.println(countOccuranceList.size());
        calcOccurance(countOccuranceList);

    }

    public static void countOccurance(ArrayList<String> list, String str){

        int kol=0;
        for (int i = 0; i<list.size(); i++){
            if(list.get(i).equals(str))
                kol++;
        }
        System.out.println("В списке заданная строка встречается "+kol+" раз(a)");
    }

    public static ArrayList<Integer> toList(int []array){

        ArrayList<Integer> list = new ArrayList<>();
        for (int i:
             array) {
            list.add(i);
        }
return list;
    }

    public static Set<Integer> findUnique(ArrayList<Integer> findUniqueList){
       Set<Integer> set = new LinkedHashSet<>(findUniqueList);
       return set;
    }

    public static void calcOccurance(ArrayList<String> list){
ArrayList<String> newArray = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if(list.get(i)==list.get(j) ) {
                    count++;

                }
            }
            newArray.add(list.get(i)+" - "+ count);

            }
        Set<String> set = new LinkedHashSet<>(newArray);
        System.out.println(set);
    }




}
