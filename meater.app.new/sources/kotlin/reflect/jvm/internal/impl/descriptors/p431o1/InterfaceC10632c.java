package kotlin.reflect.jvm.internal.impl.descriptors.p431o1;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10739y0;

/* compiled from: PlatformDependentDeclarationFilter.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.o1.c */
/* loaded from: classes2.dex */
public interface InterfaceC10632c {

    /* compiled from: PlatformDependentDeclarationFilter.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.o1.c$a */
    public static final class a implements InterfaceC10632c {

        /* renamed from: a */
        public static final a f40890a = new a();

        private a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10632c
        /* renamed from: c */
        public boolean mo32981c(InterfaceC10585e interfaceC10585e, InterfaceC10739y0 interfaceC10739y0) {
            C9801m.m32346f(interfaceC10585e, "classDescriptor");
            C9801m.m32346f(interfaceC10739y0, "functionDescriptor");
            return true;
        }
    }

    /* compiled from: PlatformDependentDeclarationFilter.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.o1.c$b */
    public static final class b implements InterfaceC10632c {

        /* renamed from: a */
        public static final b f40891a = new b();

        private b() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10632c
        /* renamed from: c */
        public boolean mo32981c(InterfaceC10585e interfaceC10585e, InterfaceC10739y0 interfaceC10739y0) {
            C9801m.m32346f(interfaceC10585e, "classDescriptor");
            C9801m.m32346f(interfaceC10739y0, "functionDescriptor");
            return !interfaceC10739y0.getAnnotations().mo33270R0(C10633d.m37747a());
        }
    }

    /* renamed from: c */
    boolean mo32981c(InterfaceC10585e interfaceC10585e, InterfaceC10739y0 interfaceC10739y0);
}
