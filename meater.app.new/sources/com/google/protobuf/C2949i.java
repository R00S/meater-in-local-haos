package com.google.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.r0;
import java.util.List;

/* compiled from: CodedInputStreamReader.java */
/* renamed from: com.google.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2949i implements e0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC2948h f39268a;

    /* renamed from: b, reason: collision with root package name */
    private int f39269b;

    /* renamed from: c, reason: collision with root package name */
    private int f39270c;

    /* renamed from: d, reason: collision with root package name */
    private int f39271d = 0;

    /* compiled from: CodedInputStreamReader.java */
    /* renamed from: com.google.protobuf.i$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f39272a;

        static {
            int[] iArr = new int[r0.b.values().length];
            f39272a = iArr;
            try {
                iArr[r0.b.f39364K.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39272a[r0.b.f39368O.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39272a[r0.b.f39357D.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39272a[r0.b.f39370Q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f39272a[r0.b.f39363J.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f39272a[r0.b.f39362I.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f39272a[r0.b.f39358E.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f39272a[r0.b.f39361H.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f39272a[r0.b.f39359F.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f39272a[r0.b.f39367N.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f39272a[r0.b.f39371R.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f39272a[r0.b.f39372S.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f39272a[r0.b.f39373T.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f39272a[r0.b.f39374U.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f39272a[r0.b.f39365L.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f39272a[r0.b.f39369P.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f39272a[r0.b.f39360G.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private C2949i(AbstractC2948h abstractC2948h) {
        AbstractC2948h abstractC2948h2 = (AbstractC2948h) C2964y.b(abstractC2948h, "input");
        this.f39268a = abstractC2948h2;
        abstractC2948h2.f39254d = this;
    }

    public static C2949i Q(AbstractC2948h abstractC2948h) {
        C2949i c2949i = abstractC2948h.f39254d;
        return c2949i != null ? c2949i : new C2949i(abstractC2948h);
    }

    private <T> void R(T t10, f0<T> f0Var, C2954n c2954n) {
        int i10 = this.f39270c;
        this.f39270c = r0.c(r0.a(this.f39269b), 4);
        try {
            f0Var.i(t10, this, c2954n);
            if (this.f39269b == this.f39270c) {
            } else {
                throw InvalidProtocolBufferException.h();
            }
        } finally {
            this.f39270c = i10;
        }
    }

    private <T> void S(T t10, f0<T> f0Var, C2954n c2954n) throws InvalidProtocolBufferException {
        int iB = this.f39268a.B();
        AbstractC2948h abstractC2948h = this.f39268a;
        if (abstractC2948h.f39251a >= abstractC2948h.f39252b) {
            throw InvalidProtocolBufferException.i();
        }
        int iK = abstractC2948h.k(iB);
        this.f39268a.f39251a++;
        f0Var.i(t10, this, c2954n);
        this.f39268a.a(0);
        r5.f39251a--;
        this.f39268a.j(iK);
    }

    private Object T(r0.b bVar, Class<?> cls, C2954n c2954n) {
        switch (a.f39272a[bVar.ordinal()]) {
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
                return K(cls, c2954n);
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
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private <T> T U(f0<T> f0Var, C2954n c2954n) {
        T tF = f0Var.f();
        R(tF, f0Var, c2954n);
        f0Var.b(tF);
        return tF;
    }

    private <T> T V(f0<T> f0Var, C2954n c2954n) throws InvalidProtocolBufferException {
        T tF = f0Var.f();
        S(tF, f0Var, c2954n);
        f0Var.b(tF);
        return tF;
    }

    private void X(int i10) throws InvalidProtocolBufferException {
        if (this.f39268a.e() != i10) {
            throw InvalidProtocolBufferException.k();
        }
    }

    private void Y(int i10) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if (r0.b(this.f39269b) != i10) {
            throw InvalidProtocolBufferException.e();
        }
    }

    private void Z(int i10) throws InvalidProtocolBufferException {
        if ((i10 & 3) != 0) {
            throw InvalidProtocolBufferException.h();
        }
    }

    private void a0(int i10) throws InvalidProtocolBufferException {
        if ((i10 & 7) != 0) {
            throw InvalidProtocolBufferException.h();
        }
    }

    @Override // com.google.protobuf.e0
    public void A(List<Float> list) throws InvalidProtocolBufferException {
        int iA;
        int iA2;
        if (!(list instanceof C2960u)) {
            int iB = r0.b(this.f39269b);
            if (iB == 2) {
                int iB2 = this.f39268a.B();
                Z(iB2);
                int iE = this.f39268a.e() + iB2;
                do {
                    list.add(Float.valueOf(this.f39268a.r()));
                } while (this.f39268a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Float.valueOf(this.f39268a.r()));
                if (this.f39268a.f()) {
                    return;
                } else {
                    iA = this.f39268a.A();
                }
            } while (iA == this.f39269b);
            this.f39271d = iA;
            return;
        }
        C2960u c2960u = (C2960u) list;
        int iB3 = r0.b(this.f39269b);
        if (iB3 == 2) {
            int iB4 = this.f39268a.B();
            Z(iB4);
            int iE2 = this.f39268a.e() + iB4;
            do {
                c2960u.i(this.f39268a.r());
            } while (this.f39268a.e() < iE2);
            return;
        }
        if (iB3 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            c2960u.i(this.f39268a.r());
            if (this.f39268a.f()) {
                return;
            } else {
                iA2 = this.f39268a.A();
            }
        } while (iA2 == this.f39269b);
        this.f39271d = iA2;
    }

    @Override // com.google.protobuf.e0
    public int B() throws InvalidProtocolBufferException.InvalidWireTypeException {
        Y(0);
        return this.f39268a.s();
    }

    @Override // com.google.protobuf.e0
    public boolean C() {
        int i10;
        if (this.f39268a.f() || (i10 = this.f39269b) == this.f39270c) {
            return false;
        }
        return this.f39268a.D(i10);
    }

    @Override // com.google.protobuf.e0
    public int D() throws InvalidProtocolBufferException.InvalidWireTypeException {
        Y(5);
        return this.f39268a.u();
    }

    @Override // com.google.protobuf.e0
    public void E(List<AbstractC2947g> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iA;
        if (r0.b(this.f39269b) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            list.add(z());
            if (this.f39268a.f()) {
                return;
            } else {
                iA = this.f39268a.A();
            }
        } while (iA == this.f39269b);
        this.f39271d = iA;
    }

    @Override // com.google.protobuf.e0
    public void F(List<Double> list) throws InvalidProtocolBufferException {
        int iA;
        int iA2;
        if (!(list instanceof C2951k)) {
            int iB = r0.b(this.f39269b);
            if (iB == 1) {
                do {
                    list.add(Double.valueOf(this.f39268a.n()));
                    if (this.f39268a.f()) {
                        return;
                    } else {
                        iA = this.f39268a.A();
                    }
                } while (iA == this.f39269b);
                this.f39271d = iA;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iB2 = this.f39268a.B();
            a0(iB2);
            int iE = this.f39268a.e() + iB2;
            do {
                list.add(Double.valueOf(this.f39268a.n()));
            } while (this.f39268a.e() < iE);
            return;
        }
        C2951k c2951k = (C2951k) list;
        int iB3 = r0.b(this.f39269b);
        if (iB3 == 1) {
            do {
                c2951k.i(this.f39268a.n());
                if (this.f39268a.f()) {
                    return;
                } else {
                    iA2 = this.f39268a.A();
                }
            } while (iA2 == this.f39269b);
            this.f39271d = iA2;
            return;
        }
        if (iB3 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iB4 = this.f39268a.B();
        a0(iB4);
        int iE2 = this.f39268a.e() + iB4;
        do {
            c2951k.i(this.f39268a.n());
        } while (this.f39268a.e() < iE2);
    }

    @Override // com.google.protobuf.e0
    public long G() throws InvalidProtocolBufferException.InvalidWireTypeException {
        Y(0);
        return this.f39268a.t();
    }

    @Override // com.google.protobuf.e0
    public String H() throws InvalidProtocolBufferException.InvalidWireTypeException {
        Y(2);
        return this.f39268a.z();
    }

    @Override // com.google.protobuf.e0
    public void I(List<Long> list) throws InvalidProtocolBufferException {
        int iA;
        int iA2;
        if (!(list instanceof G)) {
            int iB = r0.b(this.f39269b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f39268a.q()));
                    if (this.f39268a.f()) {
                        return;
                    } else {
                        iA = this.f39268a.A();
                    }
                } while (iA == this.f39269b);
                this.f39271d = iA;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iB2 = this.f39268a.B();
            a0(iB2);
            int iE = this.f39268a.e() + iB2;
            do {
                list.add(Long.valueOf(this.f39268a.q()));
            } while (this.f39268a.e() < iE);
            return;
        }
        G g10 = (G) list;
        int iB3 = r0.b(this.f39269b);
        if (iB3 == 1) {
            do {
                g10.j(this.f39268a.q());
                if (this.f39268a.f()) {
                    return;
                } else {
                    iA2 = this.f39268a.A();
                }
            } while (iA2 == this.f39269b);
            this.f39271d = iA2;
            return;
        }
        if (iB3 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iB4 = this.f39268a.B();
        a0(iB4);
        int iE2 = this.f39268a.e() + iB4;
        do {
            g10.j(this.f39268a.q());
        } while (this.f39268a.e() < iE2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.e0
    @Deprecated
    public <T> void J(List<T> list, f0<T> f0Var, C2954n c2954n) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iA;
        if (r0.b(this.f39269b) != 3) {
            throw InvalidProtocolBufferException.e();
        }
        int i10 = this.f39269b;
        do {
            list.add(U(f0Var, c2954n));
            if (this.f39268a.f() || this.f39271d != 0) {
                return;
            } else {
                iA = this.f39268a.A();
            }
        } while (iA == i10);
        this.f39271d = iA;
    }

    @Override // com.google.protobuf.e0
    public <T> T K(Class<T> cls, C2954n c2954n) throws InvalidProtocolBufferException.InvalidWireTypeException {
        Y(2);
        return (T) V(b0.a().c(cls), c2954n);
    }

    @Override // com.google.protobuf.e0
    public <T> void L(T t10, f0<T> f0Var, C2954n c2954n) throws InvalidProtocolBufferException.InvalidWireTypeException {
        Y(3);
        R(t10, f0Var, c2954n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.e0
    public <T> void M(List<T> list, f0<T> f0Var, C2954n c2954n) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iA;
        if (r0.b(this.f39269b) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int i10 = this.f39269b;
        do {
            list.add(V(f0Var, c2954n));
            if (this.f39268a.f() || this.f39271d != 0) {
                return;
            } else {
                iA = this.f39268a.A();
            }
        } while (iA == i10);
        this.f39271d = iA;
    }

    @Override // com.google.protobuf.e0
    @Deprecated
    public <T> T N(Class<T> cls, C2954n c2954n) throws InvalidProtocolBufferException.InvalidWireTypeException {
        Y(3);
        return (T) U(b0.a().c(cls), c2954n);
    }

    @Override // com.google.protobuf.e0
    public <T> void O(T t10, f0<T> f0Var, C2954n c2954n) throws InvalidProtocolBufferException {
        Y(2);
        S(t10, f0Var, c2954n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r7.f39268a.j(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <K, V> void P(java.util.Map<K, V> r8, com.google.protobuf.I.a<K, V> r9, com.google.protobuf.C2954n r10) throws com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException {
        /*
            r7 = this;
            r0 = 2
            r7.Y(r0)
            com.google.protobuf.h r1 = r7.f39268a
            int r1 = r1.B()
            com.google.protobuf.h r2 = r7.f39268a
            int r1 = r2.k(r1)
            K r2 = r9.f39180b
            V r3 = r9.f39182d
        L14:
            int r4 = r7.w()     // Catch: java.lang.Throwable -> L3a
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5e
            com.google.protobuf.h r5 = r7.f39268a     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r5.f()     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L26
            goto L5e
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L49
            if (r4 == r0) goto L3c
            boolean r4 = r7.C()     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            if (r4 == 0) goto L34
            goto L14
        L34:
            com.google.protobuf.InvalidProtocolBufferException r4 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            throw r4     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
        L3a:
            r8 = move-exception
            goto L67
        L3c:
            com.google.protobuf.r0$b r4 = r9.f39181c     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            V r5 = r9.f39182d     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Object r3 = r7.T(r4, r5, r10)     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L14
        L49:
            com.google.protobuf.r0$b r4 = r9.f39179a     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            r5 = 0
            java.lang.Object r2 = r7.T(r4, r5, r5)     // Catch: java.lang.Throwable -> L3a com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L14
        L51:
            boolean r4 = r7.C()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L58
            goto L14
        L58:
            com.google.protobuf.InvalidProtocolBufferException r8 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        L5e:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L3a
            com.google.protobuf.h r8 = r7.f39268a
            r8.j(r1)
            return
        L67:
            com.google.protobuf.h r9 = r7.f39268a
            r9.j(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C2949i.P(java.util.Map, com.google.protobuf.I$a, com.google.protobuf.n):void");
    }

    public void W(List<String> list, boolean z10) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iA;
        int iA2;
        if (r0.b(this.f39269b) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        if (!(list instanceof E) || z10) {
            do {
                list.add(z10 ? H() : v());
                if (this.f39268a.f()) {
                    return;
                } else {
                    iA = this.f39268a.A();
                }
            } while (iA == this.f39269b);
            this.f39271d = iA;
            return;
        }
        E e10 = (E) list;
        do {
            e10.W(z());
            if (this.f39268a.f()) {
                return;
            } else {
                iA2 = this.f39268a.A();
            }
        } while (iA2 == this.f39269b);
        this.f39271d = iA2;
    }

    @Override // com.google.protobuf.e0
    public int a() {
        return this.f39269b;
    }

    @Override // com.google.protobuf.e0
    public void b(List<Integer> list) throws InvalidProtocolBufferException {
        int iA;
        int iA2;
        if (!(list instanceof C2963x)) {
            int iB = r0.b(this.f39269b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f39268a.w()));
                    if (this.f39268a.f()) {
                        return;
                    } else {
                        iA = this.f39268a.A();
                    }
                } while (iA == this.f39269b);
                this.f39271d = iA;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f39268a.e() + this.f39268a.B();
            do {
                list.add(Integer.valueOf(this.f39268a.w()));
            } while (this.f39268a.e() < iE);
            X(iE);
            return;
        }
        C2963x c2963x = (C2963x) list;
        int iB2 = r0.b(this.f39269b);
        if (iB2 == 0) {
            do {
                c2963x.X(this.f39268a.w());
                if (this.f39268a.f()) {
                    return;
                } else {
                    iA2 = this.f39268a.A();
                }
            } while (iA2 == this.f39269b);
            this.f39271d = iA2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f39268a.e() + this.f39268a.B();
        do {
            c2963x.X(this.f39268a.w());
        } while (this.f39268a.e() < iE2);
        X(iE2);
    }

    @Override // com.google.protobuf.e0
    public long c() throws InvalidProtocolBufferException.InvalidWireTypeException {
        Y(0);
        return this.f39268a.C();
    }

    @Override // com.google.protobuf.e0
    public long d() throws InvalidProtocolBufferException.InvalidWireTypeException {
        Y(1);
        return this.f39268a.q();
    }

    @Override // com.google.protobuf.e0
    public void e(List<Integer> list) throws InvalidProtocolBufferException {
        int iA;
        int iA2;
        if (!(list instanceof C2963x)) {
            int iB = r0.b(this.f39269b);
            if (iB == 2) {
                int iB2 = this.f39268a.B();
                Z(iB2);
                int iE = this.f39268a.e() + iB2;
                do {
                    list.add(Integer.valueOf(this.f39268a.u()));
                } while (this.f39268a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Integer.valueOf(this.f39268a.u()));
                if (this.f39268a.f()) {
                    return;
                } else {
                    iA = this.f39268a.A();
                }
            } while (iA == this.f39269b);
            this.f39271d = iA;
            return;
        }
        C2963x c2963x = (C2963x) list;
        int iB3 = r0.b(this.f39269b);
        if (iB3 == 2) {
            int iB4 = this.f39268a.B();
            Z(iB4);
            int iE2 = this.f39268a.e() + iB4;
            do {
                c2963x.X(this.f39268a.u());
            } while (this.f39268a.e() < iE2);
            return;
        }
        if (iB3 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            c2963x.X(this.f39268a.u());
            if (this.f39268a.f()) {
                return;
            } else {
                iA2 = this.f39268a.A();
            }
        } while (iA2 == this.f39269b);
        this.f39271d = iA2;
    }

    @Override // com.google.protobuf.e0
    public void f(List<Long> list) throws InvalidProtocolBufferException {
        int iA;
        int iA2;
        if (!(list instanceof G)) {
            int iB = r0.b(this.f39269b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f39268a.x()));
                    if (this.f39268a.f()) {
                        return;
                    } else {
                        iA = this.f39268a.A();
                    }
                } while (iA == this.f39269b);
                this.f39271d = iA;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f39268a.e() + this.f39268a.B();
            do {
                list.add(Long.valueOf(this.f39268a.x()));
            } while (this.f39268a.e() < iE);
            X(iE);
            return;
        }
        G g10 = (G) list;
        int iB2 = r0.b(this.f39269b);
        if (iB2 == 0) {
            do {
                g10.j(this.f39268a.x());
                if (this.f39268a.f()) {
                    return;
                } else {
                    iA2 = this.f39268a.A();
                }
            } while (iA2 == this.f39269b);
            this.f39271d = iA2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f39268a.e() + this.f39268a.B();
        do {
            g10.j(this.f39268a.x());
        } while (this.f39268a.e() < iE2);
        X(iE2);
    }

    @Override // com.google.protobuf.e0
    public void g(List<Integer> list) throws InvalidProtocolBufferException {
        int iA;
        int iA2;
        if (!(list instanceof C2963x)) {
            int iB = r0.b(this.f39269b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f39268a.B()));
                    if (this.f39268a.f()) {
                        return;
                    } else {
                        iA = this.f39268a.A();
                    }
                } while (iA == this.f39269b);
                this.f39271d = iA;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f39268a.e() + this.f39268a.B();
            do {
                list.add(Integer.valueOf(this.f39268a.B()));
            } while (this.f39268a.e() < iE);
            X(iE);
            return;
        }
        C2963x c2963x = (C2963x) list;
        int iB2 = r0.b(this.f39269b);
        if (iB2 == 0) {
            do {
                c2963x.X(this.f39268a.B());
                if (this.f39268a.f()) {
                    return;
                } else {
                    iA2 = this.f39268a.A();
                }
            } while (iA2 == this.f39269b);
            this.f39271d = iA2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f39268a.e() + this.f39268a.B();
        do {
            c2963x.X(this.f39268a.B());
        } while (this.f39268a.e() < iE2);
        X(iE2);
    }

    @Override // com.google.protobuf.e0
    public int h() throws InvalidProtocolBufferException.InvalidWireTypeException {
        Y(5);
        return this.f39268a.p();
    }

    @Override // com.google.protobuf.e0
    public boolean i() throws InvalidProtocolBufferException.InvalidWireTypeException {
        Y(0);
        return this.f39268a.l();
    }

    @Override // com.google.protobuf.e0
    public long j() throws InvalidProtocolBufferException.InvalidWireTypeException {
        Y(1);
        return this.f39268a.v();
    }

    @Override // com.google.protobuf.e0
    public void k(List<Long> list) throws InvalidProtocolBufferException {
        int iA;
        int iA2;
        if (!(list instanceof G)) {
            int iB = r0.b(this.f39269b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f39268a.C()));
                    if (this.f39268a.f()) {
                        return;
                    } else {
                        iA = this.f39268a.A();
                    }
                } while (iA == this.f39269b);
                this.f39271d = iA;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f39268a.e() + this.f39268a.B();
            do {
                list.add(Long.valueOf(this.f39268a.C()));
            } while (this.f39268a.e() < iE);
            X(iE);
            return;
        }
        G g10 = (G) list;
        int iB2 = r0.b(this.f39269b);
        if (iB2 == 0) {
            do {
                g10.j(this.f39268a.C());
                if (this.f39268a.f()) {
                    return;
                } else {
                    iA2 = this.f39268a.A();
                }
            } while (iA2 == this.f39269b);
            this.f39271d = iA2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f39268a.e() + this.f39268a.B();
        do {
            g10.j(this.f39268a.C());
        } while (this.f39268a.e() < iE2);
        X(iE2);
    }

    @Override // com.google.protobuf.e0
    public int l() throws InvalidProtocolBufferException.InvalidWireTypeException {
        Y(0);
        return this.f39268a.B();
    }

    @Override // com.google.protobuf.e0
    public void m(List<Long> list) throws InvalidProtocolBufferException {
        int iA;
        int iA2;
        if (!(list instanceof G)) {
            int iB = r0.b(this.f39269b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f39268a.t()));
                    if (this.f39268a.f()) {
                        return;
                    } else {
                        iA = this.f39268a.A();
                    }
                } while (iA == this.f39269b);
                this.f39271d = iA;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f39268a.e() + this.f39268a.B();
            do {
                list.add(Long.valueOf(this.f39268a.t()));
            } while (this.f39268a.e() < iE);
            X(iE);
            return;
        }
        G g10 = (G) list;
        int iB2 = r0.b(this.f39269b);
        if (iB2 == 0) {
            do {
                g10.j(this.f39268a.t());
                if (this.f39268a.f()) {
                    return;
                } else {
                    iA2 = this.f39268a.A();
                }
            } while (iA2 == this.f39269b);
            this.f39271d = iA2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f39268a.e() + this.f39268a.B();
        do {
            g10.j(this.f39268a.t());
        } while (this.f39268a.e() < iE2);
        X(iE2);
    }

    @Override // com.google.protobuf.e0
    public void n(List<Long> list) throws InvalidProtocolBufferException {
        int iA;
        int iA2;
        if (!(list instanceof G)) {
            int iB = r0.b(this.f39269b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f39268a.v()));
                    if (this.f39268a.f()) {
                        return;
                    } else {
                        iA = this.f39268a.A();
                    }
                } while (iA == this.f39269b);
                this.f39271d = iA;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iB2 = this.f39268a.B();
            a0(iB2);
            int iE = this.f39268a.e() + iB2;
            do {
                list.add(Long.valueOf(this.f39268a.v()));
            } while (this.f39268a.e() < iE);
            return;
        }
        G g10 = (G) list;
        int iB3 = r0.b(this.f39269b);
        if (iB3 == 1) {
            do {
                g10.j(this.f39268a.v());
                if (this.f39268a.f()) {
                    return;
                } else {
                    iA2 = this.f39268a.A();
                }
            } while (iA2 == this.f39269b);
            this.f39271d = iA2;
            return;
        }
        if (iB3 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iB4 = this.f39268a.B();
        a0(iB4);
        int iE2 = this.f39268a.e() + iB4;
        do {
            g10.j(this.f39268a.v());
        } while (this.f39268a.e() < iE2);
    }

    @Override // com.google.protobuf.e0
    public void o(List<Integer> list) throws InvalidProtocolBufferException {
        int iA;
        int iA2;
        if (!(list instanceof C2963x)) {
            int iB = r0.b(this.f39269b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f39268a.s()));
                    if (this.f39268a.f()) {
                        return;
                    } else {
                        iA = this.f39268a.A();
                    }
                } while (iA == this.f39269b);
                this.f39271d = iA;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f39268a.e() + this.f39268a.B();
            do {
                list.add(Integer.valueOf(this.f39268a.s()));
            } while (this.f39268a.e() < iE);
            X(iE);
            return;
        }
        C2963x c2963x = (C2963x) list;
        int iB2 = r0.b(this.f39269b);
        if (iB2 == 0) {
            do {
                c2963x.X(this.f39268a.s());
                if (this.f39268a.f()) {
                    return;
                } else {
                    iA2 = this.f39268a.A();
                }
            } while (iA2 == this.f39269b);
            this.f39271d = iA2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f39268a.e() + this.f39268a.B();
        do {
            c2963x.X(this.f39268a.s());
        } while (this.f39268a.e() < iE2);
        X(iE2);
    }

    @Override // com.google.protobuf.e0
    public void p(List<Integer> list) throws InvalidProtocolBufferException {
        int iA;
        int iA2;
        if (!(list instanceof C2963x)) {
            int iB = r0.b(this.f39269b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f39268a.o()));
                    if (this.f39268a.f()) {
                        return;
                    } else {
                        iA = this.f39268a.A();
                    }
                } while (iA == this.f39269b);
                this.f39271d = iA;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f39268a.e() + this.f39268a.B();
            do {
                list.add(Integer.valueOf(this.f39268a.o()));
            } while (this.f39268a.e() < iE);
            X(iE);
            return;
        }
        C2963x c2963x = (C2963x) list;
        int iB2 = r0.b(this.f39269b);
        if (iB2 == 0) {
            do {
                c2963x.X(this.f39268a.o());
                if (this.f39268a.f()) {
                    return;
                } else {
                    iA2 = this.f39268a.A();
                }
            } while (iA2 == this.f39269b);
            this.f39271d = iA2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f39268a.e() + this.f39268a.B();
        do {
            c2963x.X(this.f39268a.o());
        } while (this.f39268a.e() < iE2);
        X(iE2);
    }

    @Override // com.google.protobuf.e0
    public int q() throws InvalidProtocolBufferException.InvalidWireTypeException {
        Y(0);
        return this.f39268a.o();
    }

    @Override // com.google.protobuf.e0
    public void r(List<Integer> list) throws InvalidProtocolBufferException {
        int iA;
        int iA2;
        if (!(list instanceof C2963x)) {
            int iB = r0.b(this.f39269b);
            if (iB == 2) {
                int iB2 = this.f39268a.B();
                Z(iB2);
                int iE = this.f39268a.e() + iB2;
                do {
                    list.add(Integer.valueOf(this.f39268a.p()));
                } while (this.f39268a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Integer.valueOf(this.f39268a.p()));
                if (this.f39268a.f()) {
                    return;
                } else {
                    iA = this.f39268a.A();
                }
            } while (iA == this.f39269b);
            this.f39271d = iA;
            return;
        }
        C2963x c2963x = (C2963x) list;
        int iB3 = r0.b(this.f39269b);
        if (iB3 == 2) {
            int iB4 = this.f39268a.B();
            Z(iB4);
            int iE2 = this.f39268a.e() + iB4;
            do {
                c2963x.X(this.f39268a.p());
            } while (this.f39268a.e() < iE2);
            return;
        }
        if (iB3 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            c2963x.X(this.f39268a.p());
            if (this.f39268a.f()) {
                return;
            } else {
                iA2 = this.f39268a.A();
            }
        } while (iA2 == this.f39269b);
        this.f39271d = iA2;
    }

    @Override // com.google.protobuf.e0
    public double readDouble() throws InvalidProtocolBufferException.InvalidWireTypeException {
        Y(1);
        return this.f39268a.n();
    }

    @Override // com.google.protobuf.e0
    public float readFloat() throws InvalidProtocolBufferException.InvalidWireTypeException {
        Y(5);
        return this.f39268a.r();
    }

    @Override // com.google.protobuf.e0
    public int s() throws InvalidProtocolBufferException.InvalidWireTypeException {
        Y(0);
        return this.f39268a.w();
    }

    @Override // com.google.protobuf.e0
    public long t() throws InvalidProtocolBufferException.InvalidWireTypeException {
        Y(0);
        return this.f39268a.x();
    }

    @Override // com.google.protobuf.e0
    public void u(List<Boolean> list) throws InvalidProtocolBufferException {
        int iA;
        int iA2;
        if (!(list instanceof C2945e)) {
            int iB = r0.b(this.f39269b);
            if (iB == 0) {
                do {
                    list.add(Boolean.valueOf(this.f39268a.l()));
                    if (this.f39268a.f()) {
                        return;
                    } else {
                        iA = this.f39268a.A();
                    }
                } while (iA == this.f39269b);
                this.f39271d = iA;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iE = this.f39268a.e() + this.f39268a.B();
            do {
                list.add(Boolean.valueOf(this.f39268a.l()));
            } while (this.f39268a.e() < iE);
            X(iE);
            return;
        }
        C2945e c2945e = (C2945e) list;
        int iB2 = r0.b(this.f39269b);
        if (iB2 == 0) {
            do {
                c2945e.j(this.f39268a.l());
                if (this.f39268a.f()) {
                    return;
                } else {
                    iA2 = this.f39268a.A();
                }
            } while (iA2 == this.f39269b);
            this.f39271d = iA2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iE2 = this.f39268a.e() + this.f39268a.B();
        do {
            c2945e.j(this.f39268a.l());
        } while (this.f39268a.e() < iE2);
        X(iE2);
    }

    @Override // com.google.protobuf.e0
    public String v() throws InvalidProtocolBufferException.InvalidWireTypeException {
        Y(2);
        return this.f39268a.y();
    }

    @Override // com.google.protobuf.e0
    public int w() {
        int i10 = this.f39271d;
        if (i10 != 0) {
            this.f39269b = i10;
            this.f39271d = 0;
        } else {
            this.f39269b = this.f39268a.A();
        }
        int i11 = this.f39269b;
        if (i11 == 0 || i11 == this.f39270c) {
            return Integer.MAX_VALUE;
        }
        return r0.a(i11);
    }

    @Override // com.google.protobuf.e0
    public void x(List<String> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        W(list, false);
    }

    @Override // com.google.protobuf.e0
    public void y(List<String> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        W(list, true);
    }

    @Override // com.google.protobuf.e0
    public AbstractC2947g z() throws InvalidProtocolBufferException.InvalidWireTypeException {
        Y(2);
        return this.f39268a.m();
    }
}
