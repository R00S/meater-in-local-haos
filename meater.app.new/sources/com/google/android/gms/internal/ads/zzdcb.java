package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzdcb<P> {

    /* renamed from: a */
    private final P f25469a;

    /* renamed from: b */
    private final byte[] f25470b;

    /* renamed from: c */
    private final zzdgu f25471c;

    /* renamed from: d */
    private final zzdhm f25472d;

    public zzdcb(P p, byte[] bArr, zzdgu zzdguVar, zzdhm zzdhmVar) {
        this.f25469a = p;
        this.f25470b = Arrays.copyOf(bArr, bArr.length);
        this.f25471c = zzdguVar;
        this.f25472d = zzdhmVar;
    }

    /* renamed from: a */
    public final P m19201a() {
        return this.f25469a;
    }

    /* renamed from: b */
    public final zzdhm m19202b() {
        return this.f25472d;
    }

    /* renamed from: c */
    public final byte[] m19203c() {
        byte[] bArr = this.f25470b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
