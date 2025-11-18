package androidx.fragment.app;

import android.os.Bundle;
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
/* loaded from: classes.dex */
class B {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<Fragment> f25390a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<String, A> f25391b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, Bundle> f25392c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private y f25393d;

    B() {
    }

    void A(y yVar) {
        this.f25393d = yVar;
    }

    Bundle B(String str, Bundle bundle) {
        return bundle != null ? this.f25392c.put(str, bundle) : this.f25392c.remove(str);
    }

    void a(Fragment fragment) {
        if (this.f25390a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f25390a) {
            this.f25390a.add(fragment);
        }
        fragment.f25464M = true;
    }

    void b() {
        this.f25391b.values().removeAll(Collections.singleton(null));
    }

    boolean c(String str) {
        return this.f25391b.get(str) != null;
    }

    void d(int i10) {
        for (A a10 : this.f25391b.values()) {
            if (a10 != null) {
                a10.t(i10);
            }
        }
    }

    void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f25391b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (A a10 : this.f25391b.values()) {
                printWriter.print(str);
                if (a10 != null) {
                    Fragment fragmentK = a10.k();
                    printWriter.println(fragmentK);
                    fragmentK.P(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f25390a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                Fragment fragment = this.f25390a.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    Fragment f(String str) {
        A a10 = this.f25391b.get(str);
        if (a10 != null) {
            return a10.k();
        }
        return null;
    }

    Fragment g(int i10) {
        for (int size = this.f25390a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f25390a.get(size);
            if (fragment != null && fragment.f25478a0 == i10) {
                return fragment;
            }
        }
        for (A a10 : this.f25391b.values()) {
            if (a10 != null) {
                Fragment fragmentK = a10.k();
                if (fragmentK.f25478a0 == i10) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    Fragment h(String str) {
        if (str != null) {
            for (int size = this.f25390a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f25390a.get(size);
                if (fragment != null && str.equals(fragment.f25480c0)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (A a10 : this.f25391b.values()) {
            if (a10 != null) {
                Fragment fragmentK = a10.k();
                if (str.equals(fragmentK.f25480c0)) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    Fragment i(String str) {
        Fragment fragmentR;
        for (A a10 : this.f25391b.values()) {
            if (a10 != null && (fragmentR = a10.k().R(str)) != null) {
                return fragmentR;
            }
        }
        return null;
    }

    int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.f25488k0;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f25390a.indexOf(fragment);
        for (int i10 = iIndexOf - 1; i10 >= 0; i10--) {
            Fragment fragment2 = this.f25390a.get(i10);
            if (fragment2.f25488k0 == viewGroup && (view2 = fragment2.f25489l0) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f25390a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f25390a.get(iIndexOf);
            if (fragment3.f25488k0 == viewGroup && (view = fragment3.f25489l0) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    List<A> k() {
        ArrayList arrayList = new ArrayList();
        for (A a10 : this.f25391b.values()) {
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        return arrayList;
    }

    List<Fragment> l() {
        ArrayList arrayList = new ArrayList();
        for (A a10 : this.f25391b.values()) {
            if (a10 != null) {
                arrayList.add(a10.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    HashMap<String, Bundle> m() {
        return this.f25392c;
    }

    A n(String str) {
        return this.f25391b.get(str);
    }

    List<Fragment> o() {
        ArrayList arrayList;
        if (this.f25390a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f25390a) {
            arrayList = new ArrayList(this.f25390a);
        }
        return arrayList;
    }

    y p() {
        return this.f25393d;
    }

    Bundle q(String str) {
        return this.f25392c.get(str);
    }

    void r(A a10) {
        Fragment fragmentK = a10.k();
        if (c(fragmentK.f25458G)) {
            return;
        }
        this.f25391b.put(fragmentK.f25458G, a10);
        if (fragmentK.f25484g0) {
            if (fragmentK.f25483f0) {
                this.f25393d.h(fragmentK);
            } else {
                this.f25393d.r(fragmentK);
            }
            fragmentK.f25484g0 = false;
        }
        if (v.Q0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragmentK);
        }
    }

    void s(A a10) {
        Fragment fragmentK = a10.k();
        if (fragmentK.f25483f0) {
            this.f25393d.r(fragmentK);
        }
        if (this.f25391b.get(fragmentK.f25458G) == a10 && this.f25391b.put(fragmentK.f25458G, null) != null && v.Q0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragmentK);
        }
    }

    void t() {
        Iterator<Fragment> it = this.f25390a.iterator();
        while (it.hasNext()) {
            A a10 = this.f25391b.get(it.next().f25458G);
            if (a10 != null) {
                a10.m();
            }
        }
        for (A a11 : this.f25391b.values()) {
            if (a11 != null) {
                a11.m();
                Fragment fragmentK = a11.k();
                if (fragmentK.f25465N && !fragmentK.M0()) {
                    if (fragmentK.f25467P && !this.f25392c.containsKey(fragmentK.f25458G)) {
                        B(fragmentK.f25458G, a11.r());
                    }
                    s(a11);
                }
            }
        }
    }

    void u(Fragment fragment) {
        synchronized (this.f25390a) {
            this.f25390a.remove(fragment);
        }
        fragment.f25464M = false;
    }

    void v() {
        this.f25391b.clear();
    }

    void w(List<String> list) {
        this.f25390a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment fragmentF = f(str);
                if (fragmentF == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (v.Q0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + fragmentF);
                }
                a(fragmentF);
            }
        }
    }

    void x(HashMap<String, Bundle> map) {
        this.f25392c.clear();
        this.f25392c.putAll(map);
    }

    ArrayList<String> y() {
        ArrayList<String> arrayList = new ArrayList<>(this.f25391b.size());
        for (A a10 : this.f25391b.values()) {
            if (a10 != null) {
                Fragment fragmentK = a10.k();
                B(fragmentK.f25458G, a10.r());
                arrayList.add(fragmentK.f25458G);
                if (v.Q0(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragmentK + ": " + fragmentK.f25451C);
                }
            }
        }
        return arrayList;
    }

    ArrayList<String> z() {
        synchronized (this.f25390a) {
            try {
                if (this.f25390a.isEmpty()) {
                    return null;
                }
                ArrayList<String> arrayList = new ArrayList<>(this.f25390a.size());
                Iterator<Fragment> it = this.f25390a.iterator();
                while (it.hasNext()) {
                    Fragment next = it.next();
                    arrayList.add(next.f25458G);
                    if (v.Q0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f25458G + "): " + next);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
