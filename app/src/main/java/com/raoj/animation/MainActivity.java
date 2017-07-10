package com.raoj.animation;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.raoj.animation.common.AnimationType;
import com.raoj.animation.fragments.SimpleFragment;

import static com.raoj.animation.R.id.image;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public static final String TAG = "AnimationDemo";

    private Button btnSimpleAnimation;
    private Button btnStart;
    private Button btnStop;
    private ImageView imageView;
    private FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frameLayout = (FrameLayout) findViewById(R.id.fl_content);
        btnSimpleAnimation = (Button) findViewById(R.id.btn_simple_animation);
        btnSimpleAnimation.setOnClickListener(this);
//        btnStart = (Button) findViewById(R.id.btn_start);
//        btnStop = (Button) findViewById(R.id.btn_stop);
//        imageView = (ImageView) findViewById(image);

//        final Animation translateAnimation = new TranslateAnimation(0, 200, 0, 200);
//        btnStart.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d(TAG, "enter onClick");
//                translateAnimation.setDuration(3000);               //设置动画持续时间
//                imageView.setAnimation(translateAnimation);             //设置动画效果
//                translateAnimation.startNow();                      //启动动画
//                imageView.startAnimation(translateAnimation);
//                startAnimation();
//                repeatCount();
//                fillEnable();
//                fillAfter();
//                repeatMode();
//                setStartTime();
//                translateAnimation();
//                rotateAnimation();
//
//            }
//        });

