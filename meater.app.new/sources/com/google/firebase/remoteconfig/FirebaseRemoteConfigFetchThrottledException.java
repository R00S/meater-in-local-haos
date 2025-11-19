package com.google.firebase.remoteconfig;

/* loaded from: classes2.dex */
public class FirebaseRemoteConfigFetchThrottledException extends FirebaseRemoteConfigException {

    /* renamed from: C, reason: collision with root package name */
    private final long f38607C;

    public FirebaseRemoteConfigFetchThrottledException(long j10) {
        this("Fetch was throttled.", j10);
    }

    public FirebaseRemoteConfigFetchThrottledException(String str, long j10) {
        super(str);
        this.f38607C = j10;
    }
}
