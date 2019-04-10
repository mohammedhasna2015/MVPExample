package com.mapstest1016.mvpproject.Model;

public class MainModel implements MainContract.IModel {

    public MainModel (){
    }
    @Override
    public String getData() {
        return "success" ;
    }

    @Override
    public int getNumber() {
        return 5;
    }
}
