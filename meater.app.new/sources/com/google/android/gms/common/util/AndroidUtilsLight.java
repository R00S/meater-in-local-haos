package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.wrappers.Wrappers;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public class AndroidUtilsLight {
    @KeepForSdk
    @Deprecated
    /* renamed from: a */
    public static byte[] m14591a(Context context, String str) throws PackageManager.NameNotFoundException {
        MessageDigest messageDigestM14592b;
        PackageInfo packageInfoM14671e = Wrappers.m14674a(context).m14671e(str, 64);
        Signature[] signatureArr = packageInfoM14671e.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (messageDigestM14592b = m14592b("SHA1")) == null) {
            return null;
        }
        return messageDigestM14592b.digest(packageInfoM14671e.signatures[0].toByteArray());
    }

    /* renamed from: b */
    public static MessageDigest m14592b(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        for (int i2 = 0; i2 < 2; i2++) {
            try {
                messageDigest = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }
}
