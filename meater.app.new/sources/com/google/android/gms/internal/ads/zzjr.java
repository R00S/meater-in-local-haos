package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzjr implements zzjl {

    /* renamed from: a */
    private final int f26377a;

    /* renamed from: b */
    private int f26378b;

    /* renamed from: c */
    private int f26379c;

    /* renamed from: d */
    private zzjk[] f26380d;

    public zzjr(int i2) {
        zzkh.m20126a(true);
        this.f26377a = 262144;
        this.f26380d = new zzjk[100];
    }

    /* renamed from: e */
    private final synchronized int m20108e() {
        return this.f26378b * this.f26377a;
    }

    @Override // com.google.android.gms.internal.ads.zzjl
    /* renamed from: a */
    public final int mo20105a() {
        return this.f26377a;
    }

    @Override // com.google.android.gms.internal.ads.zzjl
    /* renamed from: b */
    public final synchronized zzjk mo20106b() {
        this.f26378b++;
        int i2 = this.f26379c;
        if (i2 <= 0) {
            return new zzjk(new byte[this.f26377a], 0);
        }
        zzjk[] zzjkVarArr = this.f26380d;
        int i3 = i2 - 1;
        this.f26379c = i3;
        return zzjkVarArr[i3];
    }

    @Override // com.google.android.gms.internal.ads.zzjl
    /* renamed from: c */
    public final synchronized void mo20107c(zzjk zzjkVar) {
        zzkh.m20126a(zzjkVar.f26360a.length == this.f26377a);
        this.f26378b--;
        int i2 = this.f26379c;
        zzjk[] zzjkVarArr = this.f26380d;
        if (i2 == zzjkVarArr.length) {
            this.f26380d = (zzjk[]) Arrays.copyOf(zzjkVarArr, zzjkVarArr.length << 1);
        }
        zzjk[] zzjkVarArr2 = this.f26380d;
        int i3 = this.f26379c;
        this.f26379c = i3 + 1;
        zzjkVarArr2[i3] = zzjkVar;
        notifyAll();
    }

    /* renamed from: d */
    public final synchronized void m20109d(int i2) throws InterruptedException {
        while (m20108e() > i2) {
            wait();
        }
    }

    /* renamed from: f */
    public final synchronized void m20110f(int i2) {
        int iMax = Math.max(0, zzkq.m20161g(0, this.f26377a) - this.f26378b);
        int i3 = this.f26379c;
        if (iMax < i3) {
            Arrays.fill(this.f26380d, iMax, i3, (Object) null);
            this.f26379c = iMax;
        }
    }
}
