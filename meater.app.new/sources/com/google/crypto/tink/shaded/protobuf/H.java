package com.google.crypto.tink.shaded.protobuf;

/* compiled from: ManifestSchemaFactory.java */
/* loaded from: classes2.dex */
final class H implements g0 {

    /* renamed from: b, reason: collision with root package name */
    private static final O f37739b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final O f37740a;

    /* compiled from: ManifestSchemaFactory.java */
    class a implements O {
        a() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.O
        public N a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.O
        public boolean b(Class<?> cls) {
            return false;
        }
    }

    /* compiled from: ManifestSchemaFactory.java */
    private static class b implements O {

        /* renamed from: a, reason: collision with root package name */
        private O[] f37741a;

        b(O... oArr) {
            this.f37741a = oArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.O
        public N a(Class<?> cls) {
            for (O o10 : this.f37741a) {
                if (o10.b(cls)) {
                    return o10.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.O
        public boolean b(Class<?> cls) {
            for (O o10 : this.f37741a) {
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
        return new b(C2912w.c(), c());
    }

    private static O c() {
        try {
            return (O) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f37739b;
        }
    }

    private static boolean d(N n10) {
        return n10.getSyntax() == a0.PROTO2;
    }

    private static <T> f0<T> e(Class<T> cls, N n10) {
        return AbstractC2913x.class.isAssignableFrom(cls) ? d(n10) ? T.U(cls, n10, X.b(), F.b(), h0.M(), r.b(), M.b()) : T.U(cls, n10, X.b(), F.b(), h0.M(), null, M.b()) : d(n10) ? T.U(cls, n10, X.a(), F.a(), h0.H(), r.a(), M.a()) : T.U(cls, n10, X.a(), F.a(), h0.I(), null, M.a());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.g0
    public <T> f0<T> a(Class<T> cls) {
        h0.J(cls);
        N nA = this.f37740a.a(cls);
        return nA.a() ? AbstractC2913x.class.isAssignableFrom(cls) ? U.m(h0.M(), r.b(), nA.b()) : U.m(h0.H(), r.a(), nA.b()) : e(cls, nA);
    }

    private H(O o10) {
        this.f37740a = (O) C2915z.b(o10, "messageInfoFactory");
    }
}
