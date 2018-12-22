package com.cs.springbootesteleven.service.impl;

import com.cs.springbootesteleven.dao.KaoshiDao;
import com.cs.springbootesteleven.pojo.Kaoshi;
import com.cs.springbootesteleven.service.KaoshiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KaoshiServiceImpl implements KaoshiService {

    @Autowired
    private KaoshiDao kaoshiDao;
    @Override
    public List<Kaoshi> quanbu() {
        return kaoshiDao.findAll();
    }

    @Override
    public Kaoshi dange(Integer ksid) {
        return kaoshiDao.findAllByKsid(ksid);
    }

    @Override
    public Kaoshi login(String ksname, String kspwd) {
        return kaoshiDao.findByKsnameAndKspwd(ksname,kspwd);
    }

    @Override
    public int Del(Integer ksid) {
        return kaoshiDao.deleteByKsid(ksid);
    }

    @Override
    public Kaoshi Add(Kaoshi kaoshi) {
        return kaoshiDao.save(kaoshi);
    }
}
