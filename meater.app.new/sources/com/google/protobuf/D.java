package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: LazyStringArrayList.java */
/* loaded from: classes2.dex */
public class D extends AbstractC2943c<String> implements E, RandomAccess {

    /* renamed from: D, reason: collision with root package name */
    private static final D f39163D;

    /* renamed from: E, reason: collision with root package name */
    @Deprecated
    public static final E f39164E;

    /* renamed from: C, reason: collision with root package name */
    private final List<Object> f39165C;

    static {
        D d10 = new D(false);
        f39163D = d10;
        f39164E = d10;
    }

    private D(boolean z10) {
        super(z10);
        this.f39165C = Collections.emptyList();
    }

    private static String h(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC2947g ? ((AbstractC2947g) obj).H() : C2964y.j((byte[]) obj);
    }

    @Override // com.google.protobuf.E
    public void W(AbstractC2947g abstractC2947g) {
        c();
        this.f39165C.add(abstractC2947g);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC2943c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.protobuf.AbstractC2943c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        c();
        this.f39165C.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC2943c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i10, String str) {
        c();
        this.f39165C.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC2943c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        Object obj = this.f39165C.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC2947g) {
            AbstractC2947g abstractC2947g = (AbstractC2947g) obj;
            String strH = abstractC2947g.H();
            if (abstractC2947g.w()) {
                this.f39165C.set(i10, strH);
            }
            return strH;
        }
        byte[] bArr = (byte[]) obj;
        String strJ = C2964y.j(bArr);
        if (C2964y.g(bArr)) {
            this.f39165C.set(i10, strJ);
        }
        return strJ;
    }

    @Override // com.google.protobuf.C2964y.i
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public D k2(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f39165C);
        return new D((ArrayList<Object>) arrayList);
    }

    @Override // com.google.protobuf.E
    public List<?> l() {
        return Collections.unmodifiableList(this.f39165C);
    }

    @Override // com.google.protobuf.E
    public E m() {
        return q() ? new o0(this) : this;
    }

    @Override // com.google.protobuf.E
    public Object p(int i10) {
        return this.f39165C.get(i10);
    }

    @Override // com.google.protobuf.AbstractC2943c, com.google.protobuf.C2964y.i
    public /* bridge */ /* synthetic */ boolean q() {
        return super.q();
    }

    @Override // com.google.protobuf.AbstractC2943c, java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public String remove(int i10) {
        c();
        Object objRemove = this.f39165C.remove(i10);
        ((AbstractList) this).modCount++;
        return h(objRemove);
    }

    @Override // com.google.protobuf.AbstractC2943c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.protobuf.AbstractC2943c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f39165C.size();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public String set(int i10, String str) {
        c();
        return h(this.f39165C.set(i10, str));
    }

    @Override // com.google.protobuf.AbstractC2943c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.protobuf.AbstractC2943c, java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends String> collection) {
        c();
        if (collection instanceof E) {
            collection = ((E) collection).l();
        }
        boolean zAddAll = this.f39165C.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.protobuf.AbstractC2943c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public D(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    private D(ArrayList<Object> arrayList) {
        this.f39165C = arrayList;
    }
}
