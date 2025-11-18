package io.sentry.android.ndk;

import io.sentry.C9680x4;
import io.sentry.android.core.InterfaceC9358z0;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.util.C9646q;

/* compiled from: DebugImagesLoader.java */
/* renamed from: io.sentry.android.ndk.a */
/* loaded from: classes2.dex */
public final class C9359a implements InterfaceC9358z0 {

    /* renamed from: a */
    private static final Object f36139a = new Object();

    /* renamed from: b */
    private final C9680x4 f36140b;

    /* renamed from: c */
    private final NativeModuleListLoader f36141c;

    public C9359a(SentryAndroidOptions sentryAndroidOptions, NativeModuleListLoader nativeModuleListLoader) {
        this.f36140b = (C9680x4) C9646q.m31802c(sentryAndroidOptions, "The SentryAndroidOptions is required.");
        this.f36141c = (NativeModuleListLoader) C9646q.m31802c(nativeModuleListLoader, "The NativeModuleListLoader is required.");
    }
}
