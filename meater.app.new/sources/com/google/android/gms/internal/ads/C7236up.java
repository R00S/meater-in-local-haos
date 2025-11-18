package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.up */
/* loaded from: classes2.dex */
final /* synthetic */ class C7236up implements zzcuz {

    /* renamed from: a */
    static final zzcuz f20647a = new C7236up();

    private C7236up() {
    }

    @Override // com.google.android.gms.internal.ads.zzcuz
    /* renamed from: a */
    public final void mo15076a(Object obj) throws JSONException {
        try {
            ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", 12451009);
        } catch (JSONException unused) {
        }
    }
}
