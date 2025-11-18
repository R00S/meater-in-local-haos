package S8;

import c9.C2347b;
import c9.InterfaceC2348c;
import c9.InterfaceC2349d;
import d9.InterfaceC3083a;
import d9.InterfaceC3084b;

/* compiled from: AutoRolloutAssignmentEncoder.java */
/* loaded from: classes2.dex */
public final class a implements InterfaceC3083a {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC3083a f15520a = new a();

    /* compiled from: AutoRolloutAssignmentEncoder.java */
    /* renamed from: S8.a$a, reason: collision with other inner class name */
    private static final class C0226a implements InterfaceC2348c<j> {

        /* renamed from: a, reason: collision with root package name */
        static final C0226a f15521a = new C0226a();

        /* renamed from: b, reason: collision with root package name */
        private static final C2347b f15522b = C2347b.d("rolloutId");

        /* renamed from: c, reason: collision with root package name */
        private static final C2347b f15523c = C2347b.d("parameterKey");

        /* renamed from: d, reason: collision with root package name */
        private static final C2347b f15524d = C2347b.d("parameterValue");

        /* renamed from: e, reason: collision with root package name */
        private static final C2347b f15525e = C2347b.d("variantId");

        /* renamed from: f, reason: collision with root package name */
        private static final C2347b f15526f = C2347b.d("templateVersion");

        private C0226a() {
        }

        @Override // c9.InterfaceC2348c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(j jVar, InterfaceC2349d interfaceC2349d) {
            interfaceC2349d.a(f15522b, jVar.e());
            interfaceC2349d.a(f15523c, jVar.c());
            interfaceC2349d.a(f15524d, jVar.d());
            interfaceC2349d.a(f15525e, jVar.g());
            interfaceC2349d.e(f15526f, jVar.f());
        }
    }

    private a() {
    }

    @Override // d9.InterfaceC3083a
    public void a(InterfaceC3084b<?> interfaceC3084b) {
        C0226a c0226a = C0226a.f15521a;
        interfaceC3084b.a(j.class, c0226a);
        interfaceC3084b.a(b.class, c0226a);
    }
}
