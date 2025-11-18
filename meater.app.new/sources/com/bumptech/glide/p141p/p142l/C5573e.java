package com.bumptech.glide.p141p.p142l;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: ImageViewTargetFactory.java */
/* renamed from: com.bumptech.glide.p.l.e */
/* loaded from: classes.dex */
public class C5573e {
    /* renamed from: a */
    public <Z> AbstractC5578j<ImageView, Z> m10984a(ImageView imageView, Class<Z> cls) {
        if (Bitmap.class.equals(cls)) {
            return new C5570b(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new C5571c(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
