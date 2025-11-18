package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;

@zzard
/* loaded from: classes2.dex */
public final class zzazi extends zzawv {

    /* renamed from: a */
    private final zzbah f22712a;

    /* renamed from: b */
    private final String f22713b;

    public zzazi(Context context, String str, String str2) {
        this(str2, zzk.zzlg().m17177g0(context, str));
    }

    @Override // com.google.android.gms.internal.ads.zzawv
    public final void zzto() {
        this.f22712a.mo15137a(this.f22713b);
    }

    private zzazi(String str, String str2) {
        this.f22712a = new zzbah(str2);
        this.f22713b = str;
    }
}
