package com.company;
import java.lang.Math;

import java.util.ArrayList;

enum RomanNumeral {
    I(1), V(5), X(10), L(50), C(100), D(500), M(1000);

    private int value;
    RomanNumeral (int value){
        this.value = value;
    }
    public int getValue () {
        return value;
    }
}

public class Rim extends Abstract {
    public Rim (int value){
        super(value);
    }

    Rim(String str) {
        int n = 0;
        int x = 0;
        int z = 0;
        for (int i = 0; i < str.length(); i++) {
            RomanNumeral r;
            r = RomanNumeral.valueOf(String.valueOf(str.charAt(i)));
            n = r.getValue();
            if (x == 0 || x >= n) {
                x = n;
                z += n;
            } else {
                z = z - 2 * x + n;
            }
        }
        super.value = z;
        if (super.value > 10){
            System.out.println("The data is incorrect");
            System.exit(0);
        }
    }

    private String translate(int ff) {
        String result = "";
        RomanNumeral l;
        l = RomanNumeral.I;
        int i = 0;
        for (RomanNumeral r : RomanNumeral.values()) {
            if (r.ordinal() != 0) {
                int n = ff % r.getValue();
                if (n % 4 == 0 & n != 0 & n != ff) {
                    l = r;
                    continue;
                }
            }
            i++;
            if (ff == r.getValue()) return result.concat(r.name());
            if (ff == r.getValue() - l.getValue()) {
                result = result.concat(l.name());
                return result.concat(r.name());
            }
            if (ff < r.getValue()) {
                for (int j = 0; j < ff / l.getValue(); j++) result = result.concat(l.name());
                if (ff % l.getValue() != 0) return result.concat(translate(ff % l.getValue()));
                return result;
            }
            l = r;
        }
        return result;
    }

    @Override
    public String Vyvod() {
        int f = super.value;
        String result = "";
        ArrayList<Integer> ar = new ArrayList();
        double i = 0;
        while (f != 0) {
            int a = f % 10;
            if (a == 0) {
                f = f / 10;
                i++;
                continue;
            }
            if (i == 0) ar.add(a);
            else ar.add((int) (a * Math.pow(10, i)));
            f = f / 10;
            i++;
        }
        for (int ff : ar) {
            result = translate(ff).concat(result);
        }
        return result;
    }
}
