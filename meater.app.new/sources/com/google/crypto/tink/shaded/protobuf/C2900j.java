package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.I;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.util.List;
import java.util.Map;

/* compiled from: CodedInputStreamReader.java */
/* renamed from: com.google.crypto.tink.shaded.protobuf.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2900j implements e0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC2899i f37861a;

    /* renamed from: b, reason: collision with root package name */
    private int f37862b;

    /* renamed from: c, reason: collision with root package name */
    private int f37863c;

    /* renamed from: d, reason: collision with root package name */
    private int f37864d = 0;

    private C2900j(AbstractC2899i abstractC2899i) {
        AbstractC2899i abstractC2899i2 = (AbstractC2899i) C2915z.b(abstractC2899i, "input");
        this.f37861a = abstractC2899i2;
        abstractC2899i2.f37821d = this;
    }

    public static C2900j Q(AbstractC2899i abstractC2899i) {
        C2900j c2900j = abstractC2899i.f37821d;
        return c2900j != null ? c2900j : new C2900j(abstractC2899i);
    }

    private <T> void R(T t10, f0<T> f0Var, C2905o c2905o) {
        int i10 = this.f37863c;
        this.f37863c = r0.c(r0.a(this.f37862b), 4);
        try {
            f0Var.j(t10, this, c2905o);
            if (this.f37862b == this.f37863c) {
            } else {
                throw InvalidProtocolBufferException.h();
            }
        } finally {
            this.f37863c = i10;
        }
    }

    private <T> void S(T t10, f0<T> f0Var, C2905o c2905o) throws InvalidProtocolBufferException {
        int iC = this.f37861a.C();
        AbstractC2899i abstractC2899i = this.f37861a;
        if (abstractC2899i.f37818a >= abstractC2899i.f37819b) {
            throw InvalidProtocolBufferException.i();
        }
        int iL = abstractC2899i.l(iC);
        this.f37861a.f37818a++;
        f0Var.j(t10, this, c2905o);
        this.f37861a.a(0);
        r5.f37818a--;
        this.f37861a.k(iL);
    }

    private <T> T T(f0<T> f0Var, C2905o c2905o) {
        T tF = f0Var.f();
        R(tF, f0Var, c2905o);
        f0Var.b(tF);
        return tF;
    }

    private <T> T U(f0<T> f0Var, C2905o c2905o) throws InvalidProtocolBufferException {
        T tF = f0Var.f();
        S(tF, f0Var, c2905o);
        f0Var.b(tF);
        return tF;
    }

    private void W(int i10) throws InvalidProtocolBufferException {
        if (this.f37861a.d() != i10) {
            throw InvalidProtocolBufferException.m();
        }
    }

    private void X(int i10) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if (r0.b(this.f37862b) != i10) {
            throw InvalidProtocolBufferException.e();
        }
    }

    private void Y(int i10) throws InvalidProtocolBufferException {
        if ((i10 & 3) != 0) {
            throw InvalidProtocolBufferException.h();
        }
    }

    private void Z(int i10) throws InvalidProtocolBufferException {
        if ((i10 & 7) != 0) {
            throw InvalidProtocolBufferException.h();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void A(List<Float> list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof C2911v)) {
            int iB3 = r0.b(this.f37862b);
            if (iB3 == 2) {
                int iC = this.f37861a.C();
                Y(iC);
                int iD = this.f37861a.d() + iC;
                do {
                    list.add(Float.valueOf(this.f37861a.s()));
                } while (this.f37861a.d() < iD);
                return;
            }
            if (iB3 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Float.valueOf(this.f37861a.s()));
                if (this.f37861a.e()) {
                    return;
                } else {
                    iB = this.f37861a.B();
                }
            } while (iB == this.f37862b);
            this.f37864d = iB;
            return;
        }
        C2911v c2911v = (C2911v) list;
        int iB4 = r0.b(this.f37862b);
        if (iB4 == 2) {
            int iC2 = this.f37861a.C();
            Y(iC2);
            int iD2 = this.f37861a.d() + iC2;
            do {
                c2911v.i(this.f37861a.s());
            } while (this.f37861a.d() < iD2);
            return;
        }
        if (iB4 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            c2911v.i(this.f37861a.s());
            if (this.f37861a.e()) {
                return;
            } else {
                iB2 = this.f37861a.B();
            }
        } while (iB2 == this.f37862b);
        this.f37864d = iB2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int B() throws InvalidProtocolBufferException.InvalidWireTypeException {
        X(0);
        return this.f37861a.t();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public boolean C() {
        int i10;
        if (this.f37861a.e() || (i10 = this.f37862b) == this.f37863c) {
            return false;
        }
        return this.f37861a.E(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int D() throws InvalidProtocolBufferException.InvalidWireTypeException {
        X(5);
        return this.f37861a.v();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void E(List<AbstractC2898h> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iB;
        if (r0.b(this.f37862b) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            list.add(z());
            if (this.f37861a.e()) {
                return;
            } else {
                iB = this.f37861a.B();
            }
        } while (iB == this.f37862b);
        this.f37864d = iB;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void F(List<Double> list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof C2902l)) {
            int iB3 = r0.b(this.f37862b);
            if (iB3 == 1) {
                do {
                    list.add(Double.valueOf(this.f37861a.o()));
                    if (this.f37861a.e()) {
                        return;
                    } else {
                        iB = this.f37861a.B();
                    }
                } while (iB == this.f37862b);
                this.f37864d = iB;
                return;
            }
            if (iB3 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iC = this.f37861a.C();
            Z(iC);
            int iD = this.f37861a.d() + iC;
            do {
                list.add(Double.valueOf(this.f37861a.o()));
            } while (this.f37861a.d() < iD);
            return;
        }
        C2902l c2902l = (C2902l) list;
        int iB4 = r0.b(this.f37862b);
        if (iB4 == 1) {
            do {
                c2902l.i(this.f37861a.o());
                if (this.f37861a.e()) {
                    return;
                } else {
                    iB2 = this.f37861a.B();
                }
            } while (iB2 == this.f37862b);
            this.f37864d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iC2 = this.f37861a.C();
        Z(iC2);
        int iD2 = this.f37861a.d() + iC2;
        do {
            c2902l.i(this.f37861a.o());
        } while (this.f37861a.d() < iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public long G() throws InvalidProtocolBufferException.InvalidWireTypeException {
        X(0);
        return this.f37861a.u();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public String H() throws InvalidProtocolBufferException.InvalidWireTypeException {
        X(2);
        return this.f37861a.A();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void I(List<Long> list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof G)) {
            int iB3 = r0.b(this.f37862b);
            if (iB3 == 1) {
                do {
                    list.add(Long.valueOf(this.f37861a.r()));
                    if (this.f37861a.e()) {
                        return;
                    } else {
                        iB = this.f37861a.B();
                    }
                } while (iB == this.f37862b);
                this.f37864d = iB;
                return;
            }
            if (iB3 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iC = this.f37861a.C();
            Z(iC);
            int iD = this.f37861a.d() + iC;
            do {
                list.add(Long.valueOf(this.f37861a.r()));
            } while (this.f37861a.d() < iD);
            return;
        }
        G g10 = (G) list;
        int iB4 = r0.b(this.f37862b);
        if (iB4 == 1) {
            do {
                g10.j(this.f37861a.r());
                if (this.f37861a.e()) {
                    return;
                } else {
                    iB2 = this.f37861a.B();
                }
            } while (iB2 == this.f37862b);
            this.f37864d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iC2 = this.f37861a.C();
        Z(iC2);
        int iD2 = this.f37861a.d() + iC2;
        do {
            g10.j(this.f37861a.r());
        } while (this.f37861a.d() < iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public <T> void J(T t10, f0<T> f0Var, C2905o c2905o) throws InvalidProtocolBufferException {
        X(2);
        S(t10, f0Var, c2905o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public <T> void K(List<T> list, f0<T> f0Var, C2905o c2905o) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iB;
        if (r0.b(this.f37862b) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int i10 = this.f37862b;
        do {
            list.add(U(f0Var, c2905o));
            if (this.f37861a.e() || this.f37864d != 0) {
                return;
            } else {
                iB = this.f37861a.B();
            }
        } while (iB == i10);
        this.f37864d = iB;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public <T> void L(T t10, f0<T> f0Var, C2905o c2905o) throws InvalidProtocolBufferException.InvalidWireTypeException {
        X(3);
        R(t10, f0Var, c2905o);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    @Deprecated
    public <T> T M(Class<T> cls, C2905o c2905o) throws InvalidProtocolBufferException.InvalidWireTypeException {
        X(3);
        return (T) T(b0.a().c(cls), c2905o);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public <T> T N(Class<T> cls, C2905o c2905o) throws InvalidProtocolBufferException.InvalidWireTypeException {
        X(2);
        return (T) U(b0.a().c(cls), c2905o);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public <K, V> void O(Map<K, V> map, I.a<K, V> aVar, C2905o c2905o) throws InvalidProtocolBufferException.InvalidWireTypeException {
        X(2);
        this.f37861a.l(this.f37861a.C());
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.e0
    @Deprecated
    public <T> void P(List<T> list, f0<T> f0Var, C2905o c2905o) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iB;
        if (r0.b(this.f37862b) != 3) {
            throw InvalidProtocolBufferException.e();
        }
        int i10 = this.f37862b;
        do {
            list.add(T(f0Var, c2905o));
            if (this.f37861a.e() || this.f37864d != 0) {
                return;
            } else {
                iB = this.f37861a.B();
            }
        } while (iB == i10);
        this.f37864d = iB;
    }

    public void V(List<String> list, boolean z10) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iB;
        int iB2;
        if (r0.b(this.f37862b) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        if (!(list instanceof E) || z10) {
            do {
                list.add(z10 ? H() : v());
                if (this.f37861a.e()) {
                    return;
                } else {
                    iB = this.f37861a.B();
                }
            } while (iB == this.f37862b);
            this.f37864d = iB;
            return;
        }
        E e10 = (E) list;
        do {
            e10.g1(z());
            if (this.f37861a.e()) {
                return;
            } else {
                iB2 = this.f37861a.B();
            }
        } while (iB2 == this.f37862b);
        this.f37864d = iB2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int a() {
        return this.f37862b;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void b(List<Integer> list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof C2914y)) {
            int iB3 = r0.b(this.f37862b);
            if (iB3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f37861a.x()));
                    if (this.f37861a.e()) {
                        return;
                    } else {
                        iB = this.f37861a.B();
                    }
                } while (iB == this.f37862b);
                this.f37864d = iB;
                return;
            }
            if (iB3 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iD = this.f37861a.d() + this.f37861a.C();
            do {
                list.add(Integer.valueOf(this.f37861a.x()));
            } while (this.f37861a.d() < iD);
            W(iD);
            return;
        }
        C2914y c2914y = (C2914y) list;
        int iB4 = r0.b(this.f37862b);
        if (iB4 == 0) {
            do {
                c2914y.X(this.f37861a.x());
                if (this.f37861a.e()) {
                    return;
                } else {
                    iB2 = this.f37861a.B();
                }
            } while (iB2 == this.f37862b);
            this.f37864d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iD2 = this.f37861a.d() + this.f37861a.C();
        do {
            c2914y.X(this.f37861a.x());
        } while (this.f37861a.d() < iD2);
        W(iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public long c() throws InvalidProtocolBufferException.InvalidWireTypeException {
        X(0);
        return this.f37861a.D();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public long d() throws InvalidProtocolBufferException.InvalidWireTypeException {
        X(1);
        return this.f37861a.r();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void e(List<Integer> list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof C2914y)) {
            int iB3 = r0.b(this.f37862b);
            if (iB3 == 2) {
                int iC = this.f37861a.C();
                Y(iC);
                int iD = this.f37861a.d() + iC;
                do {
                    list.add(Integer.valueOf(this.f37861a.v()));
                } while (this.f37861a.d() < iD);
                return;
            }
            if (iB3 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Integer.valueOf(this.f37861a.v()));
                if (this.f37861a.e()) {
                    return;
                } else {
                    iB = this.f37861a.B();
                }
            } while (iB == this.f37862b);
            this.f37864d = iB;
            return;
        }
        C2914y c2914y = (C2914y) list;
        int iB4 = r0.b(this.f37862b);
        if (iB4 == 2) {
            int iC2 = this.f37861a.C();
            Y(iC2);
            int iD2 = this.f37861a.d() + iC2;
            do {
                c2914y.X(this.f37861a.v());
            } while (this.f37861a.d() < iD2);
            return;
        }
        if (iB4 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            c2914y.X(this.f37861a.v());
            if (this.f37861a.e()) {
                return;
            } else {
                iB2 = this.f37861a.B();
            }
        } while (iB2 == this.f37862b);
        this.f37864d = iB2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void f(List<Long> list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof G)) {
            int iB3 = r0.b(this.f37862b);
            if (iB3 == 0) {
                do {
                    list.add(Long.valueOf(this.f37861a.y()));
                    if (this.f37861a.e()) {
                        return;
                    } else {
                        iB = this.f37861a.B();
                    }
                } while (iB == this.f37862b);
                this.f37864d = iB;
                return;
            }
            if (iB3 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iD = this.f37861a.d() + this.f37861a.C();
            do {
                list.add(Long.valueOf(this.f37861a.y()));
            } while (this.f37861a.d() < iD);
            W(iD);
            return;
        }
        G g10 = (G) list;
        int iB4 = r0.b(this.f37862b);
        if (iB4 == 0) {
            do {
                g10.j(this.f37861a.y());
                if (this.f37861a.e()) {
                    return;
                } else {
                    iB2 = this.f37861a.B();
                }
            } while (iB2 == this.f37862b);
            this.f37864d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iD2 = this.f37861a.d() + this.f37861a.C();
        do {
            g10.j(this.f37861a.y());
        } while (this.f37861a.d() < iD2);
        W(iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void g(List<Integer> list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof C2914y)) {
            int iB3 = r0.b(this.f37862b);
            if (iB3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f37861a.C()));
                    if (this.f37861a.e()) {
                        return;
                    } else {
                        iB = this.f37861a.B();
                    }
                } while (iB == this.f37862b);
                this.f37864d = iB;
                return;
            }
            if (iB3 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iD = this.f37861a.d() + this.f37861a.C();
            do {
                list.add(Integer.valueOf(this.f37861a.C()));
            } while (this.f37861a.d() < iD);
            W(iD);
            return;
        }
        C2914y c2914y = (C2914y) list;
        int iB4 = r0.b(this.f37862b);
        if (iB4 == 0) {
            do {
                c2914y.X(this.f37861a.C());
                if (this.f37861a.e()) {
                    return;
                } else {
                    iB2 = this.f37861a.B();
                }
            } while (iB2 == this.f37862b);
            this.f37864d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iD2 = this.f37861a.d() + this.f37861a.C();
        do {
            c2914y.X(this.f37861a.C());
        } while (this.f37861a.d() < iD2);
        W(iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int h() throws InvalidProtocolBufferException.InvalidWireTypeException {
        X(5);
        return this.f37861a.q();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public boolean i() throws InvalidProtocolBufferException.InvalidWireTypeException {
        X(0);
        return this.f37861a.m();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public long j() throws InvalidProtocolBufferException.InvalidWireTypeException {
        X(1);
        return this.f37861a.w();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void k(List<Long> list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof G)) {
            int iB3 = r0.b(this.f37862b);
            if (iB3 == 0) {
                do {
                    list.add(Long.valueOf(this.f37861a.D()));
                    if (this.f37861a.e()) {
                        return;
                    } else {
                        iB = this.f37861a.B();
                    }
                } while (iB == this.f37862b);
                this.f37864d = iB;
                return;
            }
            if (iB3 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iD = this.f37861a.d() + this.f37861a.C();
            do {
                list.add(Long.valueOf(this.f37861a.D()));
            } while (this.f37861a.d() < iD);
            W(iD);
            return;
        }
        G g10 = (G) list;
        int iB4 = r0.b(this.f37862b);
        if (iB4 == 0) {
            do {
                g10.j(this.f37861a.D());
                if (this.f37861a.e()) {
                    return;
                } else {
                    iB2 = this.f37861a.B();
                }
            } while (iB2 == this.f37862b);
            this.f37864d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iD2 = this.f37861a.d() + this.f37861a.C();
        do {
            g10.j(this.f37861a.D());
        } while (this.f37861a.d() < iD2);
        W(iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int l() throws InvalidProtocolBufferException.InvalidWireTypeException {
        X(0);
        return this.f37861a.C();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void m(List<Long> list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof G)) {
            int iB3 = r0.b(this.f37862b);
            if (iB3 == 0) {
                do {
                    list.add(Long.valueOf(this.f37861a.u()));
                    if (this.f37861a.e()) {
                        return;
                    } else {
                        iB = this.f37861a.B();
                    }
                } while (iB == this.f37862b);
                this.f37864d = iB;
                return;
            }
            if (iB3 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iD = this.f37861a.d() + this.f37861a.C();
            do {
                list.add(Long.valueOf(this.f37861a.u()));
            } while (this.f37861a.d() < iD);
            W(iD);
            return;
        }
        G g10 = (G) list;
        int iB4 = r0.b(this.f37862b);
        if (iB4 == 0) {
            do {
                g10.j(this.f37861a.u());
                if (this.f37861a.e()) {
                    return;
                } else {
                    iB2 = this.f37861a.B();
                }
            } while (iB2 == this.f37862b);
            this.f37864d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iD2 = this.f37861a.d() + this.f37861a.C();
        do {
            g10.j(this.f37861a.u());
        } while (this.f37861a.d() < iD2);
        W(iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void n(List<Long> list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof G)) {
            int iB3 = r0.b(this.f37862b);
            if (iB3 == 1) {
                do {
                    list.add(Long.valueOf(this.f37861a.w()));
                    if (this.f37861a.e()) {
                        return;
                    } else {
                        iB = this.f37861a.B();
                    }
                } while (iB == this.f37862b);
                this.f37864d = iB;
                return;
            }
            if (iB3 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iC = this.f37861a.C();
            Z(iC);
            int iD = this.f37861a.d() + iC;
            do {
                list.add(Long.valueOf(this.f37861a.w()));
            } while (this.f37861a.d() < iD);
            return;
        }
        G g10 = (G) list;
        int iB4 = r0.b(this.f37862b);
        if (iB4 == 1) {
            do {
                g10.j(this.f37861a.w());
                if (this.f37861a.e()) {
                    return;
                } else {
                    iB2 = this.f37861a.B();
                }
            } while (iB2 == this.f37862b);
            this.f37864d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iC2 = this.f37861a.C();
        Z(iC2);
        int iD2 = this.f37861a.d() + iC2;
        do {
            g10.j(this.f37861a.w());
        } while (this.f37861a.d() < iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void o(List<Integer> list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof C2914y)) {
            int iB3 = r0.b(this.f37862b);
            if (iB3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f37861a.t()));
                    if (this.f37861a.e()) {
                        return;
                    } else {
                        iB = this.f37861a.B();
                    }
                } while (iB == this.f37862b);
                this.f37864d = iB;
                return;
            }
            if (iB3 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iD = this.f37861a.d() + this.f37861a.C();
            do {
                list.add(Integer.valueOf(this.f37861a.t()));
            } while (this.f37861a.d() < iD);
            W(iD);
            return;
        }
        C2914y c2914y = (C2914y) list;
        int iB4 = r0.b(this.f37862b);
        if (iB4 == 0) {
            do {
                c2914y.X(this.f37861a.t());
                if (this.f37861a.e()) {
                    return;
                } else {
                    iB2 = this.f37861a.B();
                }
            } while (iB2 == this.f37862b);
            this.f37864d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iD2 = this.f37861a.d() + this.f37861a.C();
        do {
            c2914y.X(this.f37861a.t());
        } while (this.f37861a.d() < iD2);
        W(iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void p(List<Integer> list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof C2914y)) {
            int iB3 = r0.b(this.f37862b);
            if (iB3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f37861a.p()));
                    if (this.f37861a.e()) {
                        return;
                    } else {
                        iB = this.f37861a.B();
                    }
                } while (iB == this.f37862b);
                this.f37864d = iB;
                return;
            }
            if (iB3 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iD = this.f37861a.d() + this.f37861a.C();
            do {
                list.add(Integer.valueOf(this.f37861a.p()));
            } while (this.f37861a.d() < iD);
            W(iD);
            return;
        }
        C2914y c2914y = (C2914y) list;
        int iB4 = r0.b(this.f37862b);
        if (iB4 == 0) {
            do {
                c2914y.X(this.f37861a.p());
                if (this.f37861a.e()) {
                    return;
                } else {
                    iB2 = this.f37861a.B();
                }
            } while (iB2 == this.f37862b);
            this.f37864d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iD2 = this.f37861a.d() + this.f37861a.C();
        do {
            c2914y.X(this.f37861a.p());
        } while (this.f37861a.d() < iD2);
        W(iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int q() throws InvalidProtocolBufferException.InvalidWireTypeException {
        X(0);
        return this.f37861a.p();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void r(List<Integer> list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof C2914y)) {
            int iB3 = r0.b(this.f37862b);
            if (iB3 == 2) {
                int iC = this.f37861a.C();
                Y(iC);
                int iD = this.f37861a.d() + iC;
                do {
                    list.add(Integer.valueOf(this.f37861a.q()));
                } while (this.f37861a.d() < iD);
                return;
            }
            if (iB3 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Integer.valueOf(this.f37861a.q()));
                if (this.f37861a.e()) {
                    return;
                } else {
                    iB = this.f37861a.B();
                }
            } while (iB == this.f37862b);
            this.f37864d = iB;
            return;
        }
        C2914y c2914y = (C2914y) list;
        int iB4 = r0.b(this.f37862b);
        if (iB4 == 2) {
            int iC2 = this.f37861a.C();
            Y(iC2);
            int iD2 = this.f37861a.d() + iC2;
            do {
                c2914y.X(this.f37861a.q());
            } while (this.f37861a.d() < iD2);
            return;
        }
        if (iB4 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            c2914y.X(this.f37861a.q());
            if (this.f37861a.e()) {
                return;
            } else {
                iB2 = this.f37861a.B();
            }
        } while (iB2 == this.f37862b);
        this.f37864d = iB2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public double readDouble() throws InvalidProtocolBufferException.InvalidWireTypeException {
        X(1);
        return this.f37861a.o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public float readFloat() throws InvalidProtocolBufferException.InvalidWireTypeException {
        X(5);
        return this.f37861a.s();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int s() throws InvalidProtocolBufferException.InvalidWireTypeException {
        X(0);
        return this.f37861a.x();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public long t() throws InvalidProtocolBufferException.InvalidWireTypeException {
        X(0);
        return this.f37861a.y();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void u(List<Boolean> list) throws InvalidProtocolBufferException {
        int iB;
        int iB2;
        if (!(list instanceof C2896f)) {
            int iB3 = r0.b(this.f37862b);
            if (iB3 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f37861a.m()));
                    if (this.f37861a.e()) {
                        return;
                    } else {
                        iB = this.f37861a.B();
                    }
                } while (iB == this.f37862b);
                this.f37864d = iB;
                return;
            }
            if (iB3 != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iD = this.f37861a.d() + this.f37861a.C();
            do {
                list.add(Boolean.valueOf(this.f37861a.m()));
            } while (this.f37861a.d() < iD);
            W(iD);
            return;
        }
        C2896f c2896f = (C2896f) list;
        int iB4 = r0.b(this.f37862b);
        if (iB4 == 0) {
            do {
                c2896f.j(this.f37861a.m());
                if (this.f37861a.e()) {
                    return;
                } else {
                    iB2 = this.f37861a.B();
                }
            } while (iB2 == this.f37862b);
            this.f37864d = iB2;
            return;
        }
        if (iB4 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iD2 = this.f37861a.d() + this.f37861a.C();
        do {
            c2896f.j(this.f37861a.m());
        } while (this.f37861a.d() < iD2);
        W(iD2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public String v() throws InvalidProtocolBufferException.InvalidWireTypeException {
        X(2);
        return this.f37861a.z();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int w() {
        int i10 = this.f37864d;
        if (i10 != 0) {
            this.f37862b = i10;
            this.f37864d = 0;
        } else {
            this.f37862b = this.f37861a.B();
        }
        int i11 = this.f37862b;
        if (i11 == 0 || i11 == this.f37863c) {
            return Integer.MAX_VALUE;
        }
        return r0.a(i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void x(List<String> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(list, false);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void y(List<String> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(list, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public AbstractC2898h z() throws InvalidProtocolBufferException.InvalidWireTypeException {
        X(2);
        return this.f37861a.n();
    }
}
