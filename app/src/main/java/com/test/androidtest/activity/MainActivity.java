package com.test.androidtest.activity;

import android.media.Image;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.test.androidtest.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;

public class MainActivity extends Activity {

    @Bind(R.id.backIcon)
    ImageView backIcon;
    @Bind(R.id.leftText)
    TextView leftText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        backIcon.setVisibility(View.GONE);
        leftText.setVisibility(View.GONE);
    }


    @OnClick(R.id.btn1)
    void onBtn1Click() {
        Toast.makeText(this, "点击btn1", Toast.LENGTH_SHORT).show();
    }

    @OnLongClick(R.id.btn1)
    boolean onBtn1LongClick() {
        Toast.makeText(this, "长按btn1", Toast.LENGTH_LONG).show();
        return true;
    }

    @OnClick(R.id.btn2)
    void onBtn2Click() {
        Toast.makeText(this, "点击btn2", Toast.LENGTH_SHORT).show();
    }

    @OnLongClick(R.id.btn2)
    boolean onBtn2LongClick() {
        Toast.makeText(this, "长按btn2", Toast.LENGTH_LONG).show();
        return true;
    }
}
