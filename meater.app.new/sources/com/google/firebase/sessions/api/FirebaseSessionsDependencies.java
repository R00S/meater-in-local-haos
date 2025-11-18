package com.google.firebase.sessions.api;

import android.util.Log;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.p442j.internal.ContinuationImpl;
import kotlin.coroutines.p442j.internal.DebugMetadata;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlinx.coroutines.sync.C10935d;
import kotlinx.coroutines.sync.Mutex;
import okhttp3.HttpUrl;

/* compiled from: FirebaseSessionsDependencies.kt */
@Metadata(m32266d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0007J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0007H\u0002J\u001f\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\nH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0007H\u0001¢\u0006\u0002\b\u0014J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0010H\u0007J\r\u0010\u0017\u001a\u00020\fH\u0001¢\u0006\u0002\b\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000RN\u0010\u0005\u001aB\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0012\f\u0012\n \b*\u0004\u0018\u00010\t0\t \b* \u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0012\f\u0012\n \b*\u0004\u0018\u00010\t0\t\u0018\u00010\n0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, m32267d2 = {"Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "TAG", HttpUrl.FRAGMENT_ENCODE_SET, "dependencies", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "kotlin.jvm.PlatformType", "Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies$Dependency;", HttpUrl.FRAGMENT_ENCODE_SET, "addDependency", HttpUrl.FRAGMENT_ENCODE_SET, "subscriberName", "getDependency", "getRegisteredSubscribers", "Lcom/google/firebase/sessions/api/SessionSubscriber;", "getRegisteredSubscribers$com_google_firebase_firebase_sessions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSubscriber", "getSubscriber$com_google_firebase_firebase_sessions", "register", "subscriber", "reset", "reset$com_google_firebase_firebase_sessions", "Dependency", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: com.google.firebase.sessions.l0.a, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class FirebaseSessionsDependencies {

    /* renamed from: a */
    public static final FirebaseSessionsDependencies f32247a = new FirebaseSessionsDependencies();

    /* renamed from: b */
    private static final Map<SessionSubscriber.a, Dependency> f32248b = Collections.synchronizedMap(new LinkedHashMap());

    /* compiled from: FirebaseSessionsDependencies.kt */
    @Metadata(m32266d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m32267d2 = {"Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies$Dependency;", HttpUrl.FRAGMENT_ENCODE_SET, "mutex", "Lkotlinx/coroutines/sync/Mutex;", "subscriber", "Lcom/google/firebase/sessions/api/SessionSubscriber;", "(Lkotlinx/coroutines/sync/Mutex;Lcom/google/firebase/sessions/api/SessionSubscriber;)V", "getMutex", "()Lkotlinx/coroutines/sync/Mutex;", "getSubscriber", "()Lcom/google/firebase/sessions/api/SessionSubscriber;", "setSubscriber", "(Lcom/google/firebase/sessions/api/SessionSubscriber;)V", "component1", "component2", "copy", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", HttpUrl.FRAGMENT_ENCODE_SET, "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.google.firebase.sessions.l0.a$a, reason: from toString */
    private static final /* data */ class Dependency {

        /* renamed from: a, reason: from toString */
        private final Mutex mutex;

        /* renamed from: b, reason: from toString */
        private SessionSubscriber subscriber;

        public Dependency(Mutex mutex, SessionSubscriber sessionSubscriber) {
            C9801m.m32346f(mutex, "mutex");
            this.mutex = mutex;
            this.subscriber = sessionSubscriber;
        }

        /* renamed from: a, reason: from getter */
        public final Mutex getMutex() {
            return this.mutex;
        }

        /* renamed from: b, reason: from getter */
        public final SessionSubscriber getSubscriber() {
            return this.subscriber;
        }

        /* renamed from: c */
        public final void m26796c(SessionSubscriber sessionSubscriber) {
            this.subscriber = sessionSubscriber;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dependency)) {
                return false;
            }
            Dependency dependency = (Dependency) other;
            return C9801m.m32341a(this.mutex, dependency.mutex) && C9801m.m32341a(this.subscriber, dependency.subscriber);
        }

        public int hashCode() {
            int iHashCode = this.mutex.hashCode() * 31;
            SessionSubscriber sessionSubscriber = this.subscriber;
            return iHashCode + (sessionSubscriber == null ? 0 : sessionSubscriber.hashCode());
        }

        public String toString() {
            return "Dependency(mutex=" + this.mutex + ", subscriber=" + this.subscriber + ')';
        }

        public /* synthetic */ Dependency(Mutex mutex, SessionSubscriber sessionSubscriber, int i2, C9789g c9789g) {
            this(mutex, (i2 & 2) != 0 ? null : sessionSubscriber);
        }
    }

    /* compiled from: FirebaseSessionsDependencies.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    @DebugMetadata(m39049c = "com.google.firebase.sessions.api.FirebaseSessionsDependencies", m39050f = "FirebaseSessionsDependencies.kt", m39051l = {124}, m39052m = "getRegisteredSubscribers$com_google_firebase_firebase_sessions")
    /* renamed from: com.google.firebase.sessions.l0.a$b */
    static final class b extends ContinuationImpl {

        /* renamed from: f */
        Object f32251f;

        /* renamed from: g */
        Object f32252g;

        /* renamed from: h */
        Object f32253h;

        /* renamed from: i */
        Object f32254i;

        /* renamed from: j */
        Object f32255j;

        /* renamed from: k */
        Object f32256k;

        /* renamed from: l */
        /* synthetic */ Object f32257l;

        /* renamed from: n */
        int f32259n;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f32257l = obj;
            this.f32259n |= Integer.MIN_VALUE;
            return FirebaseSessionsDependencies.this.m26792c(this);
        }
    }

    private FirebaseSessionsDependencies() {
    }

    /* renamed from: a */
    public static final void m26789a(SessionSubscriber.a aVar) {
        C9801m.m32346f(aVar, "subscriberName");
        if (aVar == SessionSubscriber.a.PERFORMANCE) {
            throw new IllegalArgumentException("Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support.");
        }
        Map<SessionSubscriber.a, Dependency> map = f32248b;
        if (map.containsKey(aVar)) {
            Log.d("SessionsDependencies", "Dependency " + aVar + " already added.");
            return;
        }
        C9801m.m32345e(map, "dependencies");
        map.put(aVar, new Dependency(C10935d.m39289a(true), null, 2, 0 == true ? 1 : 0));
        Log.d("SessionsDependencies", "Dependency to " + aVar + " added.");
    }

    /* renamed from: b */
    private final Dependency m26790b(SessionSubscriber.a aVar) {
        Map<SessionSubscriber.a, Dependency> map = f32248b;
        C9801m.m32345e(map, "dependencies");
        Dependency dependency = map.get(aVar);
        if (dependency != null) {
            C9801m.m32345e(dependency, "dependencies.getOrElse(s…load time.\"\n      )\n    }");
            return dependency;
        }
        throw new IllegalStateException("Cannot get dependency " + aVar + ". Dependencies should be added at class load time.");
    }

    /* renamed from: e */
    public static final void m26791e(SessionSubscriber sessionSubscriber) {
        C9801m.m32346f(sessionSubscriber, "subscriber");
        SessionSubscriber.a aVarMo25365b = sessionSubscriber.mo25365b();
        Dependency dependencyM26790b = f32247a.m26790b(aVarMo25365b);
        if (dependencyM26790b.getSubscriber() != null) {
            Log.d("SessionsDependencies", "Subscriber " + aVarMo25365b + " already registered.");
            return;
        }
        dependencyM26790b.m26796c(sessionSubscriber);
        Log.d("SessionsDependencies", "Subscriber " + aVarMo25365b + " registered.");
        Mutex.a.m39279a(dependencyM26790b.getMutex(), null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009f -> B:27:0x00a0). Please report as a decompilation issue!!! */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m26792c(kotlin.coroutines.Continuation<? super java.util.Map<com.google.firebase.sessions.api.SessionSubscriber.a, ? extends com.google.firebase.sessions.api.SessionSubscriber>> r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.firebase.sessions.api.FirebaseSessionsDependencies.b
            if (r0 == 0) goto L13
            r0 = r11
            com.google.firebase.sessions.l0.a$b r0 = (com.google.firebase.sessions.api.FirebaseSessionsDependencies.b) r0
            int r1 = r0.f32259n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32259n = r1
            goto L18
        L13:
            com.google.firebase.sessions.l0.a$b r0 = new com.google.firebase.sessions.l0.a$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f32257l
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C10853b.m39042c()
            int r2 = r0.f32259n
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 != r4) goto L40
            java.lang.Object r2 = r0.f32256k
            java.lang.Object r5 = r0.f32255j
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.f32254i
            kotlinx.coroutines.d3.b r6 = (kotlinx.coroutines.sync.Mutex) r6
            java.lang.Object r7 = r0.f32253h
            com.google.firebase.sessions.l0.b$a r7 = (com.google.firebase.sessions.api.SessionSubscriber.a) r7
            java.lang.Object r8 = r0.f32252g
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.f32251f
            java.util.Map r9 = (java.util.Map) r9
            kotlin.C10568o.m37655b(r11)
            goto La0
        L40:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L48:
            kotlin.C10568o.m37655b(r11)
            java.util.Map<com.google.firebase.sessions.l0.b$a, com.google.firebase.sessions.l0.a$a> r11 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.f32248b
            java.lang.String r2 = "dependencies"
            kotlin.jvm.internal.C9801m.m32345e(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r5 = r11.size()
            int r5 = kotlin.collections.C10804n0.m38775e(r5)
            r2.<init>(r5)
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
            r8 = r11
            r5 = r2
        L69:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto Lb3
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r6 = r11.getKey()
            r7 = r6
            com.google.firebase.sessions.l0.b$a r7 = (com.google.firebase.sessions.api.SessionSubscriber.a) r7
            java.lang.Object r11 = r11.getValue()
            com.google.firebase.sessions.l0.a$a r11 = (com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency) r11
            kotlinx.coroutines.d3.b r6 = r11.getMutex()
            r0.f32251f = r5
            r0.f32252g = r8
            r0.f32253h = r7
            r0.f32254i = r6
            r0.f32255j = r5
            r0.f32256k = r2
            r0.f32259n = r4
            java.lang.Object r11 = r6.mo39277b(r3, r0)
            if (r11 != r1) goto L9f
            return r1
        L9f:
            r9 = r5
        La0:
            com.google.firebase.sessions.l0.a r11 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.f32247a     // Catch: java.lang.Throwable -> Lae
            com.google.firebase.sessions.l0.b r11 = r11.m26793d(r7)     // Catch: java.lang.Throwable -> Lae
            r6.mo39278c(r3)
            r5.put(r2, r11)
            r5 = r9
            goto L69
        Lae:
            r11 = move-exception
            r6.mo39278c(r3)
            throw r11
        Lb3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.api.FirebaseSessionsDependencies.m26792c(kotlin.y.d):java.lang.Object");
    }

    /* renamed from: d */
    public final SessionSubscriber m26793d(SessionSubscriber.a aVar) {
        C9801m.m32346f(aVar, "subscriberName");
        SessionSubscriber subscriber = m26790b(aVar).getSubscriber();
        if (subscriber != null) {
            return subscriber;
        }
        throw new IllegalStateException("Subscriber " + aVar + " has not been registered.");
    }
}
