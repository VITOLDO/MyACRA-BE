package com.filonenko.acra.entity;

import javax.persistence.*;

/**
 * @author: Viktor, Filonenko
 * @since: 15.04.14
 */
@Entity
@Table(name = "main")
public class Main {
    private int id;
    private String value;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