//        btnStop.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //取消动画执行
//                translateAnimation.cancel();
//            }
//        });

    }

    /**
     * 在这段代码中，首先初始化了一个移动的动画效果translateAnimation。
     * 然后，在按钮监听器中，通过setDuration方法设置动画持续时间，并为imageView对象设置动画效果，
     * 最后使用startNow方法启动动画效果。读者执行这段代码，点击"执行动画"按钮，
     * 可以在手机屏幕上看到显示效果,图片沿45 方向向右下角移动。
     */
    private void startAnimation() {
        Animation translateAnimation = new TranslateAnimation(0, 200, 0, 200);
        translateAnimation.setDuration(3000);               //设置动画持续时间
        imageView.setAnimation(translateAnimation);             //设置动画效果
        imageView.startAnimation(translateAnimation);                      //启动动画
    }

    /**
     * 在这段代码中，首先初始化了一个移动的动画效果translateAnimation。
     * 然后，在第一个按钮监听器中，通过setDuration方法设置动画持续时间，
     * 通过setRepeatCount方法设置重复次数，并为image对象设置动画效果，
     * 最后使用startNow方法启动动画效果。
     * 在第二个按钮监听器中，调用cancel方法取消动画执行。
     * 读者执行这段代码，当点击"执行动画"按钮时，将看到动画被重复执行了两次，也就是总共执行了3次动画。
     * 注意：这里设置的是动画重复执行的次数，而不是动画执行的次数。故动画执行的次数为动画重复执行的次数加1。
     */
    private void repeatCount() {
        Animation translateAnimation = new TranslateAnimation(0, 200, 0, 200);
        translateAnimation.setDuration(3000);               //设置动画持续时间
        translateAnimation.setRepeatCount(2);               //设置重复次数
        imageView.setAnimation(translateAnimation);             //设置动画效果
        imageView.startAnimation(translateAnimation);                      //启动动画
    }

    /**
     * 在这段代码中，首先初始化了一个移动的动画效果translateAnimation。
     * 然后，在按钮监听器中，通过setDuration方法设置动画持续时间，通过setFillBefore方法使对象回到起始点，
     * 并使用setFillEnabled使能填充效果，
     * 最后使用startNow方法启动动画效果。
     * 读者执行这段代码，当点击"执行动画"按钮时，图片开始移动，当动画结束之后，图片将自动跳回到起始位置。
     */
    private void fillEnable() {
        Animation translateAnimation = new TranslateAnimation(0, 200, 0, 200);
        translateAnimation.setDuration(3000);               //设置动画持续时间
        translateAnimation.setFillBefore(true);             //回归起始位置
        translateAnimation.setFillEnabled(true);            //使能填充效果
        imageView.setAnimation(translateAnimation);             //设置动画效果
        imageView.startAnimation(translateAnimation);                      //启动动画
    }

    /**
     * 在这段代码中，首先初始化了一个移动的动画效果translateAnimation。
     * 然后，在按钮监听器中，通过setDuration方法设置动画持续时间，
     * 通过setFillAfter方法使对象保留在终止点，并使用setFillEnabled使能填充效果，
     * 最后使用startNow方法启动动画效果。
     * 读者执行这段代码，当点击"执行动画"按钮时，图片开始移动，当动画结束之后，图片将停留在终止位置。
     */
    private void fillAfter() {
        Animation translateAnimation = new TranslateAnimation(0, 200, 0, 200);
        translateAnimation.setDuration(3000);               //设置动画持续时间
        translateAnimation.setFillAfter(true);             //保留在终止位置
        translateAnimation.setFillEnabled(true);            //使能填充效果
        imageView.setAnimation(translateAnimation);             //设置动画效果
        imageView.startAnimation(translateAnimation);                      //启动动画
    }

    /**
     * 在这段代码中，首先初始化了一个移动的动画效果translateAnimation。
     * 然后，在按钮监听器中，通过setDuration方法设置动画持续时间，
     * 通过setRepeatCount方法设置重复次数，通过setRepeatMode设置重复模式，
     * 最后使用startNow方法启动动画效果。
     * 如果设置的重复模式为Animation.RESTART，则表示重新从头开始执行。
     * 读者执行这段代码，当点击"执行动画"按钮时，图片开始移动，当一次动画执行结束之后，图片将重新从头开始执行。
     * 如果设置的重复模式为Animation.REVERSE，则表示反方向执行。
     * 读者执行这段代码，当点击"执行动画"按钮时，图片开始移动，当一次动画执行结束之后，图片将向反方向运动。
     */
    private void repeatMode() {
        Animation translateAnimation = new TranslateAnimation(0, 200, 0, 200);
        translateAnimation.setDuration(3000);               //设置动画持续时间
        translateAnimation.setRepeatCount(2);               //设置重复次数
        translateAnimation.setRepeatMode(Animation.RESTART);    //重新从头执行
        //translateAnimation.setRepeatMode(Animation.REVERSE);  //反方向执行
        imageView.setAnimation(translateAnimation);             //设置动画效果
        imageView.startAnimation(translateAnimation);                      //启动动画
    }

    /**
     * 在这段代码中，首先初始化了一个移动的动画效果translateAnimation。
     * 然后，在按钮监听器中，通过setDuration方法设置动画的持续时间，通过setStartOffset方法设置动画的启动时间，
     * 最后使用startNow方法启动动画效果。
     * 读者执行这段代码，当点击"执行动画"按钮时，将等待3秒之后，图片才开始移动。
     */
    private void setStartTime() {
        Animation translateAnimation = new TranslateAnimation(0, 200, 0, 200);
        translateAnimation.setDuration(3000);               //设置动画持续时间
        translateAnimation.setStartOffset(3000);            //设置启动时间
        imageView.setAnimation(translateAnimation);             //设置动画效kk果
        imageView.startAnimation(translateAnimation);                      //启动动画
    }

    /**
     * 在这段代码中，首先通过TranslateAnimation构造方法创建了一个位置变化的动画对象。
     * 然后，在第一个按钮监听器中设置了动画的持续时间、重复次数和重复模式等，然后启动该动画。
     * 在第二个按钮监听器中取消该动画。
     * 读者运行这段代码，将看到图片往返运动。
     */
    private void translateAnimation() {
        Animation translateAnimation = new TranslateAnimation(0, 300, 0, 300);
        translateAnimation.setDuration(3000);               //设置动画持续时间
        translateAnimation.setRepeatCount(2);               //设置重复次数
        translateAnimation.setRepeatMode(Animation.REVERSE);    //反方向执行
        imageView.setAnimation(translateAnimation);             //设置动画效果
        imageView.startAnimation(translateAnimation);                      //启动动画
    }

    /**
     * 在这段代码中，首先通过RotateAnimation构造方法创建了一个旋转变化的动画对象。
     * 然后，在第一个按钮监听器中设置了动画的持续时间，之后启动该动画。
     * 在第二个按钮监听器中取消该动画。
     */
    private void rotateAnimation() {
        Animation rotateAnimation = new RotateAnimation(0f, 360f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotateAnimation.setDuration(3000);              //持续时间
        imageView.setAnimation(rotateAnimation);            //设置动画
        imageView.startAnimation(rotateAnimation);                 //启动动画
    }

    private void scaleAnimation() {

    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getFragmentManager();
        switch (v.getId()) {
            case R.id.btn_simple_animation:
                Log.d(TAG, "btn_simple_animation");
//                switchPage(fragmentManager, AnimationType.SIMPLE_ANIMATION, false);
//                switchPage(fragmentManager, AnimationType.SIMPLE_ANIMATION, true);
                switchFragment(AnimationType.SIMPLE_ANIMATION);
            break;
        }
    }

    private void switchPage(FragmentManager fragmentManager,int switchPage,boolean type) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        switch (switchPage) {
            case AnimationType.SIMPLE_ANIMATION:
                Log.d(TAG, "enter----switchPage--case AnimationType.SIMPLE_ANIMATION:");
                simpleFragment = (SimpleFragment) fragmentManager.findFragmentByTag("simpleAnimation");
                if (type){
                    if (simpleFragment == null) {
                        simpleFragment = new SimpleFragment();
                        fragmentTransaction.add(R.id.fl_content, simpleFragment, "simpleAnimation");
                    } else {
                        fragmentTransaction.show(simpleFragment);
                    }
                } else {
                    fragmentTransaction.hide(simpleFragment);
                }
                fragmentTransaction.commit();
                break;
        }
    }

    private SimpleFragment simpleFragment = null;

    private void switchFragment(int switchId) {
        Log.d(TAG, "enter----switchFragment");
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        switch (switchId) {
            case AnimationType.SIMPLE_ANIMATION:
                Log.d(TAG, "enter----switchFragment--case AnimationType.SIMPLE_ANIMATION:");
                simpleFragment = (SimpleFragment) fragmentManager.findFragmentByTag("simpleAnimation");
                if (simpleFragment == null) {
                    simpleFragment = new SimpleFragment();
                    fragmentTransaction.add(R.id.fl_content, simpleFragment, "simpleAnimation");
                } else {
                    fragmentTransaction.show(simpleFragment);
                }
                fragmentTransaction.commit();
                break;
        }
    }
}