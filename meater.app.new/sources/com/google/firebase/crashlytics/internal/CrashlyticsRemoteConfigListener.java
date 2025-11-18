package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.p184o.C8246l;
import com.google.firebase.p210v.p211a.p212b.InterfaceC8558a;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: CrashlyticsRemoteConfigListener.kt */
@Metadata(m32266d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m32267d2 = {"Lcom/google/firebase/crashlytics/internal/CrashlyticsRemoteConfigListener;", "Lcom/google/firebase/remoteconfig/interop/rollouts/RolloutsStateSubscriber;", "userMetadata", "Lcom/google/firebase/crashlytics/internal/metadata/UserMetadata;", "(Lcom/google/firebase/crashlytics/internal/metadata/UserMetadata;)V", "onRolloutsStateChanged", HttpUrl.FRAGMENT_ENCODE_SET, "rolloutsState", "Lcom/google/firebase/remoteconfig/interop/rollouts/RolloutsState;", "com.google.firebase-firebase-crashlytics"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: com.google.firebase.crashlytics.h.f, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class CrashlyticsRemoteConfigListener implements InterfaceC8558a {

    /* renamed from: a */
    private final C8246l f30854a;

    public CrashlyticsRemoteConfigListener(C8246l c8246l) {
        C9801m.m32346f(c8246l, "userMetadata");
        this.f30854a = c8246l;
    }
}
