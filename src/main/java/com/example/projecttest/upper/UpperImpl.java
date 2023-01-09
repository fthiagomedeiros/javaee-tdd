package com.example.projecttest.upper;

import javax.ejb.EJB;
import javax.ejb.Stateful;

@Stateful
public class UpperImpl implements IUpper {

    private static int valor = 1;

    @EJB
    private IUpperRepository repository;

    @Override
    public String upper(String text) {
        String test = repository.findRepository();
        UpperImpl.valor++;
        return text.toUpperCase() + test + " - " + valor;
    }

    public void setRepository(IUpperRepository repo) {
        this.repository = repo;
    }
}
