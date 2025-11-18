package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C0409r1;
import java.io.IOException;
import java.util.List;

/* compiled from: CodedInputStreamReader.java */
/* renamed from: androidx.datastore.preferences.protobuf.k */
/* loaded from: classes.dex */
final class C0386k implements InterfaceC0370e1 {

    /* renamed from: a */
    private final AbstractC0383j f2812a;

    /* renamed from: b */
    private int f2813b;

    /* renamed from: c */
    private int f2814c;

    /* renamed from: d */
    private int f2815d = 0;

    /* compiled from: CodedInputStreamReader.java */
    /* renamed from: androidx.datastore.preferences.protobuf.k$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2816a;

        static {
            int[] iArr = new int[C0409r1.b.values().length];
            f2816a = iArr;
            try {
                iArr[C0409r1.b.f2885m.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2816a[C0409r1.b.f2889q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2816a[C0409r1.b.f2878f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2816a[C0409r1.b.f2891s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2816a[C0409r1.b.f2884l.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2816a[C0409r1.b.f2883k.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2816a[C0409r1.b.f2879g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2816a[C0409r1.b.f2882j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2816a[C0409r1.b.f2880h.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2816a[C0409r1.b.f2888p.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2816a[C0409r1.b.f2892t.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2816a[C0409r1.b.f2893u.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2816a[C0409r1.b.f2894v.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f2816a[C0409r1.b.f2895w.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f2816a[C0409r1.b.f2886n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f2816a[C0409r1.b.f2890r.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f2816a[C0409r1.b.f2881i.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private C0386k(AbstractC0383j abstractC0383j) {
        AbstractC0383j abstractC0383j2 = (AbstractC0383j) C0357a0.m2557b(abstractC0383j, "input");
        this.f2812a = abstractC0383j2;
        abstractC0383j2.f2780d = this;
    }

    /* renamed from: P */
    public static C0386k m2918P(AbstractC0383j abstractC0383j) {
        C0386k c0386k = abstractC0383j.f2780d;
        return c0386k != null ? c0386k : new C0386k(abstractC0383j);
    }

