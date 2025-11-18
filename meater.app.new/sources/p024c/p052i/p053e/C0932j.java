package p024c.p052i.p053e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.p003d.C0260c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import p024c.p052i.p057h.C0943f;

/* compiled from: TypefaceCompatBaseImpl.java */
/* renamed from: c.i.e.j */
/* loaded from: classes.dex */
class C0932j {

    /* renamed from: a */
    @SuppressLint({"BanConcurrentHashMap"})
    private ConcurrentHashMap<Long, C0260c.b> f6310a = new ConcurrentHashMap<>();

    /* compiled from: TypefaceCompatBaseImpl.java */
    /* renamed from: c.i.e.j$a */
    class a implements c<C0943f.b> {
        a() {
        }

        @Override // p024c.p052i.p053e.C0932j.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int mo5951a(C0943f.b bVar) {
            return bVar.m6004e();
        }

        @Override // p024c.p052i.p053e.C0932j.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo5952b(C0943f.b bVar) {
            return bVar.m6005f();
        }
    }

    /* compiled from: TypefaceCompatBaseImpl.java */
    /* renamed from: c.i.e.j$b */
    class b implements c<C0260c.c> {
        b() {
        }

        @Override // p024c.p052i.p053e.C0932j.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int mo5951a(C0260c.c cVar) {
            return cVar.m1735e();
        }

        @Override // p024c.p052i.p053e.C0932j.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo5952b(C0260c.c cVar) {
            return cVar.m1736f();
        }
    }

    /* compiled from: TypefaceCompatBaseImpl.java */
    /* renamed from: c.i.e.j$c */
    private interface c<T> {
        /* renamed from: a */
        int mo5951a(T t);

        /* renamed from: b */
        boolean mo5952b(T t);
    }

    C0932j() {
    }

    /* renamed from: a */
    private void m5946a(Typeface typeface, C0260c.b bVar) throws NoSuchFieldException {
        long jM5949j = m5949j(typeface);
        if (jM5949j != 0) {
            this.f6310a.put(Long.valueOf(jM5949j), bVar);
        }
    }

    /* renamed from: f */
    private C0260c.c m5947f(C0260c.b bVar, int i2) {
        return (C0260c.c) m5948g(bVar.m1730a(), i2, new b());
    }

    /* renamed from: g */
    private static <T> T m5948g(T[] tArr, int i2, c<T> cVar) {
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z = (i2 & 2) != 0;
        T t = null;
        int i4 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int iAbs = (Math.abs(cVar.mo5951a(t2) - i3) * 2) + (cVar.mo5952b(t2) == z ? 0 : 1);
            if (t == null || i4 > iAbs) {
                t = t2;
                i4 = iAbs;
            }
        }
        return t;
    }

    /* renamed from: j */
    private static long m5949j(Typeface typeface) throws NoSuchFieldException {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0L;
        } catch (NoSuchFieldException e3) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e3);
            return 0L;
        }
    }

    /* renamed from: b */
    public Typeface mo5923b(Context context, C0260c.b bVar, Resources resources, int i2) throws NoSuchFieldException {
        C0260c.c cVarM5947f = m5947f(bVar, i2);
        if (cVarM5947f == null) {
            return null;
        }
        Typeface typefaceM5911d = C0926d.m5911d(context, resources, cVarM5947f.m1732b(), cVarM5947f.m1731a(), i2);
        m5946a(typefaceM5911d, bVar);
        return typefaceM5911d;
    }

    /* renamed from: c */
    public Typeface mo5924c(Context context, CancellationSignal cancellationSignal, C0943f.b[] bVarArr, int i2) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        if (bVarArr.length < 1) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(mo5945h(bVarArr, i2).m6003d());
            try {
                Typeface typefaceMo5944d = mo5944d(context, inputStreamOpenInputStream);
                C0933k.m5957a(inputStreamOpenInputStream);
                return typefaceMo5944d;
            } catch (IOException unused) {
                C0933k.m5957a(inputStreamOpenInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpenInputStream;
                C0933k.m5957a(inputStream);
                throw th;
            }
        } catch (IOException unused2) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: d */
    protected Typeface mo5944d(Context context, InputStream inputStream) {
        File fileM5961e = C0933k.m5961e(context);
        if (fileM5961e == null) {
            return null;
        }
        try {
            if (C0933k.m5960d(fileM5961e, inputStream)) {
                return Typeface.createFromFile(fileM5961e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM5961e.delete();
        }
    }

    /* renamed from: e */
    public Typeface mo5936e(Context context, Resources resources, int i2, String str, int i3) {
        File fileM5961e = C0933k.m5961e(context);
        if (fileM5961e == null) {
            return null;
        }
        try {
            if (C0933k.m5959c(fileM5961e, resources, i2)) {
                return Typeface.createFromFile(fileM5961e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM5961e.delete();
        }
    }

    /* renamed from: h */
    protected C0943f.b mo5945h(C0943f.b[] bVarArr, int i2) {
        return (C0943f.b) m5948g(bVarArr, i2, new a());
    }

    /* renamed from: i */
    C0260c.b m5950i(Typeface typeface) throws NoSuchFieldException {
        long jM5949j = m5949j(typeface);
        if (jM5949j == 0) {
            return null;
        }
        return this.f6310a.get(Long.valueOf(jM5949j));
    }
}
