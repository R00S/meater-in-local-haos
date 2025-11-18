package com.google.firebase.sessions;

import android.util.Base64;
import kotlin.Metadata;
import kotlin.text.C10546u;
import okhttp3.HttpUrl;

/* compiled from: SessionDataStoreConfigs.kt */
@Metadata(m32266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, m32267d2 = {"Lcom/google/firebase/sessions/SessionDataStoreConfigs;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "PROCESS_NAME", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin.jvm.PlatformType", "SESSIONS_CONFIG_NAME", "getSESSIONS_CONFIG_NAME", "()Ljava/lang/String;", "SETTINGS_CONFIG_NAME", "getSETTINGS_CONFIG_NAME", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: com.google.firebase.sessions.v, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class SessionDataStoreConfigs {

    /* renamed from: a */
    public static final SessionDataStoreConfigs f32356a = new SessionDataStoreConfigs();

    /* renamed from: b */
    private static final String f32357b;

    /* renamed from: c */
    private static final String f32358c;

    /* renamed from: d */
    private static final String f32359d;

    static {
        String strEncodeToString = Base64.encodeToString(C10546u.m37512n(ProcessDetailsProvider.f32355a.m26861e()), 10);
        f32357b = strEncodeToString;
        f32358c = "firebase_session_" + strEncodeToString + "_data";
        f32359d = "firebase_session_" + strEncodeToString + "_settings";
    }

    private SessionDataStoreConfigs() {
    }

    /* renamed from: a */
    public final String m26862a() {
        return f32358c;
    }

    /* renamed from: b */
    public final String m26863b() {
        return f32359d;
    }
}
