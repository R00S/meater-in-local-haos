package p024c.p052i.p053e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.p003d.C0260c;
import androidx.core.content.p003d.C0263f;
import p024c.p041e.C0871e;
import p024c.p052i.p057h.C0943f;

/* compiled from: TypefaceCompat.java */
@SuppressLint({"NewApi"})
/* renamed from: c.i.e.d */
/* loaded from: classes.dex */
public class C0926d {

    /* renamed from: a */
    private static final C0932j f6291a;

    /* renamed from: b */
    private static final C0871e<String, Typeface> f6292b;

    /* compiled from: TypefaceCompat.java */
    /* renamed from: c.i.e.d$a */
    public static class a extends C0943f.c {

        /* renamed from: a */
        private C0263f.c f6293a;

        public a(C0263f.c cVar) {
            this.f6293a = cVar;
        }

        @Override // p024c.p052i.p057h.C0943f.c
        /* renamed from: a */
        public void mo5916a(int i2) {
            C0263f.c cVar = this.f6293a;
            if (cVar != null) {
                cVar.mo1177d(i2);
            }
        }

        @Override // p024c.p052i.p057h.C0943f.c
        /* renamed from: b */
        public void mo5917b(Typeface typeface) {
            C0263f.c cVar = this.f6293a;
            if (cVar != null) {
                cVar.mo1178e(typeface);
            }
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            f6291a = new C0931i();
        } else if (i2 >= 28) {
            f6291a = new C0930h();
        } else if (i2 >= 26) {
            f6291a = new C0929g();
        } else if (i2 >= 24 && C0928f.m5927m()) {
            f6291a = new C0928f();
        } else if (i2 >= 21) {
            f6291a = new C0927e();
        } else {
            f6291a = new C0932j();
        }
        f6292b = new C0871e<>(16);
    }

    /* renamed from: a */
    public static Typeface m5908a(Context context, Typeface typeface, int i2) {
        Typeface typefaceM5914g;
        if (context != null) {
            return (Build.VERSION.SDK_INT >= 21 || (typefaceM5914g = m5914g(context, typeface, i2)) == null) ? Typeface.create(typeface, i2) : typefaceM5914g;
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    /* renamed from: b */
    public static Typeface m5909b(Context context, CancellationSignal cancellationSignal, C0943f.b[] bVarArr, int i2) {
        return f6291a.mo5924c(context, cancellationSignal, bVarArr, i2);
    }

    /* renamed from: c */
    public static Typeface m5910c(Context context, C0260c.a aVar, Resources resources, int i2, int i3, C0263f.c cVar, Handler handler, boolean z) throws NoSuchFieldException {
        Typeface typefaceMo5923b;
        if (aVar instanceof C0260c.d) {
            C0260c.d dVar = (C0260c.d) aVar;
            Typeface typefaceM5915h = m5915h(dVar.m1739c());
            if (typefaceM5915h != null) {
                if (cVar != null) {
                    cVar.m1762b(typefaceM5915h, handler);
                }
                return typefaceM5915h;
            }
            typefaceMo5923b = C0943f.m5996a(context, dVar.m1738b(), i3, !z ? cVar != null : dVar.m1737a() != 0, z ? dVar.m1740d() : -1, C0263f.c.m1760c(handler), new a(cVar));
        } else {
            typefaceMo5923b = f6291a.mo5923b(context, (C0260c.b) aVar, resources, i3);
            if (cVar != null) {
                if (typefaceMo5923b != null) {
                    cVar.m1762b(typefaceMo5923b, handler);
                } else {
                    cVar.m1761a(-3, handler);
                }
            }
        }
        if (typefaceMo5923b != null) {
            f6292b.m5451d(m5912e(resources, i2, i3), typefaceMo5923b);
        }
        return typefaceMo5923b;
    }

    /* renamed from: d */
    public static Typeface m5911d(Context context, Resources resources, int i2, String str, int i3) {
        Typeface typefaceMo5936e = f6291a.mo5936e(context, resources, i2, str, i3);
        if (typefaceMo5936e != null) {
            f6292b.m5451d(m5912e(resources, i2, i3), typefaceMo5936e);
        }
        return typefaceMo5936e;
    }

    /* renamed from: e */
    private static String m5912e(Resources resources, int i2, int i3) {
        return resources.getResourcePackageName(i2) + "-" + i2 + "-" + i3;
    }

    /* renamed from: f */
    public static Typeface m5913f(Resources resources, int i2, int i3) {
        return f6292b.m5450c(m5912e(resources, i2, i3));
    }

    /* renamed from: g */
    private static Typeface m5914g(Context context, Typeface typeface, int i2) throws NoSuchFieldException {
        C0932j c0932j = f6291a;
        C0260c.b bVarM5950i = c0932j.m5950i(typeface);
        if (bVarM5950i == null) {
            return null;
        }
        return c0932j.mo5923b(context, bVarM5950i, context.getResources(), i2);
    }

    /* renamed from: h */
    private static Typeface m5915h(String str) {
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
