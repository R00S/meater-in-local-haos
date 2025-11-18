package p241e.p254e.p256b.p271c.p285x;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import androidx.appcompat.widget.C0185q0;
import p024c.p025a.p026k.p027a.C0833a;

/* compiled from: MaterialResources.java */
/* renamed from: e.e.b.c.x.c */
/* loaded from: classes2.dex */
public class C8947c {
    /* renamed from: a */
    public static ColorStateList m28499a(Context context, TypedArray typedArray, int i2) {
        int color;
        int resourceId;
        ColorStateList colorStateListM5261c;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateListM5261c = C0833a.m5261c(context, resourceId)) == null) ? (Build.VERSION.SDK_INT > 15 || (color = typedArray.getColor(i2, -1)) == -1) ? typedArray.getColorStateList(i2) : ColorStateList.valueOf(color) : colorStateListM5261c;
    }

    /* renamed from: b */
    public static ColorStateList m28500b(Context context, C0185q0 c0185q0, int i2) {
        int iM1093b;
        int iM1105n;
        ColorStateList colorStateListM5261c;
        return (!c0185q0.m1110s(i2) || (iM1105n = c0185q0.m1105n(i2, 0)) == 0 || (colorStateListM5261c = C0833a.m5261c(context, iM1105n)) == null) ? (Build.VERSION.SDK_INT > 15 || (iM1093b = c0185q0.m1093b(i2, -1)) == -1) ? c0185q0.m1094c(i2) : ColorStateList.valueOf(iM1093b) : colorStateListM5261c;
    }

    /* renamed from: c */
    public static int m28501c(Context context, TypedArray typedArray, int i2, int i3) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i2, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i2, i3);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i3);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    /* renamed from: d */
    public static Drawable m28502d(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        Drawable drawableM5262d;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (drawableM5262d = C0833a.m5262d(context, resourceId)) == null) ? typedArray.getDrawable(i2) : drawableM5262d;
    }

    /* renamed from: e */
    static int m28503e(TypedArray typedArray, int i2, int i3) {
        return typedArray.hasValue(i2) ? i2 : i3;
    }

    /* renamed from: f */
    public static C8948d m28504f(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        if (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) {
            return null;
        }
        return new C8948d(context, resourceId);
    }
}
