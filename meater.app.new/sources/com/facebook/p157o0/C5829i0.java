package com.facebook.p157o0;

import android.content.Context;
import android.os.Bundle;
import com.facebook.GraphRequest;
import com.facebook.internal.C5696p0;
import com.facebook.internal.C5697q;
import com.facebook.p157o0.p162n0.C5876a;
import com.facebook.p157o0.p165q0.C5903h;
import java.util.ArrayList;
import java.util.List;
import kotlin.C10775u;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SessionEventsState.kt */
/* renamed from: com.facebook.o0.i0 */
/* loaded from: classes.dex */
public final class C5829i0 {

    /* renamed from: a */
    public static final a f14958a = new a(null);

    /* renamed from: b */
    private static final String f14959b = C5829i0.class.getSimpleName();

    /* renamed from: c */
    private static final int f14960c = 1000;

    /* renamed from: d */
    private final C5697q f14961d;

    /* renamed from: e */
    private final String f14962e;

    /* renamed from: f */
    private List<C5941v> f14963f;

    /* renamed from: g */
    private final List<C5941v> f14964g;

    /* renamed from: h */
    private int f14965h;

    /* compiled from: SessionEventsState.kt */
    /* renamed from: com.facebook.o0.i0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    public C5829i0(C5697q c5697q, String str) {
        C9801m.m32346f(c5697q, "attributionIdentifiers");
        C9801m.m32346f(str, "anonymousAppDeviceGUID");
        this.f14961d = c5697q;
        this.f14962e = str;
        this.f14963f = new ArrayList();
        this.f14964g = new ArrayList();
    }

    /* renamed from: f */
    private final void m12256f(GraphRequest graphRequest, Context context, int i2, JSONArray jSONArray, boolean z) throws JSONException {
        JSONObject jSONObject;
        try {
            C5903h c5903h = C5903h.f15371a;
            jSONObject = C5903h.m12631a(C5903h.a.CUSTOM_APP_EVENTS, this.f14961d, this.f14962e, z, context);
            if (this.f14965h > 0) {
                jSONObject.put("num_skipped_events", i2);
            }
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        graphRequest.m11175F(jSONObject);
        Bundle bundleM11186t = graphRequest.m11186t();
        String string = jSONArray.toString();
        C9801m.m32345e(string, "events.toString()");
        bundleM11186t.putString("custom_events", string);
        graphRequest.m11178I(string);
        graphRequest.m11177H(bundleM11186t);
    }

    /* renamed from: a */
    public final synchronized void m12257a(C5941v c5941v) {
        C9801m.m32346f(c5941v, "event");
        if (this.f14963f.size() + this.f14964g.size() >= f14960c) {
            this.f14965h++;
        } else {
            this.f14963f.add(c5941v);
        }
    }

    /* renamed from: b */
    public final synchronized void m12258b(boolean z) {
        if (z) {
            this.f14963f.addAll(this.f14964g);
            this.f14964g.clear();
            this.f14965h = 0;
        } else {
            this.f14964g.clear();
            this.f14965h = 0;
        }
    }

    /* renamed from: c */
    public final synchronized int m12259c() {
        return this.f14963f.size();
    }

    /* renamed from: d */
    public final synchronized List<C5941v> m12260d() {
        List<C5941v> list;
        list = this.f14963f;
        this.f14963f = new ArrayList();
        return list;
    }

    /* renamed from: e */
    public final int m12261e(GraphRequest graphRequest, Context context, boolean z, boolean z2) throws JSONException {
        C9801m.m32346f(graphRequest, "request");
        C9801m.m32346f(context, "applicationContext");
        synchronized (this) {
            int i2 = this.f14965h;
            C5876a c5876a = C5876a.f15262a;
            C5876a.m12490d(this.f14963f);
            this.f14964g.addAll(this.f14963f);
            this.f14963f.clear();
            JSONArray jSONArray = new JSONArray();
            for (C5941v c5941v : this.f14964g) {
                if (!c5941v.m12839g()) {
                    C5696p0 c5696p0 = C5696p0.f14478a;
                    C5696p0.m11575j0(f14959b, C9801m.m32354n("Event with invalid checksum: ", c5941v));
                } else if (z || !c5941v.m12840h()) {
                    jSONArray.put(c5941v.m12837e());
                }
            }
            if (jSONArray.length() == 0) {
                return 0;
            }
            C10775u c10775u = C10775u.f41439a;
            m12256f(graphRequest, context, i2, jSONArray, z2);
            return jSONArray.length();
        }
    }
}
