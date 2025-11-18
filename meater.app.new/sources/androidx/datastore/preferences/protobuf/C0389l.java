package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C0384j0;
import androidx.datastore.preferences.protobuf.C0409r1;
import androidx.datastore.preferences.protobuf.InterfaceC0412s1;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: CodedOutputStreamWriter.java */
/* renamed from: androidx.datastore.preferences.protobuf.l */
/* loaded from: classes.dex */
final class C0389l implements InterfaceC0412s1 {

    /* renamed from: a */
    private final CodedOutputStream f2820a;

    /* compiled from: CodedOutputStreamWriter.java */
    /* renamed from: androidx.datastore.preferences.protobuf.l$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2821a;

        static {
            int[] iArr = new int[C0409r1.b.values().length];
            f2821a = iArr;
            try {
                iArr[C0409r1.b.f2885m.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2821a[C0409r1.b.f2884l.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2821a[C0409r1.b.f2882j.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2821a[C0409r1.b.f2892t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2821a[C0409r1.b.f2894v.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2821a[C0409r1.b.f2890r.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2821a[C0409r1.b.f2883k.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2821a[C0409r1.b.f2880h.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2821a[C0409r1.b.f2893u.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2821a[C0409r1.b.f2895w.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2821a[C0409r1.b.f2881i.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2821a[C0409r1.b.f2886n.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private C0389l(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) C0357a0.m2557b(codedOutputStream, "output");
        this.f2820a = codedOutputStream2;
        codedOutputStream2.f2660c = this;
    }

    /* renamed from: P */
    public static C0389l m2942P(CodedOutputStream codedOutputStream) {
        C0389l c0389l = codedOutputStream.f2660c;
        return c0389l != null ? c0389l : new C0389l(codedOutputStream);
    }

    /* renamed from: Q */
    private <V> void m2943Q(int i2, boolean z, V v, C0384j0.a<Boolean, V> aVar) throws IOException {
        this.f2820a.mo2488W0(i2, 2);
        this.f2820a.mo2490Y0(C0384j0.m2911b(aVar, Boolean.valueOf(z), v));
        C0384j0.m2913e(this.f2820a, aVar, Boolean.valueOf(z), v);
    }

