package androidx.core.view;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.p004d0.C0289c;
import androidx.core.view.p004d0.C0290d;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;
import p024c.p052i.C0921c;

/* compiled from: AccessibilityDelegateCompat.java */
/* renamed from: androidx.core.view.a */
/* loaded from: classes.dex */
public class C0280a {

    /* renamed from: a */
    private static final View.AccessibilityDelegate f2286a = new View.AccessibilityDelegate();

    /* renamed from: b */
    private final View.AccessibilityDelegate f2287b;

    /* renamed from: c */
    private final View.AccessibilityDelegate f2288c;

    /* compiled from: AccessibilityDelegateCompat.java */
    /* renamed from: androidx.core.view.a$a */
    static final class a extends View.AccessibilityDelegate {

        /* renamed from: a */
        final C0280a f2289a;

        a(C0280a c0280a) {
            this.f2289a = c0280a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f2289a.mo1854a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C0290d c0290dMo1855b = this.f2289a.mo1855b(view);
            if (c0290dMo1855b != null) {
                return (AccessibilityNodeProvider) c0290dMo1855b.m2027e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2289a.mo1857f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C0289c c0289cM1949y0 = C0289c.m1949y0(accessibilityNodeInfo);
            c0289cM1949y0.m1999q0(C0311u.m2105R(view));
            c0289cM1949y0.m1985i0(C0311u.m2100M(view));
            c0289cM1949y0.m1992m0(C0311u.m2140n(view));
            c0289cM1949y0.m2006u0(C0311u.m2093F(view));
            this.f2289a.mo1858g(view, c0289cM1949y0);
            c0289cM1949y0.m1979e(accessibilityNodeInfo.getText(), view);
            List<C0289c.a> listM1851c = C0280a.m1851c(view);
            for (int i2 = 0; i2 < listM1851c.size(); i2++) {
                c0289cM1949y0.m1974b(listM1851c.get(i2));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2289a.mo1859h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f2289a.mo1860i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
            return this.f2289a.mo1861j(view, i2, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i2) {
            this.f2289a.mo1862l(view, i2);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f2289a.mo1863m(view, accessibilityEvent);
        }
    }

    public C0280a() {
        this(f2286a);
    }

    /* renamed from: c */
    static List<C0289c.a> m1851c(View view) {
        List<C0289c.a> list = (List) view.getTag(C0921c.f6204H);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: e */
    private boolean m1852e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrM1945p = C0289c.m1945p(view.createAccessibilityNodeInfo().getText());
            for (int i2 = 0; clickableSpanArrM1945p != null && i2 < clickableSpanArrM1945p.length; i2++) {
                if (clickableSpan.equals(clickableSpanArrM1945p[i2])) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: k */
    private boolean m1853k(int i2, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(C0921c.f6205I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i2)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!m1852e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    /* renamed from: a */
    public boolean mo1854a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2287b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public C0290d mo1855b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = this.f2287b.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new C0290d(accessibilityNodeProvider);
    }

    /* renamed from: d */
    View.AccessibilityDelegate m1856d() {
        return this.f2288c;
    }

    /* renamed from: f */
    public void mo1857f(View view, AccessibilityEvent accessibilityEvent) {
        this.f2287b.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: g */
    public void mo1858g(View view, C0289c c0289c) {
        this.f2287b.onInitializeAccessibilityNodeInfo(view, c0289c.m2011x0());
    }

    /* renamed from: h */
    public void mo1859h(View view, AccessibilityEvent accessibilityEvent) {
        this.f2287b.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: i */
    public boolean mo1860i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2287b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: j */
    public boolean mo1861j(View view, int i2, Bundle bundle) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        List<C0289c.a> listM1851c = m1851c(view);
        boolean zPerformAccessibilityAction = false;
        int i3 = 0;
        while (true) {
            if (i3 >= listM1851c.size()) {
                break;
            }
            C0289c.a aVar = listM1851c.get(i3);
            if (aVar.m2013b() == i2) {
                zPerformAccessibilityAction = aVar.m2015d(view, bundle);
                break;
            }
            i3++;
        }
        if (!zPerformAccessibilityAction && Build.VERSION.SDK_INT >= 16) {
            zPerformAccessibilityAction = this.f2287b.performAccessibilityAction(view, i2, bundle);
        }
        return (zPerformAccessibilityAction || i2 != C0921c.f6215a) ? zPerformAccessibilityAction : m1853k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    /* renamed from: l */
    public void mo1862l(View view, int i2) {
        this.f2287b.sendAccessibilityEvent(view, i2);
    }

    /* renamed from: m */
    public void mo1863m(View view, AccessibilityEvent accessibilityEvent) {
        this.f2287b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0280a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f2287b = accessibilityDelegate;
        this.f2288c = new a(this);
    }
}
