package com.google.protobuf;

/* compiled from: LazyFieldLite.java */
/* loaded from: classes2.dex */
public class C {

    /* renamed from: e, reason: collision with root package name */
    private static final C2954n f39150e = C2954n.b();

    /* renamed from: a, reason: collision with root package name */
    private AbstractC2947g f39151a;

    /* renamed from: b, reason: collision with root package name */
    private C2954n f39152b;

    /* renamed from: c, reason: collision with root package name */
    protected volatile P f39153c;

    /* renamed from: d, reason: collision with root package name */
    private volatile AbstractC2947g f39154d;

    protected void a(P p10) {
        if (this.f39153c != null) {
            return;
        }
        synchronized (this) {
            if (this.f39153c != null) {
                return;
            }
            try {
                if (this.f39151a != null) {
                    this.f39153c = p10.h().a(this.f39151a, this.f39152b);
                    this.f39154d = this.f39151a;
                } else {
                    this.f39153c = p10;
                    this.f39154d = AbstractC2947g.f39238C;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.f39153c = p10;
                this.f39154d = AbstractC2947g.f39238C;
            }
        }
    }

    public int b() {
        if (this.f39154d != null) {
            return this.f39154d.size();
        }
        AbstractC2947g abstractC2947g = this.f39151a;
        if (abstractC2947g != null) {
            return abstractC2947g.size();
        }
        if (this.f39153c != null) {
            return this.f39153c.f();
        }
        return 0;
    }

    public P c(P p10) {
        a(p10);
        return this.f39153c;
    }

    public P d(P p10) {
        P p11 = this.f39153c;
        this.f39151a = null;
        this.f39154d = null;
        this.f39153c = p10;
        return p11;
    }

    public AbstractC2947g e() {
        if (this.f39154d != null) {
            return this.f39154d;
        }
        AbstractC2947g abstractC2947g = this.f39151a;
        if (abstractC2947g != null) {
            return abstractC2947g;
        }
        synchronized (this) {
            try {
                if (this.f39154d != null) {
                    return this.f39154d;
                }
                if (this.f39153c == null) {
                    this.f39154d = AbstractC2947g.f39238C;
                } else {
                    this.f39154d = this.f39153c.i();
                }
                return this.f39154d;
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
        P p10 = this.f39153c;
        P p11 = c10.f39153c;
        return (p10 == null && p11 == null) ? e().equals(c10.e()) : (p10 == null || p11 == null) ? p10 != null ? p10.equals(c10.c(p10.c())) : c(p11.c()).equals(p11) : p10.equals(p11);
    }

    public int hashCode() {
        return 1;
    }
}
