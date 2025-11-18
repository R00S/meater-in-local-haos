package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.MurmurHash3;
import java.io.UnsupportedEncodingException;

@zzard
/* loaded from: classes2.dex */
public final class zzve {
    /* renamed from: a */
    public static int m20653a(String str) throws UnsupportedEncodingException {
        byte[] bytes;
        try {
            bytes = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        return MurmurHash3.m14636a(bytes, 0, bytes.length, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d6  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String[] m20654b(java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzve.m20654b(java.lang.String, boolean):java.lang.String[]");
    }
}
