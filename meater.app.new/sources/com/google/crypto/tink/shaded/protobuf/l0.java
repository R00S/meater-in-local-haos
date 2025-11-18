package com.google.crypto.tink.shaded.protobuf;

/* compiled from: UnknownFieldSchema.java */
/* loaded from: classes2.dex */
abstract class l0<T, B> {
    l0() {
    }

    abstract void a(B b10, int i10, int i11);

    abstract void b(B b10, int i10, long j10);

    abstract void c(B b10, int i10, T t10);

    abstract void d(B b10, int i10, AbstractC2898h abstractC2898h);

    abstract void e(B b10, int i10, long j10);

    abstract B f(Object obj);

    abstract T g(Object obj);

    abstract int h(T t10);

    abstract int i(T t10);

    abstract void j(Object obj);

    abstract T k(T t10, T t11);

    final void l(B b10, e0 e0Var) {
        while (e0Var.w() != Integer.MAX_VALUE && m(b10, e0Var)) {
        }
    }

    final boolean m(B b10, e0 e0Var) throws InvalidProtocolBufferException {
        int iA = e0Var.a();
        int iA2 = r0.a(iA);
        int iB = r0.b(iA);
        if (iB == 0) {
            e(b10, iA2, e0Var.G());
            return true;
        }
        if (iB == 1) {
            b(b10, iA2, e0Var.d());
            return true;
        }
        if (iB == 2) {
            d(b10, iA2, e0Var.z());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.e();
            }
            a(b10, iA2, e0Var.h());
            return true;
        }
        B bN = n();
        int iC = r0.c(iA2, 4);
        l(bN, e0Var);
        if (iC != e0Var.a()) {
            throw InvalidProtocolBufferException.b();
        }
        c(b10, iA2, r(bN));
        return true;
    }

    abstract B n();

    abstract void o(Object obj, B b10);

    abstract void p(Object obj, T t10);

    abstract boolean q(e0 e0Var);

    abstract T r(B b10);

    abstract void s(T t10, s0 s0Var);

    abstract void t(T t10, s0 s0Var);
}
