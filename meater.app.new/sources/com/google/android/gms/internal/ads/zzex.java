package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzex extends zzfk {

    /* renamed from: n */
    private static volatile String f26071n;

    /* renamed from: o */
    private static final Object f26072o = new Object();

    public zzex(zzdy zzdyVar, String str, String str2, zzbp.zza.C11479zza c11479zza, int i2, int i3) {
        super(zzdyVar, str, str2, c11479zza, i2, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzfk
    /* renamed from: a */
    protected final void mo19932a() throws IllegalAccessException, InvocationTargetException {
        this.f26092j.m18052A0("E");
        if (f26071n == null) {
            synchronized (f26072o) {
                if (f26071n == null) {
                    f26071n = (String) this.f26093k.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f26092j) {
            this.f26092j.m18052A0(f26071n);
        }
    }
}
