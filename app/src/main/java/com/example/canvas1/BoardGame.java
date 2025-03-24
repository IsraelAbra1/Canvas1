package com.example.canvas1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;

public class BoardGame extends View {
    private Square square;
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

        int w = canvas.getWidth()/3;
        square = new Square(2*w,0,w,null);
        square.draw(canvas);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int) event.getX();
        int y = (int) event.getY();

        if(event.getAction() == MotionEvent.ACTION_DOWN)
        {
            if(square.didUserTouchMe(x,y))
            {
                Toast.makeText(getContext(), "Yes", Toast.LENGTH_SHORT).show();
            }
        }

        return true;
    }

}
