package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zznm implements zzno {

    /* renamed from: a */
    private static final byte[] f26647a = new byte[RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT];

    /* renamed from: b */
    private final zzrv f26648b;

    /* renamed from: c */
    private final long f26649c;

    /* renamed from: d */
    private long f26650d;

    /* renamed from: e */
    private byte[] f26651e = new byte[65536];

    /* renamed from: f */
    private int f26652f;

    /* renamed from: g */
    private int f26653g;

    public zznm(zzrv zzrvVar, long j2, long j3) {
        this.f26648b = zzrvVar;
        this.f26650d = j2;
        this.f26649c = j3;
    }

    /* renamed from: h */
    private final int m20316h(byte[] bArr, int i2, int i3, int i4, boolean z) throws InterruptedException, IOException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int i5 = this.f26648b.read(bArr, i2 + i4, i3 - i4);
        if (i5 != -1) {
            return i4 + i5;
        }
        if (i4 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: i */
    private final int m20317i(int i2) {
        int iMin = Math.min(this.f26653g, i2);
        m20318j(iMin);
        return iMin;
    }

    /* renamed from: j */
    private final void m20318j(int i2) {
        int i3 = this.f26653g - i2;
        this.f26653g = i3;
        this.f26652f = 0;
        byte[] bArr = this.f26651e;
        byte[] bArr2 = i3 < bArr.length - 524288 ? new byte[65536 + i3] : bArr;
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        this.f26651e = bArr2;
    }

    /* renamed from: k */
    private final void m20319k(int i2) {
        if (i2 != -1) {
            this.f26650d += i2;
        }
    }

    /* renamed from: l */
    private final int m20320l(byte[] bArr, int i2, int i3) {
        int i4 = this.f26653g;
        if (i4 == 0) {
            return 0;
        }
        int iMin = Math.min(i4, i3);
        System.arraycopy(this.f26651e, 0, bArr, i2, iMin);
        m20318j(iMin);
        return iMin;
    }

    /* renamed from: m */
    private final boolean m20321m(int i2, boolean z) throws InterruptedException, IOException {
        int i3 = this.f26652f + i2;
        byte[] bArr = this.f26651e;
        if (i3 > bArr.length) {
            this.f26651e = Arrays.copyOf(this.f26651e, zzsy.m20553q(bArr.length << 1, 65536 + i3, i3 + 524288));
        }
        int iMin = Math.min(this.f26653g - this.f26652f, i2);
        while (iMin < i2) {
            iMin = m20316h(this.f26651e, this.f26652f, i2, iMin, false);
            if (iMin == -1) {
                return false;
            }
        }
        int i4 = this.f26652f + i2;
        this.f26652f = i4;
        this.f26653g = Math.max(this.f26653g, i4);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzno
    /* renamed from: a */
    public final void mo20322a(int i2) throws InterruptedException, IOException {
        int iM20317i = m20317i(i2);
        while (iM20317i < i2 && iM20317i != -1) {
            byte[] bArr = f26647a;
            iM20317i = m20316h(bArr, -iM20317i, Math.min(i2, bArr.length + iM20317i), iM20317i, false);
        }
        m20319k(iM20317i);
    }

    @Override // com.google.android.gms.internal.ads.zzno
    /* renamed from: b */
    public final boolean mo20323b(byte[] bArr, int i2, int i3, boolean z) throws InterruptedException, IOException {
        int iM20320l = m20320l(bArr, i2, i3);
        while (iM20320l < i3 && iM20320l != -1) {
            iM20320l = m20316h(bArr, i2, i3, iM20320l, z);
        }
        m20319k(iM20320l);
        return iM20320l != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzno
    /* renamed from: c */
    public final void mo20324c() {
        this.f26652f = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzno
    /* renamed from: d */
    public final void mo20325d(byte[] bArr, int i2, int i3) throws InterruptedException, IOException {
        if (m20321m(i3, false)) {
            System.arraycopy(this.f26651e, this.f26652f - i3, bArr, i2, i3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzno
    /* renamed from: e */
    public final int mo20326e(int i2) throws InterruptedException, IOException {
        int iM20317i = m20317i(i2);
        if (iM20317i == 0) {
            byte[] bArr = f26647a;
            iM20317i = m20316h(bArr, 0, Math.min(i2, bArr.length), 0, true);
        }
        m20319k(iM20317i);
        return iM20317i;
    }

    @Override // com.google.android.gms.internal.ads.zzno
    /* renamed from: f */
    public final long mo20327f() {
        return this.f26649c;
    }

    @Override // com.google.android.gms.internal.ads.zzno
    /* renamed from: g */
    public final void mo20328g(int i2) throws InterruptedException, IOException {
        m20321m(i2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final long getPosition() {
        return this.f26650d;
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final int read(byte[] bArr, int i2, int i3) throws InterruptedException, IOException {
        int iM20320l = m20320l(bArr, i2, i3);
        if (iM20320l == 0) {
            iM20320l = m20316h(bArr, i2, i3, 0, true);
        }
        m20319k(iM20320l);
        return iM20320l;
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final void readFully(byte[] bArr, int i2, int i3) throws InterruptedException, IOException {
        mo20323b(bArr, i2, i3, false);
    }
}
