package com.example.asus.mydemo;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageView mImageView,mImageView2;
    private Button mButton1,mButton2,mButton3,mButton4,mButton5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton1=(Button)findViewById(R.id.animation_button);
        mButton2=(Button)findViewById(R.id.tran_button);
        mButton3=(Button)findViewById(R.id.rotate_button);
        mButton4=(Button)findViewById(R.id.alpha_button);
        mButton5=(Button)findViewById(R.id.scale_button);
        mButton1.setOnClickListener(this);
        mButton2.setOnClickListener(this);
        mButton3.setOnClickListener(this);
        mButton4.setOnClickListener(this);
        mButton5.setOnClickListener(this);
        mImageView=(ImageView)findViewById(R.id.image_view);
        mImageView2=(ImageView)findViewById(R.id.image_view2);



    }

    @Override
    public void onClick(View v) {
        Animation animation;
        switch(v.getId()){
            case R.id.animation_button:
                //帧动画
                mImageView.setBackgroundResource(R.drawable.animation);
                AnimationDrawable animationDrawable=(AnimationDrawable)mImageView.getBackground();
                animationDrawable.start();
                break;
            case R.id.tran_button:
                Animation  animation2= AnimationUtils.loadAnimation(this,R.anim.translateanim);
                mImageView2.setAnimation(animation2);
                break;
            case R.id.rotate_button:
                animation= AnimationUtils.loadAnimation(this,R.anim.rotateanim);
                mImageView2.setAnimation(animation);
                break;
            case R.id.alpha_button:
                animation= AnimationUtils.loadAnimation(this,R.anim.alphaanim);
                mImageView2.setAnimation(animation);
                break;
            case R.id.scale_button:
                animation= AnimationUtils.loadAnimation(this,R.anim.scaleanim);
                mImageView2.setAnimation(animation);

                break;
        }
    }
}
