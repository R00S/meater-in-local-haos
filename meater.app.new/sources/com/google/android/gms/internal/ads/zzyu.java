package com.google.android.gms.internal.ads;

import java.util.Random;

@zzard
/* loaded from: classes2.dex */
public final class zzyu extends zzzz {

    /* renamed from: g */
    private long f27479g;

    /* renamed from: h */
    private final Object f27480h = new Object();

    /* renamed from: f */
    private final Random f27478f = new Random();

    public zzyu() {
        m20852h7();
    }

    @Override // com.google.android.gms.internal.ads.zzzy
    public final long getValue() {
        return this.f27479g;
    }

    /* renamed from: h7 */
    public final void m20852h7() {
        synchronized (this.f27480h) {
            int i2 = 3;
            long jNextInt = 0;
            while (true) {
                i2--;
                if (i2 <= 0) {
                    break;
                }
                jNextInt = this.f27478f.nextInt() + 2147483648L;
                if (jNextInt != this.f27479g && jNextInt != 0) {
                    break;
                }
            }
            this.f27479g = jNextInt;
        }
    }
}
