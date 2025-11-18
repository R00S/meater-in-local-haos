package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzrz implements zzrt {

    /* renamed from: a */
    private final boolean f26954a;

    /* renamed from: b */
    private final int f26955b;

    /* renamed from: c */
    private final byte[] f26956c;

    /* renamed from: d */
    private final zzrs[] f26957d;

    /* renamed from: e */
    private int f26958e;

    /* renamed from: f */
    private int f26959f;

    /* renamed from: g */
    private int f26960g;

    /* renamed from: h */
    private zzrs[] f26961h;

    public zzrz(boolean z, int i2) {
        this(true, 65536, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    /* renamed from: a */
    public final int mo20454a() {
        return this.f26955b;
    }

    /* renamed from: b */
    public final synchronized void m20460b() {
        if (this.f26954a) {
            m20461c(0);
        }
    }

    /* renamed from: c */
    public final synchronized void m20461c(int i2) {
        boolean z = i2 < this.f26958e;
        this.f26958e = i2;
        if (z) {
            mo20455f();
        }
    }

    /* renamed from: d */
    public final synchronized int m20462d() {
        return this.f26959f * this.f26955b;
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    /* renamed from: f */
    public final synchronized void mo20455f() {
        int iMax = Math.max(0, zzsy.m20546j(this.f26958e, this.f26955b) - this.f26959f);
        int i2 = this.f26960g;
        if (iMax >= i2) {
            return;
        }
        Arrays.fill(this.f26961h, iMax, i2, (Object) null);
        this.f26960g = iMax;
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    /* renamed from: g */
    public final synchronized void mo20456g(zzrs[] zzrsVarArr) {
        int i2 = this.f26960g;
        int length = zzrsVarArr.length + i2;
        zzrs[] zzrsVarArr2 = this.f26961h;
        if (length >= zzrsVarArr2.length) {
            this.f26961h = (zzrs[]) Arrays.copyOf(zzrsVarArr2, Math.max(zzrsVarArr2.length << 1, i2 + zzrsVarArr.length));
        }
        for (zzrs zzrsVar : zzrsVarArr) {
            byte[] bArr = zzrsVar.f26940a;
            zzsk.m20477a(bArr == null || bArr.length == this.f26955b);
            zzrs[] zzrsVarArr3 = this.f26961h;
            int i3 = this.f26960g;
            this.f26960g = i3 + 1;
            zzrsVarArr3[i3] = zzrsVar;
        }
        this.f26959f -= zzrsVarArr.length;
        notifyAll();
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    /* renamed from: h */
    public final synchronized zzrs mo20457h() {
        zzrs zzrsVar;
        this.f26959f++;
        int i2 = this.f26960g;
        if (i2 > 0) {
            zzrs[] zzrsVarArr = this.f26961h;
            int i3 = i2 - 1;
            this.f26960g = i3;
            zzrsVar = zzrsVarArr[i3];
            zzrsVarArr[i3] = null;
        } else {
            zzrsVar = new zzrs(new byte[this.f26955b], 0);
        }
        return zzrsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrt
    /* renamed from: i */
    public final synchronized void mo20458i(zzrs zzrsVar) {
        zzrs[] zzrsVarArr = this.f26957d;
        zzrsVarArr[0] = zzrsVar;
        mo20456g(zzrsVarArr);
    }

    private zzrz(boolean z, int i2, int i3) {
        zzsk.m20477a(true);
        zzsk.m20477a(true);
        this.f26954a = true;
        this.f26955b = 65536;
        this.f26960g = 0;
        this.f26961h = new zzrs[100];
        this.f26956c = null;
        this.f26957d = new zzrs[1];
    }
}
