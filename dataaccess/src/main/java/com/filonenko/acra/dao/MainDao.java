package com.filonenko.acra.dao;

import com.filonenko.acra.entity.Main;

import java.util.List;

/**
 * @author: Viktor, Filonenko
 * @since: 15.04.14
 */
public interface MainDao {

    Main getMainById(int id);
    void create(Main main);
    List<Main> findAll();
}
