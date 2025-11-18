package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

@KeepForSdk
/* loaded from: classes2.dex */
public class ApiExceptionUtil {
    @KeepForSdk
    /* renamed from: a */
    public static ApiException m14283a(Status status) {
        return status.m13914Y() ? new ResolvableApiException(status) : new ApiException(status);
    }
}
