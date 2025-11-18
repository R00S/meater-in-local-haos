package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzfg extends zzfk {
    public zzfg(zzdy zzdyVar, String str, String str2, zzbp.zza.C11479zza c11479zza, int i2, int i3) {
        super(zzdyVar, str, str2, c11479zza, i2, 48);
    }

    @Override // com.google.android.gms.internal.ads.zzfk
    /* renamed from: a */
    protected final void mo19932a() throws IllegalAccessException, InvocationTargetException {
        this.f26092j.m18100w0(zzbz.ENUM_FAILURE);
        boolean zBooleanValue = ((Boolean) this.f26093k.invoke(null, this.f26089g.m19901a())).booleanValue();
        synchronized (this.f26092j) {
            if (zBooleanValue) {
                this.f26092j.m18100w0(zzbz.ENUM_TRUE);
            } else {
                this.f26092j.m18100w0(zzbz.ENUM_FALSE);
            }
        }
    }
}
