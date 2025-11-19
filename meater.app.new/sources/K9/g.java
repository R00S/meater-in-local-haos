package K9;

import Ba.p;
import E1.d;
import Xb.C1839h;
import Xb.I;
import ac.C1972g;
import ac.InterfaceC1970e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: SettingsCache.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 12\u00020\u0001:\u0001.B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ1\u0010\u000f\u001a\u00020\b\"\u0004\b\u0000\u0010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\u0010\u000e\u001a\u0004\u0018\u00018\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0016H\u0086@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001d\u0010#\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\u0019H\u0086@ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u001d\u0010&\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010\u0019H\u0086@ø\u0001\u0000¢\u0006\u0004\b&\u0010$J\u001d\u0010)\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010'H\u0086@ø\u0001\u0000¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/\u0082\u0002\u0004\n\u0002\b\u0019¨\u00062"}, d2 = {"LK9/g;", "", "LB1/e;", "LE1/d;", "dataStore", "<init>", "(LB1/e;)V", "preferences", "Loa/F;", "l", "(LE1/d;)V", "T", "LE1/d$a;", "key", "value", "h", "(LE1/d$a;Ljava/lang/Object;Lta/d;)Ljava/lang/Object;", "", "d", "()Z", "g", "()Ljava/lang/Boolean;", "", "f", "()Ljava/lang/Double;", "", "e", "()Ljava/lang/Integer;", "enabled", "n", "(Ljava/lang/Boolean;Lta/d;)Ljava/lang/Object;", "rate", "i", "(Ljava/lang/Double;Lta/d;)Ljava/lang/Object;", "timeoutInSeconds", "m", "(Ljava/lang/Integer;Lta/d;)Ljava/lang/Object;", "cacheDurationInSeconds", "j", "", "cacheUpdatedTime", "k", "(Ljava/lang/Long;Lta/d;)Ljava/lang/Object;", "a", "LB1/e;", "LK9/e;", "b", "LK9/e;", "sessionConfigs", "c", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    private static final b f8852c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final d.a<Boolean> f8853d = E1.f.a("firebase_sessions_enabled");

    /* renamed from: e, reason: collision with root package name */
    private static final d.a<Double> f8854e = E1.f.b("firebase_sessions_sampling_rate");

    /* renamed from: f, reason: collision with root package name */
    private static final d.a<Integer> f8855f = E1.f.d("firebase_sessions_restart_timeout");

    /* renamed from: g, reason: collision with root package name */
    private static final d.a<Integer> f8856g = E1.f.d("firebase_sessions_cache_duration");

    /* renamed from: h, reason: collision with root package name */
    private static final d.a<Long> f8857h = E1.f.e("firebase_sessions_cache_updated_time");

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final B1.e<E1.d> dataStore;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private SessionConfigs sessionConfigs;

    /* compiled from: SettingsCache.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.SettingsCache$1", f = "SettingsCache.kt", l = {46}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        Object f8860B;

        /* renamed from: C, reason: collision with root package name */
        int f8861C;

        a(InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return g.this.new a(interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            g gVar;
            Object objE = C4696b.e();
            int i10 = this.f8861C;
            if (i10 == 0) {
                C4173r.b(obj);
                g gVar2 = g.this;
                InterfaceC1970e interfaceC1970eF = gVar2.dataStore.f();
                this.f8860B = gVar2;
                this.f8861C = 1;
                Object objQ = C1972g.q(interfaceC1970eF, this);
                if (objQ == objE) {
                    return objE;
                }
                gVar = gVar2;
                obj = objQ;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gVar = (g) this.f8860B;
                C4173r.b(obj);
            }
            gVar.l(((E1.d) obj).d());
            return C4153F.f46609a;
        }
    }

    /* compiled from: SettingsCache.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LK9/g$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b {
        public /* synthetic */ b(C3854k c3854k) {
            this();
        }

        private b() {
        }
    }

    /* compiled from: SettingsCache.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.SettingsCache", f = "SettingsCache.kt", l = {119}, m = "updateConfigValue")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        /* synthetic */ Object f8863B;

        /* renamed from: D, reason: collision with root package name */
        int f8865D;

        c(InterfaceC4588d<? super c> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f8863B = obj;
            this.f8865D |= Integer.MIN_VALUE;
            return g.this.h(null, null, this);
        }
    }

    /* compiled from: SettingsCache.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2", f = "SettingsCache.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "LE1/a;", "preferences", "Loa/F;", "<anonymous>", "(LE1/a;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends l implements p<E1.a, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f8866B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f8867C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ T f8868D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ d.a<T> f8869E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ g f8870F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(T t10, d.a<T> aVar, g gVar, InterfaceC4588d<? super d> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f8868D = t10;
            this.f8869E = aVar;
            this.f8870F = gVar;
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(E1.a aVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((d) create(aVar, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            d dVar = new d(this.f8868D, this.f8869E, this.f8870F, interfaceC4588d);
            dVar.f8867C = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f8866B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            E1.a aVar = (E1.a) this.f8867C;
            T t10 = this.f8868D;
            if (t10 != 0) {
                aVar.i(this.f8869E, t10);
            } else {
                aVar.h(this.f8869E);
            }
            this.f8870F.l(aVar);
            return C4153F.f46609a;
        }
    }

    public g(B1.e<E1.d> dataStore) {
        C3862t.g(dataStore, "dataStore");
        this.dataStore = dataStore;
        C1839h.b(null, new a(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> java.lang.Object h(E1.d.a<T> r6, T r7, ta.InterfaceC4588d<? super oa.C4153F> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof K9.g.c
            if (r0 == 0) goto L13
            r0 = r8
            K9.g$c r0 = (K9.g.c) r0
            int r1 = r0.f8865D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8865D = r1
            goto L18
        L13:
            K9.g$c r0 = new K9.g$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f8863B
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f8865D
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            oa.C4173r.b(r8)     // Catch: java.io.IOException -> L29
            goto L5d
        L29:
            r6 = move-exception
            goto L47
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            oa.C4173r.b(r8)
            B1.e<E1.d> r8 = r5.dataStore     // Catch: java.io.IOException -> L29
            K9.g$d r2 = new K9.g$d     // Catch: java.io.IOException -> L29
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch: java.io.IOException -> L29
            r0.f8865D = r3     // Catch: java.io.IOException -> L29
            java.lang.Object r6 = E1.g.a(r8, r2, r0)     // Catch: java.io.IOException -> L29
            if (r6 != r1) goto L5d
            return r1
        L47:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Failed to update cache config value: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "SettingsCache"
            android.util.Log.w(r7, r6)
        L5d:
            oa.F r6 = oa.C4153F.f46609a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: K9.g.h(E1.d$a, java.lang.Object, ta.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(E1.d preferences) {
        this.sessionConfigs = new SessionConfigs((Boolean) preferences.b(f8853d), (Double) preferences.b(f8854e), (Integer) preferences.b(f8855f), (Integer) preferences.b(f8856g), (Long) preferences.b(f8857h));
    }

    public final boolean d() {
        SessionConfigs sessionConfigs = this.sessionConfigs;
        SessionConfigs sessionConfigs2 = null;
        if (sessionConfigs == null) {
            C3862t.u("sessionConfigs");
            sessionConfigs = null;
        }
        Long cacheUpdatedTime = sessionConfigs.getCacheUpdatedTime();
        SessionConfigs sessionConfigs3 = this.sessionConfigs;
        if (sessionConfigs3 == null) {
            C3862t.u("sessionConfigs");
        } else {
            sessionConfigs2 = sessionConfigs3;
        }
        Integer cacheDuration = sessionConfigs2.getCacheDuration();
        return cacheUpdatedTime == null || cacheDuration == null || (System.currentTimeMillis() - cacheUpdatedTime.longValue()) / ((long) 1000) >= ((long) cacheDuration.intValue());
    }

    public final Integer e() {
        SessionConfigs sessionConfigs = this.sessionConfigs;
        if (sessionConfigs == null) {
            C3862t.u("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.getSessionRestartTimeout();
    }

    public final Double f() {
        SessionConfigs sessionConfigs = this.sessionConfigs;
        if (sessionConfigs == null) {
            C3862t.u("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.getSessionSamplingRate();
    }

    public final Boolean g() {
        SessionConfigs sessionConfigs = this.sessionConfigs;
        if (sessionConfigs == null) {
            C3862t.u("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.getSessionEnabled();
    }

    public final Object i(Double d10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objH = h(f8854e, d10, interfaceC4588d);
        return objH == C4696b.e() ? objH : C4153F.f46609a;
    }

    public final Object j(Integer num, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objH = h(f8856g, num, interfaceC4588d);
        return objH == C4696b.e() ? objH : C4153F.f46609a;
    }

    public final Object k(Long l10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objH = h(f8857h, l10, interfaceC4588d);
        return objH == C4696b.e() ? objH : C4153F.f46609a;
    }

    public final Object m(Integer num, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objH = h(f8855f, num, interfaceC4588d);
        return objH == C4696b.e() ? objH : C4153F.f46609a;
    }

    public final Object n(Boolean bool, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objH = h(f8853d, bool, interfaceC4588d);
        return objH == C4696b.e() ? objH : C4153F.f46609a;
    }
}
