package j1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import i1.e;
import i1.h;
import java.util.List;
import o1.k;
import s.C4413x;
import y3.C5123a;

/* compiled from: TypefaceCompat.java */
/* renamed from: j1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3725j {

    /* renamed from: a, reason: collision with root package name */
    private static final C3730o f43459a;

    /* renamed from: b, reason: collision with root package name */
    private static final C4413x<String, Typeface> f43460b;

    /* compiled from: TypefaceCompat.java */
    /* renamed from: j1.j$a */
    public static class a extends k.c {

        /* renamed from: a, reason: collision with root package name */
        private h.e f43461a;

        public a(h.e eVar) {
            this.f43461a = eVar;
        }

        @Override // o1.k.c
        public void a(int i10) {
            h.e eVar = this.f43461a;
            if (eVar != null) {
                eVar.f(i10);
            }
        }

        @Override // o1.k.c
        public void b(Typeface typeface) {
            h.e eVar = this.f43461a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        C5123a.a("TypefaceCompat static init");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f43459a = new C3729n();
        } else if (i10 >= 28) {
            f43459a = new C3728m();
        } else {
            f43459a = new C3727l();
        }
        f43460b = new C4413x<>(16);
        C5123a.b();
    }

    public static Typeface a(Context context, Typeface typeface, int i10) {
        if (context != null) {
            return Typeface.create(typeface, i10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, k.b[] bVarArr, int i10) {
        C5123a.a("TypefaceCompat.createFromFontInfo");
        try {
            return f43459a.b(context, cancellationSignal, bVarArr, i10);
        } finally {
            C5123a.b();
        }
    }

    public static Typeface c(Context context, CancellationSignal cancellationSignal, List<k.b[]> list, int i10) {
        C5123a.a("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return f43459a.c(context, cancellationSignal, list, i10);
        } finally {
            C5123a.b();
        }
    }

    public static Typeface d(Context context, e.b bVar, Resources resources, int i10, String str, int i11, int i12, h.e eVar, Handler handler, boolean z10) {
        Typeface typefaceA;
        if (bVar instanceof e.C0544e) {
            e.C0544e c0544e = (e.C0544e) bVar;
            Typeface typefaceH = h(c0544e.d());
            if (typefaceH != null) {
                if (eVar != null) {
                    eVar.d(typefaceH, handler);
                }
                return typefaceH;
            }
            typefaceA = o1.k.c(context, c0544e.a() != null ? C3724i.a(new Object[]{c0544e.c(), c0544e.a()}) : C3724i.a(new Object[]{c0544e.c()}), i12, !z10 ? eVar != null : c0544e.b() != 0, z10 ? c0544e.e() : -1, h.e.e(handler), new a(eVar));
        } else {
            typefaceA = f43459a.a(context, (e.c) bVar, resources, i12);
            if (eVar != null) {
                if (typefaceA != null) {
                    eVar.d(typefaceA, handler);
                } else {
                    eVar.c(-3, handler);
                }
            }
        }
        if (typefaceA != null) {
            f43460b.d(f(resources, i10, str, i11, i12), typefaceA);
        }
        return typefaceA;
    }

    public static Typeface e(Context context, Resources resources, int i10, String str, int i11, int i12) {
        Typeface typefaceD = f43459a.d(context, resources, i10, str, i12);
        if (typefaceD != null) {
            f43460b.d(f(resources, i10, str, i11, i12), typefaceD);
        }
        return typefaceD;
    }

    private static String f(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    public static Typeface g(Resources resources, int i10, String str, int i11, int i12) {
        return f43460b.c(f(resources, i10, str, i11, i12));
    }

    private static Typeface h(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface typefaceCreate = Typeface.create(str, 0);
        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            return null;
        }
        return typefaceCreate;
    }
}
