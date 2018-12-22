package com.cs.springbootesteleven.controller;

import com.cs.springbootesteleven.pojo.Kaoshi;
import com.cs.springbootesteleven.service.KaoshiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/kaoshi")
public class KaoshiController {

    @Autowired
    private KaoshiService kaoshiService;
    @RequestMapping("/all")
    public String qb(){
        List<Kaoshi> list=kaoshiService.quanbu();
        for (Kaoshi kaoshi:list){
            System.out.println(kaoshi.toString());
        }
        return list.toString();
    }
    @RequestMapping("/cs")
    public String cs(){
        return "fuck fucks";
    }
    @RequestMapping("/dg")
    public String TestDag(){
         String sf=kaoshiService.dange(1).toString();
         return sf!=null?sf:"错误";
    }
    @RequestMapping("/add")
    public Kaoshi TestAdd(){
       Kaoshi ks=new Kaoshi();
       Kaoshi kaoshis=kaoshiService.Add(ks);
        return kaoshis;
    }
    @RequestMapping("/login")
    public Kaoshi TestLogin(){
        String ksname="",kspwd="";
        return  kaoshiService.login(ksname,kspwd);
    }
    @RequestMapping("/del")
    public  int TestDel(){
        return kaoshiService.Del(1);
    }


}
