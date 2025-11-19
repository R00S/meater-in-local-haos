package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.s0;
import java.util.Arrays;

/* compiled from: UnknownFieldSetLite.java */
/* loaded from: classes2.dex */
public final class m0 {

    /* renamed from: f, reason: collision with root package name */
    private static final m0 f37876f = new m0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f37877a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f37878b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f37879c;

    /* renamed from: d, reason: collision with root package name */
    private int f37880d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f37881e;

    private m0() {
        this(0, new int[8], new Object[8], true);
    }

    private void b(int i10) {
        int[] iArr = this.f37878b;
        if (i10 > iArr.length) {
            int i11 = this.f37877a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f37878b = Arrays.copyOf(iArr, i10);
            this.f37879c = Arrays.copyOf(this.f37879c, i10);
        }
    }

    public static m0 c() {
        return f37876f;
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
        int i10 = m0Var.f37877a + m0Var2.f37877a;
        int[] iArrCopyOf = Arrays.copyOf(m0Var.f37878b, i10);
        System.arraycopy(m0Var2.f37878b, 0, iArrCopyOf, m0Var.f37877a, m0Var2.f37877a);
        Object[] objArrCopyOf = Arrays.copyOf(m0Var.f37879c, i10);
        System.arraycopy(m0Var2.f37879c, 0, objArrCopyOf, m0Var.f37877a, m0Var2.f37877a);
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
            s0Var.O(iA, (AbstractC2898h) obj);
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
        if (!this.f37881e) {
            throw new UnsupportedOperationException();
        }
    }

    public int d() {
        int iW;
        int i10 = this.f37880d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f37877a; i12++) {
            int i13 = this.f37878b[i12];
            int iA = r0.a(i13);
            int iB = r0.b(i13);
            if (iB == 0) {
                iW = CodedOutputStream.W(iA, ((Long) this.f37879c[i12]).longValue());
            } else if (iB == 1) {
                iW = CodedOutputStream.o(iA, ((Long) this.f37879c[i12]).longValue());
            } else if (iB == 2) {
                iW = CodedOutputStream.g(iA, (AbstractC2898h) this.f37879c[i12]);
            } else if (iB == 3) {
                iW = (CodedOutputStream.T(iA) * 2) + ((m0) this.f37879c[i12]).d();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.e());
                }
                iW = CodedOutputStream.m(iA, ((Integer) this.f37879c[i12]).intValue());
            }
            i11 += iW;
        }
        this.f37880d = i11;
        return i11;
    }

    public int e() {
        int i10 = this.f37880d;
        if (i10 != -1) {
            return i10;
        }
        int I10 = 0;
        for (int i11 = 0; i11 < this.f37877a; i11++) {
            I10 += CodedOutputStream.I(r0.a(this.f37878b[i11]), (AbstractC2898h) this.f37879c[i11]);
        }
        this.f37880d = I10;
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
        int i10 = this.f37877a;
        return i10 == m0Var.f37877a && o(this.f37878b, m0Var.f37878b, i10) && l(this.f37879c, m0Var.f37879c, this.f37877a);
    }

    public void h() {
        this.f37881e = false;
    }

    public int hashCode() {
        int i10 = this.f37877a;
        return ((((527 + i10) * 31) + f(this.f37878b, i10)) * 31) + g(this.f37879c, this.f37877a);
    }

    m0 i(m0 m0Var) {
        if (m0Var.equals(c())) {
            return this;
        }
        a();
        int i10 = this.f37877a + m0Var.f37877a;
        b(i10);
        System.arraycopy(m0Var.f37878b, 0, this.f37878b, this.f37877a, m0Var.f37877a);
        System.arraycopy(m0Var.f37879c, 0, this.f37879c, this.f37877a, m0Var.f37877a);
        this.f37877a = i10;
        return this;
    }

    final void m(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f37877a; i11++) {
            S.d(sb2, i10, String.valueOf(r0.a(this.f37878b[i11])), this.f37879c[i11]);
        }
    }

    void n(int i10, Object obj) {
        a();
        b(this.f37877a + 1);
        int[] iArr = this.f37878b;
        int i11 = this.f37877a;
        iArr[i11] = i10;
        this.f37879c[i11] = obj;
        this.f37877a = i11 + 1;
    }

    void p(s0 s0Var) {
        if (s0Var.i() == s0.a.DESCENDING) {
            for (int i10 = this.f37877a - 1; i10 >= 0; i10--) {
                s0Var.c(r0.a(this.f37878b[i10]), this.f37879c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f37877a; i11++) {
            s0Var.c(r0.a(this.f37878b[i11]), this.f37879c[i11]);
        }
    }

    public void r(s0 s0Var) {
        if (this.f37877a == 0) {
            return;
        }
        if (s0Var.i() == s0.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f37877a; i10++) {
                q(this.f37878b[i10], this.f37879c[i10], s0Var);
            }
            return;
        }
        for (int i11 = this.f37877a - 1; i11 >= 0; i11--) {
            q(this.f37878b[i11], this.f37879c[i11], s0Var);
        }
    }

    private m0(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f37880d = -1;
        this.f37877a = i10;
        this.f37878b = iArr;
        this.f37879c = objArr;
        this.f37881e = z10;
    }
}
