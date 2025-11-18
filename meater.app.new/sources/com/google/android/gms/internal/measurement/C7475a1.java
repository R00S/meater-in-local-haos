package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.a1 */
/* loaded from: classes.dex */
final class C7475a1<T> implements zzcz<T>, Serializable {

    /* renamed from: f */
    private final zzcz<T> f27685f;

    /* renamed from: g */
    private volatile transient boolean f27686g;

    /* renamed from: h */
    @NullableDecl
    private transient T f27687h;

    C7475a1(zzcz<T> zzczVar) {
        this.f27685f = (zzcz) zzcx.m22126a(zzczVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcz
    /* renamed from: a */
    public final T mo20970a() {
        if (!this.f27686g) {
            synchronized (this) {
                if (!this.f27686g) {
                    T tMo20970a = this.f27685f.mo20970a();
                    this.f27687h = tMo20970a;
                    this.f27686g = true;
                    return tMo20970a;
                }
            }
        }
        return this.f27687h;
    }

    public final String toString() {
        Object string;
        if (this.f27686g) {
            String strValueOf = String.valueOf(this.f27687h);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(strValueOf);
            sb.append(">");
            string = sb.toString();
        } else {
            string = this.f27685f;
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(strValueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
