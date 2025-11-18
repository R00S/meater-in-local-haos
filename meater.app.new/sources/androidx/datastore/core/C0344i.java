package androidx.datastore.core;

import kotlin.jvm.internal.C9801m;

/* compiled from: SingleProcessDataStore.kt */
/* renamed from: androidx.datastore.core.i */
/* loaded from: classes.dex */
final class C0344i<T> extends AbstractC0348m<T> {

    /* renamed from: a */
    private final Throwable f2546a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0344i(Throwable th) {
        super(null);
        C9801m.m32346f(th, "readException");
        this.f2546a = th;
    }

    /* renamed from: a */
    public final Throwable m2363a() {
        return this.f2546a;
    }
}
