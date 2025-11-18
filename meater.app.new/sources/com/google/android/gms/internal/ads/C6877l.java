package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.l */
/* loaded from: classes2.dex */
final class C6877l extends zzacj<Boolean> {
    C6877l(int i2, String str, Boolean bool) {
        super(i2, str, bool, null);
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    /* renamed from: h */
    public final /* synthetic */ Boolean mo15498h(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(m16409a(), m16411n().booleanValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    /* renamed from: i */
    public final /* synthetic */ Boolean mo15499i(Bundle bundle) {
        String strValueOf = String.valueOf(m16409a());
        if (!bundle.containsKey(strValueOf.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strValueOf) : new String("com.google.android.gms.ads.flag."))) {
            return m16411n();
        }
        String strValueOf2 = String.valueOf(m16409a());
        return Boolean.valueOf(bundle.getBoolean(strValueOf2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strValueOf2) : new String("com.google.android.gms.ads.flag.")));
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    /* renamed from: j */
    public final /* synthetic */ Boolean mo15500j(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(m16409a(), m16411n().booleanValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    /* renamed from: k */
    public final /* synthetic */ void mo15501k(SharedPreferences.Editor editor, Boolean bool) {
        editor.putBoolean(m16409a(), bool.booleanValue());
    }
}
