package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzek extends zzfk {

    /* renamed from: n */
    private final Activity f26056n;

    /* renamed from: o */
    private final View f26057o;

    public zzek(zzdy zzdyVar, String str, String str2, zzbp.zza.C11479zza c11479zza, int i2, int i3, View view, Activity activity) {
        super(zzdyVar, str, str2, c11479zza, i2, 62);
        this.f26057o = view;
        this.f26056n = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzfk
    /* renamed from: a */
    protected final void mo19932a() throws IllegalAccessException, InvocationTargetException {
        if (this.f26057o == null) {
            return;
        }
        boolean zBooleanValue = ((Boolean) zzyt.m20848e().m16421c(zzacu.f21829m2)).booleanValue();
        Object[] objArr = (Object[]) this.f26093k.invoke(null, this.f26057o, this.f26056n, Boolean.valueOf(zBooleanValue));
        synchronized (this.f26092j) {
            this.f26092j.m18092r0(((Long) objArr[0]).longValue());
            this.f26092j.m18093s0(((Long) objArr[1]).longValue());
            if (zBooleanValue) {
                this.f26092j.m18053B((String) objArr[2]);
            }
        }
    }
}
