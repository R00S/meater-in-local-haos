package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.F6;

/* compiled from: com.google.android.gms:play-services-measurement@@22.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2728d extends AbstractC2714b {

    /* renamed from: g, reason: collision with root package name */
    private com.google.android.gms.internal.measurement.T1 f35316g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ Y5 f35317h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2728d(Y5 y52, String str, int i10, com.google.android.gms.internal.measurement.T1 t12) {
        super(str, i10);
        this.f35317h = y52;
        this.f35316g = t12;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2714b
    final int a() {
        return this.f35316g.n();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2714b
    final boolean i() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2714b
    final boolean j() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final boolean k(Long l10, Long l11, com.google.android.gms.internal.measurement.B2 b22, boolean z10) {
        byte b10 = F6.a() && this.f35317h.c().K(this.f35272a, K.f35014y0);
        boolean zP = this.f35316g.P();
        boolean zQ = this.f35316g.Q();
        boolean zR = this.f35316g.R();
        byte b11 = zP || zQ || zR;
        Boolean boolD = null;
        boolD = null;
        boolD = null;
        boolD = null;
        boolD = null;
        if (z10 && b11 != true) {
            this.f35317h.k().L().c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f35273b), this.f35316g.S() ? Integer.valueOf(this.f35316g.n()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.R1 r1L = this.f35316g.L();
        boolean zQ2 = r1L.Q();
        if (b22.d0()) {
            if (r1L.S()) {
                boolD = AbstractC2714b.d(AbstractC2714b.c(b22.T(), r1L.N()), zQ2);
            } else {
                this.f35317h.k().M().b("No number filter for long property. property", this.f35317h.g().g(b22.Y()));
            }
        } else if (b22.b0()) {
            if (r1L.S()) {
                boolD = AbstractC2714b.d(AbstractC2714b.b(b22.K(), r1L.N()), zQ2);
            } else {
                this.f35317h.k().M().b("No number filter for double property. property", this.f35317h.g().g(b22.Y()));
            }
        } else if (!b22.f0()) {
            this.f35317h.k().M().b("User property has no value, property", this.f35317h.g().g(b22.Y()));
        } else if (r1L.U()) {
            boolD = AbstractC2714b.d(AbstractC2714b.g(b22.Z(), r1L.O(), this.f35317h.k()), zQ2);
        } else if (!r1L.S()) {
            this.f35317h.k().M().b("No string or number filter defined. property", this.f35317h.g().g(b22.Y()));
        } else if (N5.h0(b22.Z())) {
            boolD = AbstractC2714b.d(AbstractC2714b.e(b22.Z(), r1L.N()), zQ2);
        } else {
            this.f35317h.k().M().c("Invalid user property value for Numeric number filter. property, value", this.f35317h.g().g(b22.Y()), b22.Z());
        }
        this.f35317h.k().L().b("Property filter result", boolD == null ? "null" : boolD);
        if (boolD == null) {
            return false;
        }
        this.f35274c = Boolean.TRUE;
        if (zR && !boolD.booleanValue()) {
            return true;
        }
        if (!z10 || this.f35316g.P()) {
            this.f35275d = boolD;
        }
        if (boolD.booleanValue() && b11 != false && b22.e0()) {
            long jV = b22.V();
            if (l10 != null) {
                jV = l10.longValue();
            }
            if (b10 != false && this.f35316g.P() && !this.f35316g.Q() && l11 != null) {
                jV = l11.longValue();
            }
            if (this.f35316g.Q()) {
                this.f35277f = Long.valueOf(jV);
            } else {
                this.f35276e = Long.valueOf(jV);
            }
        }
        return true;
    }
}
