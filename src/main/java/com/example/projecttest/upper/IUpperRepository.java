package com.example.projecttest.upper;

import javax.ejb.Local;

@Local
public interface IUpperRepository {
    String findRepository();
}
