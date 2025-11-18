package com.google.android.gms.internal.ads;

import java.io.IOException;

@zzard
/* renamed from: com.google.android.gms.internal.ads.b9 */
/* loaded from: classes2.dex */
final class C6517b9 implements zzjp {

    /* renamed from: a */
    private final zzjp f18257a;

    /* renamed from: b */
    private final long f18258b;

    /* renamed from: c */
    private final zzjp f18259c;

    /* renamed from: d */
    private long f18260d;

    C6517b9(zzjp zzjpVar, int i2, zzjp zzjpVar2) {
        this.f18257a = zzjpVar;
        this.f18258b = i2;
        this.f18259c = zzjpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    /* renamed from: a */
    public final long mo14852a(zzjq zzjqVar) throws IOException {
        zzjq zzjqVar2;
        long j2 = zzjqVar.f26373c;
        long j3 = this.f18258b;
        zzjq zzjqVar3 = null;
        if (j2 >= j3) {
            zzjqVar2 = null;
        } else {
            long j4 = zzjqVar.f26374d;
            zzjqVar2 = new zzjq(zzjqVar.f26371a, j2, j4 != -1 ? Math.min(j4, j3 - j2) : j3 - j2, null);
        }
        long j5 = zzjqVar.f26374d;
        if (j5 == -1 || zzjqVar.f26373c + j5 > this.f18258b) {
            long jMax = Math.max(this.f18258b, zzjqVar.f26373c);
            long j6 = zzjqVar.f26374d;
            zzjqVar3 = new zzjq(zzjqVar.f26371a, jMax, j6 != -1 ? Math.min(j6, (zzjqVar.f26373c + j6) - this.f18258b) : -1L, null);
        }
        long jMo14852a = zzjqVar2 != null ? this.f18257a.mo14852a(zzjqVar2) : 0L;
        long jMo14852a2 = zzjqVar3 != null ? this.f18259c.mo14852a(zzjqVar3) : 0L;
        this.f18260d = zzjqVar.f26373c;
        if (jMo14852a == -1 || jMo14852a2 == -1) {
            return -1L;
        }
        return jMo14852a + jMo14852a2;
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final void close() throws IOException {
        this.f18257a.close();
        this.f18259c.close();
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        long j2 = this.f18260d;
        long j3 = this.f18258b;
        if (j2 < j3) {
            i4 = this.f18257a.read(bArr, i2, (int) Math.min(i3, j3 - j2));
            this.f18260d += i4;
        } else {
            i4 = 0;
        }
        if (this.f18260d < this.f18258b) {
            return i4;
        }
        int i5 = this.f18259c.read(bArr, i2 + i4, i3 - i4);
        int i6 = i4 + i5;
        this.f18260d += i5;
        return i6;
    }
}
