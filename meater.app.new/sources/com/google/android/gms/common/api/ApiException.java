package com.google.android.gms.common.api;

import okhttp3.HttpUrl;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public class ApiException extends Exception {

    /* renamed from: f */
    @Deprecated
    protected final Status f17241f;

    public ApiException(Status status) {
        super(status.m13919z() + ": " + (status.m13913W() != null ? status.m13913W() : HttpUrl.FRAGMENT_ENCODE_SET));
        this.f17241f = status;
    }
}
