package com.google.android.gms.common.api;

import c7.C2335d;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {

    /* renamed from: B, reason: collision with root package name */
    private final C2335d f33467B;

    public UnsupportedApiCallException(C2335d c2335d) {
        this.f33467B = c2335d;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f33467B));
    }
}
