package com.mapstest1016.mvpproject.Presenter;

import com.mapstest1016.mvpproject.Model.MainContract;
import com.mapstest1016.mvpproject.Model.MainModel;


public class MainPresenter implements MainContract.Ipresenter {

     MainContract.IModel model;
     MainContract.Iview iview;
    public MainPresenter(MainContract.Iview iview){
         model= new MainModel();
         this.iview=iview;
     }
    @Override
    public void onSendButtonClicke() {
        String data= model.getData();
        iview.onDataRecive(data);
    }

    @Override
    public void ongetNumberAndPluse(int s) {
        int data= model.getNumber();
        iview.onNumberChange(data+s);
    }
}
