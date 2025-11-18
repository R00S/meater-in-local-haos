package com.google.firebase.sessions.settings;

import androidx.datastore.core.InterfaceC0340e;
import cm.aptoide.p092pt.database.room.RoomNotification;
import kotlin.C10568o;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C10855d;
import kotlin.coroutines.p442j.internal.ContinuationImpl;
import kotlin.coroutines.p442j.internal.DebugMetadata;
import kotlin.coroutines.p442j.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlinx.coroutines.C10965i;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.C11078d;
import kotlinx.coroutines.flow.Flow;
import okhttp3.HttpUrl;
import p024c.p064l.p065b.p066i.AbstractC0979d;
import p024c.p064l.p065b.p066i.C0976a;
import p024c.p064l.p065b.p066i.C0981f;

/* compiled from: SettingsCache.kt */
@Metadata(m32266d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\n\b\u0000\u0018\u0000 .2\u00020\u0001:\u0001.B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\r\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\nJ\u0013\u0010\u000b\u001a\u00020\fH\u0081@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\r\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\r\u0010\u0015\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0016J/\u0010\u0017\u001a\u00020\f\"\u0004\b\u0000\u0010\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001a2\b\u0010\u001b\u001a\u0004\u0018\u0001H\u0018H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0013H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ\u001b\u0010 \u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\u0010H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\"J\u001b\u0010#\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010&J\u0010\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\u0004H\u0002J\u001b\u0010)\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010\u0010H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\"J\u001b\u0010+\u001a\u00020\f2\b\u0010,\u001a\u0004\u0018\u00010\tH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010-R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, m32267d2 = {"Lcom/google/firebase/sessions/settings/SettingsCache;", HttpUrl.FRAGMENT_ENCODE_SET, "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "(Landroidx/datastore/core/DataStore;)V", "sessionConfigs", "Lcom/google/firebase/sessions/settings/SessionConfigs;", "hasCacheExpired", HttpUrl.FRAGMENT_ENCODE_SET, "hasCacheExpired$com_google_firebase_firebase_sessions", "removeConfigs", HttpUrl.FRAGMENT_ENCODE_SET, "removeConfigs$com_google_firebase_firebase_sessions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sessionRestartTimeout", HttpUrl.FRAGMENT_ENCODE_SET, "()Ljava/lang/Integer;", "sessionSamplingRate", HttpUrl.FRAGMENT_ENCODE_SET, "()Ljava/lang/Double;", "sessionsEnabled", "()Ljava/lang/Boolean;", "updateConfigValue", "T", RoomNotification.KEY, "Landroidx/datastore/preferences/core/Preferences$Key;", "value", "(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSamplingRate", "rate", "(Ljava/lang/Double;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSessionCacheDuration", "cacheDurationInSeconds", "(Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSessionCacheUpdatedTime", "cacheUpdatedTime", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSessionConfigs", "preferences", "updateSessionRestartTimeout", "timeoutInSeconds", "updateSettingsEnabled", "enabled", "(Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: com.google.firebase.sessions.m0.g, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class SettingsCache {

    /* renamed from: a */
    private static final b f32313a = new b(null);

    /* renamed from: b */
    @Deprecated
    private static final AbstractC0979d.a<Boolean> f32314b = C0981f.m6256a("firebase_sessions_enabled");

    /* renamed from: c */
    @Deprecated
    private static final AbstractC0979d.a<Double> f32315c = C0981f.m6257b("firebase_sessions_sampling_rate");

    /* renamed from: d */
    @Deprecated
    private static final AbstractC0979d.a<Integer> f32316d = C0981f.m6259d("firebase_sessions_restart_timeout");

    /* renamed from: e */
    @Deprecated
    private static final AbstractC0979d.a<Integer> f32317e = C0981f.m6259d("firebase_sessions_cache_duration");

    /* renamed from: f */
    @Deprecated
    private static final AbstractC0979d.a<Long> f32318f = C0981f.m6260e("firebase_sessions_cache_updated_time");

    /* renamed from: g */
    private final InterfaceC0340e<AbstractC0979d> f32319g;

    /* renamed from: h */
    private SessionConfigs f32320h;

    /* compiled from: SettingsCache.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    @DebugMetadata(m39049c = "com.google.firebase.sessions.settings.SettingsCache$1", m39050f = "SettingsCache.kt", m39051l = {46}, m39052m = "invokeSuspend")
    /* renamed from: com.google.firebase.sessions.m0.g$a */
    static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C10775u>, Object> {

        /* renamed from: f */
        Object f32321f;

        /* renamed from: g */
        int f32322g;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Continuation<C10775u> create(Object obj, Continuation<?> continuation) {
            return SettingsCache.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C10775u> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(C10775u.f41439a);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            SettingsCache settingsCache;
            Object objM39045c = C10855d.m39045c();
            int i2 = this.f32322g;
            if (i2 == 0) {
                C10568o.m37655b(obj);
                SettingsCache settingsCache2 = SettingsCache.this;
                Flow flowMo2359b = settingsCache2.f32319g.mo2359b();
                this.f32321f = settingsCache2;
                this.f32322g = 1;
                Object objM39724f = C11078d.m39724f(flowMo2359b, this);
                if (objM39724f == objM39045c) {
                    return objM39045c;
                }
                settingsCache = settingsCache2;
                obj = objM39724f;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                settingsCache = (SettingsCache) this.f32321f;
                C10568o.m37655b(obj);
            }
            settingsCache.m26833l(((AbstractC0979d) obj).m6250d());
            return C10775u.f41439a;
        }
    }

    /* compiled from: SettingsCache.kt */
    @Metadata(m32266d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007R\u000e\u0010\u0013\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m32267d2 = {"Lcom/google/firebase/sessions/settings/SettingsCache$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "CACHE_DURATION_SECONDS", "Landroidx/datastore/preferences/core/Preferences$Key;", HttpUrl.FRAGMENT_ENCODE_SET, "getCACHE_DURATION_SECONDS", "()Landroidx/datastore/preferences/core/Preferences$Key;", "CACHE_UPDATED_TIME", HttpUrl.FRAGMENT_ENCODE_SET, "getCACHE_UPDATED_TIME", "RESTART_TIMEOUT_SECONDS", "getRESTART_TIMEOUT_SECONDS", "SAMPLING_RATE", HttpUrl.FRAGMENT_ENCODE_SET, "getSAMPLING_RATE", "SESSIONS_ENABLED", HttpUrl.FRAGMENT_ENCODE_SET, "getSESSIONS_ENABLED", "TAG", HttpUrl.FRAGMENT_ENCODE_SET, "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.google.firebase.sessions.m0.g$b */
    private static final class b {
        private b() {
        }

        public /* synthetic */ b(C9789g c9789g) {
            this();
        }
    }

    /* compiled from: SettingsCache.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    @DebugMetadata(m39049c = "com.google.firebase.sessions.settings.SettingsCache", m39050f = "SettingsCache.kt", m39051l = {112}, m39052m = "updateConfigValue")
    /* renamed from: com.google.firebase.sessions.m0.g$c */
    static final class c<T> extends ContinuationImpl {

        /* renamed from: f */
        /* synthetic */ Object f32324f;

        /* renamed from: h */
        int f32326h;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f32324f = obj;
            this.f32326h |= Integer.MIN_VALUE;
            return SettingsCache.this.m26832h(null, null, this);
        }
    }

    /* compiled from: SettingsCache.kt */
    @Metadata(m32266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "T", "preferences", "Landroidx/datastore/preferences/core/MutablePreferences;"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    @DebugMetadata(m39049c = "com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2", m39050f = "SettingsCache.kt", m39051l = {}, m39052m = "invokeSuspend")
    /* renamed from: com.google.firebase.sessions.m0.g$d */
    static final class d extends SuspendLambda implements Function2<C0976a, Continuation<? super C10775u>, Object> {

        /* renamed from: f */
        int f32327f;

        /* renamed from: g */
        /* synthetic */ Object f32328g;

        /* renamed from: h */
        final /* synthetic */ T f32329h;

        /* renamed from: i */
        final /* synthetic */ AbstractC0979d.a<T> f32330i;

        /* renamed from: j */
        final /* synthetic */ SettingsCache f32331j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(T t, AbstractC0979d.a<T> aVar, SettingsCache settingsCache, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f32329h = t;
            this.f32330i = aVar;
            this.f32331j = settingsCache;
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Continuation<C10775u> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(this.f32329h, this.f32330i, this.f32331j, continuation);
            dVar.f32328g = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C0976a c0976a, Continuation<? super C10775u> continuation) {
            return ((d) create(c0976a, continuation)).invokeSuspend(C10775u.f41439a);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C10855d.m39045c();
            if (this.f32327f != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C10568o.m37655b(obj);
            C0976a c0976a = (C0976a) this.f32328g;
            T t = this.f32329h;
            if (t != 0) {
                c0976a.m6243i(this.f32330i, t);
            } else {
                c0976a.m6242h(this.f32330i);
            }
            this.f32331j.m26833l(c0976a);
            return C10775u.f41439a;
        }
    }

    public SettingsCache(InterfaceC0340e<AbstractC0979d> interfaceC0340e) throws InterruptedException {
        C9801m.m32346f(interfaceC0340e, "dataStore");
        this.f32319g = interfaceC0340e;
        C10965i.m39424b(null, new a(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> java.lang.Object m26832h(p024c.p064l.p065b.p066i.AbstractC0979d.a<T> r6, T r7, kotlin.coroutines.Continuation<? super kotlin.C10775u> r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.firebase.sessions.settings.SettingsCache.c
            if (r0 == 0) goto L13
            r0 = r8
            com.google.firebase.sessions.m0.g$c r0 = (com.google.firebase.sessions.settings.SettingsCache.c) r0
            int r1 = r0.f32326h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32326h = r1
            goto L18
        L13:
            com.google.firebase.sessions.m0.g$c r0 = new com.google.firebase.sessions.m0.g$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f32324f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C10853b.m39042c()
            int r2 = r0.f32326h
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.C10568o.m37655b(r8)     // Catch: java.io.IOException -> L29
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
            kotlin.C10568o.m37655b(r8)
            androidx.datastore.core.e<c.l.b.i.d> r8 = r5.f32319g     // Catch: java.io.IOException -> L29
            com.google.firebase.sessions.m0.g$d r2 = new com.google.firebase.sessions.m0.g$d     // Catch: java.io.IOException -> L29
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch: java.io.IOException -> L29
            r0.f32326h = r3     // Catch: java.io.IOException -> L29
            java.lang.Object r6 = p024c.p064l.p065b.p066i.C0982g.m6263a(r8, r2, r0)     // Catch: java.io.IOException -> L29
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
            kotlin.u r6 = kotlin.C10775u.f41439a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SettingsCache.m26832h(c.l.b.i.d$a, java.lang.Object, kotlin.y.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final void m26833l(AbstractC0979d abstractC0979d) {
        this.f32320h = new SessionConfigs((Boolean) abstractC0979d.mo6238b(f32314b), (Double) abstractC0979d.mo6238b(f32315c), (Integer) abstractC0979d.mo6238b(f32316d), (Integer) abstractC0979d.mo6238b(f32317e), (Long) abstractC0979d.mo6238b(f32318f));
    }

    /* renamed from: d */
    public final boolean m26834d() {
        SessionConfigs sessionConfigs = this.f32320h;
        SessionConfigs sessionConfigs2 = null;
        if (sessionConfigs == null) {
            C9801m.m32363w("sessionConfigs");
            sessionConfigs = null;
        }
        Long cacheUpdatedTime = sessionConfigs.getCacheUpdatedTime();
        SessionConfigs sessionConfigs3 = this.f32320h;
        if (sessionConfigs3 == null) {
            C9801m.m32363w("sessionConfigs");
        } else {
            sessionConfigs2 = sessionConfigs3;
        }
        Integer cacheDuration = sessionConfigs2.getCacheDuration();
        return cacheUpdatedTime == null || cacheDuration == null || (System.currentTimeMillis() - cacheUpdatedTime.longValue()) / ((long) 1000) >= ((long) cacheDuration.intValue());
    }

    /* renamed from: e */
    public final Integer m26835e() {
        SessionConfigs sessionConfigs = this.f32320h;
        if (sessionConfigs == null) {
            C9801m.m32363w("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.getSessionRestartTimeout();
    }

    /* renamed from: f */
    public final Double m26836f() {
        SessionConfigs sessionConfigs = this.f32320h;
        if (sessionConfigs == null) {
            C9801m.m32363w("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.getSessionSamplingRate();
    }

    /* renamed from: g */
    public final Boolean m26837g() {
        SessionConfigs sessionConfigs = this.f32320h;
        if (sessionConfigs == null) {
            C9801m.m32363w("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.getSessionEnabled();
    }

    /* renamed from: i */
    public final Object m26838i(Double d2, Continuation<? super C10775u> continuation) throws Throwable {
        Object objM26832h = m26832h(f32315c, d2, continuation);
        return objM26832h == C10855d.m39045c() ? objM26832h : C10775u.f41439a;
    }

    /* renamed from: j */
    public final Object m26839j(Integer num, Continuation<? super C10775u> continuation) throws Throwable {
        Object objM26832h = m26832h(f32317e, num, continuation);
        return objM26832h == C10855d.m39045c() ? objM26832h : C10775u.f41439a;
    }

    /* renamed from: k */
    public final Object m26840k(Long l, Continuation<? super C10775u> continuation) throws Throwable {
        Object objM26832h = m26832h(f32318f, l, continuation);
        return objM26832h == C10855d.m39045c() ? objM26832h : C10775u.f41439a;
    }

    /* renamed from: m */
    public final Object m26841m(Integer num, Continuation<? super C10775u> continuation) throws Throwable {
        Object objM26832h = m26832h(f32316d, num, continuation);
        return objM26832h == C10855d.m39045c() ? objM26832h : C10775u.f41439a;
    }

    /* renamed from: n */
    public final Object m26842n(Boolean bool, Continuation<? super C10775u> continuation) throws Throwable {
        Object objM26832h = m26832h(f32314b, bool, continuation);
        return objM26832h == C10855d.m39045c() ? objM26832h : C10775u.f41439a;
    }
}
