package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;

/* loaded from: classes2.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {

    /* renamed from: C, reason: collision with root package name */
    private final int f38608C;

    public FirebaseRemoteConfigServerException(int i10, String str) {
        super(str);
        this.f38608C = i10;
    }

    public int a() {
        return this.f38608C;
    }

    public FirebaseRemoteConfigServerException(int i10, String str, Throwable th) {
        super(str, th);
        this.f38608C = i10;
    }

    public FirebaseRemoteConfigServerException(String str, FirebaseRemoteConfigException.a aVar) {
        super(str, aVar);
        this.f38608C = -1;
    }

    public FirebaseRemoteConfigServerException(int i10, String str, FirebaseRemoteConfigException.a aVar) {
        super(str, aVar);
        this.f38608C = i10;
    }
}
