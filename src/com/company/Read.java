package com.company;

public class Read {
    public String str;
    char znak = '0';
    int index;

    Read (String str){
        this.str = str;
        for (int i = 0; i<str.length();i++){
            if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/'){
                this.znak = str.charAt(i);
                this.index = i;
                break;
            }
        }
        if (this.znak == '0'){
            System.out.println("The data is incorrect");
            System.exit(0);
        }
    }

}
