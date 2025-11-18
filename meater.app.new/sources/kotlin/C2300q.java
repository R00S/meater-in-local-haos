package kotlin;

import Ba.p;
import Xb.InterfaceC1867v0;
import cc.C2357B;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import ta.g;

/* compiled from: SafeCollector.common.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\"\u0010\b\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0080\u0010¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lbc/o;", "Lta/g;", "currentContext", "Loa/F;", "a", "(Lbc/o;Lta/g;)V", "LXb/v0;", "collectJob", "b", "(LXb/v0;LXb/v0;)LXb/v0;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: bc.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2300q {

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "count", "Lta/g$b;", "element", "a", "(ILta/g$b;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: bc.q$a */
    static final class a extends AbstractC3864v implements p<Integer, g.b, Integer> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ C2299o<?> f30794B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C2299o<?> c2299o) {
            super(2);
            this.f30794B = c2299o;
        }

        public final Integer a(int i10, g.b bVar) {
            g.c<?> key = bVar.getKey();
            g.b bVarB = this.f30794B.collectContext.b(key);
            if (key != InterfaceC1867v0.INSTANCE) {
                return Integer.valueOf(bVar != bVarB ? Integer.MIN_VALUE : i10 + 1);
            }
            InterfaceC1867v0 interfaceC1867v0 = (InterfaceC1867v0) bVarB;
            C3862t.e(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
            InterfaceC1867v0 interfaceC1867v0B = C2300q.b((InterfaceC1867v0) bVar, interfaceC1867v0);
            if (interfaceC1867v0B == interfaceC1867v0) {
                if (interfaceC1867v0 != null) {
                    i10++;
                }
                return Integer.valueOf(i10);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + interfaceC1867v0B + ", expected child of " + interfaceC1867v0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, g.b bVar) {
            return a(num.intValue(), bVar);
        }
    }

    public static final void a(C2299o<?> c2299o, g gVar) {
        if (((Number) gVar.L(0, new a(c2299o))).intValue() == c2299o.collectContextSize) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + c2299o.collectContext + ",\n\t\tbut emission happened in " + gVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final InterfaceC1867v0 b(InterfaceC1867v0 interfaceC1867v0, InterfaceC1867v0 interfaceC1867v02) {
        while (interfaceC1867v0 != null) {
            if (interfaceC1867v0 == interfaceC1867v02) {
                return interfaceC1867v0;
            }
            if (!(interfaceC1867v0 instanceof C2357B)) {
                return interfaceC1867v0;
            }
            interfaceC1867v0 = interfaceC1867v0.getParent();
        }
        return null;
    }
}
