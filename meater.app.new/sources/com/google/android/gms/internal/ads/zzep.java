package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzep extends zzfk {
    public zzep(zzdy zzdyVar, String str, String str2, zzbp.zza.C11479zza c11479zza, int i2, int i3) {
        super(zzdyVar, str, str2, c11479zza, i2, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzfk
    /* renamed from: a */
    protected final void mo19932a() throws IllegalAccessException, InvocationTargetException {
        this.f26092j.m18058E(-1L);
        this.f26092j.m18059F(-1L);
        int[] iArr = (int[]) this.f26093k.invoke(null, this.f26089g.m19901a());
        synchronized (this.f26092j) {
            this.f26092j.m18058E(iArr[0]);
            this.f26092j.m18059F(iArr[1]);
            if (iArr[2] != Integer.MIN_VALUE) {
                this.f26092j.m18089n0(iArr[2]);
            }
        }
    }
}
