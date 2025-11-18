package androidx.fragment.app;

import android.util.Log;
import android.view.Y;
import android.view.a0;
import android.view.b0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: FragmentManagerViewModel.java */
/* loaded from: classes.dex */
final class y extends Y {

    /* renamed from: i, reason: collision with root package name */
    private static final a0.c f25819i = new a();

    /* renamed from: e, reason: collision with root package name */
    private final boolean f25823e;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<String, Fragment> f25820b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, y> f25821c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashMap<String, b0> f25822d = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private boolean f25824f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f25825g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f25826h = false;

    /* compiled from: FragmentManagerViewModel.java */
    class a implements a0.c {
        a() {
        }

        @Override // androidx.lifecycle.a0.c
        public <T extends Y> T a(Class<T> cls) {
            return new y(true);
        }
    }

    y(boolean z10) {
        this.f25823e = z10;
    }

    private void k(String str, boolean z10) {
        y yVar = this.f25821c.get(str);
        if (yVar != null) {
            if (z10) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(yVar.f25821c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    yVar.j((String) it.next(), true);
                }
            }
            yVar.g();
            this.f25821c.remove(str);
        }
        b0 b0Var = this.f25822d.get(str);
        if (b0Var != null) {
            b0Var.a();
            this.f25822d.remove(str);
        }
    }

    static y n(b0 b0Var) {
        return (y) new a0(b0Var, f25819i).b(y.class);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        return this.f25820b.equals(yVar.f25820b) && this.f25821c.equals(yVar.f25821c) && this.f25822d.equals(yVar.f25822d);
    }

    @Override // android.view.Y
    protected void g() {
        if (v.Q0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f25824f = true;
    }

    void h(Fragment fragment) {
        if (this.f25826h) {
            if (v.Q0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f25820b.containsKey(fragment.f25458G)) {
                return;
            }
            this.f25820b.put(fragment.f25458G, fragment);
            if (v.Q0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    public int hashCode() {
        return (((this.f25820b.hashCode() * 31) + this.f25821c.hashCode()) * 31) + this.f25822d.hashCode();
    }

    void i(Fragment fragment, boolean z10) {
        if (v.Q0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        k(fragment.f25458G, z10);
    }

    void j(String str, boolean z10) {
        if (v.Q0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        k(str, z10);
    }

    Fragment l(String str) {
        return this.f25820b.get(str);
    }

    y m(Fragment fragment) {
        y yVar = this.f25821c.get(fragment.f25458G);
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(this.f25823e);
        this.f25821c.put(fragment.f25458G, yVar2);
        return yVar2;
    }

    Collection<Fragment> o() {
        return new ArrayList(this.f25820b.values());
    }

    b0 p(Fragment fragment) {
        b0 b0Var = this.f25822d.get(fragment.f25458G);
        if (b0Var != null) {
            return b0Var;
        }
        b0 b0Var2 = new b0();
        this.f25822d.put(fragment.f25458G, b0Var2);
        return b0Var2;
    }

    boolean q() {
        return this.f25824f;
    }

    void r(Fragment fragment) {
        if (this.f25826h) {
            if (v.Q0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f25820b.remove(fragment.f25458G) == null || !v.Q0(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    void s(boolean z10) {
        this.f25826h = z10;
    }

    boolean t(Fragment fragment) {
        if (this.f25820b.containsKey(fragment.f25458G)) {
            return this.f25823e ? this.f25824f : !this.f25825g;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<Fragment> it = this.f25820b.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f25821c.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f25822d.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
