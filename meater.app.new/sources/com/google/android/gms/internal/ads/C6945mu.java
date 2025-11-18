package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.ads.mu */
/* loaded from: classes2.dex */
class C6945mu extends AbstractC6908lu {

    /* renamed from: j */
    protected final byte[] f19941j;

    C6945mu(byte[] bArr) {
        bArr.getClass();
        this.f19941j = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzdmr
    /* renamed from: C */
    public final zzdmr mo15566C(int i2, int i3) {
        int iM19601y = zzdmr.m19601y(0, i3, size());
        return iM19601y == 0 ? zzdmr.f25661f : new C6760hu(this.f19941j, mo15314F(), iM19601y);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6908lu
    /* renamed from: E */
    final boolean mo15517E(zzdmr zzdmrVar, int i2, int i3) {
        if (i3 > zzdmrVar.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i3);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i3 > zzdmrVar.size()) {
            int size2 = zzdmrVar.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i3);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!(zzdmrVar instanceof C6945mu)) {
            return zzdmrVar.mo15566C(0, i3).equals(mo15566C(0, i3));
        }
        C6945mu c6945mu = (C6945mu) zzdmrVar;
        byte[] bArr = this.f19941j;
        byte[] bArr2 = c6945mu.f19941j;
        int iMo15314F = mo15314F() + i3;
        int iMo15314F2 = mo15314F();
        int iMo15314F3 = c6945mu.mo15314F();
        while (iMo15314F2 < iMo15314F) {
            if (bArr[iMo15314F2] != bArr2[iMo15314F3]) {
                return false;
            }
            iMo15314F2++;
            iMo15314F3++;
        }
        return true;
    }

    /* renamed from: F */
    protected int mo15314F() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdmr
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdmr) || size() != ((zzdmr) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C6945mu)) {
            return obj.equals(this);
        }
        C6945mu c6945mu = (C6945mu) obj;
        int iM19605r = m19605r();
        int iM19605r2 = c6945mu.m19605r();
        if (iM19605r == 0 || iM19605r2 == 0 || iM19605r == iM19605r2) {
            return mo15517E(c6945mu, 0, size());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdmr
    /* renamed from: f */
    protected final String mo15567f(Charset charset) {
        return new String(this.f19941j, mo15314F(), size(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzdmr
    /* renamed from: g */
    final void mo15568g(zzdmq zzdmqVar) throws IOException {
        zzdmqVar.mo19594a(this.f19941j, mo15314F(), size());
    }

    @Override // com.google.android.gms.internal.ads.zzdmr
    /* renamed from: h */
    protected void mo15315h(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.f19941j, 0, bArr, 0, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzdmr
    /* renamed from: o */
    public final boolean mo15569o() {
        int iMo15314F = mo15314F();
        return C6837jx.m15384k(this.f19941j, iMo15314F, size() + iMo15314F);
    }

    @Override // com.google.android.gms.internal.ads.zzdmr
    /* renamed from: q */
    public final zzdnd mo15570q() {
        return zzdnd.m19607v(this.f19941j, mo15314F(), size(), true);
    }

    @Override // com.google.android.gms.internal.ads.zzdmr
    public int size() {
        return this.f19941j.length;
    }

    @Override // com.google.android.gms.internal.ads.zzdmr
    /* renamed from: u */
    protected final int mo15571u(int i2, int i3, int i4) {
        return zzdod.m19742c(i2, this.f19941j, mo15314F(), i4);
    }

    @Override // com.google.android.gms.internal.ads.zzdmr
    /* renamed from: v */
    public byte mo15316v(int i2) {
        return this.f19941j[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzdmr
    /* renamed from: w */
    byte mo15317w(int i2) {
        return this.f19941j[i2];
    }
}
