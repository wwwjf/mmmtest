package com.wwwjf.demo.dagger.car3;

import javax.inject.Inject;

public class Car3 {

    @Inject
    public Car3(){}

    public String go(String where){
        return "go..."+where;
    }
}
