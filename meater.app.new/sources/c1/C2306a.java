package c1;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: CustomSupport.java */
/* renamed from: c1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2306a {

    /* compiled from: CustomSupport.java */
    /* renamed from: c1.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0431a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30915a;

        static {
            int[] iArr = new int[a.EnumC0346a.values().length];
            f30915a = iArr;
            try {
                iArr[a.EnumC0346a.INT_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30915a[a.EnumC0346a.FLOAT_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30915a[a.EnumC0346a.COLOR_DRAWABLE_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30915a[a.EnumC0346a.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30915a[a.EnumC0346a.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30915a[a.EnumC0346a.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30915a[a.EnumC0346a.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private static int a(int i10) {
        int i11 = (i10 & (~(i10 >> 31))) - 255;
        return (i11 & (i11 >> 31)) + 255;
    }

    public static void b(androidx.constraintlayout.widget.a aVar, View view, float[] fArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Class<?> cls = view.getClass();
        String str = "set" + aVar.b();
        try {
            boolean z10 = true;
            switch (C0431a.f30915a[aVar.c().ordinal()]) {
                case 1:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 2:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    int iA = (a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(iA);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + aVar.b());
                case 6:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    if (fArr[0] <= 0.5f) {
                        z10 = false;
                    }
                    method2.invoke(view, Boolean.valueOf(z10));
                    return;
                case 7:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e10) {
            Log.e("CustomSupport", "Cannot access method " + str + " on View \"" + androidx.constraintlayout.motion.widget.a.b(view) + "\"", e10);
        } catch (NoSuchMethodException e11) {
            Log.e("CustomSupport", "No method " + str + " on View \"" + androidx.constraintlayout.motion.widget.a.b(view) + "\"", e11);
        } catch (InvocationTargetException e12) {
            Log.e("CustomSupport", "Cannot invoke method " + str + " on View \"" + androidx.constraintlayout.motion.widget.a.b(view) + "\"", e12);
        }
    }
}
