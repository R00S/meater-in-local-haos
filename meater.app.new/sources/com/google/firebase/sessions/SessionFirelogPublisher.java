package com.google.firebase.sessions;

import com.google.firebase.C8411l;
import com.google.firebase.Firebase;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: SessionFirelogPublisher.kt */
@Metadata(m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bà\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, m32267d2 = {"Lcom/google/firebase/sessions/SessionFirelogPublisher;", HttpUrl.FRAGMENT_ENCODE_SET, "logSession", HttpUrl.FRAGMENT_ENCODE_SET, "sessionDetails", "Lcom/google/firebase/sessions/SessionDetails;", "Companion", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: com.google.firebase.sessions.b0, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public interface SessionFirelogPublisher {

    /* renamed from: a */
    public static final a f32127a = a.f32128a;

    /* compiled from: SessionFirelogPublisher.kt */
    @Metadata(m32266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m32267d2 = {"Lcom/google/firebase/sessions/SessionFirelogPublisher$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "instance", "Lcom/google/firebase/sessions/SessionFirelogPublisher;", "getInstance", "()Lcom/google/firebase/sessions/SessionFirelogPublisher;", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.google.firebase.sessions.b0$a */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f32128a = new a();

        private a() {
        }

        /* renamed from: a */
        public final SessionFirelogPublisher m26728a() {
            Object objM26403h = C8411l.m26421a(Firebase.f31704a).m26403h(SessionFirelogPublisher.class);
            C9801m.m32345e(objM26403h, "Firebase.app[SessionFirelogPublisher::class.java]");
            return (SessionFirelogPublisher) objM26403h;
        }
    }

    /* renamed from: a */
    void mo26727a(SessionDetails sessionDetails);
}
