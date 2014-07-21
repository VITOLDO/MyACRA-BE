package com.filonenko.acra.service;

import com.filonenko.acra.dao.MainDao;
import com.filonenko.acra.entity.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: Viktor, Filonenko
 * @since: 15.04.14
 */
@Service
public class MainServiceImpl implements MainService {

    @Autowired
    private MainDao mainDao;

    @Transactional
    public Main findMain(int id) {
        return mainDao.getMainById(id);
    }

    @Override
    public List<Main> findAll() {
        return mainDao.findAll();
    }

    @Override
    public void create(String mainText) {
        Main main = new Main();
        main.setValue(mainText);
        mainDao.create(main);
    }
}
