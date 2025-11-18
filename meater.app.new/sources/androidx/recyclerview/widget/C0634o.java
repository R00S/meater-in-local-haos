package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C0280a;
import androidx.core.view.C0311u;
import androidx.core.view.p004d0.C0289c;
import androidx.core.view.p004d0.C0290d;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: RecyclerViewAccessibilityDelegate.java */
/* renamed from: androidx.recyclerview.widget.o */
/* loaded from: classes.dex */
public class C0634o extends C0280a {

    /* renamed from: d */
    final RecyclerView f4210d;

    /* renamed from: e */
    private final a f4211e;

    /* compiled from: RecyclerViewAccessibilityDelegate.java */
    /* renamed from: androidx.recyclerview.widget.o$a */
    public static class a extends C0280a {

        /* renamed from: d */
        final C0634o f4212d;

        /* renamed from: e */
        private Map<View, C0280a> f4213e = new WeakHashMap();

        public a(C0634o c0634o) {
            this.f4212d = c0634o;
        }

        @Override // androidx.core.view.C0280a
        /* renamed from: a */
        public boolean mo1854a(View view, AccessibilityEvent accessibilityEvent) {
            C0280a c0280a = this.f4213e.get(view);
            return c0280a != null ? c0280a.mo1854a(view, accessibilityEvent) : super.mo1854a(view, accessibilityEvent);
        }

        @Override // androidx.core.view.C0280a
        /* renamed from: b */
        public C0290d mo1855b(View view) {
            C0280a c0280a = this.f4213e.get(view);
            return c0280a != null ? c0280a.mo1855b(view) : super.mo1855b(view);
        }

        @Override // androidx.core.view.C0280a
        /* renamed from: f */
        public void mo1857f(View view, AccessibilityEvent accessibilityEvent) {
            C0280a c0280a = this.f4213e.get(view);
            if (c0280a != null) {
                c0280a.mo1857f(view, accessibilityEvent);
            } else {
                super.mo1857f(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C0280a
        /* renamed from: g */
        public void mo1858g(View view, C0289c c0289c) {
            if (this.f4212d.m4549o() || this.f4212d.f4210d.getLayoutManager() == null) {
                super.mo1858g(view, c0289c);
                return;
            }
            this.f4212d.f4210d.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, c0289c);
            C0280a c0280a = this.f4213e.get(view);
            if (c0280a != null) {
                c0280a.mo1858g(view, c0289c);
            } else {
                super.mo1858g(view, c0289c);
            }
        }

        @Override // androidx.core.view.C0280a
        /* renamed from: h */
        public void mo1859h(View view, AccessibilityEvent accessibilityEvent) {
            C0280a c0280a = this.f4213e.get(view);
            if (c0280a != null) {
                c0280a.mo1859h(view, accessibilityEvent);
            } else {
                super.mo1859h(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C0280a
        /* renamed from: i */
        public boolean mo1860i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C0280a c0280a = this.f4213e.get(viewGroup);
            return c0280a != null ? c0280a.mo1860i(viewGroup, view, accessibilityEvent) : super.mo1860i(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.C0280a
        /* renamed from: j */
        public boolean mo1861j(View view, int i2, Bundle bundle) {
            if (this.f4212d.m4549o() || this.f4212d.f4210d.getLayoutManager() == null) {
                return super.mo1861j(view, i2, bundle);
            }
            C0280a c0280a = this.f4213e.get(view);
            if (c0280a != null) {
                if (c0280a.mo1861j(view, i2, bundle)) {
                    return true;
                }
            } else if (super.mo1861j(view, i2, bundle)) {
                return true;
            }
            return this.f4212d.f4210d.getLayoutManager().performAccessibilityActionForItem(view, i2, bundle);
        }

        @Override // androidx.core.view.C0280a
        /* renamed from: l */
        public void mo1862l(View view, int i2) {
            C0280a c0280a = this.f4213e.get(view);
            if (c0280a != null) {
                c0280a.mo1862l(view, i2);
            } else {
                super.mo1862l(view, i2);
            }
        }

        @Override // androidx.core.view.C0280a
        /* renamed from: m */
        public void mo1863m(View view, AccessibilityEvent accessibilityEvent) {
            C0280a c0280a = this.f4213e.get(view);
            if (c0280a != null) {
                c0280a.mo1863m(view, accessibilityEvent);
            } else {
                super.mo1863m(view, accessibilityEvent);
            }
        }

        /* renamed from: n */
        C0280a m4550n(View view) {
            return this.f4213e.remove(view);
        }

        /* renamed from: o */
        void m4551o(View view) {
            C0280a c0280aM2132j = C0311u.m2132j(view);
            if (c0280aM2132j == null || c0280aM2132j == this) {
                return;
            }
            this.f4213e.put(view, c0280aM2132j);
        }
    }

    public C0634o(RecyclerView recyclerView) {
        this.f4210d = recyclerView;
        C0280a c0280aMo4160n = mo4160n();
        if (c0280aMo4160n == null || !(c0280aMo4160n instanceof a)) {
            this.f4211e = new a(this);
        } else {
            this.f4211e = (a) c0280aMo4160n;
        }
    }

    @Override // androidx.core.view.C0280a
    /* renamed from: f */
    public void mo1857f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo1857f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || m4549o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.C0280a
    /* renamed from: g */
    public void mo1858g(View view, C0289c c0289c) {
        super.mo1858g(view, c0289c);
        if (m4549o() || this.f4210d.getLayoutManager() == null) {
            return;
        }
        this.f4210d.getLayoutManager().onInitializeAccessibilityNodeInfo(c0289c);
    }

    @Override // androidx.core.view.C0280a
    /* renamed from: j */
    public boolean mo1861j(View view, int i2, Bundle bundle) {
        if (super.mo1861j(view, i2, bundle)) {
            return true;
        }
        if (m4549o() || this.f4210d.getLayoutManager() == null) {
            return false;
        }
        return this.f4210d.getLayoutManager().performAccessibilityAction(i2, bundle);
    }

    /* renamed from: n */
    public C0280a mo4160n() {
        return this.f4211e;
    }

    /* renamed from: o */
    boolean m4549o() {
        return this.f4210d.hasPendingAdapterUpdates();
    }
}
