package com.bumptech.glide.p145r;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import com.bumptech.glide.load.p129n.InterfaceC5460l;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* compiled from: Util.java */
/* renamed from: com.bumptech.glide.r.k */
/* loaded from: classes.dex */
public final class C5597k {

    /* renamed from: a */
    private static final char[] f14046a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    private static final char[] f14047b = new char[64];

    /* compiled from: Util.java */
    /* renamed from: com.bumptech.glide.r.k$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14048a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f14048a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14048a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14048a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14048a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14048a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: a */
    public static void m11044a() {
        if (!m11060q()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    /* renamed from: b */
    public static void m11045b() {
        if (!m11061r()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: c */
    public static boolean m11046c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj instanceof InterfaceC5460l ? ((InterfaceC5460l) obj).m10551a(obj2) : obj.equals(obj2);
    }

    /* renamed from: d */
    public static boolean m11047d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: e */
    private static String m11048e(byte[] bArr, char[] cArr) {
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int i3 = bArr[i2] & 255;
            int i4 = i2 * 2;
            char[] cArr2 = f14046a;
            cArr[i4] = cArr2[i3 >>> 4];
            cArr[i4 + 1] = cArr2[i3 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: f */
    public static <T> Queue<T> m11049f(int i2) {
        return new ArrayDeque(i2);
    }

    /* renamed from: g */
    public static int m11050g(int i2, int i3, Bitmap.Config config) {
        return i2 * i3 * m11052i(config);
    }

    @TargetApi(19)
    /* renamed from: h */
    public static int m11051h(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            if (Build.VERSION.SDK_INT >= 19) {
                try {
                    return bitmap.getAllocationByteCount();
                } catch (NullPointerException unused) {
                }
            }
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    /* renamed from: i */
    private static int m11052i(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i2 = a.f14048a[config.ordinal()];
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2 || i2 == 3) {
            return 2;
        }
        return i2 != 4 ? 4 : 8;
    }

    /* renamed from: j */
    public static <T> List<T> m11053j(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t : collection) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    public static int m11054k(float f2) {
        return m11055l(f2, 17);
    }

    /* renamed from: l */
    public static int m11055l(float f2, int i2) {
        return m11057n(Float.floatToIntBits(f2), i2);
    }

    /* renamed from: m */
    public static int m11056m(int i2) {
        return m11057n(i2, 17);
    }

    /* renamed from: n */
    public static int m11057n(int i2, int i3) {
        return (i3 * 31) + i2;
    }

    /* renamed from: o */
    public static int m11058o(Object obj, int i2) {
        return m11057n(obj == null ? 0 : obj.hashCode(), i2);
    }

    /* renamed from: p */
    public static int m11059p(boolean z, int i2) {
        return m11057n(z ? 1 : 0, i2);
    }

    /* renamed from: q */
    public static boolean m11060q() {
        return !m11061r();
    }

    /* renamed from: r */
    public static boolean m11061r() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: s */
    private static boolean m11062s(int i2) {
        return i2 > 0 || i2 == Integer.MIN_VALUE;
    }

    /* renamed from: t */
    public static boolean m11063t(int i2, int i3) {
        return m11062s(i2) && m11062s(i3);
    }

    /* renamed from: u */
    public static String m11064u(byte[] bArr) {
        String strM11048e;
        char[] cArr = f14047b;
        synchronized (cArr) {
            strM11048e = m11048e(bArr, cArr);
        }
        return strM11048e;
    }
}
