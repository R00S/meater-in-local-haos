package p024c.p044g.p048b;

/* compiled from: Pools.java */
/* renamed from: c.g.b.g */
/* loaded from: classes.dex */
class C0884g<T> implements InterfaceC0883f<T> {

    /* renamed from: a */
    private final Object[] f5843a;

    /* renamed from: b */
    private int f5844b;

    C0884g(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f5843a = new Object[i2];
    }

    @Override // p024c.p044g.p048b.InterfaceC0883f
    /* renamed from: a */
    public boolean mo5586a(T t) {
        int i2 = this.f5844b;
        Object[] objArr = this.f5843a;
        if (i2 >= objArr.length) {
            return false;
        }
        objArr[i2] = t;
        this.f5844b = i2 + 1;
        return true;
    }

    @Override // p024c.p044g.p048b.InterfaceC0883f
    /* renamed from: b */
    public T mo5587b() {
        int i2 = this.f5844b;
        if (i2 <= 0) {
            return null;
        }
        int i3 = i2 - 1;
        Object[] objArr = this.f5843a;
        T t = (T) objArr[i3];
        objArr[i3] = null;
        this.f5844b = i2 - 1;
        return t;
    }

    @Override // p024c.p044g.p048b.InterfaceC0883f
    /* renamed from: c */
    public void mo5588c(T[] tArr, int i2) {
        if (i2 > tArr.length) {
            i2 = tArr.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            T t = tArr[i3];
            int i4 = this.f5844b;
            Object[] objArr = this.f5843a;
            if (i4 < objArr.length) {
                objArr[i4] = t;
                this.f5844b = i4 + 1;
            }
        }
    }
}
