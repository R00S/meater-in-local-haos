package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.AbstractC0528x;
import androidx.lifecycle.C0529y;
import androidx.lifecycle.C0530z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: FragmentManagerViewModel.java */
/* renamed from: androidx.fragment.app.n */
/* loaded from: classes.dex */
final class C0478n extends AbstractC0528x {

    /* renamed from: c */
    private static final C0529y.b f3297c = new a();

    /* renamed from: g */
    private final boolean f3301g;

    /* renamed from: d */
    private final HashMap<String, Fragment> f3298d = new HashMap<>();

    /* renamed from: e */
    private final HashMap<String, C0478n> f3299e = new HashMap<>();

    /* renamed from: f */
    private final HashMap<String, C0530z> f3300f = new HashMap<>();

    /* renamed from: h */
    private boolean f3302h = false;

    /* renamed from: i */
    private boolean f3303i = false;

    /* renamed from: j */
    private boolean f3304j = false;

    /* compiled from: FragmentManagerViewModel.java */
    /* renamed from: androidx.fragment.app.n$a */
    class a implements C0529y.b {
        a() {
        }

        @Override // androidx.lifecycle.C0529y.b
        /* renamed from: a */
        public <T extends AbstractC0528x> T mo3685a(Class<T> cls) {
            return new C0478n(true);
        }
    }

    C0478n(boolean z) {
        this.f3301g = z;
    }

    /* renamed from: j */
    static C0478n m3673j(C0530z c0530z) {
        return (C0478n) new C0529y(c0530z, f3297c).m3915a(C0478n.class);
    }

    @Override // androidx.lifecycle.AbstractC0528x
    /* renamed from: d */
    protected void mo3674d() {
        if (FragmentManager.m3392H0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f3302h = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0478n.class != obj.getClass()) {
            return false;
        }
        C0478n c0478n = (C0478n) obj;
        return this.f3298d.equals(c0478n.f3298d) && this.f3299e.equals(c0478n.f3299e) && this.f3300f.equals(c0478n.f3300f);
    }

    /* renamed from: f */
    void m3675f(Fragment fragment) {
        if (this.f3304j) {
            if (FragmentManager.m3392H0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f3298d.containsKey(fragment.mWho)) {
                return;
            }
            this.f3298d.put(fragment.mWho, fragment);
            if (FragmentManager.m3392H0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    /* renamed from: g */
    void m3676g(Fragment fragment) {
        if (FragmentManager.m3392H0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        C0478n c0478n = this.f3299e.get(fragment.mWho);
        if (c0478n != null) {
            c0478n.mo3674d();
            this.f3299e.remove(fragment.mWho);
        }
        C0530z c0530z = this.f3300f.get(fragment.mWho);
        if (c0530z != null) {
            c0530z.m3919a();
            this.f3300f.remove(fragment.mWho);
        }
    }

    /* renamed from: h */
    Fragment m3677h(String str) {
        return this.f3298d.get(str);
    }

    public int hashCode() {
        return (((this.f3298d.hashCode() * 31) + this.f3299e.hashCode()) * 31) + this.f3300f.hashCode();
    }

    /* renamed from: i */
    C0478n m3678i(Fragment fragment) {
        C0478n c0478n = this.f3299e.get(fragment.mWho);
        if (c0478n != null) {
            return c0478n;
        }
        C0478n c0478n2 = new C0478n(this.f3301g);
        this.f3299e.put(fragment.mWho, c0478n2);
        return c0478n2;
    }

    /* renamed from: k */
    Collection<Fragment> m3679k() {
        return new ArrayList(this.f3298d.values());
    }

    /* renamed from: l */
    C0530z m3680l(Fragment fragment) {
        C0530z c0530z = this.f3300f.get(fragment.mWho);
        if (c0530z != null) {
            return c0530z;
        }
        C0530z c0530z2 = new C0530z();
        this.f3300f.put(fragment.mWho, c0530z2);
        return c0530z2;
    }

    /* renamed from: m */
    boolean m3681m() {
        return this.f3302h;
    }

    /* renamed from: n */
    void m3682n(Fragment fragment) {
        if (this.f3304j) {
            if (FragmentManager.m3392H0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if ((this.f3298d.remove(fragment.mWho) != null) && FragmentManager.m3392H0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    /* renamed from: o */
    void m3683o(boolean z) {
        this.f3304j = z;
    }

    /* renamed from: p */
    boolean m3684p(Fragment fragment) {
        if (this.f3298d.containsKey(fragment.mWho)) {
            return this.f3301g ? this.f3302h : !this.f3303i;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f3298d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f3299e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f3300f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
