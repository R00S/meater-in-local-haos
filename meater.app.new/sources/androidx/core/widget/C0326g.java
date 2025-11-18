package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* compiled from: ImageViewCompat.java */
/* renamed from: androidx.core.widget.g */
/* loaded from: classes.dex */
public class C0326g {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static ColorStateList m2311a(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return imageView.getImageTintList();
        }
        if (imageView instanceof InterfaceC0333n) {
            return ((InterfaceC0333n) imageView).getSupportImageTintList();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static PorterDuff.Mode m2312b(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return imageView.getImageTintMode();
        }
        if (imageView instanceof InterfaceC0333n) {
            return ((InterfaceC0333n) imageView).getSupportImageTintMode();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static void m2313c(ImageView imageView, ColorStateList colorStateList) {
        Drawable drawable;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 21) {
            if (imageView instanceof InterfaceC0333n) {
                ((InterfaceC0333n) imageView).setSupportImageTintList(colorStateList);
                return;
            }
            return;
        }
        imageView.setImageTintList(colorStateList);
        if (i2 != 21 || (drawable = imageView.getDrawable()) == null || imageView.getImageTintList() == null) {
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(imageView.getDrawableState());
        }
        imageView.setImageDrawable(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static void m2314d(ImageView imageView, PorterDuff.Mode mode) {
        Drawable drawable;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 21) {
            if (imageView instanceof InterfaceC0333n) {
                ((InterfaceC0333n) imageView).setSupportImageTintMode(mode);
                return;
            }
            return;
        }
        imageView.setImageTintMode(mode);
        if (i2 != 21 || (drawable = imageView.getDrawable()) == null || imageView.getImageTintList() == null) {
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(imageView.getDrawableState());
        }
        imageView.setImageDrawable(drawable);
    }
}
