package com.example.projecttest.upper;

import javax.ejb.Local;

@Local
public interface IUpper {
    String upper(String text);
}
