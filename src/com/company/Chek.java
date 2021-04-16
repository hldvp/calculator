package com.company;

public class Chek {
    public String str;
    public String flag;
    public Rim rim;
    public Arab arab;

    Chek (String str){
        this.str = str;
        if (str.contains(" ")){
            this.str = str.trim();
        }
        this.flag = "Arab";
        String regex = "\\d+";
        if (!this.str.matches(regex)) this.flag = "No Arab";

        if (this.flag == "No Arab") {
            this.flag = "Rim";
            for (int i=0; i<this.str.length(); i++){
                try {
                    RomanNumeral r;
                    r = RomanNumeral.valueOf(String.valueOf(this.str.charAt(i)));
                    break;
                }
                catch (Exception e){
                    this.flag = "No Rim";
                    System.out.println("The data is incorrect");
                    System.exit(0);
                }
            }
        }
        if (this.flag == "Arab"){
            this.arab = new Arab(this.str);
        }
        if (this.flag == "Rim"){
            this.rim = new Rim(this.str);
        }
    }
}

