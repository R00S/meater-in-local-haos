package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.su */
/* loaded from: classes2.dex */
final class C7167su implements InterfaceC7244ux {

    /* renamed from: a */
    private final zzdni f20541a;

    private C7167su(zzdni zzdniVar) {
        zzdni zzdniVar2 = (zzdni) zzdod.m19743d(zzdniVar, "output");
        this.f20541a = zzdniVar2;
        zzdniVar2.f25672c = this;
    }

    /* renamed from: a */
    public static C7167su m15853a(zzdni zzdniVar) {
        C7167su c7167su = zzdniVar.f25672c;
        return c7167su != null ? c7167su : new C7167su(zzdniVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: A */
    public final void mo15854A(int i2, List<String> list) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzdot)) {
            while (i3 < list.size()) {
                this.f20541a.mo19671R(i2, list.get(i3));
                i3++;
            }
            return;
        }
        zzdot zzdotVar = (zzdot) list;
        while (i3 < list.size()) {
            Object objMo19767k1 = zzdotVar.mo19767k1(i3);
            if (objMo19767k1 instanceof String) {
                this.f20541a.mo19671R(i2, (String) objMo19767k1);
            } else {
                this.f20541a.mo19682g(i2, (zzdmr) objMo19767k1);
            }
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: B */
    public final void mo15855B(int i2, long j2) throws IOException {
        this.f20541a.mo19695x0(i2, j2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: C */
    public final void mo15856C(int i2) throws IOException {
        this.f20541a.mo19665H0(i2, 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: D */
    public final void mo15857D(int i2, int i3) throws IOException {
        this.f20541a.mo19688l(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: E */
    public final void mo15858E(int i2, double d2) throws IOException {
        this.f20541a.m19661C(i2, d2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: F */
    public final int mo15859F() {
        return zzdob.zze.f25769l;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: G */
    public final void mo15860G(int i2, Object obj) throws IOException {
        if (obj instanceof zzdmr) {
            this.f20541a.mo19662D(i2, (zzdmr) obj);
        } else {
            this.f20541a.mo19663E(i2, (zzdpk) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: H */
    public final void mo15861H(int i2, int i3) throws IOException {
        this.f20541a.mo19688l(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: I */
    public final void mo15862I(int i2, zzdmr zzdmrVar) throws IOException {
        this.f20541a.mo19682g(i2, zzdmrVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: J */
    public final void mo15863J(int i2, long j2) throws IOException {
        this.f20541a.mo19690t0(i2, j2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: K */
    public final void mo15864K(int i2, int i3) throws IOException {
        this.f20541a.mo19667J0(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: L */
    public final void mo15865L(int i2, long j2) throws IOException {
        this.f20541a.mo19690t0(i2, j2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: M */
    public final void mo15866M(int i2, long j2) throws IOException {
        this.f20541a.mo19695x0(i2, j2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: N */
    public final void mo15867N(int i2, int i3) throws IOException {
        this.f20541a.mo19666I0(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: O */
    public final void mo15868O(int i2, int i3) throws IOException {
        this.f20541a.m19668K0(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: P */
    public final void mo15869P(int i2, long j2) throws IOException {
        this.f20541a.m19692u0(i2, j2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: Q */
    public final void mo15870Q(int i2) throws IOException {
        this.f20541a.mo19665H0(i2, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: R */
    public final void mo15871R(int i2, boolean z) throws IOException {
        this.f20541a.mo19694v0(i2, z);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: S */
    public final void mo15872S(int i2, List<?> list, InterfaceC6910lw interfaceC6910lw) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            mo15874U(i2, list.get(i3), interfaceC6910lw);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: T */
    public final void mo15873T(int i2, int i3) throws IOException {
        this.f20541a.mo19666I0(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: U */
    public final void mo15874U(int i2, Object obj, InterfaceC6910lw interfaceC6910lw) throws IOException {
        zzdni zzdniVar = this.f20541a;
        zzdniVar.mo19665H0(i2, 3);
        interfaceC6910lw.mo14825e((zzdpk) obj, zzdniVar.f25672c);
        zzdniVar.mo19665H0(i2, 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: V */
    public final <K, V> void mo15875V(int i2, C7205tv<K, V> c7205tv, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f20541a.mo19665H0(i2, 2);
            this.f20541a.mo19679e0(zzdpc.m19770a(c7205tv, entry.getKey(), entry.getValue()));
            zzdpc.m19771b(this.f20541a, c7205tv, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: W */
    public final void mo15876W(int i2, List<?> list, InterfaceC6910lw interfaceC6910lw) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            mo15878Y(i2, list.get(i3), interfaceC6910lw);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: X */
    public final void mo15877X(int i2, String str) throws IOException {
        this.f20541a.mo19671R(i2, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: Y */
    public final void mo15878Y(int i2, Object obj, InterfaceC6910lw interfaceC6910lw) throws IOException {
        this.f20541a.mo19685i(i2, (zzdpk) obj, interfaceC6910lw);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: i */
    public final void mo15879i(int i2, List<Boolean> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f20541a.mo19694v0(i2, list.get(i3).booleanValue());
                i3++;
            }
            return;
        }
        this.f20541a.mo19665H0(i2, 2);
        int iM19616G = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM19616G += zzdni.m19616G(list.get(i4).booleanValue());
        }
        this.f20541a.mo19679e0(iM19616G);
        while (i3 < list.size()) {
            this.f20541a.m19664F(list.get(i3).booleanValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: j */
    public final void mo15880j(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f20541a.mo19666I0(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f20541a.mo19665H0(i2, 2);
        int iM19636i0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM19636i0 += zzdni.m19636i0(list.get(i4).intValue());
        }
        this.f20541a.mo19679e0(iM19636i0);
        while (i3 < list.size()) {
            this.f20541a.mo19676b0(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: k */
    public final void mo15881k(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f20541a.mo19666I0(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f20541a.mo19665H0(i2, 2);
        int iM19643n0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM19643n0 += zzdni.m19643n0(list.get(i4).intValue());
        }
        this.f20541a.mo19679e0(iM19643n0);
        while (i3 < list.size()) {
            this.f20541a.mo19676b0(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: l */
    public final void mo15882l(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f20541a.mo19690t0(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.f20541a.mo19665H0(i2, 2);
        int iM19626V = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM19626V += zzdni.m19626V(list.get(i4).longValue());
        }
        this.f20541a.mo19679e0(iM19626V);
        while (i3 < list.size()) {
            this.f20541a.mo19672S(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: m */
    public final void mo15883m(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f20541a.mo19695x0(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.f20541a.mo19665H0(i2, 2);
        int iM19630Z = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM19630Z += zzdni.m19630Z(list.get(i4).longValue());
        }
        this.f20541a.mo19679e0(iM19630Z);
        while (i3 < list.size()) {
            this.f20541a.mo19674U(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: n */
    public final void mo15884n(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f20541a.mo19688l(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f20541a.mo19665H0(i2, 2);
        int iM19639l0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM19639l0 += zzdni.m19639l0(list.get(i4).intValue());
        }
        this.f20541a.mo19679e0(iM19639l0);
        while (i3 < list.size()) {
            this.f20541a.mo19683g0(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: o */
    public final void mo15885o(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f20541a.mo19667J0(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f20541a.mo19665H0(i2, 2);
        int iM19637j0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM19637j0 += zzdni.m19637j0(list.get(i4).intValue());
        }
        this.f20541a.mo19679e0(iM19637j0);
        while (i3 < list.size()) {
            this.f20541a.mo19679e0(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: p */
    public final void mo15886p(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f20541a.mo19688l(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f20541a.mo19665H0(i2, 2);
        int iM19641m0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM19641m0 += zzdni.m19641m0(list.get(i4).intValue());
        }
        this.f20541a.mo19679e0(iM19641m0);
        while (i3 < list.size()) {
            this.f20541a.mo19683g0(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: r */
    public final void mo15887r(int i2, float f2) throws IOException {
        this.f20541a.m19680f(i2, f2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: s */
    public final void mo15888s(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f20541a.mo19695x0(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.f20541a.mo19665H0(i2, 2);
        int iM19629Y = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM19629Y += zzdni.m19629Y(list.get(i4).longValue());
        }
        this.f20541a.mo19679e0(iM19629Y);
        while (i3 < list.size()) {
            this.f20541a.mo19674U(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: t */
    public final void mo15889t(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f20541a.m19692u0(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.f20541a.mo19665H0(i2, 2);
        int iM19628X = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM19628X += zzdni.m19628X(list.get(i4).longValue());
        }
        this.f20541a.mo19679e0(iM19628X);
        while (i3 < list.size()) {
            this.f20541a.m19673T(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: u */
    public final void mo15890u(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f20541a.mo19690t0(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.f20541a.mo19665H0(i2, 2);
        int iM19627W = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM19627W += zzdni.m19627W(list.get(i4).longValue());
        }
        this.f20541a.mo19679e0(iM19627W);
        while (i3 < list.size()) {
            this.f20541a.mo19672S(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: v */
    public final void mo15891v(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f20541a.m19668K0(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f20541a.mo19665H0(i2, 2);
        int iM19638k0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM19638k0 += zzdni.m19638k0(list.get(i4).intValue());
        }
        this.f20541a.mo19679e0(iM19638k0);
        while (i3 < list.size()) {
            this.f20541a.m19681f0(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: w */
    public final void mo15892w(int i2, List<Double> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f20541a.m19661C(i2, list.get(i3).doubleValue());
                i3++;
            }
            return;
        }
        this.f20541a.mo19665H0(i2, 2);
        int iM19618H = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM19618H += zzdni.m19618H(list.get(i4).doubleValue());
        }
        this.f20541a.mo19679e0(iM19618H);
        while (i3 < list.size()) {
            this.f20541a.m19660B(list.get(i3).doubleValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: x */
    public final void mo15893x(int i2, List<zzdmr> list) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f20541a.mo19682g(i2, list.get(i3));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7244ux
    /* renamed from: z */
    public final void mo15894z(int i2, List<Float> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f20541a.m19680f(i2, list.get(i3).floatValue());
                i3++;
            }
            return;
        }
        this.f20541a.mo19665H0(i2, 2);
        int iM19652s0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM19652s0 += zzdni.m19652s0(list.get(i4).floatValue());
        }
        this.f20541a.mo19679e0(iM19652s0);
        while (i3 < list.size()) {
            this.f20541a.m19678d0(list.get(i3).floatValue());
            i3++;
        }
    }
}
