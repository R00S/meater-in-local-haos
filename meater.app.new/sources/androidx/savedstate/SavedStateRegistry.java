package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0511g;
import androidx.lifecycle.InterfaceC0513i;
import androidx.lifecycle.InterfaceC0515k;
import androidx.savedstate.Recreator;
import java.util.Map;
import p024c.p033b.p034a.p036b.C0854b;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class SavedStateRegistry {

    /* renamed from: b */
    private Bundle f4393b;

    /* renamed from: c */
    private boolean f4394c;

    /* renamed from: d */
    private Recreator.C0668a f4395d;

    /* renamed from: a */
    private C0854b<String, InterfaceC0671b> f4392a = new C0854b<>();

    /* renamed from: e */
    boolean f4396e = true;

    /* renamed from: androidx.savedstate.SavedStateRegistry$a */
    public interface InterfaceC0670a {
        /* renamed from: a */
        void mo3843a(InterfaceC0674c interfaceC0674c);
    }

    /* renamed from: androidx.savedstate.SavedStateRegistry$b */
    public interface InterfaceC0671b {
        /* renamed from: a */
        Bundle mo3613a();
    }

    SavedStateRegistry() {
    }

    /* renamed from: a */
    public Bundle m4693a(String str) {
        if (!this.f4394c) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f4393b;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        this.f4393b.remove(str);
        if (this.f4393b.isEmpty()) {
            this.f4393b = null;
        }
        return bundle2;
    }

    /* renamed from: b */
    void m4694b(AbstractC0511g abstractC0511g, Bundle bundle) {
        if (this.f4394c) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        if (bundle != null) {
            this.f4393b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        abstractC0511g.mo3861a(new InterfaceC0513i() { // from class: androidx.savedstate.SavedStateRegistry.1
            @Override // androidx.lifecycle.InterfaceC0513i
            /* renamed from: a */
            public void mo124a(InterfaceC0515k interfaceC0515k, AbstractC0511g.b bVar) {
                if (bVar == AbstractC0511g.b.ON_START) {
                    SavedStateRegistry.this.f4396e = true;
                } else if (bVar == AbstractC0511g.b.ON_STOP) {
                    SavedStateRegistry.this.f4396e = false;
                }
            }
        });
        this.f4394c = true;
    }

    /* renamed from: c */
    void m4695c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f4393b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C0854b<String, InterfaceC0671b>.d dVarM5383h = this.f4392a.m5383h();
        while (dVarM5383h.hasNext()) {
            Map.Entry next = dVarM5383h.next();
            bundle2.putBundle((String) next.getKey(), ((InterfaceC0671b) next.getValue()).mo3613a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    /* renamed from: d */
    public void m4696d(String str, InterfaceC0671b interfaceC0671b) {
        if (this.f4392a.mo5378o(str, interfaceC0671b) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    /* renamed from: e */
    public void m4697e(Class<? extends InterfaceC0670a> cls) throws NoSuchMethodException, SecurityException {
        if (!this.f4396e) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f4395d == null) {
            this.f4395d = new Recreator.C0668a(this);
        }
        try {
            cls.getDeclaredConstructor(new Class[0]);
            this.f4395d.m4692b(cls.getName());
        } catch (NoSuchMethodException e2) {
            throw new IllegalArgumentException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
        }
    }
}
