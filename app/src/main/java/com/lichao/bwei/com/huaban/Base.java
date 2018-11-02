package com.lichao.bwei.com.huaban;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * date:2018/11/1
 * author:李超(li)
 * function:
 */
public class Base extends View {
    private Paint mPaint;
    private int x =100;
    private int y = 100;
    Rect mRect = new Rect();
    public Base(Context context) {
        this(context,null);
    }

    public Base(Context context,  AttributeSet attrs) {
        this(context, attrs,0);
        mPaint = new Paint();
        mPaint.setColor(Color.BLACK);
        mPaint.setAlpha(222);
        mPaint.setStrokeWidth(2);
        mPaint.setAntiAlias(true);
    }

    public Base(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(x,y,200,mPaint);
        canvas.drawText("赵颖冰",100,200,mPaint);
        mRect.set((int)(x-100),(int)(y-100),(int)(x+1000),(int)(y+100));

    }
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:

                break;
            case MotionEvent.ACTION_MOVE:
                int x1 = (int) event.getX();
                int y1 = (int) event.getY();

                if(((x-x1)*(x-x1))+((y-y1)*(y-y1))<40000){
                    //得到当前坐标 用event得到
                    this.x = (int) event.getX();
                    this.y = (int) event.getY();
                    //刷新当前视图
                    invalidate();//这个方法是主线程中刷新，
                    // postInvalidate();//这个方法是子线程中刷新
                }

                break;
            case MotionEvent.ACTION_UP:

                break;
        }
        //记住最后要返回TRUE
        return true;

    }
}