    /* renamed from: Q */
    private Object m2919Q(C0409r1.b bVar, Class<?> cls, C0401p c0401p) throws IOException {
        switch (a.f2816a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo2655l());
            case 2:
                return mo2628C();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(mo2665v());
            case 5:
                return Integer.valueOf(mo2654k());
            case 6:
                return Long.valueOf(mo2649f());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(mo2630E());
            case 9:
                return Long.valueOf(mo2637L());
            case 10:
                return mo2650g(cls, c0401p);
            case 11:
                return Integer.valueOf(mo2633H());
            case 12:
                return Long.valueOf(mo2656m());
            case 13:
                return Integer.valueOf(mo2667x());
            case 14:
                return Long.valueOf(mo2668y());
            case 15:
                return mo2638M();
            case 16:
                return Integer.valueOf(mo2659p());
            case 17:
                return Long.valueOf(mo2648e());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* renamed from: R */
    private <T> T m2920R(InterfaceC0373f1<T> interfaceC0373f1, C0401p c0401p) throws IOException {
        int i2 = this.f2814c;
        this.f2814c = C0409r1.m3204c(C0409r1.m3202a(this.f2813b), 4);
        try {
            T tMo2694c = interfaceC0373f1.mo2694c();
            interfaceC0373f1.mo2696e(tMo2694c, this, c0401p);
            interfaceC0373f1.mo2697f(tMo2694c);
            if (this.f2813b == this.f2814c) {
                return tMo2694c;
            }
            throw InvalidProtocolBufferException.m2536g();
        } finally {
            this.f2814c = i2;
        }
    }

    /* renamed from: S */
    private <T> T m2921S(InterfaceC0373f1<T> interfaceC0373f1, C0401p c0401p) throws IOException {
        int iMo2856C = this.f2812a.mo2856C();
        AbstractC0383j abstractC0383j = this.f2812a;
        if (abstractC0383j.f2777a >= abstractC0383j.f2778b) {
            throw InvalidProtocolBufferException.m2537h();
        }
        int iMo2863l = abstractC0383j.mo2863l(iMo2856C);
        T tMo2694c = interfaceC0373f1.mo2694c();
        this.f2812a.f2777a++;
        interfaceC0373f1.mo2696e(tMo2694c, this, c0401p);
        interfaceC0373f1.mo2697f(tMo2694c);
        this.f2812a.mo2859a(0);
        r5.f2777a--;
        this.f2812a.mo2862k(iMo2863l);
        return tMo2694c;
    }

    /* renamed from: U */
    private void m2922U(int i2) throws IOException {
        if (this.f2812a.mo2860d() != i2) {
            throw InvalidProtocolBufferException.m2539k();
        }
    }

    /* renamed from: V */
    private void m2923V(int i2) throws IOException {
        if (C0409r1.m3203b(this.f2813b) != i2) {
            throw InvalidProtocolBufferException.m2533d();
        }
    }

    /* renamed from: W */
    private void m2924W(int i2) throws IOException {
        if ((i2 & 3) != 0) {
            throw InvalidProtocolBufferException.m2536g();
        }
    }

    /* renamed from: X */
    private void m2925X(int i2) throws IOException {
        if ((i2 & 7) != 0) {
            throw InvalidProtocolBufferException.m2536g();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: A */
    public int mo2626A() throws IOException {
        int i2 = this.f2815d;
        if (i2 != 0) {
            this.f2813b = i2;
            this.f2815d = 0;
        } else {
            this.f2813b = this.f2812a.mo2855B();
        }
        int i3 = this.f2813b;
        if (i3 == 0 || i3 == this.f2814c) {
            return Integer.MAX_VALUE;
        }
        return C0409r1.m3202a(i3);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: B */
    public void mo2627B(List<String> list) throws IOException {
        m2926T(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: C */
    public AbstractC0377h mo2628C() throws IOException {
        m2923V(2);
        return this.f2812a.mo2865n();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: D */
    public void mo2629D(List<Float> list) throws IOException {
        int iMo2855B;
        int iMo2855B2;
        if (!(list instanceof C0419w)) {
            int iM3203b = C0409r1.m3203b(this.f2813b);
            if (iM3203b == 2) {
                int iMo2856C = this.f2812a.mo2856C();
                m2924W(iMo2856C);
                int iMo2860d = this.f2812a.mo2860d() + iMo2856C;
                do {
                    list.add(Float.valueOf(this.f2812a.mo2870s()));
                } while (this.f2812a.mo2860d() < iMo2860d);
                return;
            }
            if (iM3203b != 5) {
                throw InvalidProtocolBufferException.m2533d();
            }
            do {
                list.add(Float.valueOf(this.f2812a.mo2870s()));
                if (this.f2812a.mo2861e()) {
                    return;
                } else {
                    iMo2855B = this.f2812a.mo2855B();
                }
            } while (iMo2855B == this.f2813b);
            this.f2815d = iMo2855B;
            return;
        }
        C0419w c0419w = (C0419w) list;
        int iM3203b2 = C0409r1.m3203b(this.f2813b);
        if (iM3203b2 == 2) {
            int iMo2856C2 = this.f2812a.mo2856C();
            m2924W(iMo2856C2);
            int iMo2860d2 = this.f2812a.mo2860d() + iMo2856C2;
            do {
                c0419w.m3318h(this.f2812a.mo2870s());
            } while (this.f2812a.mo2860d() < iMo2860d2);
            return;
        }
        if (iM3203b2 != 5) {
            throw InvalidProtocolBufferException.m2533d();
        }
        do {
            c0419w.m3318h(this.f2812a.mo2870s());
            if (this.f2812a.mo2861e()) {
                return;
            } else {
                iMo2855B2 = this.f2812a.mo2855B();
            }
        } while (iMo2855B2 == this.f2813b);
        this.f2815d = iMo2855B2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: E */
    public int mo2630E() throws IOException {
        m2923V(0);
        return this.f2812a.mo2871t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: F */
    public <T> void mo2631F(List<T> list, InterfaceC0373f1<T> interfaceC0373f1, C0401p c0401p) throws IOException {
        int iMo2855B;
        if (C0409r1.m3203b(this.f2813b) != 3) {
            throw InvalidProtocolBufferException.m2533d();
        }
        int i2 = this.f2813b;
        do {
            list.add(m2920R(interfaceC0373f1, c0401p));
            if (this.f2812a.mo2861e() || this.f2815d != 0) {
                return;
            } else {
                iMo2855B = this.f2812a.mo2855B();
            }
        } while (iMo2855B == i2);
        this.f2815d = iMo2855B;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: G */
    public boolean mo2632G() throws IOException {
        int i2;
        if (this.f2812a.mo2861e() || (i2 = this.f2813b) == this.f2814c) {
            return false;
        }
        return this.f2812a.mo2858E(i2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: H */
    public int mo2633H() throws IOException {
        m2923V(5);
        return this.f2812a.mo2873v();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: I */
    public void mo2634I(List<AbstractC0377h> list) throws IOException {
        int iMo2855B;
        if (C0409r1.m3203b(this.f2813b) != 2) {
            throw InvalidProtocolBufferException.m2533d();
        }
        do {
            list.add(mo2628C());
            if (this.f2812a.mo2861e()) {
                return;
            } else {
                iMo2855B = this.f2812a.mo2855B();
            }
        } while (iMo2855B == this.f2813b);
        this.f2815d = iMo2855B;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: J */
    public void mo2635J(List<Double> list) throws IOException {
        int iMo2855B;
        int iMo2855B2;
        if (!(list instanceof C0392m)) {
            int iM3203b = C0409r1.m3203b(this.f2813b);
            if (iM3203b == 1) {
                do {
                    list.add(Double.valueOf(this.f2812a.mo2866o()));
                    if (this.f2812a.mo2861e()) {
                        return;
                    } else {
                        iMo2855B = this.f2812a.mo2855B();
                    }
                } while (iMo2855B == this.f2813b);
                this.f2815d = iMo2855B;
                return;
            }
            if (iM3203b != 2) {
                throw InvalidProtocolBufferException.m2533d();
            }
            int iMo2856C = this.f2812a.mo2856C();
            m2925X(iMo2856C);
            int iMo2860d = this.f2812a.mo2860d() + iMo2856C;
            do {
                list.add(Double.valueOf(this.f2812a.mo2866o()));
            } while (this.f2812a.mo2860d() < iMo2860d);
            return;
        }
        C0392m c0392m = (C0392m) list;
        int iM3203b2 = C0409r1.m3203b(this.f2813b);
        if (iM3203b2 == 1) {
            do {
                c0392m.m3023h(this.f2812a.mo2866o());
                if (this.f2812a.mo2861e()) {
                    return;
                } else {
                    iMo2855B2 = this.f2812a.mo2855B();
                }
            } while (iMo2855B2 == this.f2813b);
            this.f2815d = iMo2855B2;
            return;
        }
        if (iM3203b2 != 2) {
            throw InvalidProtocolBufferException.m2533d();
        }
        int iMo2856C2 = this.f2812a.mo2856C();
        m2925X(iMo2856C2);
        int iMo2860d2 = this.f2812a.mo2860d() + iMo2856C2;
        do {
            c0392m.m3023h(this.f2812a.mo2866o());
        } while (this.f2812a.mo2860d() < iMo2860d2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: K */
    public <T> void mo2636K(List<T> list, InterfaceC0373f1<T> interfaceC0373f1, C0401p c0401p) throws IOException {
        int iMo2855B;
        if (C0409r1.m3203b(this.f2813b) != 2) {
            throw InvalidProtocolBufferException.m2533d();
        }
        int i2 = this.f2813b;
        do {
            list.add(m2921S(interfaceC0373f1, c0401p));
            if (this.f2812a.mo2861e() || this.f2815d != 0) {
                return;
            } else {
                iMo2855B = this.f2812a.mo2855B();
            }
        } while (iMo2855B == i2);
        this.f2815d = iMo2855B;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: L */
    public long mo2637L() throws IOException {
        m2923V(0);
        return this.f2812a.mo2872u();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: M */
    public String mo2638M() throws IOException {
        m2923V(2);
        return this.f2812a.mo2854A();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: N */
    public void mo2639N(List<Long> list) throws IOException {
        int iMo2855B;
        int iMo2855B2;
        if (!(list instanceof C0378h0)) {
            int iM3203b = C0409r1.m3203b(this.f2813b);
            if (iM3203b == 1) {
                do {
                    list.add(Long.valueOf(this.f2812a.mo2869r()));
                    if (this.f2812a.mo2861e()) {
                        return;
                    } else {
                        iMo2855B = this.f2812a.mo2855B();
                    }
                } while (iMo2855B == this.f2813b);
                this.f2815d = iMo2855B;
                return;
            }
            if (iM3203b != 2) {
                throw InvalidProtocolBufferException.m2533d();
            }
            int iMo2856C = this.f2812a.mo2856C();
            m2925X(iMo2856C);
            int iMo2860d = this.f2812a.mo2860d() + iMo2856C;
            do {
                list.add(Long.valueOf(this.f2812a.mo2869r()));
            } while (this.f2812a.mo2860d() < iMo2860d);
            return;
        }
        C0378h0 c0378h0 = (C0378h0) list;
        int iM3203b2 = C0409r1.m3203b(this.f2813b);
        if (iM3203b2 == 1) {
            do {
                c0378h0.m2747i(this.f2812a.mo2869r());
                if (this.f2812a.mo2861e()) {
                    return;
                } else {
                    iMo2855B2 = this.f2812a.mo2855B();
                }
            } while (iMo2855B2 == this.f2813b);
            this.f2815d = iMo2855B2;
            return;
        }
        if (iM3203b2 != 2) {
            throw InvalidProtocolBufferException.m2533d();
        }
        int iMo2856C2 = this.f2812a.mo2856C();
        m2925X(iMo2856C2);
        int iMo2860d2 = this.f2812a.mo2860d() + iMo2856C2;
        do {
            c0378h0.m2747i(this.f2812a.mo2869r());
        } while (this.f2812a.mo2860d() < iMo2860d2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: O */
    public <T> T mo2640O(InterfaceC0373f1<T> interfaceC0373f1, C0401p c0401p) throws IOException {
        m2923V(3);
        return (T) m2920R(interfaceC0373f1, c0401p);
    }

    /* renamed from: T */
    public void m2926T(List<String> list, boolean z) throws IOException {
        int iMo2855B;
        int iMo2855B2;
        if (C0409r1.m3203b(this.f2813b) != 2) {
            throw InvalidProtocolBufferException.m2533d();
        }
        if (!(list instanceof InterfaceC0372f0) || z) {
            do {
                list.add(z ? mo2638M() : mo2642a());
                if (this.f2812a.mo2861e()) {
                    return;
                } else {
                    iMo2855B = this.f2812a.mo2855B();
                }
            } while (iMo2855B == this.f2813b);
            this.f2815d = iMo2855B;
            return;
        }
        InterfaceC0372f0 interfaceC0372f0 = (InterfaceC0372f0) list;
        do {
            interfaceC0372f0.mo2671a0(mo2628C());
            if (this.f2812a.mo2861e()) {
                return;
            } else {
                iMo2855B2 = this.f2812a.mo2855B();
            }
        } while (iMo2855B2 == this.f2813b);
        this.f2815d = iMo2855B2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: a */
    public String mo2642a() throws IOException {
        m2923V(2);
        return this.f2812a.mo2877z();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: b */
    public void mo2644b(List<String> list) throws IOException {
        m2926T(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: c */
    public <T> T mo2645c(InterfaceC0373f1<T> interfaceC0373f1, C0401p c0401p) throws IOException {
        m2923V(2);
        return (T) m2921S(interfaceC0373f1, c0401p);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: d */
    public void mo2647d(List<Integer> list) throws IOException {
        int iMo2855B;
        int iMo2855B2;
        if (!(list instanceof C0425z)) {
            int iM3203b = C0409r1.m3203b(this.f2813b);
            if (iM3203b == 0) {
                do {
                    list.add(Integer.valueOf(this.f2812a.mo2875x()));
                    if (this.f2812a.mo2861e()) {
                        return;
                    } else {
                        iMo2855B = this.f2812a.mo2855B();
                    }
                } while (iMo2855B == this.f2813b);
                this.f2815d = iMo2855B;
                return;
            }
            if (iM3203b != 2) {
                throw InvalidProtocolBufferException.m2533d();
            }
            int iMo2860d = this.f2812a.mo2860d() + this.f2812a.mo2856C();
            do {
                list.add(Integer.valueOf(this.f2812a.mo2875x()));
            } while (this.f2812a.mo2860d() < iMo2860d);
            m2922U(iMo2860d);
            return;
        }
        C0425z c0425z = (C0425z) list;
        int iM3203b2 = C0409r1.m3203b(this.f2813b);
        if (iM3203b2 == 0) {
            do {
                c0425z.m3370h(this.f2812a.mo2875x());
                if (this.f2812a.mo2861e()) {
                    return;
                } else {
                    iMo2855B2 = this.f2812a.mo2855B();
                }
            } while (iMo2855B2 == this.f2813b);
            this.f2815d = iMo2855B2;
            return;
        }
        if (iM3203b2 != 2) {
            throw InvalidProtocolBufferException.m2533d();
        }
        int iMo2860d2 = this.f2812a.mo2860d() + this.f2812a.mo2856C();
        do {
            c0425z.m3370h(this.f2812a.mo2875x());
        } while (this.f2812a.mo2860d() < iMo2860d2);
        m2922U(iMo2860d2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: e */
    public long mo2648e() throws IOException {
        m2923V(0);
        return this.f2812a.mo2857D();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: f */
    public long mo2649f() throws IOException {
        m2923V(1);
        return this.f2812a.mo2869r();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: g */
    public <T> T mo2650g(Class<T> cls, C0401p c0401p) throws IOException {
        m2923V(2);
        return (T) m2921S(C0361b1.m2578a().m2581d(cls), c0401p);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    public int getTag() {
        return this.f2813b;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: h */
    public void mo2651h(List<Integer> list) throws IOException {
        int iMo2855B;
        int iMo2855B2;
        if (!(list instanceof C0425z)) {
            int iM3203b = C0409r1.m3203b(this.f2813b);
            if (iM3203b == 2) {
                int iMo2856C = this.f2812a.mo2856C();
                m2924W(iMo2856C);
                int iMo2860d = this.f2812a.mo2860d() + iMo2856C;
                do {
                    list.add(Integer.valueOf(this.f2812a.mo2873v()));
                } while (this.f2812a.mo2860d() < iMo2860d);
                return;
            }
            if (iM3203b != 5) {
                throw InvalidProtocolBufferException.m2533d();
            }
            do {
                list.add(Integer.valueOf(this.f2812a.mo2873v()));
                if (this.f2812a.mo2861e()) {
                    return;
                } else {
                    iMo2855B = this.f2812a.mo2855B();
                }
            } while (iMo2855B == this.f2813b);
            this.f2815d = iMo2855B;
            return;
        }
        C0425z c0425z = (C0425z) list;
        int iM3203b2 = C0409r1.m3203b(this.f2813b);
        if (iM3203b2 == 2) {
            int iMo2856C2 = this.f2812a.mo2856C();
            m2924W(iMo2856C2);
            int iMo2860d2 = this.f2812a.mo2860d() + iMo2856C2;
            do {
                c0425z.m3370h(this.f2812a.mo2873v());
            } while (this.f2812a.mo2860d() < iMo2860d2);
            return;
        }
        if (iM3203b2 != 5) {
            throw InvalidProtocolBufferException.m2533d();
        }
        do {
            c0425z.m3370h(this.f2812a.mo2873v());
            if (this.f2812a.mo2861e()) {
                return;
            } else {
                iMo2855B2 = this.f2812a.mo2855B();
            }
        } while (iMo2855B2 == this.f2813b);
        this.f2815d = iMo2855B2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: i */
    public void mo2652i(List<Long> list) throws IOException {
        int iMo2855B;
        int iMo2855B2;
        if (!(list instanceof C0378h0)) {
            int iM3203b = C0409r1.m3203b(this.f2813b);
            if (iM3203b == 0) {
                do {
                    list.add(Long.valueOf(this.f2812a.mo2876y()));
                    if (this.f2812a.mo2861e()) {
                        return;
                    } else {
                        iMo2855B = this.f2812a.mo2855B();
                    }
                } while (iMo2855B == this.f2813b);
                this.f2815d = iMo2855B;
                return;
            }
            if (iM3203b != 2) {
                throw InvalidProtocolBufferException.m2533d();
            }
            int iMo2860d = this.f2812a.mo2860d() + this.f2812a.mo2856C();
            do {
                list.add(Long.valueOf(this.f2812a.mo2876y()));
            } while (this.f2812a.mo2860d() < iMo2860d);
            m2922U(iMo2860d);
            return;
        }
        C0378h0 c0378h0 = (C0378h0) list;
        int iM3203b2 = C0409r1.m3203b(this.f2813b);
        if (iM3203b2 == 0) {
            do {
                c0378h0.m2747i(this.f2812a.mo2876y());
                if (this.f2812a.mo2861e()) {
                    return;
                } else {
                    iMo2855B2 = this.f2812a.mo2855B();
                }
            } while (iMo2855B2 == this.f2813b);
            this.f2815d = iMo2855B2;
            return;
        }
        if (iM3203b2 != 2) {
            throw InvalidProtocolBufferException.m2533d();
        }
        int iMo2860d2 = this.f2812a.mo2860d() + this.f2812a.mo2856C();
        do {
            c0378h0.m2747i(this.f2812a.mo2876y());
        } while (this.f2812a.mo2860d() < iMo2860d2);
        m2922U(iMo2860d2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: j */
    public void mo2653j(List<Integer> list) throws IOException {
        int iMo2855B;
        int iMo2855B2;
        if (!(list instanceof C0425z)) {
            int iM3203b = C0409r1.m3203b(this.f2813b);
            if (iM3203b == 0) {
                do {
                    list.add(Integer.valueOf(this.f2812a.mo2856C()));
                    if (this.f2812a.mo2861e()) {
                        return;
                    } else {
                        iMo2855B = this.f2812a.mo2855B();
                    }
                } while (iMo2855B == this.f2813b);
                this.f2815d = iMo2855B;
                return;
            }
            if (iM3203b != 2) {
                throw InvalidProtocolBufferException.m2533d();
            }
            int iMo2860d = this.f2812a.mo2860d() + this.f2812a.mo2856C();
            do {
                list.add(Integer.valueOf(this.f2812a.mo2856C()));
            } while (this.f2812a.mo2860d() < iMo2860d);
            m2922U(iMo2860d);
            return;
        }
        C0425z c0425z = (C0425z) list;
        int iM3203b2 = C0409r1.m3203b(this.f2813b);
        if (iM3203b2 == 0) {
            do {
                c0425z.m3370h(this.f2812a.mo2856C());
                if (this.f2812a.mo2861e()) {
                    return;
                } else {
                    iMo2855B2 = this.f2812a.mo2855B();
                }
            } while (iMo2855B2 == this.f2813b);
            this.f2815d = iMo2855B2;
            return;
        }
        if (iM3203b2 != 2) {
            throw InvalidProtocolBufferException.m2533d();
        }
        int iMo2860d2 = this.f2812a.mo2860d() + this.f2812a.mo2856C();
        do {
            c0425z.m3370h(this.f2812a.mo2856C());
        } while (this.f2812a.mo2860d() < iMo2860d2);
        m2922U(iMo2860d2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: k */
    public int mo2654k() throws IOException {
        m2923V(5);
        return this.f2812a.mo2868q();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: l */
    public boolean mo2655l() throws IOException {
        m2923V(0);
        return this.f2812a.mo2864m();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: m */
    public long mo2656m() throws IOException {
        m2923V(1);
        return this.f2812a.mo2874w();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: n */
    public void mo2657n(List<Long> list) throws IOException {
        int iMo2855B;
        int iMo2855B2;
        if (!(list instanceof C0378h0)) {
            int iM3203b = C0409r1.m3203b(this.f2813b);
            if (iM3203b == 0) {
                do {
                    list.add(Long.valueOf(this.f2812a.mo2857D()));
                    if (this.f2812a.mo2861e()) {
                        return;
                    } else {
                        iMo2855B = this.f2812a.mo2855B();
                    }
                } while (iMo2855B == this.f2813b);
                this.f2815d = iMo2855B;
                return;
            }
            if (iM3203b != 2) {
                throw InvalidProtocolBufferException.m2533d();
            }
            int iMo2860d = this.f2812a.mo2860d() + this.f2812a.mo2856C();
            do {
                list.add(Long.valueOf(this.f2812a.mo2857D()));
            } while (this.f2812a.mo2860d() < iMo2860d);
            m2922U(iMo2860d);
            return;
        }
        C0378h0 c0378h0 = (C0378h0) list;
        int iM3203b2 = C0409r1.m3203b(this.f2813b);
        if (iM3203b2 == 0) {
            do {
                c0378h0.m2747i(this.f2812a.mo2857D());
                if (this.f2812a.mo2861e()) {
                    return;
                } else {
                    iMo2855B2 = this.f2812a.mo2855B();
                }
            } while (iMo2855B2 == this.f2813b);
            this.f2815d = iMo2855B2;
            return;
        }
        if (iM3203b2 != 2) {
            throw InvalidProtocolBufferException.m2533d();
        }
        int iMo2860d2 = this.f2812a.mo2860d() + this.f2812a.mo2856C();
        do {
            c0378h0.m2747i(this.f2812a.mo2857D());
        } while (this.f2812a.mo2860d() < iMo2860d2);
        m2922U(iMo2860d2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: o */
    public <T> T mo2658o(Class<T> cls, C0401p c0401p) throws IOException {
        m2923V(3);
        return (T) m2920R(C0361b1.m2578a().m2581d(cls), c0401p);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: p */
    public int mo2659p() throws IOException {
        m2923V(0);
        return this.f2812a.mo2856C();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: q */
    public void mo2660q(List<Long> list) throws IOException {
        int iMo2855B;
        int iMo2855B2;
        if (!(list instanceof C0378h0)) {
            int iM3203b = C0409r1.m3203b(this.f2813b);
            if (iM3203b == 0) {
                do {
                    list.add(Long.valueOf(this.f2812a.mo2872u()));
                    if (this.f2812a.mo2861e()) {
                        return;
                    } else {
                        iMo2855B = this.f2812a.mo2855B();
                    }
                } while (iMo2855B == this.f2813b);
                this.f2815d = iMo2855B;
                return;
            }
            if (iM3203b != 2) {
                throw InvalidProtocolBufferException.m2533d();
            }
            int iMo2860d = this.f2812a.mo2860d() + this.f2812a.mo2856C();
            do {
                list.add(Long.valueOf(this.f2812a.mo2872u()));
            } while (this.f2812a.mo2860d() < iMo2860d);
            m2922U(iMo2860d);
            return;
        }
        C0378h0 c0378h0 = (C0378h0) list;
        int iM3203b2 = C0409r1.m3203b(this.f2813b);
        if (iM3203b2 == 0) {
            do {
                c0378h0.m2747i(this.f2812a.mo2872u());
                if (this.f2812a.mo2861e()) {
                    return;
                } else {
                    iMo2855B2 = this.f2812a.mo2855B();
                }
            } while (iMo2855B2 == this.f2813b);
            this.f2815d = iMo2855B2;
            return;
        }
        if (iM3203b2 != 2) {
            throw InvalidProtocolBufferException.m2533d();
        }
        int iMo2860d2 = this.f2812a.mo2860d() + this.f2812a.mo2856C();
        do {
            c0378h0.m2747i(this.f2812a.mo2872u());
        } while (this.f2812a.mo2860d() < iMo2860d2);
        m2922U(iMo2860d2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: r */
    public void mo2661r(List<Long> list) throws IOException {
        int iMo2855B;
        int iMo2855B2;
        if (!(list instanceof C0378h0)) {
            int iM3203b = C0409r1.m3203b(this.f2813b);
            if (iM3203b == 1) {
                do {
                    list.add(Long.valueOf(this.f2812a.mo2874w()));
                    if (this.f2812a.mo2861e()) {
                        return;
                    } else {
                        iMo2855B = this.f2812a.mo2855B();
                    }
                } while (iMo2855B == this.f2813b);
                this.f2815d = iMo2855B;
                return;
            }
            if (iM3203b != 2) {
                throw InvalidProtocolBufferException.m2533d();
            }
            int iMo2856C = this.f2812a.mo2856C();
            m2925X(iMo2856C);
            int iMo2860d = this.f2812a.mo2860d() + iMo2856C;
            do {
                list.add(Long.valueOf(this.f2812a.mo2874w()));
            } while (this.f2812a.mo2860d() < iMo2860d);
            return;
        }
        C0378h0 c0378h0 = (C0378h0) list;
        int iM3203b2 = C0409r1.m3203b(this.f2813b);
        if (iM3203b2 == 1) {
            do {
                c0378h0.m2747i(this.f2812a.mo2874w());
                if (this.f2812a.mo2861e()) {
                    return;
                } else {
                    iMo2855B2 = this.f2812a.mo2855B();
                }
            } while (iMo2855B2 == this.f2813b);
            this.f2815d = iMo2855B2;
            return;
        }
        if (iM3203b2 != 2) {
            throw InvalidProtocolBufferException.m2533d();
        }
        int iMo2856C2 = this.f2812a.mo2856C();
        m2925X(iMo2856C2);
        int iMo2860d2 = this.f2812a.mo2860d() + iMo2856C2;
        do {
            c0378h0.m2747i(this.f2812a.mo2874w());
        } while (this.f2812a.mo2860d() < iMo2860d2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    public double readDouble() throws IOException {
        m2923V(1);
        return this.f2812a.mo2866o();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    public float readFloat() throws IOException {
        m2923V(5);
        return this.f2812a.mo2870s();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: s */
    public void mo2662s(List<Integer> list) throws IOException {
        int iMo2855B;
        int iMo2855B2;
        if (!(list instanceof C0425z)) {
            int iM3203b = C0409r1.m3203b(this.f2813b);
            if (iM3203b == 0) {
                do {
                    list.add(Integer.valueOf(this.f2812a.mo2871t()));
                    if (this.f2812a.mo2861e()) {
                        return;
                    } else {
                        iMo2855B = this.f2812a.mo2855B();
                    }
                } while (iMo2855B == this.f2813b);
                this.f2815d = iMo2855B;
                return;
            }
            if (iM3203b != 2) {
                throw InvalidProtocolBufferException.m2533d();
            }
            int iMo2860d = this.f2812a.mo2860d() + this.f2812a.mo2856C();
            do {
                list.add(Integer.valueOf(this.f2812a.mo2871t()));
            } while (this.f2812a.mo2860d() < iMo2860d);
            m2922U(iMo2860d);
            return;
        }
        C0425z c0425z = (C0425z) list;
        int iM3203b2 = C0409r1.m3203b(this.f2813b);
        if (iM3203b2 == 0) {
            do {
                c0425z.m3370h(this.f2812a.mo2871t());
                if (this.f2812a.mo2861e()) {
                    return;
                } else {
                    iMo2855B2 = this.f2812a.mo2855B();
                }
            } while (iMo2855B2 == this.f2813b);
            this.f2815d = iMo2855B2;
            return;
        }
        if (iM3203b2 != 2) {
            throw InvalidProtocolBufferException.m2533d();
        }
        int iMo2860d2 = this.f2812a.mo2860d() + this.f2812a.mo2856C();
        do {
            c0425z.m3370h(this.f2812a.mo2871t());
        } while (this.f2812a.mo2860d() < iMo2860d2);
        m2922U(iMo2860d2);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: t */
    public void mo2663t(List<Integer> list) throws IOException {
        int iMo2855B;
        int iMo2855B2;
        if (!(list instanceof C0425z)) {
            int iM3203b = C0409r1.m3203b(this.f2813b);
            if (iM3203b == 0) {
                do {
                    list.add(Integer.valueOf(this.f2812a.mo2867p()));
                    if (this.f2812a.mo2861e()) {
                        return;
                    } else {
                        iMo2855B = this.f2812a.mo2855B();
                    }
                } while (iMo2855B == this.f2813b);
                this.f2815d = iMo2855B;
                return;
            }
            if (iM3203b != 2) {
                throw InvalidProtocolBufferException.m2533d();
            }
            int iMo2860d = this.f2812a.mo2860d() + this.f2812a.mo2856C();
            do {
                list.add(Integer.valueOf(this.f2812a.mo2867p()));
            } while (this.f2812a.mo2860d() < iMo2860d);
            m2922U(iMo2860d);
            return;
        }
        C0425z c0425z = (C0425z) list;
        int iM3203b2 = C0409r1.m3203b(this.f2813b);
        if (iM3203b2 == 0) {
            do {
                c0425z.m3370h(this.f2812a.mo2867p());
                if (this.f2812a.mo2861e()) {
                    return;
                } else {
                    iMo2855B2 = this.f2812a.mo2855B();
                }
            } while (iMo2855B2 == this.f2813b);
            this.f2815d = iMo2855B2;
            return;
        }
        if (iM3203b2 != 2) {
            throw InvalidProtocolBufferException.m2533d();
        }
        int iMo2860d2 = this.f2812a.mo2860d() + this.f2812a.mo2856C();
        do {
            c0425z.m3370h(this.f2812a.mo2867p());
        } while (this.f2812a.mo2860d() < iMo2860d2);
        m2922U(iMo2860d2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <K, V> void mo2664u(java.util.Map<K, V> r8, androidx.datastore.preferences.protobuf.C0384j0.a<K, V> r9, androidx.datastore.preferences.protobuf.C0401p r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.m2923V(r0)
            androidx.datastore.preferences.protobuf.j r1 = r7.f2812a
            int r1 = r1.mo2856C()
            androidx.datastore.preferences.protobuf.j r2 = r7.f2812a
            int r1 = r2.mo2863l(r1)
            K r2 = r9.f2804b
            V r3 = r9.f2806d
        L14:
            int r4 = r7.mo2626A()     // Catch: java.lang.Throwable -> L65
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5c
            androidx.datastore.preferences.protobuf.j r5 = r7.f2812a     // Catch: java.lang.Throwable -> L65
            boolean r5 = r5.mo2861e()     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L26
            goto L5c
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L47
            if (r4 == r0) goto L3a
            boolean r4 = r7.mo2632G()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            if (r4 == 0) goto L34
            goto L14
        L34:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r4 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            r4.<init>(r6)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            throw r4     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
        L3a:
            androidx.datastore.preferences.protobuf.r1$b r4 = r9.f2805c     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            V r5 = r9.f2806d     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            java.lang.Class r5 = r5.getClass()     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            java.lang.Object r3 = r7.m2919Q(r4, r5, r10)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            goto L14
        L47:
            androidx.datastore.preferences.protobuf.r1$b r4 = r9.f2803a     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            r5 = 0
            java.lang.Object r2 = r7.m2919Q(r4, r5, r5)     // Catch: androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4f java.lang.Throwable -> L65
            goto L14
        L4f:
            boolean r4 = r7.mo2632G()     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L56
            goto L14
        L56:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r8 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L65
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L65
            throw r8     // Catch: java.lang.Throwable -> L65
        L5c:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L65
            androidx.datastore.preferences.protobuf.j r8 = r7.f2812a
            r8.mo2862k(r1)
            return
        L65:
            r8 = move-exception
            androidx.datastore.preferences.protobuf.j r9 = r7.f2812a
            r9.mo2862k(r1)
            goto L6d
        L6c:
            throw r8
        L6d:
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0386k.mo2664u(java.util.Map, androidx.datastore.preferences.protobuf.j0$a, androidx.datastore.preferences.protobuf.p):void");
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: v */
    public int mo2665v() throws IOException {
        m2923V(0);
        return this.f2812a.mo2867p();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: w */
    public void mo2666w(List<Integer> list) throws IOException {
        int iMo2855B;
        int iMo2855B2;
        if (!(list instanceof C0425z)) {
            int iM3203b = C0409r1.m3203b(this.f2813b);
            if (iM3203b == 2) {
                int iMo2856C = this.f2812a.mo2856C();
                m2924W(iMo2856C);
                int iMo2860d = this.f2812a.mo2860d() + iMo2856C;
                do {
                    list.add(Integer.valueOf(this.f2812a.mo2868q()));
                } while (this.f2812a.mo2860d() < iMo2860d);
                return;
            }
            if (iM3203b != 5) {
                throw InvalidProtocolBufferException.m2533d();
            }
            do {
                list.add(Integer.valueOf(this.f2812a.mo2868q()));
                if (this.f2812a.mo2861e()) {
                    return;
                } else {
                    iMo2855B = this.f2812a.mo2855B();
                }
            } while (iMo2855B == this.f2813b);
            this.f2815d = iMo2855B;
            return;
        }
        C0425z c0425z = (C0425z) list;
        int iM3203b2 = C0409r1.m3203b(this.f2813b);
        if (iM3203b2 == 2) {
            int iMo2856C2 = this.f2812a.mo2856C();
            m2924W(iMo2856C2);
            int iMo2860d2 = this.f2812a.mo2860d() + iMo2856C2;
            do {
                c0425z.m3370h(this.f2812a.mo2868q());
            } while (this.f2812a.mo2860d() < iMo2860d2);
            return;
        }
        if (iM3203b2 != 5) {
            throw InvalidProtocolBufferException.m2533d();
        }
        do {
            c0425z.m3370h(this.f2812a.mo2868q());
            if (this.f2812a.mo2861e()) {
                return;
            } else {
                iMo2855B2 = this.f2812a.mo2855B();
            }
        } while (iMo2855B2 == this.f2813b);
        this.f2815d = iMo2855B2;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: x */
    public int mo2667x() throws IOException {
        m2923V(0);
        return this.f2812a.mo2875x();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: y */
    public long mo2668y() throws IOException {
        m2923V(0);
        return this.f2812a.mo2876y();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0370e1
    /* renamed from: z */
    public void mo2669z(List<Boolean> list) throws IOException {
        int iMo2855B;
        int iMo2855B2;
        if (!(list instanceof C0371f)) {
            int iM3203b = C0409r1.m3203b(this.f2813b);
            if (iM3203b == 0) {
                do {
                    list.add(Boolean.valueOf(this.f2812a.mo2864m()));
                    if (this.f2812a.mo2861e()) {
                        return;
                    } else {
                        iMo2855B = this.f2812a.mo2855B();
                    }
                } while (iMo2855B == this.f2813b);
                this.f2815d = iMo2855B;
                return;
            }
            if (iM3203b != 2) {
                throw InvalidProtocolBufferException.m2533d();
            }
            int iMo2860d = this.f2812a.mo2860d() + this.f2812a.mo2856C();
            do {
                list.add(Boolean.valueOf(this.f2812a.mo2864m()));
            } while (this.f2812a.mo2860d() < iMo2860d);
            m2922U(iMo2860d);
            return;
        }
        C0371f c0371f = (C0371f) list;
        int iM3203b2 = C0409r1.m3203b(this.f2813b);
        if (iM3203b2 == 0) {
            do {
                c0371f.m2685i(this.f2812a.mo2864m());
                if (this.f2812a.mo2861e()) {
                    return;
                } else {
                    iMo2855B2 = this.f2812a.mo2855B();
                }
            } while (iMo2855B2 == this.f2813b);
            this.f2815d = iMo2855B2;
            return;
        }
        if (iM3203b2 != 2) {
            throw InvalidProtocolBufferException.m2533d();
        }
        int iMo2860d2 = this.f2812a.mo2860d() + this.f2812a.mo2856C();
        do {
            c0371f.m2685i(this.f2812a.mo2864m());
        } while (this.f2812a.mo2860d() < iMo2860d2);
        m2922U(iMo2860d2);
    }
}
