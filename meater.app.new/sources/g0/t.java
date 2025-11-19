package g0;

import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import oa.C4153F;
import s.C4388J;
import s.U;
import x0.C5047a;

/* compiled from: FocusTransactionManager.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R,\u0010\u001c\u001a\u0004\u0018\u00010\n*\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lg0/t;", "", "<init>", "()V", "Loa/F;", "f", "h", "g", "Ls/J;", "Landroidx/compose/ui/focus/FocusTargetNode;", "Lg0/p;", "a", "Ls/J;", "states", "LQ/b;", "Lkotlin/Function0;", "b", "LQ/b;", "cancellationListener", "", "c", "Z", "ongoingTransaction", "value", "i", "(Landroidx/compose/ui/focus/FocusTargetNode;)Lg0/p;", "j", "(Landroidx/compose/ui/focus/FocusTargetNode;Lg0/p;)V", "uncommittedFocusState", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C4388J<FocusTargetNode, p> states = U.d();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Q.b<Ba.a<C4153F>> cancellationListener = new Q.b<>(new Ba.a[16], 0);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean ongoingTransaction;

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        this.ongoingTransaction = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        this.states.h();
        int i10 = 0;
        this.ongoingTransaction = false;
        Q.b<Ba.a<C4153F>> bVar = this.cancellationListener;
        int size = bVar.getSize();
        if (size > 0) {
            Ba.a<C4153F>[] aVarArrT = bVar.t();
            do {
                aVarArrT[i10].invoke();
                i10++;
            } while (i10 < size);
        }
        this.cancellationListener.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            r14 = this;
            s.J<androidx.compose.ui.focus.FocusTargetNode, g0.p> r0 = r14.states
            java.lang.Object[] r1 = r0.keys
            long[] r0 = r0.metadata
            int r2 = r0.length
            int r2 = r2 + (-2)
            r3 = 0
            if (r2 < 0) goto L47
            r4 = r3
        Ld:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L42
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L27:
            if (r9 >= r7) goto L40
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3c
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            androidx.compose.ui.focus.FocusTargetNode r10 = (androidx.compose.ui.focus.FocusTargetNode) r10
            r10.n2()
        L3c:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L27
        L40:
            if (r7 != r8) goto L47
        L42:
            if (r4 == r2) goto L47
            int r4 = r4 + 1
            goto Ld
        L47:
            s.J<androidx.compose.ui.focus.FocusTargetNode, g0.p> r0 = r14.states
            r0.h()
            r14.ongoingTransaction = r3
            Q.b<Ba.a<oa.F>> r0 = r14.cancellationListener
            r0.l()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.t.h():void");
    }

    public final p i(FocusTargetNode focusTargetNode) {
        return this.states.b(focusTargetNode);
    }

    public final void j(FocusTargetNode focusTargetNode, p pVar) {
        C4388J<FocusTargetNode, p> c4388j = this.states;
        if (pVar != null) {
            c4388j.r(focusTargetNode, pVar);
        } else {
            C5047a.c("requires a non-null focus state");
            throw new KotlinNothingValueException();
        }
    }
}
