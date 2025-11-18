package kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o;

import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10344e0;

/* compiled from: ContextClassReceiver.kt */
/* renamed from: kotlin.f0.y.e.j0.i.w.o.b */
/* loaded from: classes3.dex */
public final class C10259b extends AbstractC10258a implements InterfaceC10263f {

    /* renamed from: c */
    private final InterfaceC10585e f39689c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10259b(InterfaceC10585e interfaceC10585e, AbstractC10344e0 abstractC10344e0, InterfaceC10263f interfaceC10263f) {
        super(abstractC10344e0, interfaceC10263f);
        C9801m.m32346f(interfaceC10585e, "classDescriptor");
        C9801m.m32346f(abstractC10344e0, "receiverType");
        this.f39689c = interfaceC10585e;
    }

    public String toString() {
        return getType() + ": Ctx { " + this.f39689c + " }";
    }
}
