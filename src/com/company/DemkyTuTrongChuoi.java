package com.company;

import java.util.Scanner;

public class DemkyTuTrongChuoi {

    public static void main(String[] args) {
	// write your code here
        String st = new DemkyTuTrongChuoi().insert();
        char character = new DemkyTuTrongChuoi().insertChar();
        int count = new DemkyTuTrongChuoi().count(st,character);
        System.out.printf("co tat ca %d ky tu %s trong chuoi ban vua nhap vao",count,character);


    }
    public String insert() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi can dem");
        String st = scanner.nextLine();
        return st;
    }
    public char insertChar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao ki tu can tim ");
        char character = scanner.next().charAt(0);
        return character;

    }
    public int count(String st,char inputChar){
        int count = 0;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i)==inputChar){
                count++;
            }
        }
        return count;
    }

}
