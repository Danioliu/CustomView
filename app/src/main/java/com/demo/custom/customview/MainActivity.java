package com.demo.custom.customview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private MytopBar mTopBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        mTopBar=(MytopBar) findViewById(R.id.topbar);
        mTopBar.setOnTopbarClickListener(new MytopBar.MytopBarClickListener() {
            @Override
            public void leftClick() {
                Toast.makeText(MainActivity.this,
                        "left", Toast.LENGTH_SHORT)
                        .show();
            }

            @Override
            public void rightClick() {
                Toast.makeText(MainActivity.this,
                        "right", Toast.LENGTH_SHORT)
                        .show();
            }
        });
        mTopBar.setButtonVisable(0,true);
        mTopBar.setButtonVisable(1,true);
    }
}
