package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzeq extends zzfk {

    /* renamed from: n */
    private static volatile Long f26063n;

    /* renamed from: o */
    private static final Object f26064o = new Object();

    public zzeq(zzdy zzdyVar, String str, String str2, zzbp.zza.C11479zza c11479zza, int i2, int i3) {
        super(zzdyVar, str, str2, c11479zza, i2, 44);
    }

    @Override // com.google.android.gms.internal.ads.zzfk
    /* renamed from: a */
    protected final void mo19932a() throws IllegalAccessException, InvocationTargetException {
        if (f26063n == null) {
            synchronized (f26064o) {
                if (f26063n == null) {
                    f26063n = (Long) this.f26093k.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f26092j) {
            this.f26092j.m18084h0(f26063n.longValue());
        }
    }
}
