package androidx.compose.ui.platform;

import F0.AccessibilityAction;
import F0.i;
import H0.TextLayoutResult;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import h0.C3478i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import s.AbstractC4405o;
import s.C4380B;
import s.C4406p;
import y0.InterfaceC5120z;

/* compiled from: SemanticsUtils.android.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\f\u001a\u0004\u0018\u00010\t*\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u000eH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u0017*\u00020\u00162\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b*\u00020\u001aH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\"\u001a\u0010#\u001a\u00020\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"\"\u0018\u0010%\u001a\u00020\u0013*\u00020\u00128@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"LF0/l;", "configuration", "LH0/F;", "e", "(LF0/l;)LH0/F;", "", "d", "(LF0/l;)Ljava/lang/Float;", "", "Landroidx/compose/ui/platform/T0;", "", "id", "a", "(Ljava/util/List;I)Landroidx/compose/ui/platform/T0;", "LF0/i;", "", "i", "(I)Ljava/lang/String;", "LF0/p;", "", "f", "(LF0/p;)Z", "Landroidx/compose/ui/platform/W;", "Landroid/view/View;", "h", "(Landroidx/compose/ui/platform/W;I)Landroid/view/View;", "LF0/r;", "Ls/o;", "Landroidx/compose/ui/platform/V0;", "b", "(LF0/r;)Ls/o;", "Lh0/i;", "Lh0/i;", "getDefaultFakeNodeBounds", "()Lh0/i;", "DefaultFakeNodeBounds", "g", "isVisible", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class W0 {

    /* renamed from: a, reason: collision with root package name */
    private static final C3478i f23026a = new C3478i(0.0f, 0.0f, 10.0f, 10.0f);

    public static final T0 a(List<T0> list, int i10) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (list.get(i11).getSemanticsNodeId() == i10) {
                return list.get(i11);
            }
        }
        return null;
    }

    public static final AbstractC4405o<V0> b(F0.r rVar) {
        F0.p pVarA = rVar.a();
        C4380B c4380bB = C4406p.b();
        if (pVarA.getLayoutNode().o() && pVarA.getLayoutNode().K0()) {
            C3478i c3478iI = pVarA.i();
            c(new Region(Math.round(c3478iI.getLeft()), Math.round(c3478iI.getTop()), Math.round(c3478iI.getRight()), Math.round(c3478iI.getBottom())), pVarA, c4380bB, pVarA, new Region());
        }
        return c4380bB;
    }

    private static final void c(Region region, F0.p pVar, C4380B<V0> c4380b, F0.p pVar2, Region region2) {
        InterfaceC5120z interfaceC5120zP;
        boolean z10 = (pVar2.getLayoutNode().o() && pVar2.getLayoutNode().K0()) ? false : true;
        if (!region.isEmpty() || pVar2.getId() == pVar.getId()) {
            if (!z10 || pVar2.getIsFake()) {
                C3478i c3478iV = pVar2.v();
                int iRound = Math.round(c3478iV.getLeft());
                int iRound2 = Math.round(c3478iV.getTop());
                int iRound3 = Math.round(c3478iV.getRight());
                int iRound4 = Math.round(c3478iV.getBottom());
                region2.set(iRound, iRound2, iRound3, iRound4);
                int id2 = pVar2.getId() == pVar.getId() ? -1 : pVar2.getId();
                if (!region2.op(region, Region.Op.INTERSECT)) {
                    if (pVar2.getIsFake()) {
                        F0.p pVarR = pVar2.r();
                        C3478i c3478iI = (pVarR == null || (interfaceC5120zP = pVarR.p()) == null || !interfaceC5120zP.o()) ? f23026a : pVarR.i();
                        c4380b.t(id2, new V0(pVar2, new Rect(Math.round(c3478iI.getLeft()), Math.round(c3478iI.getTop()), Math.round(c3478iI.getRight()), Math.round(c3478iI.getBottom()))));
                        return;
                    } else {
                        if (id2 == -1) {
                            c4380b.t(id2, new V0(pVar2, region2.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                c4380b.t(id2, new V0(pVar2, region2.getBounds()));
                List<F0.p> listT = pVar2.t();
                for (int size = listT.size() - 1; -1 < size; size--) {
                    c(region, pVar, c4380b, listT.get(size), region2);
                }
                if (f(pVar2)) {
                    region.op(iRound, iRound2, iRound3, iRound4, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    @SuppressLint({"PrimitiveInCollection"})
    public static final Float d(F0.l lVar) {
        Ba.l lVar2;
        ArrayList arrayList = new ArrayList();
        AccessibilityAction accessibilityAction = (AccessibilityAction) F0.m.a(lVar, F0.k.f4315a.h());
        if (accessibilityAction == null || (lVar2 = (Ba.l) accessibilityAction.a()) == null || !((Boolean) lVar2.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (Float) arrayList.get(0);
    }

    public static final TextLayoutResult e(F0.l lVar) {
        Ba.l lVar2;
        ArrayList arrayList = new ArrayList();
        AccessibilityAction accessibilityAction = (AccessibilityAction) F0.m.a(lVar, F0.k.f4315a.i());
        if (accessibilityAction == null || (lVar2 = (Ba.l) accessibilityAction.a()) == null || !((Boolean) lVar2.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (TextLayoutResult) arrayList.get(0);
    }

    public static final boolean f(F0.p pVar) {
        return g(pVar) && (pVar.getUnmergedConfig().getIsMergingSemanticsOfDescendants() || pVar.getUnmergedConfig().j());
    }

    public static final boolean g(F0.p pVar) {
        return (pVar.z() || pVar.getUnmergedConfig().i(F0.s.f4372a.n())) ? false : true;
    }

    public static final View h(W w10, int i10) {
        Object next;
        Iterator<T> it = w10.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((A0.G) ((Map.Entry) next).getKey()).getSemanticsId() == i10) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (androidx.compose.ui.viewinterop.c) entry.getValue();
        }
        return null;
    }

    public static final String i(int i10) {
        i.Companion companion = F0.i.INSTANCE;
        if (F0.i.k(i10, companion.a())) {
            return "android.widget.Button";
        }
        if (F0.i.k(i10, companion.b())) {
            return "android.widget.CheckBox";
        }
        if (F0.i.k(i10, companion.e())) {
            return "android.widget.RadioButton";
        }
        if (F0.i.k(i10, companion.d())) {
            return "android.widget.ImageView";
        }
        if (F0.i.k(i10, companion.c())) {
            return "android.widget.Spinner";
        }
        return null;
    }
}
