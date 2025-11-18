package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzdrt implements Cloneable {

    /* renamed from: f */
    private static final C7281vx f25846f = new C7281vx();

    /* renamed from: g */
    private boolean f25847g;

    /* renamed from: h */
    private int[] f25848h;

    /* renamed from: i */
    private C7281vx[] f25849i;

    /* renamed from: j */
    private int f25850j;

    zzdrt() {
        this(10);
    }

    /* renamed from: b */
    final int m19821b() {
        return this.f25850j;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i2 = this.f25850j;
        zzdrt zzdrtVar = new zzdrt(i2);
        System.arraycopy(this.f25848h, 0, zzdrtVar.f25848h, 0, i2);
        for (int i3 = 0; i3 < i2; i3++) {
            C7281vx[] c7281vxArr = this.f25849i;
            if (c7281vxArr[i3] != null) {
                zzdrtVar.f25849i[i3] = (C7281vx) c7281vxArr[i3].clone();
            }
        }
        zzdrtVar.f25850j = i2;
        return zzdrtVar;
    }

    /* renamed from: d */
    final C7281vx m19822d(int i2) {
        return this.f25849i[i2];
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdrt)) {
            return false;
        }
        zzdrt zzdrtVar = (zzdrt) obj;
        int i2 = this.f25850j;
        if (i2 != zzdrtVar.f25850j) {
            return false;
        }
        int[] iArr = this.f25848h;
        int[] iArr2 = zzdrtVar.f25848h;
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
            C7281vx[] c7281vxArr = this.f25849i;
            C7281vx[] c7281vxArr2 = zzdrtVar.f25849i;
            int i4 = this.f25850j;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    z2 = true;
                    break;
                }
                if (!c7281vxArr[i5].equals(c7281vxArr2[i5])) {
                    z2 = false;
                    break;
                }
                i5++;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 17;
        for (int i2 = 0; i2 < this.f25850j; i2++) {
            iHashCode = (((iHashCode * 31) + this.f25848h[i2]) * 31) + this.f25849i[i2].hashCode();
        }
        return iHashCode;
    }

    private zzdrt(int i2) {
        this.f25847g = false;
        int i3 = i2 << 2;
        int i4 = 4;
        while (true) {
            if (i4 >= 32) {
                break;
            }
            int i5 = (1 << i4) - 12;
            if (i3 <= i5) {
                i3 = i5;
                break;
            }
            i4++;
        }
        int i6 = i3 / 4;
        this.f25848h = new int[i6];
        this.f25849i = new C7281vx[i6];
        this.f25850j = 0;
    }
}
