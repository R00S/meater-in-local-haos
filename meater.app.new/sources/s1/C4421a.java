package s1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import e1.C3123e;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;
import t1.t;

/* compiled from: AccessibilityDelegateCompat.java */
/* renamed from: s1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4421a {

    /* renamed from: c, reason: collision with root package name */
    private static final View.AccessibilityDelegate f49109c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    private final View.AccessibilityDelegate f49110a;

    /* renamed from: b, reason: collision with root package name */
    private final View.AccessibilityDelegate f49111b;

    /* compiled from: AccessibilityDelegateCompat.java */
    /* renamed from: s1.a$a, reason: collision with other inner class name */
    static final class C0687a extends View.AccessibilityDelegate {

        /* renamed from: a, reason: collision with root package name */
        final C4421a f49112a;

        C0687a(C4421a c4421a) {
            this.f49112a = c4421a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f49112a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            t1.u uVarB = this.f49112a.b(view);
            if (uVarB != null) {
                return (AccessibilityNodeProvider) uVarB.e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f49112a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            t1.t tVarY0 = t1.t.Y0(accessibilityNodeInfo);
            tVarY0.J0(X.U(view));
            tVarY0.u0(X.P(view));
            tVarY0.D0(X.o(view));
            tVarY0.O0(X.G(view));
            this.f49112a.g(view, tVarY0);
            tVarY0.e(accessibilityNodeInfo.getText(), view);
            List<t.a> listC = C4421a.c(view);
            for (int i10 = 0; i10 < listC.size(); i10++) {
                tVarY0.b(listC.get(i10));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f49112a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f49112a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f49112a.j(view, i10, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i10) {
            this.f49112a.l(view, i10);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f49112a.m(view, accessibilityEvent);
        }
    }

    public C4421a() {
        this(f49109c);
    }

    static List<t.a> c(View view) {
        List<t.a> list = (List) view.getTag(C3123e.f39981H);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrP = t1.t.p(view.createAccessibilityNodeInfo().getText());
            for (int i10 = 0; clickableSpanArrP != null && i10 < clickableSpanArrP.length; i10++) {
                if (clickableSpan.equals(clickableSpanArrP[i10])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean k(int i10, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(C3123e.f39982I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i10)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f49110a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public t1.u b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f49110a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new t1.u(accessibilityNodeProvider);
        }
        return null;
    }

    View.AccessibilityDelegate d() {
        return this.f49111b;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f49110a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, t1.t tVar) {
        this.f49110a.onInitializeAccessibilityNodeInfo(view, tVar.X0());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f49110a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f49110a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i10, Bundle bundle) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        List<t.a> listC = c(view);
        boolean zPerformAccessibilityAction = false;
        int i11 = 0;
        while (true) {
            if (i11 >= listC.size()) {
                break;
            }
            t.a aVar = listC.get(i11);
            if (aVar.b() == i10) {
                zPerformAccessibilityAction = aVar.d(view, bundle);
                break;
            }
            i11++;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f49110a.performAccessibilityAction(view, i10, bundle);
        }
        return (zPerformAccessibilityAction || i10 != C3123e.f39993a || bundle == null) ? zPerformAccessibilityAction : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void l(View view, int i10) {
        this.f49110a.sendAccessibilityEvent(view, i10);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f49110a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C4421a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f49110a = accessibilityDelegate;
        this.f49111b = new C0687a(this);
    }
}
