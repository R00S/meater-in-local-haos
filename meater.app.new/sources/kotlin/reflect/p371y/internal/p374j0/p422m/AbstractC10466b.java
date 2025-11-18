package kotlin.reflect.p371y.internal.p374j0.p422m;

import java.util.List;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;
import kotlin.reflect.p371y.internal.p374j0.p422m.AbstractC10471g;

/* compiled from: modifierChecks.kt */
/* renamed from: kotlin.f0.y.e.j0.m.b */
/* loaded from: classes3.dex */
public abstract class AbstractC10466b {
    /* renamed from: a */
    public final AbstractC10471g m37186a(InterfaceC10738y interfaceC10738y) {
        C9801m.m32346f(interfaceC10738y, "functionDescriptor");
        for (C10472h c10472h : mo37187b()) {
            if (c10472h.m37199b(interfaceC10738y)) {
                return c10472h.m37198a(interfaceC10738y);
            }
        }
        return AbstractC10471g.a.f40407b;
    }

    /* renamed from: b */
    public abstract List<C10472h> mo37187b();
}
