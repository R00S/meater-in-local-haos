package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Date;

/* loaded from: classes2.dex */
public final class zzbg extends zzdst {

    /* renamed from: A */
    private int f22973A;

    /* renamed from: B */
    private int f22974B;

    /* renamed from: C */
    private int f22975C;

    /* renamed from: D */
    private int f22976D;

    /* renamed from: E */
    private int f22977E;

    /* renamed from: F */
    private int f22978F;

    /* renamed from: s */
    private Date f22979s;

    /* renamed from: t */
    private Date f22980t;

    /* renamed from: u */
    private long f22981u;

    /* renamed from: v */
    private long f22982v;

    /* renamed from: w */
    private double f22983w;

    /* renamed from: x */
    private float f22984x;

    /* renamed from: y */
    private zzdtd f22985y;

    /* renamed from: z */
    private long f22986z;

    public zzbg() {
        super("mvhd");
        this.f22983w = 1.0d;
        this.f22984x = 1.0f;
        this.f22985y = zzdtd.f25970a;
    }

    @Override // com.google.android.gms.internal.ads.zzdsr
    /* renamed from: e */
    public final void mo15239e(ByteBuffer byteBuffer) {
        m19855g(byteBuffer);
        if (m19854f() == 1) {
            this.f22979s = zzdsy.m19859a(zzbc.m17397d(byteBuffer));
            this.f22980t = zzdsy.m19859a(zzbc.m17397d(byteBuffer));
            this.f22981u = zzbc.m17395b(byteBuffer);
            this.f22982v = zzbc.m17397d(byteBuffer);
        } else {
            this.f22979s = zzdsy.m19859a(zzbc.m17395b(byteBuffer));
            this.f22980t = zzdsy.m19859a(zzbc.m17395b(byteBuffer));
            this.f22981u = zzbc.m17395b(byteBuffer);
            this.f22982v = zzbc.m17395b(byteBuffer);
        }
        this.f22983w = zzbc.m17398e(byteBuffer);
        byteBuffer.get(new byte[2]);
        this.f22984x = ((short) ((r0[1] & 255) | ((short) (0 | ((r0[0] << 8) & 65280))))) / 256.0f;
        zzbc.m17396c(byteBuffer);
        zzbc.m17395b(byteBuffer);
        zzbc.m17395b(byteBuffer);
        this.f22985y = zzdtd.m19861a(byteBuffer);
        this.f22973A = byteBuffer.getInt();
        this.f22974B = byteBuffer.getInt();
        this.f22975C = byteBuffer.getInt();
        this.f22976D = byteBuffer.getInt();
        this.f22977E = byteBuffer.getInt();
        this.f22978F = byteBuffer.getInt();
        this.f22986z = zzbc.m17395b(byteBuffer);
    }

    /* renamed from: h */
    public final long m17642h() {
        return this.f22982v;
    }

    /* renamed from: i */
    public final long m17643i() {
        return this.f22981u;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.f22979s + ";modificationTime=" + this.f22980t + ";timescale=" + this.f22981u + ";duration=" + this.f22982v + ";rate=" + this.f22983w + ";volume=" + this.f22984x + ";matrix=" + this.f22985y + ";nextTrackId=" + this.f22986z + "]";
    }
}
