package com.google.protobuf;

/* compiled from: ManifestSchemaFactory.java */
/* loaded from: classes2.dex */
final class H implements g0 {

    /* renamed from: b, reason: collision with root package name */
    private static final O f39172b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final O f39173a;

    /* compiled from: ManifestSchemaFactory.java */
    class a implements O {
        a() {
        }

        @Override // com.google.protobuf.O
        public N a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.protobuf.O
        public boolean b(Class<?> cls) {
            return false;
        }
    }

    /* compiled from: ManifestSchemaFactory.java */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f39174a;

        static {
            int[] iArr = new int[a0.values().length];
            f39174a = iArr;
            try {
                iArr[a0.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: ManifestSchemaFactory.java */
    private static class c implements O {

        /* renamed from: a, reason: collision with root package name */
        private O[] f39175a;

        c(O... oArr) {
            this.f39175a = oArr;
        }

        @Override // com.google.protobuf.O
        public N a(Class<?> cls) {
            for (O o10 : this.f39175a) {
                if (o10.b(cls)) {
                    return o10.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // com.google.protobuf.O
        public boolean b(Class<?> cls) {
            for (O o10 : this.f39175a) {
                if (o10.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public H() {
        this(c());
    }

    private static boolean b(N n10) {
        return b.f39174a[n10.getSyntax().ordinal()] != 1;
    }

    private static O c() {
        return new c(C2961v.c(), d());
    }

    private static O d() {
        try {
            return (O) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f39172b;
        }
    }

    private static <T> f0<T> e(Class<T> cls, N n10) {
        return AbstractC2962w.class.isAssignableFrom(cls) ? b(n10) ? T.O(cls, n10, X.b(), F.b(), h0.L(), C2957q.b(), M.b()) : T.O(cls, n10, X.b(), F.b(), h0.L(), null, M.b()) : b(n10) ? T.O(cls, n10, X.a(), F.a(), h0.K(), C2957q.a(), M.a()) : T.O(cls, n10, X.a(), F.a(), h0.K(), null, M.a());
    }

    @Override // com.google.protobuf.g0
    public <T> f0<T> a(Class<T> cls) {
        h0.H(cls);
        N nA = this.f39173a.a(cls);
        return nA.a() ? AbstractC2962w.class.isAssignableFrom(cls) ? U.l(h0.L(), C2957q.b(), nA.b()) : U.l(h0.K(), C2957q.a(), nA.b()) : e(cls, nA);
    }

    private H(O o10) {
        this.f39173a = (O) C2964y.b(o10, "messageInfoFactory");
    }
}
