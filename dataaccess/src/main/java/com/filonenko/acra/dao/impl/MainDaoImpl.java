package com.filonenko.acra.dao.impl;

import com.filonenko.acra.dao.MainDao;
import com.filonenko.acra.entity.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: Viktor, Filonenko
 * @since: 15.04.14
 */
@Repository
public class MainDaoImpl implements MainDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public Main getMainById(int id) {
        return hibernateTemplate.get(Main.class, id);
    }

    @Override
    public void create(Main main) {
        hibernateTemplate.save(main);
    }

    @Override
    public List<Main> findAll() {
        return hibernateTemplate.loadAll(Main.class);
    }
}
