package com.example.cryptoohhcrypto;

public class encode {

    //function to convert message(in the form of string) -->array(where each characters are being converted to resp. ascii values)
    // --->array converted to binary form ---> the array converted into a string -->the string then reversed.
    public static String enc(String s){
        String initializer = "11111111";
        int ct = 0;
        int a[] = new int[11111111];
        for(int i=0; i<s.length(); i++){
            a[i] = (int)s.charAt(i); //stored the value of the string in the array after converting it into integer forms like for example, a will be stored as 98 or its resp. ascii code value
            ct++;
        }

        String res = ""; //to store the result value
        int bin[] = new int[111];
        int idx = 0;
        //loop to convert decimal number array created in previous step to binary form

        for(int ii=0; ii<ct; ii++){
            int temp = a[ii];
            //loop1: the digits are being divided by 2, and the quotient is being stored in bin array
            for(int j=0; j<ct; j++) bin[j] = 0;
            idx = 0;
            while(temp>0){
                bin[idx++] = temp%2;
                temp = temp/2;
            }

            //the bin array is now being converted to a string
            String dig ="";
            String temps;
            for(int j=0; j<7; j++){
                temps = Integer.toString(bin[j]);
                dig = dig.concat(temps);
            }

            //the string is now being reversed to get the correct binary form of the number
            String rev="";
            for(int j= dig.length()-1;j>=0; j--){
                char ca=dig.charAt(j);
                rev = rev.concat(String.valueOf(ca));
            }
            res = res.concat(rev);
        }
        res = initializer.concat(res);
        return res;
    }
}
