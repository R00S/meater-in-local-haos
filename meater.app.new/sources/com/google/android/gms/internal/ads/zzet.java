package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzet implements Callable {

    /* renamed from: f */
    private final zzdy f26066f;

    /* renamed from: g */
    private final zzbp.zza.C11479zza f26067g;

    public zzet(zzdy zzdyVar, zzbp.zza.C11479zza c11479zza) {
        this.f26066f = zzdyVar;
        this.f26067g = c11479zza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Void call() throws Exception {
        if (this.f26066f.m19899A() != null) {
            this.f26066f.m19899A().get();
        }
        zzbp.zza zzaVarM19916z = this.f26066f.m19916z();
        if (zzaVarM19916z == null) {
            return null;
        }
        try {
            synchronized (this.f26067g) {
                zzbp.zza.C11479zza c11479zza = this.f26067g;
                byte[] bArrMo19587g = zzaVarM19916z.mo19587g();
                c11479zza.mo19592l(bArrMo19587g, 0, bArrMo19587g.length, zzdno.m19703e());
            }
            return null;
        } catch (zzdok unused) {
            return null;
        }
    }
}
