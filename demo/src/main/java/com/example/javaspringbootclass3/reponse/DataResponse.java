package com.example.javaspringbootclass3.reponse;

import java.text.NumberFormat;
import java.util.Locale;

public class DataResponse {

    public String phuongTrinhBacHai(float a ,float b ,float c){
        if (a == 0){
            if(b==0)
            {
                if(c==0)
                    return "Phuong trinh co vo so nghiem!";
                else
                    return "Phuong trinh vo nghiem!";
            }
            else
                return"Phuong trinh co nghiem duy nhat la:"+(-c/b);
        }else {
            float x1 =0,x2=0 ;
            float delta = b *b-4*a*c;
            if (delta < 0){
                return "Phuong trinh vo nghiem";
            }else if (delta ==0){
                x1 = x2 = -b/(2*a);
                return "Phuong trinh da cho co nghiem kep x = : " + x1;
            }else{
                delta = (float)Math.sqrt(delta);
                x1 = (-b + delta) / (2*a);
                x2 = (-b - delta) / (2*a);
                return "Phuong trinh da cho co hai nghiem phan biet : x1 = "+x1+" ; x2 = "+x2;
            }
        }
    }




    public String chuyenDoiTienTe(double money , String type){
        double temp = 0;

        switch (type.toUpperCase(Locale.ROOT)){
            case "USD" :
                temp = money * 23000;
                return String.format("%.0f USD = %.0f VND",money,temp );

            case "EUR":
                temp = money * 23783;
                return String.format("%.0f EUR = %.0f VND",money,temp );

            case "JPY":
                temp = money * 17163;
                return String.format("%.0f JPY = %.0f VND",money,temp );

            default:
                return "Khong tim thay loai tien : \""+type +"\"";

        }
    }
}
