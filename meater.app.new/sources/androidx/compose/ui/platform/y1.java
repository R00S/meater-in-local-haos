package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.WeakHashMap;
import kotlin.AbstractC1564q;
import kotlin.C1570t;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1562p;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: Wrapper.android.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\f\u001a\u00020\u000b*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0015"}, d2 = {"LA0/G;", "container", "LO/q;", "parent", "LO/T0;", "a", "(LA0/G;LO/q;)LO/T0;", "Landroidx/compose/ui/platform/a;", "Lkotlin/Function0;", "Loa/F;", "content", "LO/p;", "c", "(Landroidx/compose/ui/platform/a;LO/q;LBa/p;)LO/p;", "Landroidx/compose/ui/platform/q;", "owner", "b", "(Landroidx/compose/ui/platform/q;LO/q;LBa/p;)LO/p;", "Landroid/view/ViewGroup$LayoutParams;", "Landroid/view/ViewGroup$LayoutParams;", "DefaultLayoutParams", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    private static final ViewGroup.LayoutParams f23489a = new ViewGroup.LayoutParams(-2, -2);

    public static final kotlin.T0 a(A0.G g10, AbstractC1564q abstractC1564q) {
        return C1570t.b(new A0.D0(g10), abstractC1564q);
    }

    private static final InterfaceC1562p b(C2036q c2036q, AbstractC1564q abstractC1564q, Ba.p<? super InterfaceC1554l, ? super Integer, C4153F> pVar) {
        if (C2037q0.b()) {
            int i10 = b0.l.f29945K;
            if (c2036q.getTag(i10) == null) {
                c2036q.setTag(i10, Collections.newSetFromMap(new WeakHashMap()));
            }
        }
        InterfaceC1562p interfaceC1562pA = C1570t.a(new A0.D0(c2036q.getRoot()), abstractC1564q);
        View view = c2036q.getView();
        int i11 = b0.l.f29946L;
        Object tag = view.getTag(i11);
        w1 w1Var = tag instanceof w1 ? (w1) tag : null;
        if (w1Var == null) {
            w1Var = new w1(c2036q, interfaceC1562pA);
            c2036q.getView().setTag(i11, w1Var);
        }
        w1Var.k(pVar);
        if (!C3862t.b(c2036q.getCoroutineContext(), abstractC1564q.getEffectCoroutineContext())) {
            c2036q.setCoroutineContext(abstractC1564q.getEffectCoroutineContext());
        }
        return w1Var;
    }

    public static final InterfaceC1562p c(AbstractC2004a abstractC2004a, AbstractC1564q abstractC1564q, Ba.p<? super InterfaceC1554l, ? super Integer, C4153F> pVar) {
        C2027l0.f23180a.b();
        C2036q c2036q = null;
        if (abstractC2004a.getChildCount() > 0) {
            View childAt = abstractC2004a.getChildAt(0);
            if (childAt instanceof C2036q) {
                c2036q = (C2036q) childAt;
            }
        } else {
            abstractC2004a.removeAllViews();
        }
        if (c2036q == null) {
            c2036q = new C2036q(abstractC2004a.getContext(), abstractC1564q.getEffectCoroutineContext());
            abstractC2004a.addView(c2036q.getView(), f23489a);
        }
        return b(c2036q, abstractC1564q, pVar);
    }
}
