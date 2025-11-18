package io.sentry.android.ndk;

import io.sentry.android.core.SentryAndroidOptions;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class SentryNdk {
    static {
        System.loadLibrary("log");
        System.loadLibrary("sentry");
        System.loadLibrary("sentry-android");
    }

    private SentryNdk() {
    }

    public static void close() {
        shutdown();
    }

    public static void init(SentryAndroidOptions sentryAndroidOptions) {
        C9362d.m30485a(sentryAndroidOptions.getSdkVersion());
        initSentryNative(sentryAndroidOptions);
        if (sentryAndroidOptions.isEnableScopeSync()) {
            sentryAndroidOptions.addScopeObserver(new C9361c(sentryAndroidOptions));
        }
        sentryAndroidOptions.setDebugImagesLoader(new C9359a(sentryAndroidOptions, new NativeModuleListLoader()));
    }

    private static native void initSentryNative(SentryAndroidOptions sentryAndroidOptions);

    private static native void shutdown();
}
