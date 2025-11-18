package kotlin.reflect.p371y.internal.p374j0.p422m;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;

/* compiled from: modifierChecks.kt */
/* renamed from: kotlin.f0.y.e.j0.m.f */
/* loaded from: classes3.dex */
public interface InterfaceC10470f {

    /* compiled from: modifierChecks.kt */
    /* renamed from: kotlin.f0.y.e.j0.m.f$a */
    public static final class a {
        /* renamed from: a */
        public static String m37196a(InterfaceC10470f interfaceC10470f, InterfaceC10738y interfaceC10738y) {
            C9801m.m32346f(interfaceC10738y, "functionDescriptor");
            if (interfaceC10470f.mo37195b(interfaceC10738y)) {
                return null;
            }
            return interfaceC10470f.getDescription();
        }
    }

    /* renamed from: a */
    String mo37194a(InterfaceC10738y interfaceC10738y);

    /* renamed from: b */
    boolean mo37195b(InterfaceC10738y interfaceC10738y);

    String getDescription();
}
