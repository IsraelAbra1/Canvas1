package com.example.canvas1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import androidx.annotation.NonNull;

public class BoardGame extends View {
    public BoardGame(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setStrokeWidth(70);
        paint.setColor(Color.BLUE);
        canvas.drawLine(100,100,300,300,paint);

        paint.setColor(Color.YELLOW);
        canvas.drawRect(100,400,500,700,paint);

        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.RED);
        canvas.drawRect(100,800,500,1000,paint);

        canvas.drawCircle(300,1100,200,paint);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(),R.drawable.smile);
        canvas.drawBitmap(bmp,200,200,null);
    }
}
