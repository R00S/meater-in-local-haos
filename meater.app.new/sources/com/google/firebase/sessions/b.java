package com.google.firebase.sessions;

import I9.SessionDetails;
import com.google.firebase.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: SessionFirelogPublisher.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/sessions/b;", "", "LI9/y;", "sessionDetails", "Loa/F;", "a", "(LI9/y;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f38797a;

    /* compiled from: SessionFirelogPublisher.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/google/firebase/sessions/b$a;", "", "<init>", "()V", "Lcom/google/firebase/sessions/b;", "a", "()Lcom/google/firebase/sessions/b;", "instance", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.google.firebase.sessions.b$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f38797a = new Companion();

        private Companion() {
        }

        public final b a() {
            Object objJ = l.a(com.google.firebase.c.f38095a).j(b.class);
            C3862t.f(objJ, "Firebase.app[SessionFirelogPublisher::class.java]");
            return (b) objJ;
        }
    }

    void a(SessionDetails sessionDetails);
}
