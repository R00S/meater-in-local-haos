package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzeu extends zzfk {

    /* renamed from: n */
    private static volatile Long f26068n;

    /* renamed from: o */
    private static final Object f26069o = new Object();

    public zzeu(zzdy zzdyVar, String str, String str2, zzbp.zza.C11479zza c11479zza, int i2, int i3) {
        super(zzdyVar, str, str2, c11479zza, i2, 22);
    }

    @Override // com.google.android.gms.internal.ads.zzfk
    /* renamed from: a */
    protected final void mo19932a() throws IllegalAccessException, InvocationTargetException {
        if (f26068n == null) {
            synchronized (f26069o) {
                if (f26068n == null) {
                    f26068n = (Long) this.f26093k.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f26092j) {
            this.f26092j.m18068O(f26068n.longValue());
        }
    }
}
