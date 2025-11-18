package com.google.firebase.crashlytics.internal.p190t;

import com.google.firebase.crashlytics.internal.C8179h;
import com.google.firebase.crashlytics.internal.p183n.C8228t;
import com.google.firebase.crashlytics.internal.p188r.C8298f;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* compiled from: CachedSettingsIo.java */
/* renamed from: com.google.firebase.crashlytics.h.t.a */
/* loaded from: classes2.dex */
public class C8304a {

    /* renamed from: a */
    private final File f31590a;

    public C8304a(C8298f c8298f) {
        this.f31590a = c8298f.m25998e("com.crashlytics.settings.json");
    }

    /* renamed from: a */
    private File m26032a() {
        return this.f31590a;
    }

    /* renamed from: b */
    public JSONObject m26033b() throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        C8179h.m25176f().m25177b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                File fileM26032a = m26032a();
                if (fileM26032a.exists()) {
                    fileInputStream = new FileInputStream(fileM26032a);
                    try {
                        jSONObject = new JSONObject(C8228t.m25329A(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e2) {
                        e = e2;
                        C8179h.m25176f().m25180e("Failed to fetch cached settings", e);
                        C8228t.m25335f(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } else {
                    C8179h.m25176f().m25183i("Settings file does not exist.");
                    jSONObject = null;
                }
                C8228t.m25335f(fileInputStream2, "Error while closing settings cache file.");
                return jSONObject;
            } catch (Exception e3) {
                e = e3;
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                C8228t.m25335f(null, "Error while closing settings cache file.");
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            C8228t.m25335f(null, "Error while closing settings cache file.");
            throw th;
        }
    }

    /* renamed from: c */
    public void m26034c(long j2, JSONObject jSONObject) throws Throwable {
        C8179h.m25176f().m25183i("Writing settings to cache file...");
        if (jSONObject == null) {
            return;
        }
        FileWriter fileWriter = null;
        try {
            try {
                jSONObject.put("expires_at", j2);
                FileWriter fileWriter2 = new FileWriter(m26032a());
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    C8228t.m25335f(fileWriter2, "Failed to close settings writer.");
                } catch (Exception e2) {
                    e = e2;
                    fileWriter = fileWriter2;
                    C8179h.m25176f().m25180e("Failed to cache settings", e);
                    C8228t.m25335f(fileWriter, "Failed to close settings writer.");
                } catch (Throwable th) {
                    th = th;
                    fileWriter = fileWriter2;
                    C8228t.m25335f(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
