package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
@KeepName
/* loaded from: classes2.dex */
public class GooglePlayServicesManifestException extends IllegalStateException {

    /* renamed from: B, reason: collision with root package name */
    private final int f33448B;

    public GooglePlayServicesManifestException(int i10, String str) {
        super(str);
        this.f33448B = i10;
    }
}
