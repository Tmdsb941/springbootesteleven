package com.cs.springbootesteleven.service;

import com.cs.springbootesteleven.pojo.Kaoshi;
import org.springframework.stereotype.Service;

import java.util.List;


public interface KaoshiService {
    List<Kaoshi> quanbu();
    Kaoshi dange(Integer ksid);
    Kaoshi login(String ksname,String kspwd);
    int Del(Integer ksid);
    Kaoshi Add(Kaoshi kaoshi);
}
