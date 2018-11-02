package com.lichao.bwei.com.huaban;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {

    private ImageView mImageView;
    private Bitmap mCopyBitmap;
    private Paint mPaint;
    private Canvas mCanvas;
    private float startX;
    private float startY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        mImageView = findViewById(R.id.iv_image);
//        //使用bitmap工厂吧图片加载进来
//        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.bg);
//       //创建一个空的图片，宽度和长度还有消息跟图片一样
//        mCopyBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
//       //创建画笔
//        mPaint = new Paint();
//        //创建画布
//        mCanvas = new Canvas(mCopyBitmap);
//        //开始画画
//        mCanvas.drawBitmap(bitmap,new Matrix(),mPaint);
//        mImageView.setImageBitmap(mCopyBitmap);
//
//        mImageView.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                //获取动作的事件
//                int action = event.getAction();
//                switch (action) {
//                    case MotionEvent.ACTION_DOWN:
//                        //按下事件
//                        startX = event.getX();
//                        startY = event.getY();
//                        Log.e("按下", startX + "," + startY);
//                        break;
//                    case MotionEvent.ACTION_MOVE:
//                        //滑动事件
//                        float x = event.getX();
//                        float y = event.getY();
//                        //在画布上画直线，不能画点，滑动事件获得的坐标不是连续的
//                        mCanvas.drawLine(startX, startY, x, y, mPaint);
//                        //更新图片
//                        mImageView.setImageBitmap(mCopyBitmap);
//                        startX = x;
//                        startY = y;
//                        Log.e("滑动", x + "," + y);
//                        break;
//                    case MotionEvent.ACTION_UP:
//                        //抬起事件
//                        float upX = event.getX();
//                        float upY = event.getY();
//                        Log.e("抬起", upX + "," + upY);
//                        break;
//                }
//                //必须设置为true，否则只执行按下事件
//                return true;
//            }
//        });

    }
//    //修改画笔的颜色
//    public void changeColor(View view) {
//        mPaint.setColor(Color.RED);
//    }
//
//    //设置画笔的粗细
//    public void bold(View view) {
//        mPaint.setStrokeWidth(50);
//    }
//
//    //保存图片
//    public void save(View view) {
//        //创建一个图片的文件
//        File file = new File(Environment.getExternalStorageDirectory(), System.currentTimeMillis() + ".png");
//        FileOutputStream straeam;
//        try {
//            straeam = new FileOutputStream(file);
//            //生成图片，参数①为图片的类型，参数②为图片质量，参数③为文件输出流
//            mCopyBitmap.compress(Bitmap.CompressFormat.PNG, 100, straeam);
//            Toast.makeText(this, "保存成功", Toast.LENGTH_SHORT).show();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }

}
