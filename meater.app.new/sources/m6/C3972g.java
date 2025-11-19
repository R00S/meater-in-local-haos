package m6;

import java.security.MessageDigest;
import s.C4391a;

/* compiled from: Options.java */
/* renamed from: m6.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3972g implements InterfaceC3970e {

    /* renamed from: b, reason: collision with root package name */
    private final C4391a<C3971f<?>, Object> f45123b = new H6.b();

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void g(C3971f<T> c3971f, Object obj, MessageDigest messageDigest) {
        c3971f.g(obj, messageDigest);
    }

    @Override // m6.InterfaceC3970e
    public void b(MessageDigest messageDigest) {
        for (int i10 = 0; i10 < this.f45123b.getSize(); i10++) {
            g(this.f45123b.h(i10), this.f45123b.l(i10), messageDigest);
        }
    }

    public <T> T c(C3971f<T> c3971f) {
        return this.f45123b.containsKey(c3971f) ? (T) this.f45123b.get(c3971f) : c3971f.c();
    }

    public void d(C3972g c3972g) {
        this.f45123b.i(c3972g.f45123b);
    }

    public C3972g e(C3971f<?> c3971f) {
        this.f45123b.remove(c3971f);
        return this;
    }

    @Override // m6.InterfaceC3970e
    public boolean equals(Object obj) {
        if (obj instanceof C3972g) {
            return this.f45123b.equals(((C3972g) obj).f45123b);
        }
        return false;
    }

    public <T> C3972g f(C3971f<T> c3971f, T t10) {
        this.f45123b.put(c3971f, t10);
        return this;
    }

    @Override // m6.InterfaceC3970e
    public int hashCode() {
        return this.f45123b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f45123b + '}';
    }
}
