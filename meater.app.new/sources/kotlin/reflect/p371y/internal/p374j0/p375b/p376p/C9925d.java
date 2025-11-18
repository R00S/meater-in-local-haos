package kotlin.reflect.p371y.internal.p374j0.p375b.p376p;

import java.util.List;
import kotlin.collections.C10815t;
import kotlin.collections.C10817u;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10585e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10738y;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10248e;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10330n;

/* compiled from: FunctionClassScope.kt */
/* renamed from: kotlin.f0.y.e.j0.b.p.d */
/* loaded from: classes2.dex */
public final class C9925d extends AbstractC10248e {

    /* compiled from: FunctionClassScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.p.d$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37661a;

        static {
            int[] iArr = new int[EnumC9924c.values().length];
            iArr[EnumC9924c.f37650g.ordinal()] = 1;
            iArr[EnumC9924c.f37651h.ordinal()] = 2;
            f37661a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9925d(InterfaceC10330n interfaceC10330n, C9923b c9923b) {
        super(interfaceC10330n, c9923b);
        C9801m.m32346f(interfaceC10330n, "storageManager");
        C9801m.m32346f(c9923b, "containingClass");
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10248e
    /* renamed from: i */
    protected List<InterfaceC10738y> mo32904i() {
        InterfaceC10585e interfaceC10585eM36156l = m36156l();
        C9801m.m32344d(interfaceC10585eM36156l, "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        int i2 = a.f37661a[((C9923b) interfaceC10585eM36156l).m32871V0().ordinal()];
        return i2 != 1 ? i2 != 2 ? C10817u.m38888j() : C10815t.m38883e(C9926e.f37662J.m32910a((C9923b) m36156l(), true)) : C10815t.m38883e(C9926e.f37662J.m32910a((C9923b) m36156l(), false));
    }
}
