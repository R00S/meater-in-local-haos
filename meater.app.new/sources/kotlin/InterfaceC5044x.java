package kotlin;

import Ba.p;
import kotlin.Metadata;
import oa.C4153F;
import ta.InterfaceC4588d;
import w.EnumC4950C;

/* compiled from: ScrollableState.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J>\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H¦@¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lx/x;", "", "Lw/C;", "scrollPriority", "Lkotlin/Function2;", "Lx/u;", "Lta/d;", "Loa/F;", "block", "b", "(Lw/C;LBa/p;Lta/d;)Ljava/lang/Object;", "", "delta", "f", "(F)F", "", "a", "()Z", "isScrollInProgress", "e", "canScrollForward", "c", "canScrollBackward", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: x.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5044x {
    static /* synthetic */ Object d(InterfaceC5044x interfaceC5044x, EnumC4950C enumC4950C, p pVar, InterfaceC4588d interfaceC4588d, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scroll");
        }
        if ((i10 & 1) != 0) {
            enumC4950C = EnumC4950C.Default;
        }
        return interfaceC5044x.b(enumC4950C, pVar, interfaceC4588d);
    }

    boolean a();

    Object b(EnumC4950C enumC4950C, p<? super InterfaceC5041u, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar, InterfaceC4588d<? super C4153F> interfaceC4588d);

    default boolean c() {
        return true;
    }

    default boolean e() {
        return true;
    }

    float f(float delta);
}
