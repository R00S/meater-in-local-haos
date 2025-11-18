package com.google.android.gms.internal.ads;

import java.io.IOException;
import okhttp3.internal.p454ws.RealWebSocket;

/* loaded from: classes2.dex */
final class w10 {

    /* renamed from: a */
    private final zzst f20822a = new zzst(8);

    /* renamed from: b */
    private int f20823b;

    /* renamed from: b */
    private final long m15975b(zzno zznoVar) throws InterruptedException, IOException {
        int i2 = 0;
        zznoVar.mo20325d(this.f20822a.f27013a, 0, 1);
        int i3 = this.f20822a.f27013a[0] & 255;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int i4 = 128;
        int i5 = 0;
        while ((i3 & i4) == 0) {
            i4 >>= 1;
            i5++;
        }
        int i6 = i3 & (i4 ^ (-1));
        zznoVar.mo20325d(this.f20822a.f27013a, 1, i5);
        while (i2 < i5) {
            i2++;
            i6 = (this.f20822a.f27013a[i2] & 255) + (i6 << 8);
        }
        this.f20823b += i5 + 1;
        return i6;
    }

    /* renamed from: a */
    public final boolean m15976a(zzno zznoVar) throws InterruptedException, IOException {
        long jMo20327f = zznoVar.mo20327f();
        long j2 = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        if (jMo20327f != -1 && jMo20327f <= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            j2 = jMo20327f;
        }
        int i2 = (int) j2;
        zznoVar.mo20325d(this.f20822a.f27013a, 0, 4);
        long jM20516q = this.f20822a.m20516q();
        this.f20823b = 4;
        while (jM20516q != 440786851) {
            int i3 = this.f20823b + 1;
            this.f20823b = i3;
            if (i3 == i2) {
                return false;
            }
            zznoVar.mo20325d(this.f20822a.f27013a, 0, 1);
            jM20516q = ((jM20516q << 8) & (-256)) | (this.f20822a.f27013a[0] & 255);
        }
        long jM15975b = m15975b(zznoVar);
        long j3 = this.f20823b;
        if (jM15975b != Long.MIN_VALUE && (jMo20327f == -1 || j3 + jM15975b < jMo20327f)) {
            while (true) {
                int i4 = this.f20823b;
                long j4 = j3 + jM15975b;
                if (i4 < j4) {
                    if (m15975b(zznoVar) == Long.MIN_VALUE) {
                        return false;
                    }
                    long jM15975b2 = m15975b(zznoVar);
                    if (jM15975b2 < 0 || jM15975b2 > 2147483647L) {
                        break;
                    }
                    if (jM15975b2 != 0) {
                        zznoVar.mo20328g((int) jM15975b2);
                        this.f20823b = (int) (this.f20823b + jM15975b2);
                    }
                } else if (i4 == j4) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
