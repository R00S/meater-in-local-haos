package androidx.coordinatorlayout.widget;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import r1.C4340g;
import r1.InterfaceC4339f;
import s.X;

/* compiled from: DirectedAcyclicGraph.java */
/* loaded from: classes.dex */
public final class b<T> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4339f<ArrayList<T>> f24707a = new C4340g(10);

    /* renamed from: b, reason: collision with root package name */
    private final X<T, ArrayList<T>> f24708b = new X<>();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<T> f24709c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<T> f24710d = new HashSet<>();

    private void e(T t10, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t10)) {
            return;
        }
        if (hashSet.contains(t10)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t10);
        ArrayList<T> arrayList2 = this.f24708b.get(t10);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                e(arrayList2.get(i10), arrayList, hashSet);
            }
        }
        hashSet.remove(t10);
        arrayList.add(t10);
    }

    private ArrayList<T> f() {
        ArrayList<T> arrayListB = this.f24707a.b();
        return arrayListB == null ? new ArrayList<>() : arrayListB;
    }

    private void k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f24707a.a(arrayList);
    }

    public void a(T t10, T t11) {
        if (!this.f24708b.containsKey(t10) || !this.f24708b.containsKey(t11)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayListF = this.f24708b.get(t10);
        if (arrayListF == null) {
            arrayListF = f();
            this.f24708b.put(t10, arrayListF);
        }
        arrayListF.add(t11);
    }

    public void b(T t10) {
        if (this.f24708b.containsKey(t10)) {
            return;
        }
        this.f24708b.put(t10, null);
    }

    public void c() {
        int size = this.f24708b.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> arrayListL = this.f24708b.l(i10);
            if (arrayListL != null) {
                k(arrayListL);
            }
        }
        this.f24708b.clear();
    }

    public boolean d(T t10) {
        return this.f24708b.containsKey(t10);
    }

    public List g(T t10) {
        return this.f24708b.get(t10);
    }

    public List<T> h(T t10) {
        int size = this.f24708b.getSize();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> arrayListL = this.f24708b.l(i10);
            if (arrayListL != null && arrayListL.contains(t10)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f24708b.h(i10));
            }
        }
        return arrayList;
    }

    public ArrayList<T> i() {
        this.f24709c.clear();
        this.f24710d.clear();
        int size = this.f24708b.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            e(this.f24708b.h(i10), this.f24709c, this.f24710d);
        }
        return this.f24709c;
    }

    public boolean j(T t10) {
        int size = this.f24708b.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList<T> arrayListL = this.f24708b.l(i10);
            if (arrayListL != null && arrayListL.contains(t10)) {
                return true;
            }
        }
        return false;
    }
}
