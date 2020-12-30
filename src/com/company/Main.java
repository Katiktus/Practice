package com.company;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Parser;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        long m = System.currentTimeMillis();
        Scanner in = new Scanner(System.in);
        Integer[] numbers = input.readFile();
        System.out.println("Press a to print set, press b to print list, enter quit to exit");
        String i = in.nextLine();
        while(!i.equals("quit")) {
            System.out.println("Press a to print set, press b to print list, enter quit to exit");
            i = in.nextLine();
            //System.out.println(i);
            if (i.equals("a")) {
                Set<Integer> set = new HashSet<Integer>(Arrays.asList(numbers));
                for (Integer integer : set) {
                    System.out.println(integer);
                }
            } else if (i.equals("b")) {
                List<Integer> list = new ArrayList(Arrays.asList(numbers));
                for (Integer integer : list) {
                    if (integer != null && integer % 2 == 0) {
                        System.out.println(integer);
                    }
                }
            } else if (i.equals("c")) {
                Map<Integer, Integer> map = new HashMap<>();
                Integer index = 0;
                for (int j = 0; j < numbers.length / 2; ++j) {
                    map.put(index, numbers[j]);
                    index++;
                }
                for (Map.Entry<Integer, Integer> element : map.entrySet()) {
                    System.out.println(element.getKey() + " " + element.getValue());
                }
            } else if (i.equals("quit")) {
                return;
            }
            System.out.println("Time: " + (double) (System.currentTimeMillis() - m));
        }
    }
}
