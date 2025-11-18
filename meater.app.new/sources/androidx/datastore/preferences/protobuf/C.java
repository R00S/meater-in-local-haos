package androidx.datastore.preferences.protobuf;

/* compiled from: LazyFieldLite.java */
/* loaded from: classes.dex */
public class C {

    /* renamed from: e, reason: collision with root package name */
    private static final C2069o f24827e = C2069o.b();

    /* renamed from: a, reason: collision with root package name */
    private AbstractC2062h f24828a;

    /* renamed from: b, reason: collision with root package name */
    private C2069o f24829b;

    /* renamed from: c, reason: collision with root package name */
    protected volatile P f24830c;

    /* renamed from: d, reason: collision with root package name */
    private volatile AbstractC2062h f24831d;

    protected void a(P p10) {
        if (this.f24830c != null) {
            return;
        }
        synchronized (this) {
            if (this.f24830c != null) {
                return;
            }
            try {
                if (this.f24828a != null) {
                    this.f24830c = p10.h().a(this.f24828a, this.f24829b);
                    this.f24831d = this.f24828a;
                } else {
                    this.f24830c = p10;
                    this.f24831d = AbstractC2062h.f24923C;
                }
            } catch (InvalidProtocolBufferException unused) {
                this.f24830c = p10;
                this.f24831d = AbstractC2062h.f24923C;
            }
        }
    }

    public int b() {
        if (this.f24831d != null) {
            return this.f24831d.size();
        }
        AbstractC2062h abstractC2062h = this.f24828a;
        if (abstractC2062h != null) {
            return abstractC2062h.size();
        }
        if (this.f24830c != null) {
            return this.f24830c.f();
        }
        return 0;
    }

    public P c(P p10) {
        a(p10);
        return this.f24830c;
    }

    public P d(P p10) {
        P p11 = this.f24830c;
        this.f24828a = null;
        this.f24831d = null;
        this.f24830c = p10;
        return p11;
    }

    public AbstractC2062h e() {
        if (this.f24831d != null) {
            return this.f24831d;
        }
        AbstractC2062h abstractC2062h = this.f24828a;
        if (abstractC2062h != null) {
            return abstractC2062h;
        }
        synchronized (this) {
            try {
                if (this.f24831d != null) {
                    return this.f24831d;
                }
                if (this.f24830c == null) {
                    this.f24831d = AbstractC2062h.f24923C;
                } else {
                    this.f24831d = this.f24830c.i();
                }
                return this.f24831d;
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
        P p10 = this.f24830c;
        P p11 = c10.f24830c;
        return (p10 == null && p11 == null) ? e().equals(c10.e()) : (p10 == null || p11 == null) ? p10 != null ? p10.equals(c10.c(p10.c())) : c(p11.c()).equals(p11) : p10.equals(p11);
    }

    public int hashCode() {
        return 1;
    }
}
