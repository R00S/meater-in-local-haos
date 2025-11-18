package p024c.p052i.p059j;

/* compiled from: Pools.java */
/* renamed from: c.i.j.h */
/* loaded from: classes.dex */
public class C0958h<T> extends C0957g<T> {

    /* renamed from: c */
    private final Object f6409c;

    public C0958h(int i2) {
        super(i2);
        this.f6409c = new Object();
    }

    @Override // p024c.p052i.p059j.C0957g, p024c.p052i.p059j.InterfaceC0956f
    /* renamed from: a */
    public boolean mo6060a(T t) {
        boolean zMo6060a;
        synchronized (this.f6409c) {
            zMo6060a = super.mo6060a(t);
        }
        return zMo6060a;
    }

    @Override // p024c.p052i.p059j.C0957g, p024c.p052i.p059j.InterfaceC0956f
    /* renamed from: b */
    public T mo6061b() {
        T t;
        synchronized (this.f6409c) {
            t = (T) super.mo6061b();
        }
        return t;
    }
}
