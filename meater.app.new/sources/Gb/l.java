package Gb;

/* compiled from: SingleThreadValue.java */
/* loaded from: classes3.dex */
class l<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f5025a;

    /* renamed from: b, reason: collision with root package name */
    private final Thread f5026b = Thread.currentThread();

    l(T t10) {
        this.f5025a = t10;
    }

    public T a() {
        if (b()) {
            return this.f5025a;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }

    public boolean b() {
        return this.f5026b == Thread.currentThread();
    }
}
