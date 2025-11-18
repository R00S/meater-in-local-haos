package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzbj;
import com.google.android.gms.internal.measurement.zzbr;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.v7 */
/* loaded from: classes2.dex */
final class C7847v7 extends AbstractC7856w7 {

    /* renamed from: g */
    private zzbj.zze f28964g;

    /* renamed from: h */
    private final /* synthetic */ C7802q7 f28965h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7847v7(C7802q7 c7802q7, String str, int i2, zzbj.zze zzeVar) {
        super(str, i2);
        this.f28965h = c7802q7;
        this.f28964g = zzeVar;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC7856w7
    /* renamed from: a */
    final int mo22852a() {
        return this.f28964g.m21572E();
    }

    /* renamed from: i */
    final boolean m22863i(Long l, zzbr.zzk zzkVar, boolean z) throws IllegalStateException {
        boolean zM23593y = this.f28965h.mo22841n().m23593y(this.f28979a, zzap.f29176w0);
        boolean zM23593y2 = this.f28965h.mo22841n().m23593y(this.f28979a, zzap.f29086C0);
        boolean zM21575H = this.f28964g.m21575H();
        boolean zM21576I = this.f28964g.m21576I();
        boolean z2 = zM23593y && this.f28964g.m21578K();
        boolean z3 = zM21575H || zM21576I || z2;
        Boolean boolM22866d = null;
        boolM22866d = null;
        boolM22866d = null;
        boolM22866d = null;
        boolM22866d = null;
        if (z && !z3) {
            this.f28965h.mo22836h().m23145P().m23149c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f28980b), this.f28964g.m21571D() ? Integer.valueOf(this.f28964g.m21572E()) : null);
            return true;
        }
        zzbj.zzc zzcVarM21574G = this.f28964g.m21574G();
        boolean zM21549I = zzcVarM21574G.m21549I();
        if (zzkVar.m22072T()) {
            if (zzcVarM21574G.m21546F()) {
                boolM22866d = AbstractC7856w7.m22866d(AbstractC7856w7.m22865c(zzkVar.m22073U(), zzcVarM21574G.m21547G()), zM21549I);
            } else {
                this.f28965h.mo22836h().m23140K().m23148b("No number filter for long property. property", this.f28965h.mo22838k().m23120B(zzkVar.m22069P()));
            }
        } else if (zzkVar.m22074V()) {
            if (zzcVarM21574G.m21546F()) {
                boolM22866d = AbstractC7856w7.m22866d(AbstractC7856w7.m22864b(zzkVar.m22075W(), zzcVarM21574G.m21547G()), zM21549I);
            } else {
                this.f28965h.mo22836h().m23140K().m23148b("No number filter for double property. property", this.f28965h.mo22838k().m23120B(zzkVar.m22069P()));
            }
        } else if (!zzkVar.m22070R()) {
            this.f28965h.mo22836h().m23140K().m23148b("User property has no value, property", this.f28965h.mo22838k().m23120B(zzkVar.m22069P()));
        } else if (zzcVarM21574G.m21544D()) {
            boolM22866d = AbstractC7856w7.m22866d(AbstractC7856w7.m22869g(zzkVar.m22071S(), zzcVarM21574G.m21545E(), this.f28965h.mo22836h()), zM21549I);
        } else if (!zzcVarM21574G.m21546F()) {
            this.f28965h.mo22836h().m23140K().m23148b("No string or number filter defined. property", this.f28965h.mo22838k().m23120B(zzkVar.m22069P()));
        } else if (zzkg.m23476S(zzkVar.m22071S())) {
            boolM22866d = AbstractC7856w7.m22866d(AbstractC7856w7.m22867e(zzkVar.m22071S(), zzcVarM21574G.m21547G()), zM21549I);
        } else {
            this.f28965h.mo22836h().m23140K().m23149c("Invalid user property value for Numeric number filter. property, value", this.f28965h.mo22838k().m23120B(zzkVar.m22069P()), zzkVar.m22071S());
        }
        this.f28965h.mo22836h().m23145P().m23148b("Property filter result", boolM22866d == null ? "null" : boolM22866d);
        if (boolM22866d == null) {
            return false;
        }
        this.f28981c = Boolean.TRUE;
        if (zM23593y && z2 && !boolM22866d.booleanValue()) {
            return true;
        }
        if (!z || this.f28964g.m21575H()) {
            this.f28982d = boolM22866d;
        }
        if (boolM22866d.booleanValue() && z3 && zzkVar.m22067I()) {
            long jM22068J = zzkVar.m22068J();
            if (zM23593y2 && l != null) {
                jM22068J = l.longValue();
            }
            if (zM21576I) {
                this.f28984f = Long.valueOf(jM22068J);
            } else {
                this.f28983e = Long.valueOf(jM22068J);
            }
        }
        return true;
    }
}
