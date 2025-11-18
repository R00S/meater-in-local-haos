package com.google.firebase.sessions;

import android.content.ServiceConnection;
import android.os.Messenger;
import com.google.firebase.C8411l;
import com.google.firebase.Firebase;
import kotlin.Metadata;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: SessionLifecycleServiceBinder.kt */
@Metadata(m32266d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bà\u0080\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, m32267d2 = {"Lcom/google/firebase/sessions/SessionLifecycleServiceBinder;", HttpUrl.FRAGMENT_ENCODE_SET, "bindToService", HttpUrl.FRAGMENT_ENCODE_SET, "callback", "Landroid/os/Messenger;", "serviceConnection", "Landroid/content/ServiceConnection;", "Companion", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: com.google.firebase.sessions.g0, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public interface SessionLifecycleServiceBinder {

    /* renamed from: a */
    public static final a f32183a = a.f32184a;

    /* compiled from: SessionLifecycleServiceBinder.kt */
    @Metadata(m32266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m32267d2 = {"Lcom/google/firebase/sessions/SessionLifecycleServiceBinder$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "instance", "Lcom/google/firebase/sessions/SessionLifecycleServiceBinder;", "getInstance", "()Lcom/google/firebase/sessions/SessionLifecycleServiceBinder;", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.google.firebase.sessions.g0$a */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f32184a = new a();

        private a() {
        }

        /* renamed from: a */
        public final SessionLifecycleServiceBinder m26767a() {
            Object objM26403h = C8411l.m26421a(Firebase.f31704a).m26403h(SessionLifecycleServiceBinder.class);
            C9801m.m32345e(objM26403h, "Firebase.app[SessionLife…erviceBinder::class.java]");
            return (SessionLifecycleServiceBinder) objM26403h;
        }
    }

    /* renamed from: a */
    void mo26766a(Messenger messenger, ServiceConnection serviceConnection);
}
