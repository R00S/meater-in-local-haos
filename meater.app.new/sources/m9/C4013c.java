package m9;

import com.google.firebase.f;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PersistedInstallation.java */
/* renamed from: m9.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4013c {

    /* renamed from: a, reason: collision with root package name */
    private File f45413a;

    /* renamed from: b, reason: collision with root package name */
    private final f f45414b;

    /* compiled from: PersistedInstallation.java */
    /* renamed from: m9.c$a */
    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public C4013c(f fVar) {
        this.f45414b = fVar;
    }

    private File a() {
        if (this.f45413a == null) {
            synchronized (this) {
                try {
                    if (this.f45413a == null) {
                        this.f45413a = new File(this.f45414b.k().getFilesDir(), "PersistedInstallation." + this.f45414b.o() + ".json");
                    }
                } finally {
                }
            }
        }
        return this.f45413a;
    }

    private JSONObject c() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(a());
            while (true) {
                try {
                    int i10 = fileInputStream.read(bArr, 0, 16384);
                    if (i10 < 0) {
                        JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                        fileInputStream.close();
                        return jSONObject;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        }
    }

    public AbstractC4014d b(AbstractC4014d abstractC4014d) throws JSONException, IOException {
        File fileCreateTempFile;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", abstractC4014d.d());
            jSONObject.put("Status", abstractC4014d.g().ordinal());
            jSONObject.put("AuthToken", abstractC4014d.b());
            jSONObject.put("RefreshToken", abstractC4014d.f());
            jSONObject.put("TokenCreationEpochInSecs", abstractC4014d.h());
            jSONObject.put("ExpiresInSecs", abstractC4014d.c());
            jSONObject.put("FisError", abstractC4014d.e());
            fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f45414b.k().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (IOException | JSONException unused) {
        }
        if (fileCreateTempFile.renameTo(a())) {
            return abstractC4014d;
        }
        throw new IOException("unable to rename the tmpfile to PersistedInstallation");
    }

    public AbstractC4014d d() throws IOException {
        JSONObject jSONObjectC = c();
        String strOptString = jSONObjectC.optString("Fid", null);
        int iOptInt = jSONObjectC.optInt("Status", a.ATTEMPT_MIGRATION.ordinal());
        String strOptString2 = jSONObjectC.optString("AuthToken", null);
        String strOptString3 = jSONObjectC.optString("RefreshToken", null);
        long jOptLong = jSONObjectC.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObjectC.optLong("ExpiresInSecs", 0L);
        return AbstractC4014d.a().d(strOptString).g(a.values()[iOptInt]).b(strOptString2).f(strOptString3).h(jOptLong).c(jOptLong2).e(jSONObjectC.optString("FisError", null)).a();
    }
}
