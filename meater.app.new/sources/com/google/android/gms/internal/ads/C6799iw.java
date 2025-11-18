package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* renamed from: com.google.android.gms.internal.ads.iw */
/* loaded from: classes2.dex */
final class C6799iw implements InterfaceC7353xv {

    /* renamed from: a */
    private final zzdpk f19400a;

    /* renamed from: b */
    private final String f19401b;

    /* renamed from: c */
    private final Object[] f19402c;

    /* renamed from: d */
    private final int f19403d;

    C6799iw(zzdpk zzdpkVar, String str, Object[] objArr) {
        this.f19400a = zzdpkVar;
        this.f19401b = str;
        this.f19402c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f19403d = cCharAt;
            return;
        }
        int i2 = cCharAt & 8191;
        int i3 = 13;
        int i4 = 1;
        while (true) {
            int i5 = i4 + 1;
            char cCharAt2 = str.charAt(i4);
            if (cCharAt2 < 55296) {
                this.f19403d = i2 | (cCharAt2 << i3);
                return;
            } else {
                i2 |= (cCharAt2 & 8191) << i3;
                i3 += 13;
                i4 = i5;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7353xv
    /* renamed from: a */
    public final boolean mo15353a() {
        return (this.f19403d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7353xv
    /* renamed from: b */
    public final zzdpk mo15354b() {
        return this.f19400a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7353xv
    /* renamed from: c */
    public final int mo15355c() {
        return (this.f19403d & 1) == 1 ? zzdob.zze.f25766i : zzdob.zze.f25767j;
    }

    /* renamed from: d */
    final String m15356d() {
        return this.f19401b;
    }

    /* renamed from: e */
    final Object[] m15357e() {
        return this.f19402c;
    }
}
