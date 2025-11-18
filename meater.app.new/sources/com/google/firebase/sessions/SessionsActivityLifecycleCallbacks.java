package com.google.firebase.sessions;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: SessionsActivityLifecycleCallbacks.kt */
@Metadata(m32266d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0015H\u0016J\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R$\u0010\u0003\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, m32267d2 = {"Lcom/google/firebase/sessions/SessionsActivityLifecycleCallbacks;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "()V", "hasPendingForeground", HttpUrl.FRAGMENT_ENCODE_SET, "getHasPendingForeground$com_google_firebase_firebase_sessions$annotations", "getHasPendingForeground$com_google_firebase_firebase_sessions", "()Z", "setHasPendingForeground$com_google_firebase_firebase_sessions", "(Z)V", "lifecycleClient", "Lcom/google/firebase/sessions/SessionLifecycleClient;", "getLifecycleClient", "()Lcom/google/firebase/sessions/SessionLifecycleClient;", "setLifecycleClient", "(Lcom/google/firebase/sessions/SessionLifecycleClient;)V", "onActivityCreated", HttpUrl.FRAGMENT_ENCODE_SET, "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: com.google.firebase.sessions.i0, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class SessionsActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {

    /* renamed from: f */
    public static final SessionsActivityLifecycleCallbacks f32194f = new SessionsActivityLifecycleCallbacks();

    /* renamed from: g */
    private static boolean f32195g;

    /* renamed from: h */
    private static SessionLifecycleClient f32196h;

    private SessionsActivityLifecycleCallbacks() {
    }

    /* renamed from: a */
    public final void m26774a(SessionLifecycleClient sessionLifecycleClient) {
        f32196h = sessionLifecycleClient;
        if (sessionLifecycleClient == null || !f32195g) {
            return;
        }
        f32195g = false;
        sessionLifecycleClient.m26764k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        C9801m.m32346f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        C9801m.m32346f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        C9801m.m32346f(activity, "activity");
        SessionLifecycleClient sessionLifecycleClient = f32196h;
        if (sessionLifecycleClient != null) {
            sessionLifecycleClient.m26762h();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        C10775u c10775u;
        C9801m.m32346f(activity, "activity");
        SessionLifecycleClient sessionLifecycleClient = f32196h;
        if (sessionLifecycleClient != null) {
            sessionLifecycleClient.m26764k();
            c10775u = C10775u.f41439a;
        } else {
            c10775u = null;
        }
        if (c10775u == null) {
            f32195g = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        C9801m.m32346f(activity, "activity");
        C9801m.m32346f(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        C9801m.m32346f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        C9801m.m32346f(activity, "activity");
    }
}
