package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class zzdst extends zzdsr implements zzbd {

    /* renamed from: q */
    private int f25954q;

    /* renamed from: r */
    private int f25955r;

    protected zzdst(String str) {
        super(str);
    }

    /* renamed from: f */
    public final int m19854f() {
        if (!this.f25942i) {
            m19852d();
        }
        return this.f25954q;
    }

    /* renamed from: g */
    protected final long m19855g(ByteBuffer byteBuffer) {
        this.f25954q = zzbc.m17394a(byteBuffer.get());
        this.f25955r = (zzbc.m17396c(byteBuffer) << 8) + 0 + zzbc.m17394a(byteBuffer.get());
        return 4L;
    }
}
