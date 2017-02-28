package com.wangj.gold.utils.imageloader;

import android.content.Context;
import android.view.View;

import java.io.Serializable;

/**
 * Created by leonWang on 2017/1/10.
 */

public interface ImageLoaderInterface<T extends View> extends Serializable {


    void displayImage(Context context, Object path, T imageView);

    void displayImage(Object path, T imageView);

    T creteImageView(Context context);
}
