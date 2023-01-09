package com.example.projecttest.upper;

import javax.ejb.Local;
import javax.ejb.Stateless;

@Local
@Stateless
public class UpperRepository implements IUpperRepository {

    public String findRepository() {
        return "\nHello";
    }

}
