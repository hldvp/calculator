package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String first = "",second = "";
        Read r = new Read(str);
        if (r.znak != '0') {
            first = str.substring(0, r.index);
            second = str.substring(r.index + 1);
            Chek a = new Chek(first);
            Chek b = new Chek(second);
            if (a.flag == b.flag) {
                Operator o = new Operator(a, b, r.znak);
            }
            else System.out.println("The data is incorrect");
        }
        else System.out.println("The data is incorrect");

    }
}
