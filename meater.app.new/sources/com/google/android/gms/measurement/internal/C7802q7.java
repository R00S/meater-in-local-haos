package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzbr;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.q7 */
/* loaded from: classes2.dex */
final class C7802q7 extends AbstractC7703f7 {
    C7802q7(zzkc zzkcVar) {
        super(zzkcVar);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC7703f7
    /* renamed from: v */
    protected final boolean mo22757v() {
        return false;
    }

    /* renamed from: w */
    final List<zzbr.zza> m22812w(String str, List<zzbr.zzc> list, List<zzbr.zzk> list2, Long l) {
        Preconditions.m14368g(str);
        Preconditions.m14372k(list);
        Preconditions.m14372k(list2);
        return new C7838u7(this, str).m22862b(list, list2, l);
    }
}
