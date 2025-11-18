package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfd;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzhy {

    /* renamed from: a */
    private static final zzhy f28170a = new zzhy(0, new int[0], new Object[0], false);

    /* renamed from: b */
    private int f28171b;

    /* renamed from: c */
    private int[] f28172c;

    /* renamed from: d */
    private Object[] f28173d;

    /* renamed from: e */
    private int f28174e;

    /* renamed from: f */
    private boolean f28175f;

    private zzhy() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public static zzhy m22330a() {
        return f28170a;
    }

    /* renamed from: b */
    static zzhy m22331b(zzhy zzhyVar, zzhy zzhyVar2) {
        int i2 = zzhyVar.f28171b + zzhyVar2.f28171b;
        int[] iArrCopyOf = Arrays.copyOf(zzhyVar.f28172c, i2);
        System.arraycopy(zzhyVar2.f28172c, 0, iArrCopyOf, zzhyVar.f28171b, zzhyVar2.f28171b);
        Object[] objArrCopyOf = Arrays.copyOf(zzhyVar.f28173d, i2);
        System.arraycopy(zzhyVar2.f28173d, 0, objArrCopyOf, zzhyVar.f28171b, zzhyVar2.f28171b);
        return new zzhy(i2, iArrCopyOf, objArrCopyOf, true);
    }

    /* renamed from: d */
    private static void m22332d(int i2, Object obj, InterfaceC7622y4 interfaceC7622y4) throws IOException {
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            interfaceC7622y4.mo21019q(i3, ((Long) obj).longValue());
            return;
        }
        if (i4 == 1) {
            interfaceC7622y4.mo20999L(i3, ((Long) obj).longValue());
            return;
        }
        if (i4 == 2) {
            interfaceC7622y4.mo20992E(i3, (zzdu) obj);
            return;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new RuntimeException(zzfo.m22301f());
            }
            interfaceC7622y4.mo21027y(i3, ((Integer) obj).intValue());
        } else if (interfaceC7622y4.mo21003a() == zzfd.zze.f28134l) {
            interfaceC7622y4.mo21006d(i3);
            ((zzhy) obj).m22337h(interfaceC7622y4);
            interfaceC7622y4.mo21007e(i3);
        } else {
            interfaceC7622y4.mo21007e(i3);
            ((zzhy) obj).m22337h(interfaceC7622y4);
            interfaceC7622y4.mo21006d(i3);
        }
    }

    /* renamed from: g */
    static zzhy m22333g() {
        return new zzhy();
    }

    /* renamed from: c */
    final void m22334c(int i2, Object obj) {
        if (!this.f28175f) {
            throw new UnsupportedOperationException();
        }
        int i3 = this.f28171b;
        int[] iArr = this.f28172c;
        if (i3 == iArr.length) {
            int i4 = i3 + (i3 < 4 ? 8 : i3 >> 1);
            this.f28172c = Arrays.copyOf(iArr, i4);
            this.f28173d = Arrays.copyOf(this.f28173d, i4);
        }
        int[] iArr2 = this.f28172c;
        int i5 = this.f28171b;
        iArr2[i5] = i2;
        this.f28173d[i5] = obj;
        this.f28171b = i5 + 1;
    }

    /* renamed from: e */
    final void m22335e(InterfaceC7622y4 interfaceC7622y4) throws IOException {
        if (interfaceC7622y4.mo21003a() == zzfd.zze.f28135m) {
            for (int i2 = this.f28171b - 1; i2 >= 0; i2--) {
                interfaceC7622y4.mo21008f(this.f28172c[i2] >>> 3, this.f28173d[i2]);
            }
            return;
        }
        for (int i3 = 0; i3 < this.f28171b; i3++) {
            interfaceC7622y4.mo21008f(this.f28172c[i3] >>> 3, this.f28173d[i3]);
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzhy)) {
            return false;
        }
        zzhy zzhyVar = (zzhy) obj;
        int i2 = this.f28171b;
        if (i2 == zzhyVar.f28171b) {
            int[] iArr = this.f28172c;
            int[] iArr2 = zzhyVar.f28172c;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    z = true;
                    break;
                }
                if (iArr[i3] != iArr2[i3]) {
                    z = false;
                    break;
                }
                i3++;
            }
            if (z) {
                Object[] objArr = this.f28173d;
                Object[] objArr2 = zzhyVar.f28173d;
                int i4 = this.f28171b;
                int i5 = 0;
                while (true) {
                    if (i5 >= i4) {
                        z2 = true;
                        break;
                    }
                    if (!objArr[i5].equals(objArr2[i5])) {
                        z2 = false;
                        break;
                    }
                    i5++;
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    final void m22336f(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.f28171b; i3++) {
            C7507f3.m21054d(sb, i2, String.valueOf(this.f28172c[i3] >>> 3), this.f28173d[i3]);
        }
    }

    /* renamed from: h */
    public final void m22337h(InterfaceC7622y4 interfaceC7622y4) throws IOException {
        if (this.f28171b == 0) {
            return;
        }
        if (interfaceC7622y4.mo21003a() == zzfd.zze.f28134l) {
            for (int i2 = 0; i2 < this.f28171b; i2++) {
                m22332d(this.f28172c[i2], this.f28173d[i2], interfaceC7622y4);
            }
            return;
        }
        for (int i3 = this.f28171b - 1; i3 >= 0; i3--) {
            m22332d(this.f28172c[i3], this.f28173d[i3], interfaceC7622y4);
        }
    }

    public final int hashCode() {
        int i2 = this.f28171b;
        int i3 = (i2 + 527) * 31;
        int[] iArr = this.f28172c;
        int iHashCode = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i3 + i4) * 31;
        Object[] objArr = this.f28173d;
        int i7 = this.f28171b;
        for (int i8 = 0; i8 < i7; i8++) {
            iHashCode = (iHashCode * 31) + objArr[i8].hashCode();
        }
        return i6 + iHashCode;
    }

    /* renamed from: i */
    public final void m22338i() {
        this.f28175f = false;
    }

    /* renamed from: j */
    public final int m22339j() {
        int i2 = this.f28174e;
        if (i2 != -1) {
            return i2;
        }
        int iM22186c0 = 0;
        for (int i3 = 0; i3 < this.f28171b; i3++) {
            iM22186c0 += zzen.m22186c0(this.f28172c[i3] >>> 3, (zzdu) this.f28173d[i3]);
        }
        this.f28174e = iM22186c0;
        return iM22186c0;
    }

    /* renamed from: k */
    public final int m22340k() {
        int iM22192h0;
        int i2 = this.f28174e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f28171b; i4++) {
            int i5 = this.f28172c[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                iM22192h0 = zzen.m22192h0(i6, ((Long) this.f28173d[i4]).longValue());
            } else if (i7 == 1) {
                iM22192h0 = zzen.m22200q0(i6, ((Long) this.f28173d[i4]).longValue());
            } else if (i7 == 2) {
                iM22192h0 = zzen.m22180T(i6, (zzdu) this.f28173d[i4]);
            } else if (i7 == 3) {
                iM22192h0 = (zzen.m22191g0(i6) << 1) + ((zzhy) this.f28173d[i4]).m22340k();
            } else {
                if (i7 != 5) {
                    throw new IllegalStateException(zzfo.m22301f());
                }
                iM22192h0 = zzen.m22207x0(i6, ((Integer) this.f28173d[i4]).intValue());
            }
            i3 += iM22192h0;
        }
        this.f28174e = i3;
        return i3;
    }

    private zzhy(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.f28174e = -1;
        this.f28171b = i2;
        this.f28172c = iArr;
        this.f28173d = objArr;
        this.f28175f = z;
    }
}
