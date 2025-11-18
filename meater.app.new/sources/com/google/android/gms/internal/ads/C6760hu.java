package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.hu */
/* loaded from: classes2.dex */
final class C6760hu extends C6945mu {

    /* renamed from: k */
    private final int f19246k;

    /* renamed from: l */
    private final int f19247l;

    C6760hu(byte[] bArr, int i2, int i3) {
        super(bArr);
        zzdmr.m19601y(i2, i2 + i3, bArr.length);
        this.f19246k = i2;
        this.f19247l = i3;
    }

    @Override // com.google.android.gms.internal.ads.C6945mu
    /* renamed from: F */
    protected final int mo15314F() {
        return this.f19246k;
    }

    @Override // com.google.android.gms.internal.ads.C6945mu, com.google.android.gms.internal.ads.zzdmr
    /* renamed from: h */
    protected final void mo15315h(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.f19941j, mo15314F(), bArr, 0, i4);
    }

    @Override // com.google.android.gms.internal.ads.C6945mu, com.google.android.gms.internal.ads.zzdmr
    public final int size() {
        return this.f19247l;
    }

    @Override // com.google.android.gms.internal.ads.C6945mu, com.google.android.gms.internal.ads.zzdmr
    /* renamed from: v */
    public final byte mo15316v(int i2) {
        int size = size();
        if (((size - (i2 + 1)) | i2) >= 0) {
            return this.f19941j[this.f19246k + i2];
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
        sb2.append(size);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.C6945mu, com.google.android.gms.internal.ads.zzdmr
    /* renamed from: w */
    final byte mo15317w(int i2) {
        return this.f19941j[this.f19246k + i2];
    }
}
