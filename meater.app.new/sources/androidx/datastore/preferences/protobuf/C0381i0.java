package androidx.datastore.preferences.protobuf;

/* compiled from: ManifestSchemaFactory.java */
/* renamed from: androidx.datastore.preferences.protobuf.i0 */
/* loaded from: classes.dex */
final class C0381i0 implements InterfaceC0376g1 {

    /* renamed from: a */
    private static final InterfaceC0402p0 f2753a = new a();

    /* renamed from: b */
    private final InterfaceC0402p0 f2754b;

    /* compiled from: ManifestSchemaFactory.java */
    /* renamed from: androidx.datastore.preferences.protobuf.i0$a */
    static class a implements InterfaceC0402p0 {
        a() {
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0402p0
        /* renamed from: a */
        public InterfaceC0399o0 mo2816a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0402p0
        /* renamed from: b */
        public boolean mo2817b(Class<?> cls) {
            return false;
        }
    }

    /* compiled from: ManifestSchemaFactory.java */
    /* renamed from: androidx.datastore.preferences.protobuf.i0$b */
    private static class b implements InterfaceC0402p0 {

        /* renamed from: a */
        private InterfaceC0402p0[] f2755a;

        b(InterfaceC0402p0... interfaceC0402p0Arr) {
            this.f2755a = interfaceC0402p0Arr;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0402p0
        /* renamed from: a */
        public InterfaceC0399o0 mo2816a(Class<?> cls) {
            for (InterfaceC0402p0 interfaceC0402p0 : this.f2755a) {
                if (interfaceC0402p0.mo2817b(cls)) {
                    return interfaceC0402p0.mo2816a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0402p0
        /* renamed from: b */
        public boolean mo2817b(Class<?> cls) {
            for (InterfaceC0402p0 interfaceC0402p0 : this.f2755a) {
                if (interfaceC0402p0.mo2817b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C0381i0() {
        this(m2812b());
    }

    /* renamed from: b */
    private static InterfaceC0402p0 m2812b() {
        return new b(C0421x.m3325c(), m2813c());
    }

    /* renamed from: c */
    private static InterfaceC0402p0 m2813c() {
        try {
            return (InterfaceC0402p0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f2753a;
        }
    }

    /* renamed from: d */
    private static boolean m2814d(InterfaceC0399o0 interfaceC0399o0) {
        return interfaceC0399o0.mo2602c() == EnumC0358a1.PROTO2;
    }

    /* renamed from: e */
    private static <T> InterfaceC0373f1<T> m2815e(Class<T> cls, InterfaceC0399o0 interfaceC0399o0) {
        return AbstractC0423y.class.isAssignableFrom(cls) ? m2814d(interfaceC0399o0) ? C0414t0.m3228N(cls, interfaceC0399o0, C0422x0.m3327b(), AbstractC0375g0.m2702b(), C0379h1.m2766M(), C0410s.m3208b(), C0396n0.m3050b()) : C0414t0.m3228N(cls, interfaceC0399o0, C0422x0.m3327b(), AbstractC0375g0.m2702b(), C0379h1.m2766M(), null, C0396n0.m3050b()) : m2814d(interfaceC0399o0) ? C0414t0.m3228N(cls, interfaceC0399o0, C0422x0.m3326a(), AbstractC0375g0.m2701a(), C0379h1.m2761H(), C0410s.m3207a(), C0396n0.m3049a()) : C0414t0.m3228N(cls, interfaceC0399o0, C0422x0.m3326a(), AbstractC0375g0.m2701a(), C0379h1.m2762I(), null, C0396n0.m3049a());
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0376g1
    /* renamed from: a */
    public <T> InterfaceC0373f1<T> mo2709a(Class<T> cls) {
        C0379h1.m2763J(cls);
        InterfaceC0399o0 interfaceC0399o0Mo2816a = this.f2754b.mo2816a(cls);
        return interfaceC0399o0Mo2816a.mo2600a() ? AbstractC0423y.class.isAssignableFrom(cls) ? C0416u0.m3308l(C0379h1.m2766M(), C0410s.m3208b(), interfaceC0399o0Mo2816a.mo2601b()) : C0416u0.m3308l(C0379h1.m2761H(), C0410s.m3207a(), interfaceC0399o0Mo2816a.mo2601b()) : m2815e(cls, interfaceC0399o0Mo2816a);
    }

    private C0381i0(InterfaceC0402p0 interfaceC0402p0) {
        this.f2754b = (InterfaceC0402p0) C0357a0.m2557b(interfaceC0402p0, "messageInfoFactory");
    }
}
