package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzfa extends zzfk {

    /* renamed from: n */
    private List<Long> f26073n;

    public zzfa(zzdy zzdyVar, String str, String str2, zzbp.zza.C11479zza c11479zza, int i2, int i3) {
        super(zzdyVar, str, str2, c11479zza, i2, 31);
        this.f26073n = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfk
    /* renamed from: a */
    protected final void mo19932a() throws IllegalAccessException, InvocationTargetException {
        this.f26092j.m18070Q(-1L);
        this.f26092j.m18071R(-1L);
        if (this.f26073n == null) {
            this.f26073n = (List) this.f26093k.invoke(null, this.f26089g.m19901a());
        }
        List<Long> list = this.f26073n;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.f26092j) {
            this.f26092j.m18070Q(this.f26073n.get(0).longValue());
            this.f26092j.m18071R(this.f26073n.get(1).longValue());
        }
    }
}
