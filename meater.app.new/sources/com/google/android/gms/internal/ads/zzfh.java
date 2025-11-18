package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.internal.ads.zzbp;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class zzfh extends zzfk {

    /* renamed from: n */
    private final View f26080n;

    public zzfh(zzdy zzdyVar, String str, String str2, zzbp.zza.C11479zza c11479zza, int i2, int i3, View view) {
        super(zzdyVar, str, str2, c11479zza, i2, 57);
        this.f26080n = view;
    }

    @Override // com.google.android.gms.internal.ads.zzfk
    /* renamed from: a */
    protected final void mo19932a() throws IllegalAccessException, InvocationTargetException {
        if (this.f26080n != null) {
            Boolean bool = (Boolean) zzyt.m20848e().m16421c(zzacu.f21901y2);
            zzeg zzegVar = new zzeg((String) this.f26093k.invoke(null, this.f26080n, this.f26089g.m19901a().getResources().getDisplayMetrics(), bool));
            zzbp.zza.zzf.C11481zza c11481zzaM18178y = zzbp.zza.zzf.m18178y();
            c11481zzaM18178y.m18181u(zzegVar.f26039b.longValue()).m18182v(zzegVar.f26040c.longValue()).m18183w(zzegVar.f26041d.longValue());
            if (bool.booleanValue()) {
                c11481zzaM18178y.m18180A(zzegVar.f26042e.longValue());
            }
            this.f26092j.m18074U((zzbp.zza.zzf) ((zzdob) c11481zzaM18178y.mo19736p0()));
        }
    }
}
