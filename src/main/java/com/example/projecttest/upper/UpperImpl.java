package com.example.projecttest.upper;

import javax.ejb.Stateless;

@Stateless
public class UpperImpl implements IUpper {

    @Override
    public String upper(String text) {
        return text.toUpperCase();
    }
}
