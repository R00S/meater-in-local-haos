package com.facebook.internal.p148t0.p152o;

import com.facebook.internal.p148t0.C5715k;
import java.io.File;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ErrorReportData.kt */
/* renamed from: com.facebook.internal.t0.o.d */
/* loaded from: classes2.dex */
public final class C5728d {

    /* renamed from: a */
    public static final a f14613a = new a(null);

    /* renamed from: b */
    private String f14614b;

    /* renamed from: c */
    private String f14615c;

    /* renamed from: d */
    private Long f14616d;

    /* compiled from: ErrorReportData.kt */
    /* renamed from: com.facebook.internal.t0.o.d$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    public C5728d(String str) {
        this.f14616d = Long.valueOf(System.currentTimeMillis() / 1000);
        this.f14615c = str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("error_log_");
        Long l = this.f14616d;
        if (l == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }
        stringBuffer.append(l.longValue());
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        C9801m.m32345e(string, "StringBuffer()\n            .append(InstrumentUtility.ERROR_REPORT_PREFIX)\n            .append(timestamp as Long)\n            .append(\".json\")\n            .toString()");
        this.f14614b = string;
    }

    /* renamed from: a */
    public final void m11782a() {
        C5715k c5715k = C5715k.f14590a;
        C5715k.m11742a(this.f14614b);
    }

    /* renamed from: b */
    public final int m11783b(C5728d c5728d) {
        C9801m.m32346f(c5728d, "data");
        Long l = this.f14616d;
        if (l == null) {
            return -1;
        }
        long jLongValue = l.longValue();
        Long l2 = c5728d.f14616d;
        if (l2 == null) {
            return 1;
        }
        return C9801m.m32349i(l2.longValue(), jLongValue);
    }

    /* renamed from: c */
    public final JSONObject m11784c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l = this.f14616d;
            if (l != null) {
                jSONObject.put("timestamp", l);
            }
            jSONObject.put("error_message", this.f14615c);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public final boolean m11785d() {
        return (this.f14615c == null || this.f14616d == null) ? false : true;
    }

    /* renamed from: e */
    public final void m11786e() {
        if (m11785d()) {
            C5715k c5715k = C5715k.f14590a;
            C5715k.m11761t(this.f14614b, toString());
        }
    }

    public String toString() throws JSONException {
        JSONObject jSONObjectM11784c = m11784c();
        if (jSONObjectM11784c == null) {
            return super.toString();
        }
        String string = jSONObjectM11784c.toString();
        C9801m.m32345e(string, "params.toString()");
        return string;
    }

    public C5728d(File file) {
        C9801m.m32346f(file, "file");
        String name = file.getName();
        C9801m.m32345e(name, "file.name");
        this.f14614b = name;
        C5715k c5715k = C5715k.f14590a;
        JSONObject jSONObjectM11759r = C5715k.m11759r(name, true);
        if (jSONObjectM11759r != null) {
            this.f14616d = Long.valueOf(jSONObjectM11759r.optLong("timestamp", 0L));
            this.f14615c = jSONObjectM11759r.optString("error_message", null);
        }
    }
}
