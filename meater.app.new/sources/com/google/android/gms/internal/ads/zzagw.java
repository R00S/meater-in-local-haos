package com.google.android.gms.internal.ads;

import java.util.Map;

@zzard
/* loaded from: classes2.dex */
public final class zzagw implements zzaho<Object> {

    /* renamed from: a */
    private final zzagx f22016a;

    public zzagw(zzagx zzagxVar) {
        this.f22016a = zzagxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    /* renamed from: a */
    public final void mo14739a(Object obj, Map<String, String> map) {
        String str = map.get("name");
        if (str == null) {
            zzbad.m17353i("App event with no name parameter.");
        } else {
            this.f22016a.onAppEvent(str, map.get("info"));
        }
    }
}
