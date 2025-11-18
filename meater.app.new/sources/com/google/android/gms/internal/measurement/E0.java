package com.google.android.gms.internal.measurement;

import java.net.URL;
import java.net.URLConnection;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public abstract class E0 {

    /* renamed from: a, reason: collision with root package name */
    private static E0 f33710a = new C0();

    public static synchronized E0 a() {
        return f33710a;
    }

    public abstract URLConnection b(URL url, String str);
}
