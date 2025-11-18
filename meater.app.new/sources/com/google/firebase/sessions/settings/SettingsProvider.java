package com.google.firebase.sessions.settings;

import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.time.Duration;
import okhttp3.HttpUrl;

/* compiled from: SettingsProvider.kt */
@Metadata(m32266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\b\u0010\u000e\u001a\u00020\u0007H\u0016J\u0011\u0010\u000f\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, m32267d2 = {"Lcom/google/firebase/sessions/settings/SettingsProvider;", HttpUrl.FRAGMENT_ENCODE_SET, "samplingRate", HttpUrl.FRAGMENT_ENCODE_SET, "getSamplingRate", "()Ljava/lang/Double;", "sessionEnabled", HttpUrl.FRAGMENT_ENCODE_SET, "getSessionEnabled", "()Ljava/lang/Boolean;", "sessionRestartTimeout", "Lkotlin/time/Duration;", "getSessionRestartTimeout-FghU774", "()Lkotlin/time/Duration;", "isSettingsStale", "updateSettings", HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: com.google.firebase.sessions.m0.h, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public interface SettingsProvider {

    /* compiled from: SettingsProvider.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.google.firebase.sessions.m0.h$a */
    public static final class a {
        /* renamed from: a */
        public static Object m26844a(SettingsProvider settingsProvider, Continuation<? super C10775u> continuation) {
            return C10775u.f41439a;
        }
    }

    /* renamed from: a */
    Boolean mo26803a();

    /* renamed from: b */
    Duration mo26804b();

    /* renamed from: c */
    Double mo26805c();

    /* renamed from: d */
    Object mo26806d(Continuation<? super C10775u> continuation);
}
