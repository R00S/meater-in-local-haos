package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: FragmentStore.java */
/* renamed from: androidx.fragment.app.t */
/* loaded from: classes.dex */
class C0484t {

    /* renamed from: a */
    private final ArrayList<Fragment> f3313a = new ArrayList<>();

    /* renamed from: b */
    private final HashMap<String, C0482r> f3314b = new HashMap<>();

    /* renamed from: c */
    private C0478n f3315c;

    C0484t() {
    }

    /* renamed from: a */
    void m3710a(Fragment fragment) {
        if (this.f3313a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f3313a) {
            this.f3313a.add(fragment);
        }
        fragment.mAdded = true;
    }

    /* renamed from: b */
    void m3711b() {
        this.f3314b.values().removeAll(Collections.singleton(null));
    }

    /* renamed from: c */
    boolean m3712c(String str) {
        return this.f3314b.get(str) != null;
    }

    /* renamed from: d */
    void m3713d(int i2) {
        for (C0482r c0482r : this.f3314b.values()) {
            if (c0482r != null) {
                c0482r.m3707u(i2);
            }
        }
    }

    /* renamed from: e */
    void m3714e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f3314b.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments:");
            for (C0482r c0482r : this.f3314b.values()) {
                printWriter.print(str);
                if (c0482r != null) {
                    Fragment fragmentM3699k = c0482r.m3699k();
                    printWriter.println(fragmentM3699k);
                    fragmentM3699k.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f3313a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = this.f3313a.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    /* renamed from: f */
    Fragment m3715f(String str) {
        C0482r c0482r = this.f3314b.get(str);
        if (c0482r != null) {
            return c0482r.m3699k();
        }
        return null;
    }

    /* renamed from: g */
    Fragment m3716g(int i2) {
        for (int size = this.f3313a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f3313a.get(size);
            if (fragment != null && fragment.mFragmentId == i2) {
                return fragment;
            }
        }
        for (C0482r c0482r : this.f3314b.values()) {
            if (c0482r != null) {
                Fragment fragmentM3699k = c0482r.m3699k();
                if (fragmentM3699k.mFragmentId == i2) {
                    return fragmentM3699k;
                }
            }
        }
        return null;
    }

    /* renamed from: h */
    Fragment m3717h(String str) {
        if (str != null) {
            for (int size = this.f3313a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f3313a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (C0482r c0482r : this.f3314b.values()) {
            if (c0482r != null) {
                Fragment fragmentM3699k = c0482r.m3699k();
                if (str.equals(fragmentM3699k.mTag)) {
                    return fragmentM3699k;
                }
            }
        }
        return null;
    }

    /* renamed from: i */
    Fragment m3718i(String str) {
        Fragment fragmentFindFragmentByWho;
        for (C0482r c0482r : this.f3314b.values()) {
            if (c0482r != null && (fragmentFindFragmentByWho = c0482r.m3699k().findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    /* renamed from: j */
    int m3719j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f3313a.indexOf(fragment);
        for (int i2 = iIndexOf - 1; i2 >= 0; i2--) {
            Fragment fragment2 = this.f3313a.get(i2);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f3313a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f3313a.get(iIndexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* renamed from: k */
    List<C0482r> m3720k() {
        ArrayList arrayList = new ArrayList();
        for (C0482r c0482r : this.f3314b.values()) {
            if (c0482r != null) {
                arrayList.add(c0482r);
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    List<Fragment> m3721l() {
        ArrayList arrayList = new ArrayList();
        for (C0482r c0482r : this.f3314b.values()) {
            if (c0482r != null) {
                arrayList.add(c0482r.m3699k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* renamed from: m */
    C0482r m3722m(String str) {
        return this.f3314b.get(str);
    }

    /* renamed from: n */
    List<Fragment> m3723n() {
        ArrayList arrayList;
        if (this.f3313a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f3313a) {
            arrayList = new ArrayList(this.f3313a);
        }
        return arrayList;
    }

    /* renamed from: o */
    C0478n m3724o() {
        return this.f3315c;
    }

    /* renamed from: p */
    void m3725p(C0482r c0482r) {
        Fragment fragmentM3699k = c0482r.m3699k();
        if (m3712c(fragmentM3699k.mWho)) {
            return;
        }
        this.f3314b.put(fragmentM3699k.mWho, c0482r);
        if (fragmentM3699k.mRetainInstanceChangedWhileDetached) {
            if (fragmentM3699k.mRetainInstance) {
                this.f3315c.m3675f(fragmentM3699k);
            } else {
                this.f3315c.m3682n(fragmentM3699k);
            }
            fragmentM3699k.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.m3392H0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragmentM3699k);
        }
    }

    /* renamed from: q */
    void m3726q(C0482r c0482r) {
        Fragment fragmentM3699k = c0482r.m3699k();
        if (fragmentM3699k.mRetainInstance) {
            this.f3315c.m3682n(fragmentM3699k);
        }
        if (this.f3314b.put(fragmentM3699k.mWho, null) != null && FragmentManager.m3392H0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragmentM3699k);
        }
    }

    /* renamed from: r */
    void m3727r() {
        Iterator<Fragment> it = this.f3313a.iterator();
        while (it.hasNext()) {
            C0482r c0482r = this.f3314b.get(it.next().mWho);
            if (c0482r != null) {
                c0482r.m3700m();
            }
        }
        for (C0482r c0482r2 : this.f3314b.values()) {
            if (c0482r2 != null) {
                c0482r2.m3700m();
                Fragment fragmentM3699k = c0482r2.m3699k();
                if (fragmentM3699k.mRemoving && !fragmentM3699k.isInBackStack()) {
                    m3726q(c0482r2);
                }
            }
        }
    }

    /* renamed from: s */
    void m3728s(Fragment fragment) {
        synchronized (this.f3313a) {
            this.f3313a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    /* renamed from: t */
    void m3729t() {
        this.f3314b.clear();
    }

    /* renamed from: u */
    void m3730u(List<String> list) {
        this.f3313a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment fragmentM3715f = m3715f(str);
                if (fragmentM3715f == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (FragmentManager.m3392H0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + fragmentM3715f);
                }
                m3710a(fragmentM3715f);
            }
        }
    }

    /* renamed from: v */
    ArrayList<FragmentState> m3731v() {
        ArrayList<FragmentState> arrayList = new ArrayList<>(this.f3314b.size());
        for (C0482r c0482r : this.f3314b.values()) {
            if (c0482r != null) {
                Fragment fragmentM3699k = c0482r.m3699k();
                FragmentState fragmentStateM3705s = c0482r.m3705s();
                arrayList.add(fragmentStateM3705s);
                if (FragmentManager.m3392H0(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragmentM3699k + ": " + fragmentStateM3705s.f3181r);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: w */
    ArrayList<String> m3732w() {
        synchronized (this.f3313a) {
            if (this.f3313a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f3313a.size());
            Iterator<Fragment> it = this.f3313a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.mWho);
                if (FragmentManager.m3392H0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.mWho + "): " + next);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: x */
    void m3733x(C0478n c0478n) {
        this.f3315c = c0478n;
    }
}
