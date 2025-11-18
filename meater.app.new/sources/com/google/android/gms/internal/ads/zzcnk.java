package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcnk implements zzcjz<zzams, zzclb> {

    /* renamed from: a */
    private final Map<String, zzcjy<zzams, zzclb>> f24779a = new HashMap();

    /* renamed from: b */
    private final zzclc f24780b;

    public zzcnk(zzclc zzclcVar) {
        this.f24780b = zzclcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjz
    /* renamed from: a */
    public final zzcjy<zzams, zzclb> mo18850a(String str, JSONObject jSONObject) throws Throwable {
        synchronized (this) {
            zzcjy<zzams, zzclb> zzcjyVar = this.f24779a.get(str);
            if (zzcjyVar == null) {
                zzams zzamsVarM18869e = this.f24780b.m18869e(str, jSONObject);
                if (zzamsVarM18869e == null) {
                    return null;
                }
                zzcjyVar = new zzcjy<>(zzamsVarM18869e, new zzclb(), str);
                this.f24779a.put(str, zzcjyVar);
            }
            return zzcjyVar;
        }
    }
}
