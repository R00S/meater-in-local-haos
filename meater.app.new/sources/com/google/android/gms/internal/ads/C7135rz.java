package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: com.google.android.gms.internal.ads.rz */
/* loaded from: classes2.dex */
final class C7135rz {

    /* renamed from: a */
    private final zzjl f20477a;

    /* renamed from: b */
    private final int f20478b;

    /* renamed from: c */
    private final C7209tz f20479c;

    /* renamed from: d */
    private final LinkedBlockingDeque<zzjk> f20480d;

    /* renamed from: e */
    private final C7246uz f20481e;

    /* renamed from: f */
    private final zzkm f20482f;

    /* renamed from: g */
    private long f20483g;

    /* renamed from: h */
    private long f20484h;

    /* renamed from: i */
    private zzjk f20485i;

    /* renamed from: j */
    private int f20486j;

    public C7135rz(zzjl zzjlVar) {
        this.f20477a = zzjlVar;
        int iMo20105a = zzjlVar.mo20105a();
        this.f20478b = iMo20105a;
        this.f20479c = new C7209tz();
        this.f20480d = new LinkedBlockingDeque<>();
        this.f20481e = new C7246uz();
        this.f20482f = new zzkm(32);
        this.f20486j = iMo20105a;
    }

    /* renamed from: c */
    private final void m15823c(long j2, byte[] bArr, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            m15824i(j2);
            int i4 = (int) (j2 - this.f20483g);
            int iMin = Math.min(i2 - i3, this.f20478b - i4);
            System.arraycopy(this.f20480d.peek().f26360a, i4 + 0, bArr, i3, iMin);
            j2 += iMin;
            i3 += iMin;
        }
    }

    /* renamed from: i */
    private final void m15824i(long j2) {
        int i2 = ((int) (j2 - this.f20483g)) / this.f20478b;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f20477a.mo20107c(this.f20480d.remove());
            this.f20483g += this.f20478b;
        }
    }

    /* renamed from: l */
    private final void m15825l() {
        if (this.f20486j == this.f20478b) {
            this.f20486j = 0;
            zzjk zzjkVarMo20106b = this.f20477a.mo20106b();
            this.f20485i = zzjkVarMo20106b;
            this.f20480d.add(zzjkVarMo20106b);
        }
    }

    /* renamed from: a */
    public final void m15826a() {
        this.f20479c.m15912a();
        while (!this.f20480d.isEmpty()) {
            this.f20477a.mo20107c(this.f20480d.remove());
        }
        this.f20483g = 0L;
        this.f20484h = 0L;
        this.f20485i = null;
        this.f20486j = this.f20478b;
    }

    /* renamed from: b */
    public final void m15827b(long j2, int i2, long j3, int i3, byte[] bArr) {
        this.f20479c.m15913b(j2, i2, j3, i3, bArr);
    }

    /* renamed from: d */
    public final int m15828d(zzie zzieVar, int i2) throws InterruptedException, IOException {
        m15825l();
        int iMin = Math.min(i2, this.f20478b - this.f20486j);
        zzieVar.readFully(this.f20485i.f26360a, this.f20486j + 0, iMin);
        this.f20486j += iMin;
        this.f20484h += iMin;
        return iMin;
    }

    /* renamed from: e */
    public final void m15829e(zzkm zzkmVar, int i2) {
        int i3 = i2;
        while (i3 > 0) {
            m15825l();
            int iMin = Math.min(i3, this.f20478b - this.f20486j);
            zzkmVar.m20148j(this.f20485i.f26360a, this.f20486j + 0, iMin);
            this.f20486j += iMin;
            i3 -= iMin;
        }
        this.f20484h += i2;
    }

    /* renamed from: f */
    public final boolean m15830f(zzhm zzhmVar) {
        return this.f20479c.m15914c(zzhmVar, this.f20481e);
    }

    /* renamed from: g */
    public final boolean m15831g(zzhm zzhmVar) {
        int iM20144f;
        if (!this.f20479c.m15914c(zzhmVar, this.f20481e)) {
            return false;
        }
        if (zzhmVar.m20028a()) {
            C7246uz c7246uz = this.f20481e;
            long j2 = c7246uz.f20660a;
            m15823c(j2, this.f20482f.f26424a, 1);
            long j3 = j2 + 1;
            byte b2 = this.f20482f.f26424a[0];
            boolean z = (b2 & 128) != 0;
            int i2 = b2 & 127;
            zzgb zzgbVar = zzhmVar.f26206a;
            if (zzgbVar.f26107a == null) {
                zzgbVar.f26107a = new byte[16];
            }
            m15823c(j3, zzgbVar.f26107a, i2);
            long j4 = j3 + i2;
            if (z) {
                m15823c(j4, this.f20482f.f26424a, 2);
                j4 += 2;
                this.f20482f.m20145g(0);
                iM20144f = this.f20482f.m20144f();
            } else {
                iM20144f = 1;
            }
            zzgb zzgbVar2 = zzhmVar.f26206a;
            int[] iArr = zzgbVar2.f26110d;
            if (iArr == null || iArr.length < iM20144f) {
                iArr = new int[iM20144f];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzgbVar2.f26111e;
            if (iArr3 == null || iArr3.length < iM20144f) {
                iArr3 = new int[iM20144f];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i3 = iM20144f * 6;
                zzkm zzkmVar = this.f20482f;
                if (zzkmVar.m20140b() < i3) {
                    zzkmVar.m20147i(new byte[i3], i3);
                }
                m15823c(j4, this.f20482f.f26424a, i3);
                j4 += i3;
                this.f20482f.m20145g(0);
                for (int i4 = 0; i4 < iM20144f; i4++) {
                    iArr2[i4] = this.f20482f.m20144f();
                    iArr4[i4] = this.f20482f.m20151m();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzhmVar.f26208c - ((int) (j4 - c7246uz.f20660a));
            }
            zzgb zzgbVar3 = zzhmVar.f26206a;
            zzgbVar3.m19963a(iM20144f, iArr2, iArr4, c7246uz.f20661b, zzgbVar3.f26107a, 1);
            long j5 = c7246uz.f20660a;
            int i5 = (int) (j4 - j5);
            c7246uz.f20660a = j5 + i5;
            zzhmVar.f26208c -= i5;
        }
        ByteBuffer byteBuffer = zzhmVar.f26207b;
        if (byteBuffer != null) {
            byteBuffer.capacity();
            int i6 = zzhmVar.f26208c;
        }
        ByteBuffer byteBuffer2 = zzhmVar.f26207b;
        if (byteBuffer2 != null) {
            long j6 = this.f20481e.f20660a;
            int i7 = zzhmVar.f26208c;
            while (i7 > 0) {
                m15824i(j6);
                int i8 = (int) (j6 - this.f20483g);
                int iMin = Math.min(i7, this.f20478b - i8);
                byteBuffer2.put(this.f20480d.peek().f26360a, i8 + 0, iMin);
                j6 += iMin;
                i7 -= iMin;
            }
        }
        m15824i(this.f20479c.m15916e());
        return true;
    }

    /* renamed from: h */
    public final boolean m15832h(long j2) {
        long jM15915d = this.f20479c.m15915d(j2);
        if (jM15915d == -1) {
            return false;
        }
        m15824i(jM15915d);
        return true;
    }

    /* renamed from: j */
    public final void m15833j() {
        m15824i(this.f20479c.m15916e());
    }

    /* renamed from: k */
    public final long m15834k() {
        return this.f20484h;
    }
}
