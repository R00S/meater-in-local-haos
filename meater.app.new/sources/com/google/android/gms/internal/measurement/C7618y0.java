package com.google.android.gms.internal.measurement;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.y0 */
/* loaded from: classes.dex */
final class C7618y0<T> extends zzcy<T> {

    /* renamed from: f */
    static final C7618y0<Object> f27937f = new C7618y0<>();

    private C7618y0() {
    }

    @Override // com.google.android.gms.internal.measurement.zzcy
    /* renamed from: b */
    public final boolean mo21475b() {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzcy
    /* renamed from: c */
    public final T mo21476c() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final boolean equals(@NullableDecl Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
