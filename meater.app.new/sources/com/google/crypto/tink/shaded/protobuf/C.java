package com.google.crypto.tink.shaded.protobuf;

/* compiled from: LazyFieldLite.java */
/* loaded from: classes2.dex */
public class C {

    /* renamed from: e, reason: collision with root package name */
    private static final C2905o f37717e = C2905o.b();

    /* renamed from: a, reason: collision with root package name */
    private AbstractC2898h f37718a;

    /* renamed from: b, reason: collision with root package name */
    private C2905o f37719b;

    /* renamed from: c, reason: collision with root package name */
    protected volatile P f37720c;

    /* renamed from: d, reason: collision with root package name */
    private volatile AbstractC2898h f37721d;

    protected void a(P p10) {
        if (this.f37720c != null) {
            return;
        }
        synchronized (this) {
            if (this.f37720c != null) {
                return;
            }
            try {
                if (this.f37718a != null) {
                    this.f37720c = p10.h().a(this.f37718a, this.f37719b);
                    this.f37721d = this.f37718a;
                } else {
                    this.f37720c = p10;
                    this.f37721d = AbstractC2898h.f37801C;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.f37720c = p10;
                this.f37721d = AbstractC2898h.f37801C;
            }
        }
    }

    public int b() {
        if (this.f37721d != null) {
            return this.f37721d.size();
        }
        AbstractC2898h abstractC2898h = this.f37718a;
        if (abstractC2898h != null) {
            return abstractC2898h.size();
        }
        if (this.f37720c != null) {
            return this.f37720c.f();
        }
        return 0;
    }

    public P c(P p10) {
        a(p10);
        return this.f37720c;
    }

    public P d(P p10) {
        P p11 = this.f37720c;
        this.f37718a = null;
        this.f37721d = null;
        this.f37720c = p10;
        return p11;
    }

    public AbstractC2898h e() {
        if (this.f37721d != null) {
            return this.f37721d;
        }
        AbstractC2898h abstractC2898h = this.f37718a;
        if (abstractC2898h != null) {
            return abstractC2898h;
        }
        synchronized (this) {
            try {
                if (this.f37721d != null) {
                    return this.f37721d;
                }
                if (this.f37720c == null) {
                    this.f37721d = AbstractC2898h.f37801C;
                } else {
                    this.f37721d = this.f37720c.i();
                }
                return this.f37721d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        P p10 = this.f37720c;
        P p11 = c10.f37720c;
        return (p10 == null && p11 == null) ? e().equals(c10.e()) : (p10 == null || p11 == null) ? p10 != null ? p10.equals(c10.c(p10.c())) : c(p11.c()).equals(p11) : p10.equals(p11);
    }

    public int hashCode() {
        return 1;
    }
}
