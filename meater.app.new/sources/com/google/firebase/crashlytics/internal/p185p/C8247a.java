package com.google.firebase.crashlytics.internal.p185p;

import cm.aptoide.p092pt.database.room.RoomNotification;
import com.google.firebase.crashlytics.internal.p185p.AbstractC8258f0;
import com.google.firebase.encoders.C8326b;
import com.google.firebase.encoders.InterfaceC8327c;
import com.google.firebase.encoders.InterfaceC8328d;
import com.google.firebase.encoders.p192g.InterfaceC8331a;
import com.google.firebase.encoders.p192g.InterfaceC8332b;
import java.io.IOException;

/* compiled from: AutoCrashlyticsReportEncoder.java */
/* renamed from: com.google.firebase.crashlytics.h.p.a */
/* loaded from: classes2.dex */
public final class C8247a implements InterfaceC8331a {

    /* renamed from: a */
    public static final InterfaceC8331a f31124a = new C8247a();

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.a$a */
    private static final class a implements InterfaceC8327c<AbstractC8258f0.a.AbstractC11498a> {

        /* renamed from: a */
        static final a f31125a = new a();

        /* renamed from: b */
        private static final C8326b f31126b = C8326b.m26077d("arch");

        /* renamed from: c */
        private static final C8326b f31127c = C8326b.m26077d("libraryName");

        /* renamed from: d */
        private static final C8326b f31128d = C8326b.m26077d("buildId");

