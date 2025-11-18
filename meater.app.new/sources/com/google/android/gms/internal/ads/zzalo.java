package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public final class zzalo {

    /* renamed from: a */
    private static final Charset f22106a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final zzaln<JSONObject> f22107b = new C6584d2();

    /* renamed from: c */
    public static final zzall<InputStream> f22108c = C6547c2.f18380a;

    /* renamed from: a */
    static final /* synthetic */ InputStream m16657a(JSONObject jSONObject) throws JSONException {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(f22106a));
    }
}
