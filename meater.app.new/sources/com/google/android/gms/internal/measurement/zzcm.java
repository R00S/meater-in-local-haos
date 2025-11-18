package com.google.android.gms.internal.measurement;

import android.net.Uri;
import p024c.p041e.C0867a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzcm {

    /* renamed from: a */
    private static final C0867a<String, Uri> f28016a = new C0867a<>();

    /* renamed from: a */
    public static synchronized Uri m22118a(String str) {
        Uri uri;
        C0867a<String, Uri> c0867a = f28016a;
        uri = c0867a.get(str);
        if (uri == null) {
            String strValueOf = String.valueOf(Uri.encode(str));
            uri = Uri.parse(strValueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(strValueOf) : new String("content://com.google.android.gms.phenotype/"));
            c0867a.put(str, uri);
        }
        return uri;
    }
}
