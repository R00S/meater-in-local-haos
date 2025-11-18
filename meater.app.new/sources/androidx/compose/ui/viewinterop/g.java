package androidx.compose.ui.viewinterop;

import A0.AbstractC0834m;
import A0.C0832k;
import A0.e0;
import A0.m0;
import Ba.l;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.k;
import androidx.compose.ui.focus.m;
import b0.i;
import g0.j;
import g0.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C3860q;
import kotlin.jvm.internal.C3862t;
import x0.C5047a;

/* compiled from: FocusGroupNode.android.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0013J#\u0010\u0018\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u0006J\u000f\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u0006J\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001f\u0010\u001eR$\u0010%\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010\u001e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Landroidx/compose/ui/viewinterop/g;", "Lb0/i$c;", "Lg0/j;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "Landroid/view/View$OnAttachStateChangeListener;", "<init>", "()V", "Landroidx/compose/ui/focus/FocusTargetNode;", "j2", "()Landroidx/compose/ui/focus/FocusTargetNode;", "Landroidx/compose/ui/focus/g;", "focusProperties", "Loa/F;", "j0", "(Landroidx/compose/ui/focus/g;)V", "Landroidx/compose/ui/focus/b;", "focusDirection", "Landroidx/compose/ui/focus/k;", "k2", "(I)Landroidx/compose/ui/focus/k;", "l2", "Landroid/view/View;", "oldFocus", "newFocus", "onGlobalFocusChanged", "(Landroid/view/View;Landroid/view/View;)V", "T1", "U1", "v", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "O", "Landroid/view/View;", "getFocusedChild", "()Landroid/view/View;", "setFocusedChild", "focusedChild", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class g extends i.c implements j, ViewTreeObserver.OnGlobalFocusChangeListener, View.OnAttachStateChangeListener {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private View focusedChild;

    /* compiled from: FocusGroupNode.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class a extends C3860q implements l<androidx.compose.ui.focus.b, k> {
        a(Object obj) {
            super(1, obj, g.class, "onEnter", "onEnter-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0);
        }

        public final k c(int i10) {
            return ((g) this.receiver).k2(i10);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ k invoke(androidx.compose.ui.focus.b bVar) {
            return c(bVar.getValue());
        }
    }

    /* compiled from: FocusGroupNode.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class b extends C3860q implements l<androidx.compose.ui.focus.b, k> {
        b(Object obj) {
            super(1, obj, g.class, "onExit", "onExit-3ESFkO8(I)Landroidx/compose/ui/focus/FocusRequester;", 0);
        }

        public final k c(int i10) {
            return ((g) this.receiver).l2(i10);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ k invoke(androidx.compose.ui.focus.b bVar) {
            return c(bVar.getValue());
        }
    }

    private final FocusTargetNode j2() {
        int iA = e0.a(1024);
        if (!getNode().getIsAttached()) {
            C5047a.b("visitLocalDescendants called on an unattached node");
        }
        i.c node = getNode();
        if ((node.getAggregateChildKindSet() & iA) != 0) {
            boolean z10 = false;
            for (i.c child = node.getChild(); child != null; child = child.getChild()) {
                if ((child.getKindSet() & iA) != 0) {
                    i.c cVarG = child;
                    Q.b bVar = null;
                    while (cVarG != null) {
                        if (cVarG instanceof FocusTargetNode) {
                            FocusTargetNode focusTargetNode = (FocusTargetNode) cVarG;
                            if (z10) {
                                return focusTargetNode;
                            }
                            z10 = true;
                        } else if ((cVarG.getKindSet() & iA) != 0 && (cVarG instanceof AbstractC0834m)) {
                            int i10 = 0;
                            for (i.c delegate = ((AbstractC0834m) cVarG).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                if ((delegate.getKindSet() & iA) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        cVarG = delegate;
                                    } else {
                                        if (bVar == null) {
                                            bVar = new Q.b(new i.c[16], 0);
                                        }
                                        if (cVarG != null) {
                                            bVar.c(cVarG);
                                            cVarG = null;
                                        }
                                        bVar.c(delegate);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        cVarG = C0832k.g(bVar);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // b0.i.c
    public void T1() {
        super.T1();
        f.g(this).addOnAttachStateChangeListener(this);
    }

    @Override // b0.i.c
    public void U1() {
        f.g(this).removeOnAttachStateChangeListener(this);
        this.focusedChild = null;
        super.U1();
    }

    @Override // g0.j
    public void j0(androidx.compose.ui.focus.g focusProperties) {
        focusProperties.y(false);
        focusProperties.r(new a(this));
        focusProperties.w(new b(this));
    }

    public final k k2(int focusDirection) {
        View viewG = f.g(this);
        if (viewG.isFocused() || viewG.hasFocus()) {
            return k.INSTANCE.b();
        }
        g0.i focusOwner = C0832k.l(this).getFocusOwner();
        Object objL = C0832k.l(this);
        C3862t.e(objL, "null cannot be cast to non-null type android.view.View");
        return androidx.compose.ui.focus.d.b(viewG, androidx.compose.ui.focus.d.c(focusDirection), f.f(focusOwner, (View) objL, viewG)) ? k.INSTANCE.b() : k.INSTANCE.a();
    }

    public final k l2(int focusDirection) {
        View viewG = f.g(this);
        if (!viewG.hasFocus()) {
            return k.INSTANCE.b();
        }
        g0.i focusOwner = C0832k.l(this).getFocusOwner();
        Object objL = C0832k.l(this);
        C3862t.e(objL, "null cannot be cast to non-null type android.view.View");
        View view = (View) objL;
        if (!(viewG instanceof ViewGroup)) {
            if (view.requestFocus()) {
                return k.INSTANCE.b();
            }
            throw new IllegalStateException("host view did not take focus");
        }
        Rect rectF = f.f(focusOwner, view, viewG);
        Integer numC = androidx.compose.ui.focus.d.c(focusDirection);
        int iIntValue = numC != null ? numC.intValue() : 130;
        FocusFinder focusFinder = FocusFinder.getInstance();
        View view2 = this.focusedChild;
        View viewFindNextFocus = view2 != null ? focusFinder.findNextFocus((ViewGroup) view, view2, iIntValue) : focusFinder.findNextFocusFromRect((ViewGroup) view, rectF, iIntValue);
        if (viewFindNextFocus != null && f.d(viewG, viewFindNextFocus)) {
            viewFindNextFocus.requestFocus(iIntValue, rectF);
            return k.INSTANCE.a();
        }
        if (view.requestFocus()) {
            return k.INSTANCE.b();
        }
        throw new IllegalStateException("host view did not take focus");
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View oldFocus, View newFocus) {
        if (C0832k.k(this).getOwner() == null) {
            return;
        }
        View viewG = f.g(this);
        g0.i focusOwner = C0832k.l(this).getFocusOwner();
        m0 m0VarL = C0832k.l(this);
        boolean z10 = (oldFocus == null || C3862t.b(oldFocus, m0VarL) || !f.d(viewG, oldFocus)) ? false : true;
        boolean z11 = (newFocus == null || C3862t.b(newFocus, m0VarL) || !f.d(viewG, newFocus)) ? false : true;
        if (z10 && z11) {
            this.focusedChild = newFocus;
            return;
        }
        if (!z11) {
            if (!z10) {
                this.focusedChild = null;
                return;
            }
            this.focusedChild = null;
            if (j2().q2().j()) {
                focusOwner.d(false, true, false, androidx.compose.ui.focus.b.INSTANCE.c());
                return;
            }
            return;
        }
        this.focusedChild = newFocus;
        FocusTargetNode focusTargetNodeJ2 = j2();
        if (focusTargetNodeJ2.q2().c()) {
            return;
        }
        t tVarF = focusOwner.f();
        try {
            if (tVarF.ongoingTransaction) {
                tVarF.g();
            }
            tVarF.f();
            m.i(focusTargetNodeJ2);
            tVarF.h();
        } catch (Throwable th) {
            tVarF.h();
            throw th;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v10) {
        v10.getViewTreeObserver().addOnGlobalFocusChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v10) {
        v10.getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }
}
