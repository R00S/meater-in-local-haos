package com.google.android.gms.internal.ads;

import android.util.Base64;

/* loaded from: classes2.dex */
public final class zzcg {
    /* renamed from: a */
    public static String m18756a(byte[] bArr, boolean z) {
        return Base64.encodeToString(bArr, z ? 11 : 2);
    }

    /* renamed from: b */
    public static byte[] m18757b(String str, boolean z) throws IllegalArgumentException {
        byte[] bArrDecode = Base64.decode(str, z ? 11 : 2);
        if (bArrDecode.length != 0 || str.length() <= 0) {
            return bArrDecode;
        }
        throw new IllegalArgumentException(str.length() != 0 ? "Unable to decode ".concat(str) : new String("Unable to decode "));
    }
}
