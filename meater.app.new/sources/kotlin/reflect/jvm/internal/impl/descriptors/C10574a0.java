package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.C10775u;
import kotlin.jvm.internal.C9801m;

/* compiled from: InvalidModuleException.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.a0 */
/* loaded from: classes2.dex */
public final class C10574a0 {

    /* renamed from: a */
    private static final C10589f0<InterfaceC10577b0> f40727a = new C10589f0<>("InvalidModuleNotifier");

    /* renamed from: a */
    public static final void m37666a(InterfaceC10592g0 interfaceC10592g0) {
        C10775u c10775u;
        C9801m.m32346f(interfaceC10592g0, "<this>");
        InterfaceC10577b0 interfaceC10577b0 = (InterfaceC10577b0) interfaceC10592g0.mo37016I0(f40727a);
        if (interfaceC10577b0 != null) {
            interfaceC10577b0.m37668a(interfaceC10592g0);
            c10775u = C10775u.f41439a;
        } else {
            c10775u = null;
        }
        if (c10775u != null) {
            return;
        }
        throw new InvalidModuleException("Accessing invalid module descriptor " + interfaceC10592g0);
    }
}
