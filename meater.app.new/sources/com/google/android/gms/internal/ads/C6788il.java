package com.google.android.gms.internal.ads;

import cm.aptoide.p092pt.install.installer.RootCommandOnSubscribe;
import cm.aptoide.p092pt.networking.BodyInterceptorV3;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.il */
/* loaded from: classes2.dex */
final /* synthetic */ class C6788il implements zzbal {

    /* renamed from: a */
    static final zzbal f19388a = new C6788il();

    private C6788il() {
    }

    @Override // com.google.android.gms.internal.ads.zzbal
    public final zzbbh zzf(Object obj) throws zzali {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.optBoolean(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION)) {
            return zzbar.m17378o(jSONObject.getJSONObject(BodyInterceptorV3.RESPONSE_MODE_JSON).getJSONArray("ads"));
        }
        throw new zzali("process json failed");
    }
}
