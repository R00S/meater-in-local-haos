package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzapx {

    /* renamed from: a */
    private final boolean f22254a;

    /* renamed from: b */
    private final boolean f22255b;

    /* renamed from: c */
    private final boolean f22256c;

    /* renamed from: d */
    private final boolean f22257d;

    /* renamed from: e */
    private final boolean f22258e;

    private zzapx(zzapz zzapzVar) {
        this.f22254a = zzapzVar.f22259a;
        this.f22255b = zzapzVar.f22260b;
        this.f22256c = zzapzVar.f22261c;
        this.f22257d = zzapzVar.f22262d;
        this.f22258e = zzapzVar.f22263e;
    }

    /* renamed from: a */
    public final JSONObject m16846a() {
        try {
            return new JSONObject().put("sms", this.f22254a).put("tel", this.f22255b).put("calendar", this.f22256c).put("storePicture", this.f22257d).put("inlineVideo", this.f22258e);
        } catch (JSONException e2) {
            zzbad.m17347c("Error occured while obtaining the MRAID capabilities.", e2);
            return null;
        }
    }
}
