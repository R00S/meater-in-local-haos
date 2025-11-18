package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzbr;
import com.google.android.gms.internal.measurement.zzfd;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.s5 */
/* loaded from: classes2.dex */
final class C7818s5 extends AbstractC7703f7 {
    public C7818s5(zzkc zzkcVar) {
        super(zzkcVar);
    }

    /* renamed from: i */
    private static String m22850i(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC7703f7
    /* renamed from: v */
    protected final boolean mo22757v() {
        return false;
    }

    /* renamed from: w */
    public final byte[] m22851w(zzan zzanVar, String str) throws IllegalStateException {
        C7766m7 next;
        zzbr.zzg.zza zzaVar;
        C7878z3 c7878z3;
        zzbr.zzf.zza zzaVar2;
        Bundle bundle;
        byte[] bArr;
        long j2;
        C7713h c7713hM22780a;
        mo22792d();
        this.f28874a.m23239s();
        Preconditions.m14372k(zzanVar);
        Preconditions.m14368g(str);
        if (!mo22841n().m23564B(str, zzap.f29162p0)) {
            mo22836h().m23144O().m23148b("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        }
        if (!"_iap".equals(zzanVar.f29077f) && !"_iapx".equals(zzanVar.f29077f)) {
            mo22836h().m23144O().m23149c("Generating a payload for this event is not available. package_name, event_name", str, zzanVar.f29077f);
            return null;
        }
        zzbr.zzf.zza zzaVarM21749F = zzbr.zzf.m21749F();
        mo22785q().m22760w0();
        try {
            C7878z3 c7878z3M22746j0 = mo22785q().m22746j0(str);
            if (c7878z3M22746j0 == null) {
                mo22836h().m23144O().m23148b("Log and bundle not available. package_name", str);
                return new byte[0];
            }
            if (!c7878z3M22746j0.m22917e0()) {
                mo22836h().m23144O().m23148b("Log and bundle disabled. package_name", str);
                return new byte[0];
            }
            zzbr.zzg.zza zzaVarM21937I = zzbr.zzg.m21799R0().m21978w(1).m21937I("android");
            if (!TextUtils.isEmpty(c7878z3M22746j0.m22940t())) {
                zzaVarM21937I.m21969m0(c7878z3M22746j0.m22940t());
            }
            if (!TextUtils.isEmpty(c7878z3M22746j0.m22905X())) {
                zzaVarM21937I.m21965h0(c7878z3M22746j0.m22905X());
            }
            if (!TextUtils.isEmpty(c7878z3M22746j0.m22901T())) {
                zzaVarM21937I.m21973r0(c7878z3M22746j0.m22901T());
            }
            if (c7878z3M22746j0.m22903V() != -2147483648L) {
                zzaVarM21937I.m21975t0((int) c7878z3M22746j0.m22903V());
            }
            zzaVarM21937I.m21968l0(c7878z3M22746j0.m22907Z()).m21930E0(c7878z3M22746j0.m22915d0());
            if (!TextUtils.isEmpty(c7878z3M22746j0.m22882A())) {
                zzaVarM21937I.m21932F0(c7878z3M22746j0.m22882A());
            } else if (!TextUtils.isEmpty(c7878z3M22746j0.m22885D())) {
                zzaVarM21937I.m21950P0(c7878z3M22746j0.m22885D());
            }
            zzaVarM21937I.m21976u0(c7878z3M22746j0.m22911b0());
            if (this.f28874a.m23236p() && zzx.m23559X() && mo22841n().m23592x(zzaVarM21937I.m21926C0())) {
                zzaVarM21937I.m21926C0();
                if (!TextUtils.isEmpty(null)) {
                    zzaVarM21937I.m21948O0(null);
                }
            }
            Pair<String, Boolean> pairM22827v = mo22840m().m22827v(c7878z3M22746j0.m22940t());
            if (c7878z3M22746j0.m22930l() && pairM22827v != null && !TextUtils.isEmpty((CharSequence) pairM22827v.first)) {
                zzaVarM21937I.m21977v0(m22850i((String) pairM22827v.first, Long.toString(zzanVar.f29080i)));
                Object obj = pairM22827v.second;
                if (obj != null) {
                    zzaVarM21937I.m21939J(((Boolean) obj).booleanValue());
                }
            }
            mo22833e().m22807p();
            zzbr.zzg.zza zzaVarM21956V = zzaVarM21937I.m21956V(Build.MODEL);
            mo22833e().m22807p();
            zzaVarM21956V.m21949P(Build.VERSION.RELEASE).m21967k0((int) mo22833e().m22952v()).m21959a0(mo22833e().m22953w());
            zzaVarM21937I.m21982z0(m22850i(c7878z3M22746j0.m22944x(), Long.toString(zzanVar.f29080i)));
            if (!TextUtils.isEmpty(c7878z3M22746j0.m22894M())) {
                zzaVarM21937I.m21936H0(c7878z3M22746j0.m22894M());
            }
            String strM22940t = c7878z3M22746j0.m22940t();
            List<C7766m7> listM22732I = mo22785q().m22732I(strM22940t);
            Iterator<C7766m7> it = listM22732I.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if ("_lte".equals(next.f28779c)) {
                    break;
                }
            }
            if (next == null || next.f28781e == null) {
                C7766m7 c7766m7 = new C7766m7(strM22940t, "auto", "_lte", mo22837j().mo14608a(), 0L);
                listM22732I.add(c7766m7);
                mo22785q().m22742T(c7766m7);
            }
            if (mo22841n().m23564B(strM22940t, zzap.f29152k0)) {
                zzkg zzkgVarMo22784p = mo22784p();
                zzkgVarMo22784p.mo22836h().m23145P().m23147a("Checking account type status for ad personalization signals");
                if (zzkgVarMo22784p.mo22833e().m22956z()) {
                    String strM22940t2 = c7878z3M22746j0.m22940t();
                    if (c7878z3M22746j0.m22930l() && zzkgVarMo22784p.mo22786r().m23182I(strM22940t2)) {
                        zzkgVarMo22784p.mo22836h().m23144O().m23147a("Turning off ad personalization due to account type");
                        Iterator<C7766m7> it2 = listM22732I.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            if ("_npa".equals(it2.next().f28779c)) {
                                it2.remove();
                                break;
                            }
                        }
                        listM22732I.add(new C7766m7(strM22940t2, "auto", "_npa", zzkgVarMo22784p.mo22837j().mo14608a(), 1L));
                    }
                }
            }
            zzbr.zzk[] zzkVarArr = new zzbr.zzk[listM22732I.size()];
            for (int i2 = 0; i2 < listM22732I.size(); i2++) {
                zzbr.zzk.zza zzaVarM22077B = zzbr.zzk.m22062X().m22078C(listM22732I.get(i2).f28779c).m22077B(listM22732I.get(i2).f28780d);
                mo22784p().m23486K(zzaVarM22077B, listM22732I.get(i2).f28781e);
                zzkVarArr[i2] = (zzbr.zzk) ((zzfd) zzaVarM22077B.mo22283y());
            }
            zzaVarM21937I.m21947O(Arrays.asList(zzkVarArr));
            Bundle bundleM22960Y = zzanVar.f29078g.m22960Y();
            bundleM22960Y.putLong("_c", 1L);
            mo22836h().m23144O().m23147a("Marking in-app purchase as real-time");
            bundleM22960Y.putLong("_r", 1L);
            bundleM22960Y.putString("_o", zzanVar.f29079h);
            if (mo22839l().m23550v0(zzaVarM21937I.m21926C0())) {
                mo22839l().m23529L(bundleM22960Y, "_dbg", 1L);
                mo22839l().m23529L(bundleM22960Y, "_r", 1L);
            }
            C7713h c7713hM22726D = mo22785q().m22726D(str, zzanVar.f29077f);
            if (c7713hM22726D == null) {
                c7878z3 = c7878z3M22746j0;
                zzaVar = zzaVarM21937I;
                zzaVar2 = zzaVarM21749F;
                bundle = bundleM22960Y;
                bArr = null;
                c7713hM22780a = new C7713h(str, zzanVar.f29077f, 0L, 0L, zzanVar.f29080i, 0L, null, null, null, null);
                j2 = 0;
            } else {
                zzaVar = zzaVarM21937I;
                c7878z3 = c7878z3M22746j0;
                zzaVar2 = zzaVarM21749F;
                bundle = bundleM22960Y;
                bArr = null;
                j2 = c7713hM22726D.f28667f;
                c7713hM22780a = c7713hM22726D.m22780a(zzanVar.f29080i);
            }
            mo22785q().m22736N(c7713hM22780a);
            zzak zzakVar = new zzak(this.f28874a, zzanVar.f29079h, str, zzanVar.f29077f, zzanVar.f29080i, j2, bundle);
            zzbr.zzc.zza zzaVarM21703J = zzbr.zzc.m21681c0().m21695B(zzakVar.f29073d).m21698E(zzakVar.f29071b).m21703J(zzakVar.f29074e);
            Iterator<String> it3 = zzakVar.f29075f.iterator();
            while (it3.hasNext()) {
                String next2 = it3.next();
                zzbr.zze.zza zzaVarM21742C = zzbr.zze.m21728T().m21742C(next2);
                mo22784p().m23485J(zzaVarM21742C, zzakVar.f29075f.m22959W(next2));
                zzaVarM21703J.m21696C(zzaVarM21742C);
            }
            zzbr.zzg.zza zzaVar3 = zzaVar;
            zzaVar3.m21927D(zzaVarM21703J).m21929E(zzbr.zzh.m21983B().m21989w(zzbr.zzd.m21709B().m21716w(c7713hM22780a.f28664c).m21715A(zzanVar.f29077f)));
            zzaVar3.m21955U(mo22783o().m22812w(c7878z3.m22940t(), Collections.emptyList(), zzaVar3.m21961c0(), Long.valueOf(zzaVarM21703J.m21706M())));
            if (zzaVarM21703J.m21705L()) {
                zzaVar3.m21945N(zzaVarM21703J.m21706M()).m21954T(zzaVarM21703J.m21706M());
            }
            long jM22899R = c7878z3.m22899R();
            if (jM22899R != 0) {
                zzaVar3.m21964g0(jM22899R);
            }
            long jM22897P = c7878z3.m22897P();
            if (jM22897P != 0) {
                zzaVar3.m21957X(jM22897P);
            } else if (jM22899R != 0) {
                zzaVar3.m21957X(jM22899R);
            }
            c7878z3.m22925i0();
            zzaVar3.m21971o0((int) c7878z3.m22919f0()).m21972q0(mo22841n().m23565C()).m21925C(mo22837j().mo14608a()).m21951Q(true);
            zzbr.zzf.zza zzaVar4 = zzaVar2;
            zzaVar4.m21754w(zzaVar3);
            C7878z3 c7878z32 = c7878z3;
            c7878z32.m22908a(zzaVar3.m21966j0());
            c7878z32.m22937q(zzaVar3.m21970n0());
            mo22785q().m22737O(c7878z32);
            mo22785q().m22759w();
            try {
                return mo22784p().m23490W(((zzbr.zzf) ((zzfd) zzaVar4.mo22283y())).m22136j());
            } catch (IOException e2) {
                mo22836h().m23137H().m23149c("Data loss. Failed to bundle and serialize. appId", zzet.m23131x(str), e2);
                return bArr;
            }
        } catch (SecurityException e3) {
            mo22836h().m23144O().m23148b("Resettable device id encryption failed", e3.getMessage());
            return new byte[0];
        } catch (SecurityException e4) {
            mo22836h().m23144O().m23148b("app instance id encryption failed", e4.getMessage());
            return new byte[0];
        } finally {
            mo22785q().m22721A0();
        }
    }
}
