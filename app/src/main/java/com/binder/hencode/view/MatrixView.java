package com.binder.hencode.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Team丶长相守 on 2018/1/23.
 */

public class MatrixView extends View {
    public MatrixView(Context context) {
        this(context,null);
    }

    public MatrixView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MatrixView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Matrix matrix = new Matrix();
        matrix.reset();
    }
}
