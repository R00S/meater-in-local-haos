package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzk;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzaso implements zzasb {

    /* renamed from: a */
    private zzalj<JSONObject, JSONObject> f22497a;

    /* renamed from: b */
    private zzalj<JSONObject, JSONObject> f22498b;

    public zzaso(Context context) {
        zzalr zzalrVarM16655a = zzk.zzlt().m16655a(context, zzbai.m17359y());
        zzaln<JSONObject> zzalnVar = zzalo.f22107b;
        this.f22497a = zzalrVarM16655a.m16658a("google.afma.request.getAdDictionary", zzalnVar, zzalnVar);
        this.f22498b = zzk.zzlt().m16655a(context, zzbai.m17359y()).m16658a("google.afma.sdkConstants.getSdkConstants", zzalnVar, zzalnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzasb
    /* renamed from: a */
    public final zzalj<JSONObject, JSONObject> mo16901a() {
        return this.f22498b;
    }
}
