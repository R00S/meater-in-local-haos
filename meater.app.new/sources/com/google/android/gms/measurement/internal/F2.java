package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.w7;
import com.google.android.gms.internal.measurement.z7;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* loaded from: classes2.dex */
final class F2 implements z7 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C2 f34840a;

    F2(C2 c22) {
        this.f34840a = c22;
    }

    @Override // com.google.android.gms.internal.measurement.z7
    public final void a(w7 w7Var, String str, List<String> list, boolean z10, boolean z11) {
        int i10 = H2.f34863a[w7Var.ordinal()];
        C2766i2 c2766i2K = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? this.f34840a.k().K() : this.f34840a.k().L() : z10 ? this.f34840a.k().O() : !z11 ? this.f34840a.k().N() : this.f34840a.k().M() : z10 ? this.f34840a.k().J() : !z11 ? this.f34840a.k().I() : this.f34840a.k().H() : this.f34840a.k().G();
        int size = list.size();
        if (size == 1) {
            c2766i2K.b(str, list.get(0));
            return;
        }
        if (size == 2) {
            c2766i2K.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            c2766i2K.a(str);
        } else {
            c2766i2K.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
