package com.google.protobuf;

import com.google.protobuf.s0;
import java.util.Arrays;

/* compiled from: UnknownFieldSetLite.java */
/* loaded from: classes2.dex */
public final class m0 {

    /* renamed from: f, reason: collision with root package name */
    private static final m0 f39307f = new m0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f39308a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f39309b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f39310c;

    /* renamed from: d, reason: collision with root package name */
    private int f39311d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f39312e;

    private m0() {
        this(0, new int[8], new Object[8], true);
    }

    private void b(int i10) {
        int[] iArr = this.f39309b;
        if (i10 > iArr.length) {
            int i11 = this.f39308a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f39309b = Arrays.copyOf(iArr, i10);
            this.f39310c = Arrays.copyOf(this.f39310c, i10);
        }
    }

    public static m0 c() {
        return f39307f;
    }

    private static int f(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    private static int g(Object[] objArr, int i10) {
        int iHashCode = 17;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode = (iHashCode * 31) + objArr[i11].hashCode();
        }
        return iHashCode;
    }

    static m0 j(m0 m0Var, m0 m0Var2) {
        int i10 = m0Var.f39308a + m0Var2.f39308a;
        int[] iArrCopyOf = Arrays.copyOf(m0Var.f39309b, i10);
        System.arraycopy(m0Var2.f39309b, 0, iArrCopyOf, m0Var.f39308a, m0Var2.f39308a);
        Object[] objArrCopyOf = Arrays.copyOf(m0Var.f39310c, i10);
        System.arraycopy(m0Var2.f39310c, 0, objArrCopyOf, m0Var.f39308a, m0Var2.f39308a);
        return new m0(i10, iArrCopyOf, objArrCopyOf, true);
    }

    static m0 k() {
        return new m0();
    }

    private static boolean l(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    private static boolean o(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private static void q(int i10, Object obj, s0 s0Var) {
        int iA = r0.a(i10);
        int iB = r0.b(i10);
        if (iB == 0) {
            s0Var.n(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 1) {
            s0Var.h(iA, ((Long) obj).longValue());
            return;
        }
        if (iB == 2) {
            s0Var.N(iA, (AbstractC2947g) obj);
            return;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new RuntimeException(InvalidProtocolBufferException.e());
            }
            s0Var.d(iA, ((Integer) obj).intValue());
        } else if (s0Var.i() == s0.a.ASCENDING) {
            s0Var.q(iA);
            ((m0) obj).r(s0Var);
            s0Var.B(iA);
        } else {
            s0Var.B(iA);
            ((m0) obj).r(s0Var);
            s0Var.q(iA);
        }
    }

    void a() {
        if (!this.f39312e) {
            throw new UnsupportedOperationException();
        }
    }

    public int d() {
        int iW;
        int i10 = this.f39311d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f39308a; i12++) {
            int i13 = this.f39309b[i12];
            int iA = r0.a(i13);
            int iB = r0.b(i13);
            if (iB == 0) {
                iW = CodedOutputStream.W(iA, ((Long) this.f39310c[i12]).longValue());
            } else if (iB == 1) {
                iW = CodedOutputStream.o(iA, ((Long) this.f39310c[i12]).longValue());
            } else if (iB == 2) {
                iW = CodedOutputStream.g(iA, (AbstractC2947g) this.f39310c[i12]);
            } else if (iB == 3) {
                iW = (CodedOutputStream.T(iA) * 2) + ((m0) this.f39310c[i12]).d();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.e());
                }
                iW = CodedOutputStream.m(iA, ((Integer) this.f39310c[i12]).intValue());
            }
            i11 += iW;
        }
        this.f39311d = i11;
        return i11;
    }

    public int e() {
        int i10 = this.f39311d;
        if (i10 != -1) {
            return i10;
        }
        int I10 = 0;
        for (int i11 = 0; i11 < this.f39308a; i11++) {
            I10 += CodedOutputStream.I(r0.a(this.f39309b[i11]), (AbstractC2947g) this.f39310c[i11]);
        }
        this.f39311d = I10;
        return I10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        int i10 = this.f39308a;
        return i10 == m0Var.f39308a && o(this.f39309b, m0Var.f39309b, i10) && l(this.f39310c, m0Var.f39310c, this.f39308a);
    }

    public void h() {
        if (this.f39312e) {
            this.f39312e = false;
        }
    }

    public int hashCode() {
        int i10 = this.f39308a;
        return ((((527 + i10) * 31) + f(this.f39309b, i10)) * 31) + g(this.f39310c, this.f39308a);
    }

    m0 i(m0 m0Var) {
        if (m0Var.equals(c())) {
            return this;
        }
        a();
        int i10 = this.f39308a + m0Var.f39308a;
        b(i10);
        System.arraycopy(m0Var.f39309b, 0, this.f39309b, this.f39308a, m0Var.f39308a);
        System.arraycopy(m0Var.f39310c, 0, this.f39310c, this.f39308a, m0Var.f39308a);
        this.f39308a = i10;
        return this;
    }

    final void m(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f39308a; i11++) {
            S.d(sb2, i10, String.valueOf(r0.a(this.f39309b[i11])), this.f39310c[i11]);
        }
    }

    void n(int i10, Object obj) {
        a();
        b(this.f39308a + 1);
        int[] iArr = this.f39309b;
        int i11 = this.f39308a;
        iArr[i11] = i10;
        this.f39310c[i11] = obj;
        this.f39308a = i11 + 1;
    }

    void p(s0 s0Var) {
        if (s0Var.i() == s0.a.DESCENDING) {
            for (int i10 = this.f39308a - 1; i10 >= 0; i10--) {
                s0Var.c(r0.a(this.f39309b[i10]), this.f39310c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f39308a; i11++) {
            s0Var.c(r0.a(this.f39309b[i11]), this.f39310c[i11]);
        }
    }

    public void r(s0 s0Var) {
        if (this.f39308a == 0) {
            return;
        }
        if (s0Var.i() == s0.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f39308a; i10++) {
                q(this.f39309b[i10], this.f39310c[i10], s0Var);
            }
            return;
        }
        for (int i11 = this.f39308a - 1; i11 >= 0; i11--) {
            q(this.f39309b[i11], this.f39310c[i11], s0Var);
        }
    }

    private m0(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f39311d = -1;
        this.f39308a = i10;
        this.f39309b = iArr;
        this.f39310c = objArr;
        this.f39312e = z10;
    }
}
