package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzblx implements zzbls {

    /* renamed from: a */
    private final zzcxk f23205a;

    public zzblx(zzcxk zzcxkVar) {
        this.f23205a = zzcxkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbls
    /* renamed from: a */
    public final void mo17873a(Map<String, String> map) {
        String str = map.get("render_in_browser");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f23205a.m19020d(Boolean.parseBoolean(str));
        } catch (Exception unused) {
            throw new IllegalStateException("Invalid render_in_browser state");
        }
    }
}
