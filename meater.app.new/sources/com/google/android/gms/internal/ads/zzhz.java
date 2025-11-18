package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCrypto;

@TargetApi(16)
/* loaded from: classes2.dex */
public interface zzhz {
    /* renamed from: a */
    boolean m20055a(String str);

    /* renamed from: b */
    Exception m20056b();

    /* renamed from: c */
    void m20057c(zzhw zzhwVar);

    void close();

    /* renamed from: d */
    MediaCrypto m20058d();

    int getState();
}
