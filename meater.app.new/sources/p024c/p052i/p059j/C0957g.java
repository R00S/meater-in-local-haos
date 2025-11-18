package p024c.p052i.p059j;

/* compiled from: Pools.java */
/* renamed from: c.i.j.g */
/* loaded from: classes.dex */
public class C0957g<T> implements InterfaceC0956f<T> {

    /* renamed from: a */
    private final Object[] f6407a;

    /* renamed from: b */
    private int f6408b;

    public C0957g(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f6407a = new Object[i2];
    }

    /* renamed from: c */
    private boolean m6062c(T t) {
        for (int i2 = 0; i2 < this.f6408b; i2++) {
            if (this.f6407a[i2] == t) {
                return true;
            }
        }
        return false;
    }

    @Override // p024c.p052i.p059j.InterfaceC0956f
    /* renamed from: a */
    public boolean mo6060a(T t) {
        if (m6062c(t)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i2 = this.f6408b;
        Object[] objArr = this.f6407a;
        if (i2 >= objArr.length) {
            return false;
        }
        objArr[i2] = t;
        this.f6408b = i2 + 1;
        return true;
    }

    @Override // p024c.p052i.p059j.InterfaceC0956f
    /* renamed from: b */
    public T mo6061b() {
        int i2 = this.f6408b;
        if (i2 <= 0) {
            return null;
        }
        int i3 = i2 - 1;
        Object[] objArr = this.f6407a;
        T t = (T) objArr[i3];
        objArr[i3] = null;
        this.f6408b = i2 - 1;
        return t;
    }
}
