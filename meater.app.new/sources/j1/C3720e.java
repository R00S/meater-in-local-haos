package j1;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import j1.C3717b;
import r1.C4338e;

/* compiled from: PaintCompat.java */
/* renamed from: j1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3720e {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<C4338e<Rect, Rect>> f43454a = new ThreadLocal<>();

    /* compiled from: PaintCompat.java */
    /* renamed from: j1.e$a */
    static class a {
        static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    /* compiled from: PaintCompat.java */
    /* renamed from: j1.e$b */
    static class b {
        static void a(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    public static boolean a(Paint paint, String str) {
        return a.a(paint, str);
    }

    public static boolean b(Paint paint, EnumC3716a enumC3716a) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.a(paint, enumC3716a != null ? C3717b.C0555b.a(enumC3716a) : null);
            return true;
        }
        if (enumC3716a == null) {
            paint.setXfermode(null);
            return true;
        }
        PorterDuff.Mode modeA = C3717b.a(enumC3716a);
        paint.setXfermode(modeA != null ? new PorterDuffXfermode(modeA) : null);
        return modeA != null;
    }
}
