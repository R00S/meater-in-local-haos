package androidx.concurrent.futures;

/* compiled from: ResolvableFuture.java */
/* loaded from: classes.dex */
public final class d<V> extends a<V> {
    private d() {
    }

    public static <V> d<V> H() {
        return new d<>();
    }

    @Override // androidx.concurrent.futures.a
    public boolean D(V v10) {
        return super.D(v10);
    }

    @Override // androidx.concurrent.futures.a
    public boolean E(Throwable th) {
        return super.E(th);
    }
}
