package com.google.android.gms.internal.wearable;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: com.google.android.gms.internal.wearable.l1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2673l1 {

    /* renamed from: f, reason: collision with root package name */
    private static final C2673l1 f34642f = new C2673l1(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f34643a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f34644b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f34645c;

    /* renamed from: d, reason: collision with root package name */
    private int f34646d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f34647e;

    private C2673l1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f34646d = -1;
        this.f34643a = i10;
        this.f34644b = iArr;
        this.f34645c = objArr;
        this.f34647e = z10;
    }

    public static C2673l1 c() {
        return f34642f;
    }

    static C2673l1 e(C2673l1 c2673l1, C2673l1 c2673l12) {
        int i10 = c2673l1.f34643a + c2673l12.f34643a;
        int[] iArrCopyOf = Arrays.copyOf(c2673l1.f34644b, i10);
        System.arraycopy(c2673l12.f34644b, 0, iArrCopyOf, c2673l1.f34643a, c2673l12.f34643a);
        Object[] objArrCopyOf = Arrays.copyOf(c2673l1.f34645c, i10);
        System.arraycopy(c2673l12.f34645c, 0, objArrCopyOf, c2673l1.f34643a, c2673l12.f34643a);
        return new C2673l1(i10, iArrCopyOf, objArrCopyOf, true);
    }

    private final void k(int i10) {
        int[] iArr = this.f34644b;
        if (i10 > iArr.length) {
            int i11 = this.f34643a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f34644b = Arrays.copyOf(iArr, i10);
            this.f34645c = Arrays.copyOf(this.f34645c, i10);
        }
    }

    public final int a() {
        int iB;
        int iA;
        int iB2;
        int i10 = this.f34646d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f34643a; i12++) {
            int i13 = this.f34644b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f34645c[i12]).longValue();
                    iB2 = W.B(i14 << 3) + 8;
                } else if (i15 == 2) {
                    int i16 = i14 << 3;
                    P p10 = (P) this.f34645c[i12];
                    int iB3 = W.B(i16);
                    int iH = p10.h();
                    iB2 = iB3 + W.B(iH) + iH;
                } else if (i15 == 3) {
                    int iB4 = W.B(i14 << 3);
                    iB = iB4 + iB4;
                    iA = ((C2673l1) this.f34645c[i12]).a();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(new zzcw("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f34645c[i12]).intValue();
                    iB2 = W.B(i14 << 3) + 4;
                }
                i11 += iB2;
            } else {
                int i17 = i14 << 3;
                long jLongValue = ((Long) this.f34645c[i12]).longValue();
                iB = W.B(i17);
                iA = W.a(jLongValue);
            }
            iB2 = iB + iA;
            i11 += iB2;
        }
        this.f34646d = i11;
        return i11;
    }

    public final int b() {
        int i10 = this.f34646d;
        if (i10 != -1) {
            return i10;
        }
        int iB = 0;
        for (int i11 = 0; i11 < this.f34643a; i11++) {
            int i12 = this.f34644b[i11] >>> 3;
            P p10 = (P) this.f34645c[i11];
            int iB2 = W.B(8);
            int iB3 = W.B(16) + W.B(i12);
            int iB4 = W.B(24);
            int iH = p10.h();
            iB += iB2 + iB2 + iB3 + iB4 + W.B(iH) + iH;
        }
        this.f34646d = iB;
        return iB;
    }

    final C2673l1 d(C2673l1 c2673l1) {
        if (c2673l1.equals(f34642f)) {
            return this;
        }
        f();
        int i10 = this.f34643a + c2673l1.f34643a;
        k(i10);
        System.arraycopy(c2673l1.f34644b, 0, this.f34644b, this.f34643a, c2673l1.f34643a);
        System.arraycopy(c2673l1.f34645c, 0, this.f34645c, this.f34643a, c2673l1.f34643a);
        this.f34643a = i10;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2673l1)) {
            return false;
        }
        C2673l1 c2673l1 = (C2673l1) obj;
        int i10 = this.f34643a;
        if (i10 == c2673l1.f34643a) {
            int[] iArr = this.f34644b;
            int[] iArr2 = c2673l1.f34644b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f34645c;
                    Object[] objArr2 = c2673l1.f34645c;
                    int i12 = this.f34643a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
                if (iArr[i11] != iArr2[i11]) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    final void f() {
        if (!this.f34647e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void g() {
        if (this.f34647e) {
            this.f34647e = false;
        }
    }

    final void h(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f34643a; i11++) {
            P0.b(sb2, i10, String.valueOf(this.f34644b[i11] >>> 3), this.f34645c[i11]);
        }
    }

    public final int hashCode() {
        int i10 = this.f34643a;
        int i11 = i10 + 527;
        int[] iArr = this.f34644b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.f34645c;
        int i15 = this.f34643a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    final void i(x1 x1Var) {
        for (int i10 = 0; i10 < this.f34643a; i10++) {
            x1Var.A(this.f34644b[i10] >>> 3, this.f34645c[i10]);
        }
    }

    public final void j(x1 x1Var) {
        if (this.f34643a != 0) {
            for (int i10 = 0; i10 < this.f34643a; i10++) {
                int i11 = this.f34644b[i10];
                Object obj = this.f34645c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    x1Var.l(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    x1Var.G(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    x1Var.s(i13, (P) obj);
                } else if (i12 == 3) {
                    x1Var.K(i13);
                    ((C2673l1) obj).j(x1Var);
                    x1Var.J(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new zzcw("Protocol message tag had invalid wire type."));
                    }
                    x1Var.j(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    private C2673l1() {
        this(0, new int[8], new Object[8], true);
    }
}
