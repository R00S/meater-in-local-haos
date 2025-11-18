package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.Map;

@zzard
/* loaded from: classes2.dex */
public final class zzbja {

    /* renamed from: a */
    public final String f23100a;

    /* renamed from: b */
    public final Uri f23101b;

    /* renamed from: c */
    private final String f23102c;

    /* renamed from: d */
    public final Map<String, String> f23103d;

    @TargetApi(21)
    public zzbja(WebResourceRequest webResourceRequest) {
        this(webResourceRequest.getUrl().toString(), webResourceRequest.getUrl(), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders());
    }

    public zzbja(String str) {
        this(str, Uri.parse(str), null, null);
    }

    private zzbja(String str, Uri uri, String str2, Map<String, String> map) {
        this.f23100a = str;
        this.f23101b = uri;
        this.f23102c = str2 == null ? "GET" : str2;
        this.f23103d = map == null ? Collections.emptyMap() : map;
    }
}
