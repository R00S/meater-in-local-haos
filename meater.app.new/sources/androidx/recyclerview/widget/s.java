package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;
import s1.C4421a;
import s1.X;

/* compiled from: RecyclerViewAccessibilityDelegate.java */
/* loaded from: classes.dex */
public class s extends C4421a {

    /* renamed from: d, reason: collision with root package name */
    final RecyclerView f29014d;

    /* renamed from: e, reason: collision with root package name */
    private final a f29015e;

    /* compiled from: RecyclerViewAccessibilityDelegate.java */
    public static class a extends C4421a {

        /* renamed from: d, reason: collision with root package name */
        final s f29016d;

        /* renamed from: e, reason: collision with root package name */
        private Map<View, C4421a> f29017e = new WeakHashMap();

        public a(s sVar) {
            this.f29016d = sVar;
        }

        @Override // s1.C4421a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            C4421a c4421a = this.f29017e.get(view);
            return c4421a != null ? c4421a.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // s1.C4421a
        public t1.u b(View view) {
            C4421a c4421a = this.f29017e.get(view);
            return c4421a != null ? c4421a.b(view) : super.b(view);
        }

        @Override // s1.C4421a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            C4421a c4421a = this.f29017e.get(view);
            if (c4421a != null) {
                c4421a.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // s1.C4421a
        public void g(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) t1.t tVar) {
            if (this.f29016d.o() || this.f29016d.f29014d.getLayoutManager() == null) {
                super.g(view, tVar);
                return;
            }
            this.f29016d.f29014d.getLayoutManager().T0(view, tVar);
            C4421a c4421a = this.f29017e.get(view);
            if (c4421a != null) {
                c4421a.g(view, tVar);
            } else {
                super.g(view, tVar);
            }
        }

        @Override // s1.C4421a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            C4421a c4421a = this.f29017e.get(view);
            if (c4421a != null) {
                c4421a.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // s1.C4421a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C4421a c4421a = this.f29017e.get(viewGroup);
            return c4421a != null ? c4421a.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // s1.C4421a
        public boolean j(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i10, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
            if (this.f29016d.o() || this.f29016d.f29014d.getLayoutManager() == null) {
                return super.j(view, i10, bundle);
            }
            C4421a c4421a = this.f29017e.get(view);
            if (c4421a != null) {
                if (c4421a.j(view, i10, bundle)) {
                    return true;
                }
            } else if (super.j(view, i10, bundle)) {
                return true;
            }
            return this.f29016d.f29014d.getLayoutManager().n1(view, i10, bundle);
        }

        @Override // s1.C4421a
        public void l(View view, int i10) {
            C4421a c4421a = this.f29017e.get(view);
            if (c4421a != null) {
                c4421a.l(view, i10);
            } else {
                super.l(view, i10);
            }
        }

        @Override // s1.C4421a
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            C4421a c4421a = this.f29017e.get(view);
            if (c4421a != null) {
                c4421a.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        C4421a n(View view) {
            return this.f29017e.remove(view);
        }

        void o(View view) {
            C4421a c4421aL = X.l(view);
            if (c4421aL == null || c4421aL == this) {
                return;
            }
            this.f29017e.put(view, c4421aL);
        }
    }

    public s(RecyclerView recyclerView) {
        this.f29014d = recyclerView;
        C4421a c4421aN = n();
        if (c4421aN == null || !(c4421aN instanceof a)) {
            this.f29015e = new a(this);
        } else {
            this.f29015e = (a) c4421aN;
        }
    }

    @Override // s1.C4421a
    public void f(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().P0(accessibilityEvent);
        }
    }

    @Override // s1.C4421a
    public void g(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) t1.t tVar) {
        super.g(view, tVar);
        if (o() || this.f29014d.getLayoutManager() == null) {
            return;
        }
        this.f29014d.getLayoutManager().S0(tVar);
    }

    @Override // s1.C4421a
    public boolean j(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i10, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
        if (super.j(view, i10, bundle)) {
            return true;
        }
        if (o() || this.f29014d.getLayoutManager() == null) {
            return false;
        }
        return this.f29014d.getLayoutManager().l1(i10, bundle);
    }

    public C4421a n() {
        return this.f29015e;
    }

    boolean o() {
        return this.f29014d.w0();
    }
}
