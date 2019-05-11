package com.opcrm.laurent;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Order order = new Order();
        order.displayAvailableMenu();
        Scanner sc = new Scanner(System.in);
        int nb = sc.nextInt();
        order.displaySelectedMenu(nb);
    }
}
