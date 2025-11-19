package T8;

import T8.F;
import c9.C2347b;
import c9.InterfaceC2348c;
import c9.InterfaceC2349d;
import d9.InterfaceC3083a;
import d9.InterfaceC3084b;

/* compiled from: AutoCrashlyticsReportEncoder.java */
/* renamed from: T8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1714a implements InterfaceC3083a {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC3083a f16260a = new C1714a();

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: T8.a$a, reason: collision with other inner class name */
    private static final class C0253a implements InterfaceC2348c<F.a.AbstractC0235a> {

        /* renamed from: a, reason: collision with root package name */
        static final C0253a f16261a = new C0253a();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f16262b = C2347b.d("arch");

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f16263c = C2347b.d("libraryName");

        /* renamed from: d, reason: collision with root package name */
        private static final C2347b f16264d = C2347b.d("buildId");

        private C0253a() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.a.AbstractC0235a abstractC0235a, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f16262b, abstractC0235a.b());
            interfaceC2349d.a(f16263c, abstractC0235a.d());
            interfaceC2349d.a(f16264d, abstractC0235a.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: T8.a$b */
    private static final class b implements InterfaceC2348c<F.a> {

        /* renamed from: a, reason: collision with root package name */
        static final b f16265a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f16266b = C2347b.d("pid");

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f16267c = C2347b.d("processName");

        /* renamed from: d, reason: collision with root package name */
        private static final C2347b f16268d = C2347b.d("reasonCode");

        /* renamed from: e, reason: collision with root package name */
        private static final C2347b f16269e = C2347b.d("importance");

        /* renamed from: f, reason: collision with root package name */
        private static final C2347b f16270f = C2347b.d("pss");

        /* renamed from: g, reason: collision with root package name */
        private static final C2347b f16271g = C2347b.d("rss");

        /* renamed from: h, reason: collision with root package name */
        private static final C2347b f16272h = C2347b.d("timestamp");

        /* renamed from: i, reason: collision with root package name */
        private static final C2347b f16273i = C2347b.d("traceFile");

        /* renamed from: j, reason: collision with root package name */
        private static final C2347b f16274j = C2347b.d("buildIdMappingForArch");

        private b() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.a aVar, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.f(f16266b, aVar.d());
            interfaceC2349d.a(f16267c, aVar.e());
            interfaceC2349d.f(f16268d, aVar.g());
            interfaceC2349d.f(f16269e, aVar.c());
            interfaceC2349d.e(f16270f, aVar.f());
            interfaceC2349d.e(f16271g, aVar.h());
            interfaceC2349d.e(f16272h, aVar.i());
            interfaceC2349d.a(f16273i, aVar.j());
            interfaceC2349d.a(f16274j, aVar.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: T8.a$c */
    private static final class c implements InterfaceC2348c<F.c> {

        /* renamed from: a, reason: collision with root package name */
        static final c f16275a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f16276b = C2347b.d("key");

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f16277c = C2347b.d("value");

        private c() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.c cVar, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f16276b, cVar.b());
            interfaceC2349d.a(f16277c, cVar.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: T8.a$d */
    private static final class d implements InterfaceC2348c<F> {

        /* renamed from: a, reason: collision with root package name */
        static final d f16278a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f16279b = C2347b.d("sdkVersion");

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f16280c = C2347b.d("gmpAppId");

        /* renamed from: d, reason: collision with root package name */
        private static final C2347b f16281d = C2347b.d("platform");

        /* renamed from: e, reason: collision with root package name */
        private static final C2347b f16282e = C2347b.d("installationUuid");

        /* renamed from: f, reason: collision with root package name */
        private static final C2347b f16283f = C2347b.d("firebaseInstallationId");

        /* renamed from: g, reason: collision with root package name */
        private static final C2347b f16284g = C2347b.d("firebaseAuthenticationToken");

        /* renamed from: h, reason: collision with root package name */
        private static final C2347b f16285h = C2347b.d("appQualitySessionId");

        /* renamed from: i, reason: collision with root package name */
        private static final C2347b f16286i = C2347b.d("buildVersion");

        /* renamed from: j, reason: collision with root package name */
        private static final C2347b f16287j = C2347b.d("displayVersion");

        /* renamed from: k, reason: collision with root package name */
        private static final C2347b f16288k = C2347b.d("session");

        /* renamed from: l, reason: collision with root package name */
        private static final C2347b f16289l = C2347b.d("ndkPayload");

        /* renamed from: m, reason: collision with root package name */
        private static final C2347b f16290m = C2347b.d("appExitInfo");

        private d() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F f10, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f16279b, f10.m());
            interfaceC2349d.a(f16280c, f10.i());
            interfaceC2349d.f(f16281d, f10.l());
            interfaceC2349d.a(f16282e, f10.j());
            interfaceC2349d.a(f16283f, f10.h());
            interfaceC2349d.a(f16284g, f10.g());
            interfaceC2349d.a(f16285h, f10.d());
            interfaceC2349d.a(f16286i, f10.e());
            interfaceC2349d.a(f16287j, f10.f());
            interfaceC2349d.a(f16288k, f10.n());
            interfaceC2349d.a(f16289l, f10.k());
            interfaceC2349d.a(f16290m, f10.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: T8.a$e */
    private static final class e implements InterfaceC2348c<F.d> {

        /* renamed from: a, reason: collision with root package name */
        static final e f16291a = new e();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f16292b = C2347b.d("files");

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f16293c = C2347b.d("orgId");

        private e() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.d dVar, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f16292b, dVar.b());
            interfaceC2349d.a(f16293c, dVar.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: T8.a$f */
    private static final class f implements InterfaceC2348c<F.d.b> {

        /* renamed from: a, reason: collision with root package name */
        static final f f16294a = new f();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f16295b = C2347b.d("filename");

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f16296c = C2347b.d("contents");

        private f() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.d.b bVar, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f16295b, bVar.c());
            interfaceC2349d.a(f16296c, bVar.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: T8.a$g */
    private static final class g implements InterfaceC2348c<F.e.a> {

        /* renamed from: a, reason: collision with root package name */
        static final g f16297a = new g();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f16298b = C2347b.d("identifier");

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f16299c = C2347b.d("version");

        /* renamed from: d, reason: collision with root package name */
        private static final C2347b f16300d = C2347b.d("displayVersion");

        /* renamed from: e, reason: collision with root package name */
        private static final C2347b f16301e = C2347b.d("organization");

        /* renamed from: f, reason: collision with root package name */
        private static final C2347b f16302f = C2347b.d("installationUuid");

        /* renamed from: g, reason: collision with root package name */
        private static final C2347b f16303g = C2347b.d("developmentPlatform");

        /* renamed from: h, reason: collision with root package name */
        private static final C2347b f16304h = C2347b.d("developmentPlatformVersion");

        private g() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.a aVar, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f16298b, aVar.e());
            interfaceC2349d.a(f16299c, aVar.h());
            interfaceC2349d.a(f16300d, aVar.d());
            interfaceC2349d.a(f16301e, aVar.g());
            interfaceC2349d.a(f16302f, aVar.f());
            interfaceC2349d.a(f16303g, aVar.b());
            interfaceC2349d.a(f16304h, aVar.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: T8.a$h */
    private static final class h implements InterfaceC2348c<F.e.a.b> {

        /* renamed from: a, reason: collision with root package name */
        static final h f16305a = new h();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f16306b = C2347b.d("clsId");

        private h() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.a.b bVar, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f16306b, bVar.a());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: T8.a$i */
    private static final class i implements InterfaceC2348c<F.e.c> {

        /* renamed from: a, reason: collision with root package name */
        static final i f16307a = new i();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f16308b = C2347b.d("arch");

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f16309c = C2347b.d("model");

        /* renamed from: d, reason: collision with root package name */
        private static final C2347b f16310d = C2347b.d("cores");

        /* renamed from: e, reason: collision with root package name */
        private static final C2347b f16311e = C2347b.d("ram");

        /* renamed from: f, reason: collision with root package name */
        private static final C2347b f16312f = C2347b.d("diskSpace");

        /* renamed from: g, reason: collision with root package name */
        private static final C2347b f16313g = C2347b.d("simulator");

        /* renamed from: h, reason: collision with root package name */
        private static final C2347b f16314h = C2347b.d("state");

        /* renamed from: i, reason: collision with root package name */
        private static final C2347b f16315i = C2347b.d("manufacturer");

        /* renamed from: j, reason: collision with root package name */
        private static final C2347b f16316j = C2347b.d("modelClass");

        private i() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.c cVar, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.f(f16308b, cVar.b());
            interfaceC2349d.a(f16309c, cVar.f());
            interfaceC2349d.f(f16310d, cVar.c());
            interfaceC2349d.e(f16311e, cVar.h());
            interfaceC2349d.e(f16312f, cVar.d());
            interfaceC2349d.d(f16313g, cVar.j());
            interfaceC2349d.f(f16314h, cVar.i());
            interfaceC2349d.a(f16315i, cVar.e());
            interfaceC2349d.a(f16316j, cVar.g());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: T8.a$j */
    private static final class j implements InterfaceC2348c<F.e> {

        /* renamed from: a, reason: collision with root package name */
        static final j f16317a = new j();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f16318b = C2347b.d("generator");

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f16319c = C2347b.d("identifier");

        /* renamed from: d, reason: collision with root package name */
        private static final C2347b f16320d = C2347b.d("appQualitySessionId");

        /* renamed from: e, reason: collision with root package name */
        private static final C2347b f16321e = C2347b.d("startedAt");

        /* renamed from: f, reason: collision with root package name */
        private static final C2347b f16322f = C2347b.d("endedAt");

        /* renamed from: g, reason: collision with root package name */
        private static final C2347b f16323g = C2347b.d("crashed");

        /* renamed from: h, reason: collision with root package name */
        private static final C2347b f16324h = C2347b.d("app");

        /* renamed from: i, reason: collision with root package name */
        private static final C2347b f16325i = C2347b.d("user");

        /* renamed from: j, reason: collision with root package name */
        private static final C2347b f16326j = C2347b.d("os");

        /* renamed from: k, reason: collision with root package name */
        private static final C2347b f16327k = C2347b.d("device");

        /* renamed from: l, reason: collision with root package name */
        private static final C2347b f16328l = C2347b.d("events");

        /* renamed from: m, reason: collision with root package name */
        private static final C2347b f16329m = C2347b.d("generatorType");

        private j() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e eVar, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f16318b, eVar.g());
            interfaceC2349d.a(f16319c, eVar.j());
            interfaceC2349d.a(f16320d, eVar.c());
            interfaceC2349d.e(f16321e, eVar.l());
            interfaceC2349d.a(f16322f, eVar.e());
            interfaceC2349d.d(f16323g, eVar.n());
            interfaceC2349d.a(f16324h, eVar.b());
            interfaceC2349d.a(f16325i, eVar.m());
            interfaceC2349d.a(f16326j, eVar.k());
            interfaceC2349d.a(f16327k, eVar.d());
            interfaceC2349d.a(f16328l, eVar.f());
            interfaceC2349d.f(f16329m, eVar.h());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: T8.a$k */
    private static final class k implements InterfaceC2348c<F.e.d.a> {

        /* renamed from: a, reason: collision with root package name */
        static final k f16330a = new k();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f16331b = C2347b.d("execution");

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f16332c = C2347b.d("customAttributes");

        /* renamed from: d, reason: collision with root package name */
        private static final C2347b f16333d = C2347b.d("internalKeys");

        /* renamed from: e, reason: collision with root package name */
        private static final C2347b f16334e = C2347b.d("background");

        /* renamed from: f, reason: collision with root package name */
        private static final C2347b f16335f = C2347b.d("currentProcessDetails");

        /* renamed from: g, reason: collision with root package name */
        private static final C2347b f16336g = C2347b.d("appProcessDetails");

        /* renamed from: h, reason: collision with root package name */
        private static final C2347b f16337h = C2347b.d("uiOrientation");

        private k() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a aVar, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f16331b, aVar.f());
            interfaceC2349d.a(f16332c, aVar.e());
            interfaceC2349d.a(f16333d, aVar.g());
            interfaceC2349d.a(f16334e, aVar.c());
            interfaceC2349d.a(f16335f, aVar.d());
            interfaceC2349d.a(f16336g, aVar.b());
            interfaceC2349d.f(f16337h, aVar.h());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: T8.a$l */
    private static final class l implements InterfaceC2348c<F.e.d.a.b.AbstractC0239a> {

        /* renamed from: a, reason: collision with root package name */
        static final l f16338a = new l();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f16339b = C2347b.d("baseAddress");

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f16340c = C2347b.d("size");

        /* renamed from: d, reason: collision with root package name */
        private static final C2347b f16341d = C2347b.d("name");

        /* renamed from: e, reason: collision with root package name */
        private static final C2347b f16342e = C2347b.d("uuid");

        private l() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.b.AbstractC0239a abstractC0239a, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.e(f16339b, abstractC0239a.b());
            interfaceC2349d.e(f16340c, abstractC0239a.d());
            interfaceC2349d.a(f16341d, abstractC0239a.c());
            interfaceC2349d.a(f16342e, abstractC0239a.f());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: T8.a$m */
    private static final class m implements InterfaceC2348c<F.e.d.a.b> {

        /* renamed from: a, reason: collision with root package name */
        static final m f16343a = new m();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f16344b = C2347b.d("threads");

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f16345c = C2347b.d("exception");

        /* renamed from: d, reason: collision with root package name */
        private static final C2347b f16346d = C2347b.d("appExitInfo");

        /* renamed from: e, reason: collision with root package name */
        private static final C2347b f16347e = C2347b.d("signal");

        /* renamed from: f, reason: collision with root package name */
        private static final C2347b f16348f = C2347b.d("binaries");

        private m() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.b bVar, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f16344b, bVar.f());
            interfaceC2349d.a(f16345c, bVar.d());
            interfaceC2349d.a(f16346d, bVar.b());
            interfaceC2349d.a(f16347e, bVar.e());
            interfaceC2349d.a(f16348f, bVar.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: T8.a$n */
    private static final class n implements InterfaceC2348c<F.e.d.a.b.c> {

        /* renamed from: a, reason: collision with root package name */
        static final n f16349a = new n();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f16350b = C2347b.d("type");

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f16351c = C2347b.d("reason");

        /* renamed from: d, reason: collision with root package name */
        private static final C2347b f16352d = C2347b.d("frames");

        /* renamed from: e, reason: collision with root package name */
        private static final C2347b f16353e = C2347b.d("causedBy");

        /* renamed from: f, reason: collision with root package name */
        private static final C2347b f16354f = C2347b.d("overflowCount");

        private n() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.b.c cVar, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f16350b, cVar.f());
            interfaceC2349d.a(f16351c, cVar.e());
            interfaceC2349d.a(f16352d, cVar.c());
            interfaceC2349d.a(f16353e, cVar.b());
            interfaceC2349d.f(f16354f, cVar.d());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: T8.a$o */
    private static final class o implements InterfaceC2348c<F.e.d.a.b.AbstractC0243d> {

        /* renamed from: a, reason: collision with root package name */
        static final o f16355a = new o();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f16356b = C2347b.d("name");

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f16357c = C2347b.d("code");

        /* renamed from: d, reason: collision with root package name */
        private static final C2347b f16358d = C2347b.d("address");

        private o() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.b.AbstractC0243d abstractC0243d, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f16356b, abstractC0243d.d());
            interfaceC2349d.a(f16357c, abstractC0243d.c());
            interfaceC2349d.e(f16358d, abstractC0243d.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: T8.a$p */
    private static final class p implements InterfaceC2348c<F.e.d.a.b.AbstractC0245e> {

        /* renamed from: a, reason: collision with root package name */
        static final p f16359a = new p();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f16360b = C2347b.d("name");

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f16361c = C2347b.d("importance");

        /* renamed from: d, reason: collision with root package name */
        private static final C2347b f16362d = C2347b.d("frames");

        private p() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.b.AbstractC0245e abstractC0245e, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f16360b, abstractC0245e.d());
            interfaceC2349d.f(f16361c, abstractC0245e.c());
            interfaceC2349d.a(f16362d, abstractC0245e.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: T8.a$q */
    private static final class q implements InterfaceC2348c<F.e.d.a.b.AbstractC0245e.AbstractC0247b> {

        /* renamed from: a, reason: collision with root package name */
        static final q f16363a = new q();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f16364b = C2347b.d("pc");

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f16365c = C2347b.d("symbol");

        /* renamed from: d, reason: collision with root package name */
        private static final C2347b f16366d = C2347b.d("file");

        /* renamed from: e, reason: collision with root package name */
        private static final C2347b f16367e = C2347b.d("offset");

        /* renamed from: f, reason: collision with root package name */
        private static final C2347b f16368f = C2347b.d("importance");

        private q() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.b.AbstractC0245e.AbstractC0247b abstractC0247b, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.e(f16364b, abstractC0247b.e());
            interfaceC2349d.a(f16365c, abstractC0247b.f());
            interfaceC2349d.a(f16366d, abstractC0247b.b());
            interfaceC2349d.e(f16367e, abstractC0247b.d());
            interfaceC2349d.f(f16368f, abstractC0247b.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: T8.a$r */
    private static final class r implements InterfaceC2348c<F.e.d.a.c> {

        /* renamed from: a, reason: collision with root package name */
        static final r f16369a = new r();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f16370b = C2347b.d("processName");

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f16371c = C2347b.d("pid");

        /* renamed from: d, reason: collision with root package name */
        private static final C2347b f16372d = C2347b.d("importance");

        /* renamed from: e, reason: collision with root package name */
        private static final C2347b f16373e = C2347b.d("defaultProcess");

        private r() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.a.c cVar, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f16370b, cVar.d());
            interfaceC2349d.f(f16371c, cVar.c());
            interfaceC2349d.f(f16372d, cVar.b());
            interfaceC2349d.d(f16373e, cVar.e());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: T8.a$s */
    private static final class s implements InterfaceC2348c<F.e.d.c> {

        /* renamed from: a, reason: collision with root package name */
        static final s f16374a = new s();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f16375b = C2347b.d("batteryLevel");

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f16376c = C2347b.d("batteryVelocity");

        /* renamed from: d, reason: collision with root package name */
        private static final C2347b f16377d = C2347b.d("proximityOn");

        /* renamed from: e, reason: collision with root package name */
        private static final C2347b f16378e = C2347b.d("orientation");

        /* renamed from: f, reason: collision with root package name */
        private static final C2347b f16379f = C2347b.d("ramUsed");

        /* renamed from: g, reason: collision with root package name */
        private static final C2347b f16380g = C2347b.d("diskUsed");

        private s() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.c cVar, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f16375b, cVar.b());
            interfaceC2349d.f(f16376c, cVar.c());
            interfaceC2349d.d(f16377d, cVar.g());
            interfaceC2349d.f(f16378e, cVar.e());
            interfaceC2349d.e(f16379f, cVar.f());
            interfaceC2349d.e(f16380g, cVar.d());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: T8.a$t */
    private static final class t implements InterfaceC2348c<F.e.d> {

        /* renamed from: a, reason: collision with root package name */
        static final t f16381a = new t();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f16382b = C2347b.d("timestamp");

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f16383c = C2347b.d("type");

        /* renamed from: d, reason: collision with root package name */
        private static final C2347b f16384d = C2347b.d("app");

        /* renamed from: e, reason: collision with root package name */
        private static final C2347b f16385e = C2347b.d("device");

        /* renamed from: f, reason: collision with root package name */
        private static final C2347b f16386f = C2347b.d("log");

        /* renamed from: g, reason: collision with root package name */
        private static final C2347b f16387g = C2347b.d("rollouts");

        private t() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d dVar, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.e(f16382b, dVar.f());
            interfaceC2349d.a(f16383c, dVar.g());
            interfaceC2349d.a(f16384d, dVar.b());
            interfaceC2349d.a(f16385e, dVar.c());
            interfaceC2349d.a(f16386f, dVar.d());
            interfaceC2349d.a(f16387g, dVar.e());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: T8.a$u */
    private static final class u implements InterfaceC2348c<F.e.d.AbstractC0250d> {

        /* renamed from: a, reason: collision with root package name */
        static final u f16388a = new u();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f16389b = C2347b.d("content");

        private u() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.AbstractC0250d abstractC0250d, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f16389b, abstractC0250d.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: T8.a$v */
    private static final class v implements InterfaceC2348c<F.e.d.AbstractC0251e> {

        /* renamed from: a, reason: collision with root package name */
        static final v f16390a = new v();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f16391b = C2347b.d("rolloutVariant");

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f16392c = C2347b.d("parameterKey");

        /* renamed from: d, reason: collision with root package name */
        private static final C2347b f16393d = C2347b.d("parameterValue");

        /* renamed from: e, reason: collision with root package name */
        private static final C2347b f16394e = C2347b.d("templateVersion");

        private v() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.AbstractC0251e abstractC0251e, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f16391b, abstractC0251e.d());
            interfaceC2349d.a(f16392c, abstractC0251e.b());
            interfaceC2349d.a(f16393d, abstractC0251e.c());
            interfaceC2349d.e(f16394e, abstractC0251e.e());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: T8.a$w */
    private static final class w implements InterfaceC2348c<F.e.d.AbstractC0251e.b> {

        /* renamed from: a, reason: collision with root package name */
        static final w f16395a = new w();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f16396b = C2347b.d("rolloutId");

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f16397c = C2347b.d("variantId");

        private w() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.AbstractC0251e.b bVar, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f16396b, bVar.b());
            interfaceC2349d.a(f16397c, bVar.c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: T8.a$x */
    private static final class x implements InterfaceC2348c<F.e.d.f> {

        /* renamed from: a, reason: collision with root package name */
        static final x f16398a = new x();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f16399b = C2347b.d("assignments");

        private x() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.d.f fVar, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f16399b, fVar.b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: T8.a$y */
    private static final class y implements InterfaceC2348c<F.e.AbstractC0252e> {

        /* renamed from: a, reason: collision with root package name */
        static final y f16400a = new y();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f16401b = C2347b.d("platform");

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f16402c = C2347b.d("version");

        /* renamed from: d, reason: collision with root package name */
        private static final C2347b f16403d = C2347b.d("buildVersion");

        /* renamed from: e, reason: collision with root package name */
        private static final C2347b f16404e = C2347b.d("jailbroken");

        private y() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.AbstractC0252e abstractC0252e, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.f(f16401b, abstractC0252e.c());
            interfaceC2349d.a(f16402c, abstractC0252e.d());
            interfaceC2349d.a(f16403d, abstractC0252e.b());
            interfaceC2349d.d(f16404e, abstractC0252e.e());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: T8.a$z */
    private static final class z implements InterfaceC2348c<F.e.f> {

        /* renamed from: a, reason: collision with root package name */
        static final z f16405a = new z();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f16406b = C2347b.d("identifier");

        private z() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F.e.f fVar, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f16406b, fVar.b());
        }
    }

    private C1714a() {
    }

    @Override // d9.InterfaceC3083a
    public void a(InterfaceC3084b<?> interfaceC3084b) {
        d dVar = d.f16278a;
        interfaceC3084b.a(F.class, dVar);
        interfaceC3084b.a(C1715b.class, dVar);
        j jVar = j.f16317a;
        interfaceC3084b.a(F.e.class, jVar);
        interfaceC3084b.a(T8.h.class, jVar);
        g gVar = g.f16297a;
        interfaceC3084b.a(F.e.a.class, gVar);
        interfaceC3084b.a(T8.i.class, gVar);
        h hVar = h.f16305a;
        interfaceC3084b.a(F.e.a.b.class, hVar);
        interfaceC3084b.a(T8.j.class, hVar);
        z zVar = z.f16405a;
        interfaceC3084b.a(F.e.f.class, zVar);
        interfaceC3084b.a(A.class, zVar);
        y yVar = y.f16400a;
        interfaceC3084b.a(F.e.AbstractC0252e.class, yVar);
        interfaceC3084b.a(T8.z.class, yVar);
        i iVar = i.f16307a;
        interfaceC3084b.a(F.e.c.class, iVar);
        interfaceC3084b.a(T8.k.class, iVar);
        t tVar = t.f16381a;
        interfaceC3084b.a(F.e.d.class, tVar);
        interfaceC3084b.a(T8.l.class, tVar);
        k kVar = k.f16330a;
        interfaceC3084b.a(F.e.d.a.class, kVar);
        interfaceC3084b.a(T8.m.class, kVar);
        m mVar = m.f16343a;
        interfaceC3084b.a(F.e.d.a.b.class, mVar);
        interfaceC3084b.a(T8.n.class, mVar);
        p pVar = p.f16359a;
        interfaceC3084b.a(F.e.d.a.b.AbstractC0245e.class, pVar);
        interfaceC3084b.a(T8.r.class, pVar);
        q qVar = q.f16363a;
        interfaceC3084b.a(F.e.d.a.b.AbstractC0245e.AbstractC0247b.class, qVar);
        interfaceC3084b.a(T8.s.class, qVar);
        n nVar = n.f16349a;
        interfaceC3084b.a(F.e.d.a.b.c.class, nVar);
        interfaceC3084b.a(T8.p.class, nVar);
        b bVar = b.f16265a;
        interfaceC3084b.a(F.a.class, bVar);
        interfaceC3084b.a(C1716c.class, bVar);
        C0253a c0253a = C0253a.f16261a;
        interfaceC3084b.a(F.a.AbstractC0235a.class, c0253a);
        interfaceC3084b.a(C1717d.class, c0253a);
        o oVar = o.f16355a;
        interfaceC3084b.a(F.e.d.a.b.AbstractC0243d.class, oVar);
        interfaceC3084b.a(T8.q.class, oVar);
        l lVar = l.f16338a;
        interfaceC3084b.a(F.e.d.a.b.AbstractC0239a.class, lVar);
        interfaceC3084b.a(T8.o.class, lVar);
        c cVar = c.f16275a;
        interfaceC3084b.a(F.c.class, cVar);
        interfaceC3084b.a(C1718e.class, cVar);
        r rVar = r.f16369a;
        interfaceC3084b.a(F.e.d.a.c.class, rVar);
        interfaceC3084b.a(T8.t.class, rVar);
        s sVar = s.f16374a;
        interfaceC3084b.a(F.e.d.c.class, sVar);
        interfaceC3084b.a(T8.u.class, sVar);
        u uVar = u.f16388a;
        interfaceC3084b.a(F.e.d.AbstractC0250d.class, uVar);
        interfaceC3084b.a(T8.v.class, uVar);
        x xVar = x.f16398a;
        interfaceC3084b.a(F.e.d.f.class, xVar);
        interfaceC3084b.a(T8.y.class, xVar);
        v vVar = v.f16390a;
        interfaceC3084b.a(F.e.d.AbstractC0251e.class, vVar);
        interfaceC3084b.a(T8.w.class, vVar);
        w wVar = w.f16395a;
        interfaceC3084b.a(F.e.d.AbstractC0251e.b.class, wVar);
        interfaceC3084b.a(T8.x.class, wVar);
        e eVar = e.f16291a;
        interfaceC3084b.a(F.d.class, eVar);
        interfaceC3084b.a(C1719f.class, eVar);
        f fVar = f.f16294a;
        interfaceC3084b.a(F.d.b.class, fVar);
        interfaceC3084b.a(C1720g.class, fVar);
    }
}
