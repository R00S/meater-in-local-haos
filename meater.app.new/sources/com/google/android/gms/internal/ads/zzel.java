package com.google.android.gms.internal.ads;

import android.provider.Settings;
import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzel extends zzfk {
    public zzel(zzdy zzdyVar, String str, String str2, zzbp.zza.C11479zza c11479zza, int i2, int i3) {
        super(zzdyVar, str, str2, c11479zza, i2, 49);
    }

    @Override // com.google.android.gms.internal.ads.zzfk
    /* renamed from: a */
    protected final void mo19932a() throws IllegalAccessException, InvocationTargetException {
        this.f26092j.m18101x0(zzbz.ENUM_FAILURE);
        try {
            this.f26092j.m18101x0(((Boolean) this.f26093k.invoke(null, this.f26089g.m19901a())).booleanValue() ? zzbz.ENUM_TRUE : zzbz.ENUM_FALSE);
        } catch (InvocationTargetException e2) {
            if (!(e2.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e2;
            }
        }
    }
}
