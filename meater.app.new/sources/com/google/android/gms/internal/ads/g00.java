package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
final class g00 {

    /* renamed from: a */
    private static final int[] f18922a = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: b */
    private final byte[] f18923b = new byte[8];

    /* renamed from: c */
    private int f18924c;

    /* renamed from: d */
    private int f18925d;

    /* renamed from: a */
    public final void m15153a() {
        this.f18924c = 0;
        this.f18925d = 0;
    }

    /* renamed from: b */
    public final long m15154b(zzie zzieVar, boolean z, boolean z2) throws InterruptedException, IOException {
        if (this.f18924c == 0) {
            if (!zzieVar.mo20062b(this.f18923b, 0, 1, z)) {
                return -1L;
            }
            int i2 = this.f18923b[0] & 255;
            this.f18925d = -1;
            int i3 = 0;
            while (true) {
                int[] iArr = f18922a;
                if (i3 >= iArr.length) {
                    break;
                }
                if ((iArr[i3] & i2) != 0) {
                    this.f18925d = i3 + 1;
                    break;
                }
                i3++;
            }
            if (this.f18925d == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f18924c = 1;
        }
        zzieVar.readFully(this.f18923b, 1, this.f18925d - 1);
        if (z2) {
            byte[] bArr = this.f18923b;
            bArr[0] = (byte) (bArr[0] & (f18922a[this.f18925d - 1] ^ (-1)));
        }
        long j2 = 0;
        for (int i4 = 0; i4 < this.f18925d; i4++) {
            j2 = (j2 << 8) | (this.f18923b[i4] & 255);
        }
        this.f18924c = 0;
        return j2;
    }

    /* renamed from: c */
    public final int m15155c() {
        return this.f18925d;
    }
}
