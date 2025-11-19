package q2;

import U1.K;
import X1.C1804a;
import X1.L;
import d2.G;

/* compiled from: TrackSelectorResult.java */
/* renamed from: q2.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4271D {

    /* renamed from: a, reason: collision with root package name */
    public final int f47805a;

    /* renamed from: b, reason: collision with root package name */
    public final G[] f47806b;

    /* renamed from: c, reason: collision with root package name */
    public final x[] f47807c;

    /* renamed from: d, reason: collision with root package name */
    public final K f47808d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f47809e;

    public C4271D(G[] gArr, x[] xVarArr, K k10, Object obj) {
        C1804a.a(gArr.length == xVarArr.length);
        this.f47806b = gArr;
        this.f47807c = (x[]) xVarArr.clone();
        this.f47808d = k10;
        this.f47809e = obj;
        this.f47805a = gArr.length;
    }

    public boolean a(C4271D c4271d) {
        if (c4271d == null || c4271d.f47807c.length != this.f47807c.length) {
            return false;
        }
        for (int i10 = 0; i10 < this.f47807c.length; i10++) {
            if (!b(c4271d, i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(C4271D c4271d, int i10) {
        return c4271d != null && L.d(this.f47806b[i10], c4271d.f47806b[i10]) && L.d(this.f47807c[i10], c4271d.f47807c[i10]);
    }

    public boolean c(int i10) {
        return this.f47806b[i10] != null;
    }
}
