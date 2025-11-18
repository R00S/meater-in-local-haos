package com.facebook.internal.p156v0;

import android.util.Base64;
import android.util.Log;
import cm.aptoide.p092pt.database.room.RoomInstalled;
import cm.aptoide.p092pt.database.room.RoomNotification;
import cm.aptoide.p092pt.dataprovider.BuildConfig;
import com.facebook.C5641a0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.C10775u;
import kotlin.jvm.internal.C9788f0;
import kotlin.jvm.internal.C9801m;
import kotlin.p429io.C10562g;
import kotlin.text.C10546u;
import kotlin.text.Charsets;
import okhttp3.HttpUrl;
import org.json.JSONObject;

/* compiled from: OidcSecurityUtil.kt */
/* renamed from: com.facebook.internal.v0.c */
/* loaded from: classes2.dex */
public final class C5736c {

    /* renamed from: a */
    public static final C5736c f14634a = new C5736c();

    /* renamed from: b */
    private static final String f14635b = "/.well-known/oauth/openid/keys/";

    private C5736c() {
    }

    /* renamed from: a */
    public static final PublicKey m11807a(String str) {
        C9801m.m32346f(str, RoomNotification.KEY);
        byte[] bArrDecode = Base64.decode(C10546u.m37507A(C10546u.m37507A(C10546u.m37507A(str, "\n", HttpUrl.FRAGMENT_ENCODE_SET, false, 4, null), "-----BEGIN PUBLIC KEY-----", HttpUrl.FRAGMENT_ENCODE_SET, false, 4, null), "-----END PUBLIC KEY-----", HttpUrl.FRAGMENT_ENCODE_SET, false, 4, null), 0);
        C9801m.m32345e(bArrDecode, "decode(pubKeyString, Base64.DEFAULT)");
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArrDecode));
        C9801m.m32345e(publicKeyGeneratePublic, "kf.generatePublic(x509publicKey)");
        return publicKeyGeneratePublic;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static final String m11808b(final String str) {
        C9801m.m32346f(str, "kid");
        C5641a0 c5641a0 = C5641a0.f14199a;
        final URL url = new URL(BuildConfig.APTOIDE_WEB_SERVICES_SCHEME, C9801m.m32354n("www.", C5641a0.m11293l()), f14635b);
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition conditionNewCondition = reentrantLock.newCondition();
        final C9788f0 c9788f0 = new C9788f0();
        C5641a0.m11292k().execute(new Runnable() { // from class: com.facebook.internal.v0.a
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                C5736c.m11809c(url, c9788f0, str, reentrantLock, conditionNewCondition);
            }
        });
        reentrantLock.lock();
        try {
            conditionNewCondition.await(5000L, TimeUnit.MILLISECONDS);
            reentrantLock.unlock();
            return (String) c9788f0.f37179f;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.String] */
    /* renamed from: c */
    public static final void m11809c(URL url, C9788f0 c9788f0, String str, ReentrantLock reentrantLock, Condition condition) throws IOException {
        C9801m.m32346f(url, "$openIdKeyUrl");
        C9801m.m32346f(c9788f0, "$result");
        C9801m.m32346f(str, "$kid");
        C9801m.m32346f(reentrantLock, "$lock");
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        if (uRLConnectionOpenConnection == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        try {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                C9801m.m32345e(inputStream, "connection.inputStream");
                Reader inputStreamReader = new InputStreamReader(inputStream, Charsets.f40651b);
                String strM37643c = C10562g.m37643c(inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192));
                httpURLConnection.getInputStream().close();
                c9788f0.f37179f = new JSONObject(strM37643c).optString(str);
                httpURLConnection.disconnect();
                reentrantLock.lock();
            } catch (Exception e2) {
                String name = f14634a.getClass().getName();
                String message = e2.getMessage();
                if (message == null) {
                    message = "Error getting public key";
                }
                Log.d(name, message);
                httpURLConnection.disconnect();
                reentrantLock.lock();
                try {
                    condition.signal();
                    C10775u c10775u = C10775u.f41439a;
                } finally {
                }
            }
            try {
                condition.signal();
                C10775u c10775u2 = C10775u.f41439a;
            } finally {
            }
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            reentrantLock.lock();
            try {
                condition.signal();
                C10775u c10775u3 = C10775u.f41439a;
                throw th;
            } finally {
            }
        }
    }

    /* renamed from: e */
    public static final boolean m11811e(PublicKey publicKey, String str, String str2) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        C9801m.m32346f(publicKey, "publicKey");
        C9801m.m32346f(str, "data");
        C9801m.m32346f(str2, RoomInstalled.SIGNATURE);
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initVerify(publicKey);
            byte[] bytes = str.getBytes(Charsets.f40651b);
            C9801m.m32345e(bytes, "(this as java.lang.String).getBytes(charset)");
            signature.update(bytes);
            byte[] bArrDecode = Base64.decode(str2, 8);
            C9801m.m32345e(bArrDecode, "decode(signature, Base64.URL_SAFE)");
            return signature.verify(bArrDecode);
        } catch (Exception unused) {
            return false;
        }
    }
}
