package kotlin.reflect.p371y.internal.p374j0.p375b;

import java.util.Set;
import kotlin.collections.C10782c0;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10187d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10235a;

/* compiled from: CompanionObjectMappingUtils.kt */
/* renamed from: kotlin.f0.y.e.j0.b.d */
/* loaded from: classes2.dex */
public final class C9910d {
    /* renamed from: a */
    public static final boolean m32702a(C9909c c9909c, InterfaceC10585e interfaceC10585e) {
        C9801m.m32346f(c9909c, "<this>");
        C9801m.m32346f(interfaceC10585e, "classDescriptor");
        if (C10187d.m35836x(interfaceC10585e)) {
            Set<C10159b> setM32701b = c9909c.m32701b();
            C10159b c10159bM36073g = C10235a.m36073g(interfaceC10585e);
            if (C10782c0.m38577K(setM32701b, c10159bM36073g != null ? c10159bM36073g.m35412g() : null)) {
                return true;
            }
        }
        return false;
    }
}
