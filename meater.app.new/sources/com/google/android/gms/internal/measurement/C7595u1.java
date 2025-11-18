package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.u1 */
/* loaded from: classes2.dex */
class C7595u1 extends AbstractC7601v1 {

    /* renamed from: j */
    protected final byte[] f27901j;

    C7595u1(byte[] bArr) {
        bArr.getClass();
        this.f27901j = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC7601v1
    /* renamed from: A */
    final boolean mo21410A(zzdu zzduVar, int i2, int i3) {
        if (i3 > zzduVar.mo21396f()) {
            int iMo21396f = mo21396f();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i3);
            sb.append(iMo21396f);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i3 > zzduVar.mo21396f()) {
            int iMo21396f2 = zzduVar.mo21396f();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i3);
            sb2.append(", ");
            sb2.append(iMo21396f2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!(zzduVar instanceof C7595u1)) {
            return zzduVar.mo21412i(0, i3).equals(mo21412i(0, i3));
        }
        C7595u1 c7595u1 = (C7595u1) zzduVar;
        byte[] bArr = this.f27901j;
        byte[] bArr2 = c7595u1.f27901j;
        int iMo21394C = mo21394C() + i3;
        int iMo21394C2 = mo21394C();
        int iMo21394C3 = c7595u1.mo21394C();
        while (iMo21394C2 < iMo21394C) {
            if (bArr[iMo21394C2] != bArr2[iMo21394C3]) {
                return false;
            }
            iMo21394C2++;
            iMo21394C3++;
        }
        return true;
    }

    /* renamed from: C */
    protected int mo21394C() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    /* renamed from: c */
    public byte mo21395c(int i2) {
        return this.f27901j[i2];
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdu) || mo21396f() != ((zzdu) obj).mo21396f()) {
            return false;
        }
        if (mo21396f() == 0) {
            return true;
        }
        if (!(obj instanceof C7595u1)) {
            return obj.equals(this);
        }
        C7595u1 c7595u1 = (C7595u1) obj;
        int iM22157z = m22157z();
        int iM22157z2 = c7595u1.m22157z();
        if (iM22157z == 0 || iM22157z2 == 0 || iM22157z == iM22157z2) {
            return mo21410A(c7595u1, 0, mo21396f());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    /* renamed from: f */
    public int mo21396f() {
        return this.f27901j.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    /* renamed from: h */
    protected final int mo21411h(int i2, int i3, int i4) {
        return zzff.m22286a(i2, this.f27901j, mo21394C(), i4);
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    /* renamed from: i */
    public final zzdu mo21412i(int i2, int i3) {
        int iM22154v = zzdu.m22154v(0, i3, mo21396f());
        return iM22154v == 0 ? zzdu.f28037f : new C7583s1(this.f27901j, mo21394C(), iM22154v);
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    /* renamed from: r */
    protected final String mo21413r(Charset charset) {
        return new String(this.f27901j, mo21394C(), mo21396f(), charset);
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    /* renamed from: s */
    final void mo21414s(zzdv zzdvVar) throws IOException {
        zzdvVar.mo22158a(this.f27901j, mo21394C(), mo21396f());
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    /* renamed from: t */
    byte mo21397t(int i2) {
        return this.f27901j[i2];
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    /* renamed from: y */
    public final boolean mo21415y() {
        int iMo21394C = mo21394C();
        return C7556n4.m21253g(this.f27901j, iMo21394C, mo21396f() + iMo21394C);
    }
}
