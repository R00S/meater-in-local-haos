package com.google.android.gms.internal.measurement;

import java.net.URL;
import java.net.URLConnection;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class C0 extends E0 {
    @Override // com.google.android.gms.internal.measurement.E0
    public final URLConnection b(URL url, String str) {
        return url.openConnection();
    }

    private C0() {
    }
}
