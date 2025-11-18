package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import s.C4391a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.t3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2586t3 {

    /* renamed from: a, reason: collision with root package name */
    private static final C4391a<String, Uri> f34320a = new C4391a<>();

    public static synchronized Uri a(String str) {
        Uri uri;
        C4391a<String, Uri> c4391a = f34320a;
        uri = c4391a.get(str);
        if (uri == null) {
            uri = Uri.parse("content://com.google.android.gms.phenotype/" + Uri.encode(str));
            c4391a.put(str, uri);
        }
        return uri;
    }

    public static String b(Context context, String str) {
        if (str.contains("#")) {
            throw new IllegalArgumentException("The passed in package cannot already have a subpackage: " + str);
        }
        return str + "#" + context.getPackageName();
    }

    public static boolean c(String str, String str2) {
        if (str.equals("eng") || str.equals("userdebug")) {
            return str2.contains("dev-keys") || str2.contains("test-keys");
        }
        return false;
    }
}
