package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.kj */
/* loaded from: classes2.dex */
final class C6860kj implements zzbtk {

    /* renamed from: f */
    private final Context f19707f;

    /* renamed from: g */
    private final zzavg f19708g;

    C6860kj(Context context, zzavg zzavgVar) {
        this.f19707f = context;
        this.f19708g = zzavgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    /* renamed from: N */
    public final void mo15437N(zzarx zzarxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbtk
    /* renamed from: q */
    public final void mo15438q(zzcxu zzcxuVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (TextUtils.isEmpty(zzcxuVar.f25289b.f25284b.f25275d)) {
            return;
        }
        this.f19708g.m17017w(this.f19707f, zzcxuVar.f25289b.f25284b.f25275d);
    }
}
