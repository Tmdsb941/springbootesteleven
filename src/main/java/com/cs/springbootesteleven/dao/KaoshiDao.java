package com.cs.springbootesteleven.dao;

import com.cs.springbootesteleven.pojo.Kaoshi;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KaoshiDao extends JpaRepository<Kaoshi,Integer> {
    Kaoshi findAllByKsid(Integer ksid);
    Kaoshi findByKsnameAndKspwd(String ksname,String kspwd);
    int deleteByKsid(Integer ksid);
}
