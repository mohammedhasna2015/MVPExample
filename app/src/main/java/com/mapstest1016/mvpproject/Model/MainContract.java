package com.mapstest1016.mvpproject.Model;

public class MainContract {

     public  interface  Iview {
         void onDataRecive(String data);
          void onNumberChange(int i);
     }
     public  interface  Ipresenter {
          void  onSendButtonClicke() ;
          void ongetNumberAndPluse(int s);
     }
     public  interface  IModel {
          String getData();
          int getNumber();
     }


}
