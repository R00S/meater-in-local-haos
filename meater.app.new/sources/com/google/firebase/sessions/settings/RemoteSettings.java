package com.google.firebase.sessions.settings;

import android.util.Log;
import androidx.datastore.core.InterfaceC0340e;
import com.google.firebase.installations.InterfaceC8385i;
import com.google.firebase.sessions.ApplicationInfo;
import kotlin.C10568o;
import kotlin.C10775u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C10855d;
import kotlin.coroutines.p442j.internal.ContinuationImpl;
import kotlin.coroutines.p442j.internal.DebugMetadata;
import kotlin.coroutines.p442j.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.text.Regex;
import kotlin.time.C10553c;
import kotlin.time.Duration;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.sync.C10935d;
import kotlinx.coroutines.sync.Mutex;
import okhttp3.HttpUrl;
import org.json.JSONObject;
import p024c.p064l.p065b.p066i.AbstractC0979d;

/* compiled from: RemoteSettings.kt */
@Metadata(m32266d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001'B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\rJ\r\u0010\u001e\u001a\u00020\u001fH\u0001¢\u0006\u0002\b J\b\u0010!\u001a\u00020\u0015H\u0016J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0002J\u0011\u0010%\u001a\u00020\u001fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010&R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, m32267d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettings;", "Lcom/google/firebase/sessions/settings/SettingsProvider;", "backgroundDispatcher", "Lkotlin/coroutines/CoroutineContext;", "firebaseInstallationsApi", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "appInfo", "Lcom/google/firebase/sessions/ApplicationInfo;", "configsFetcher", "Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "(Lkotlin/coroutines/CoroutineContext;Lcom/google/firebase/installations/FirebaseInstallationsApi;Lcom/google/firebase/sessions/ApplicationInfo;Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;Landroidx/datastore/core/DataStore;)V", "fetchInProgress", "Lkotlinx/coroutines/sync/Mutex;", "samplingRate", HttpUrl.FRAGMENT_ENCODE_SET, "getSamplingRate", "()Ljava/lang/Double;", "sessionEnabled", HttpUrl.FRAGMENT_ENCODE_SET, "getSessionEnabled", "()Ljava/lang/Boolean;", "sessionRestartTimeout", "Lkotlin/time/Duration;", "getSessionRestartTimeout-FghU774", "()Lkotlin/time/Duration;", "settingsCache", "Lcom/google/firebase/sessions/settings/SettingsCache;", "clearCachedSettings", HttpUrl.FRAGMENT_ENCODE_SET, "clearCachedSettings$com_google_firebase_firebase_sessions", "isSettingsStale", "removeForwardSlashesIn", HttpUrl.FRAGMENT_ENCODE_SET, "s", "updateSettings", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: com.google.firebase.sessions.m0.c, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class RemoteSettings implements SettingsProvider {

    /* renamed from: a */
    private static final a f32270a = new a(null);

    /* renamed from: b */
    private final CoroutineContext f32271b;

    /* renamed from: c */
    private final InterfaceC8385i f32272c;

    /* renamed from: d */
    private final ApplicationInfo f32273d;

    /* renamed from: e */
    private final CrashlyticsSettingsFetcher f32274e;

    /* renamed from: f */
    private final SettingsCache f32275f;

    /* renamed from: g */
    private final Mutex f32276g;

    /* compiled from: RemoteSettings.kt */
    @Metadata(m32266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m32267d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettings$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "FORWARD_SLASH_STRING", HttpUrl.FRAGMENT_ENCODE_SET, "TAG", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.google.firebase.sessions.m0.c$a */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }
    }

    /* compiled from: RemoteSettings.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    @DebugMetadata(m39049c = "com.google.firebase.sessions.settings.RemoteSettings", m39050f = "RemoteSettings.kt", m39051l = {170, 76, 94}, m39052m = "updateSettings")
    /* renamed from: com.google.firebase.sessions.m0.c$b */
    static final class b extends ContinuationImpl {

        /* renamed from: f */
        Object f32277f;

        /* renamed from: g */
        Object f32278g;

        /* renamed from: h */
        /* synthetic */ Object f32279h;

        /* renamed from: j */
        int f32281j;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f32279h = obj;
            this.f32281j |= Integer.MIN_VALUE;
            return RemoteSettings.this.mo26806d(this);
        }
    }

    /* compiled from: RemoteSettings.kt */
    @Metadata(m32266d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "it", "Lorg/json/JSONObject;"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    @DebugMetadata(m39049c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", m39050f = "RemoteSettings.kt", m39051l = {125, 128, 131, 133, 134, 136}, m39052m = "invokeSuspend")
    /* renamed from: com.google.firebase.sessions.m0.c$c */
    static final class c extends SuspendLambda implements Function2<JSONObject, Continuation<? super C10775u>, Object> {

        /* renamed from: f */
        Object f32282f;

        /* renamed from: g */
        Object f32283g;

        /* renamed from: h */
        int f32284h;

        /* renamed from: i */
        /* synthetic */ Object f32285i;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Continuation<C10775u> create(Object obj, Continuation<?> continuation) {
            c cVar = RemoteSettings.this.new c(continuation);
            cVar.f32285i = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(JSONObject jSONObject, Continuation<? super C10775u> continuation) {
            return ((c) create(jSONObject, continuation)).invokeSuspend(C10775u.f41439a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0142  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0162  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x0165  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x019f A[RETURN] */
        /* JADX WARN: Type inference failed for: r13v12, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Double] */
        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 438
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.RemoteSettings.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: RemoteSettings.kt */
    @Metadata(m32266d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "msg", HttpUrl.FRAGMENT_ENCODE_SET}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    @DebugMetadata(m39049c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", m39050f = "RemoteSettings.kt", m39051l = {}, m39052m = "invokeSuspend")
    /* renamed from: com.google.firebase.sessions.m0.c$d */
    static final class d extends SuspendLambda implements Function2<String, Continuation<? super C10775u>, Object> {

        /* renamed from: f */
        int f32287f;

        /* renamed from: g */
        /* synthetic */ Object f32288g;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Continuation<C10775u> create(Object obj, Continuation<?> continuation) {
            d dVar = new d(continuation);
            dVar.f32288g = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, Continuation<? super C10775u> continuation) {
            return ((d) create(str, continuation)).invokeSuspend(C10775u.f41439a);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C10855d.m39045c();
            if (this.f32287f != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C10568o.m37655b(obj);
            Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f32288g));
            return C10775u.f41439a;
        }
    }

    public RemoteSettings(CoroutineContext coroutineContext, InterfaceC8385i interfaceC8385i, ApplicationInfo applicationInfo, CrashlyticsSettingsFetcher crashlyticsSettingsFetcher, InterfaceC0340e<AbstractC0979d> interfaceC0340e) {
        C9801m.m32346f(coroutineContext, "backgroundDispatcher");
        C9801m.m32346f(interfaceC8385i, "firebaseInstallationsApi");
        C9801m.m32346f(applicationInfo, "appInfo");
        C9801m.m32346f(crashlyticsSettingsFetcher, "configsFetcher");
        C9801m.m32346f(interfaceC0340e, "dataStore");
        this.f32271b = coroutineContext;
        this.f32272c = interfaceC8385i;
        this.f32273d = applicationInfo;
        this.f32274e = crashlyticsSettingsFetcher;
        this.f32275f = new SettingsCache(interfaceC0340e);
        this.f32276g = C10935d.m39290b(false, 1, null);
    }

    /* renamed from: f */
    private final String m26808f(String str) {
        return new Regex("/").m37439c(str, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    /* renamed from: a */
    public Boolean mo26803a() {
        return this.f32275f.m26837g();
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    /* renamed from: b */
    public Duration mo26804b() {
        Integer numM26835e = this.f32275f.m26835e();
        if (numM26835e == null) {
            return null;
        }
        Duration.a aVar = Duration.f40692f;
        return Duration.m37617k(C10553c.m37632h(numM26835e.intValue(), DurationUnit.SECONDS));
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    /* renamed from: c */
    public Double mo26805c() {
        return this.f32275f.m26836f();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x004e, B:44:0x00b4, B:46:0x00b8, B:50:0x00c4, B:36:0x0089, B:38:0x0091, B:41:0x009c), top: B:59:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    @Override // com.google.firebase.sessions.settings.SettingsProvider
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo26806d(kotlin.coroutines.Continuation<? super kotlin.C10775u> r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.RemoteSettings.mo26806d(kotlin.y.d):java.lang.Object");
    }
}
