package com.company;
import com.company.Abstract;

public class Arab extends Abstract {
    public Arab(int value) {
        super(value);
    }

    public Arab (String str){
        int r = 0;
        for (int i = 0; i<str.length();i++){
            try {
                r+=str.charAt(i) - '0';
                if (str.charAt(i+1) != 0 ) r*=10;
            }
            catch (Exception e)  {
                break;
            }
        }
        super.value = r;
        if (super.value > 10){
            System.out.println("The data is incorrect");
            System.exit(0);
        }
    }

    @Override
    public String Vyvod() {
        return String.valueOf(super.value);
    }

}
