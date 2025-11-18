package androidx.coordinatorlayout.widget;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p024c.p041e.C0873g;
import p024c.p052i.p059j.C0957g;
import p024c.p052i.p059j.InterfaceC0956f;

/* compiled from: DirectedAcyclicGraph.java */
/* renamed from: androidx.coordinatorlayout.widget.a */
/* loaded from: classes.dex */
public final class C0232a<T> {

    /* renamed from: a */
    private final InterfaceC0956f<ArrayList<T>> f2022a = new C0957g(10);

    /* renamed from: b */
    private final C0873g<T, ArrayList<T>> f2023b = new C0873g<>();

    /* renamed from: c */
    private final ArrayList<T> f2024c = new ArrayList<>();

    /* renamed from: d */
    private final HashSet<T> f2025d = new HashSet<>();

    /* renamed from: e */
    private void m1494e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t);
        ArrayList<T> arrayList2 = this.f2023b.get(t);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                m1494e(arrayList2.get(i2), arrayList, hashSet);
            }
        }
        hashSet.remove(t);
        arrayList.add(t);
    }

    /* renamed from: f */
    private ArrayList<T> m1495f() {
        ArrayList<T> arrayListMo6061b = this.f2022a.mo6061b();
        return arrayListMo6061b == null ? new ArrayList<>() : arrayListMo6061b;
    }

    /* renamed from: k */
    private void m1496k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f2022a.mo6060a(arrayList);
    }

    /* renamed from: a */
    public void m1497a(T t, T t2) {
        if (!this.f2023b.containsKey(t) || !this.f2023b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayListM1495f = this.f2023b.get(t);
        if (arrayListM1495f == null) {
            arrayListM1495f = m1495f();
            this.f2023b.put(t, arrayListM1495f);
        }
        arrayListM1495f.add(t2);
    }

    /* renamed from: b */
    public void m1498b(T t) {
        if (this.f2023b.containsKey(t)) {
            return;
        }
        this.f2023b.put(t, null);
    }

    /* renamed from: c */
    public void m1499c() {
        int size = this.f2023b.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList<T> arrayListM5477n = this.f2023b.m5477n(i2);
            if (arrayListM5477n != null) {
                m1496k(arrayListM5477n);
            }
        }
        this.f2023b.clear();
    }

    /* renamed from: d */
    public boolean m1500d(T t) {
        return this.f2023b.containsKey(t);
    }

    /* renamed from: g */
    public List m1501g(T t) {
        return this.f2023b.get(t);
    }

    /* renamed from: h */
    public List<T> m1502h(T t) {
        int size = this.f2023b.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList<T> arrayListM5477n = this.f2023b.m5477n(i2);
            if (arrayListM5477n != null && arrayListM5477n.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f2023b.m5473j(i2));
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public ArrayList<T> m1503i() {
        this.f2024c.clear();
        this.f2025d.clear();
        int size = this.f2023b.size();
        for (int i2 = 0; i2 < size; i2++) {
            m1494e(this.f2023b.m5473j(i2), this.f2024c, this.f2025d);
        }
        return this.f2024c;
    }

    /* renamed from: j */
    public boolean m1504j(T t) {
        int size = this.f2023b.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList<T> arrayListM5477n = this.f2023b.m5477n(i2);
            if (arrayListM5477n != null && arrayListM5477n.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
