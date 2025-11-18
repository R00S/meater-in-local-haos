package com.google.firebase.sessions;

import com.google.firebase.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: SessionDatastore.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/firebase/sessions/a;", "", "", "sessionId", "Loa/F;", "b", "(Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f38795a;

    /* compiled from: SessionDatastore.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/google/firebase/sessions/a$a;", "", "<init>", "()V", "Lcom/google/firebase/sessions/a;", "a", "()Lcom/google/firebase/sessions/a;", "instance", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.google.firebase.sessions.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f38795a = new Companion();

        private Companion() {
        }

        public final a a() {
            Object objJ = l.a(com.google.firebase.c.f38095a).j(a.class);
            C3862t.f(objJ, "Firebase.app[SessionDatastore::class.java]");
            return (a) objJ;
        }
    }

    String a();

    void b(String sessionId);
}
