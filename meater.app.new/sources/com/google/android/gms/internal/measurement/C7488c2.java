package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfd;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.c2 */
/* loaded from: classes2.dex */
final class C7488c2 implements InterfaceC7622y4 {

    /* renamed from: a */
    private final zzen f27707a;

    private C7488c2(zzen zzenVar) {
        zzen zzenVar2 = (zzen) zzff.m22291f(zzenVar, "output");
        this.f27707a = zzenVar2;
        zzenVar2.f28048c = this;
    }

    /* renamed from: P */
    public static C7488c2 m20987P(zzen zzenVar) {
        C7488c2 c7488c2 = zzenVar.f28048c;
        return c7488c2 != null ? c7488c2 : new C7488c2(zzenVar);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: A */
    public final void mo20988A(int i2, List<String> list) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzfv)) {
            while (i3 < list.size()) {
                this.f27707a.mo22236r(i2, list.get(i3));
                i3++;
            }
            return;
        }
        zzfv zzfvVar = (zzfv) list;
        while (i3 < list.size()) {
            Object objMo22311e = zzfvVar.mo22311e(i3);
            if (objMo22311e instanceof String) {
                this.f27707a.mo22236r(i2, (String) objMo22311e);
            } else {
                this.f27707a.mo22233o(i2, (zzdu) objMo22311e);
            }
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: B */
    public final void mo20989B(int i2, boolean z) throws IOException {
        this.f27707a.mo22237s(i2, z);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: C */
    public final void mo20990C(int i2, Object obj, InterfaceC7567p3 interfaceC7567p3) throws IOException {
        this.f27707a.mo22235q(i2, (zzgo) obj, interfaceC7567p3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: D */
    public final void mo20991D(int i2, int i3) throws IOException {
        this.f27707a.mo22213P(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: E */
    public final void mo20992E(int i2, zzdu zzduVar) throws IOException {
        this.f27707a.mo22233o(i2, zzduVar);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: F */
    public final void mo20993F(int i2, Object obj, InterfaceC7567p3 interfaceC7567p3) throws IOException {
        zzen zzenVar = this.f27707a;
        zzenVar.mo22231m(i2, 3);
        interfaceC7567p3.mo21102h((zzgo) obj, zzenVar.f28048c);
        zzenVar.mo22231m(i2, 4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: G */
    public final void mo20994G(int i2, int i3) throws IOException {
        this.f27707a.mo22213P(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: H */
    public final void mo20995H(int i2, int i3) throws IOException {
        this.f27707a.mo22228j0(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: I */
    public final void mo20996I(int i2, List<?> list, InterfaceC7567p3 interfaceC7567p3) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            mo20993F(i2, list.get(i3), interfaceC7567p3);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: J */
    public final void mo20997J(int i2, int i3) throws IOException {
        this.f27707a.m22223f0(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: K */
    public final void mo20998K(int i2, List<?> list, InterfaceC7567p3 interfaceC7567p3) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            mo20990C(i2, list.get(i3), interfaceC7567p3);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: L */
    public final void mo20999L(int i2, long j2) throws IOException {
        this.f27707a.mo22219Y(i2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: M */
    public final void mo21000M(int i2, int i3) throws IOException {
        this.f27707a.mo22218X(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: N */
    public final void mo21001N(int i2, long j2) throws IOException {
        this.f27707a.m22214Q(i2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: O */
    public final <K, V> void mo21002O(int i2, C7626z2<K, V> c7626z2, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f27707a.mo22231m(i2, 2);
            this.f27707a.mo22212O(zzgg.m22316a(c7626z2, entry.getKey(), entry.getValue()));
            zzgg.m22317b(this.f27707a, c7626z2, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: a */
    public final int mo21003a() {
        return zzfd.zze.f28134l;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: b */
    public final void mo21004b(int i2, long j2) throws IOException {
        this.f27707a.mo22219Y(i2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: c */
    public final void mo21005c(int i2, long j2) throws IOException {
        this.f27707a.mo22232n(i2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: d */
    public final void mo21006d(int i2) throws IOException {
        this.f27707a.mo22231m(i2, 3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: e */
    public final void mo21007e(int i2) throws IOException {
        this.f27707a.mo22231m(i2, 4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: f */
    public final void mo21008f(int i2, Object obj) throws IOException {
        if (obj instanceof zzdu) {
            this.f27707a.mo22215R(i2, (zzdu) obj);
        } else {
            this.f27707a.mo22234p(i2, (zzgo) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: g */
    public final void mo21009g(int i2, String str) throws IOException {
        this.f27707a.mo22236r(i2, str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: h */
    public final void mo21010h(int i2, double d2) throws IOException {
        this.f27707a.m22229k(i2, d2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: i */
    public final void mo21011i(int i2, List<Boolean> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f27707a.mo22237s(i2, list.get(i3).booleanValue());
                i3++;
            }
            return;
        }
        this.f27707a.mo22231m(i2, 2);
        int iM22178L = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM22178L += zzen.m22178L(list.get(i4).booleanValue());
        }
        this.f27707a.mo22212O(iM22178L);
        while (i3 < list.size()) {
            this.f27707a.m22243y(list.get(i3).booleanValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: j */
    public final void mo21012j(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f27707a.mo22213P(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f27707a.mo22231m(i2, 2);
        int iM22194k0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM22194k0 += zzen.m22194k0(list.get(i4).intValue());
        }
        this.f27707a.mo22212O(iM22194k0);
        while (i3 < list.size()) {
            this.f27707a.mo22227j(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: k */
    public final void mo21013k(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f27707a.mo22213P(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f27707a.mo22231m(i2, 2);
        int iM22165B0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM22165B0 += zzen.m22165B0(list.get(i4).intValue());
        }
        this.f27707a.mo22212O(iM22165B0);
        while (i3 < list.size()) {
            this.f27707a.mo22227j(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: l */
    public final void mo21014l(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f27707a.mo22232n(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.f27707a.mo22231m(i2, 2);
        int iM22188d0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM22188d0 += zzen.m22188d0(list.get(i4).longValue());
        }
        this.f27707a.mo22212O(iM22188d0);
        while (i3 < list.size()) {
            this.f27707a.mo22238t(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: m */
    public final void mo21015m(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f27707a.mo22219Y(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.f27707a.mo22231m(i2, 2);
        int iM22205v0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM22205v0 += zzen.m22205v0(list.get(i4).longValue());
        }
        this.f27707a.mo22212O(iM22205v0);
        while (i3 < list.size()) {
            this.f27707a.mo22220Z(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: n */
    public final void mo21016n(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f27707a.mo22228j0(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f27707a.mo22231m(i2, 2);
        int iM22206w0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM22206w0 += zzen.m22206w0(list.get(i4).intValue());
        }
        this.f27707a.mo22212O(iM22206w0);
        while (i3 < list.size()) {
            this.f27707a.mo22222e0(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: o */
    public final void mo21017o(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f27707a.mo22218X(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f27707a.mo22231m(i2, 2);
        int iM22198o0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM22198o0 += zzen.m22198o0(list.get(i4).intValue());
        }
        this.f27707a.mo22212O(iM22198o0);
        while (i3 < list.size()) {
            this.f27707a.mo22212O(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: p */
    public final void mo21018p(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f27707a.mo22228j0(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f27707a.mo22231m(i2, 2);
        int iM22210z0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM22210z0 += zzen.m22210z0(list.get(i4).intValue());
        }
        this.f27707a.mo22212O(iM22210z0);
        while (i3 < list.size()) {
            this.f27707a.mo22222e0(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: q */
    public final void mo21019q(int i2, long j2) throws IOException {
        this.f27707a.mo22232n(i2, j2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: r */
    public final void mo21020r(int i2, float f2) throws IOException {
        this.f27707a.m22230l(i2, f2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: s */
    public final void mo21021s(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f27707a.mo22219Y(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.f27707a.mo22231m(i2, 2);
        int iM22201r0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM22201r0 += zzen.m22201r0(list.get(i4).longValue());
        }
        this.f27707a.mo22212O(iM22201r0);
        while (i3 < list.size()) {
            this.f27707a.mo22220Z(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: t */
    public final void mo21022t(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f27707a.m22214Q(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.f27707a.mo22231m(i2, 2);
        int iM22197n0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM22197n0 += zzen.m22197n0(list.get(i4).longValue());
        }
        this.f27707a.mo22212O(iM22197n0);
        while (i3 < list.size()) {
            this.f27707a.m22216S(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: u */
    public final void mo21023u(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f27707a.mo22232n(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.f27707a.mo22231m(i2, 2);
        int iM22193i0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM22193i0 += zzen.m22193i0(list.get(i4).longValue());
        }
        this.f27707a.mo22212O(iM22193i0);
        while (i3 < list.size()) {
            this.f27707a.mo22238t(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: v */
    public final void mo21024v(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f27707a.m22223f0(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f27707a.mo22231m(i2, 2);
        int iM22202s0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM22202s0 += zzen.m22202s0(list.get(i4).intValue());
        }
        this.f27707a.mo22212O(iM22202s0);
        while (i3 < list.size()) {
            this.f27707a.m22217W(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: w */
    public final void mo21025w(int i2, List<Double> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f27707a.m22229k(i2, list.get(i3).doubleValue());
                i3++;
            }
            return;
        }
        this.f27707a.mo22231m(i2, 2);
        int iM22209z = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM22209z += zzen.m22209z(list.get(i4).doubleValue());
        }
        this.f27707a.mo22212O(iM22209z);
        while (i3 < list.size()) {
            this.f27707a.m22225h(list.get(i3).doubleValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: x */
    public final void mo21026x(int i2, List<zzdu> list) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f27707a.mo22233o(i2, list.get(i3));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: y */
    public final void mo21027y(int i2, int i3) throws IOException {
        this.f27707a.mo22228j0(i2, i3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC7622y4
    /* renamed from: z */
    public final void mo21028z(int i2, List<Float> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f27707a.m22230l(i2, list.get(i3).floatValue());
                i3++;
            }
            return;
        }
        this.f27707a.mo22231m(i2, 2);
        int iM22162A = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM22162A += zzen.m22162A(list.get(i4).floatValue());
        }
        this.f27707a.mo22212O(iM22162A);
        while (i3 < list.size()) {
            this.f27707a.m22226i(list.get(i3).floatValue());
            i3++;
        }
    }
}
