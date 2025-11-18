package com.google.firebase.sessions;

import com.google.firebase.C8411l;
import com.google.firebase.Firebase;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9795j;
import kotlin.jvm.internal.C9801m;
import kotlin.text.C10546u;
import okhttp3.HttpUrl;

/* compiled from: SessionGenerator.kt */
@Metadata(m32266d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u0015\u001a\u00020\tH\u0007J\b\u0010\u0016\u001a\u00020\u000eH\u0002R\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m32267d2 = {"Lcom/google/firebase/sessions/SessionGenerator;", HttpUrl.FRAGMENT_ENCODE_SET, "timeProvider", "Lcom/google/firebase/sessions/TimeProvider;", "uuidGenerator", "Lkotlin/Function0;", "Ljava/util/UUID;", "(Lcom/google/firebase/sessions/TimeProvider;Lkotlin/jvm/functions/Function0;)V", "<set-?>", "Lcom/google/firebase/sessions/SessionDetails;", "currentSession", "getCurrentSession", "()Lcom/google/firebase/sessions/SessionDetails;", "firstSessionId", HttpUrl.FRAGMENT_ENCODE_SET, "hasGenerateSession", HttpUrl.FRAGMENT_ENCODE_SET, "getHasGenerateSession", "()Z", "sessionIndex", HttpUrl.FRAGMENT_ENCODE_SET, "generateNewSession", "generateSessionId", "Companion", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: com.google.firebase.sessions.d0, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class SessionGenerator {

    /* renamed from: a */
    public static final b f32154a = new b(null);

    /* renamed from: b */
    private final TimeProvider f32155b;

    /* renamed from: c */
    private final Function0<UUID> f32156c;

    /* renamed from: d */
    private final String f32157d;

    /* renamed from: e */
    private int f32158e;

    /* renamed from: f */
    private SessionDetails f32159f;

    /* compiled from: SessionGenerator.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.google.firebase.sessions.d0$a */
    /* synthetic */ class a extends C9795j implements Function0<UUID> {

        /* renamed from: h */
        public static final a f32160h = new a();

        a() {
            super(0, UUID.class, "randomUUID", "randomUUID()Ljava/util/UUID;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* compiled from: SessionGenerator.kt */
    @Metadata(m32266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m32267d2 = {"Lcom/google/firebase/sessions/SessionGenerator$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "instance", "Lcom/google/firebase/sessions/SessionGenerator;", "getInstance", "()Lcom/google/firebase/sessions/SessionGenerator;", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.google.firebase.sessions.d0$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        public final SessionGenerator m26742a() {
            Object objM26403h = C8411l.m26421a(Firebase.f31704a).m26403h(SessionGenerator.class);
            C9801m.m32345e(objM26403h, "Firebase.app[SessionGenerator::class.java]");
            return (SessionGenerator) objM26403h;
        }
    }

    public SessionGenerator(TimeProvider timeProvider, Function0<UUID> function0) {
        C9801m.m32346f(timeProvider, "timeProvider");
        C9801m.m32346f(function0, "uuidGenerator");
        this.f32155b = timeProvider;
        this.f32156c = function0;
        this.f32157d = m26738b();
        this.f32158e = -1;
    }

    /* renamed from: b */
    private final String m26738b() {
        String string = this.f32156c.invoke().toString();
        C9801m.m32345e(string, "uuidGenerator().toString()");
        String lowerCase = C10546u.m37507A(string, "-", HttpUrl.FRAGMENT_ENCODE_SET, false, 4, null).toLowerCase(Locale.ROOT);
        C9801m.m32345e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    /* renamed from: a */
    public final SessionDetails m26739a() {
        int i2 = this.f32158e + 1;
        this.f32158e = i2;
        this.f32159f = new SessionDetails(i2 == 0 ? this.f32157d : m26738b(), this.f32157d, this.f32158e, this.f32155b.mo26781a());
        return m26740c();
    }

    /* renamed from: c */
    public final SessionDetails m26740c() {
        SessionDetails sessionDetails = this.f32159f;
        if (sessionDetails != null) {
            return sessionDetails;
        }
        C9801m.m32363w("currentSession");
        return null;
    }

    public /* synthetic */ SessionGenerator(TimeProvider timeProvider, Function0 function0, int i2, C9789g c9789g) {
        this(timeProvider, (i2 & 2) != 0 ? a.f32160h : function0);
    }
}
