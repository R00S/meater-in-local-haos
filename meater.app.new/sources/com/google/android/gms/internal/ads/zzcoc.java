package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcoc implements zzcjz<zzaov, zzcla> {

    /* renamed from: a */
    private final zzclc f24799a;

    public zzcoc(zzclc zzclcVar) {
        this.f24799a = zzclcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcjz
    /* renamed from: a */
    public final zzcjy<zzaov, zzcla> mo18850a(String str, JSONObject jSONObject) throws RemoteException {
        zzaov zzaovVarM18868d = this.f24799a.m18868d(str);
        if (zzaovVarM18868d == null) {
            return null;
        }
        return new zzcjy<>(zzaovVarM18868d, new zzcla(), str);
    }
}
