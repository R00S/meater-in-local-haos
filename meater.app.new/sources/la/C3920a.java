package la;

import Ba.p;
import Xb.C1837g;
import Xb.C1841i;
import Xb.E;
import Xb.G0;
import Xb.I;
import Xb.InterfaceC1867v0;
import ha.C3502b;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import ta.InterfaceC4588d;

/* compiled from: Threading.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a8\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aG\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\b\b\u0002\u0010\u000b\u001a\u00020\n2\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"LXb/I;", "Lkotlin/Function2;", "Lta/d;", "Loa/F;", "", "block", "LXb/v0;", "b", "(LXb/I;LBa/p;)LXb/v0;", "T", "", "immediate", "c", "(ZLBa/p;Lta/d;)Ljava/lang/Object;", "LXb/E;", "a", "(Z)LXb/E;", "uniflow-core"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* renamed from: la.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3920a {
    private static final E a(boolean z10) {
        if (z10) {
            C3502b c3502b = C3502b.f42369a;
            if (c3502b.a().a() instanceof G0) {
                return ((G0) c3502b.a().a()).M0();
            }
        }
        return C3502b.f42369a.a().a();
    }

    public static final InterfaceC1867v0 b(I i10, p<? super I, ? super InterfaceC4588d<? super C4153F>, ? extends Object> block) {
        C3862t.g(i10, "<this>");
        C3862t.g(block, "block");
        return C1841i.d(i10, C3502b.f42369a.a().a(), null, block, 2, null);
    }

    public static final <T> Object c(boolean z10, p<? super I, ? super InterfaceC4588d<? super T>, ? extends Object> pVar, InterfaceC4588d<? super T> interfaceC4588d) {
        return C1837g.g(a(z10), pVar, interfaceC4588d);
    }
}
