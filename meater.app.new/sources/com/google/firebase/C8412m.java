package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* compiled from: FirebaseOptions.java */
/* renamed from: com.google.firebase.m */
/* loaded from: classes2.dex */
public final class C8412m {

    /* renamed from: a */
    private final String f31898a;

    /* renamed from: b */
    private final String f31899b;

    /* renamed from: c */
    private final String f31900c;

    /* renamed from: d */
    private final String f31901d;

    /* renamed from: e */
    private final String f31902e;

    /* renamed from: f */
    private final String f31903f;

    /* renamed from: g */
    private final String f31904g;

    private C8412m(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.m14376o(!Strings.m14655a(str), "ApplicationId must be set.");
        this.f31899b = str;
        this.f31898a = str2;
        this.f31900c = str3;
        this.f31901d = str4;
        this.f31902e = str5;
        this.f31903f = str6;
        this.f31904g = str7;
    }

    /* renamed from: a */
    public static C8412m m26422a(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String strM14401a = stringResourceValueReader.m14401a("google_app_id");
        if (TextUtils.isEmpty(strM14401a)) {
            return null;
        }
        return new C8412m(strM14401a, stringResourceValueReader.m14401a("google_api_key"), stringResourceValueReader.m14401a("firebase_database_url"), stringResourceValueReader.m14401a("ga_trackingId"), stringResourceValueReader.m14401a("gcm_defaultSenderId"), stringResourceValueReader.m14401a("google_storage_bucket"), stringResourceValueReader.m14401a("project_id"));
    }

    /* renamed from: b */
    public String m26423b() {
        return this.f31898a;
    }

    /* renamed from: c */
    public String m26424c() {
        return this.f31899b;
    }

    /* renamed from: d */
    public String m26425d() {
        return this.f31902e;
    }

    /* renamed from: e */
    public String m26426e() {
        return this.f31904g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8412m)) {
            return false;
        }
        C8412m c8412m = (C8412m) obj;
        return Objects.m14355a(this.f31899b, c8412m.f31899b) && Objects.m14355a(this.f31898a, c8412m.f31898a) && Objects.m14355a(this.f31900c, c8412m.f31900c) && Objects.m14355a(this.f31901d, c8412m.f31901d) && Objects.m14355a(this.f31902e, c8412m.f31902e) && Objects.m14355a(this.f31903f, c8412m.f31903f) && Objects.m14355a(this.f31904g, c8412m.f31904g);
    }

    public int hashCode() {
        return Objects.m14356b(this.f31899b, this.f31898a, this.f31900c, this.f31901d, this.f31902e, this.f31903f, this.f31904g);
    }

    public String toString() {
        return Objects.m14357c(this).m14358a("applicationId", this.f31899b).m14358a("apiKey", this.f31898a).m14358a("databaseUrl", this.f31900c).m14358a("gcmSenderId", this.f31902e).m14358a("storageBucket", this.f31903f).m14358a("projectId", this.f31904g).toString();
    }
}
