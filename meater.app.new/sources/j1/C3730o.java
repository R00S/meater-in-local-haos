package j1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import i1.e;
import java.io.File;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import o1.k;

/* compiled from: TypefaceCompatBaseImpl.java */
/* renamed from: j1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3730o {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    private ConcurrentHashMap<Long, e.c> f43474a = new ConcurrentHashMap<>();

    /* compiled from: TypefaceCompatBaseImpl.java */
    /* renamed from: j1.o$a */
    class a implements b<k.b> {
        a() {
        }

        @Override // j1.C3730o.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(k.b bVar) {
            return bVar.e();
        }

        @Override // j1.C3730o.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(k.b bVar) {
            return bVar.f();
        }
    }

    /* compiled from: TypefaceCompatBaseImpl.java */
    /* renamed from: j1.o$b */
    private interface b<T> {
        int a(T t10);

        boolean b(T t10);
    }

    C3730o() {
    }

    private static <T> T e(T[] tArr, int i10, b<T> bVar) {
        return (T) f(tArr, (i10 & 1) == 0 ? 400 : 700, (i10 & 2) != 0, bVar);
    }

    private static <T> T f(T[] tArr, int i10, boolean z10, b<T> bVar) {
        T t10 = null;
        int i11 = Integer.MAX_VALUE;
        for (T t11 : tArr) {
            int iAbs = (Math.abs(bVar.a(t11) - i10) * 2) + (bVar.b(t11) == z10 ? 0 : 1);
            if (t10 == null || i11 > iAbs) {
                t10 = t11;
                i11 = iAbs;
            }
        }
        return t10;
    }

    public Typeface a(Context context, e.c cVar, Resources resources, int i10) {
        throw null;
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, k.b[] bVarArr, int i10) {
        throw null;
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, List<k.b[]> list, int i10) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        File fileD = p.d(context);
        if (fileD == null) {
            return null;
        }
        try {
            if (p.b(fileD, resources, i10)) {
                return Typeface.createFromFile(fileD.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileD.delete();
        }
    }

    protected k.b g(k.b[] bVarArr, int i10) {
        return (k.b) e(bVarArr, i10, new a());
    }
}
