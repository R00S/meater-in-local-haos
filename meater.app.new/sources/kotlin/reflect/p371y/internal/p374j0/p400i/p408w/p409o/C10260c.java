package kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573a;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;

/* compiled from: ContextReceiver.kt */
/* renamed from: kotlin.f0.y.e.j0.i.w.o.c */
/* loaded from: classes3.dex */
public final class C10260c extends AbstractC10258a implements InterfaceC10263f {

    /* renamed from: c */
    private final InterfaceC10573a f39690c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10260c(InterfaceC10573a interfaceC10573a, AbstractC10344e0 abstractC10344e0, InterfaceC10263f interfaceC10263f) {
        super(abstractC10344e0, interfaceC10263f);
        C9801m.m32346f(interfaceC10573a, "declarationDescriptor");
        C9801m.m32346f(abstractC10344e0, "receiverType");
        this.f39690c = interfaceC10573a;
    }

    /* renamed from: c */
    public InterfaceC10573a m36180c() {
        return this.f39690c;
    }

    public String toString() {
        return "Cxt { " + m36180c() + " }";
    }
}
