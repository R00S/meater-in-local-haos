package com.google.android.gms.common;

import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public class UserRecoverableException extends Exception {

    /* renamed from: f */
    private final Intent f17232f;

    public UserRecoverableException(String str, Intent intent) {
        super(str);
        this.f17232f = intent;
    }
}
