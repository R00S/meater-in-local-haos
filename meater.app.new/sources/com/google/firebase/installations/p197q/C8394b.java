package com.google.firebase.installations.p197q;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.C8405j;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: IidStore.java */
/* renamed from: com.google.firebase.installations.q.b */
/* loaded from: classes2.dex */
public class C8394b {

    /* renamed from: a */
    private static final String[] f31833a = {"*", "FCM", "GCM", HttpUrl.FRAGMENT_ENCODE_SET};

    /* renamed from: b */
    private final SharedPreferences f31834b;

    /* renamed from: c */
    private final String f31835c;

    public C8394b(C8405j c8405j) {
        this.f31834b = c8405j.m26404i().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f31835c = m26316b(c8405j);
    }

    /* renamed from: a */
    private String m26315a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    /* renamed from: b */
    private static String m26316b(C8405j c8405j) {
        String strM26425d = c8405j.m26406l().m26425d();
        if (strM26425d != null) {
            return strM26425d;
        }
        String strM26424c = c8405j.m26406l().m26424c();
        if (!strM26424c.startsWith("1:") && !strM26424c.startsWith("2:")) {
            return strM26424c;
        }
        String[] strArrSplit = strM26424c.split(":");
        if (strArrSplit.length != 4) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: c */
    private static String m26317c(PublicKey publicKey) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* renamed from: d */
    private String m26318d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    private PublicKey m26319e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e2) {
            Log.w("ContentValues", "Invalid key stored " + e2);
            return null;
        }
    }

    /* renamed from: g */
    private String m26320g() {
        String string;
        synchronized (this.f31834b) {
            string = this.f31834b.getString("|S|id", null);
        }
        return string;
    }

    /* renamed from: h */
    private String m26321h() {
        synchronized (this.f31834b) {
            String string = this.f31834b.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            PublicKey publicKeyM26319e = m26319e(string);
            if (publicKeyM26319e == null) {
                return null;
            }
            return m26317c(publicKeyM26319e);
        }
    }

    /* renamed from: f */
    public String m26322f() {
        synchronized (this.f31834b) {
            String strM26320g = m26320g();
            if (strM26320g != null) {
                return strM26320g;
            }
            return m26321h();
        }
    }

    /* renamed from: i */
    public String m26323i() {
        synchronized (this.f31834b) {
            for (String str : f31833a) {
                String string = this.f31834b.getString(m26315a(this.f31835c, str), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith("{")) {
                        string = m26318d(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }
}
