package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.util.p;
import g7.C3443n;
import g7.C3445p;
import g7.C3447s;

/* compiled from: FirebaseOptions.java */
/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final String f38213a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38214b;

    /* renamed from: c, reason: collision with root package name */
    private final String f38215c;

    /* renamed from: d, reason: collision with root package name */
    private final String f38216d;

    /* renamed from: e, reason: collision with root package name */
    private final String f38217e;

    /* renamed from: f, reason: collision with root package name */
    private final String f38218f;

    /* renamed from: g, reason: collision with root package name */
    private final String f38219g;

    private m(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C3445p.o(!p.a(str), "ApplicationId must be set.");
        this.f38214b = str;
        this.f38213a = str2;
        this.f38215c = str3;
        this.f38216d = str4;
        this.f38217e = str5;
        this.f38218f = str6;
        this.f38219g = str7;
    }

    public static m a(Context context) {
        C3447s c3447s = new C3447s(context);
        String strA = c3447s.a("google_app_id");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new m(strA, c3447s.a("google_api_key"), c3447s.a("firebase_database_url"), c3447s.a("ga_trackingId"), c3447s.a("gcm_defaultSenderId"), c3447s.a("google_storage_bucket"), c3447s.a("project_id"));
    }

    public String b() {
        return this.f38213a;
    }

    public String c() {
        return this.f38214b;
    }

    public String d() {
        return this.f38217e;
    }

    public String e() {
        return this.f38219g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return C3443n.a(this.f38214b, mVar.f38214b) && C3443n.a(this.f38213a, mVar.f38213a) && C3443n.a(this.f38215c, mVar.f38215c) && C3443n.a(this.f38216d, mVar.f38216d) && C3443n.a(this.f38217e, mVar.f38217e) && C3443n.a(this.f38218f, mVar.f38218f) && C3443n.a(this.f38219g, mVar.f38219g);
    }

    public int hashCode() {
        return C3443n.b(this.f38214b, this.f38213a, this.f38215c, this.f38216d, this.f38217e, this.f38218f, this.f38219g);
    }

    public String toString() {
        return C3443n.c(this).a("applicationId", this.f38214b).a("apiKey", this.f38213a).a("databaseUrl", this.f38215c).a("gcmSenderId", this.f38217e).a("storageBucket", this.f38218f).a("projectId", this.f38219g).toString();
    }
}
