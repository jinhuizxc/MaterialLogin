package com.example.jinhui.materiallogin;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.transition.Explode;
import android.widget.Toast;

/**
 * Email: 1004260403@qq.com
 * Created by jinhui on 2018/11/12.
 */
public class LoginSuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        Explode explode = new Explode();
        explode.setDuration(500);
        getWindow().setExitTransition(explode);
        getWindow().setEnterTransition(explode);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
