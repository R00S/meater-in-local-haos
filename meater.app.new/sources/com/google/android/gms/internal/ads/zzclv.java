package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzclv implements zzcjz<zzams, zzcla> {

    /* renamed from: a */
    private final zzclc f24690a;

    public zzclv(zzclc zzclcVar) {
        this.f24690a = zzclcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjz
    /* renamed from: a */
    public final zzcjy<zzams, zzcla> mo18850a(String str, JSONObject jSONObject) throws Throwable {
        zzams zzamsVarM18869e = this.f24690a.m18869e(str, jSONObject);
        if (zzamsVarM18869e == null) {
            return null;
        }
        return new zzcjy<>(zzamsVarM18869e, new zzcla(), str);
    }
}
