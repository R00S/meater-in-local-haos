package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: LazyStringArrayList.java */
/* loaded from: classes2.dex */
public class D extends AbstractC2893c<String> implements E, RandomAccess {

    /* renamed from: D, reason: collision with root package name */
    private static final D f37730D;

    /* renamed from: E, reason: collision with root package name */
    public static final E f37731E;

    /* renamed from: C, reason: collision with root package name */
    private final List<Object> f37732C;

    static {
        D d10 = new D();
        f37730D = d10;
        d10.n();
        f37731E = d10;
    }

    public D() {
        this(10);
    }

    private static String h(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC2898h ? ((AbstractC2898h) obj).K() : C2915z.j((byte[]) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2893c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2893c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        c();
        this.f37732C.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2893c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i10, String str) {
        c();
        this.f37732C.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.E
    public void g1(AbstractC2898h abstractC2898h) {
        c();
        this.f37732C.add(abstractC2898h);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2893c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        Object obj = this.f37732C.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC2898h) {
            AbstractC2898h abstractC2898h = (AbstractC2898h) obj;
            String strK = abstractC2898h.K();
            if (abstractC2898h.y()) {
                this.f37732C.set(i10, strK);
            }
            return strK;
        }
        byte[] bArr = (byte[]) obj;
        String strJ = C2915z.j(bArr);
        if (C2915z.g(bArr)) {
            this.f37732C.set(i10, strJ);
        }
        return strJ;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C2915z.i
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public D k(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f37732C);
        return new D((ArrayList<Object>) arrayList);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.E
    public List<?> l() {
        return Collections.unmodifiableList(this.f37732C);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.E
    public E m() {
        return q() ? new o0(this) : this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.E
    public Object p(int i10) {
        return this.f37732C.get(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2893c, com.google.crypto.tink.shaded.protobuf.C2915z.i
    public /* bridge */ /* synthetic */ boolean q() {
        return super.q();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2893c, java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public String remove(int i10) {
        c();
        Object objRemove = this.f37732C.remove(i10);
        ((AbstractList) this).modCount++;
        return h(objRemove);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2893c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2893c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f37732C.size();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public String set(int i10, String str) {
        c();
        return h(this.f37732C.set(i10, str));
    }

    public D(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2893c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2893c, java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends String> collection) {
        c();
        if (collection instanceof E) {
            collection = ((E) collection).l();
        }
        boolean zAddAll = this.f37732C.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2893c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    private D(ArrayList<Object> arrayList) {
        this.f37732C = arrayList;
    }
}
