package com.example.designer.cashchamp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by designer on 10/24/2017.
 */

public class ActivityMain extends AppCompatActivity {
    TextView tv_changedevice;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_changedevice = (TextView)findViewById(R.id.tv_changedevice);
        tv_changedevice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityMain.this,ChangeDevice.class);
                startActivity(intent);
            }
        });
    }
}
