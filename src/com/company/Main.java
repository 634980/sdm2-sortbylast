package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Read readArray=new Read();
        String [] inputArray=readArray.read();
        System.out.println("The array is ");
        Display displayArray=new Display();
        displayArray.display(inputArray);
        System.out.println("Sorted according to first name");
        Sort sortArray=new Sort();
        displayArray.display((sortArray.sortFirst(inputArray)));
        System.out.println("Sorted according to last name");
        displayArray.display((sortArray.sortLast(inputArray)));
    }
}
