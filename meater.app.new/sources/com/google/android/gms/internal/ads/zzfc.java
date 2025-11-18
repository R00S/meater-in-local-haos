package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzfc extends zzfk {

    /* renamed from: n */
    private final StackTraceElement[] f26075n;

    public zzfc(zzdy zzdyVar, String str, String str2, zzbp.zza.C11479zza c11479zza, int i2, int i3, StackTraceElement[] stackTraceElementArr) {
        super(zzdyVar, str, str2, c11479zza, i2, 45);
        this.f26075n = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzfk
    /* renamed from: a */
    protected final void mo19932a() throws IllegalAccessException, InvocationTargetException {
        StackTraceElement[] stackTraceElementArr = this.f26075n;
        if (stackTraceElementArr != null) {
            zzdw zzdwVar = new zzdw((String) this.f26093k.invoke(null, stackTraceElementArr));
            synchronized (this.f26092j) {
                this.f26092j.m18085j0(zzdwVar.f26002b.longValue());
                if (zzdwVar.f26003c.booleanValue()) {
                    this.f26092j.m18102y0(zzdwVar.f26004d.booleanValue() ? zzbz.ENUM_FALSE : zzbz.ENUM_TRUE);
                } else {
                    this.f26092j.m18102y0(zzbz.ENUM_FAILURE);
                }
            }
        }
    }
}
