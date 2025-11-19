package com.google.android.gms.internal.wearable;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public abstract class W extends H {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f34531b = Logger.getLogger(W.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f34532c = C2690r1.C();

    /* renamed from: a, reason: collision with root package name */
    X f34533a;

    private W() {
        throw null;
    }

    public static int A(String str) {
        int length;
        try {
            length = t1.b(str);
        } catch (s1 unused) {
            length = str.getBytes(C2689r0.f34652a).length;
        }
        return B(length) + length;
    }

    public static int B(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int a(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    @Deprecated
    static int y(int i10, N0 n02, Z0 z02) {
        int iB = B(i10 << 3);
        return iB + iB + ((C) n02).a(z02);
    }

    static int z(N0 n02, Z0 z02) {
        int iA = ((C) n02).a(z02);
        return B(iA) + iA;
    }

    public final void b() {
        if (e() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void c(String str, s1 s1Var) throws zzbu {
        f34531b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) s1Var);
        byte[] bytes = str.getBytes(C2689r0.f34652a);
        try {
            int length = bytes.length;
            v(length);
            o(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzbu(e10);
        }
    }

    public abstract int e();

    public abstract void f(byte b10);

    public abstract void g(int i10, boolean z10);

    public abstract void h(int i10, P p10);

    public abstract void i(int i10, int i11);

    public abstract void j(int i10);

    public abstract void k(int i10, long j10);

    public abstract void l(long j10);

    public abstract void m(int i10, int i11);

    public abstract void n(int i10);

    public abstract void o(byte[] bArr, int i10, int i11);

    abstract void p(int i10, N0 n02, Z0 z02);

    public abstract void q(int i10, N0 n02);

    public abstract void r(int i10, P p10);

    public abstract void s(int i10, String str);

    public abstract void t(int i10, int i11);

    public abstract void u(int i10, int i11);

    public abstract void v(int i10);

    public abstract void w(int i10, long j10);

    public abstract void x(long j10);

    /* synthetic */ W(V v10) {
    }
}
