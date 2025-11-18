package com.airbnb.lottie.p117u;

import android.graphics.PointF;
import android.util.JsonReader;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.view.p005e0.C0295b;
import com.airbnb.lottie.C5180d;
import com.airbnb.lottie.p118v.C5319e;
import com.airbnb.lottie.p118v.C5320f;
import com.airbnb.lottie.p119w.C5321a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import p024c.p041e.C0874h;

/* compiled from: KeyframeParser.java */
/* renamed from: com.airbnb.lottie.u.q */
/* loaded from: classes.dex */
class C5305q {

    /* renamed from: a */
    private static final Interpolator f12908a = new LinearInterpolator();

    /* renamed from: b */
    private static C0874h<WeakReference<Interpolator>> f12909b;

    C5305q() {
    }

    /* renamed from: a */
    private static WeakReference<Interpolator> m9820a(int i2) {
        WeakReference<Interpolator> weakReferenceM5482g;
        synchronized (C5305q.class) {
            weakReferenceM5482g = m9824e().m5482g(i2);
        }
        return weakReferenceM5482g;
    }

    /* renamed from: b */
    static <T> C5321a<T> m9821b(JsonReader jsonReader, C5180d c5180d, float f2, InterfaceC5298j0<T> interfaceC5298j0, boolean z) throws IOException {
        return z ? m9822c(c5180d, jsonReader, f2, interfaceC5298j0) : m9823d(jsonReader, f2, interfaceC5298j0);
    }

    /* renamed from: c */
    private static <T> C5321a<T> m9822c(C5180d c5180d, JsonReader jsonReader, float f2, InterfaceC5298j0<T> interfaceC5298j0) throws IOException {
        Interpolator interpolator;
        jsonReader.beginObject();
        PointF pointFM9817e = null;
        PointF pointFM9817e2 = null;
        T tMo9781a = null;
        T tMo9781a2 = null;
        PointF pointFM9817e3 = null;
        PointF pointFM9817e4 = null;
        boolean z = false;
        float fNextDouble = 0.0f;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            switch (strNextName) {
                case "e":
                    tMo9781a2 = interfaceC5298j0.mo9781a(jsonReader, f2);
                    break;
                case "h":
                    if (jsonReader.nextInt() != 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case "i":
                    pointFM9817e2 = C5304p.m9817e(jsonReader, f2);
                    break;
                case "o":
                    pointFM9817e = C5304p.m9817e(jsonReader, f2);
                    break;
                case "s":
                    tMo9781a = interfaceC5298j0.mo9781a(jsonReader, f2);
                    break;
                case "t":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "ti":
                    pointFM9817e4 = C5304p.m9817e(jsonReader, f2);
                    break;
                case "to":
                    pointFM9817e3 = C5304p.m9817e(jsonReader, f2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z) {
            interpolator = f12908a;
            tMo9781a2 = tMo9781a;
        } else if (pointFM9817e == null || pointFM9817e2 == null) {
            interpolator = f12908a;
        } else {
            float f3 = -f2;
            pointFM9817e.x = C5319e.m9872b(pointFM9817e.x, f3, f2);
            pointFM9817e.y = C5319e.m9872b(pointFM9817e.y, -100.0f, 100.0f);
            pointFM9817e2.x = C5319e.m9872b(pointFM9817e2.x, f3, f2);
            float fM9872b = C5319e.m9872b(pointFM9817e2.y, -100.0f, 100.0f);
            pointFM9817e2.y = fM9872b;
            int iM9889g = C5320f.m9889g(pointFM9817e.x, pointFM9817e.y, pointFM9817e2.x, fM9872b);
            WeakReference<Interpolator> weakReferenceM9820a = m9820a(iM9889g);
            Interpolator interpolatorM2041a = weakReferenceM9820a != null ? weakReferenceM9820a.get() : null;
            if (weakReferenceM9820a == null || interpolatorM2041a == null) {
                interpolatorM2041a = C0295b.m2041a(pointFM9817e.x / f2, pointFM9817e.y / f2, pointFM9817e2.x / f2, pointFM9817e2.y / f2);
                try {
                    m9825f(iM9889g, new WeakReference(interpolatorM2041a));
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
            interpolator = interpolatorM2041a;
        }
        C5321a<T> c5321a = new C5321a<>(c5180d, tMo9781a, tMo9781a2, interpolator, fNextDouble, null);
        c5321a.f12939i = pointFM9817e3;
        c5321a.f12940j = pointFM9817e4;
        return c5321a;
    }

    /* renamed from: d */
    private static <T> C5321a<T> m9823d(JsonReader jsonReader, float f2, InterfaceC5298j0<T> interfaceC5298j0) throws IOException {
        return new C5321a<>(interfaceC5298j0.mo9781a(jsonReader, f2));
    }

    /* renamed from: e */
    private static C0874h<WeakReference<Interpolator>> m9824e() {
        if (f12909b == null) {
            f12909b = new C0874h<>();
        }
        return f12909b;
    }

    /* renamed from: f */
    private static void m9825f(int i2, WeakReference<Interpolator> weakReference) {
        synchronized (C5305q.class) {
            f12909b.m5486k(i2, weakReference);
        }
    }
}
