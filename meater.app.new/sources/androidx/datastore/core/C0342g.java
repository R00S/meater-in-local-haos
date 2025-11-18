package androidx.datastore.core;

import kotlin.jvm.internal.C9801m;

/* compiled from: SingleProcessDataStore.kt */
/* renamed from: androidx.datastore.core.g */
/* loaded from: classes.dex */
final class C0342g<T> extends AbstractC0348m<T> {

    /* renamed from: a */
    private final Throwable f2545a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0342g(Throwable th) {
        super(null);
        C9801m.m32346f(th, "finalException");
        this.f2545a = th;
    }

    /* renamed from: a */
    public final Throwable m2361a() {
        return this.f2545a;
    }
}
