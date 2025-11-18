package com.google.firebase.sessions.settings;

import android.content.Context;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.InterfaceC0340e;
import androidx.datastore.core.p006o.C0351b;
import com.google.firebase.C8405j;
import com.google.firebase.C8411l;
import com.google.firebase.Firebase;
import com.google.firebase.installations.InterfaceC8385i;
import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.ProcessDetailsProvider;
import com.google.firebase.sessions.SessionDataStoreConfigs;
import com.google.firebase.sessions.SessionEvents;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.p442j.internal.ContinuationImpl;
import kotlin.coroutines.p442j.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9778a0;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9790g0;
import kotlin.jvm.internal.C9801m;
import kotlin.jvm.internal.Lambda;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlin.time.C10553c;
import kotlin.time.Duration;
import kotlin.time.DurationUnit;
import okhttp3.HttpUrl;
import p024c.p064l.p065b.C0968a;
import p024c.p064l.p065b.p066i.AbstractC0979d;
import p024c.p064l.p065b.p066i.C0980e;

/* compiled from: SessionsSettings.kt */
@Metadata(m32266d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B/\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bB'\b\u0016\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u000eB\u0015\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001d\u0010 \u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0011\u0010#\u001a\u00020$H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010%R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00188Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, m32267d2 = {"Lcom/google/firebase/sessions/settings/SessionsSettings;", HttpUrl.FRAGMENT_ENCODE_SET, "context", "Landroid/content/Context;", "blockingDispatcher", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "firebaseInstallationsApi", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "appInfo", "Lcom/google/firebase/sessions/ApplicationInfo;", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/google/firebase/installations/FirebaseInstallationsApi;Lcom/google/firebase/sessions/ApplicationInfo;)V", "firebaseApp", "Lcom/google/firebase/FirebaseApp;", "(Lcom/google/firebase/FirebaseApp;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/google/firebase/installations/FirebaseInstallationsApi;)V", "localOverrideSettings", "Lcom/google/firebase/sessions/settings/SettingsProvider;", "remoteSettings", "(Lcom/google/firebase/sessions/settings/SettingsProvider;Lcom/google/firebase/sessions/settings/SettingsProvider;)V", "samplingRate", HttpUrl.FRAGMENT_ENCODE_SET, "getSamplingRate", "()D", "sessionRestartTimeout", "Lkotlin/time/Duration;", "getSessionRestartTimeout-UwyO8pc", "()J", "sessionsEnabled", HttpUrl.FRAGMENT_ENCODE_SET, "getSessionsEnabled", "()Z", "isValidSamplingRate", "isValidSessionRestartTimeout", "isValidSessionRestartTimeout-LRDsOJo", "(J)Z", "updateSettings", HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: com.google.firebase.sessions.m0.f, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class SessionsSettings {

    /* renamed from: a */
    public static final b f32303a = new b(null);

    /* renamed from: b */
    private static final ReadOnlyProperty<Context, InterfaceC0340e<AbstractC0979d>> f32304b = C0968a.m6179b(SessionDataStoreConfigs.f32356a.m26863b(), new C0351b(a.f32307f), null, null, 12, null);

    /* renamed from: c */
    private final SettingsProvider f32305c;

    /* renamed from: d */
    private final SettingsProvider f32306d;

    /* compiled from: SessionsSettings.kt */
    @Metadata(m32266d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m32267d2 = {"<anonymous>", "Landroidx/datastore/preferences/core/Preferences;", "ex", "Landroidx/datastore/core/CorruptionException;", "invoke"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.google.firebase.sessions.m0.f$a */
    static final class a extends Lambda implements Function1<CorruptionException, AbstractC0979d> {

        /* renamed from: f */
        public static final a f32307f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC0979d invoke(CorruptionException corruptionException) {
            C9801m.m32346f(corruptionException, "ex");
            Log.w("SessionsSettings", "CorruptionException in settings DataStore in " + ProcessDetailsProvider.f32355a.m26861e() + '.', corruptionException);
            return C0980e.m6254a();
        }
    }

    /* compiled from: SessionsSettings.kt */
    @Metadata(m32266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR%\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m32267d2 = {"Lcom/google/firebase/sessions/settings/SessionsSettings$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "TAG", HttpUrl.FRAGMENT_ENCODE_SET, "instance", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "getInstance", "()Lcom/google/firebase/sessions/settings/SessionsSettings;", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "Landroid/content/Context;", "getDataStore", "(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", "dataStore$delegate", "Lkotlin/properties/ReadOnlyProperty;", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.google.firebase.sessions.m0.f$b */
    public static final class b {

        /* renamed from: a */
        static final /* synthetic */ KProperty<Object>[] f32308a = {C9790g0.m32305i(new C9778a0(b.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        private b() {
        }

        public /* synthetic */ b(C9789g c9789g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final InterfaceC0340e<AbstractC0979d> m26827b(Context context) {
            return (InterfaceC0340e) SessionsSettings.f32304b.mo6183a(context, f32308a[0]);
        }

        /* renamed from: c */
        public final SessionsSettings m26828c() {
            Object objM26403h = C8411l.m26421a(Firebase.f31704a).m26403h(SessionsSettings.class);
            C9801m.m32345e(objM26403h, "Firebase.app[SessionsSettings::class.java]");
            return (SessionsSettings) objM26403h;
        }
    }

    /* compiled from: SessionsSettings.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    @DebugMetadata(m39049c = "com.google.firebase.sessions.settings.SessionsSettings", m39050f = "SessionsSettings.kt", m39051l = {138, 139}, m39052m = "updateSettings")
    /* renamed from: com.google.firebase.sessions.m0.f$c */
    static final class c extends ContinuationImpl {

        /* renamed from: f */
        Object f32309f;

        /* renamed from: g */
        /* synthetic */ Object f32310g;

        /* renamed from: i */
        int f32312i;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f32310g = obj;
            this.f32312i |= Integer.MIN_VALUE;
            return SessionsSettings.this.m26824g(this);
        }
    }

    public SessionsSettings(SettingsProvider settingsProvider, SettingsProvider settingsProvider2) {
        C9801m.m32346f(settingsProvider, "localOverrideSettings");
        C9801m.m32346f(settingsProvider2, "remoteSettings");
        this.f32305c = settingsProvider;
        this.f32306d = settingsProvider2;
    }

    /* renamed from: e */
    private final boolean m26819e(double d2) {
        return 0.0d <= d2 && d2 <= 1.0d;
    }

    /* renamed from: f */
    private final boolean m26820f(long j2) {
        return Duration.m37612T(j2) && Duration.m37607O(j2);
    }

    /* renamed from: b */
    public final double m26821b() {
        Double dMo26805c = this.f32305c.mo26805c();
        if (dMo26805c != null) {
            double dDoubleValue = dMo26805c.doubleValue();
            if (m26819e(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        Double dMo26805c2 = this.f32306d.mo26805c();
        if (dMo26805c2 == null) {
            return 1.0d;
        }
        double dDoubleValue2 = dMo26805c2.doubleValue();
        if (m26819e(dDoubleValue2)) {
            return dDoubleValue2;
        }
        return 1.0d;
    }

    /* renamed from: c */
    public final long m26822c() {
        Duration durationMo26804b = this.f32305c.mo26804b();
        if (durationMo26804b != null) {
            long f40696j = durationMo26804b.getF40696j();
            if (m26820f(f40696j)) {
                return f40696j;
            }
        }
        Duration durationMo26804b2 = this.f32306d.mo26804b();
        if (durationMo26804b2 != null) {
            long f40696j2 = durationMo26804b2.getF40696j();
            if (m26820f(f40696j2)) {
                return f40696j2;
            }
        }
        Duration.a aVar = Duration.f40692f;
        return C10553c.m37632h(30, DurationUnit.MINUTES);
    }

    /* renamed from: d */
    public final boolean m26823d() {
        Boolean boolMo26803a = this.f32305c.mo26803a();
        if (boolMo26803a != null) {
            return boolMo26803a.booleanValue();
        }
        Boolean boolMo26803a2 = this.f32306d.mo26803a();
        if (boolMo26803a2 != null) {
            return boolMo26803a2.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m26824g(kotlin.coroutines.Continuation<? super kotlin.C10775u> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.firebase.sessions.settings.SessionsSettings.c
            if (r0 == 0) goto L13
            r0 = r6
            com.google.firebase.sessions.m0.f$c r0 = (com.google.firebase.sessions.settings.SessionsSettings.c) r0
            int r1 = r0.f32312i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32312i = r1
            goto L18
        L13:
            com.google.firebase.sessions.m0.f$c r0 = new com.google.firebase.sessions.m0.f$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f32310g
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C10853b.m39042c()
            int r2 = r0.f32312i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.C10568o.m37655b(r6)
            goto L5b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f32309f
            com.google.firebase.sessions.m0.f r2 = (com.google.firebase.sessions.settings.SessionsSettings) r2
            kotlin.C10568o.m37655b(r6)
            goto L4d
        L3c:
            kotlin.C10568o.m37655b(r6)
            com.google.firebase.sessions.m0.h r6 = r5.f32305c
            r0.f32309f = r5
            r0.f32312i = r4
            java.lang.Object r6 = r6.mo26806d(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r2 = r5
        L4d:
            com.google.firebase.sessions.m0.h r6 = r2.f32306d
            r2 = 0
            r0.f32309f = r2
            r0.f32312i = r3
            java.lang.Object r6 = r6.mo26806d(r0)
            if (r6 != r1) goto L5b
            return r1
        L5b:
            kotlin.u r6 = kotlin.C10775u.f41439a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SessionsSettings.m26824g(kotlin.y.d):java.lang.Object");
    }

    private SessionsSettings(Context context, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, InterfaceC8385i interfaceC8385i, ApplicationInfo applicationInfo) {
        this(new LocalOverrideSettings(context), new RemoteSettings(coroutineContext2, interfaceC8385i, applicationInfo, new RemoteSettingsFetcher(applicationInfo, coroutineContext, null, 4, null), f32303a.m26827b(context)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SessionsSettings(C8405j c8405j, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, InterfaceC8385i interfaceC8385i) {
        C9801m.m32346f(c8405j, "firebaseApp");
        C9801m.m32346f(coroutineContext, "blockingDispatcher");
        C9801m.m32346f(coroutineContext2, "backgroundDispatcher");
        C9801m.m32346f(interfaceC8385i, "firebaseInstallationsApi");
        Context contextM26404i = c8405j.m26404i();
        C9801m.m32345e(contextM26404i, "firebaseApp.applicationContext");
        this(contextM26404i, coroutineContext, coroutineContext2, interfaceC8385i, SessionEvents.f32124a.m26725b(c8405j));
    }
}
