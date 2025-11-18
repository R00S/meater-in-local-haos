package com.google.firebase.installations.p197q;

import com.google.firebase.C8405j;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import okhttp3.internal.http2.Http2;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PersistedInstallation.java */
/* renamed from: com.google.firebase.installations.q.c */
/* loaded from: classes2.dex */
public class C8395c {

    /* renamed from: a */
    private File f31836a;

    /* renamed from: b */
    private final C8405j f31837b;

    /* compiled from: PersistedInstallation.java */
    /* renamed from: com.google.firebase.installations.q.c$a */
    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public C8395c(C8405j c8405j) {
        this.f31837b = c8405j;
    }

    /* renamed from: a */
    private File m26324a() {
        if (this.f31836a == null) {
            synchronized (this) {
                if (this.f31836a == null) {
                    this.f31836a = new File(this.f31837b.m26404i().getFilesDir(), "PersistedInstallation." + this.f31837b.m26407m() + ".json");
                }
            }
        }
        return this.f31836a;
    }

    /* renamed from: c */
    private JSONObject m26325c() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
        try {
            FileInputStream fileInputStream = new FileInputStream(m26324a());
            while (true) {
                try {
                    int i2 = fileInputStream.read(bArr, 0, Http2.INITIAL_MAX_FRAME_SIZE);
                    if (i2 < 0) {
                        JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                        fileInputStream.close();
                        return jSONObject;
                    }
                    byteArrayOutputStream.write(bArr, 0, i2);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            }
        } catch (IOException | JSONException unused2) {
            return new JSONObject();
        }
    }

    /* renamed from: b */
    public AbstractC8396d m26326b(AbstractC8396d abstractC8396d) throws JSONException, IOException {
        File fileCreateTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", abstractC8396d.mo26301d());
            jSONObject.put("Status", abstractC8396d.mo26304g().ordinal());
            jSONObject.put("AuthToken", abstractC8396d.mo26299b());
            jSONObject.put("RefreshToken", abstractC8396d.mo26303f());
            jSONObject.put("TokenCreationEpochInSecs", abstractC8396d.mo26305h());
            jSONObject.put("ExpiresInSecs", abstractC8396d.mo26300c());
            jSONObject.put("FisError", abstractC8396d.mo26302e());
            fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f31837b.m26404i().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (fileCreateTempFile.renameTo(m26324a())) {
            return abstractC8396d;
        }
        throw new IOException("unable to rename the tmpfile to PersistedInstallation");
    }

    /* renamed from: d */
    public AbstractC8396d m26327d() throws IOException {
        JSONObject jSONObjectM26325c = m26325c();
        String strOptString = jSONObjectM26325c.optString("Fid", null);
        int iOptInt = jSONObjectM26325c.optInt("Status", a.ATTEMPT_MIGRATION.ordinal());
        String strOptString2 = jSONObjectM26325c.optString("AuthToken", null);
        String strOptString3 = jSONObjectM26325c.optString("RefreshToken", null);
        long jOptLong = jSONObjectM26325c.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObjectM26325c.optLong("ExpiresInSecs", 0L);
        return AbstractC8396d.m26328a().mo26310d(strOptString).mo26313g(a.values()[iOptInt]).mo26308b(strOptString2).mo26312f(strOptString3).mo26314h(jOptLong).mo26309c(jOptLong2).mo26311e(jSONObjectM26325c.optString("FisError", null)).mo26307a();
    }
}
