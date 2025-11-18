package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.o */
/* loaded from: classes2.dex */
final class C6988o extends zzacj<Float> {
    C6988o(int i2, String str, Float f2) {
        super(i2, str, f2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    /* renamed from: h */
    public final /* synthetic */ Float mo15498h(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(m16409a(), m16411n().floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    /* renamed from: i */
    public final /* synthetic */ Float mo15499i(Bundle bundle) {
        String strValueOf = String.valueOf(m16409a());
        if (!bundle.containsKey(strValueOf.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strValueOf) : new String("com.google.android.gms.ads.flag."))) {
            return m16411n();
        }
        String strValueOf2 = String.valueOf(m16409a());
        return Float.valueOf(bundle.getFloat(strValueOf2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(strValueOf2) : new String("com.google.android.gms.ads.flag.")));
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    /* renamed from: j */
    public final /* synthetic */ Float mo15500j(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(m16409a(), m16411n().floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzacj
    /* renamed from: k */
    public final /* synthetic */ void mo15501k(SharedPreferences.Editor editor, Float f2) {
        editor.putFloat(m16409a(), f2.floatValue());
    }
}
