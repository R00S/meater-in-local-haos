package d2;

import X1.C1804a;

/* compiled from: DecoderReuseEvaluation.java */
/* renamed from: d2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3031c {

    /* renamed from: a, reason: collision with root package name */
    public final String f39703a;

    /* renamed from: b, reason: collision with root package name */
    public final U1.s f39704b;

    /* renamed from: c, reason: collision with root package name */
    public final U1.s f39705c;

    /* renamed from: d, reason: collision with root package name */
    public final int f39706d;

    /* renamed from: e, reason: collision with root package name */
    public final int f39707e;

    public C3031c(String str, U1.s sVar, U1.s sVar2, int i10, int i11) {
        C1804a.a(i10 == 0 || i11 == 0);
        this.f39703a = C1804a.d(str);
        this.f39704b = (U1.s) C1804a.e(sVar);
        this.f39705c = (U1.s) C1804a.e(sVar2);
        this.f39706d = i10;
        this.f39707e = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3031c.class != obj.getClass()) {
            return false;
        }
        C3031c c3031c = (C3031c) obj;
        return this.f39706d == c3031c.f39706d && this.f39707e == c3031c.f39707e && this.f39703a.equals(c3031c.f39703a) && this.f39704b.equals(c3031c.f39704b) && this.f39705c.equals(c3031c.f39705c);
    }

    public int hashCode() {
        return ((((((((527 + this.f39706d) * 31) + this.f39707e) * 31) + this.f39703a.hashCode()) * 31) + this.f39704b.hashCode()) * 31) + this.f39705c.hashCode();
    }
}
