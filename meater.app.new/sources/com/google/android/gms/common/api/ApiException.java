package com.google.android.gms.common.api;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes2.dex */
public class ApiException extends Exception {

    /* renamed from: B, reason: collision with root package name */
    @Deprecated
    protected final Status f33450B;

    public ApiException(Status status) {
        super(status.h0() + ": " + (status.r0() != null ? status.r0() : ""));
        this.f33450B = status;
    }

    public Status a() {
        return this.f33450B;
    }
}
