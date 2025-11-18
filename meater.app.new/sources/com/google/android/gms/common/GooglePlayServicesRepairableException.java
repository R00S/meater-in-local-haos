package com.google.android.gms.common;

import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public class GooglePlayServicesRepairableException extends UserRecoverableException {

    /* renamed from: g */
    private final int f17221g;

    public GooglePlayServicesRepairableException(int i2, String str, Intent intent) {
        super(str, intent);
        this.f17221g = i2;
    }
}
