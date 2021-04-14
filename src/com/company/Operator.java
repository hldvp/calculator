package com.company;
import com.company.Abstract;
import com.company.Arab;
import com.company.Rim;

public class Operator {
    Chek one;
    Chek two;

    char znak;
    Operator (Chek one, Chek two,char znak){
        one = one;
        two = two;
        this.znak = znak;
        getRezult();
    }

    private void getRezult() {
        int rez = 0;
        if (one.flag == "Rim"){
            switch (this.znak){
                case '+':rez = one.rim.value + two.rim.value;break;
                case '-':rez = one.rim.value - two.rim.value;break;
                case '*':rez = one.rim.value * two.rim.value;break;
                case '/':rez = one.rim.value / two.rim.value;break;
            }
            Rim rezult = new Rim(rez);
            System.out.println(rezult.Vyvod());
        }
        else if (one.flag == "Arab"){
            switch (this.znak){
                case '+':rez = one.arab.value + two.arab.value;break;
                case '-':rez = one.arab.value - two.arab.value;break;
                case '*':rez = one.arab.value * two.arab.value;break;
                case '/':rez = one.arab.value / two.arab.value;break;
            }
            Arab rezult = new Arab(rez);
            System.out.println(rezult.Vyvod());
        }
    }
}
