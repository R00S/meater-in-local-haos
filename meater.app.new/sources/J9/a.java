package J9;

import J9.b;
import android.util.Log;
import gc.C3462c;
import gc.InterfaceC3460a;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import ta.InterfaceC4588d;

/* compiled from: FirebaseSessionsDependencies.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u0010H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0013\u0010\u0014RT\u0010\u0018\u001aB\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\r0\r \u0016* \u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\r0\r\u0018\u00010\u00100\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"LJ9/a;", "", "<init>", "()V", "LJ9/b$a;", "subscriberName", "Loa/F;", "a", "(LJ9/b$a;)V", "LJ9/b;", "subscriber", "e", "(LJ9/b;)V", "LJ9/a$a;", "b", "(LJ9/b$a;)LJ9/a$a;", "", "c", "(Lta/d;)Ljava/lang/Object;", "d", "(LJ9/b$a;)LJ9/b;", "", "kotlin.jvm.PlatformType", "Ljava/util/Map;", "dependencies", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7640a = new a();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Map<b.a, Dependency> dependencies = Collections.synchronizedMap(new LinkedHashMap());

    /* compiled from: FirebaseSessionsDependencies.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LJ9/a$a;", "", "Lgc/a;", "mutex", "LJ9/b;", "subscriber", "<init>", "(Lgc/a;LJ9/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgc/a;", "()Lgc/a;", "b", "LJ9/b;", "()LJ9/b;", "c", "(LJ9/b;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: J9.a$a, reason: collision with other inner class name and from toString */
    private static final /* data */ class Dependency {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC3460a mutex;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private J9.b subscriber;

        public Dependency(InterfaceC3460a mutex, J9.b bVar) {
            C3862t.g(mutex, "mutex");
            this.mutex = mutex;
            this.subscriber = bVar;
        }

        /* renamed from: a, reason: from getter */
        public final InterfaceC3460a getMutex() {
            return this.mutex;
        }

        /* renamed from: b, reason: from getter */
        public final J9.b getSubscriber() {
            return this.subscriber;
        }

        public final void c(J9.b bVar) {
            this.subscriber = bVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Dependency)) {
                return false;
            }
            Dependency dependency = (Dependency) other;
            return C3862t.b(this.mutex, dependency.mutex) && C3862t.b(this.subscriber, dependency.subscriber);
        }

        public int hashCode() {
            int iHashCode = this.mutex.hashCode() * 31;
            J9.b bVar = this.subscriber;
            return iHashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            return "Dependency(mutex=" + this.mutex + ", subscriber=" + this.subscriber + ')';
        }

        public /* synthetic */ Dependency(InterfaceC3460a interfaceC3460a, J9.b bVar, int i10, C3854k c3854k) {
            this(interfaceC3460a, (i10 & 2) != 0 ? null : bVar);
        }
    }

    /* compiled from: FirebaseSessionsDependencies.kt */
    @f(c = "com.google.firebase.sessions.api.FirebaseSessionsDependencies", f = "FirebaseSessionsDependencies.kt", l = {124}, m = "getRegisteredSubscribers$com_google_firebase_firebase_sessions")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends d {

        /* renamed from: B, reason: collision with root package name */
        Object f7644B;

        /* renamed from: C, reason: collision with root package name */
        Object f7645C;

        /* renamed from: D, reason: collision with root package name */
        Object f7646D;

        /* renamed from: E, reason: collision with root package name */
        Object f7647E;

        /* renamed from: F, reason: collision with root package name */
        Object f7648F;

        /* renamed from: G, reason: collision with root package name */
        Object f7649G;

        /* renamed from: H, reason: collision with root package name */
        /* synthetic */ Object f7650H;

        /* renamed from: J, reason: collision with root package name */
        int f7652J;

        b(InterfaceC4588d<? super b> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7650H = obj;
            this.f7652J |= Integer.MIN_VALUE;
            return a.this.c(this);
        }
    }

    private a() {
    }

    public static final void a(b.a subscriberName) {
        C3862t.g(subscriberName, "subscriberName");
        if (subscriberName == b.a.PERFORMANCE) {
            throw new IllegalArgumentException("Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support.");
        }
        Map<b.a, Dependency> dependencies2 = dependencies;
        if (dependencies2.containsKey(subscriberName)) {
            Log.d("SessionsDependencies", "Dependency " + subscriberName + " already added.");
            return;
        }
        C3862t.f(dependencies2, "dependencies");
        dependencies2.put(subscriberName, new Dependency(C3462c.a(true), null, 2, 0 == true ? 1 : 0));
        Log.d("SessionsDependencies", "Dependency to " + subscriberName + " added.");
    }

    private final Dependency b(b.a subscriberName) {
        Map<b.a, Dependency> dependencies2 = dependencies;
        C3862t.f(dependencies2, "dependencies");
        Dependency dependency = dependencies2.get(subscriberName);
        if (dependency != null) {
            C3862t.f(dependency, "dependencies.getOrElse(s…load time.\"\n      )\n    }");
            return dependency;
        }
        throw new IllegalStateException("Cannot get dependency " + subscriberName + ". Dependencies should be added at class load time.");
    }

    public static final void e(J9.b subscriber) {
        C3862t.g(subscriber, "subscriber");
        b.a aVarC = subscriber.c();
        Dependency dependencyB = f7640a.b(aVarC);
        if (dependencyB.getSubscriber() != null) {
            Log.d("SessionsDependencies", "Subscriber " + aVarC + " already registered.");
            return;
        }
        dependencyB.c(subscriber);
        Log.d("SessionsDependencies", "Subscriber " + aVarC + " registered.");
        InterfaceC3460a.C0535a.c(dependencyB.getMutex(), null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00a1 -> B:27:0x00a2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(ta.InterfaceC4588d<? super java.util.Map<J9.b.a, ? extends J9.b>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof J9.a.b
            if (r0 == 0) goto L13
            r0 = r11
            J9.a$b r0 = (J9.a.b) r0
            int r1 = r0.f7652J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7652J = r1
            goto L18
        L13:
            J9.a$b r0 = new J9.a$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f7650H
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f7652J
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r2 = r0.f7649G
            java.lang.Object r5 = r0.f7648F
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.f7647E
            gc.a r6 = (gc.InterfaceC3460a) r6
            java.lang.Object r7 = r0.f7646D
            J9.b$a r7 = (J9.b.a) r7
            java.lang.Object r8 = r0.f7645C
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.f7644B
            java.util.Map r9 = (java.util.Map) r9
            oa.C4173r.b(r11)
            goto La2
        L40:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L48:
            oa.C4173r.b(r11)
            java.util.Map<J9.b$a, J9.a$a> r11 = J9.a.dependencies
            java.lang.String r2 = "dependencies"
            kotlin.jvm.internal.C3862t.f(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r5 = r11.size()
            int r5 = kotlin.collections.M.d(r5)
            r2.<init>(r5)
            java.util.Set r11 = r11.entrySet()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            r8 = r11
            r5 = r2
        L6b:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto Lb5
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r6 = r11.getKey()
            r7 = r6
            J9.b$a r7 = (J9.b.a) r7
            java.lang.Object r11 = r11.getValue()
            J9.a$a r11 = (J9.a.Dependency) r11
            gc.a r6 = r11.getMutex()
            r0.f7644B = r5
            r0.f7645C = r8
            r0.f7646D = r7
            r0.f7647E = r6
            r0.f7648F = r5
            r0.f7649G = r2
            r0.f7652J = r3
            java.lang.Object r11 = r6.d(r4, r0)
            if (r11 != r1) goto La1
            return r1
        La1:
            r9 = r5
        La2:
            J9.a r11 = J9.a.f7640a     // Catch: java.lang.Throwable -> Lb0
            J9.b r11 = r11.d(r7)     // Catch: java.lang.Throwable -> Lb0
            r6.c(r4)
            r5.put(r2, r11)
            r5 = r9
            goto L6b
        Lb0:
            r11 = move-exception
            r6.c(r4)
            throw r11
        Lb5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: J9.a.c(ta.d):java.lang.Object");
    }

    public final J9.b d(b.a subscriberName) {
        C3862t.g(subscriberName, "subscriberName");
        J9.b subscriber = b(subscriberName).getSubscriber();
        if (subscriber != null) {
            return subscriber;
        }
        throw new IllegalStateException("Subscriber " + subscriberName + " has not been registered.");
    }
}
