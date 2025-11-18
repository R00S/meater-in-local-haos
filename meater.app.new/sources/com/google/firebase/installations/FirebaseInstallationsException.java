package com.google.firebase.installations;

import com.google.firebase.FirebaseException;

/* loaded from: classes2.dex */
public class FirebaseInstallationsException extends FirebaseException {

    /* renamed from: f */
    private final EnumC8376a f31773f;

    /* renamed from: com.google.firebase.installations.FirebaseInstallationsException$a */
    public enum EnumC8376a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public FirebaseInstallationsException(EnumC8376a enumC8376a) {
        this.f31773f = enumC8376a;
    }

    public FirebaseInstallationsException(String str, EnumC8376a enumC8376a) {
        super(str);
        this.f31773f = enumC8376a;
    }
}
