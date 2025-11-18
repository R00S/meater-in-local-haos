package com.google.firebase.sessions;

import android.util.Log;
import com.google.firebase.C8405j;
import com.google.firebase.installations.InterfaceC8385i;
import com.google.firebase.sessions.settings.SessionsSettings;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.p442j.internal.ContinuationImpl;
import kotlin.coroutines.p442j.internal.DebugMetadata;
import kotlin.coroutines.p442j.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlinx.coroutines.C11008j;
import kotlinx.coroutines.C11033p0;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.HttpUrl;

/* compiled from: SessionFirelogPublisher.kt */
@Metadata(m32266d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0019\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0011\u0010\u001a\u001a\u00020\u0019H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, m32267d2 = {"Lcom/google/firebase/sessions/SessionFirelogPublisherImpl;", "Lcom/google/firebase/sessions/SessionFirelogPublisher;", "firebaseApp", "Lcom/google/firebase/FirebaseApp;", "firebaseInstallations", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "sessionSettings", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "eventGDTLogger", "Lcom/google/firebase/sessions/EventGDTLoggerInterface;", "backgroundDispatcher", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/installations/FirebaseInstallationsApi;Lcom/google/firebase/sessions/settings/SessionsSettings;Lcom/google/firebase/sessions/EventGDTLoggerInterface;Lkotlin/coroutines/CoroutineContext;)V", "attemptLoggingSessionEvent", HttpUrl.FRAGMENT_ENCODE_SET, "sessionEvent", "Lcom/google/firebase/sessions/SessionEvent;", "getFirebaseInstallationId", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin.jvm.PlatformType", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logSession", "sessionDetails", "Lcom/google/firebase/sessions/SessionDetails;", "shouldCollectEvents", HttpUrl.FRAGMENT_ENCODE_SET, "shouldLogSession", "Companion", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: com.google.firebase.sessions.c0, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class SessionFirelogPublisherImpl implements SessionFirelogPublisher {

    /* renamed from: b */
    public static final a f32130b = new a(null);

    /* renamed from: c */
    private static final double f32131c = Math.random();

    /* renamed from: d */
    private final C8405j f32132d;

    /* renamed from: e */
    private final InterfaceC8385i f32133e;

    /* renamed from: f */
    private final SessionsSettings f32134f;

    /* renamed from: g */
    private final EventGDTLoggerInterface f32135g;

    /* renamed from: h */
    private final CoroutineContext f32136h;

    /* compiled from: SessionFirelogPublisher.kt */
    @Metadata(m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m32267d2 = {"Lcom/google/firebase/sessions/SessionFirelogPublisherImpl$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "TAG", HttpUrl.FRAGMENT_ENCODE_SET, "randomValueForSampling", HttpUrl.FRAGMENT_ENCODE_SET, "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.google.firebase.sessions.c0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    /* compiled from: SessionFirelogPublisher.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    @DebugMetadata(m39049c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", m39050f = "SessionFirelogPublisher.kt", m39051l = {111}, m39052m = "getFirebaseInstallationId")
    /* renamed from: com.google.firebase.sessions.c0$b */
    static final class b extends ContinuationImpl {

        /* renamed from: f */
        /* synthetic */ Object f32137f;

        /* renamed from: h */
        int f32139h;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f32137f = obj;
            this.f32139h |= Integer.MIN_VALUE;
            return SessionFirelogPublisherImpl.this.m26735h(this);
        }
    }

    /* compiled from: SessionFirelogPublisher.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    @DebugMetadata(m39049c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1", m39050f = "SessionFirelogPublisher.kt", m39051l = {64, 70, 71}, m39052m = "invokeSuspend")
    /* renamed from: com.google.firebase.sessions.c0$c */
    static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C10775u>, Object> {

        /* renamed from: f */
        Object f32140f;

        /* renamed from: g */
        Object f32141g;

        /* renamed from: h */
        Object f32142h;

        /* renamed from: i */
        Object f32143i;

        /* renamed from: j */
        Object f32144j;

        /* renamed from: k */
        Object f32145k;

        /* renamed from: l */
        int f32146l;

        /* renamed from: n */
        final /* synthetic */ SessionDetails f32148n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(SessionDetails sessionDetails, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f32148n = sessionDetails;
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Continuation<C10775u> create(Object obj, Continuation<?> continuation) {
            return SessionFirelogPublisherImpl.this.new c(this.f32148n, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C10775u> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(C10775u.f41439a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00b2 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 204
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SessionFirelogPublisherImpl.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SessionFirelogPublisher.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    @DebugMetadata(m39049c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", m39050f = "SessionFirelogPublisher.kt", m39051l = {93}, m39052m = "shouldLogSession")
    /* renamed from: com.google.firebase.sessions.c0$d */
    static final class d extends ContinuationImpl {

        /* renamed from: f */
        Object f32149f;

        /* renamed from: g */
        /* synthetic */ Object f32150g;

        /* renamed from: i */
        int f32152i;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f32150g = obj;
            this.f32152i |= Integer.MIN_VALUE;
            return SessionFirelogPublisherImpl.this.m26737j(this);
        }
    }

    public SessionFirelogPublisherImpl(C8405j c8405j, InterfaceC8385i interfaceC8385i, SessionsSettings sessionsSettings, EventGDTLoggerInterface eventGDTLoggerInterface, CoroutineContext coroutineContext) {
        C9801m.m32346f(c8405j, "firebaseApp");
        C9801m.m32346f(interfaceC8385i, "firebaseInstallations");
        C9801m.m32346f(sessionsSettings, "sessionSettings");
        C9801m.m32346f(eventGDTLoggerInterface, "eventGDTLogger");
        C9801m.m32346f(coroutineContext, "backgroundDispatcher");
        this.f32132d = c8405j;
        this.f32133e = interfaceC8385i;
        this.f32134f = sessionsSettings;
        this.f32135g = eventGDTLoggerInterface;
        this.f32136h = coroutineContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public final void m26734g(SessionEvent sessionEvent) {
        try {
            this.f32135g.mo26847a(sessionEvent);
            Log.d("SessionFirelogPublisher", "Successfully logged Session Start event: " + sessionEvent.getSessionData().getSessionId());
        } catch (RuntimeException e2) {
            Log.e("SessionFirelogPublisher", "Error logging Session Start event to DataTransport: ", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m26735h(kotlin.coroutines.Continuation<? super java.lang.String> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.firebase.sessions.SessionFirelogPublisherImpl.b
            if (r0 == 0) goto L13
            r0 = r5
            com.google.firebase.sessions.c0$b r0 = (com.google.firebase.sessions.SessionFirelogPublisherImpl.b) r0
            int r1 = r0.f32139h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32139h = r1
            goto L18
        L13:
            com.google.firebase.sessions.c0$b r0 = new com.google.firebase.sessions.c0$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f32137f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C10853b.m39042c()
            int r2 = r0.f32139h
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.C10568o.m37655b(r5)     // Catch: java.lang.Exception -> L29
            goto L4a
        L29:
            r5 = move-exception
            goto L4d
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.C10568o.m37655b(r5)
            com.google.firebase.installations.i r5 = r4.f32133e     // Catch: java.lang.Exception -> L29
            com.google.android.gms.tasks.Task r5 = r5.getId()     // Catch: java.lang.Exception -> L29
            java.lang.String r2 = "firebaseInstallations.id"
            kotlin.jvm.internal.C9801m.m32345e(r5, r2)     // Catch: java.lang.Exception -> L29
            r0.f32139h = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r5 = kotlinx.coroutines.tasks.C10941b.m39307a(r5, r0)     // Catch: java.lang.Exception -> L29
            if (r5 != r1) goto L4a
            return r1
        L4a:
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L29
            goto L56
        L4d:
            java.lang.String r0 = "SessionFirelogPublisher"
            java.lang.String r1 = "Error getting Firebase Installation ID. Using an empty ID"
            android.util.Log.e(r0, r1, r5)
            java.lang.String r5 = ""
        L56:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SessionFirelogPublisherImpl.m26735h(kotlin.y.d):java.lang.Object");
    }

    /* renamed from: i */
    private final boolean m26736i() {
        return f32131c <= this.f32134f.m26821b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m26737j(kotlin.coroutines.Continuation<? super java.lang.Boolean> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.firebase.sessions.SessionFirelogPublisherImpl.d
            if (r0 == 0) goto L13
            r0 = r6
            com.google.firebase.sessions.c0$d r0 = (com.google.firebase.sessions.SessionFirelogPublisherImpl.d) r0
            int r1 = r0.f32152i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32152i = r1
            goto L18
        L13:
            com.google.firebase.sessions.c0$d r0 = new com.google.firebase.sessions.c0$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f32150g
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C10853b.m39042c()
            int r2 = r0.f32152i
            java.lang.String r3 = "SessionFirelogPublisher"
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r0.f32149f
            com.google.firebase.sessions.c0 r0 = (com.google.firebase.sessions.SessionFirelogPublisherImpl) r0
            kotlin.C10568o.m37655b(r6)
            goto L4d
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L37:
            kotlin.C10568o.m37655b(r6)
            java.lang.String r6 = "Data Collection is enabled for at least one Subscriber"
            android.util.Log.d(r3, r6)
            com.google.firebase.sessions.m0.f r6 = r5.f32134f
            r0.f32149f = r5
            r0.f32152i = r4
            java.lang.Object r6 = r6.m26824g(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
        L4d:
            com.google.firebase.sessions.m0.f r6 = r0.f32134f
            boolean r6 = r6.m26823d()
            r1 = 0
            if (r6 != 0) goto L60
            java.lang.String r6 = "Sessions SDK disabled. Events will not be sent."
            android.util.Log.d(r3, r6)
            java.lang.Boolean r6 = kotlin.coroutines.p442j.internal.C10857b.m39046a(r1)
            return r6
        L60:
            boolean r6 = r0.m26736i()
            if (r6 != 0) goto L70
            java.lang.String r6 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r3, r6)
            java.lang.Boolean r6 = kotlin.coroutines.p442j.internal.C10857b.m39046a(r1)
            return r6
        L70:
            java.lang.Boolean r6 = kotlin.coroutines.p442j.internal.C10857b.m39046a(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SessionFirelogPublisherImpl.m26737j(kotlin.y.d):java.lang.Object");
    }

    @Override // com.google.firebase.sessions.SessionFirelogPublisher
    /* renamed from: a */
    public void mo26727a(SessionDetails sessionDetails) {
        C9801m.m32346f(sessionDetails, "sessionDetails");
        C11008j.m39597b(C11033p0.m39668a(this.f32136h), null, null, new c(sessionDetails, null), 3, null);
    }
}
