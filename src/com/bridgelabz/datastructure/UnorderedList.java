package com.bridgelabz.datastructure;

import java.util.Scanner;

public class UnorderedList {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] array;
        LinkedList<String> linkedList = new LinkedList<>();
        String para = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        array = para.split(" ");
        for (String str : array) {
            linkedList.add(str);
        }
        System.out.println("Enter word : ");
        String searchWord = scan.next();

        if (linkedList.search(searchWord)!=null) {
            linkedList.deletion(searchWord);
        } else {
            linkedList.append(searchWord);
        }
        linkedList.display();

    }
}
