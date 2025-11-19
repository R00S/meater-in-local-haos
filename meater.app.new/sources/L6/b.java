package L6;

import c9.C2347b;
import c9.InterfaceC2348c;
import c9.InterfaceC2349d;
import d9.InterfaceC3083a;
import d9.InterfaceC3084b;

/* compiled from: AutoBatchedLogRequestEncoder.java */
/* loaded from: classes2.dex */
public final class b implements InterfaceC3083a {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC3083a f10851a = new b();

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    private static final class a implements InterfaceC2348c<L6.a> {

        /* renamed from: a, reason: collision with root package name */
        static final a f10852a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f10853b = C2347b.d("sdkVersion");

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f10854c = C2347b.d("model");

        /* renamed from: d, reason: collision with root package name */
        private static final C2347b f10855d = C2347b.d("hardware");

        /* renamed from: e, reason: collision with root package name */
        private static final C2347b f10856e = C2347b.d("device");

        /* renamed from: f, reason: collision with root package name */
        private static final C2347b f10857f = C2347b.d("product");

        /* renamed from: g, reason: collision with root package name */
        private static final C2347b f10858g = C2347b.d("osBuild");

        /* renamed from: h, reason: collision with root package name */
        private static final C2347b f10859h = C2347b.d("manufacturer");

        /* renamed from: i, reason: collision with root package name */
        private static final C2347b f10860i = C2347b.d("fingerprint");

        /* renamed from: j, reason: collision with root package name */
        private static final C2347b f10861j = C2347b.d("locale");

        /* renamed from: k, reason: collision with root package name */
        private static final C2347b f10862k = C2347b.d("country");

        /* renamed from: l, reason: collision with root package name */
        private static final C2347b f10863l = C2347b.d("mccMnc");

        /* renamed from: m, reason: collision with root package name */
        private static final C2347b f10864m = C2347b.d("applicationBuild");

        private a() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(L6.a aVar, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f10853b, aVar.m());
            interfaceC2349d.a(f10854c, aVar.j());
            interfaceC2349d.a(f10855d, aVar.f());
            interfaceC2349d.a(f10856e, aVar.d());
            interfaceC2349d.a(f10857f, aVar.l());
            interfaceC2349d.a(f10858g, aVar.k());
            interfaceC2349d.a(f10859h, aVar.h());
            interfaceC2349d.a(f10860i, aVar.e());
            interfaceC2349d.a(f10861j, aVar.g());
            interfaceC2349d.a(f10862k, aVar.c());
            interfaceC2349d.a(f10863l, aVar.i());
            interfaceC2349d.a(f10864m, aVar.b());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    /* renamed from: L6.b$b, reason: collision with other inner class name */
    private static final class C0183b implements InterfaceC2348c<n> {

        /* renamed from: a, reason: collision with root package name */
        static final C0183b f10865a = new C0183b();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f10866b = C2347b.d("logRequest");

        private C0183b() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(n nVar, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f10866b, nVar.c());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    private static final class c implements InterfaceC2348c<o> {

        /* renamed from: a, reason: collision with root package name */
        static final c f10867a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f10868b = C2347b.d("clientType");

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f10869c = C2347b.d("androidClientInfo");

        private c() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(o oVar, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f10868b, oVar.c());
            interfaceC2349d.a(f10869c, oVar.b());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    private static final class d implements InterfaceC2348c<p> {

        /* renamed from: a, reason: collision with root package name */
        static final d f10870a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f10871b = C2347b.d("privacyContext");

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f10872c = C2347b.d("productIdOrigin");

        private d() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p pVar, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f10871b, pVar.b());
            interfaceC2349d.a(f10872c, pVar.c());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    private static final class e implements InterfaceC2348c<q> {

        /* renamed from: a, reason: collision with root package name */
        static final e f10873a = new e();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f10874b = C2347b.d("clearBlob");

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f10875c = C2347b.d("encryptedBlob");

        private e() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(q qVar, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f10874b, qVar.b());
            interfaceC2349d.a(f10875c, qVar.c());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    private static final class f implements InterfaceC2348c<r> {

        /* renamed from: a, reason: collision with root package name */
        static final f f10876a = new f();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f10877b = C2347b.d("originAssociatedProductId");

        private f() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(r rVar, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f10877b, rVar.b());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    private static final class g implements InterfaceC2348c<s> {

        /* renamed from: a, reason: collision with root package name */
        static final g f10878a = new g();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f10879b = C2347b.d("prequest");

        private g() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(s sVar, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f10879b, sVar.b());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    private static final class h implements InterfaceC2348c<t> {

        /* renamed from: a, reason: collision with root package name */
        static final h f10880a = new h();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f10881b = C2347b.d("eventTimeMs");

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f10882c = C2347b.d("eventCode");

        /* renamed from: d, reason: collision with root package name */
        private static final C2347b f10883d = C2347b.d("complianceData");

        /* renamed from: e, reason: collision with root package name */
        private static final C2347b f10884e = C2347b.d("eventUptimeMs");

        /* renamed from: f, reason: collision with root package name */
        private static final C2347b f10885f = C2347b.d("sourceExtension");

        /* renamed from: g, reason: collision with root package name */
        private static final C2347b f10886g = C2347b.d("sourceExtensionJsonProto3");

        /* renamed from: h, reason: collision with root package name */
        private static final C2347b f10887h = C2347b.d("timezoneOffsetSeconds");

        /* renamed from: i, reason: collision with root package name */
        private static final C2347b f10888i = C2347b.d("networkConnectionInfo");

        /* renamed from: j, reason: collision with root package name */
        private static final C2347b f10889j = C2347b.d("experimentIds");

        private h() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(t tVar, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.e(f10881b, tVar.d());
            interfaceC2349d.a(f10882c, tVar.c());
            interfaceC2349d.a(f10883d, tVar.b());
            interfaceC2349d.e(f10884e, tVar.e());
            interfaceC2349d.a(f10885f, tVar.h());
            interfaceC2349d.a(f10886g, tVar.i());
            interfaceC2349d.e(f10887h, tVar.j());
            interfaceC2349d.a(f10888i, tVar.g());
            interfaceC2349d.a(f10889j, tVar.f());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    private static final class i implements InterfaceC2348c<u> {

        /* renamed from: a, reason: collision with root package name */
        static final i f10890a = new i();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f10891b = C2347b.d("requestTimeMs");

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f10892c = C2347b.d("requestUptimeMs");

        /* renamed from: d, reason: collision with root package name */
        private static final C2347b f10893d = C2347b.d("clientInfo");

        /* renamed from: e, reason: collision with root package name */
        private static final C2347b f10894e = C2347b.d("logSource");

        /* renamed from: f, reason: collision with root package name */
        private static final C2347b f10895f = C2347b.d("logSourceName");

        /* renamed from: g, reason: collision with root package name */
        private static final C2347b f10896g = C2347b.d("logEvent");

        /* renamed from: h, reason: collision with root package name */
        private static final C2347b f10897h = C2347b.d("qosTier");

        private i() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(u uVar, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.e(f10891b, uVar.g());
            interfaceC2349d.e(f10892c, uVar.h());
            interfaceC2349d.a(f10893d, uVar.b());
            interfaceC2349d.a(f10894e, uVar.d());
            interfaceC2349d.a(f10895f, uVar.e());
            interfaceC2349d.a(f10896g, uVar.c());
            interfaceC2349d.a(f10897h, uVar.f());
        }
    }

    /* compiled from: AutoBatchedLogRequestEncoder.java */
    private static final class j implements InterfaceC2348c<w> {

        /* renamed from: a, reason: collision with root package name */
        static final j f10898a = new j();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f10899b = C2347b.d("networkType");

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f10900c = C2347b.d("mobileSubtype");

        private j() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(w wVar, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f10899b, wVar.c());
            interfaceC2349d.a(f10900c, wVar.b());
        }
    }

    private b() {
    }

    @Override // d9.InterfaceC3083a
    public void a(InterfaceC3084b<?> interfaceC3084b) {
        C0183b c0183b = C0183b.f10865a;
        interfaceC3084b.a(n.class, c0183b);
        interfaceC3084b.a(L6.d.class, c0183b);
        i iVar = i.f10890a;
        interfaceC3084b.a(u.class, iVar);
        interfaceC3084b.a(k.class, iVar);
        c cVar = c.f10867a;
        interfaceC3084b.a(o.class, cVar);
        interfaceC3084b.a(L6.e.class, cVar);
        a aVar = a.f10852a;
        interfaceC3084b.a(L6.a.class, aVar);
        interfaceC3084b.a(L6.c.class, aVar);
        h hVar = h.f10880a;
        interfaceC3084b.a(t.class, hVar);
        interfaceC3084b.a(L6.j.class, hVar);
        d dVar = d.f10870a;
        interfaceC3084b.a(p.class, dVar);
        interfaceC3084b.a(L6.f.class, dVar);
        g gVar = g.f10878a;
        interfaceC3084b.a(s.class, gVar);
        interfaceC3084b.a(L6.i.class, gVar);
        f fVar = f.f10876a;
        interfaceC3084b.a(r.class, fVar);
        interfaceC3084b.a(L6.h.class, fVar);
        j jVar = j.f10898a;
        interfaceC3084b.a(w.class, jVar);
        interfaceC3084b.a(m.class, jVar);
        e eVar = e.f10873a;
        interfaceC3084b.a(q.class, eVar);
        interfaceC3084b.a(L6.g.class, eVar);
    }
}
