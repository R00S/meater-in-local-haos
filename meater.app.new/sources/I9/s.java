package I9;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import ta.InterfaceC4588d;

/* compiled from: InstallationId.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0007B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\f"}, d2 = {"LI9/s;", "", "", "fid", "authToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class s {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String fid;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String authToken;

    /* compiled from: InstallationId.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"LI9/s$a;", "", "<init>", "()V", "Lk9/e;", "firebaseInstallations", "LI9/s;", "a", "(Lk9/e;Lta/d;)Ljava/lang/Object;", "", "TAG", "Ljava/lang/String;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: I9.s$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: InstallationId.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.InstallationId$Companion", f = "InstallationId.kt", l = {32, 40}, m = "create")
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: I9.s$a$a, reason: collision with other inner class name */
        static final class C0139a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: B, reason: collision with root package name */
            Object f6880B;

            /* renamed from: C, reason: collision with root package name */
            /* synthetic */ Object f6881C;

            /* renamed from: E, reason: collision with root package name */
            int f6883E;

            C0139a(InterfaceC4588d<? super C0139a> interfaceC4588d) {
                super(interfaceC4588d);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f6881C = obj;
                this.f6883E |= Integer.MIN_VALUE;
                return Companion.this.a(null, this);
            }
        }

        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v17 */
        /* JADX WARN: Type inference failed for: r9v3 */
        /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v8 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(k9.InterfaceC3810e r9, ta.InterfaceC4588d<? super I9.s> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof I9.s.Companion.C0139a
                if (r0 == 0) goto L13
                r0 = r10
                I9.s$a$a r0 = (I9.s.Companion.C0139a) r0
                int r1 = r0.f6883E
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f6883E = r1
                goto L18
            L13:
                I9.s$a$a r0 = new I9.s$a$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f6881C
                java.lang.Object r1 = ua.C4696b.e()
                int r2 = r0.f6883E
                java.lang.String r3 = ""
                java.lang.String r4 = "InstallationId"
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L48
                if (r2 == r6) goto L3e
                if (r2 != r5) goto L36
                java.lang.Object r9 = r0.f6880B
                java.lang.String r9 = (java.lang.String) r9
                oa.C4173r.b(r10)     // Catch: java.lang.Exception -> L34
                goto L8a
            L34:
                r10 = move-exception
                goto L93
            L36:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3e:
                java.lang.Object r9 = r0.f6880B
                k9.e r9 = (k9.InterfaceC3810e) r9
                oa.C4173r.b(r10)     // Catch: java.lang.Exception -> L46
                goto L60
            L46:
                r10 = move-exception
                goto L6f
            L48:
                oa.C4173r.b(r10)
                r10 = 0
                z7.j r10 = r9.a(r10)     // Catch: java.lang.Exception -> L46
                java.lang.String r2 = "firebaseInstallations.getToken(false)"
                kotlin.jvm.internal.C3862t.f(r10, r2)     // Catch: java.lang.Exception -> L46
                r0.f6880B = r9     // Catch: java.lang.Exception -> L46
                r0.f6883E = r6     // Catch: java.lang.Exception -> L46
                java.lang.Object r10 = hc.C3535b.a(r10, r0)     // Catch: java.lang.Exception -> L46
                if (r10 != r1) goto L60
                return r1
            L60:
                com.google.firebase.installations.f r10 = (com.google.firebase.installations.f) r10     // Catch: java.lang.Exception -> L46
                java.lang.String r10 = r10.b()     // Catch: java.lang.Exception -> L46
                java.lang.String r2 = "{\n          firebaseInst…).await().token\n        }"
                kotlin.jvm.internal.C3862t.f(r10, r2)     // Catch: java.lang.Exception -> L46
                r7 = r10
                r10 = r9
                r9 = r7
                goto L76
            L6f:
                java.lang.String r2 = "Error getting authentication token."
                android.util.Log.w(r4, r2, r10)
                r10 = r9
                r9 = r3
            L76:
                z7.j r10 = r10.c()     // Catch: java.lang.Exception -> L34
                java.lang.String r2 = "firebaseInstallations.id"
                kotlin.jvm.internal.C3862t.f(r10, r2)     // Catch: java.lang.Exception -> L34
                r0.f6880B = r9     // Catch: java.lang.Exception -> L34
                r0.f6883E = r5     // Catch: java.lang.Exception -> L34
                java.lang.Object r10 = hc.C3535b.a(r10, r0)     // Catch: java.lang.Exception -> L34
                if (r10 != r1) goto L8a
                return r1
            L8a:
                java.lang.String r0 = "{\n          firebaseInst…ions.id.await()\n        }"
                kotlin.jvm.internal.C3862t.f(r10, r0)     // Catch: java.lang.Exception -> L34
                java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L34
                r3 = r10
                goto L98
            L93:
                java.lang.String r0 = "Error getting Firebase installation id ."
                android.util.Log.w(r4, r0, r10)
            L98:
                I9.s r10 = new I9.s
                r0 = 0
                r10.<init>(r3, r9, r0)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: I9.s.Companion.a(k9.e, ta.d):java.lang.Object");
        }

        private Companion() {
        }
    }

    public /* synthetic */ s(String str, String str2, C3854k c3854k) {
        this(str, str2);
    }

    /* renamed from: a, reason: from getter */
    public final String getAuthToken() {
        return this.authToken;
    }

    /* renamed from: b, reason: from getter */
    public final String getFid() {
        return this.fid;
    }

    private s(String str, String str2) {
        this.fid = str;
        this.authToken = str2;
    }
}
