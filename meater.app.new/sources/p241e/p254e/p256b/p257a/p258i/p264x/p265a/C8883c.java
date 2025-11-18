package p241e.p254e.p256b.p257a.p258i.p264x.p265a;

/* compiled from: InstanceFactory.java */
/* renamed from: e.e.b.a.i.x.a.c */
/* loaded from: classes2.dex */
public final class C8883c<T> implements InterfaceC8882b<T> {

    /* renamed from: a */
    private static final C8883c<Object> f33630a = new C8883c<>(null);

    /* renamed from: b */
    private final T f33631b;

    private C8883c(T t) {
        this.f33631b = t;
    }

    /* renamed from: a */
    public static <T> InterfaceC8882b<T> m28186a(T t) {
        return new C8883c(C8884d.m28189c(t, "instance cannot be null"));
    }

    @Override // javax.inject.Provider
    public T get() {
        return this.f33631b;
    }
}