        private a() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8327c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC8258f0.a.AbstractC11498a abstractC11498a, InterfaceC8328d interfaceC8328d) throws IOException {
            interfaceC8328d.mo26088i(f31126b, abstractC11498a.mo25634b());
            interfaceC8328d.mo26088i(f31127c, abstractC11498a.mo25636d());
            interfaceC8328d.mo26088i(f31128d, abstractC11498a.mo25635c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.a$b */
    private static final class b implements InterfaceC8327c<AbstractC8258f0.a> {

        /* renamed from: a */
        static final b f31129a = new b();

        /* renamed from: b */
        private static final C8326b f31130b = C8326b.m26077d("pid");

        /* renamed from: c */
        private static final C8326b f31131c = C8326b.m26077d("processName");

        /* renamed from: d */
        private static final C8326b f31132d = C8326b.m26077d("reasonCode");

        /* renamed from: e */
        private static final C8326b f31133e = C8326b.m26077d("importance");

        /* renamed from: f */
        private static final C8326b f31134f = C8326b.m26077d("pss");

        /* renamed from: g */
        private static final C8326b f31135g = C8326b.m26077d("rss");

        /* renamed from: h */
        private static final C8326b f31136h = C8326b.m26077d("timestamp");

        /* renamed from: i */
        private static final C8326b f31137i = C8326b.m26077d("traceFile");

        /* renamed from: j */
        private static final C8326b f31138j = C8326b.m26077d("buildIdMappingForArch");

        private b() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8327c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC8258f0.a aVar, InterfaceC8328d interfaceC8328d) throws IOException {
            interfaceC8328d.mo26084c(f31130b, aVar.mo25611d());
            interfaceC8328d.mo26088i(f31131c, aVar.mo25612e());
            interfaceC8328d.mo26084c(f31132d, aVar.mo25614g());
            interfaceC8328d.mo26084c(f31133e, aVar.mo25610c());
            interfaceC8328d.mo26083b(f31134f, aVar.mo25613f());
            interfaceC8328d.mo26083b(f31135g, aVar.mo25615h());
            interfaceC8328d.mo26083b(f31136h, aVar.mo25616i());
            interfaceC8328d.mo26088i(f31137i, aVar.mo25617j());
            interfaceC8328d.mo26088i(f31138j, aVar.mo25609b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.a$c */
    private static final class c implements InterfaceC8327c<AbstractC8258f0.c> {

        /* renamed from: a */
        static final c f31139a = new c();

        /* renamed from: b */
        private static final C8326b f31140b = C8326b.m26077d(RoomNotification.KEY);

        /* renamed from: c */
        private static final C8326b f31141c = C8326b.m26077d("value");

        private c() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8327c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC8258f0.c cVar, InterfaceC8328d interfaceC8328d) throws IOException {
            interfaceC8328d.mo26088i(f31140b, cVar.mo25650b());
            interfaceC8328d.mo26088i(f31141c, cVar.mo25651c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.a$d */
    private static final class d implements InterfaceC8327c<AbstractC8258f0> {

        /* renamed from: a */
        static final d f31142a = new d();

        /* renamed from: b */
        private static final C8326b f31143b = C8326b.m26077d("sdkVersion");

        /* renamed from: c */
        private static final C8326b f31144c = C8326b.m26077d("gmpAppId");

        /* renamed from: d */
        private static final C8326b f31145d = C8326b.m26077d("platform");

        /* renamed from: e */
        private static final C8326b f31146e = C8326b.m26077d("installationUuid");

        /* renamed from: f */
        private static final C8326b f31147f = C8326b.m26077d("firebaseInstallationId");

        /* renamed from: g */
        private static final C8326b f31148g = C8326b.m26077d("appQualitySessionId");

        /* renamed from: h */
        private static final C8326b f31149h = C8326b.m26077d("buildVersion");

        /* renamed from: i */
        private static final C8326b f31150i = C8326b.m26077d("displayVersion");

        /* renamed from: j */
        private static final C8326b f31151j = C8326b.m26077d("session");

        /* renamed from: k */
        private static final C8326b f31152k = C8326b.m26077d("ndkPayload");

        /* renamed from: l */
        private static final C8326b f31153l = C8326b.m26077d("appExitInfo");

        private d() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8327c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC8258f0 abstractC8258f0, InterfaceC8328d interfaceC8328d) throws IOException {
            interfaceC8328d.mo26088i(f31143b, abstractC8258f0.mo25591l());
            interfaceC8328d.mo26088i(f31144c, abstractC8258f0.mo25587h());
            interfaceC8328d.mo26084c(f31145d, abstractC8258f0.mo25590k());
            interfaceC8328d.mo26088i(f31146e, abstractC8258f0.mo25588i());
            interfaceC8328d.mo26088i(f31147f, abstractC8258f0.mo25586g());
            interfaceC8328d.mo26088i(f31148g, abstractC8258f0.mo25583d());
            interfaceC8328d.mo26088i(f31149h, abstractC8258f0.mo25584e());
            interfaceC8328d.mo26088i(f31150i, abstractC8258f0.mo25585f());
            interfaceC8328d.mo26088i(f31151j, abstractC8258f0.mo25592m());
            interfaceC8328d.mo26088i(f31152k, abstractC8258f0.mo25589j());
            interfaceC8328d.mo26088i(f31153l, abstractC8258f0.mo25582c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.a$e */
    private static final class e implements InterfaceC8327c<AbstractC8258f0.d> {

        /* renamed from: a */
        static final e f31154a = new e();

        /* renamed from: b */
        private static final C8326b f31155b = C8326b.m26077d("files");

        /* renamed from: c */
        private static final C8326b f31156c = C8326b.m26077d("orgId");

        private e() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8327c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC8258f0.d dVar, InterfaceC8328d interfaceC8328d) throws IOException {
            interfaceC8328d.mo26088i(f31155b, dVar.mo25658b());
            interfaceC8328d.mo26088i(f31156c, dVar.mo25659c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.a$f */
    private static final class f implements InterfaceC8327c<AbstractC8258f0.d.b> {

        /* renamed from: a */
        static final f f31157a = new f();

        /* renamed from: b */
        private static final C8326b f31158b = C8326b.m26077d("filename");

        /* renamed from: c */
        private static final C8326b f31159c = C8326b.m26077d("contents");

        private f() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8327c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC8258f0.d.b bVar, InterfaceC8328d interfaceC8328d) throws IOException {
            interfaceC8328d.mo26088i(f31158b, bVar.mo25677c());
            interfaceC8328d.mo26088i(f31159c, bVar.mo25676b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.a$g */
    private static final class g implements InterfaceC8327c<AbstractC8258f0.e.a> {

        /* renamed from: a */
        static final g f31160a = new g();

        /* renamed from: b */
        private static final C8326b f31161b = C8326b.m26077d("identifier");

        /* renamed from: c */
        private static final C8326b f31162c = C8326b.m26077d("version");

        /* renamed from: d */
        private static final C8326b f31163d = C8326b.m26077d("displayVersion");

        /* renamed from: e */
        private static final C8326b f31164e = C8326b.m26077d("organization");

        /* renamed from: f */
        private static final C8326b f31165f = C8326b.m26077d("installationUuid");

        /* renamed from: g */
        private static final C8326b f31166g = C8326b.m26077d("developmentPlatform");

        /* renamed from: h */
        private static final C8326b f31167h = C8326b.m26077d("developmentPlatformVersion");

        private g() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8327c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC8258f0.e.a aVar, InterfaceC8328d interfaceC8328d) throws IOException {
            interfaceC8328d.mo26088i(f31161b, aVar.mo25703e());
            interfaceC8328d.mo26088i(f31162c, aVar.mo25706h());
            interfaceC8328d.mo26088i(f31163d, aVar.mo25702d());
            interfaceC8328d.mo26088i(f31164e, aVar.mo25705g());
            interfaceC8328d.mo26088i(f31165f, aVar.mo25704f());
            interfaceC8328d.mo26088i(f31166g, aVar.mo25700b());
            interfaceC8328d.mo26088i(f31167h, aVar.mo25701c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.a$h */
    private static final class h implements InterfaceC8327c<AbstractC8258f0.e.a.b> {

        /* renamed from: a */
        static final h f31168a = new h();

        /* renamed from: b */
        private static final C8326b f31169b = C8326b.m26077d("clsId");

        private h() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8327c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC8258f0.e.a.b bVar, InterfaceC8328d interfaceC8328d) throws IOException {
            interfaceC8328d.mo26088i(f31169b, bVar.mo25714a());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.a$i */
    private static final class i implements InterfaceC8327c<AbstractC8258f0.e.c> {

        /* renamed from: a */
        static final i f31170a = new i();

        /* renamed from: b */
        private static final C8326b f31171b = C8326b.m26077d("arch");

        /* renamed from: c */
        private static final C8326b f31172c = C8326b.m26077d("model");

        /* renamed from: d */
        private static final C8326b f31173d = C8326b.m26077d("cores");

        /* renamed from: e */
        private static final C8326b f31174e = C8326b.m26077d("ram");

        /* renamed from: f */
        private static final C8326b f31175f = C8326b.m26077d("diskSpace");

        /* renamed from: g */
        private static final C8326b f31176g = C8326b.m26077d("simulator");

        /* renamed from: h */
        private static final C8326b f31177h = C8326b.m26077d("state");

        /* renamed from: i */
        private static final C8326b f31178i = C8326b.m26077d("manufacturer");

        /* renamed from: j */
        private static final C8326b f31179j = C8326b.m26077d("modelClass");

        private i() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8327c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC8258f0.e.c cVar, InterfaceC8328d interfaceC8328d) throws IOException {
            interfaceC8328d.mo26084c(f31171b, cVar.mo25730b());
            interfaceC8328d.mo26088i(f31172c, cVar.mo25734f());
            interfaceC8328d.mo26084c(f31173d, cVar.mo25731c());
            interfaceC8328d.mo26083b(f31174e, cVar.mo25736h());
            interfaceC8328d.mo26083b(f31175f, cVar.mo25732d());
            interfaceC8328d.mo26082a(f31176g, cVar.mo25738j());
            interfaceC8328d.mo26084c(f31177h, cVar.mo25737i());
            interfaceC8328d.mo26088i(f31178i, cVar.mo25733e());
            interfaceC8328d.mo26088i(f31179j, cVar.mo25735g());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.a$j */
    private static final class j implements InterfaceC8327c<AbstractC8258f0.e> {

        /* renamed from: a */
        static final j f31180a = new j();

        /* renamed from: b */
        private static final C8326b f31181b = C8326b.m26077d("generator");

        /* renamed from: c */
        private static final C8326b f31182c = C8326b.m26077d("identifier");

        /* renamed from: d */
        private static final C8326b f31183d = C8326b.m26077d("appQualitySessionId");

        /* renamed from: e */
        private static final C8326b f31184e = C8326b.m26077d("startedAt");

        /* renamed from: f */
        private static final C8326b f31185f = C8326b.m26077d("endedAt");

        /* renamed from: g */
        private static final C8326b f31186g = C8326b.m26077d("crashed");

        /* renamed from: h */
        private static final C8326b f31187h = C8326b.m26077d("app");

        /* renamed from: i */
        private static final C8326b f31188i = C8326b.m26077d("user");

        /* renamed from: j */
        private static final C8326b f31189j = C8326b.m26077d("os");

        /* renamed from: k */
        private static final C8326b f31190k = C8326b.m26077d("device");

        /* renamed from: l */
        private static final C8326b f31191l = C8326b.m26077d("events");

        /* renamed from: m */
        private static final C8326b f31192m = C8326b.m26077d("generatorType");

        private j() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8327c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC8258f0.e eVar, InterfaceC8328d interfaceC8328d) throws IOException {
            interfaceC8328d.mo26088i(f31181b, eVar.mo25687g());
            interfaceC8328d.mo26088i(f31182c, eVar.m25690j());
            interfaceC8328d.mo26088i(f31183d, eVar.mo25683c());
            interfaceC8328d.mo26083b(f31184e, eVar.mo25692l());
            interfaceC8328d.mo26088i(f31185f, eVar.mo25685e());
            interfaceC8328d.mo26082a(f31186g, eVar.mo25694n());
            interfaceC8328d.mo26088i(f31187h, eVar.mo25682b());
            interfaceC8328d.mo26088i(f31188i, eVar.mo25693m());
            interfaceC8328d.mo26088i(f31189j, eVar.mo25691k());
            interfaceC8328d.mo26088i(f31190k, eVar.mo25684d());
            interfaceC8328d.mo26088i(f31191l, eVar.mo25686f());
            interfaceC8328d.mo26084c(f31192m, eVar.mo25688h());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.a$k */
    private static final class k implements InterfaceC8327c<AbstractC8258f0.e.d.a> {

        /* renamed from: a */
        static final k f31193a = new k();

        /* renamed from: b */
        private static final C8326b f31194b = C8326b.m26077d("execution");

        /* renamed from: c */
        private static final C8326b f31195c = C8326b.m26077d("customAttributes");

        /* renamed from: d */
        private static final C8326b f31196d = C8326b.m26077d("internalKeys");

        /* renamed from: e */
        private static final C8326b f31197e = C8326b.m26077d("background");

        /* renamed from: f */
        private static final C8326b f31198f = C8326b.m26077d("currentProcessDetails");

        /* renamed from: g */
        private static final C8326b f31199g = C8326b.m26077d("appProcessDetails");

        /* renamed from: h */
        private static final C8326b f31200h = C8326b.m26077d("uiOrientation");

        private k() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8327c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC8258f0.e.d.a aVar, InterfaceC8328d interfaceC8328d) throws IOException {
            interfaceC8328d.mo26088i(f31194b, aVar.mo25762f());
            interfaceC8328d.mo26088i(f31195c, aVar.mo25761e());
            interfaceC8328d.mo26088i(f31196d, aVar.mo25763g());
            interfaceC8328d.mo26088i(f31197e, aVar.mo25759c());
            interfaceC8328d.mo26088i(f31198f, aVar.mo25760d());
            interfaceC8328d.mo26088i(f31199g, aVar.mo25758b());
            interfaceC8328d.mo26084c(f31200h, aVar.mo25764h());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.a$l */
    private static final class l implements InterfaceC8327c<AbstractC8258f0.e.d.a.b.AbstractC11502a> {

        /* renamed from: a */
        static final l f31201a = new l();

        /* renamed from: b */
        private static final C8326b f31202b = C8326b.m26077d("baseAddress");

        /* renamed from: c */
        private static final C8326b f31203c = C8326b.m26077d("size");

        /* renamed from: d */
        private static final C8326b f31204d = C8326b.m26077d("name");

        /* renamed from: e */
        private static final C8326b f31205e = C8326b.m26077d("uuid");

        private l() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8327c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC8258f0.e.d.a.b.AbstractC11502a abstractC11502a, InterfaceC8328d interfaceC8328d) throws IOException {
            interfaceC8328d.mo26083b(f31202b, abstractC11502a.mo25781b());
            interfaceC8328d.mo26083b(f31203c, abstractC11502a.mo25783d());
            interfaceC8328d.mo26088i(f31204d, abstractC11502a.mo25782c());
            interfaceC8328d.mo26088i(f31205e, abstractC11502a.m25785f());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.a$m */
    private static final class m implements InterfaceC8327c<AbstractC8258f0.e.d.a.b> {

        /* renamed from: a */
        static final m f31206a = new m();

        /* renamed from: b */
        private static final C8326b f31207b = C8326b.m26077d("threads");

        /* renamed from: c */
        private static final C8326b f31208c = C8326b.m26077d("exception");

        /* renamed from: d */
        private static final C8326b f31209d = C8326b.m26077d("appExitInfo");

        /* renamed from: e */
        private static final C8326b f31210e = C8326b.m26077d("signal");

        /* renamed from: f */
        private static final C8326b f31211f = C8326b.m26077d("binaries");

        private m() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8327c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC8258f0.e.d.a.b bVar, InterfaceC8328d interfaceC8328d) throws IOException {
            interfaceC8328d.mo26088i(f31207b, bVar.mo25779f());
            interfaceC8328d.mo26088i(f31208c, bVar.mo25777d());
            interfaceC8328d.mo26088i(f31209d, bVar.mo25775b());
            interfaceC8328d.mo26088i(f31210e, bVar.mo25778e());
            interfaceC8328d.mo26088i(f31211f, bVar.mo25776c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.a$n */
    private static final class n implements InterfaceC8327c<AbstractC8258f0.e.d.a.b.c> {

        /* renamed from: a */
        static final n f31212a = new n();

        /* renamed from: b */
        private static final C8326b f31213b = C8326b.m26077d("type");

        /* renamed from: c */
        private static final C8326b f31214c = C8326b.m26077d("reason");

        /* renamed from: d */
        private static final C8326b f31215d = C8326b.m26077d("frames");

        /* renamed from: e */
        private static final C8326b f31216e = C8326b.m26077d("causedBy");

        /* renamed from: f */
        private static final C8326b f31217f = C8326b.m26077d("overflowCount");

        private n() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8327c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC8258f0.e.d.a.b.c cVar, InterfaceC8328d interfaceC8328d) throws IOException {
            interfaceC8328d.mo26088i(f31213b, cVar.mo25803f());
            interfaceC8328d.mo26088i(f31214c, cVar.mo25802e());
            interfaceC8328d.mo26088i(f31215d, cVar.mo25800c());
            interfaceC8328d.mo26088i(f31216e, cVar.mo25799b());
            interfaceC8328d.mo26084c(f31217f, cVar.mo25801d());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.a$o */
    private static final class o implements InterfaceC8327c<AbstractC8258f0.e.d.a.b.AbstractC11506d> {

        /* renamed from: a */
        static final o f31218a = new o();

        /* renamed from: b */
        private static final C8326b f31219b = C8326b.m26077d("name");

        /* renamed from: c */
        private static final C8326b f31220c = C8326b.m26077d("code");

        /* renamed from: d */
        private static final C8326b f31221d = C8326b.m26077d("address");

        private o() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8327c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC8258f0.e.d.a.b.AbstractC11506d abstractC11506d, InterfaceC8328d interfaceC8328d) throws IOException {
            interfaceC8328d.mo26088i(f31219b, abstractC11506d.mo25813d());
            interfaceC8328d.mo26088i(f31220c, abstractC11506d.mo25812c());
            interfaceC8328d.mo26083b(f31221d, abstractC11506d.mo25811b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.a$p */
    private static final class p implements InterfaceC8327c<AbstractC8258f0.e.d.a.b.AbstractC11508e> {

        /* renamed from: a */
        static final p f31222a = new p();

        /* renamed from: b */
        private static final C8326b f31223b = C8326b.m26077d("name");

        /* renamed from: c */
        private static final C8326b f31224c = C8326b.m26077d("importance");

        /* renamed from: d */
        private static final C8326b f31225d = C8326b.m26077d("frames");

        private p() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8327c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC8258f0.e.d.a.b.AbstractC11508e abstractC11508e, InterfaceC8328d interfaceC8328d) throws IOException {
            interfaceC8328d.mo26088i(f31223b, abstractC11508e.mo25821d());
            interfaceC8328d.mo26084c(f31224c, abstractC11508e.mo25820c());
            interfaceC8328d.mo26088i(f31225d, abstractC11508e.mo25819b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.a$q */
    private static final class q implements InterfaceC8327c<AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b> {

        /* renamed from: a */
        static final q f31226a = new q();

        /* renamed from: b */
        private static final C8326b f31227b = C8326b.m26077d("pc");

        /* renamed from: c */
        private static final C8326b f31228c = C8326b.m26077d("symbol");

        /* renamed from: d */
        private static final C8326b f31229d = C8326b.m26077d("file");

        /* renamed from: e */
        private static final C8326b f31230e = C8326b.m26077d("offset");

        /* renamed from: f */
        private static final C8326b f31231f = C8326b.m26077d("importance");

        private q() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8327c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b abstractC11510b, InterfaceC8328d interfaceC8328d) throws IOException {
            interfaceC8328d.mo26083b(f31227b, abstractC11510b.mo25830e());
            interfaceC8328d.mo26088i(f31228c, abstractC11510b.mo25831f());
            interfaceC8328d.mo26088i(f31229d, abstractC11510b.mo25827b());
            interfaceC8328d.mo26083b(f31230e, abstractC11510b.mo25829d());
            interfaceC8328d.mo26084c(f31231f, abstractC11510b.mo25828c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.a$r */
    private static final class r implements InterfaceC8327c<AbstractC8258f0.e.d.a.c> {

        /* renamed from: a */
        static final r f31232a = new r();

        /* renamed from: b */
        private static final C8326b f31233b = C8326b.m26077d("processName");

        /* renamed from: c */
        private static final C8326b f31234c = C8326b.m26077d("pid");

        /* renamed from: d */
        private static final C8326b f31235d = C8326b.m26077d("importance");

        /* renamed from: e */
        private static final C8326b f31236e = C8326b.m26077d("defaultProcess");

        private r() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8327c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC8258f0.e.d.a.c cVar, InterfaceC8328d interfaceC8328d) throws IOException {
            interfaceC8328d.mo26088i(f31233b, cVar.mo25841d());
            interfaceC8328d.mo26084c(f31234c, cVar.mo25840c());
            interfaceC8328d.mo26084c(f31235d, cVar.mo25839b());
            interfaceC8328d.mo26082a(f31236e, cVar.mo25842e());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.a$s */
    private static final class s implements InterfaceC8327c<AbstractC8258f0.e.d.c> {

        /* renamed from: a */
        static final s f31237a = new s();

        /* renamed from: b */
        private static final C8326b f31238b = C8326b.m26077d("batteryLevel");

        /* renamed from: c */
        private static final C8326b f31239c = C8326b.m26077d("batteryVelocity");

        /* renamed from: d */
        private static final C8326b f31240d = C8326b.m26077d("proximityOn");

        /* renamed from: e */
        private static final C8326b f31241e = C8326b.m26077d("orientation");

        /* renamed from: f */
        private static final C8326b f31242f = C8326b.m26077d("ramUsed");

        /* renamed from: g */
        private static final C8326b f31243g = C8326b.m26077d("diskUsed");

        private s() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8327c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC8258f0.e.d.c cVar, InterfaceC8328d interfaceC8328d) throws IOException {
            interfaceC8328d.mo26088i(f31238b, cVar.mo25856b());
            interfaceC8328d.mo26084c(f31239c, cVar.mo25857c());
            interfaceC8328d.mo26082a(f31240d, cVar.mo25861g());
            interfaceC8328d.mo26084c(f31241e, cVar.mo25859e());
            interfaceC8328d.mo26083b(f31242f, cVar.mo25860f());
            interfaceC8328d.mo26083b(f31243g, cVar.mo25858d());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.a$t */
    private static final class t implements InterfaceC8327c<AbstractC8258f0.e.d> {

        /* renamed from: a */
        static final t f31244a = new t();

        /* renamed from: b */
        private static final C8326b f31245b = C8326b.m26077d("timestamp");

        /* renamed from: c */
        private static final C8326b f31246c = C8326b.m26077d("type");

        /* renamed from: d */
        private static final C8326b f31247d = C8326b.m26077d("app");

        /* renamed from: e */
        private static final C8326b f31248e = C8326b.m26077d("device");

        /* renamed from: f */
        private static final C8326b f31249f = C8326b.m26077d("log");

        /* renamed from: g */
        private static final C8326b f31250g = C8326b.m26077d("rollouts");

        private t() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8327c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC8258f0.e.d dVar, InterfaceC8328d interfaceC8328d) throws IOException {
            interfaceC8328d.mo26083b(f31245b, dVar.mo25754f());
            interfaceC8328d.mo26088i(f31246c, dVar.mo25755g());
            interfaceC8328d.mo26088i(f31247d, dVar.mo25750b());
            interfaceC8328d.mo26088i(f31248e, dVar.mo25751c());
            interfaceC8328d.mo26088i(f31249f, dVar.mo25752d());
            interfaceC8328d.mo26088i(f31250g, dVar.mo25753e());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.a$u */
    private static final class u implements InterfaceC8327c<AbstractC8258f0.e.d.AbstractC11513d> {

        /* renamed from: a */
        static final u f31251a = new u();

        /* renamed from: b */
        private static final C8326b f31252b = C8326b.m26077d("content");

        private u() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8327c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC8258f0.e.d.AbstractC11513d abstractC11513d, InterfaceC8328d interfaceC8328d) throws IOException {
            interfaceC8328d.mo26088i(f31252b, abstractC11513d.mo25870b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.a$v */
    private static final class v implements InterfaceC8327c<AbstractC8258f0.e.d.AbstractC11514e> {

        /* renamed from: a */
        static final v f31253a = new v();

        /* renamed from: b */
        private static final C8326b f31254b = C8326b.m26077d("rolloutVariant");

        /* renamed from: c */
        private static final C8326b f31255c = C8326b.m26077d("parameterKey");

        /* renamed from: d */
        private static final C8326b f31256d = C8326b.m26077d("parameterValue");

        /* renamed from: e */
        private static final C8326b f31257e = C8326b.m26077d("templateVersion");

        private v() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8327c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC8258f0.e.d.AbstractC11514e abstractC11514e, InterfaceC8328d interfaceC8328d) throws IOException {
            interfaceC8328d.mo26088i(f31254b, abstractC11514e.mo25876d());
            interfaceC8328d.mo26088i(f31255c, abstractC11514e.mo25874b());
            interfaceC8328d.mo26088i(f31256d, abstractC11514e.mo25875c());
            interfaceC8328d.mo26083b(f31257e, abstractC11514e.mo25877e());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.a$w */
    private static final class w implements InterfaceC8327c<AbstractC8258f0.e.d.AbstractC11514e.b> {

        /* renamed from: a */
        static final w f31258a = new w();

        /* renamed from: b */
        private static final C8326b f31259b = C8326b.m26077d("rolloutId");

        /* renamed from: c */
        private static final C8326b f31260c = C8326b.m26077d("variantId");

        private w() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8327c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC8258f0.e.d.AbstractC11514e.b bVar, InterfaceC8328d interfaceC8328d) throws IOException {
            interfaceC8328d.mo26088i(f31259b, bVar.mo25884b());
            interfaceC8328d.mo26088i(f31260c, bVar.mo25885c());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.a$x */
    private static final class x implements InterfaceC8327c<AbstractC8258f0.e.d.f> {

        /* renamed from: a */
        static final x f31261a = new x();

        /* renamed from: b */
        private static final C8326b f31262b = C8326b.m26077d("assignments");

        private x() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8327c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC8258f0.e.d.f fVar, InterfaceC8328d interfaceC8328d) throws IOException {
            interfaceC8328d.mo26088i(f31262b, fVar.mo25890b());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.a$y */
    private static final class y implements InterfaceC8327c<AbstractC8258f0.e.AbstractC11515e> {

        /* renamed from: a */
        static final y f31263a = new y();

        /* renamed from: b */
        private static final C8326b f31264b = C8326b.m26077d("platform");

        /* renamed from: c */
        private static final C8326b f31265c = C8326b.m26077d("version");

        /* renamed from: d */
        private static final C8326b f31266d = C8326b.m26077d("buildVersion");

        /* renamed from: e */
        private static final C8326b f31267e = C8326b.m26077d("jailbroken");

        private y() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8327c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC8258f0.e.AbstractC11515e abstractC11515e, InterfaceC8328d interfaceC8328d) throws IOException {
            interfaceC8328d.mo26084c(f31264b, abstractC11515e.mo25895c());
            interfaceC8328d.mo26088i(f31265c, abstractC11515e.mo25896d());
            interfaceC8328d.mo26088i(f31266d, abstractC11515e.mo25894b());
            interfaceC8328d.mo26082a(f31267e, abstractC11515e.mo25897e());
        }
    }

    /* compiled from: AutoCrashlyticsReportEncoder.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.a$z */
    private static final class z implements InterfaceC8327c<AbstractC8258f0.e.f> {

        /* renamed from: a */
        static final z f31268a = new z();

        /* renamed from: b */
        private static final C8326b f31269b = C8326b.m26077d("identifier");

        private z() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8327c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AbstractC8258f0.e.f fVar, InterfaceC8328d interfaceC8328d) throws IOException {
            interfaceC8328d.mo26088i(f31269b, fVar.mo25579b());
        }
    }

    private C8247a() {
    }

    @Override // com.google.firebase.encoders.p192g.InterfaceC8331a
    /* renamed from: a */
    public void mo13443a(InterfaceC8332b<?> interfaceC8332b) {
        d dVar = d.f31142a;
        interfaceC8332b.mo26092a(AbstractC8258f0.class, dVar);
        interfaceC8332b.mo26092a(C8249b.class, dVar);
        j jVar = j.f31180a;
        interfaceC8332b.mo26092a(AbstractC8258f0.e.class, jVar);
        interfaceC8332b.mo26092a(C8261h.class, jVar);
        g gVar = g.f31160a;
        interfaceC8332b.mo26092a(AbstractC8258f0.e.a.class, gVar);
        interfaceC8332b.mo26092a(C8272i.class, gVar);
        h hVar = h.f31168a;
        interfaceC8332b.mo26092a(AbstractC8258f0.e.a.b.class, hVar);
        interfaceC8332b.mo26092a(C8273j.class, hVar);
        z zVar = z.f31268a;
        interfaceC8332b.mo26092a(AbstractC8258f0.e.f.class, zVar);
        interfaceC8332b.mo26092a(C8248a0.class, zVar);
        y yVar = y.f31263a;
        interfaceC8332b.mo26092a(AbstractC8258f0.e.AbstractC11515e.class, yVar);
        interfaceC8332b.mo26092a(C8289z.class, yVar);
        i iVar = i.f31170a;
        interfaceC8332b.mo26092a(AbstractC8258f0.e.c.class, iVar);
        interfaceC8332b.mo26092a(C8274k.class, iVar);
        t tVar = t.f31244a;
        interfaceC8332b.mo26092a(AbstractC8258f0.e.d.class, tVar);
        interfaceC8332b.mo26092a(C8275l.class, tVar);
        k kVar = k.f31193a;
        interfaceC8332b.mo26092a(AbstractC8258f0.e.d.a.class, kVar);
        interfaceC8332b.mo26092a(C8276m.class, kVar);
        m mVar = m.f31206a;
        interfaceC8332b.mo26092a(AbstractC8258f0.e.d.a.b.class, mVar);
        interfaceC8332b.mo26092a(C8277n.class, mVar);
        p pVar = p.f31222a;
        interfaceC8332b.mo26092a(AbstractC8258f0.e.d.a.b.AbstractC11508e.class, pVar);
        interfaceC8332b.mo26092a(C8281r.class, pVar);
        q qVar = q.f31226a;
        interfaceC8332b.mo26092a(AbstractC8258f0.e.d.a.b.AbstractC11508e.AbstractC11510b.class, qVar);
        interfaceC8332b.mo26092a(C8282s.class, qVar);
        n nVar = n.f31212a;
        interfaceC8332b.mo26092a(AbstractC8258f0.e.d.a.b.c.class, nVar);
        interfaceC8332b.mo26092a(C8279p.class, nVar);
        b bVar = b.f31129a;
        interfaceC8332b.mo26092a(AbstractC8258f0.a.class, bVar);
        interfaceC8332b.mo26092a(C8251c.class, bVar);
        a aVar = a.f31125a;
        interfaceC8332b.mo26092a(AbstractC8258f0.a.AbstractC11498a.class, aVar);
        interfaceC8332b.mo26092a(C8253d.class, aVar);
        o oVar = o.f31218a;
        interfaceC8332b.mo26092a(AbstractC8258f0.e.d.a.b.AbstractC11506d.class, oVar);
        interfaceC8332b.mo26092a(C8280q.class, oVar);
        l lVar = l.f31201a;
        interfaceC8332b.mo26092a(AbstractC8258f0.e.d.a.b.AbstractC11502a.class, lVar);
        interfaceC8332b.mo26092a(C8278o.class, lVar);
        c cVar = c.f31139a;
        interfaceC8332b.mo26092a(AbstractC8258f0.c.class, cVar);
        interfaceC8332b.mo26092a(C8255e.class, cVar);
        r rVar = r.f31232a;
        interfaceC8332b.mo26092a(AbstractC8258f0.e.d.a.c.class, rVar);
        interfaceC8332b.mo26092a(C8283t.class, rVar);
        s sVar = s.f31237a;
        interfaceC8332b.mo26092a(AbstractC8258f0.e.d.c.class, sVar);
        interfaceC8332b.mo26092a(C8284u.class, sVar);
        u uVar = u.f31251a;
        interfaceC8332b.mo26092a(AbstractC8258f0.e.d.AbstractC11513d.class, uVar);
        interfaceC8332b.mo26092a(C8285v.class, uVar);
        x xVar = x.f31261a;
        interfaceC8332b.mo26092a(AbstractC8258f0.e.d.f.class, xVar);
        interfaceC8332b.mo26092a(C8288y.class, xVar);
        v vVar = v.f31253a;
        interfaceC8332b.mo26092a(AbstractC8258f0.e.d.AbstractC11514e.class, vVar);
        interfaceC8332b.mo26092a(C8286w.class, vVar);
        w wVar = w.f31258a;
        interfaceC8332b.mo26092a(AbstractC8258f0.e.d.AbstractC11514e.b.class, wVar);
        interfaceC8332b.mo26092a(C8287x.class, wVar);
        e eVar = e.f31154a;
        interfaceC8332b.mo26092a(AbstractC8258f0.d.class, eVar);
        interfaceC8332b.mo26092a(C8257f.class, eVar);
        f fVar = f.f31157a;
        interfaceC8332b.mo26092a(AbstractC8258f0.d.b.class, fVar);
        interfaceC8332b.mo26092a(C8259g.class, fVar);
    }
}
