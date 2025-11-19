package H6;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import s6.m;

/* compiled from: Util.java */
/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f5601a = "0123456789abcdef".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f5602b = new char[64];

    /* renamed from: c, reason: collision with root package name */
    private static volatile Handler f5603c;

    /* compiled from: Util.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5604a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f5604a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5604a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5604a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5604a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5604a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private l() {
    }

    public static void a() {
        if (!r()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean b(D6.a<?> aVar, D6.a<?> aVar2) {
        return aVar == null ? aVar2 == null : aVar.H(aVar2);
    }

    public static boolean c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj instanceof m ? ((m) obj).a(obj2) : obj.equals(obj2);
    }

    public static boolean d(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    private static String e(byte[] bArr, char[] cArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 * 2;
            char[] cArr2 = f5601a;
            cArr[i11] = cArr2[(b10 & 255) >>> 4];
            cArr[i11 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public static <T> Queue<T> f(int i10) {
        return new ArrayDeque(i10);
    }

    public static int g(int i10, int i11, Bitmap.Config config) {
        return i10 * i11 * i(config);
    }

    @TargetApi(19)
    public static int h(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static int i(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i10 = a.f5604a[config.ordinal()];
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2 || i10 == 3) {
            return 2;
        }
        return i10 != 4 ? 4 : 8;
    }

    public static <T> List<T> j(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t10 : collection) {
            if (t10 != null) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    private static Handler k() {
        if (f5603c == null) {
            synchronized (l.class) {
                try {
                    if (f5603c == null) {
                        f5603c = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return f5603c;
    }

    public static int l(float f10) {
        return m(f10, 17);
    }

    public static int m(float f10, int i10) {
        return n(Float.floatToIntBits(f10), i10);
    }

    public static int n(int i10, int i11) {
        return (i11 * 31) + i10;
    }

    public static int o(Object obj, int i10) {
        return n(obj == null ? 0 : obj.hashCode(), i10);
    }

    public static int p(boolean z10, int i10) {
        return n(z10 ? 1 : 0, i10);
    }

    public static boolean q() {
        return !r();
    }

    public static boolean r() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean s(int i10) {
        return i10 > 0 || i10 == Integer.MIN_VALUE;
    }

    public static boolean t(int i10, int i11) {
        return s(i10) && s(i11);
    }

    public static void u(Runnable runnable) {
        k().post(runnable);
    }

    public static void v(Runnable runnable) {
        k().removeCallbacks(runnable);
    }

    public static String w(byte[] bArr) {
        String strE;
        char[] cArr = f5602b;
        synchronized (cArr) {
            strE = e(bArr, cArr);
        }
        return strE;
    }
}
