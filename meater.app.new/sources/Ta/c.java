package Ta;

import Ra.InterfaceC1692e;
import Ra.g0;
import kotlin.jvm.internal.C3862t;

/* compiled from: PlatformDependentDeclarationFilter.kt */
/* loaded from: classes3.dex */
public interface c {

    /* compiled from: PlatformDependentDeclarationFilter.kt */
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f16660a = new a();

        private a() {
        }

        @Override // Ta.c
        public boolean e(InterfaceC1692e classDescriptor, g0 functionDescriptor) {
            C3862t.g(classDescriptor, "classDescriptor");
            C3862t.g(functionDescriptor, "functionDescriptor");
            return true;
        }
    }

    /* compiled from: PlatformDependentDeclarationFilter.kt */
    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f16661a = new b();

        private b() {
        }

        @Override // Ta.c
        public boolean e(InterfaceC1692e classDescriptor, g0 functionDescriptor) {
            C3862t.g(classDescriptor, "classDescriptor");
            C3862t.g(functionDescriptor, "functionDescriptor");
            return !functionDescriptor.getAnnotations().P(d.a());
        }
    }

    boolean e(InterfaceC1692e interfaceC1692e, g0 g0Var);
}
