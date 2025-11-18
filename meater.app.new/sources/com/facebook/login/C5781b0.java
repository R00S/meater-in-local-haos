package com.facebook.login;

import android.os.Bundle;
import android.util.Base64;
import com.facebook.C5641a0;
import com.facebook.EnumC5655e0;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10782c0;
import kotlin.collections.C10813s;
import kotlin.jvm.internal.C9801m;
import kotlin.random.Random;
import kotlin.ranges.C9848l;
import kotlin.ranges.CharRange;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import okhttp3.HttpUrl;

/* compiled from: PKCEUtil.kt */
/* renamed from: com.facebook.login.b0 */
/* loaded from: classes2.dex */
public final class C5781b0 {

    /* renamed from: a */
    public static final C5781b0 f14789a = new C5781b0();

    private C5781b0() {
    }

    /* renamed from: a */
    public static final GraphRequest m12042a(String str, String str2, String str3) {
        C9801m.m32346f(str, "authorizationCode");
        C9801m.m32346f(str2, "redirectUri");
        C9801m.m32346f(str3, "codeVerifier");
        Bundle bundle = new Bundle();
        bundle.putString("code", str);
        C5641a0 c5641a0 = C5641a0.f14199a;
        bundle.putString("client_id", C5641a0.m11285d());
        bundle.putString("redirect_uri", str2);
        bundle.putString("code_verifier", str3);
        GraphRequest graphRequestM11236x = GraphRequest.f14159a.m11236x(null, "oauth/access_token", null);
        graphRequestM11236x.m11176G(EnumC5655e0.GET);
        graphRequestM11236x.m11177H(bundle);
        return graphRequestM11236x;
    }

    /* renamed from: b */
    public static final String m12043b(String str, EnumC5796p enumC5796p) throws FacebookException, NoSuchAlgorithmException {
        C9801m.m32346f(str, "codeVerifier");
        C9801m.m32346f(enumC5796p, "codeChallengeMethod");
        if (!m12045d(str)) {
            throw new FacebookException("Invalid Code Verifier.");
        }
        if (enumC5796p == EnumC5796p.PLAIN) {
            return str;
        }
        try {
            byte[] bytes = str.getBytes(Charsets.f40655f);
            C9801m.m32345e(bytes, "(this as java.lang.String).getBytes(charset)");
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bytes, 0, bytes.length);
            String strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
            C9801m.m32345e(strEncodeToString, "{\n      // try to generate challenge with S256\n      val bytes: ByteArray = codeVerifier.toByteArray(Charsets.US_ASCII)\n      val messageDigest = MessageDigest.getInstance(\"SHA-256\")\n      messageDigest.update(bytes, 0, bytes.size)\n      val digest = messageDigest.digest()\n\n      Base64.encodeToString(digest, Base64.URL_SAFE or Base64.NO_PADDING or Base64.NO_WRAP)\n    }");
            return strEncodeToString;
        } catch (Exception e2) {
            throw new FacebookException(e2);
        }
    }

    /* renamed from: c */
    public static final String m12044c() {
        int iM32426i = C9848l.m32426i(new IntRange(43, 128), Random.f37195f);
        List listM38610p0 = C10782c0.m38610p0(C10782c0.m38610p0(C10782c0.m38610p0(C10782c0.m38610p0(C10782c0.m38609o0(C10782c0.m38607m0(new CharRange('a', 'z'), new CharRange('A', 'Z')), new CharRange('0', '9')), '-'), '.'), '_'), '~');
        ArrayList arrayList = new ArrayList(iM32426i);
        for (int i2 = 0; i2 < iM32426i; i2++) {
            arrayList.add(Character.valueOf(((Character) C10813s.m38863q0(listM38610p0, Random.f37195f)).charValue()));
        }
        return C10782c0.m38599e0(arrayList, HttpUrl.FRAGMENT_ENCODE_SET, null, null, 0, null, null, 62, null);
    }

    /* renamed from: d */
    public static final boolean m12045d(String str) {
        if ((str == null || str.length() == 0) || str.length() < 43 || str.length() > 128) {
            return false;
        }
        return new Regex("^[-._~A-Za-z0-9]+$").m37438b(str);
    }
}
