package kotlin.reflect.jvm.internal.impl.descriptors.p430n1;

/* compiled from: AnnotatedImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n1.b */
/* loaded from: classes2.dex */
public class C10615b implements InterfaceC10614a {

    /* renamed from: f */
    private final InterfaceC10620g f40787f;

    public C10615b(InterfaceC10620g interfaceC10620g) {
        if (interfaceC10620g == null) {
            m37726v(0);
        }
        this.f40787f = interfaceC10620g;
    }

    /* renamed from: v */
    private static /* synthetic */ void m37726v(int i2) {
        String str = i2 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i2 != 1 ? 3 : 2];
        if (i2 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i2 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i2 != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i2 == 1) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10614a
    public InterfaceC10620g getAnnotations() {
        InterfaceC10620g interfaceC10620g = this.f40787f;
        if (interfaceC10620g == null) {
            m37726v(1);
        }
        return interfaceC10620g;
    }
}
