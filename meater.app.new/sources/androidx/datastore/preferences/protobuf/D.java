package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: LazyStringArrayList.java */
/* loaded from: classes.dex */
public class D extends AbstractC2057c<String> implements E, RandomAccess {

    /* renamed from: D, reason: collision with root package name */
    private static final D f24845D;

    /* renamed from: E, reason: collision with root package name */
    public static final E f24846E;

    /* renamed from: C, reason: collision with root package name */
    private final List<Object> f24847C;

    static {
        D d10 = new D();
        f24845D = d10;
        d10.n();
        f24846E = d10;
    }

    public D() {
        this(10);
    }

    private static String h(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC2062h ? ((AbstractC2062h) obj).K() : C2079z.j((byte[]) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2057c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2057c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        c();
        this.f24847C.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2057c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i10, String str) {
        c();
        this.f24847C.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2057c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        Object obj = this.f24847C.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC2062h) {
            AbstractC2062h abstractC2062h = (AbstractC2062h) obj;
            String strK = abstractC2062h.K();
            if (abstractC2062h.y()) {
                this.f24847C.set(i10, strK);
            }
            return strK;
        }
        byte[] bArr = (byte[]) obj;
        String strJ = C2079z.j(bArr);
        if (C2079z.g(bArr)) {
            this.f24847C.set(i10, strJ);
        }
        return strJ;
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public void i0(AbstractC2062h abstractC2062h) {
        c();
        this.f24847C.add(abstractC2062h);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.C2079z.i
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public D k(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f24847C);
        return new D((ArrayList<Object>) arrayList);
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public List<?> l() {
        return Collections.unmodifiableList(this.f24847C);
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public E m() {
        return q() ? new o0(this) : this;
    }

    @Override // androidx.datastore.preferences.protobuf.E
    public Object p(int i10) {
        return this.f24847C.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2057c, androidx.datastore.preferences.protobuf.C2079z.i
    public /* bridge */ /* synthetic */ boolean q() {
        return super.q();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public String remove(int i10) {
        c();
        Object objRemove = this.f24847C.remove(i10);
        ((AbstractList) this).modCount++;
        return h(objRemove);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2057c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2057c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f24847C.size();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public String set(int i10, String str) {
        c();
        return h(this.f24847C.set(i10, str));
    }

    public D(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2057c, java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends String> collection) {
        c();
        if (collection instanceof E) {
            collection = ((E) collection).l();
        }
        boolean zAddAll = this.f24847C.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2057c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    private D(ArrayList<Object> arrayList) {
        this.f24847C = arrayList;
    }
}
