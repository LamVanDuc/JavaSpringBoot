package com.example.javaspringbootclass3.controller;


import com.example.javaspringbootclass3.reponse.DataResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class Controller {
    DataResponse dataResponse = new DataResponse();
    //http://localhost:8080/api/cong?a=5&b=10
    @GetMapping("/cong")
    String cong(@RequestParam(value = "a")int a, @RequestParam(value = "b")int b){
        return a+" + "+b +" ="+ (a+b);
    }

//    http://localhost:8080/api/tru?a=5&b=10
    @GetMapping("/tru")
    String tru(@RequestParam(value = "a")int a , @RequestParam(value = "b")int b){
        return a+" - "+b +" ="+ (a-b);
    }
    //http://localhost:8080/api/nhan?a=5&b=10
    @GetMapping("/nhan")
 String nhan(@RequestParam(value = "a")int a , @RequestParam(value = "b")int b){
     return a+" * "+b +" ="+ (a*b);
 }
//    String getAll(@RequestParam(value = "name")String name){
//        return "hello "+name;
//    }

//  http://localhost:8080/api/chia?a=5&b=10
    @GetMapping("/chia")
    String chia(@RequestParam(value = "a")int a , @RequestParam(value = "b")int b){
        if (b == 0){
            return "khong co phep chia cho 0";
        }else {
            int temp = a/b;
            int sodu = a%b ;
            if (sodu == 0){
                return a+" / "+b +" ="+ temp;
            }else{
                return a+" / "+b +" ="+ temp + "  du :"+sodu;
            }
        }
    }

//  http://localhost:8080/api/phuongtrinhbac2?a=5&b=5&c=10
    @GetMapping("/phuongtrinhbac2")
    String phuongtrinhbachai(@RequestParam(value = "a")float a, @RequestParam(value = "b")float b , @RequestParam(value = "c")float c){
        return dataResponse.phuongTrinhBacHai(a,b,c);
    }

//  http://localhost:8080/api/doitien?money=500&type=usd
    @GetMapping("/doitien")
    String doiTien(@RequestParam(value = "money")double money ,@RequestParam(value = "type")String type){
        return dataResponse.chuyenDoiTienTe(money , type);
    }

}
