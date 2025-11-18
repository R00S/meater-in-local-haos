package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzdqu {

    /* renamed from: a */
    private static final zzdqu f25802a = new zzdqu(0, new int[0], new Object[0], false);

    /* renamed from: b */
    private int f25803b;

    /* renamed from: c */
    private int[] f25804c;

    /* renamed from: d */
    private Object[] f25805d;

    /* renamed from: e */
    private int f25806e;

    /* renamed from: f */
    private boolean f25807f;

    private zzdqu() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    static zzdqu m19781a(zzdqu zzdquVar, zzdqu zzdquVar2) {
        int i2 = zzdquVar.f25803b + zzdquVar2.f25803b;
        int[] iArrCopyOf = Arrays.copyOf(zzdquVar.f25804c, i2);
        System.arraycopy(zzdquVar2.f25804c, 0, iArrCopyOf, zzdquVar.f25803b, zzdquVar2.f25803b);
        Object[] objArrCopyOf = Arrays.copyOf(zzdquVar.f25805d, i2);
        System.arraycopy(zzdquVar2.f25805d, 0, objArrCopyOf, zzdquVar.f25803b, zzdquVar2.f25803b);
        return new zzdqu(i2, iArrCopyOf, objArrCopyOf, true);
    }

    /* renamed from: f */
    public static zzdqu m19782f() {
        return f25802a;
    }

    /* renamed from: g */
    private static void m19783g(int i2, Object obj, InterfaceC7244ux interfaceC7244ux) throws IOException {
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            interfaceC7244ux.mo15863J(i3, ((Long) obj).longValue());
            return;
        }
        if (i4 == 1) {
            interfaceC7244ux.mo15855B(i3, ((Long) obj).longValue());
            return;
        }
        if (i4 == 2) {
            interfaceC7244ux.mo15862I(i3, (zzdmr) obj);
            return;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new RuntimeException(zzdok.m19755f());
            }
            interfaceC7244ux.mo15857D(i3, ((Integer) obj).intValue());
        } else if (interfaceC7244ux.mo15859F() == zzdob.zze.f25769l) {
            interfaceC7244ux.mo15870Q(i3);
            ((zzdqu) obj).m19789h(interfaceC7244ux);
            interfaceC7244ux.mo15856C(i3);
        } else {
            interfaceC7244ux.mo15856C(i3);
            ((zzdqu) obj).m19789h(interfaceC7244ux);
            interfaceC7244ux.mo15870Q(i3);
        }
    }

    /* renamed from: i */
    static zzdqu m19784i() {
        return new zzdqu();
    }

    /* renamed from: b */
    final void m19785b(InterfaceC7244ux interfaceC7244ux) throws IOException {
        if (interfaceC7244ux.mo15859F() == zzdob.zze.f25770m) {
            for (int i2 = this.f25803b - 1; i2 >= 0; i2--) {
                interfaceC7244ux.mo15860G(this.f25804c[i2] >>> 3, this.f25805d[i2]);
            }
            return;
        }
        for (int i3 = 0; i3 < this.f25803b; i3++) {
            interfaceC7244ux.mo15860G(this.f25804c[i3] >>> 3, this.f25805d[i3]);
        }
    }

    /* renamed from: c */
    final void m19786c(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.f25803b; i3++) {
            C7427zv.m16163c(sb, i2, String.valueOf(this.f25804c[i3] >>> 3), this.f25805d[i3]);
        }
    }

    /* renamed from: d */
    public final void m19787d() {
        this.f25807f = false;
    }

    /* renamed from: e */
    public final int m19788e() {
        int iM19611B0;
        int i2 = this.f25806e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f25803b; i4++) {
            int i5 = this.f25804c[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                iM19611B0 = zzdni.m19611B0(i6, ((Long) this.f25805d[i4]).longValue());
            } else if (i7 == 1) {
                iM19611B0 = zzdni.m19615F0(i6, ((Long) this.f25805d[i4]).longValue());
            } else if (i7 == 2) {
                iM19611B0 = zzdni.m19620J(i6, (zzdmr) this.f25805d[i4]);
            } else if (i7 == 3) {
                iM19611B0 = (zzdni.m19635h0(i6) << 1) + ((zzdqu) this.f25805d[i4]).m19788e();
            } else {
                if (i7 != 5) {
                    throw new IllegalStateException(zzdok.m19755f());
                }
                iM19611B0 = zzdni.m19649r(i6, ((Integer) this.f25805d[i4]).intValue());
            }
            i3 += iM19611B0;
        }
        this.f25806e = i3;
        return i3;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzdqu)) {
            return false;
        }
        zzdqu zzdquVar = (zzdqu) obj;
        int i2 = this.f25803b;
        if (i2 == zzdquVar.f25803b) {
            int[] iArr = this.f25804c;
            int[] iArr2 = zzdquVar.f25804c;
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
                Object[] objArr = this.f25805d;
                Object[] objArr2 = zzdquVar.f25805d;
                int i4 = this.f25803b;
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

    /* renamed from: h */
    public final void m19789h(InterfaceC7244ux interfaceC7244ux) throws IOException {
        if (this.f25803b == 0) {
            return;
        }
        if (interfaceC7244ux.mo15859F() == zzdob.zze.f25769l) {
            for (int i2 = 0; i2 < this.f25803b; i2++) {
                m19783g(this.f25804c[i2], this.f25805d[i2], interfaceC7244ux);
            }
            return;
        }
        for (int i3 = this.f25803b - 1; i3 >= 0; i3--) {
            m19783g(this.f25804c[i3], this.f25805d[i3], interfaceC7244ux);
        }
    }

    public final int hashCode() {
        int i2 = this.f25803b;
        int i3 = (i2 + 527) * 31;
        int[] iArr = this.f25804c;
        int iHashCode = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i3 + i4) * 31;
        Object[] objArr = this.f25805d;
        int i7 = this.f25803b;
        for (int i8 = 0; i8 < i7; i8++) {
            iHashCode = (iHashCode * 31) + objArr[i8].hashCode();
        }
        return i6 + iHashCode;
    }

    /* renamed from: j */
    public final int m19790j() {
        int i2 = this.f25806e;
        if (i2 != -1) {
            return i2;
        }
        int iM19623N = 0;
        for (int i3 = 0; i3 < this.f25803b; i3++) {
            iM19623N += zzdni.m19623N(this.f25804c[i3] >>> 3, (zzdmr) this.f25805d[i3]);
        }
        this.f25806e = iM19623N;
        return iM19623N;
    }

    /* renamed from: k */
    final void m19791k(int i2, Object obj) {
        if (!this.f25807f) {
            throw new UnsupportedOperationException();
        }
        int i3 = this.f25803b;
        int[] iArr = this.f25804c;
        if (i3 == iArr.length) {
            int i4 = i3 + (i3 < 4 ? 8 : i3 >> 1);
            this.f25804c = Arrays.copyOf(iArr, i4);
            this.f25805d = Arrays.copyOf(this.f25805d, i4);
        }
        int[] iArr2 = this.f25804c;
        int i5 = this.f25803b;
        iArr2[i5] = i2;
        this.f25805d[i5] = obj;
        this.f25803b = i5 + 1;
    }

    private zzdqu(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.f25806e = -1;
        this.f25803b = i2;
        this.f25804c = iArr;
        this.f25805d = objArr;
        this.f25807f = z;
    }
}
