package kotlin.reflect.jvm.internal.impl.descriptors;

/* compiled from: SourceElement.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.z0 */
/* loaded from: classes2.dex */
public interface InterfaceC10741z0 {

    /* renamed from: a */
    public static final InterfaceC10741z0 f41247a = new a();

    /* compiled from: SourceElement.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.z0$a */
    static class a implements InterfaceC10741z0 {
        a() {
        }

        /* renamed from: d */
        private static /* synthetic */ void m38164d(int i2) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"));
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10741z0
        /* renamed from: a */
        public InterfaceC10575a1 mo33980a() {
            InterfaceC10575a1 interfaceC10575a1 = InterfaceC10575a1.f40728a;
            if (interfaceC10575a1 == null) {
                m38164d(0);
            }
            return interfaceC10575a1;
        }

        public String toString() {
            return "NO_SOURCE";
        }
    }

    /* renamed from: a */
    InterfaceC10575a1 mo33980a();
}
