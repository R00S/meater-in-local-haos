package androidx.datastore.preferences.protobuf;

/* compiled from: ManifestSchemaFactory.java */
/* loaded from: classes.dex */
final class H implements g0 {

    /* renamed from: b, reason: collision with root package name */
    private static final O f24854b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final O f24855a;

    /* compiled from: ManifestSchemaFactory.java */
    static class a implements O {
        a() {
        }

        @Override // androidx.datastore.preferences.protobuf.O
        public N a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // androidx.datastore.preferences.protobuf.O
        public boolean b(Class<?> cls) {
            return false;
        }
    }

    /* compiled from: ManifestSchemaFactory.java */
    private static class b implements O {

        /* renamed from: a, reason: collision with root package name */
        private O[] f24856a;

        b(O... oArr) {
            this.f24856a = oArr;
        }

        @Override // androidx.datastore.preferences.protobuf.O
        public N a(Class<?> cls) {
            for (O o10 : this.f24856a) {
                if (o10.b(cls)) {
                    return o10.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // androidx.datastore.preferences.protobuf.O
        public boolean b(Class<?> cls) {
            for (O o10 : this.f24856a) {
                if (o10.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public H() {
        this(b());
    }

    private static O b() {
        return new b(C2076w.c(), c());
    }

    private static O c() {
        try {
            return (O) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f24854b;
        }
    }

    private static boolean d(N n10) {
        return n10.getSyntax() == a0.PROTO2;
    }

    private static <T> f0<T> e(Class<T> cls, N n10) {
        return AbstractC2077x.class.isAssignableFrom(cls) ? d(n10) ? T.N(cls, n10, X.b(), F.b(), h0.M(), r.b(), M.b()) : T.N(cls, n10, X.b(), F.b(), h0.M(), null, M.b()) : d(n10) ? T.N(cls, n10, X.a(), F.a(), h0.H(), r.a(), M.a()) : T.N(cls, n10, X.a(), F.a(), h0.I(), null, M.a());
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public <T> f0<T> a(Class<T> cls) {
        h0.J(cls);
        N nA = this.f24855a.a(cls);
        return nA.a() ? AbstractC2077x.class.isAssignableFrom(cls) ? U.l(h0.M(), r.b(), nA.b()) : U.l(h0.H(), r.a(), nA.b()) : e(cls, nA);
    }

    private H(O o10) {
        this.f24855a = (O) C2079z.b(o10, "messageInfoFactory");
    }
}
