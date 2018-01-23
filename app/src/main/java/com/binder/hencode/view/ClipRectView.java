package com.binder.hencode.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.binder.hencode.R;

/**
 * Created by Team丶长相守 on 2018/1/23.
 */
//范围裁剪clipRect() 和 clipPath()
public class ClipRectView extends View {
    private Paint paint;
    public ClipRectView(Context context) {
        this(context,null);
    }

    public ClipRectView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public ClipRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        paint =new Paint();
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.maps);
        canvas.save();
        //canvas.translate(float dx, float dy);平移
        canvas.translate(200,0);
        //旋转
        canvas.rotate(45,bitmap.getWidth()/2,bitmap.getHeight()/2);
        //缩放
        canvas.scale(1.3f,1.3f,bitmap.getWidth()/2,bitmap.getHeight()/2);
        //错切
        canvas.skew(0,0.5f);
        canvas.drawBitmap(bitmap,100,100,paint);
        canvas.restore();



    }
}
