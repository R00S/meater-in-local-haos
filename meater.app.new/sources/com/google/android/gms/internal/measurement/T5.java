package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* loaded from: classes2.dex */
public final class T5 {

    /* renamed from: f, reason: collision with root package name */
    private static final T5 f33880f = new T5(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f33881a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f33882b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f33883c;

    /* renamed from: d, reason: collision with root package name */
    private int f33884d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f33885e;

    private T5() {
        this(0, new int[8], new Object[8], true);
    }

    static T5 c(T5 t52, T5 t53) {
        int i10 = t52.f33881a + t53.f33881a;
        int[] iArrCopyOf = Arrays.copyOf(t52.f33882b, i10);
        System.arraycopy(t53.f33882b, 0, iArrCopyOf, t52.f33881a, t53.f33881a);
        Object[] objArrCopyOf = Arrays.copyOf(t52.f33883c, i10);
        System.arraycopy(t53.f33883c, 0, objArrCopyOf, t52.f33881a, t53.f33881a);
        return new T5(i10, iArrCopyOf, objArrCopyOf, true);
    }

    private final void d(int i10) {
        int[] iArr = this.f33882b;
        if (i10 > iArr.length) {
            int i11 = this.f33881a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f33882b = Arrays.copyOf(iArr, i10);
            this.f33883c = Arrays.copyOf(this.f33883c, i10);
        }
    }

    private static void f(int i10, Object obj, InterfaceC2502i6 interfaceC2502i6) {
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            interfaceC2502i6.k(i11, ((Long) obj).longValue());
            return;
        }
        if (i12 == 1) {
            interfaceC2502i6.w(i11, ((Long) obj).longValue());
            return;
        }
        if (i12 == 2) {
            interfaceC2502i6.O(i11, (Y3) obj);
            return;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw new RuntimeException(zzkp.a());
            }
            interfaceC2502i6.l(i11, ((Integer) obj).intValue());
        } else if (interfaceC2502i6.a() == 1) {
            interfaceC2502i6.s(i11);
            ((T5) obj).j(interfaceC2502i6);
            interfaceC2502i6.g(i11);
        } else {
            interfaceC2502i6.g(i11);
            ((T5) obj).j(interfaceC2502i6);
            interfaceC2502i6.s(i11);
        }
    }

    public static T5 k() {
        return f33880f;
    }

    static T5 l() {
        return new T5();
    }

    private final void n() {
        if (!this.f33885e) {
            throw new UnsupportedOperationException();
        }
    }

    public final int a() {
        int iI0;
        int i10 = this.f33884d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f33881a; i12++) {
            int i13 = this.f33882b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 == 0) {
                iI0 = zzjn.i0(i14, ((Long) this.f33883c[i12]).longValue());
            } else if (i15 == 1) {
                iI0 = zzjn.i(i14, ((Long) this.f33883c[i12]).longValue());
            } else if (i15 == 2) {
                iI0 = zzjn.j(i14, (Y3) this.f33883c[i12]);
            } else if (i15 == 3) {
                iI0 = (zzjn.k0(i14) << 1) + ((T5) this.f33883c[i12]).a();
            } else {
                if (i15 != 5) {
                    throw new IllegalStateException(zzkp.a());
                }
                iI0 = zzjn.A(i14, ((Integer) this.f33883c[i12]).intValue());
            }
            i11 += iI0;
        }
        this.f33884d = i11;
        return i11;
    }

    final T5 b(T5 t52) {
        if (t52.equals(f33880f)) {
            return this;
        }
        n();
        int i10 = this.f33881a + t52.f33881a;
        d(i10);
        System.arraycopy(t52.f33882b, 0, this.f33882b, this.f33881a, t52.f33881a);
        System.arraycopy(t52.f33883c, 0, this.f33883c, this.f33881a, t52.f33881a);
        this.f33881a = i10;
        return this;
    }

    final void e(int i10, Object obj) {
        n();
        d(this.f33881a + 1);
        int[] iArr = this.f33882b;
        int i11 = this.f33881a;
        iArr[i11] = i10;
        this.f33883c[i11] = obj;
        this.f33881a = i11 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof T5)) {
            return false;
        }
        T5 t52 = (T5) obj;
        int i10 = this.f33881a;
        if (i10 == t52.f33881a) {
            int[] iArr = this.f33882b;
            int[] iArr2 = t52.f33882b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f33883c;
                    Object[] objArr2 = t52.f33883c;
                    int i12 = this.f33881a;
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

    final void g(InterfaceC2502i6 interfaceC2502i6) {
        if (interfaceC2502i6.a() == 2) {
            for (int i10 = this.f33881a - 1; i10 >= 0; i10--) {
                interfaceC2502i6.q(this.f33882b[i10] >>> 3, this.f33883c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f33881a; i11++) {
            interfaceC2502i6.q(this.f33882b[i11] >>> 3, this.f33883c[i11]);
        }
    }

    final void h(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f33881a; i11++) {
            C2557p5.d(sb2, i10, String.valueOf(this.f33882b[i11] >>> 3), this.f33883c[i11]);
        }
    }

    public final int hashCode() {
        int i10 = this.f33881a;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.f33882b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f33883c;
        int i15 = this.f33881a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public final int i() {
        int i10 = this.f33884d;
        if (i10 != -1) {
            return i10;
        }
        int iC = 0;
        for (int i11 = 0; i11 < this.f33881a; i11++) {
            iC += zzjn.C(this.f33882b[i11] >>> 3, (Y3) this.f33883c[i11]);
        }
        this.f33884d = iC;
        return iC;
    }

    public final void j(InterfaceC2502i6 interfaceC2502i6) {
        if (this.f33881a == 0) {
            return;
        }
        if (interfaceC2502i6.a() == 1) {
            for (int i10 = 0; i10 < this.f33881a; i10++) {
                f(this.f33882b[i10], this.f33883c[i10], interfaceC2502i6);
            }
            return;
        }
        for (int i11 = this.f33881a - 1; i11 >= 0; i11--) {
            f(this.f33882b[i11], this.f33883c[i11], interfaceC2502i6);
        }
    }

    public final void m() {
        if (this.f33885e) {
            this.f33885e = false;
        }
    }

    private T5(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f33884d = -1;
        this.f33881a = i10;
        this.f33882b = iArr;
        this.f33883c = objArr;
        this.f33885e = z10;
    }
}
