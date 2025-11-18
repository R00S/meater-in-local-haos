package com.google.firebase.crashlytics.internal.p190t;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.C8179h;
import com.google.firebase.crashlytics.internal.p183n.C8233y;
import com.google.firebase.crashlytics.internal.p187q.C8290a;
import com.google.firebase.crashlytics.internal.p187q.C8291b;
import com.google.firebase.crashlytics.internal.p187q.C8292c;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: DefaultSettingsSpiCall.java */
/* renamed from: com.google.firebase.crashlytics.h.t.c */
/* loaded from: classes2.dex */
class C8306c implements InterfaceC8314k {

    /* renamed from: a */
    private final String f31591a;

    /* renamed from: b */
    private final C8291b f31592b;

    /* renamed from: c */
    private final C8179h f31593c;

    public C8306c(String str, C8291b c8291b) {
        this(str, c8291b, C8179h.m25176f());
    }

    /* renamed from: b */
    private C8290a m26037b(C8290a c8290a, C8313j c8313j) {
        m26038c(c8290a, "X-CRASHLYTICS-GOOGLE-APP-ID", c8313j.f31622a);
        m26038c(c8290a, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        m26038c(c8290a, "X-CRASHLYTICS-API-CLIENT-VERSION", C8233y.m25442i());
        m26038c(c8290a, "Accept", "application/json");
        m26038c(c8290a, "X-CRASHLYTICS-DEVICE-MODEL", c8313j.f31623b);
        m26038c(c8290a, "X-CRASHLYTICS-OS-BUILD-VERSION", c8313j.f31624c);
        m26038c(c8290a, "X-CRASHLYTICS-OS-DISPLAY-VERSION", c8313j.f31625d);
        m26038c(c8290a, "X-CRASHLYTICS-INSTALLATION-ID", c8313j.f31626e.mo25261a().mo25270c());
        return c8290a;
    }

    /* renamed from: c */
    private void m26038c(C8290a c8290a, String str, String str2) {
        if (str2 != null) {
            c8290a.m25952d(str, str2);
        }
    }

    /* renamed from: e */
    private JSONObject m26039e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e2) {
            this.f31593c.m25186l("Failed to parse settings JSON from " + this.f31591a, e2);
            this.f31593c.m25185k("Settings response " + str);
            return null;
        }
    }

    /* renamed from: f */
    private Map<String, String> m26040f(C8313j c8313j) {
        HashMap map = new HashMap();
        map.put("build_version", c8313j.f31629h);
        map.put("display_version", c8313j.f31628g);
        map.put("source", Integer.toString(c8313j.f31630i));
        String str = c8313j.f31627f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    @Override // com.google.firebase.crashlytics.internal.p190t.InterfaceC8314k
    /* renamed from: a */
    public JSONObject mo26041a(C8313j c8313j, boolean z) {
        if (!z) {
            throw new RuntimeException("An invalid data collection token was used.");
        }
        try {
            Map<String, String> mapM26040f = m26040f(c8313j);
            C8290a c8290aM26037b = m26037b(m26042d(mapM26040f), c8313j);
            this.f31593c.m25177b("Requesting settings from " + this.f31591a);
            this.f31593c.m25183i("Settings query params were: " + mapM26040f);
            return m26043g(c8290aM26037b.m25951c());
        } catch (IOException e2) {
            this.f31593c.m25180e("Settings request failed.", e2);
            return null;
        }
    }

    /* renamed from: d */
    protected C8290a m26042d(Map<String, String> map) {
        return this.f31592b.m25953a(this.f31591a, map).m25952d("User-Agent", "Crashlytics Android SDK/" + C8233y.m25442i()).m25952d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    /* renamed from: g */
    JSONObject m26043g(C8292c c8292c) {
        int iM25955b = c8292c.m25955b();
        this.f31593c.m25183i("Settings response code was: " + iM25955b);
        if (m26044h(iM25955b)) {
            return m26039e(c8292c.m25954a());
        }
        this.f31593c.m25179d("Settings request failed; (status: " + iM25955b + ") from " + this.f31591a);
        return null;
    }

    /* renamed from: h */
    boolean m26044h(int i2) {
        return i2 == 200 || i2 == 201 || i2 == 202 || i2 == 203;
    }

    C8306c(String str, C8291b c8291b, C8179h c8179h) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f31593c = c8179h;
        this.f31592b = c8291b;
        this.f31591a = str;
    }
}
