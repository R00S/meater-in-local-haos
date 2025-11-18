package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public final class GmsLogger {

    /* renamed from: a */
    private final String f17764a;

    /* renamed from: b */
    private final String f17765b;

    @KeepForSdk
    public GmsLogger(String str) {
        this(str, null);
    }

    @KeepForSdk
    public GmsLogger(String str, String str2) {
        Preconditions.m14373l(str, "log tag cannot be null");
        Preconditions.m14364c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f17764a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f17765b = null;
        } else {
            this.f17765b = str2;
        }
    }
}
