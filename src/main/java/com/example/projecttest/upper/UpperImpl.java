package com.example.projecttest.upper;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class UpperImpl implements IUpper {

    @EJB
    private IUpperRepository repository;

    @Override
    public String upper(String text) {
        String test = repository.findRepository();
        return text.toUpperCase() + test;
    }

    public void setRepository(IUpperRepository repo) {
        this.repository = repo;
    }
}
