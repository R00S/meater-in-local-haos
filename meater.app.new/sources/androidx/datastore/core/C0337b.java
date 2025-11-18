package androidx.datastore.core;

/* compiled from: SingleProcessDataStore.kt */
/* renamed from: androidx.datastore.core.b */
/* loaded from: classes.dex */
final class C0337b<T> extends AbstractC0348m<T> {

    /* renamed from: a */
    private final T f2524a;

    /* renamed from: b */
    private final int f2525b;

    public C0337b(T t, int i2) {
        super(null);
        this.f2524a = t;
        this.f2525b = i2;
    }

    /* renamed from: a */
    public final void m2347a() {
        T t = this.f2524a;
        if (!((t != null ? t.hashCode() : 0) == this.f2525b)) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
        }
    }

    /* renamed from: b */
    public final T m2348b() {
        return this.f2524a;
    }
}
