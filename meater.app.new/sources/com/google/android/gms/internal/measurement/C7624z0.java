package com.google.android.gms.internal.measurement;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.z0 */
/* loaded from: classes.dex */
final class C7624z0<T> extends zzcy<T> {

    /* renamed from: f */
    private final T f27943f;

    C7624z0(T t) {
        this.f27943f = t;
    }

    @Override // com.google.android.gms.internal.measurement.zzcy
    /* renamed from: b */
    public final boolean mo21475b() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzcy
    /* renamed from: c */
    public final T mo21476c() {
        return this.f27943f;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof C7624z0) {
            return this.f27943f.equals(((C7624z0) obj).f27943f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27943f.hashCode() + 1502476572;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f27943f);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
