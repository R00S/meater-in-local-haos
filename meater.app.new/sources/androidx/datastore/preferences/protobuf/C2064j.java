package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.r0;
import java.util.List;

/* compiled from: CodedInputStreamReader.java */
/* renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2064j implements e0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC2063i f24982a;

    /* renamed from: b, reason: collision with root package name */
    private int f24983b;

    /* renamed from: c, reason: collision with root package name */
    private int f24984c;

    /* renamed from: d, reason: collision with root package name */
    private int f24985d = 0;

    /* compiled from: CodedInputStreamReader.java */
    /* renamed from: androidx.datastore.preferences.protobuf.j$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f24986a;

        static {
            int[] iArr = new int[r0.b.values().length];
            f24986a = iArr;
            try {
                iArr[r0.b.f25058K.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24986a[r0.b.f25062O.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24986a[r0.b.f25051D.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24986a[r0.b.f25064Q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24986a[r0.b.f25057J.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24986a[r0.b.f25056I.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24986a[r0.b.f25052E.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f24986a[r0.b.f25055H.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f24986a[r0.b.f25053F.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f24986a[r0.b.f25061N.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f24986a[r0.b.f25065R.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f24986a[r0.b.f25066S.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f24986a[r0.b.f25067T.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f24986a[r0.b.f25068U.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f24986a[r0.b.f25059L.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f24986a[r0.b.f25063P.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f24986a[r0.b.f25054G.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private C2064j(AbstractC2063i abstractC2063i) {
        AbstractC2063i abstractC2063i2 = (AbstractC2063i) C2079z.b(abstractC2063i, "input");
        this.f24982a = abstractC2063i2;
        abstractC2063i2.f24942d = this;
    }

    public static C2064j Q(AbstractC2063i abstractC2063i) {
        C2064j c2064j = abstractC2063i.f24942d;
        return c2064j != null ? c2064j : new C2064j(abstractC2063i);
    }

    private Object R(r0.b bVar, Class<?> cls, C2069o c2069o) {
        switch (a.f24986a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(i());
            case 2:
                return z();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(q());
            case 5:
                return Integer.valueOf(h());
            case 6:
                return Long.valueOf(d());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(B());
            case 9:
                return Long.valueOf(G());
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return K(cls, c2069o);
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return Integer.valueOf(D());
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return Long.valueOf(j());
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return Integer.valueOf(s());
            case 14:
                return Long.valueOf(t());
            case 15:
                return H();
            case 16:
                return Integer.valueOf(l());
            case 17:
                return Long.valueOf(c());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private <T> T S(f0<T> f0Var, C2069o c2069o) {
        int i10 = this.f24984c;
        this.f24984c = r0.c(r0.a(this.f24983b), 4);
        try {
            T tF = f0Var.f();
            f0Var.h(tF, this, c2069o);
            f0Var.b(tF);
            if (this.f24983b == this.f24984c) {
                return tF;
            }
            throw InvalidProtocolBufferException.g();
        } finally {
            this.f24984c = i10;
        }
    }

    private <T> T T(f0<T> f0Var, C2069o c2069o) throws InvalidProtocolBufferException {
        int iC = this.f24982a.C();
        AbstractC2063i abstractC2063i = this.f24982a;
        if (abstractC2063i.f24939a >= abstractC2063i.f24940b) {
            throw InvalidProtocolBufferException.h();
        }
        int iL = abstractC2063i.l(iC);
        T tF = f0Var.f();
        this.f24982a.f24939a++;
        f0Var.h(tF, this, c2069o);
        f0Var.b(tF);
        this.f24982a.a(0);
        r5.f24939a--;
        this.f24982a.k(iL);
        return tF;
    }

    private void V(int i10) throws InvalidProtocolBufferException {
        if (this.f24982a.d() != i10) {
            throw InvalidProtocolBufferException.k();
        }
    }

    private void W(int i10) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if (r0.b(this.f24983b) != i10) {
            throw InvalidProtocolBufferException.d();
        }
    }

    private void X(int i10) throws InvalidProtocolBufferException {
        if ((i10 & 3) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    private void Y(int i10) throws InvalidProtocolBufferException {
        if ((i10 & 7) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void A(List<Float> list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof C2075v)) {
            int iB3 = r0.b(this.f24983b);
            if (iB3 == 2) {
                int iC = this.f24982a.C();
                X(iC);
                int iD = this.f24982a.d() + iC;
                do {
                    list.add(Float.valueOf(this.f24982a.s()));
                } while (this.f24982a.d() < iD);
                return;
            }
            if (iB3 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Float.valueOf(this.f24982a.s()));
                if (this.f24982a.e()) {
                    return;
                } else {
                    iB = this.f24982a.B();
                }
            } while (iB == this.f24983b);
            this.f24985d = iB;
            return;
        }
        C2075v c2075v = (C2075v) list;
        int iB4 = r0.b(this.f24983b);
        if (iB4 == 2) {
            int iC2 = this.f24982a.C();
            X(iC2);
            int iD2 = this.f24982a.d() + iC2;
            do {
                c2075v.i(this.f24982a.s());
            } while (this.f24982a.d() < iD2);
            return;
        }
        if (iB4 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            c2075v.i(this.f24982a.s());
            if (this.f24982a.e()) {
                return;
            } else {
                iB2 = this.f24982a.B();
            }
        } while (iB2 == this.f24983b);
        this.f24985d = iB2;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int B() throws InvalidProtocolBufferException.InvalidWireTypeException {
        W(0);
        return this.f24982a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public boolean C() {
        int i10;
        if (this.f24982a.e() || (i10 = this.f24983b) == this.f24984c) {
            return false;
        }
        return this.f24982a.E(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int D() throws InvalidProtocolBufferException.InvalidWireTypeException {
        W(5);
        return this.f24982a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void E(List<AbstractC2062h> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iB;
        if (r0.b(this.f24983b) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(z());
            if (this.f24982a.e()) {
                return;
            } else {
                iB = this.f24982a.B();
            }
        } while (iB == this.f24983b);
        this.f24985d = iB;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void F(List<Double> list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof C2066l)) {
            int iB3 = r0.b(this.f24983b);
            if (iB3 == 1) {
                do {
                    list.add(Double.valueOf(this.f24982a.o()));
                    if (this.f24982a.e()) {
                        return;
                    } else {
                        iB = this.f24982a.B();
                    }
                } while (iB == this.f24983b);
                this.f24985d = iB;
                return;
            }
            if (iB3 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iC = this.f24982a.C();
            Y(iC);
            int iD = this.f24982a.d() + iC;
            do {
                list.add(Double.valueOf(this.f24982a.o()));
            } while (this.f24982a.d() < iD);
            return;
        }
        C2066l c2066l = (C2066l) list;
        int iB4 = r0.b(this.f24983b);
        if (iB4 == 1) {
            do {
                c2066l.i(this.f24982a.o());
                if (this.f24982a.e()) {
                    return;
                } else {
                    iB2 = this.f24982a.B();
                }
            } while (iB2 == this.f24983b);
            this.f24985d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iC2 = this.f24982a.C();
        Y(iC2);
        int iD2 = this.f24982a.d() + iC2;
        do {
            c2066l.i(this.f24982a.o());
        } while (this.f24982a.d() < iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public long G() throws InvalidProtocolBufferException.InvalidWireTypeException {
        W(0);
        return this.f24982a.u();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public String H() throws InvalidProtocolBufferException.InvalidWireTypeException {
        W(2);
        return this.f24982a.A();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void I(List<Long> list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof G)) {
            int iB3 = r0.b(this.f24983b);
            if (iB3 == 1) {
                do {
                    list.add(Long.valueOf(this.f24982a.r()));
                    if (this.f24982a.e()) {
                        return;
                    } else {
                        iB = this.f24982a.B();
                    }
                } while (iB == this.f24983b);
                this.f24985d = iB;
                return;
            }
            if (iB3 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iC = this.f24982a.C();
            Y(iC);
            int iD = this.f24982a.d() + iC;
            do {
                list.add(Long.valueOf(this.f24982a.r()));
            } while (this.f24982a.d() < iD);
            return;
        }
        G g10 = (G) list;
        int iB4 = r0.b(this.f24983b);
        if (iB4 == 1) {
            do {
                g10.j(this.f24982a.r());
                if (this.f24982a.e()) {
                    return;
                } else {
                    iB2 = this.f24982a.B();
                }
            } while (iB2 == this.f24983b);
            this.f24985d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iC2 = this.f24982a.C();
        Y(iC2);
        int iD2 = this.f24982a.d() + iC2;
        do {
            g10.j(this.f24982a.r());
        } while (this.f24982a.d() < iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public <T> T J(f0<T> f0Var, C2069o c2069o) throws InvalidProtocolBufferException.InvalidWireTypeException {
        W(2);
        return (T) T(f0Var, c2069o);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public <T> T K(Class<T> cls, C2069o c2069o) throws InvalidProtocolBufferException.InvalidWireTypeException {
        W(2);
        return (T) T(b0.a().d(cls), c2069o);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public <T> T L(Class<T> cls, C2069o c2069o) throws InvalidProtocolBufferException.InvalidWireTypeException {
        W(3);
        return (T) S(b0.a().d(cls), c2069o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r7.f24982a.k(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <K, V> void M(java.util.Map<K, V> r8, androidx.datastore.preferences.protobuf.I.a<K, V> r9, androidx.datastore.preferences.protobuf.C2069o r10) throws androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException {
        /*
            r7 = this;
            r0 = 2
            r7.W(r0)
            androidx.datastore.preferences.protobuf.i r1 = r7.f24982a
            int r1 = r1.C()
            androidx.datastore.preferences.protobuf.i r2 = r7.f24982a
            int r1 = r2.l(r1)
            K r2 = r9.f24861b
            V r3 = r9.f24863d
        L14:
            int r4 = r7.w()     // Catch: java.lang.Throwable -> L3a
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5e
            androidx.datastore.preferences.protobuf.i r5 = r7.f24982a     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r5.e()     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L26
            goto L5e
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L49
            if (r4 == r0) goto L3c
            boolean r4 = r7.C()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            if (r4 == 0) goto L34
            goto L14
        L34:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r4 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            throw r4     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
        L3a:
            r8 = move-exception
            goto L67
        L3c:
            androidx.datastore.preferences.protobuf.r0$b r4 = r9.f24862c     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            V r5 = r9.f24863d     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Object r3 = r7.R(r4, r5, r10)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L14
        L49:
            androidx.datastore.preferences.protobuf.r0$b r4 = r9.f24860a     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            r5 = 0
            java.lang.Object r2 = r7.R(r4, r5, r5)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L14
        L51:
            boolean r4 = r7.C()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L58
            goto L14
        L58:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r8 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        L5e:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L3a
            androidx.datastore.preferences.protobuf.i r8 = r7.f24982a
            r8.k(r1)
            return
        L67:
            androidx.datastore.preferences.protobuf.i r9 = r7.f24982a
            r9.k(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C2064j.M(java.util.Map, androidx.datastore.preferences.protobuf.I$a, androidx.datastore.preferences.protobuf.o):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.e0
    public <T> void N(List<T> list, f0<T> f0Var, C2069o c2069o) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iB;
        if (r0.b(this.f24983b) != 3) {
            throw InvalidProtocolBufferException.d();
        }
        int i10 = this.f24983b;
        do {
            list.add(S(f0Var, c2069o));
            if (this.f24982a.e() || this.f24985d != 0) {
                return;
            } else {
                iB = this.f24982a.B();
            }
        } while (iB == i10);
        this.f24985d = iB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.e0
    public <T> void O(List<T> list, f0<T> f0Var, C2069o c2069o) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iB;
        if (r0.b(this.f24983b) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int i10 = this.f24983b;
        do {
            list.add(T(f0Var, c2069o));
            if (this.f24982a.e() || this.f24985d != 0) {
                return;
            } else {
                iB = this.f24982a.B();
            }
        } while (iB == i10);
        this.f24985d = iB;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public <T> T P(f0<T> f0Var, C2069o c2069o) throws InvalidProtocolBufferException.InvalidWireTypeException {
        W(3);
        return (T) S(f0Var, c2069o);
    }

    public void U(List<String> list, boolean z10) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iB;
        int iB2;
        if (r0.b(this.f24983b) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        if (!(list instanceof E) || z10) {
            do {
                list.add(z10 ? H() : v());
                if (this.f24982a.e()) {
                    return;
                } else {
                    iB = this.f24982a.B();
                }
            } while (iB == this.f24983b);
            this.f24985d = iB;
            return;
        }
        E e10 = (E) list;
        do {
            e10.i0(z());
            if (this.f24982a.e()) {
                return;
            } else {
                iB2 = this.f24982a.B();
            }
        } while (iB2 == this.f24983b);
        this.f24985d = iB2;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int a() {
        return this.f24983b;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void b(List<Integer> list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof C2078y)) {
            int iB3 = r0.b(this.f24983b);
            if (iB3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f24982a.x()));
                    if (this.f24982a.e()) {
                        return;
                    } else {
                        iB = this.f24982a.B();
                    }
                } while (iB == this.f24983b);
                this.f24985d = iB;
                return;
            }
            if (iB3 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD = this.f24982a.d() + this.f24982a.C();
            do {
                list.add(Integer.valueOf(this.f24982a.x()));
            } while (this.f24982a.d() < iD);
            V(iD);
            return;
        }
        C2078y c2078y = (C2078y) list;
        int iB4 = r0.b(this.f24983b);
        if (iB4 == 0) {
            do {
                c2078y.X(this.f24982a.x());
                if (this.f24982a.e()) {
                    return;
                } else {
                    iB2 = this.f24982a.B();
                }
            } while (iB2 == this.f24983b);
            this.f24985d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD2 = this.f24982a.d() + this.f24982a.C();
        do {
            c2078y.X(this.f24982a.x());
        } while (this.f24982a.d() < iD2);
        V(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public long c() throws InvalidProtocolBufferException.InvalidWireTypeException {
        W(0);
        return this.f24982a.D();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public long d() throws InvalidProtocolBufferException.InvalidWireTypeException {
        W(1);
        return this.f24982a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void e(List<Integer> list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof C2078y)) {
            int iB3 = r0.b(this.f24983b);
            if (iB3 == 2) {
                int iC = this.f24982a.C();
                X(iC);
                int iD = this.f24982a.d() + iC;
                do {
                    list.add(Integer.valueOf(this.f24982a.v()));
                } while (this.f24982a.d() < iD);
                return;
            }
            if (iB3 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Integer.valueOf(this.f24982a.v()));
                if (this.f24982a.e()) {
                    return;
                } else {
                    iB = this.f24982a.B();
                }
            } while (iB == this.f24983b);
            this.f24985d = iB;
            return;
        }
        C2078y c2078y = (C2078y) list;
        int iB4 = r0.b(this.f24983b);
        if (iB4 == 2) {
            int iC2 = this.f24982a.C();
            X(iC2);
            int iD2 = this.f24982a.d() + iC2;
            do {
                c2078y.X(this.f24982a.v());
            } while (this.f24982a.d() < iD2);
            return;
        }
        if (iB4 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            c2078y.X(this.f24982a.v());
            if (this.f24982a.e()) {
                return;
            } else {
                iB2 = this.f24982a.B();
            }
        } while (iB2 == this.f24983b);
        this.f24985d = iB2;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void f(List<Long> list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof G)) {
            int iB3 = r0.b(this.f24983b);
            if (iB3 == 0) {
                do {
                    list.add(Long.valueOf(this.f24982a.y()));
                    if (this.f24982a.e()) {
                        return;
                    } else {
                        iB = this.f24982a.B();
                    }
                } while (iB == this.f24983b);
                this.f24985d = iB;
                return;
            }
            if (iB3 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD = this.f24982a.d() + this.f24982a.C();
            do {
                list.add(Long.valueOf(this.f24982a.y()));
            } while (this.f24982a.d() < iD);
            V(iD);
            return;
        }
        G g10 = (G) list;
        int iB4 = r0.b(this.f24983b);
        if (iB4 == 0) {
            do {
                g10.j(this.f24982a.y());
                if (this.f24982a.e()) {
                    return;
                } else {
                    iB2 = this.f24982a.B();
                }
            } while (iB2 == this.f24983b);
            this.f24985d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD2 = this.f24982a.d() + this.f24982a.C();
        do {
            g10.j(this.f24982a.y());
        } while (this.f24982a.d() < iD2);
        V(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void g(List<Integer> list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof C2078y)) {
            int iB3 = r0.b(this.f24983b);
            if (iB3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f24982a.C()));
                    if (this.f24982a.e()) {
                        return;
                    } else {
                        iB = this.f24982a.B();
                    }
                } while (iB == this.f24983b);
                this.f24985d = iB;
                return;
            }
            if (iB3 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD = this.f24982a.d() + this.f24982a.C();
            do {
                list.add(Integer.valueOf(this.f24982a.C()));
            } while (this.f24982a.d() < iD);
            V(iD);
            return;
        }
        C2078y c2078y = (C2078y) list;
        int iB4 = r0.b(this.f24983b);
        if (iB4 == 0) {
            do {
                c2078y.X(this.f24982a.C());
                if (this.f24982a.e()) {
                    return;
                } else {
                    iB2 = this.f24982a.B();
                }
            } while (iB2 == this.f24983b);
            this.f24985d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD2 = this.f24982a.d() + this.f24982a.C();
        do {
            c2078y.X(this.f24982a.C());
        } while (this.f24982a.d() < iD2);
        V(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int h() throws InvalidProtocolBufferException.InvalidWireTypeException {
        W(5);
        return this.f24982a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public boolean i() throws InvalidProtocolBufferException.InvalidWireTypeException {
        W(0);
        return this.f24982a.m();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public long j() throws InvalidProtocolBufferException.InvalidWireTypeException {
        W(1);
        return this.f24982a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void k(List<Long> list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof G)) {
            int iB3 = r0.b(this.f24983b);
            if (iB3 == 0) {
                do {
                    list.add(Long.valueOf(this.f24982a.D()));
                    if (this.f24982a.e()) {
                        return;
                    } else {
                        iB = this.f24982a.B();
                    }
                } while (iB == this.f24983b);
                this.f24985d = iB;
                return;
            }
            if (iB3 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD = this.f24982a.d() + this.f24982a.C();
            do {
                list.add(Long.valueOf(this.f24982a.D()));
            } while (this.f24982a.d() < iD);
            V(iD);
            return;
        }
        G g10 = (G) list;
        int iB4 = r0.b(this.f24983b);
        if (iB4 == 0) {
            do {
                g10.j(this.f24982a.D());
                if (this.f24982a.e()) {
                    return;
                } else {
                    iB2 = this.f24982a.B();
                }
            } while (iB2 == this.f24983b);
            this.f24985d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD2 = this.f24982a.d() + this.f24982a.C();
        do {
            g10.j(this.f24982a.D());
        } while (this.f24982a.d() < iD2);
        V(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int l() throws InvalidProtocolBufferException.InvalidWireTypeException {
        W(0);
        return this.f24982a.C();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void m(List<Long> list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof G)) {
            int iB3 = r0.b(this.f24983b);
            if (iB3 == 0) {
                do {
                    list.add(Long.valueOf(this.f24982a.u()));
                    if (this.f24982a.e()) {
                        return;
                    } else {
                        iB = this.f24982a.B();
                    }
                } while (iB == this.f24983b);
                this.f24985d = iB;
                return;
            }
            if (iB3 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD = this.f24982a.d() + this.f24982a.C();
            do {
                list.add(Long.valueOf(this.f24982a.u()));
            } while (this.f24982a.d() < iD);
            V(iD);
            return;
        }
        G g10 = (G) list;
        int iB4 = r0.b(this.f24983b);
        if (iB4 == 0) {
            do {
                g10.j(this.f24982a.u());
                if (this.f24982a.e()) {
                    return;
                } else {
                    iB2 = this.f24982a.B();
                }
            } while (iB2 == this.f24983b);
            this.f24985d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD2 = this.f24982a.d() + this.f24982a.C();
        do {
            g10.j(this.f24982a.u());
        } while (this.f24982a.d() < iD2);
        V(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void n(List<Long> list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof G)) {
            int iB3 = r0.b(this.f24983b);
            if (iB3 == 1) {
                do {
                    list.add(Long.valueOf(this.f24982a.w()));
                    if (this.f24982a.e()) {
                        return;
                    } else {
                        iB = this.f24982a.B();
                    }
                } while (iB == this.f24983b);
                this.f24985d = iB;
                return;
            }
            if (iB3 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iC = this.f24982a.C();
            Y(iC);
            int iD = this.f24982a.d() + iC;
            do {
                list.add(Long.valueOf(this.f24982a.w()));
            } while (this.f24982a.d() < iD);
            return;
        }
        G g10 = (G) list;
        int iB4 = r0.b(this.f24983b);
        if (iB4 == 1) {
            do {
                g10.j(this.f24982a.w());
                if (this.f24982a.e()) {
                    return;
                } else {
                    iB2 = this.f24982a.B();
                }
            } while (iB2 == this.f24983b);
            this.f24985d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iC2 = this.f24982a.C();
        Y(iC2);
        int iD2 = this.f24982a.d() + iC2;
        do {
            g10.j(this.f24982a.w());
        } while (this.f24982a.d() < iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void o(List<Integer> list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof C2078y)) {
            int iB3 = r0.b(this.f24983b);
            if (iB3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f24982a.t()));
                    if (this.f24982a.e()) {
                        return;
                    } else {
                        iB = this.f24982a.B();
                    }
                } while (iB == this.f24983b);
                this.f24985d = iB;
                return;
            }
            if (iB3 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD = this.f24982a.d() + this.f24982a.C();
            do {
                list.add(Integer.valueOf(this.f24982a.t()));
            } while (this.f24982a.d() < iD);
            V(iD);
            return;
        }
        C2078y c2078y = (C2078y) list;
        int iB4 = r0.b(this.f24983b);
        if (iB4 == 0) {
            do {
                c2078y.X(this.f24982a.t());
                if (this.f24982a.e()) {
                    return;
                } else {
                    iB2 = this.f24982a.B();
                }
            } while (iB2 == this.f24983b);
            this.f24985d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD2 = this.f24982a.d() + this.f24982a.C();
        do {
            c2078y.X(this.f24982a.t());
        } while (this.f24982a.d() < iD2);
        V(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void p(List<Integer> list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof C2078y)) {
            int iB3 = r0.b(this.f24983b);
            if (iB3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f24982a.p()));
                    if (this.f24982a.e()) {
                        return;
                    } else {
                        iB = this.f24982a.B();
                    }
                } while (iB == this.f24983b);
                this.f24985d = iB;
                return;
            }
            if (iB3 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD = this.f24982a.d() + this.f24982a.C();
            do {
                list.add(Integer.valueOf(this.f24982a.p()));
            } while (this.f24982a.d() < iD);
            V(iD);
            return;
        }
        C2078y c2078y = (C2078y) list;
        int iB4 = r0.b(this.f24983b);
        if (iB4 == 0) {
            do {
                c2078y.X(this.f24982a.p());
                if (this.f24982a.e()) {
                    return;
                } else {
                    iB2 = this.f24982a.B();
                }
            } while (iB2 == this.f24983b);
            this.f24985d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD2 = this.f24982a.d() + this.f24982a.C();
        do {
            c2078y.X(this.f24982a.p());
        } while (this.f24982a.d() < iD2);
        V(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int q() throws InvalidProtocolBufferException.InvalidWireTypeException {
        W(0);
        return this.f24982a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void r(List<Integer> list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof C2078y)) {
            int iB3 = r0.b(this.f24983b);
            if (iB3 == 2) {
                int iC = this.f24982a.C();
                X(iC);
                int iD = this.f24982a.d() + iC;
                do {
                    list.add(Integer.valueOf(this.f24982a.q()));
                } while (this.f24982a.d() < iD);
                return;
            }
            if (iB3 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Integer.valueOf(this.f24982a.q()));
                if (this.f24982a.e()) {
                    return;
                } else {
                    iB = this.f24982a.B();
                }
            } while (iB == this.f24983b);
            this.f24985d = iB;
            return;
        }
        C2078y c2078y = (C2078y) list;
        int iB4 = r0.b(this.f24983b);
        if (iB4 == 2) {
            int iC2 = this.f24982a.C();
            X(iC2);
            int iD2 = this.f24982a.d() + iC2;
            do {
                c2078y.X(this.f24982a.q());
            } while (this.f24982a.d() < iD2);
            return;
        }
        if (iB4 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            c2078y.X(this.f24982a.q());
            if (this.f24982a.e()) {
                return;
            } else {
                iB2 = this.f24982a.B();
            }
        } while (iB2 == this.f24983b);
        this.f24985d = iB2;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public double readDouble() throws InvalidProtocolBufferException.InvalidWireTypeException {
        W(1);
        return this.f24982a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public float readFloat() throws InvalidProtocolBufferException.InvalidWireTypeException {
        W(5);
        return this.f24982a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int s() throws InvalidProtocolBufferException.InvalidWireTypeException {
        W(0);
        return this.f24982a.x();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public long t() throws InvalidProtocolBufferException.InvalidWireTypeException {
        W(0);
        return this.f24982a.y();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void u(List<Boolean> list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof C2060f)) {
            int iB3 = r0.b(this.f24983b);
            if (iB3 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f24982a.m()));
                    if (this.f24982a.e()) {
                        return;
                    } else {
                        iB = this.f24982a.B();
                    }
                } while (iB == this.f24983b);
                this.f24985d = iB;
                return;
            }
            if (iB3 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD = this.f24982a.d() + this.f24982a.C();
            do {
                list.add(Boolean.valueOf(this.f24982a.m()));
            } while (this.f24982a.d() < iD);
            V(iD);
            return;
        }
        C2060f c2060f = (C2060f) list;
        int iB4 = r0.b(this.f24983b);
        if (iB4 == 0) {
            do {
                c2060f.j(this.f24982a.m());
                if (this.f24982a.e()) {
                    return;
                } else {
                    iB2 = this.f24982a.B();
                }
            } while (iB2 == this.f24983b);
            this.f24985d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD2 = this.f24982a.d() + this.f24982a.C();
        do {
            c2060f.j(this.f24982a.m());
        } while (this.f24982a.d() < iD2);
        V(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public String v() throws InvalidProtocolBufferException.InvalidWireTypeException {
        W(2);
        return this.f24982a.z();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int w() {
        int i10 = this.f24985d;
        if (i10 != 0) {
            this.f24983b = i10;
            this.f24985d = 0;
        } else {
            this.f24983b = this.f24982a.B();
        }
        int i11 = this.f24983b;
        if (i11 == 0 || i11 == this.f24984c) {
            return Integer.MAX_VALUE;
        }
        return r0.a(i11);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void x(List<String> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void y(List<String> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        U(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public AbstractC2062h z() throws InvalidProtocolBufferException.InvalidWireTypeException {
        W(2);
        return this.f24982a.n();
    }
}
