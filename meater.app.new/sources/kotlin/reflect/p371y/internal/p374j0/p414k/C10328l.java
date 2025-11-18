package kotlin.reflect.p371y.internal.p374j0.p414k;

/* compiled from: SingleThreadValue.java */
/* renamed from: kotlin.f0.y.e.j0.k.l */
/* loaded from: classes3.dex */
class C10328l<T> {

    /* renamed from: a */
    private final T f40035a;

    /* renamed from: b */
    private final Thread f40036b = Thread.currentThread();

    C10328l(T t) {
        this.f40035a = t;
    }

    /* renamed from: a */
    public T m36553a() {
        if (m36554b()) {
            return this.f40035a;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }

    /* renamed from: b */
    public boolean m36554b() {
        return this.f40036b == Thread.currentThread();
    }
}
