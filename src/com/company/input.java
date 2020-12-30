package com.company;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class input {

	public static Integer[] readFile() throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("src\\numbers.txt"));
		Integer [] numbers = new Integer[100];
		int i = 0;
		while(scanner.hasNextInt()){
			numbers[i++] = scanner.nextInt();
		}
		return numbers;
	}
}
