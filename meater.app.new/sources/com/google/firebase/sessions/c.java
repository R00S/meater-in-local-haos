package com.google.firebase.sessions;

import I9.I;
import I9.SessionDetails;
import Ub.n;
import com.google.firebase.l;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3860q;
import kotlin.jvm.internal.C3862t;

/* compiled from: SessionGenerator.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f8\u0006@BX\u0086.¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/google/firebase/sessions/c;", "", "LI9/I;", "timeProvider", "Lkotlin/Function0;", "Ljava/util/UUID;", "uuidGenerator", "<init>", "(LI9/I;LBa/a;)V", "", "b", "()Ljava/lang/String;", "LI9/y;", "a", "()LI9/y;", "LI9/I;", "LBa/a;", "c", "Ljava/lang/String;", "firstSessionId", "", "d", "I", "sessionIndex", "<set-?>", "e", "LI9/y;", "currentSession", "f", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final I timeProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Ba.a<UUID> uuidGenerator;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String firstSessionId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int sessionIndex;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private SessionDetails currentSession;

    /* compiled from: SessionGenerator.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class a extends C3860q implements Ba.a<UUID> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f38804B = new a();

        a() {
            super(0, UUID.class, "randomUUID", "randomUUID()Ljava/util/UUID;", 0);
        }

        @Override // Ba.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* compiled from: SessionGenerator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/google/firebase/sessions/c$b;", "", "<init>", "()V", "Lcom/google/firebase/sessions/c;", "a", "()Lcom/google/firebase/sessions/c;", "instance", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.google.firebase.sessions.c$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final c a() {
            Object objJ = l.a(com.google.firebase.c.f38095a).j(c.class);
            C3862t.f(objJ, "Firebase.app[SessionGenerator::class.java]");
            return (c) objJ;
        }

        private Companion() {
        }
    }

    public c(I timeProvider, Ba.a<UUID> uuidGenerator) {
        C3862t.g(timeProvider, "timeProvider");
        C3862t.g(uuidGenerator, "uuidGenerator");
        this.timeProvider = timeProvider;
        this.uuidGenerator = uuidGenerator;
        this.firstSessionId = b();
        this.sessionIndex = -1;
    }

    private final String b() {
        String string = this.uuidGenerator.invoke().toString();
        C3862t.f(string, "uuidGenerator().toString()");
        String lowerCase = n.C(string, "-", "", false, 4, null).toLowerCase(Locale.ROOT);
        C3862t.f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final SessionDetails a() {
        int i10 = this.sessionIndex + 1;
        this.sessionIndex = i10;
        this.currentSession = new SessionDetails(i10 == 0 ? this.firstSessionId : b(), this.firstSessionId, this.sessionIndex, this.timeProvider.a());
        return c();
    }

    public final SessionDetails c() {
        SessionDetails sessionDetails = this.currentSession;
        if (sessionDetails != null) {
            return sessionDetails;
        }
        C3862t.u("currentSession");
        return null;
    }

    public /* synthetic */ c(I i10, Ba.a aVar, int i11, C3854k c3854k) {
        this(i10, (i11 & 2) != 0 ? a.f38804B : aVar);
    }
}
