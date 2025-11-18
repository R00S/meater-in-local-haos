package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzff extends zzfk {

    /* renamed from: n */
    private static volatile Long f26078n;

    /* renamed from: o */
    private static final Object f26079o = new Object();

    public zzff(zzdy zzdyVar, String str, String str2, zzbp.zza.C11479zza c11479zza, int i2, int i3) {
        super(zzdyVar, str, str2, c11479zza, i2, 33);
    }

    @Override // com.google.android.gms.internal.ads.zzfk
    /* renamed from: a */
    protected final void mo19932a() throws IllegalAccessException, InvocationTargetException {
        if (f26078n == null) {
            synchronized (f26079o) {
                if (f26078n == null) {
                    f26078n = (Long) this.f26093k.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f26092j) {
            this.f26092j.m18072S(f26078n.longValue());
        }
    }
}
