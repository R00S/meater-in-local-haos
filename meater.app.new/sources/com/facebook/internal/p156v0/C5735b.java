package com.facebook.internal.p156v0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: CertificateUtil.kt */
/* renamed from: com.facebook.internal.v0.b */
/* loaded from: classes2.dex */
public final class C5735b {

    /* renamed from: a */
    public static final C5735b f14633a = new C5735b();

    private C5735b() {
    }

    /* renamed from: a */
    public static final String m11806a(Context context) throws NoSuchAlgorithmException {
        C9801m.m32346f(context, "ctx");
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            StringBuilder sb = new StringBuilder();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            C9801m.m32345e(signatureArr, "signatures");
            int length = signatureArr.length;
            int i2 = 0;
            while (i2 < length) {
                Signature signature = signatureArr[i2];
                i2++;
                messageDigest.update(signature.toByteArray());
                sb.append(Base64.encodeToString(messageDigest.digest(), 0));
                sb.append(":");
            }
            if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            String string = sb.toString();
            C9801m.m32345e(string, "sb.toString()");
            return string;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }
}
