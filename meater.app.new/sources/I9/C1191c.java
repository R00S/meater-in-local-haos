package I9;

import c9.C2347b;
import c9.InterfaceC2348c;
import c9.InterfaceC2349d;
import d9.InterfaceC3083a;
import d9.InterfaceC3084b;

/* compiled from: AutoSessionEventEncoder.java */
/* renamed from: I9.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1191c implements InterfaceC3083a {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC3083a f6815a = new C1191c();

    /* compiled from: AutoSessionEventEncoder.java */
    /* renamed from: I9.c$a */
    private static final class a implements InterfaceC2348c<AndroidApplicationInfo> {

        /* renamed from: a, reason: collision with root package name */
        static final a f6816a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f6817b = C2347b.d("packageName");

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f6818c = C2347b.d("versionName");

        /* renamed from: d, reason: collision with root package name */
        private static final C2347b f6819d = C2347b.d("appBuildVersion");

        /* renamed from: e, reason: collision with root package name */
        private static final C2347b f6820e = C2347b.d("deviceManufacturer");

        /* renamed from: f, reason: collision with root package name */
        private static final C2347b f6821f = C2347b.d("currentProcessDetails");

        /* renamed from: g, reason: collision with root package name */
        private static final C2347b f6822g = C2347b.d("appProcessDetails");

        private a() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AndroidApplicationInfo androidApplicationInfo, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f6817b, androidApplicationInfo.getPackageName());
            interfaceC2349d.a(f6818c, androidApplicationInfo.getVersionName());
            interfaceC2349d.a(f6819d, androidApplicationInfo.getAppBuildVersion());
            interfaceC2349d.a(f6820e, androidApplicationInfo.getDeviceManufacturer());
            interfaceC2349d.a(f6821f, androidApplicationInfo.getCurrentProcessDetails());
            interfaceC2349d.a(f6822g, androidApplicationInfo.b());
        }
    }

    /* compiled from: AutoSessionEventEncoder.java */
    /* renamed from: I9.c$b */
    private static final class b implements InterfaceC2348c<ApplicationInfo> {

        /* renamed from: a, reason: collision with root package name */
        static final b f6823a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f6824b = C2347b.d("appId");

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f6825c = C2347b.d("deviceModel");

        /* renamed from: d, reason: collision with root package name */
        private static final C2347b f6826d = C2347b.d("sessionSdkVersion");

        /* renamed from: e, reason: collision with root package name */
        private static final C2347b f6827e = C2347b.d("osVersion");

        /* renamed from: f, reason: collision with root package name */
        private static final C2347b f6828f = C2347b.d("logEnvironment");

        /* renamed from: g, reason: collision with root package name */
        private static final C2347b f6829g = C2347b.d("androidAppInfo");

        private b() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ApplicationInfo applicationInfo, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f6824b, applicationInfo.getAppId());
            interfaceC2349d.a(f6825c, applicationInfo.getDeviceModel());
            interfaceC2349d.a(f6826d, applicationInfo.getSessionSdkVersion());
            interfaceC2349d.a(f6827e, applicationInfo.getOsVersion());
            interfaceC2349d.a(f6828f, applicationInfo.getLogEnvironment());
            interfaceC2349d.a(f6829g, applicationInfo.getAndroidAppInfo());
        }
    }

    /* compiled from: AutoSessionEventEncoder.java */
    /* renamed from: I9.c$c, reason: collision with other inner class name */
    private static final class C0138c implements InterfaceC2348c<DataCollectionStatus> {

        /* renamed from: a, reason: collision with root package name */
        static final C0138c f6830a = new C0138c();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f6831b = C2347b.d("performance");

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f6832c = C2347b.d("crashlytics");

        /* renamed from: d, reason: collision with root package name */
        private static final C2347b f6833d = C2347b.d("sessionSamplingRate");

        private C0138c() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(DataCollectionStatus dataCollectionStatus, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f6831b, dataCollectionStatus.getPerformance());
            interfaceC2349d.a(f6832c, dataCollectionStatus.getCrashlytics());
            interfaceC2349d.g(f6833d, dataCollectionStatus.getSessionSamplingRate());
        }
    }

    /* compiled from: AutoSessionEventEncoder.java */
    /* renamed from: I9.c$d */
    private static final class d implements InterfaceC2348c<ProcessDetails> {

        /* renamed from: a, reason: collision with root package name */
        static final d f6834a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f6835b = C2347b.d("processName");

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f6836c = C2347b.d("pid");

        /* renamed from: d, reason: collision with root package name */
        private static final C2347b f6837d = C2347b.d("importance");

        /* renamed from: e, reason: collision with root package name */
        private static final C2347b f6838e = C2347b.d("defaultProcess");

        private d() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(ProcessDetails processDetails, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f6835b, processDetails.getProcessName());
            interfaceC2349d.f(f6836c, processDetails.getPid());
            interfaceC2349d.f(f6837d, processDetails.getImportance());
            interfaceC2349d.d(f6838e, processDetails.getIsDefaultProcess());
        }
    }

    /* compiled from: AutoSessionEventEncoder.java */
    /* renamed from: I9.c$e */
    private static final class e implements InterfaceC2348c<SessionEvent> {

        /* renamed from: a, reason: collision with root package name */
        static final e f6839a = new e();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f6840b = C2347b.d("eventType");

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f6841c = C2347b.d("sessionData");

        /* renamed from: d, reason: collision with root package name */
        private static final C2347b f6842d = C2347b.d("applicationInfo");

        private e() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(SessionEvent sessionEvent, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f6840b, sessionEvent.getEventType());
            interfaceC2349d.a(f6841c, sessionEvent.getSessionData());
            interfaceC2349d.a(f6842d, sessionEvent.getApplicationInfo());
        }
    }

    /* compiled from: AutoSessionEventEncoder.java */
    /* renamed from: I9.c$f */
    private static final class f implements InterfaceC2348c<SessionInfo> {

        /* renamed from: a, reason: collision with root package name */
        static final f f6843a = new f();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f6844b = C2347b.d("sessionId");

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f6845c = C2347b.d("firstSessionId");

        /* renamed from: d, reason: collision with root package name */
        private static final C2347b f6846d = C2347b.d("sessionIndex");

        /* renamed from: e, reason: collision with root package name */
        private static final C2347b f6847e = C2347b.d("eventTimestampUs");

        /* renamed from: f, reason: collision with root package name */
        private static final C2347b f6848f = C2347b.d("dataCollectionStatus");

        /* renamed from: g, reason: collision with root package name */
        private static final C2347b f6849g = C2347b.d("firebaseInstallationId");

        /* renamed from: h, reason: collision with root package name */
        private static final C2347b f6850h = C2347b.d("firebaseAuthenticationToken");

        private f() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(SessionInfo sessionInfo, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f6844b, sessionInfo.getSessionId());
            interfaceC2349d.a(f6845c, sessionInfo.getFirstSessionId());
            interfaceC2349d.f(f6846d, sessionInfo.getSessionIndex());
            interfaceC2349d.e(f6847e, sessionInfo.getEventTimestampUs());
            interfaceC2349d.a(f6848f, sessionInfo.getDataCollectionStatus());
            interfaceC2349d.a(f6849g, sessionInfo.getFirebaseInstallationId());
            interfaceC2349d.a(f6850h, sessionInfo.getFirebaseAuthenticationToken());
        }
    }

    private C1191c() {
    }

    @Override // d9.InterfaceC3083a
    public void a(InterfaceC3084b<?> interfaceC3084b) {
        interfaceC3084b.a(SessionEvent.class, e.f6839a);
        interfaceC3084b.a(SessionInfo.class, f.f6843a);
        interfaceC3084b.a(DataCollectionStatus.class, C0138c.f6830a);
        interfaceC3084b.a(ApplicationInfo.class, b.f6823a);
        interfaceC3084b.a(AndroidApplicationInfo.class, a.f6816a);
        interfaceC3084b.a(ProcessDetails.class, d.f6834a);
    }
}
