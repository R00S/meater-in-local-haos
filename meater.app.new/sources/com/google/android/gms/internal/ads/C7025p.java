package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.p */
/* loaded from: classes2.dex */
final class C7025p extends zzacj<String> {
    C7025p(int i2, String str, String str2) {
        super(i2, str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    /* renamed from: h */
    public final /* synthetic */ String mo15498h(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(m16409a(), m16411n());
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    /* renamed from: i */
    public final /* synthetic */ String mo15499i(Bundle bundle) {
        String strValueOf = String.valueOf(m16409a());
        if (!bundle.containsKey(strValueOf.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strValueOf) : new String("com.google.android.gms.ads.flag."))) {
            return m16411n();
        }
        String strValueOf2 = String.valueOf(m16409a());
        return bundle.getString(strValueOf2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strValueOf2) : new String("com.google.android.gms.ads.flag."));
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    /* renamed from: j */
    public final /* synthetic */ String mo15500j(JSONObject jSONObject) {
        return jSONObject.optString(m16409a(), m16411n());
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    /* renamed from: k */
    public final /* synthetic */ void mo15501k(SharedPreferences.Editor editor, String str) {
        editor.putString(m16409a(), str);
    }
}
