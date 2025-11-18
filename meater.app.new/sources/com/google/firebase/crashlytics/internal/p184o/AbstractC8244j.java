package com.google.firebase.crashlytics.internal.p184o;

import com.google.auto.value.AutoValue;
import com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0;
import com.google.firebase.encoders.InterfaceC8325a;
import com.google.firebase.encoders.json.C8336d;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RolloutAssignment.java */
@AutoValue
/* renamed from: com.google.firebase.crashlytics.h.o.j */
/* loaded from: classes2.dex */
public abstract class AbstractC8244j {

    /* renamed from: a */
    public static final InterfaceC8325a f31110a = new C8336d().m26101g(C8236b.f31064a).m26100f();

    /* renamed from: a */
    static AbstractC8244j m25529a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        return m25530b(jSONObject.getString("rolloutId"), jSONObject.getString("parameterKey"), jSONObject.getString("parameterValue"), jSONObject.getString("variantId"), jSONObject.getLong("templateVersion"));
    }

    /* renamed from: b */
    public static AbstractC8244j m25530b(String str, String str2, String str3, String str4, long j2) {
        return new C8237c(str, str2, m25531i(str3), str4, j2);
    }

    /* renamed from: i */
    private static String m25531i(String str) {
        return str.length() > 256 ? str.substring(0, 256) : str;
    }

    /* renamed from: c */
    public abstract String mo25458c();

    /* renamed from: d */
    public abstract String mo25459d();

    /* renamed from: e */
    public abstract String mo25460e();

    /* renamed from: f */
    public abstract long mo25461f();

    /* renamed from: g */
    public abstract String mo25462g();

    /* renamed from: h */
    public AbstractC8258f0.e.d.AbstractC11514e m25532h() {
        return AbstractC8258f0.e.d.AbstractC11514e.m25873a().mo25881d(AbstractC8258f0.e.d.AbstractC11514e.b.m25883a().mo25888c(mo25462g()).mo25887b(mo25460e()).mo25886a()).mo25879b(mo25458c()).mo25880c(mo25459d()).mo25882e(mo25461f()).mo25878a();
    }
}
