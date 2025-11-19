package I9;

import Xb.C1841i;
import android.util.Log;
import k9.InterfaceC3810e;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import ta.InterfaceC4588d;

/* compiled from: SessionFirelogPublisher.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u001aB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"LI9/B;", "Lcom/google/firebase/sessions/b;", "Lcom/google/firebase/f;", "firebaseApp", "Lk9/e;", "firebaseInstallations", "LK9/f;", "sessionSettings", "LI9/h;", "eventGDTLogger", "Lta/g;", "backgroundDispatcher", "<init>", "(Lcom/google/firebase/f;Lk9/e;LK9/f;LI9/h;Lta/g;)V", "LI9/z;", "sessionEvent", "Loa/F;", "g", "(LI9/z;)V", "", "i", "(Lta/d;)Ljava/lang/Object;", "h", "()Z", "LI9/y;", "sessionDetails", "a", "(LI9/y;)V", "b", "Lcom/google/firebase/f;", "c", "Lk9/e;", "d", "LK9/f;", "e", "LI9/h;", "f", "Lta/g;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class B implements com.google.firebase.sessions.b {

    /* renamed from: h, reason: collision with root package name */
    private static final double f6758h = Math.random();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final com.google.firebase.f firebaseApp;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC3810e firebaseInstallations;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final K9.f sessionSettings;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1196h eventGDTLogger;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ta.g backgroundDispatcher;

    /* compiled from: SessionFirelogPublisher.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1", f = "SessionFirelogPublisher.kt", l = {63, 64, 70}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.coroutines.jvm.internal.l implements Ba.p<Xb.I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        Object f6764B;

        /* renamed from: C, reason: collision with root package name */
        Object f6765C;

        /* renamed from: D, reason: collision with root package name */
        Object f6766D;

        /* renamed from: E, reason: collision with root package name */
        Object f6767E;

        /* renamed from: F, reason: collision with root package name */
        Object f6768F;

        /* renamed from: G, reason: collision with root package name */
        Object f6769G;

        /* renamed from: H, reason: collision with root package name */
        int f6770H;

        /* renamed from: J, reason: collision with root package name */
        final /* synthetic */ SessionDetails f6772J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(SessionDetails sessionDetails, InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f6772J = sessionDetails;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return B.this.new b(this.f6772J, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(Xb.I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0095 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = ua.C4696b.e()
                int r1 = r10.f6770H
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L45
                if (r1 == r4) goto L41
                if (r1 == r3) goto L3d
                if (r1 != r2) goto L35
                java.lang.Object r0 = r10.f6769G
                K9.f r0 = (K9.f) r0
                java.lang.Object r1 = r10.f6768F
                I9.y r1 = (I9.SessionDetails) r1
                java.lang.Object r2 = r10.f6767E
                com.google.firebase.f r2 = (com.google.firebase.f) r2
                java.lang.Object r3 = r10.f6766D
                I9.A r3 = (I9.A) r3
                java.lang.Object r4 = r10.f6765C
                I9.B r4 = (I9.B) r4
                java.lang.Object r5 = r10.f6764B
                I9.s r5 = (I9.s) r5
                oa.C4173r.b(r11)
                r7 = r4
                r8 = r3
                r3 = r0
                r0 = r8
                r9 = r2
                r2 = r1
                r1 = r9
                goto L9d
            L35:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L3d:
                oa.C4173r.b(r11)
                goto L6c
            L41:
                oa.C4173r.b(r11)
                goto L53
            L45:
                oa.C4173r.b(r11)
                I9.B r11 = I9.B.this
                r10.f6770H = r4
                java.lang.Object r11 = I9.B.f(r11, r10)
                if (r11 != r0) goto L53
                return r0
            L53:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto Lb0
                I9.s$a r11 = I9.s.INSTANCE
                I9.B r1 = I9.B.this
                k9.e r1 = I9.B.d(r1)
                r10.f6770H = r3
                java.lang.Object r11 = r11.a(r1, r10)
                if (r11 != r0) goto L6c
                return r0
            L6c:
                r5 = r11
                I9.s r5 = (I9.s) r5
                I9.B r4 = I9.B.this
                I9.A r3 = I9.A.f6755a
                com.google.firebase.f r11 = I9.B.c(r4)
                I9.y r1 = r10.f6772J
                I9.B r6 = I9.B.this
                K9.f r6 = I9.B.e(r6)
                J9.a r7 = J9.a.f7640a
                r10.f6764B = r5
                r10.f6765C = r4
                r10.f6766D = r3
                r10.f6767E = r11
                r10.f6768F = r1
                r10.f6769G = r6
                r10.f6770H = r2
                java.lang.Object r2 = r7.c(r10)
                if (r2 != r0) goto L96
                return r0
            L96:
                r0 = r3
                r7 = r4
                r3 = r6
                r8 = r1
                r1 = r11
                r11 = r2
                r2 = r8
            L9d:
                r4 = r11
                java.util.Map r4 = (java.util.Map) r4
                java.lang.String r11 = r5.getFid()
                java.lang.String r6 = r5.getAuthToken()
                r5 = r11
                I9.z r11 = r0.a(r1, r2, r3, r4, r5, r6)
                I9.B.b(r7, r11)
            Lb0:
                oa.F r11 = oa.C4153F.f46609a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: I9.B.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SessionFirelogPublisher.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", f = "SessionFirelogPublisher.kt", l = {94}, m = "shouldLogSession")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f6773B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f6774C;

        /* renamed from: E, reason: collision with root package name */
        int f6776E;

        c(InterfaceC4588d<? super c> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6774C = obj;
            this.f6776E |= Integer.MIN_VALUE;
            return B.this.i(this);
        }
    }

    public B(com.google.firebase.f firebaseApp, InterfaceC3810e firebaseInstallations, K9.f sessionSettings, InterfaceC1196h eventGDTLogger, ta.g backgroundDispatcher) {
        C3862t.g(firebaseApp, "firebaseApp");
        C3862t.g(firebaseInstallations, "firebaseInstallations");
        C3862t.g(sessionSettings, "sessionSettings");
        C3862t.g(eventGDTLogger, "eventGDTLogger");
        C3862t.g(backgroundDispatcher, "backgroundDispatcher");
        this.firebaseApp = firebaseApp;
        this.firebaseInstallations = firebaseInstallations;
        this.sessionSettings = sessionSettings;
        this.eventGDTLogger = eventGDTLogger;
        this.backgroundDispatcher = backgroundDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(SessionEvent sessionEvent) {
        try {
            this.eventGDTLogger.a(sessionEvent);
            Log.d("SessionFirelogPublisher", "Successfully logged Session Start event.");
        } catch (RuntimeException e10) {
            Log.e("SessionFirelogPublisher", "Error logging Session Start event to DataTransport: ", e10);
        }
    }

    private final boolean h() {
        return f6758h <= this.sessionSettings.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(ta.InterfaceC4588d<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof I9.B.c
            if (r0 == 0) goto L13
            r0 = r6
            I9.B$c r0 = (I9.B.c) r0
            int r1 = r0.f6776E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6776E = r1
            goto L18
        L13:
            I9.B$c r0 = new I9.B$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f6774C
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f6776E
            java.lang.String r3 = "SessionFirelogPublisher"
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r0.f6773B
            I9.B r0 = (I9.B) r0
            oa.C4173r.b(r6)
            goto L4d
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L37:
            oa.C4173r.b(r6)
            java.lang.String r6 = "Data Collection is enabled for at least one Subscriber"
            android.util.Log.d(r3, r6)
            K9.f r6 = r5.sessionSettings
            r0.f6773B = r5
            r0.f6776E = r4
            java.lang.Object r6 = r6.g(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
        L4d:
            K9.f r6 = r0.sessionSettings
            boolean r6 = r6.d()
            r1 = 0
            if (r6 != 0) goto L60
            java.lang.String r6 = "Sessions SDK disabled. Events will not be sent."
            android.util.Log.d(r3, r6)
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r1)
            return r6
        L60:
            boolean r6 = r0.h()
            if (r6 != 0) goto L70
            java.lang.String r6 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r3, r6)
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r1)
            return r6
        L70:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: I9.B.i(ta.d):java.lang.Object");
    }

    @Override // com.google.firebase.sessions.b
    public void a(SessionDetails sessionDetails) {
        C3862t.g(sessionDetails, "sessionDetails");
        C1841i.d(Xb.J.a(this.backgroundDispatcher), null, null, new b(sessionDetails, null), 3, null);
    }
}
