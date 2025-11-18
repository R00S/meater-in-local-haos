package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0511g;
import androidx.savedstate.InterfaceC0674c;
import androidx.savedstate.SavedStateRegistry;
import java.util.Iterator;

/* loaded from: classes.dex */
final class SavedStateHandleController implements InterfaceC0513i {

    /* renamed from: a */
    private final String f3455a;

    /* renamed from: b */
    private boolean f3456b = false;

    /* renamed from: c */
    private final C0525u f3457c;

    /* renamed from: androidx.lifecycle.SavedStateHandleController$a */
    static final class C0499a implements SavedStateRegistry.InterfaceC0670a {
        C0499a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC0670a
        /* renamed from: a */
        public void mo3843a(InterfaceC0674c interfaceC0674c) throws NoSuchMethodException, SecurityException {
            if (!(interfaceC0674c instanceof InterfaceC0501a0)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
            }
            C0530z viewModelStore = ((InterfaceC0501a0) interfaceC0674c).getViewModelStore();
            SavedStateRegistry savedStateRegistry = interfaceC0674c.getSavedStateRegistry();
            Iterator<String> it = viewModelStore.m3921c().iterator();
            while (it.hasNext()) {
                SavedStateHandleController.m3837b(viewModelStore.m3920b(it.next()), savedStateRegistry, interfaceC0674c.getLifecycle());
            }
            if (viewModelStore.m3921c().isEmpty()) {
                return;
            }
            savedStateRegistry.m4697e(C0499a.class);
        }
    }

    SavedStateHandleController(String str, C0525u c0525u) {
        this.f3455a = str;
        this.f3457c = c0525u;
    }

    /* renamed from: b */
    static void m3837b(AbstractC0528x abstractC0528x, SavedStateRegistry savedStateRegistry, AbstractC0511g abstractC0511g) throws NoSuchMethodException, SecurityException {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) abstractC0528x.m3913c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.m3842f()) {
            return;
        }
        savedStateHandleController.m3840c(savedStateRegistry, abstractC0511g);
        m3839g(savedStateRegistry, abstractC0511g);
    }

    /* renamed from: d */
    static SavedStateHandleController m3838d(SavedStateRegistry savedStateRegistry, AbstractC0511g abstractC0511g, String str, Bundle bundle) throws NoSuchMethodException, SecurityException {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, C0525u.m3898a(savedStateRegistry.m4693a(str), bundle));
        savedStateHandleController.m3840c(savedStateRegistry, abstractC0511g);
        m3839g(savedStateRegistry, abstractC0511g);
        return savedStateHandleController;
    }

    /* renamed from: g */
    private static void m3839g(final SavedStateRegistry savedStateRegistry, final AbstractC0511g abstractC0511g) throws NoSuchMethodException, SecurityException {
        AbstractC0511g.c cVarMo3862b = abstractC0511g.mo3862b();
        if (cVarMo3862b == AbstractC0511g.c.INITIALIZED || cVarMo3862b.m3867g(AbstractC0511g.c.STARTED)) {
            savedStateRegistry.m4697e(C0499a.class);
        } else {
            abstractC0511g.mo3861a(new InterfaceC0513i() { // from class: androidx.lifecycle.SavedStateHandleController.1
                @Override // androidx.lifecycle.InterfaceC0513i
                /* renamed from: a */
                public void mo124a(InterfaceC0515k interfaceC0515k, AbstractC0511g.b bVar) throws NoSuchMethodException, SecurityException {
                    if (bVar == AbstractC0511g.b.ON_START) {
                        abstractC0511g.mo3863c(this);
                        savedStateRegistry.m4697e(C0499a.class);
                    }
                }
            });
        }
    }

    @Override // androidx.lifecycle.InterfaceC0513i
    /* renamed from: a */
    public void mo124a(InterfaceC0515k interfaceC0515k, AbstractC0511g.b bVar) {
        if (bVar == AbstractC0511g.b.ON_DESTROY) {
            this.f3456b = false;
            interfaceC0515k.getLifecycle().mo3863c(this);
        }
    }

    /* renamed from: c */
    void m3840c(SavedStateRegistry savedStateRegistry, AbstractC0511g abstractC0511g) {
        if (this.f3456b) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f3456b = true;
        abstractC0511g.mo3861a(this);
        savedStateRegistry.m4696d(this.f3455a, this.f3457c.m3900b());
    }

    /* renamed from: e */
    C0525u m3841e() {
        return this.f3457c;
    }

    /* renamed from: f */
    boolean m3842f() {
        return this.f3456b;
    }
}
