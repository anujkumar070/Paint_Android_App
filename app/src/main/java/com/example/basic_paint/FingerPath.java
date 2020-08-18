package com.example.basic_paint;
import android.graphics.Path;
public class FingerPath {
    public int color, strokeWidth;
    public boolean embross, blur;
    public Path path;

    FingerPath(int color, int strokeWidth, boolean embross, boolean blur, Path path) {
        this.color = color;
        this.embross = embross;
        this.strokeWidth = strokeWidth;
        this.blur = blur;
        this.path = path;
    }
}
