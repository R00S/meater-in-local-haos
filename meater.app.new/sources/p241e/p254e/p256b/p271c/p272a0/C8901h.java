package p241e.p254e.p256b.p271c.p272a0;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.C8033k;

/* compiled from: MaterialShapeUtils.java */
/* renamed from: e.e.b.c.a0.h */
/* loaded from: classes2.dex */
public class C8901h {
    /* renamed from: a */
    static C8897d m28307a(int i2) {
        return i2 != 0 ? i2 != 1 ? m28308b() : new C8898e() : new C8903j();
    }

    /* renamed from: b */
    static C8897d m28308b() {
        return new C8903j();
    }

    /* renamed from: c */
    static C8899f m28309c() {
        return new C8899f();
    }

    /* renamed from: d */
    public static void m28310d(View view, float f2) {
        Drawable background = view.getBackground();
        if (background instanceof C8900g) {
            ((C8900g) background).m28283W(f2);
        }
    }

    /* renamed from: e */
    public static void m28311e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C8900g) {
            m28312f(view, (C8900g) background);
        }
    }

    /* renamed from: f */
    public static void m28312f(View view, C8900g c8900g) {
        if (c8900g.m28279P()) {
            c8900g.m28287a0(C8033k.m24698c(view));
        }
    }
}
