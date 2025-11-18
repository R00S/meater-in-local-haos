package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.s1 */
/* loaded from: classes2.dex */
final class C7583s1 extends C7595u1 {

    /* renamed from: k */
    private final int f27889k;

    /* renamed from: l */
    private final int f27890l;

    C7583s1(byte[] bArr, int i2, int i3) {
        super(bArr);
        zzdu.m22154v(i2, i2 + i3, bArr.length);
        this.f27889k = i2;
        this.f27890l = i3;
    }

    @Override // com.google.android.gms.internal.measurement.C7595u1
    /* renamed from: C */
    protected final int mo21394C() {
        return this.f27889k;
    }

    @Override // com.google.android.gms.internal.measurement.C7595u1, com.google.android.gms.internal.measurement.zzdu
    /* renamed from: c */
    public final byte mo21395c(int i2) {
        int iMo21396f = mo21396f();
        if (((iMo21396f - (i2 + 1)) | i2) >= 0) {
            return this.f27901j[this.f27889k + i2];
        }
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i2);
        sb2.append(", ");
        sb2.append(iMo21396f);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.measurement.C7595u1, com.google.android.gms.internal.measurement.zzdu
    /* renamed from: f */
    public final int mo21396f() {
        return this.f27890l;
    }

    @Override // com.google.android.gms.internal.measurement.C7595u1, com.google.android.gms.internal.measurement.zzdu
    /* renamed from: t */
    final byte mo21397t(int i2) {
        return this.f27901j[this.f27889k + i2];
    }
}
