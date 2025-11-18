package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzcpl extends zzaoz {

    /* renamed from: f */
    private final zzcpk f24860f;

    /* renamed from: g */
    private zzbbr<JSONObject> f24861g;

    /* renamed from: h */
    private final JSONObject f24862h;

    /* renamed from: i */
    private boolean f24863i;

    public zzcpl(zzcpk zzcpkVar, zzbbr<JSONObject> zzbbrVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        this.f24862h = jSONObject;
        this.f24863i = false;
        this.f24861g = zzbbrVar;
        this.f24860f = zzcpkVar;
        try {
            jSONObject.put("adapter_version", zzcpkVar.f24859d.mo16812a6().toString());
            jSONObject.put("sdk_version", zzcpkVar.f24859d.mo16815i5().toString());
            jSONObject.put("name", zzcpkVar.f24856a);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaoy
    /* renamed from: R2 */
    public final synchronized void mo16822R2(String str) throws RemoteException {
        if (this.f24863i) {
            return;
        }
        if (str == null) {
            onFailure("Adapter returned null signals");
            return;
        }
        try {
            this.f24862h.put("signals", str);
        } catch (JSONException unused) {
        }
        this.f24861g.m17385a(this.f24862h);
        this.f24863i = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaoy
    public final synchronized void onFailure(String str) throws RemoteException {
        if (this.f24863i) {
            return;
        }
        try {
            this.f24862h.put("signal_error", str);
        } catch (JSONException unused) {
        }
        this.f24861g.m17385a(this.f24862h);
        this.f24863i = true;
    }
}
