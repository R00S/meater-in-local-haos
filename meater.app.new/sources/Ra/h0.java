package Ra;

/* compiled from: SourceElement.java */
/* loaded from: classes3.dex */
public interface h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final h0 f15158a = new a();

    /* compiled from: SourceElement.java */
    static class a implements h0 {
        a() {
        }

        private static /* synthetic */ void d(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"));
        }

        @Override // Ra.h0
        public i0 a() {
            i0 i0Var = i0.f15159a;
            if (i0Var == null) {
                d(0);
            }
            return i0Var;
        }

        public String toString() {
            return "NO_SOURCE";
        }
    }

    i0 a();
}
