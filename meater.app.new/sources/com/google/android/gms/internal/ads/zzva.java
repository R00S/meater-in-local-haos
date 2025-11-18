package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@zzard
/* loaded from: classes2.dex */
public abstract class zzva {

    /* renamed from: a */
    private static MessageDigest f27202a;

    /* renamed from: b */
    protected Object f27203b = new Object();

    /* renamed from: a */
    abstract byte[] mo20649a(String str);

    /* renamed from: b */
    protected final MessageDigest m20650b() {
        synchronized (this.f27203b) {
            MessageDigest messageDigest = f27202a;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i2 = 0; i2 < 2; i2++) {
                try {
                    f27202a = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return f27202a;
        }
    }
}
