package com.google.firebase.sessions;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.google.firebase.C8405j;
import com.google.firebase.sessions.settings.SessionsSettings;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.p442j.internal.DebugMetadata;
import kotlin.coroutines.p442j.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlinx.coroutines.C11008j;
import kotlinx.coroutines.C11033p0;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.HttpUrl;

/* compiled from: FirebaseSessions.kt */
@Metadata(m32266d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m32267d2 = {"Lcom/google/firebase/sessions/FirebaseSessions;", HttpUrl.FRAGMENT_ENCODE_SET, "firebaseApp", "Lcom/google/firebase/FirebaseApp;", "settings", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "backgroundDispatcher", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/sessions/settings/SessionsSettings;Lkotlin/coroutines/CoroutineContext;)V", "Companion", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: com.google.firebase.sessions.q, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class FirebaseSessions {

    /* renamed from: a */
    public static final b f32338a = new b(null);

    /* renamed from: b */
    private final C8405j f32339b;

    /* renamed from: c */
    private final SessionsSettings f32340c;

    /* compiled from: FirebaseSessions.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    @DebugMetadata(m39049c = "com.google.firebase.sessions.FirebaseSessions$1", m39050f = "FirebaseSessions.kt", m39051l = {44, 48}, m39052m = "invokeSuspend")
    /* renamed from: com.google.firebase.sessions.q$a */
    static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C10775u>, Object> {

        /* renamed from: f */
        int f32341f;

        /* renamed from: h */
        final /* synthetic */ CoroutineContext f32343h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CoroutineContext coroutineContext, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f32343h = coroutineContext;
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Continuation<C10775u> create(Object obj, Continuation<?> continuation) {
            return FirebaseSessions.this.new a(this.f32343h, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C10775u> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(C10775u.f41439a);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.C10853b.m39042c()
                int r1 = r5.f32341f
                java.lang.String r2 = "FirebaseSessions"
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L20
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L14
                kotlin.C10568o.m37655b(r6)
                goto L6d
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                kotlin.C10568o.m37655b(r6)
                goto L2e
            L20:
                kotlin.C10568o.m37655b(r6)
                com.google.firebase.sessions.l0.a r6 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.f32247a
                r5.f32341f = r4
                java.lang.Object r6 = r6.m26792c(r5)
                if (r6 != r0) goto L2e
                return r0
            L2e:
                java.util.Map r6 = (java.util.Map) r6
                java.util.Collection r6 = r6.values()
                boolean r1 = r6 instanceof java.util.Collection
                if (r1 == 0) goto L3f
                boolean r1 = r6.isEmpty()
                if (r1 == 0) goto L3f
                goto L56
            L3f:
                java.util.Iterator r6 = r6.iterator()
            L43:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L56
                java.lang.Object r1 = r6.next()
                com.google.firebase.sessions.l0.b r1 = (com.google.firebase.sessions.api.SessionSubscriber) r1
                boolean r1 = r1.mo25364a()
                if (r1 == 0) goto L43
                r4 = 0
            L56:
                if (r4 == 0) goto L5e
                java.lang.String r6 = "No Sessions subscribers. Not listening to lifecycle events."
                android.util.Log.d(r2, r6)
                goto L99
            L5e:
                com.google.firebase.sessions.q r6 = com.google.firebase.sessions.FirebaseSessions.this
                com.google.firebase.sessions.m0.f r6 = com.google.firebase.sessions.FirebaseSessions.m26850b(r6)
                r5.f32341f = r3
                java.lang.Object r6 = r6.m26824g(r5)
                if (r6 != r0) goto L6d
                return r0
            L6d:
                com.google.firebase.sessions.q r6 = com.google.firebase.sessions.FirebaseSessions.this
                com.google.firebase.sessions.m0.f r6 = com.google.firebase.sessions.FirebaseSessions.m26850b(r6)
                boolean r6 = r6.m26823d()
                if (r6 != 0) goto L7f
                java.lang.String r6 = "Sessions SDK disabled. Not listening to lifecycle events."
                android.util.Log.d(r2, r6)
                goto L99
            L7f:
                com.google.firebase.sessions.f0 r6 = new com.google.firebase.sessions.f0
                kotlin.y.g r0 = r5.f32343h
                r6.<init>(r0)
                r6.m26763i()
                com.google.firebase.sessions.i0 r0 = com.google.firebase.sessions.SessionsActivityLifecycleCallbacks.f32194f
                r0.m26774a(r6)
                com.google.firebase.sessions.q r6 = com.google.firebase.sessions.FirebaseSessions.this
                com.google.firebase.j r6 = com.google.firebase.sessions.FirebaseSessions.m26849a(r6)
                com.google.firebase.sessions.b r0 = new com.google.firebase.InterfaceC8406k() { // from class: com.google.firebase.sessions.b
                    static {
                        /*
                            com.google.firebase.sessions.b r0 = new com.google.firebase.sessions.b
                            r0.<init>()
                            
                            // error: 0x0005: SPUT (r0 I:com.google.firebase.sessions.b) com.google.firebase.sessions.b.a com.google.firebase.sessions.b
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.C8502b.<clinit>():void");
                    }

                    {
                        /*
                            r0 = this;
                            r0.<init>()
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.C8502b.<init>():void");
                    }
                }
                r6.m26402f(r0)
            L99:
                kotlin.u r6 = kotlin.C10775u.f41439a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.FirebaseSessions.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: FirebaseSessions.kt */
    @Metadata(m32266d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m32267d2 = {"Lcom/google/firebase/sessions/FirebaseSessions$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "TAG", HttpUrl.FRAGMENT_ENCODE_SET, "instance", "Lcom/google/firebase/sessions/FirebaseSessions;", "getInstance", "()Lcom/google/firebase/sessions/FirebaseSessions;", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.google.firebase.sessions.q$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9789g c9789g) {
            this();
        }
    }

    public FirebaseSessions(C8405j c8405j, SessionsSettings sessionsSettings, CoroutineContext coroutineContext) {
        C9801m.m32346f(c8405j, "firebaseApp");
        C9801m.m32346f(sessionsSettings, "settings");
        C9801m.m32346f(coroutineContext, "backgroundDispatcher");
        this.f32339b = c8405j;
        this.f32340c = sessionsSettings;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        Context applicationContext = c8405j.m26404i().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(SessionsActivityLifecycleCallbacks.f32194f);
            C11008j.m39597b(C11033p0.m39668a(coroutineContext), null, null, new a(coroutineContext, null), 3, null);
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
