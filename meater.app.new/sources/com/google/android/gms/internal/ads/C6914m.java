package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.m */
/* loaded from: classes2.dex */
final class C6914m extends zzacj<Integer> {
    C6914m(int i2, String str, Integer num) {
        super(i2, str, num, null);
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    /* renamed from: h */
    public final /* synthetic */ Integer mo15498h(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(m16409a(), m16411n().intValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    /* renamed from: i */
    public final /* synthetic */ Integer mo15499i(Bundle bundle) {
        String strValueOf = String.valueOf(m16409a());
        if (!bundle.containsKey(strValueOf.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strValueOf) : new String("com.google.android.gms.ads.flag."))) {
            return m16411n();
        }
        String strValueOf2 = String.valueOf(m16409a());
        return Integer.valueOf(bundle.getInt(strValueOf2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strValueOf2) : new String("com.google.android.gms.ads.flag.")));
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    /* renamed from: j */
    public final /* synthetic */ Integer mo15500j(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(m16409a(), m16411n().intValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    /* renamed from: k */
    public final /* synthetic */ void mo15501k(SharedPreferences.Editor editor, Integer num) {
        editor.putInt(m16409a(), num.intValue());
    }
}
