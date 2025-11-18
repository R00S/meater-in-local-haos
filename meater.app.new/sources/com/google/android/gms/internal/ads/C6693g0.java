package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.g0 */
/* loaded from: classes2.dex */
final class C6693g0 implements zzaho<Object> {
    C6693g0() {
    }

    @Override // com.google.android.gms.internal.ads.zzaho
    /* renamed from: a */
    public final void mo14739a(Object obj, Map<String, String> map) {
        String strValueOf = String.valueOf(map.get("string"));
        zzbad.m17352h(strValueOf.length() != 0 ? "Received log message: ".concat(strValueOf) : new String("Received log message: "));
    }
}