    /* renamed from: R */
    private <V> void m2944R(int i2, C0384j0.a<Integer, V> aVar, Map<Integer, V> map) throws IOException {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            iArr[i3] = it.next().intValue();
            i3++;
        }
        Arrays.sort(iArr);
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = iArr[i4];
            V v = map.get(Integer.valueOf(i5));
            this.f2820a.mo2488W0(i2, 2);
            this.f2820a.mo2490Y0(C0384j0.m2911b(aVar, Integer.valueOf(i5), v));
            C0384j0.m2913e(this.f2820a, aVar, Integer.valueOf(i5), v);
        }
    }

    /* renamed from: S */
    private <V> void m2945S(int i2, C0384j0.a<Long, V> aVar, Map<Long, V> map) throws IOException {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Long> it = map.keySet().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            jArr[i3] = it.next().longValue();
            i3++;
        }
        Arrays.sort(jArr);
        for (int i4 = 0; i4 < size; i4++) {
            long j2 = jArr[i4];
            V v = map.get(Long.valueOf(j2));
            this.f2820a.mo2488W0(i2, 2);
            this.f2820a.mo2490Y0(C0384j0.m2911b(aVar, Long.valueOf(j2), v));
            C0384j0.m2913e(this.f2820a, aVar, Long.valueOf(j2), v);
        }
    }

    /* renamed from: T */
    private <K, V> void m2946T(int i2, C0384j0.a<K, V> aVar, Map<K, V> map) throws IOException {
        switch (a.f2821a[aVar.f2803a.ordinal()]) {
            case 1:
                V v = map.get(Boolean.FALSE);
                if (v != null) {
                    m2943Q(i2, false, v, aVar);
                }
                V v2 = map.get(Boolean.TRUE);
                if (v2 != null) {
                    m2943Q(i2, true, v2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                m2944R(i2, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                m2945S(i2, aVar, map);
                return;
            case 12:
                m2947U(i2, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f2803a);
        }
    }

    /* renamed from: U */
    private <V> void m2947U(int i2, C0384j0.a<String, V> aVar, Map<String, V> map) throws IOException {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator<String> it = map.keySet().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            strArr[i3] = it.next();
            i3++;
        }
        Arrays.sort(strArr);
        for (int i4 = 0; i4 < size; i4++) {
            String str = strArr[i4];
            V v = map.get(str);
            this.f2820a.mo2488W0(i2, 2);
            this.f2820a.mo2490Y0(C0384j0.m2911b(aVar, str, v));
            C0384j0.m2913e(this.f2820a, aVar, str, v);
        }
    }

    /* renamed from: V */
    private void m2948V(int i2, Object obj) throws IOException {
        if (obj instanceof String) {
            this.f2820a.mo2486U0(i2, (String) obj);
        } else {
            this.f2820a.mo2503o0(i2, (AbstractC0377h) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: A */
    public void mo2949A(int i2, List<Boolean> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f2820a.mo2499k0(i2, list.get(i3).booleanValue());
                i3++;
            }
            return;
        }
        this.f2820a.mo2488W0(i2, 2);
        int iM2441e = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM2441e += CodedOutputStream.m2441e(list.get(i4).booleanValue());
        }
        this.f2820a.mo2490Y0(iM2441e);
        while (i3 < list.size()) {
            this.f2820a.m2500l0(list.get(i3).booleanValue());
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: B */
    public void mo2950B(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f2820a.mo2489X0(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f2820a.mo2488W0(i2, 2);
        int iM2434X = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM2434X += CodedOutputStream.m2434X(list.get(i4).intValue());
        }
        this.f2820a.mo2490Y0(iM2434X);
        while (i3 < list.size()) {
            this.f2820a.mo2490Y0(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: C */
    public void mo2951C(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f2820a.m2484S0(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.f2820a.mo2488W0(i2, 2);
        int iM2429S = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM2429S += CodedOutputStream.m2429S(list.get(i4).longValue());
        }
        this.f2820a.mo2490Y0(iM2429S);
        while (i3 < list.size()) {
            this.f2820a.m2485T0(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: D */
    public void mo2952D(int i2, long j2) throws IOException {
        this.f2820a.m2484S0(i2, j2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: E */
    public void mo2953E(int i2, float f2) throws IOException {
        this.f2820a.m2513y0(i2, f2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: F */
    public void mo2954F(int i2) throws IOException {
        this.f2820a.mo2488W0(i2, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: G */
    public void mo2955G(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f2820a.m2482Q0(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f2820a.mo2488W0(i2, 2);
        int iM2427Q = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM2427Q += CodedOutputStream.m2427Q(list.get(i4).intValue());
        }
        this.f2820a.mo2490Y0(iM2427Q);
        while (i3 < list.size()) {
            this.f2820a.m2483R0(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: H */
    public void mo2956H(int i2, int i3) throws IOException {
        this.f2820a.m2507s0(i2, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: I */
    public void mo2957I(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f2820a.m2472G0(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.f2820a.mo2488W0(i2, 2);
        int iM2464y = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM2464y += CodedOutputStream.m2464y(list.get(i4).longValue());
        }
        this.f2820a.mo2490Y0(iM2464y);
        while (i3 < list.size()) {
            this.f2820a.m2473H0(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: J */
    public void mo2958J(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f2820a.m2507s0(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f2820a.mo2488W0(i2, 2);
        int iM2451l = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM2451l += CodedOutputStream.m2451l(list.get(i4).intValue());
        }
        this.f2820a.mo2490Y0(iM2451l);
        while (i3 < list.size()) {
            this.f2820a.m2508t0(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: K */
    public void mo2959K(int i2, List<Double> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f2820a.m2505q0(i2, list.get(i3).doubleValue());
                i3++;
            }
            return;
        }
        this.f2820a.mo2488W0(i2, 2);
        int iM2449j = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM2449j += CodedOutputStream.m2449j(list.get(i4).doubleValue());
        }
        this.f2820a.mo2490Y0(iM2449j);
        while (i3 < list.size()) {
            this.f2820a.m2506r0(list.get(i3).doubleValue());
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: L */
    public <K, V> void mo2960L(int i2, C0384j0.a<K, V> aVar, Map<K, V> map) throws IOException {
        if (this.f2820a.m2496e0()) {
            m2946T(i2, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f2820a.mo2488W0(i2, 2);
            this.f2820a.mo2490Y0(C0384j0.m2911b(aVar, entry.getKey(), entry.getValue()));
            C0384j0.m2913e(this.f2820a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: M */
    public void mo2961M(int i2, int i3) throws IOException {
        this.f2820a.m2482Q0(i2, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: N */
    public void mo2962N(int i2, List<AbstractC0377h> list) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f2820a.mo2503o0(i2, list.get(i3));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: O */
    public void mo2963O(int i2, Object obj, InterfaceC0373f1 interfaceC0373f1) throws IOException {
        this.f2820a.m2467B0(i2, (InterfaceC0405q0) obj, interfaceC0373f1);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: a */
    public void mo2964a(int i2, List<Float> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f2820a.m2513y0(i2, list.get(i3).floatValue());
                i3++;
            }
            return;
        }
        this.f2820a.mo2488W0(i2, 2);
        int iM2457r = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM2457r += CodedOutputStream.m2457r(list.get(i4).floatValue());
        }
        this.f2820a.mo2490Y0(iM2457r);
        while (i3 < list.size()) {
            this.f2820a.m2514z0(list.get(i3).floatValue());
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: b */
    public void mo2965b(int i2, int i3) throws IOException {
        this.f2820a.mo2489X0(i2, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: c */
    public final void mo2966c(int i2, Object obj) throws IOException {
        if (obj instanceof AbstractC0377h) {
            this.f2820a.mo2477L0(i2, (AbstractC0377h) obj);
        } else {
            this.f2820a.mo2476K0(i2, (InterfaceC0405q0) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: d */
    public void mo2967d(int i2, int i3) throws IOException {
        this.f2820a.mo2509u0(i2, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: e */
    public void mo2968e(int i2, double d2) throws IOException {
        this.f2820a.m2505q0(i2, d2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: f */
    public void mo2969f(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f2820a.m2480O0(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.f2820a.mo2488W0(i2, 2);
        int iM2425O = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM2425O += CodedOutputStream.m2425O(list.get(i4).longValue());
        }
        this.f2820a.mo2490Y0(iM2425O);
        while (i3 < list.size()) {
            this.f2820a.m2481P0(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: g */
    public void mo2970g(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f2820a.mo2491Z0(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.f2820a.mo2488W0(i2, 2);
        int iM2436Z = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM2436Z += CodedOutputStream.m2436Z(list.get(i4).longValue());
        }
        this.f2820a.mo2490Y0(iM2436Z);
        while (i3 < list.size()) {
            this.f2820a.mo2492a1(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: h */
    public void mo2971h(int i2, long j2) throws IOException {
        this.f2820a.mo2511w0(i2, j2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: i */
    public InterfaceC0412s1.a mo2972i() {
        return InterfaceC0412s1.a.ASCENDING;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: j */
    public void mo2973j(int i2, List<?> list, InterfaceC0373f1 interfaceC0373f1) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            mo2989z(i2, list.get(i3), interfaceC0373f1);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: k */
    public void mo2974k(int i2, List<String> list) throws IOException {
        int i3 = 0;
        if (!(list instanceof InterfaceC0372f0)) {
            while (i3 < list.size()) {
                this.f2820a.mo2486U0(i2, list.get(i3));
                i3++;
            }
        } else {
            InterfaceC0372f0 interfaceC0372f0 = (InterfaceC0372f0) list;
            while (i3 < list.size()) {
                m2948V(i2, interfaceC0372f0.mo2672c1(i3));
                i3++;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: l */
    public void mo2975l(int i2, List<?> list, InterfaceC0373f1 interfaceC0373f1) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            mo2963O(i2, list.get(i3), interfaceC0373f1);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: m */
    public void mo2976m(int i2, String str) throws IOException {
        this.f2820a.mo2486U0(i2, str);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: n */
    public void mo2977n(int i2, long j2) throws IOException {
        this.f2820a.mo2491Z0(i2, j2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: o */
    public void mo2978o(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f2820a.mo2470E0(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f2820a.mo2488W0(i2, 2);
        int iM2462w = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM2462w += CodedOutputStream.m2462w(list.get(i4).intValue());
        }
        this.f2820a.mo2490Y0(iM2462w);
        while (i3 < list.size()) {
            this.f2820a.mo2471F0(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: p */
    public void mo2979p(int i2, long j2) throws IOException {
        this.f2820a.m2472G0(i2, j2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: q */
    public void mo2980q(int i2, boolean z) throws IOException {
        this.f2820a.mo2499k0(i2, z);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: r */
    public void mo2981r(int i2, int i3) throws IOException {
        this.f2820a.m2478M0(i2, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: s */
    public void mo2982s(int i2) throws IOException {
        this.f2820a.mo2488W0(i2, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: t */
    public void mo2983t(int i2, int i3) throws IOException {
        this.f2820a.mo2470E0(i2, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: u */
    public void mo2984u(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f2820a.mo2511w0(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.f2820a.mo2488W0(i2, 2);
        int iM2455p = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM2455p += CodedOutputStream.m2455p(list.get(i4).longValue());
        }
        this.f2820a.mo2490Y0(iM2455p);
        while (i3 < list.size()) {
            this.f2820a.mo2512x0(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: v */
    public void mo2985v(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f2820a.m2478M0(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f2820a.mo2488W0(i2, 2);
        int iM2423M = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM2423M += CodedOutputStream.m2423M(list.get(i4).intValue());
        }
        this.f2820a.mo2490Y0(iM2423M);
        while (i3 < list.size()) {
            this.f2820a.m2479N0(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: w */
    public void mo2986w(int i2, AbstractC0377h abstractC0377h) throws IOException {
        this.f2820a.mo2503o0(i2, abstractC0377h);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: x */
    public void mo2987x(int i2, long j2) throws IOException {
        this.f2820a.m2480O0(i2, j2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: y */
    public void mo2988y(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f2820a.mo2509u0(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f2820a.mo2488W0(i2, 2);
        int iM2453n = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iM2453n += CodedOutputStream.m2453n(list.get(i4).intValue());
        }
        this.f2820a.mo2490Y0(iM2453n);
        while (i3 < list.size()) {
            this.f2820a.mo2510v0(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0412s1
    /* renamed from: z */
    public void mo2989z(int i2, Object obj, InterfaceC0373f1 interfaceC0373f1) throws IOException {
        this.f2820a.mo2474I0(i2, (InterfaceC0405q0) obj, interfaceC0373f1);
    }
}
