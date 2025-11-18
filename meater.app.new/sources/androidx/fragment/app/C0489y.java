package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0511g;
import androidx.lifecycle.C0516l;
import androidx.savedstate.C0673b;
import androidx.savedstate.InterfaceC0674c;
import androidx.savedstate.SavedStateRegistry;

/* compiled from: FragmentViewLifecycleOwner.java */
/* renamed from: androidx.fragment.app.y */
/* loaded from: classes.dex */
class C0489y implements InterfaceC0674c {

    /* renamed from: f */
    private C0516l f3414f = null;

    /* renamed from: g */
    private C0673b f3415g = null;

    C0489y() {
    }

    /* renamed from: a */
    void m3803a(AbstractC0511g.b bVar) {
        this.f3414f.m3879h(bVar);
    }

    /* renamed from: b */
    void m3804b() {
        if (this.f3414f == null) {
            this.f3414f = new C0516l(this);
            this.f3415g = C0673b.m4698a(this);
        }
    }

    /* renamed from: c */
    boolean m3805c() {
        return this.f3414f != null;
    }

    /* renamed from: d */
    void m3806d(Bundle bundle) {
        this.f3415g.m4700c(bundle);
    }

    /* renamed from: e */
    void m3807e(Bundle bundle) {
        this.f3415g.m4701d(bundle);
    }

    /* renamed from: f */
    void m3808f(AbstractC0511g.c cVar) {
        this.f3414f.m3881o(cVar);
    }

    @Override // androidx.lifecycle.InterfaceC0515k
    public AbstractC0511g getLifecycle() {
        m3804b();
        return this.f3414f;
    }

    @Override // androidx.savedstate.InterfaceC0674c
    public SavedStateRegistry getSavedStateRegistry() {
        return this.f3415g.m4699b();
    }
}
