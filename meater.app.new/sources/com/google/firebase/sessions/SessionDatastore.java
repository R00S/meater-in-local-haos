package com.google.firebase.sessions;

import com.google.firebase.C8411l;
import com.google.firebase.Firebase;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: SessionDatastore.kt */
@Metadata(m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&¨\u0006\b"}, m32267d2 = {"Lcom/google/firebase/sessions/SessionDatastore;", HttpUrl.FRAGMENT_ENCODE_SET, "getCurrentSessionId", HttpUrl.FRAGMENT_ENCODE_SET, "updateSessionId", HttpUrl.FRAGMENT_ENCODE_SET, "sessionId", "Companion", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: com.google.firebase.sessions.w, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public interface SessionDatastore {

    /* renamed from: a */
    public static final a f32360a = a.f32361a;

    /* compiled from: SessionDatastore.kt */
    @Metadata(m32266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m32267d2 = {"Lcom/google/firebase/sessions/SessionDatastore$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "instance", "Lcom/google/firebase/sessions/SessionDatastore;", "getInstance", "()Lcom/google/firebase/sessions/SessionDatastore;", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.google.firebase.sessions.w$a */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f32361a = new a();

        private a() {
        }

        /* renamed from: a */
        public final SessionDatastore m26866a() {
            Object objM26403h = C8411l.m26421a(Firebase.f31704a).m26403h(SessionDatastore.class);
            C9801m.m32345e(objM26403h, "Firebase.app[SessionDatastore::class.java]");
            return (SessionDatastore) objM26403h;
        }
    }

    /* renamed from: a */
    String mo26864a();

    /* renamed from: b */
    void mo26865b(String str);
}
