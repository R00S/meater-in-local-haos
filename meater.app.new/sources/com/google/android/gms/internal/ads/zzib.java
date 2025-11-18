package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzib implements zzie {

    /* renamed from: a */
    private static final byte[] f26254a = new byte[RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT];

    /* renamed from: b */
    private final zzjp f26255b;

    /* renamed from: c */
    private long f26256c;

    /* renamed from: d */
    private long f26257d;

    public zzib(zzjp zzjpVar, long j2, long j3) {
        this.f26255b = zzjpVar;
        this.f26256c = j2;
        this.f26257d = j3;
    }

    @Override // com.google.android.gms.internal.ads.zzie
    /* renamed from: a */
    public final void mo20061a(int i2) throws InterruptedException, IOException {
        int i3 = i2;
        while (i3 > 0) {
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            zzjp zzjpVar = this.f26255b;
            byte[] bArr = f26254a;
            int i4 = zzjpVar.read(bArr, 0, Math.min(bArr.length, i3));
            if (i4 == -1) {
                throw new EOFException();
            }
            i3 -= i4;
        }
        this.f26256c += i2;
    }

    @Override // com.google.android.gms.internal.ads.zzie
    /* renamed from: b */
    public final boolean mo20062b(byte[] bArr, int i2, int i3, boolean z) throws InterruptedException, IOException {
        int i4 = i3;
        while (i4 > 0) {
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            int i5 = this.f26255b.read(bArr, i2, i4);
            if (i5 == -1) {
                if (z && i4 == i3) {
                    return false;
                }
                throw new EOFException();
            }
            i2 += i5;
            i4 -= i5;
        }
        this.f26256c += i3;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzie
    public final long getPosition() {
        return this.f26256c;
    }

    @Override // com.google.android.gms.internal.ads.zzie
    public final void readFully(byte[] bArr, int i2, int i3) throws InterruptedException, IOException {
        mo20062b(bArr, i2, i3, false);
    }
}
