package com.flurry.sdk;

import android.text.TextUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* renamed from: com.flurry.sdk.q2 */
/* loaded from: classes2.dex */
public final class C6140q2 {

    /* renamed from: com.flurry.sdk.q2$a */
    public static class a implements FilenameFilter {

        /* renamed from: a */
        final /* synthetic */ Pattern f16289a;

        public a(Pattern pattern) {
            this.f16289a = pattern;
        }

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return this.f16289a.matcher(str).matches();
        }
    }

    /* renamed from: a */
    public static boolean m13269a() {
        File file = new File(m13274f());
        if (file.exists()) {
            return true;
        }
        return file.mkdirs();
    }

    /* renamed from: b */
    public static boolean m13270b(String str) {
        File file = new File(str);
        if (file.exists()) {
            return file.delete();
        }
        return true;
    }

    /* renamed from: c */
    public static String m13271c() {
        return m13274f() + File.separator + "fCompleted";
    }

    /* renamed from: d */
    public static boolean m13272d(String str) {
        return !TextUtils.isEmpty(str) && new File(str).exists();
    }

    /* renamed from: e */
    public static String m13273e() {
        return m13274f() + File.separator + "fInProgress";
    }

    /* renamed from: f */
    private static String m13274f() {
        return C6004b2.m12967a().toString() + File.separator + ".fstreaming";
    }
}
