package M6;

import c9.C2347b;
import c9.InterfaceC2348c;
import c9.InterfaceC2349d;
import d9.InterfaceC3083a;
import d9.InterfaceC3084b;
import f9.C3347a;

/* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
/* loaded from: classes2.dex */
public final class a implements InterfaceC3083a {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC3083a f12025a = new a();

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    /* renamed from: M6.a$a, reason: collision with other inner class name */
    private static final class C0187a implements InterfaceC2348c<P6.a> {

        /* renamed from: a, reason: collision with root package name */
        static final C0187a f12026a = new C0187a();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f12027b = C2347b.a("window").b(C3347a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f12028c = C2347b.a("logSourceMetrics").b(C3347a.b().c(2).a()).a();

        /* renamed from: d, reason: collision with root package name */
        private static final C2347b f12029d = C2347b.a("globalMetrics").b(C3347a.b().c(3).a()).a();

        /* renamed from: e, reason: collision with root package name */
        private static final C2347b f12030e = C2347b.a("appNamespace").b(C3347a.b().c(4).a()).a();

        private C0187a() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(P6.a aVar, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f12027b, aVar.d());
            interfaceC2349d.a(f12028c, aVar.c());
            interfaceC2349d.a(f12029d, aVar.b());
            interfaceC2349d.a(f12030e, aVar.a());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    private static final class b implements InterfaceC2348c<P6.b> {

        /* renamed from: a, reason: collision with root package name */
        static final b f12031a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f12032b = C2347b.a("storageMetrics").b(C3347a.b().c(1).a()).a();

        private b() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(P6.b bVar, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f12032b, bVar.a());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    private static final class c implements InterfaceC2348c<P6.c> {

        /* renamed from: a, reason: collision with root package name */
        static final c f12033a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f12034b = C2347b.a("eventsDroppedCount").b(C3347a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f12035c = C2347b.a("reason").b(C3347a.b().c(3).a()).a();

        private c() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(P6.c cVar, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.e(f12034b, cVar.a());
            interfaceC2349d.a(f12035c, cVar.b());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    private static final class d implements InterfaceC2348c<P6.d> {

        /* renamed from: a, reason: collision with root package name */
        static final d f12036a = new d();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f12037b = C2347b.a("logSource").b(C3347a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f12038c = C2347b.a("logEventDropped").b(C3347a.b().c(2).a()).a();

        private d() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(P6.d dVar, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f12037b, dVar.b());
            interfaceC2349d.a(f12038c, dVar.a());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    private static final class e implements InterfaceC2348c<m> {

        /* renamed from: a, reason: collision with root package name */
        static final e f12039a = new e();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f12040b = C2347b.d("clientMetrics");

        private e() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(m mVar, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f12040b, mVar.b());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    private static final class f implements InterfaceC2348c<P6.e> {

        /* renamed from: a, reason: collision with root package name */
        static final f f12041a = new f();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f12042b = C2347b.a("currentCacheSizeBytes").b(C3347a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f12043c = C2347b.a("maxCacheSizeBytes").b(C3347a.b().c(2).a()).a();

        private f() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(P6.e eVar, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.e(f12042b, eVar.a());
            interfaceC2349d.e(f12043c, eVar.b());
        }
    }

    /* compiled from: AutoProtoEncoderDoNotUseEncoder.java */
    private static final class g implements InterfaceC2348c<P6.f> {

        /* renamed from: a, reason: collision with root package name */
        static final g f12044a = new g();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f12045b = C2347b.a("startMs").b(C3347a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f12046c = C2347b.a("endMs").b(C3347a.b().c(2).a()).a();

        private g() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(P6.f fVar, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.e(f12045b, fVar.b());
            interfaceC2349d.e(f12046c, fVar.a());
        }
    }

    private a() {
    }

    @Override // d9.InterfaceC3083a
    public void a(InterfaceC3084b<?> interfaceC3084b) {
        interfaceC3084b.a(m.class, e.f12039a);
        interfaceC3084b.a(P6.a.class, C0187a.f12026a);
        interfaceC3084b.a(P6.f.class, g.f12044a);
        interfaceC3084b.a(P6.d.class, d.f12036a);
        interfaceC3084b.a(P6.c.class, c.f12033a);
        interfaceC3084b.a(P6.b.class, b.f12031a);
        interfaceC3084b.a(P6.e.class, f.f12041a);
    }
}
