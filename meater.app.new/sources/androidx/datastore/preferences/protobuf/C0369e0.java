package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: LazyStringArrayList.java */
/* renamed from: androidx.datastore.preferences.protobuf.e0 */
/* loaded from: classes.dex */
public class C0369e0 extends AbstractC0362c<String> implements InterfaceC0372f0, RandomAccess {

    /* renamed from: g */
    private static final C0369e0 f2725g;

    /* renamed from: h */
    public static final InterfaceC0372f0 f2726h;

    /* renamed from: i */
    private final List<Object> f2727i;

    static {
        C0369e0 c0369e0 = new C0369e0();
        f2725g = c0369e0;
        c0369e0.mo2569B();
        f2726h = c0369e0;
    }

    public C0369e0() {
        this(10);
    }

    /* renamed from: g */
    private static String m2670g(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC0377h ? ((AbstractC0377h) obj).m2722E() : C0357a0.m2565j((byte[]) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0372f0
    /* renamed from: a0 */
    public void mo2671a0(AbstractC0377h abstractC0377h) {
        m2583c();
        this.f2727i.add(abstractC0377h);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0362c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0372f0
    /* renamed from: c1 */
    public Object mo2672c1(int i2) {
        return this.f2727i.get(i2);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0362c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m2583c();
        this.f2727i.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0362c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i2, String str) {
        m2583c();
        this.f2727i.add(i2, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public String get(int i2) {
        Object obj = this.f2727i.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC0377h) {
            AbstractC0377h abstractC0377h = (AbstractC0377h) obj;
            String strM2722E = abstractC0377h.m2722E();
            if (abstractC0377h.mo2727s()) {
                this.f2727i.set(i2, strM2722E);
            }
            return strM2722E;
        }
        byte[] bArr = (byte[]) obj;
        String strM2565j = C0357a0.m2565j(bArr);
        if (C0357a0.m2562g(bArr)) {
            this.f2727i.set(i2, strM2565j);
        }
        return strM2565j;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0362c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // androidx.datastore.preferences.protobuf.C0357a0.i
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C0369e0 mo2570J(int i2) {
        if (i2 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i2);
        arrayList.addAll(this.f2727i);
        return new C0369e0((ArrayList<Object>) arrayList);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0372f0
    /* renamed from: j */
    public List<?> mo2676j() {
        return Collections.unmodifiableList(this.f2727i);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0372f0
    /* renamed from: k */
    public InterfaceC0372f0 mo2677k() {
        return mo2571l1() ? new C0400o1(this) : this;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0362c, androidx.datastore.preferences.protobuf.C0357a0.i
    /* renamed from: l1 */
    public /* bridge */ /* synthetic */ boolean mo2571l1() {
        return super.mo2571l1();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public String remove(int i2) {
        m2583c();
        Object objRemove = this.f2727i.remove(i2);
        ((AbstractList) this).modCount++;
        return m2670g(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public String set(int i2, String str) {
        m2583c();
        return m2670g(this.f2727i.set(i2, str));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0362c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0362c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f2727i.size();
    }

    public C0369e0(int i2) {
        this((ArrayList<Object>) new ArrayList(i2));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0362c, java.util.AbstractList, java.util.List
    public boolean addAll(int i2, Collection<? extends String> collection) {
        m2583c();
        if (collection instanceof InterfaceC0372f0) {
            collection = ((InterfaceC0372f0) collection).mo2676j();
        }
        boolean zAddAll = this.f2727i.addAll(i2, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0362c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    private C0369e0(ArrayList<Object> arrayList) {
        this.f2727i = arrayList;
    }
}
