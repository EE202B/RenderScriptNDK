package com.yingnanwang.cmakerstest4;

import android.graphics.Bitmap;

/**
 * Created by YingnanWang on 2/25/17.
 */

public class TFRSInterface {

    static{
        try {
            System.loadLibrary("hellocomputendk");
        } catch (UnsatisfiedLinkError e) {
            throw new RuntimeException(
                    e.toString());

        }
    }

    public static native void nativeMono(String cacheDir, int X, int Y, Bitmap in, Bitmap out);
}
