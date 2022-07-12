package com.example.javaspringbootclass3.reponse;

import java.util.HashMap;
import java.util.Map;

public class DataResponse {

    public String phuongTrinhBacHai(float a ,float b ,float c){
        try {
            if (a == 0) {
                if (b == 0) {
                    if (c == 0)
                        return "Phương trình vô nghiệm!";
                    else
                        return "Phương trình vô nghiệm!";
                } else
                    return "Phương trình có nghiệm duy nhất là : " + (-c / b);
            }else {
                float x1 = 0, x2 = 0;
                float delta = b * b - 4 * a * c;
                if (delta < 0) {
                    return "Phương trình vô nghiệm";
                } else if (delta == 0) {
                    x1 = x2 = -b / (2 * a);
                    return "Phương trình đã cho có nghiệm kép x = : " + x1;
                } else {
                    delta = (float) Math.sqrt(delta);
                    x1 = (-b + delta) / (2 * a);
                    x2 = (-b - delta) / (2 * a);
                    return "Phương trình đã cho có hai nghiệm phân biệt : x1 = " + x1 + " ; x2 = " + x2;
                }
            }
        }catch (Exception ex){
            return ex.getMessage();
        }
    }




    public String chuyenDoiTienTe(double money , String type){
        try{
        Map<String , Integer> map = new HashMap<>();
            map.put("USD", 23000);
            map.put("EUR", 23783);
            map.put("JPY", 17163);
        double temp = 0;


        if (map.containsKey(type)){
            temp = money * (map.get(type));
            return String.format("%.0f %s = %.0f VND",money,type,temp);
        }else{
            return "Không tìm thấy loại tiền : \""+type +"\"";
        }
        }catch (Exception ex){
            return ex.getMessage();
        }
    }
}
