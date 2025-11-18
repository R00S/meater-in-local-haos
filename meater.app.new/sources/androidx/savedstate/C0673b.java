package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0511g;

/* compiled from: SavedStateRegistryController.java */
/* renamed from: androidx.savedstate.b */
/* loaded from: classes.dex */
public final class C0673b {

    /* renamed from: a */
    private final InterfaceC0674c f4399a;

    /* renamed from: b */
    private final SavedStateRegistry f4400b = new SavedStateRegistry();

    private C0673b(InterfaceC0674c interfaceC0674c) {
        this.f4399a = interfaceC0674c;
    }

    /* renamed from: a */
    public static C0673b m4698a(InterfaceC0674c interfaceC0674c) {
        return new C0673b(interfaceC0674c);
    }

    /* renamed from: b */
    public SavedStateRegistry m4699b() {
        return this.f4400b;
    }

    /* renamed from: c */
    public void m4700c(Bundle bundle) {
        AbstractC0511g lifecycle = this.f4399a.getLifecycle();
        if (lifecycle.mo3862b() != AbstractC0511g.c.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.mo3861a(new Recreator(this.f4399a));
        this.f4400b.m4694b(lifecycle, bundle);
    }

    /* renamed from: d */
    public void m4701d(Bundle bundle) {
        this.f4400b.m4695c(bundle);
    }
}
