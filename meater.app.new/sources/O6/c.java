package O6;

/* compiled from: InstanceFactory.java */
/* loaded from: classes2.dex */
public final class c<T> implements b<T> {

    /* renamed from: b, reason: collision with root package name */
    private static final c<Object> f13289b = new c<>(null);

    /* renamed from: a, reason: collision with root package name */
    private final T f13290a;

    private c(T t10) {
        this.f13290a = t10;
    }

    public static <T> b<T> a(T t10) {
        return new c(d.c(t10, "instance cannot be null"));
    }

    @Override // ma.InterfaceC4015a
    public T get() {
        return this.f13290a;
    }
}
