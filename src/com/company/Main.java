package com.company;

public class Main {

    public static void main(String[] args) {
	Integer a = 5462;
	Integer b = 983675;

	String str_a = a.toString();
	String str_b = b.toString();


	System.out.print("Общие цифры: ");

	for ( int i=0; i<=9; i++){

		if (str_a.contains(i+"") && str_b.contains(i+"")){
			System.out.print(i+" ");
		}

	}










    }
}
