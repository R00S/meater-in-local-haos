package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {

    /* renamed from: f */
    private final Feature f17303f;

    @KeepForSdk
    public UnsupportedApiCallException(Feature feature) {
        this.f17303f = feature;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f17303f));
    }
}
