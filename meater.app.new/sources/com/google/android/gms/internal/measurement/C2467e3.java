package com.google.android.gms.internal.measurement;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.e3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2467e3 extends E3 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f34102a;

    /* renamed from: b, reason: collision with root package name */
    private final l8.s<l8.l<InterfaceC2563q3>> f34103b;

    C2467e3(Context context, l8.s<l8.l<InterfaceC2563q3>> sVar) {
        if (context == null) {
            throw new NullPointerException("Null context");
        }
        this.f34102a = context;
        this.f34103b = sVar;
    }

    @Override // com.google.android.gms.internal.measurement.E3
    final Context a() {
        return this.f34102a;
    }

    @Override // com.google.android.gms.internal.measurement.E3
    final l8.s<l8.l<InterfaceC2563q3>> b() {
        return this.f34103b;
    }

    public final boolean equals(Object obj) {
        l8.s<l8.l<InterfaceC2563q3>> sVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof E3) {
            E3 e32 = (E3) obj;
            if (this.f34102a.equals(e32.a()) && ((sVar = this.f34103b) != null ? sVar.equals(e32.b()) : e32.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f34102a.hashCode() ^ 1000003) * 1000003;
        l8.s<l8.l<InterfaceC2563q3>> sVar = this.f34103b;
        return iHashCode ^ (sVar == null ? 0 : sVar.hashCode());
    }

    public final String toString() {
        return "FlagsContext{context=" + String.valueOf(this.f34102a) + ", hermeticFileOverrides=" + String.valueOf(this.f34103b) + "}";
    }
}
