package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzfb extends zzfk {

    /* renamed from: n */
    private final boolean f26074n;

    public zzfb(zzdy zzdyVar, String str, String str2, zzbp.zza.C11479zza c11479zza, int i2, int i3) {
        super(zzdyVar, str, str2, c11479zza, i2, 61);
        this.f26074n = zzdyVar.m19915y();
    }

    @Override // com.google.android.gms.internal.ads.zzfk
    /* renamed from: a */
    protected final void mo19932a() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.f26093k.invoke(null, this.f26089g.m19901a(), Boolean.valueOf(this.f26074n))).longValue();
        synchronized (this.f26092j) {
            this.f26092j.m18091q0(jLongValue);
        }
    }
}
