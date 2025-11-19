package Sa;

/* compiled from: AnnotatedImpl.java */
/* loaded from: classes3.dex */
public class b implements a {

    /* renamed from: B, reason: collision with root package name */
    private final h f15608B;

    public b(h hVar) {
        if (hVar == null) {
            H(0);
        }
        this.f15608B = hVar;
    }

    private static /* synthetic */ void H(int i10) {
        String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 1 ? 3 : 2];
        if (i10 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i10 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i10 != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 1) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // Sa.a
    public h getAnnotations() {
        h hVar = this.f15608B;
        if (hVar == null) {
            H(1);
        }
        return hVar;
    }
}
