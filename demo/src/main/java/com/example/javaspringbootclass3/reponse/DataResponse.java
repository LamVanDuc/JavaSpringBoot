package com.example.javaspringbootclass3.reponse;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

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
        Map<String , Integer> collectionMap = new HashMap<>();
        collectionMap.put("USD", 23000);
        collectionMap.put("EUR", 23783);
        collectionMap.put("JPY", 17163);
        double temp = 0;

        if (collectionMap.containsKey(type)){
            temp = money * (collectionMap.get(type));
            return String.format("%.0f %s = %.0f VND",money,type,temp );
        }else{
            return "Khong tim thay loai tien : \""+type +"\"";
        }
    }
}
