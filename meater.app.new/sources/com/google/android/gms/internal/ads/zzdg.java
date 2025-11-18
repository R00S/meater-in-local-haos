package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbk;
import com.google.android.gms.internal.ads.zzbp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzdg extends zzdf {
    private zzdg(Context context, String str, boolean z) {
        super(context, str, z);
    }

    /* renamed from: l */
    public static zzdg m19377l(String str, Context context, boolean z) {
        zzdf.m19311g(context, z);
        return new zzdg(context, str, z);
    }

    @Override // com.google.android.gms.internal.ads.zzdf
    /* renamed from: k */
    protected final List<Callable<Void>> mo19249k(zzdy zzdyVar, Context context, zzbp.zza.C11479zza c11479zza, zzbk.zza zzaVar) {
        if (zzdyVar.m19908r() == null || !this.f25522D) {
            return super.mo19249k(zzdyVar, context, c11479zza, zzaVar);
        }
        int iM19907q = zzdyVar.m19907q();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.mo19249k(zzdyVar, context, c11479zza, zzaVar));
        arrayList.add(new zzes(zzdyVar, "3pegtvj7nkb7e3rwh5b+3dnQATJj6aqtaosJ3DkOYPzNGN2w+CoarbJEsY1UQgeA", "/kRTFQbKQx44ublaFMNQ8yNL6QxOrgEofiWDpZSH6zA=", c11479zza, iM19907q, 24));
        return arrayList;
    }
}
