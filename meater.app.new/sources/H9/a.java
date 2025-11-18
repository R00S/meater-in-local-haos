package H9;

import c9.C2347b;
import c9.InterfaceC2348c;
import c9.InterfaceC2349d;
import d9.InterfaceC3083a;
import d9.InterfaceC3084b;

/* compiled from: AutoRolloutAssignmentEncoder.java */
/* loaded from: classes2.dex */
public final class a implements InterfaceC3083a {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC3083a f5607a = new a();

    /* compiled from: AutoRolloutAssignmentEncoder.java */
    /* renamed from: H9.a$a, reason: collision with other inner class name */
    private static final class C0108a implements InterfaceC2348c<d> {

        /* renamed from: a, reason: collision with root package name */
        static final C0108a f5608a = new C0108a();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f5609b = C2347b.d("rolloutId");

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f5610c = C2347b.d("variantId");

        /* renamed from: d, reason: collision with root package name */
        private static final C2347b f5611d = C2347b.d("parameterKey");

        /* renamed from: e, reason: collision with root package name */
        private static final C2347b f5612e = C2347b.d("parameterValue");

        /* renamed from: f, reason: collision with root package name */
        private static final C2347b f5613f = C2347b.d("templateVersion");

        private C0108a() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(d dVar, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f5609b, dVar.d());
            interfaceC2349d.a(f5610c, dVar.f());
            interfaceC2349d.a(f5611d, dVar.b());
            interfaceC2349d.a(f5612e, dVar.c());
            interfaceC2349d.e(f5613f, dVar.e());
        }
    }

    private a() {
    }

    @Override // d9.InterfaceC3083a
    public void a(InterfaceC3084b<?> interfaceC3084b) {
        C0108a c0108a = C0108a.f5608a;
        interfaceC3084b.a(d.class, c0108a);
        interfaceC3084b.a(b.class, c0108a);
    }
}
