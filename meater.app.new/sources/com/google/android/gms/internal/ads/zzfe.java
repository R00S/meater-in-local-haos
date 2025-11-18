package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzfe extends zzfk {

    /* renamed from: n */
    private final zzeh f26076n;

    /* renamed from: o */
    private long f26077o;

    public zzfe(zzdy zzdyVar, String str, String str2, zzbp.zza.C11479zza c11479zza, int i2, int i3, zzeh zzehVar) {
        super(zzdyVar, str, str2, c11479zza, i2, 53);
        this.f26076n = zzehVar;
        if (zzehVar != null) {
            this.f26077o = zzehVar.m19930d();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfk
    /* renamed from: a */
    protected final void mo19932a() throws IllegalAccessException, InvocationTargetException {
        if (this.f26076n != null) {
            this.f26092j.m18088m0(((Long) this.f26093k.invoke(null, Long.valueOf(this.f26077o))).longValue());
        }
    }
}
