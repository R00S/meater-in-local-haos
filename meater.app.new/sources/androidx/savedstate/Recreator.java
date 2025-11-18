package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0511g;
import androidx.lifecycle.InterfaceC0513i;
import androidx.lifecycle.InterfaceC0515k;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
final class Recreator implements InterfaceC0513i {

    /* renamed from: a */
    private final InterfaceC0674c f4390a;

    /* renamed from: androidx.savedstate.Recreator$a */
    static final class C0668a implements SavedStateRegistry.InterfaceC0671b {

        /* renamed from: a */
        final Set<String> f4391a = new HashSet();

        C0668a(SavedStateRegistry savedStateRegistry) {
            savedStateRegistry.m4696d("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC0671b
        /* renamed from: a */
        public Bundle mo3613a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f4391a));
            return bundle;
        }

        /* renamed from: b */
        void m4692b(String str) {
            this.f4391a.add(str);
        }
    }

    Recreator(InterfaceC0674c interfaceC0674c) {
        this.f4390a = interfaceC0674c;
    }

    /* renamed from: b */
    private void m4691b(String str) throws NoSuchMethodException, SecurityException {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.InterfaceC0670a.class);
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    ((SavedStateRegistry.InterfaceC0670a) declaredConstructor.newInstance(new Object[0])).mo3843a(this.f4390a);
                } catch (Exception e2) {
                    throw new RuntimeException("Failed to instantiate " + str, e2);
                }
            } catch (NoSuchMethodException e3) {
                throw new IllegalStateException("Class" + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
            }
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("Class " + str + " wasn't found", e4);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0513i
    /* renamed from: a */
    public void mo124a(InterfaceC0515k interfaceC0515k, AbstractC0511g.b bVar) throws NoSuchMethodException, SecurityException {
        if (bVar != AbstractC0511g.b.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC0515k.getLifecycle().mo3863c(this);
        Bundle bundleM4693a = this.f4390a.getSavedStateRegistry().m4693a("androidx.savedstate.Restarter");
        if (bundleM4693a == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleM4693a.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            m4691b(it.next());
        }
    }
}
