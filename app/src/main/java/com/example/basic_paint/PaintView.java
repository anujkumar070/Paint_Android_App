package com.example.basic_paint;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.EmbossMaskFilter;
import android.graphics.MaskFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;

public class PaintView extends View {
public static int BRUSH_SIZE = 20;
public static int DEFAULT_COLOR =Color.RED;
public static  int DEFAULT_BG_COLOR =Color.WHITE;
private static float TOUCH_TOLERENCE =4;
private float mx,my;
private Path mpath;
private Paint mpaint;
private ArrayList<FingerPath> paths= new ArrayList<>();
private int currentColor;
private int backgroundColor =DEFAULT_BG_COLOR;
private int strokeWidth;
private boolean embross;
private boolean blur;
private MaskFilter mEmbross;
private MaskFilter mBlur;
private Bitmap mBitmap;
private Canvas mCanvas;
private Paint mBitmapPaint = new Paint(Paint.DITHER_FLAG);

public PaintView(Context context,)
{
    this(context,null);
}
public PaintView(Context context ,AttributeSet attrs) {
    super(context ,attrs);
    mpaint = new Paint();
    mpaint.setAntiAlias(true);
    mpaint.setDither(true);
    mpaint.setColor(DEFAULT_COLOR);
    mpaint.setStyle(Paint.Style.STROKE);
    mpaint.setStrokeCap(Paint.Cap.ROUND);
    mpaint.setStrokeJoin(Paint.Join.ROUND);
    mpaint.setXfermode(null);
    mpaint.setAlpha(0xff);

    mEmbross =new EmbossMaskFilter(new float[] {1,1,1},0.4f,6,3.5f);
    mBlur = new BlurMaskFilter(5, BlurMaskFilter.Blur.NORMAL);
}


}
