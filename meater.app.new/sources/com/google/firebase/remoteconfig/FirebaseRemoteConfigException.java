package com.google.firebase.remoteconfig;

import com.google.firebase.FirebaseException;

/* loaded from: classes2.dex */
public class FirebaseRemoteConfigException extends FirebaseException {

    /* renamed from: B, reason: collision with root package name */
    private final a f38599B;

    public enum a {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);


        /* renamed from: B, reason: collision with root package name */
        private final int f38606B;

        a(int i10) {
            this.f38606B = i10;
        }
    }

    public FirebaseRemoteConfigException(String str) {
        super(str);
        this.f38599B = a.UNKNOWN;
    }

    public FirebaseRemoteConfigException(String str, Throwable th) {
        super(str, th);
        this.f38599B = a.UNKNOWN;
    }

    public FirebaseRemoteConfigException(String str, a aVar) {
        super(str);
        this.f38599B = aVar;
    }

    public FirebaseRemoteConfigException(String str, Throwable th, a aVar) {
        super(str, th);
        this.f38599B = aVar;
    }
}
