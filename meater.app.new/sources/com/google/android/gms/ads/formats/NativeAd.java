package com.google.android.gms.ads.formats;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class NativeAd {
    public static final String ASSET_ADCHOICES_CONTAINER_VIEW = "1098";

    public static abstract class AdChoicesInfo {
        public abstract List<Image> getImages();

        public abstract CharSequence getText();
    }

    public static abstract class Image {
        public abstract Drawable getDrawable();

        public int getHeight() {
            return -1;
        }

        public abstract double getScale();

        public abstract Uri getUri();

        public int getWidth() {
            return -1;
        }
    }

    @KeepForSdk
    @Deprecated
    public abstract void performClick(Bundle bundle);

    @KeepForSdk
    @Deprecated
    public abstract boolean recordImpression(Bundle bundle);

    @KeepForSdk
    @Deprecated
    public abstract void reportTouchEvent(Bundle bundle);

    protected abstract Object zzkq();
}
