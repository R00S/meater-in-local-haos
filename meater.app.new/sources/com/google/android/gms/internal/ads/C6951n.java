package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.n */
/* loaded from: classes2.dex */
final class C6951n extends zzacj<Long> {
    C6951n(int i2, String str, Long l) {
        super(i2, str, l, null);
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    /* renamed from: h */
    public final /* synthetic */ Long mo15498h(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(m16409a(), m16411n().longValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    /* renamed from: i */
    public final /* synthetic */ Long mo15499i(Bundle bundle) {
        String strValueOf = String.valueOf(m16409a());
        if (!bundle.containsKey(strValueOf.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strValueOf) : new String("com.google.android.gms.ads.flag."))) {
            return m16411n();
        }
        String strValueOf2 = String.valueOf(m16409a());
        return Long.valueOf(bundle.getLong(strValueOf2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strValueOf2) : new String("com.google.android.gms.ads.flag.")));
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    /* renamed from: j */
    public final /* synthetic */ Long mo15500j(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(m16409a(), m16411n().longValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    /* renamed from: k */
    public final /* synthetic */ void mo15501k(SharedPreferences.Editor editor, Long l) {
        editor.putLong(m16409a(), l.longValue());
    }
}
