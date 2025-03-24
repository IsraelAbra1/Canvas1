package com.example.canvas1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

public class Square {
    private int x,y,w;
    private Bitmap bitmap;

    public Square(int x, int y, int w, Bitmap bitmap) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.bitmap = bitmap;
    }

    public void draw(Canvas canvas)
    {
        Paint p = new Paint();
        p.setStyle(Paint.Style.STROKE);
        p.setStrokeWidth(40);
        canvas.drawRect(x,y,x+w,y+w,p);
    }

    public boolean didUserTouchMe(int xu, int yu) {
        if(xu>x && xu<x+w && yu>y && yu<y+w)
            return true;
        else
            return false;
    }
}
