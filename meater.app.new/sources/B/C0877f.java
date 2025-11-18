package B;

import kotlin.C1560o;
import kotlin.InterfaceC0971j;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;

/* compiled from: LazyGridBeyondBoundsModifier.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LB/I;", "state", "LC/j;", "a", "(LB/I;LO/l;I)LC/j;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: B.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0877f {
    public static final InterfaceC0971j a(I i10, InterfaceC1554l interfaceC1554l, int i11) {
        if (C1560o.J()) {
            C1560o.S(2004349821, i11, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridBeyondBoundsState (LazyGridBeyondBoundsModifier.kt:23)");
        }
        boolean z10 = (((i11 & 14) ^ 6) > 4 && interfaceC1554l.R(i10)) || (i11 & 6) == 4;
        Object objF = interfaceC1554l.f();
        if (z10 || objF == InterfaceC1554l.INSTANCE.a()) {
            objF = new C0878g(i10);
            interfaceC1554l.J(objF);
        }
        C0878g c0878g = (C0878g) objF;
        if (C1560o.J()) {
            C1560o.R();
        }
        return c0878g;
    }
}
