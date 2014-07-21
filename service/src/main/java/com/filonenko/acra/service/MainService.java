package com.filonenko.acra.service;

import com.filonenko.acra.dao.MainDao;
import com.filonenko.acra.entity.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Viktor, Filonenko
 * @since: 15.04.14
 */
public interface MainService {

    public Main findMain(int id);
    public List<Main> findAll();
    public void create(String mainText);
}
