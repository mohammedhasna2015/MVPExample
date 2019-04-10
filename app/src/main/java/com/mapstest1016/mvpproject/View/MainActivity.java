package com.mapstest1016.mvpproject.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.mapstest1016.mvpproject.Model.MainContract;
import com.mapstest1016.mvpproject.Presenter.MainPresenter;
import com.mapstest1016.mvpproject.R;

public class MainActivity extends AppCompatActivity implements MainContract.Iview {

      private  MainPresenter    mMainPresenter ;
      private TextView tv_state,tv_number_plus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        onSetup();

    }

    private void onSetup() {
        mMainPresenter = new MainPresenter(this);
        tv_state=(TextView)findViewById(R.id.tv_state);
        tv_number_plus=(TextView)findViewById(R.id.tv_number_plus);
    }

    public void butt_add_state(View view) {
        mMainPresenter.onSendButtonClicke();
    }
    @Override
    public void onDataRecive(String data) {
        tv_state.setText(data);
    }

    @Override
    public void onNumberChange(int i) {
        tv_number_plus.setText(""+i);
    }

    public void but_add_number(View view) {
        mMainPresenter.ongetNumberAndPluse(Integer.parseInt(tv_number_plus.getText().toString())) ;
    }
}
