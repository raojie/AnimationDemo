package com.raoj.animation;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.raoj.animation.common.AnimationType;
import com.raoj.animation.fragments.SimpleFragment;

public class MainActivity_Backup extends AppCompatActivity {

    public static final String TAG = "AnimationDemo";

    private Button btnStart;
    private Button btnStop;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_backup);
        btnStart = (Button) findViewById(R.id.btn_start);
        btnStop = (Button) findViewById(R.id.btn_stop);
        imageView = (ImageView) findViewById(R.id.image);

        final Animation translateAnimation = new TranslateAnimation(0, 200, 0, 200);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "enter onClick");
//                startAnimation();//下面通过代码来演示如何设置一个简单的动画效果。
//                repeatCount();//下面通过代码来演示如何连续执行多次动画效果。
//                fillEnable();//下面通过代码来演示如何让View对象在动画执行完毕后回归到起始位置。
//                fillAfter();//下面通过代码来演示如何让View对象在动画执行完毕后保留在终止位置。
//                repeatMode();//下面通过代码来演示如何更改动画路径的方向。
//                setStartTime();//下面通过代码来演示如何更改动画的启动时间。
//                translateAnimation();//下面通过代码来演示如何设置一个简单的位置变化动画效果。
//                rotateAnimation();//下面通过代码来演示如何设置一个简单的旋转变化动画效果。
//                scaleAnimation();//下面通过代码来演示如何设置一个简单的尺寸变化动画效果。
//                alphaAnimation();//下面通过代码来演示如何设置一个简单的渐变透明度动画效果。
//                animationSet();//下面通过代码来演示如何设置一个组合动画效果。
                AnimationUtils();//下面通过代码来演示如何加载一个XML组合动画效果。
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //取消动画执行
                translateAnimation.cancel();//通过代码来演示如何取消动画效果执行。
            }
        });

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
//        translateAnimation.setRepeatMode(Animation.RESTART);    //重新从头执行
        translateAnimation.setRepeatMode(Animation.REVERSE);  //反方向执行
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

    /**
     * 在这段代码中，首先通过ScaleAnimation构造方法创建了一个尺寸变化的动画对象。
     * 然后，在第一个按钮监听器中设置了动画的持续时间，之后启动该动画。
     * 在第二个按钮监听器中取消该动画。
     * 读者运行这段代码，将看到图片从小到大逐渐变化，最后，图片增大到原始尺寸的时候停止。
     */
    private void scaleAnimation() {
        Animation scaleAnimation = new
                ScaleAnimation(0f, 1f, 0f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        //设置尺寸变化动画对象
        scaleAnimation.setDuration(2000);               //动画持续时间
        imageView.setAnimation(scaleAnimation);         //设置动画
        imageView.startAnimation(scaleAnimation);           //启动动画
    }

    /**
     * 在这段代码中，首先通过AlphaAnimation构造方法创建了一个透明度变化的动画对象。
     * 然后，在第一个按钮监听器中设置了动画的持续时间，之后启动该动画。
     * 在第二个按钮监听器中取消该动画。
     * 读者运行这段代码，将看到图片的透明度由浅入深逐渐变化，最后，图片变为完全不透明的时候停止。
     */
    private void alphaAnimation() {
        Animation alphaAnimation = new AlphaAnimation(0.1f, 1.0f);   //设置透明度动画效果
        alphaAnimation.setDuration(30000);                  //设置持续时间
        imageView.setAnimation(alphaAnimation);             //设置动画
        imageView.startAnimation(alphaAnimation);                          //启动动画
    }

    /**
     * 在这段代码中，首先构造了位置变化、尺寸变化和透明度变化动画的对象。
     * 然后，在第一个按钮监听器中分别设置了动画的持续时间，并通过addAnimation方法添加到动画集中，之后启动该动画。
     * 在第二个按钮监听器中取消该动画。
     * 读者运行这段代码，将会看到显示效果。
     * 图片从小到大，由浅入深，从左上角向右下角移动。当动画结束的时候，图片对象将停留在结束点的位置。
     */
    private void animationSet() {
        Animation translateAnimation = new TranslateAnimation(0, 300, 0, 300);  //设置位置变化动画
        Animation scaleAnimation = new ScaleAnimation(0f, 1f, 0f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);//设置尺寸变化动画
        final Animation alphaAnimation = new AlphaAnimation(0.1f, 1.0f);
        translateAnimation.setDuration(10000);      //设置位置变化动画的持续时间
        scaleAnimation.setDuration(10000);          //设置尺寸变化动画的持续时间
        alphaAnimation.setDuration(10000);          //设置透明度渐变动画的持续时间
        AnimationSet set = new AnimationSet(true);    //创建动画集对象
        set.addAnimation(translateAnimation);       //添加位置变化动画
        set.addAnimation(scaleAnimation);           //添加尺寸变化动画
        set.addAnimation(alphaAnimation);           //添加透明度渐变动画
        set.setFillEnabled(true);
        set.setFillBefore(true);
        imageView.setAnimation(set);                    //设置动画
        imageView.startAnimation(set);                         //启动动画
    }

    /**
     * 如何加载一个XML组合动画效果
     * 在这段代码中，首先声明了动画对象。
     * 然后，在第一个按钮监听器中通过loadAnimation方法加载动画配置文件，并设置了动画的一些特征，最后开始执行动画。
     * 在第二个按钮监听器中调用cancel方法取消动画执行。
     * 这里用到的动画配置文件如下所示，里面定义了位置移动和旋转的组合动画效果。
     */
    private void AnimationUtils() {
        Animation loadAnimation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.anim);     //加载动画
        imageView.setAnimation(loadAnimation);                  //为控件设置动画
//        loadAnimation.setFillAfter(true);                   //停留在结束位置
        loadAnimation.setFillEnabled(true);
        loadAnimation.setFillBefore(true);
        imageView.startAnimation(loadAnimation);                //开始动画
    }
}