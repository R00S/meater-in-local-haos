package com.google.android.gms.internal.ads;

import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

@zzard
/* loaded from: classes2.dex */
public class zzaqb {

    /* renamed from: a */
    private final zzbgz f22277a;

    /* renamed from: b */
    private final String f22278b;

    public zzaqb(zzbgz zzbgzVar) {
        this(zzbgzVar, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* renamed from: b */
    public final void m16862b(int i2, int i3, int i4, int i5) throws JSONException {
        try {
            this.f22277a.mo14915j("onSizeChanged", new JSONObject().put("x", i2).put("y", i3).put("width", i4).put("height", i5));
        } catch (JSONException e2) {
            zzbad.m17347c("Error occured while dispatching size change.", e2);
        }
    }

    /* renamed from: c */
    public final void m16863c(int i2, int i3, int i4, int i5, float f2, int i6) throws JSONException {
        try {
            this.f22277a.mo14915j("onScreenInfoChanged", new JSONObject().put("width", i2).put("height", i3).put("maxSizeWidth", i4).put("maxSizeHeight", i5).put("density", f2).put("rotation", i6));
        } catch (JSONException e2) {
            zzbad.m17347c("Error occured while obtaining screen information.", e2);
        }
    }

    /* renamed from: d */
    public final void m16864d(int i2, int i3, int i4, int i5) throws JSONException {
        try {
            this.f22277a.mo14915j("onDefaultPositionReceived", new JSONObject().put("x", i2).put("y", i3).put("width", i4).put("height", i5));
        } catch (JSONException e2) {
            zzbad.m17347c("Error occured while dispatching default position.", e2);
        }
    }

    /* renamed from: e */
    public final void m16865e(String str) {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("message", str).put("action", this.f22278b);
            zzbgz zzbgzVar = this.f22277a;
            if (zzbgzVar != null) {
                zzbgzVar.mo14915j("onError", jSONObjectPut);
            }
        } catch (JSONException e2) {
            zzbad.m17347c("Error occurred while dispatching error event.", e2);
        }
    }

    /* renamed from: f */
    public final void m16866f(String str) throws JSONException {
        try {
            this.f22277a.mo14915j("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e2) {
            zzbad.m17347c("Error occured while dispatching ready Event.", e2);
        }
    }

    /* renamed from: g */
    public final void m16867g(String str) throws JSONException {
        try {
            this.f22277a.mo14915j("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e2) {
            zzbad.m17347c("Error occured while dispatching state change.", e2);
        }
    }

    public zzaqb(zzbgz zzbgzVar, String str) {
        this.f22277a = zzbgzVar;
        this.f22278b = str;
    }
}
