package u6;

import H6.k;
import o6.InterfaceC4139c;

/* compiled from: SimpleResource.java */
/* renamed from: u6.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4683i<T> implements InterfaceC4139c<T> {

    /* renamed from: B, reason: collision with root package name */
    protected final T f50495B;

    public C4683i(T t10) {
        this.f50495B = (T) k.d(t10);
    }

    @Override // o6.InterfaceC4139c
    public final int a() {
        return 1;
    }

    @Override // o6.InterfaceC4139c
    public Class<T> d() {
        return (Class<T>) this.f50495B.getClass();
    }

    @Override // o6.InterfaceC4139c
    public final T get() {
        return this.f50495B;
    }

    @Override // o6.InterfaceC4139c
    public void c() {
    }
}
