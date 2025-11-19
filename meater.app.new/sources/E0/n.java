package E0;

import A0.AbstractC0823c0;
import F0.ScrollAxisRange;
import F0.p;
import F0.s;
import U0.q;
import androidx.compose.ui.platform.W0;
import h0.C3476g;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import oa.C4153F;
import ta.InterfaceC4588d;
import x0.C5047a;
import y0.C5117w;
import y0.InterfaceC5116v;

/* compiled from: ScrollCapture.android.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n*\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\"6\u0010\u0013\u001a \b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\r*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u0018\u0010\u0017\u001a\u00020\u0014*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LF0/p;", "fromNode", "", "depth", "Lkotlin/Function1;", "LE0/m;", "Loa/F;", "onCandidate", "d", "(LF0/p;ILBa/l;)V", "", "b", "(LF0/p;)Ljava/util/List;", "Lkotlin/Function2;", "Lh0/g;", "Lta/d;", "", "c", "(LF0/p;)LBa/p;", "scrollCaptureScrollByAction", "", "a", "(LF0/p;)Z", "canScrollVertically", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n {
    private static final boolean a(p pVar) {
        Ba.p<C3476g, InterfaceC4588d<? super C3476g>, Object> pVarC = c(pVar);
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) F0.m.a(pVar.getUnmergedConfig(), s.f4372a.I());
        return (pVarC == null || scrollAxisRange == null || scrollAxisRange.a().invoke().floatValue() <= 0.0f) ? false : true;
    }

    private static final List<p> b(p pVar) {
        return pVar.l(false, false, false);
    }

    public static final Ba.p<C3476g, InterfaceC4588d<? super C3476g>, Object> c(p pVar) {
        return (Ba.p) F0.m.a(pVar.getUnmergedConfig(), F0.k.f4315a.t());
    }

    private static final void d(p pVar, int i10, Ba.l<? super ScrollCaptureCandidate, C4153F> lVar) {
        p pVar2;
        Q.b bVar = new Q.b(new p[16], 0);
        List<p> listB = b(pVar);
        while (true) {
            bVar.h(bVar.getSize(), listB);
            while (bVar.y()) {
                pVar2 = (p) bVar.E(bVar.getSize() - 1);
                if (W0.g(pVar2) && !pVar2.getUnmergedConfig().i(s.f4372a.f())) {
                    AbstractC0823c0 abstractC0823c0E = pVar2.e();
                    if (abstractC0823c0E == null) {
                        C5047a.c("Expected semantics node to have a coordinator.");
                        throw new KotlinNothingValueException();
                    }
                    InterfaceC5116v interfaceC5116vW0 = abstractC0823c0E.W0();
                    U0.p pVarB = q.b(C5117w.c(interfaceC5116vW0));
                    if (pVarB.m()) {
                        continue;
                    } else {
                        if (!a(pVar2)) {
                            break;
                        }
                        int i11 = i10 + 1;
                        lVar.invoke(new ScrollCaptureCandidate(pVar2, i11, pVarB, interfaceC5116vW0));
                        d(pVar2, i11, lVar);
                    }
                }
            }
            return;
            listB = b(pVar2);
        }
    }

    static /* synthetic */ void e(p pVar, int i10, Ba.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        d(pVar, i10, lVar);
    }
}
