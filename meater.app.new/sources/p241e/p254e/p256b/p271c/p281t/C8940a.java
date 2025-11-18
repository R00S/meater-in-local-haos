package p241e.p254e.p256b.p271c.p281t;

import android.content.Context;
import android.graphics.Color;
import p024c.p052i.p053e.C0923a;
import p241e.p254e.p256b.p271c.C8908b;
import p241e.p254e.p256b.p271c.p278q.C8937a;
import p241e.p254e.p256b.p271c.p285x.C8946b;

/* compiled from: ElevationOverlayProvider.java */
/* renamed from: e.e.b.c.t.a */
/* loaded from: classes2.dex */
public class C8940a {

    /* renamed from: a */
    private final boolean f34412a;

    /* renamed from: b */
    private final int f34413b;

    /* renamed from: c */
    private final int f34414c;

    /* renamed from: d */
    private final float f34415d;

    public C8940a(Context context) {
        this.f34412a = C8946b.m28496b(context, C8908b.f33828r, false);
        this.f34413b = C8937a.m28470a(context, C8908b.f33827q, 0);
        this.f34414c = C8937a.m28470a(context, C8908b.f33825o, 0);
        this.f34415d = context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: e */
    private boolean m28478e(int i2) {
        return C0923a.m5887o(i2, 255) == this.f34414c;
    }

    /* renamed from: a */
    public float m28479a(float f2) {
        if (this.f34415d <= 0.0f || f2 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f2 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    /* renamed from: b */
    public int m28480b(int i2, float f2) {
        float fM28479a = m28479a(f2);
        return C0923a.m5887o(C8937a.m28475f(C0923a.m5887o(i2, 255), this.f34413b, fM28479a), Color.alpha(i2));
    }

    /* renamed from: c */
    public int m28481c(int i2, float f2) {
        return (this.f34412a && m28478e(i2)) ? m28480b(i2, f2) : i2;
    }

    /* renamed from: d */
    public boolean m28482d() {
        return this.f34412a;
    }
}
