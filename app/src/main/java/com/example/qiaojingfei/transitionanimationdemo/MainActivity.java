package com.example.qiaojingfei.transitionanimationdemo;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        ImageView iv_cover_image = (ImageView) findViewById(R.id.iv_cover_image);
        iv_cover_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detailIntent = new Intent(MainActivity.this,DetailActivity.class);
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions options =
                            ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, view, getString(R.string.image_transition_name));
                    startActivity(detailIntent, options.toBundle());
                }else {
                    startActivity(detailIntent);
                }


            }
        });
    }
}
