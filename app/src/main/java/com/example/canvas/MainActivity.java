package com.example.canvas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    private Canvas mCanvas;
    private Paint mPaint = new Paint();
    private Bitmap mBitmap;
    private ImageView mImageView;
    int count;

    private int mColorCar1;
    private int mColorCar2;
    private int mColorWindshield1;
    private int mColorWindshield2;
    private int mColorWheel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mColorCar1 = ResourcesCompat.getColor(getResources(),
                R.color.color1, null);
        mColorCar2 = ResourcesCompat.getColor(getResources(),
                R.color.color2, null);
        mColorWindshield1 = ResourcesCompat.getColor(getResources(),
                R.color.color3, null);
        mColorWindshield2 = ResourcesCompat.getColor(getResources(),
                R.color.color4, null);
        mColorWheel = ResourcesCompat.getColor(getResources(),
                R.color.color5, null);


        mImageView = findViewById(R.id.my_image_view);
        count = 0;
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                drawSomething(view);
                count ++;

            }
        });
    }

    public void drawSomething(View view) {

        if (count == 0){
            int width = view.getWidth();
            int height = view.getHeight();

            mBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            mCanvas = new Canvas(mBitmap);


            mCanvas.drawColor(Color.WHITE);

        }
        else if (count == 1) {

            mPaint.setColor(mColorCar1);

            int width = 1000; // set ukuran objek
            int height = 150;

            int x = (mCanvas.getWidth() - width) / 2; // hitung koordinat pusat x
            int y = (mCanvas.getHeight() - height) / 2 + 200; // hitung koordinat pusat y

            Path path = new Path();
            path.moveTo(x, y);
            path.lineTo(x + width, y);
            path.lineTo(x + width - 50, y + height);
            path.lineTo(x + 60, y + height);
            path.lineTo(x, y);
            mCanvas.drawPath(path, mPaint);
        }
        else if (count == 2) {

            mPaint.setColor(mColorCar2);

            int width = 600; // set ukuran objek
            int height = 200;

            int x = (mCanvas.getWidth() - width) / 2;
            int y = ((mCanvas.getHeight() - height) / 2) + 25;

            Path path = new Path();
            path.moveTo(x, y + 150);
            path.lineTo(x + width + 80, y + 150);
            path.lineTo(x + width + 80, y + height);
            path.lineTo(x, y + height);
            path.lineTo(x, y);
            mCanvas.drawPath(path, mPaint);

            int tWidth = 600;
            int tHeight = 200;
            int tx = ((mCanvas.getWidth() - tWidth) / 2) - 200 ;
            int ty = ((mCanvas.getHeight() - tHeight) / 2) + 25;

            path.moveTo(tx, ty + tHeight);
            path.lineTo(tx + tWidth - 200, ty + tHeight);
            path.lineTo(tx + tWidth / 2 - 30, ty + 80);
            path.lineTo(tx, ty + tHeight);
            mCanvas.drawPath(path, mPaint);

            int t2Width = 400;
            int t2Height = 200;
            int t2x = ((mCanvas.getWidth() - t2Width) / 2) + 300 ;
            int t2y = ((mCanvas.getHeight() - t2Height) / 2) + 25;

            path.moveTo(t2x, t2y + t2Height);
            path.lineTo(t2x + t2Width, t2y + t2Height);
            path.lineTo(t2x + t2Width / 2 + 5, t2y + 80);
            path.lineTo(t2x + 65, t2y + t2Height);
            mCanvas.drawPath(path, mPaint);

        }

        else if (count == 3) {

            mPaint.setColor(mColorWindshield1);
            int width = 100;
            int height = 350;
            int x = ((mCanvas.getWidth() - width) / 2) - 100;
            int y = (mCanvas.getHeight() - height) / 2;

            Path path = new Path();
            path.moveTo(x + width / 2, y); // titik atas
            path.lineTo(x + width + 40, y); // titik kanan atas
            path.lineTo(x + 3 * width / 4 - 50, y + height - 100); // titik kanan bawah
            path.lineTo(x + width / 4 - 30, y + height - 100); // titik kiri bawah
            path.lineTo(x - 80, y + height - 170); // titik kiri atas
            path.lineTo(x + width / 2, y); // kembali ke titik atas
            mCanvas.drawPath(path, mPaint);

        }
        else if (count == 4) {

            mPaint.setColor(mColorWindshield2);
            int width = 40;
            int height = 180;
            int x = ((mCanvas.getWidth() - width) / 2) - 140;
            int y = (mCanvas.getHeight() - height) / 2 - 20;

            Path path = new Path();
            path.moveTo(x, y);
            path.lineTo(x + width, y + 40);
            path.lineTo(x + width, y + height - 11);
            path.lineTo(x + 10, y + height + 5);
            path.lineTo(x, y);

            mCanvas.save(); // simpan state canvas saat ini
            mCanvas.rotate(70, x + width / 2, y + height / 2);
            mCanvas.drawPath(path, mPaint);
            mCanvas.restore(); // kembalikan state canvas ke semula


        }
        else if (count == 5) {

            mPaint.setColor(mColorWindshield2);
            int width = 40;
            int height = 140;
            int x = ((mCanvas.getWidth() - width) / 2) - 70;
            int y = (mCanvas.getHeight() - height) / 2 - 135;

            Path path = new Path();
            path.moveTo(x, y);
            path.lineTo(x + width, y + 40);
            path.lineTo(x + width, y + height + 30);
            path.lineTo(x + 15, y + height);
            path.lineTo(x, y);

            mCanvas.save(); // simpan state canvas saat ini
            mCanvas.rotate(75, x + width / 2, y + height / 2);
            mCanvas.drawPath(path, mPaint);
            mCanvas.restore(); // kembalikan state canvas ke semula
        }
        else if (count == 6) {

            mPaint.setColor(Color.BLACK);

            int width = 25; // set ukuran objek
            int height = 254;

            int x = ((mCanvas.getWidth() - width) / 2) - 70; // hitung koordinat pusat x
            int y = ((mCanvas.getHeight() - height) / 2) - 50; // hitung koordinat pusat y

            Path path = new Path();
            path.moveTo(x, y);
            path.lineTo(x + width, y - 11);
            path.lineTo(x + width, y + height + 14);
            path.lineTo(x, y + height + 28);
            path.lineTo(x, y);

            mCanvas.save(); // simpan state canvas saat ini
            mCanvas.rotate(30, x + width / 2, y + height / 2);
            mCanvas.drawPath(path, mPaint);
            mCanvas.restore(); // kembalikan state canvas ke semula

        }
        else if (count == 7) {

            mPaint.setColor(Color.BLACK);

            int width = 120; // set ukuran objek
            int height = 15;

            int x = ((mCanvas.getWidth() - width) / 2) - 50; // hitung koordinat pusat x
            int y = ((mCanvas.getHeight() - height) / 2) - 170; // hitung koordinat pusat y


            Path path = new Path();
            path.moveTo(x, y);
            path.lineTo(x + width, y);
            path.lineTo(x + width, y + height);
            path.lineTo(x, y + height);
            path.lineTo(x, y);
            mCanvas.drawPath(path, mPaint);

        } else if (count == 8) {

            mPaint.setColor(Color.BLACK);

            int width = 70;
            int height = 120;
            int x = ((mCanvas.getWidth() - width) / 2) + 60;
            int y = (mCanvas.getHeight() - height) / 2 + 15;

            Path path = new Path();
            path.moveTo(x, y + height); // titik kiri bawah
            path.lineTo(x+50, y); // titik kiri atas
            path.lineTo(x + width, y); // titik kanan atas
            path.lineTo(x + width, y + height); // titik kanan bawah
            path.lineTo(x, y + height); // kembali ke titik kiri bawah
            mCanvas.drawPath(path, mPaint);

        } else if (count == 9) {
            mPaint.setColor(Color.BLACK);

            int width = 40;
            int height = 120;
            int x = ((mCanvas.getWidth() - width) / 2) + 210;
            int y = (mCanvas.getHeight() - height) / 2 + 15;

            Path path = new Path();
            path.moveTo(x, y + height); // titik kiri bawah
            path.lineTo(x + 80, y + 20); // titik kiri atas
            path.lineTo(x + width + 75, y + 50); // titik kanan atas
            path.lineTo(x + width, y + height); // titik kanan bawah
            path.lineTo(x, y + height); // kembali ke titik kiri bawah
            mCanvas.drawPath(path, mPaint);

        } else if (count == 10) {
            mPaint.setColor(Color.BLACK);

            int width = 20;
            int height = 120;
            int x = ((mCanvas.getWidth() - width) / 2) + 190;
            int y = (mCanvas.getHeight() - height) / 2 + 15;

            Path path = new Path();
            path.moveTo(x, y + height); // titik kiri bawah
            path.lineTo(x + 80, y - 40); // titik kiri atas
            path.lineTo(x + width + 100, y - 15); // titik kanan atas
            path.lineTo(x + width, y + height); // titik kanan bawah
            path.lineTo(x, y + height); // kembali ke titik kiri bawah
            mCanvas.drawPath(path, mPaint);
        } else if (count == 11) {

            mPaint.setColor(Color.WHITE);

            int x = (mCanvas.getWidth() / 2) - 220;
            int y = (mCanvas.getHeight() / 2) + 280;

            int radius = 100;

            mCanvas.drawCircle(x, y, radius, mPaint);
        } else if (count == 12) {

            mPaint.setColor(Color.WHITE);

            int x = (mCanvas.getWidth() / 2) + 220;
            int y = (mCanvas.getHeight() / 2) + 280;

            int radius = 100;

            mCanvas.drawCircle(x, y, radius, mPaint);

        } else if (count == 13) {
            mPaint.setColor(Color.BLACK);

            int x = (mCanvas.getWidth() / 2) - 220;
            int y = (mCanvas.getHeight() / 2) + 280;

            int radius = 90;

            mCanvas.drawCircle(x, y, radius, mPaint);
        } else if (count == 14) {
            mPaint.setColor(Color.BLACK);

            int x = (mCanvas.getWidth() / 2) + 220;
            int y = (mCanvas.getHeight() / 2) + 280;

            int radius = 90;

            mCanvas.drawCircle(x, y, radius, mPaint);
        } else if (count == 15) {
            mPaint.setColor(mColorCar2);

            int x = (mCanvas.getWidth() / 2) - 220;
            int y = (mCanvas.getHeight() / 2) + 280;

            int radius = 70;

            mCanvas.drawCircle(x, y, radius, mPaint);
        }

        else if (count == 16) {
            mPaint.setColor(mColorCar2);

            int x = (mCanvas.getWidth() / 2) + 220;
            int y = (mCanvas.getHeight() / 2) + 280;

            int radius = 70;

            mCanvas.drawCircle(x, y, radius, mPaint);
        }
        else if (count == 17) {
            mPaint.setColor(mColorWheel);

            int x = (mCanvas.getWidth() / 2) - 220;
            int y = (mCanvas.getHeight() / 2) + 280;

            int radius = 50;

            mCanvas.drawCircle(x, y, radius, mPaint);
        }
        else if (count == 18) {
            mPaint.setColor(mColorWheel);

            int x = (mCanvas.getWidth() / 2) + 220;
            int y = (mCanvas.getHeight() / 2) + 280;

            int radius = 50;

            mCanvas.drawCircle(x, y, radius, mPaint);
        }

        else {
        }


        // Menggambar trapesium dengan path



        // Set the ImageView to display the generated bitmap
        mImageView.setImageBitmap(mBitmap);
        view.invalidate();
    }
}