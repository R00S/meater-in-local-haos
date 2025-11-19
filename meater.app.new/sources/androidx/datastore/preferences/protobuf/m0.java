package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.s0;
import java.util.Arrays;

/* compiled from: UnknownFieldSetLite.java */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: f, reason: collision with root package name */
    private static final m0 f24998f = new m0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f24999a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f25000b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f25001c;

    /* renamed from: d, reason: collision with root package name */
    private int f25002d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f25003e;

    private m0() {
        this(0, new int[8], new Object[8], true);
    }

    private void b() {
        int i10 = this.f24999a;
        int[] iArr = this.f25000b;
        if (i10 == iArr.length) {
            int i11 = i10 + (i10 < 4 ? 8 : i10 >> 1);
            this.f25000b = Arrays.copyOf(iArr, i11);
            this.f25001c = Arrays.copyOf(this.f25001c, i11);
        }
    }

    private static boolean c(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    public static m0 e() {
        return f24998f;
    }

    private static int h(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    private static int i(Object[] objArr, int i10) {
        int iHashCode = 17;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode = (iHashCode * 31) + objArr[i11].hashCode();
        }
        return iHashCode;
    }

    static m0 k(m0 m0Var, m0 m0Var2) {
        int i10 = m0Var.f24999a + m0Var2.f24999a;
        int[] iArrCopyOf = Arrays.copyOf(m0Var.f25000b, i10);
        System.arraycopy(m0Var2.f25000b, 0, iArrCopyOf, m0Var.f24999a, m0Var2.f24999a);
        Object[] objArrCopyOf = Arrays.copyOf(m0Var.f25001c, i10);
        System.arraycopy(m0Var2.f25001c, 0, objArrCopyOf, m0Var.f24999a, m0Var2.f24999a);
        return new m0(i10, iArrCopyOf, objArrCopyOf, true);
    }

    static m0 l() {
        return new m0();
    }

    private static void p(int i10, Object obj, s0 s0Var) {
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
            s0Var.L(iA, (AbstractC2062h) obj);
            return;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw new RuntimeException(InvalidProtocolBufferException.d());
            }
            s0Var.d(iA, ((Integer) obj).intValue());
        } else if (s0Var.i() == s0.a.ASCENDING) {
            s0Var.q(iA);
            ((m0) obj).q(s0Var);
            s0Var.B(iA);
        } else {
            s0Var.B(iA);
            ((m0) obj).q(s0Var);
            s0Var.q(iA);
        }
    }

    void a() {
        if (!this.f25003e) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        int i10 = this.f24999a;
        return i10 == m0Var.f24999a && c(this.f25000b, m0Var.f25000b, i10) && d(this.f25001c, m0Var.f25001c, this.f24999a);
    }

    public int f() {
        int iY;
        int i10 = this.f25002d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f24999a; i12++) {
            int i13 = this.f25000b[i12];
            int iA = r0.a(i13);
            int iB = r0.b(i13);
            if (iB == 0) {
                iY = CodedOutputStream.Y(iA, ((Long) this.f25001c[i12]).longValue());
            } else if (iB == 1) {
                iY = CodedOutputStream.o(iA, ((Long) this.f25001c[i12]).longValue());
            } else if (iB == 2) {
                iY = CodedOutputStream.g(iA, (AbstractC2062h) this.f25001c[i12]);
            } else if (iB == 3) {
                iY = (CodedOutputStream.V(iA) * 2) + ((m0) this.f25001c[i12]).f();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.d());
                }
                iY = CodedOutputStream.m(iA, ((Integer) this.f25001c[i12]).intValue());
            }
            i11 += iY;
        }
        this.f25002d = i11;
        return i11;
    }

    public int g() {
        int i10 = this.f25002d;
        if (i10 != -1) {
            return i10;
        }
        int iJ = 0;
        for (int i11 = 0; i11 < this.f24999a; i11++) {
            iJ += CodedOutputStream.J(r0.a(this.f25000b[i11]), (AbstractC2062h) this.f25001c[i11]);
        }
        this.f25002d = iJ;
        return iJ;
    }

    public int hashCode() {
        int i10 = this.f24999a;
        return ((((527 + i10) * 31) + h(this.f25000b, i10)) * 31) + i(this.f25001c, this.f24999a);
    }

    public void j() {
        this.f25003e = false;
    }

    final void m(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f24999a; i11++) {
            S.c(sb2, i10, String.valueOf(r0.a(this.f25000b[i11])), this.f25001c[i11]);
        }
    }

    void n(int i10, Object obj) {
        a();
        b();
        int[] iArr = this.f25000b;
        int i11 = this.f24999a;
        iArr[i11] = i10;
        this.f25001c[i11] = obj;
        this.f24999a = i11 + 1;
    }

    void o(s0 s0Var) {
        if (s0Var.i() == s0.a.DESCENDING) {
            for (int i10 = this.f24999a - 1; i10 >= 0; i10--) {
                s0Var.c(r0.a(this.f25000b[i10]), this.f25001c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f24999a; i11++) {
            s0Var.c(r0.a(this.f25000b[i11]), this.f25001c[i11]);
        }
    }

    public void q(s0 s0Var) {
        if (this.f24999a == 0) {
            return;
        }
        if (s0Var.i() == s0.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f24999a; i10++) {
                p(this.f25000b[i10], this.f25001c[i10], s0Var);
            }
            return;
        }
        for (int i11 = this.f24999a - 1; i11 >= 0; i11--) {
            p(this.f25000b[i11], this.f25001c[i11], s0Var);
        }
    }

    private m0(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f25002d = -1;
        this.f24999a = i10;
        this.f25000b = iArr;
        this.f25001c = objArr;
        this.f25003e = z10;
    }
}
