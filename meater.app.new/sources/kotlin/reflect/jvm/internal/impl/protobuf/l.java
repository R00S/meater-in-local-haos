package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: LazyStringArrayList.java */
/* loaded from: classes3.dex */
public class l extends AbstractList<String> implements RandomAccess, m {

    /* renamed from: C, reason: collision with root package name */
    public static final m f44085C = new l().m();

    /* renamed from: B, reason: collision with root package name */
    private final List<Object> f44086B;

    public l() {
        this.f44086B = new ArrayList();
    }

    private static d f(Object obj) {
        return obj instanceof d ? (d) obj : obj instanceof String ? d.r((String) obj) : d.i((byte[]) obj);
    }

    private static String h(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof d ? ((d) obj).J() : i.b((byte[]) obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public d a1(int i10) {
        Object obj = this.f44086B.get(i10);
        d dVarF = f(obj);
        if (dVarF != obj) {
            this.f44086B.set(i10, dVarF);
        }
        return dVarF;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i10, String str) {
        this.f44086B.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f44086B.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        Object obj = this.f44086B.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String strJ = dVar.J();
            if (dVar.z()) {
                this.f44086B.set(i10, strJ);
            }
            return strJ;
        }
        byte[] bArr = (byte[]) obj;
        String strB = i.b(bArr);
        if (i.a(bArr)) {
            this.f44086B.set(i10, strB);
        }
        return strB;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public String remove(int i10) {
        Object objRemove = this.f44086B.remove(i10);
        ((AbstractList) this).modCount++;
        return h(objRemove);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public List<?> l() {
        return Collections.unmodifiableList(this.f44086B);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public m m() {
        return new u(this);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public String set(int i10, String str) {
        return h(this.f44086B.set(i10, str));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f44086B.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.m
    public void u1(d dVar) {
        this.f44086B.add(dVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends String> collection) {
        if (collection instanceof m) {
            collection = ((m) collection).l();
        }
        boolean zAddAll = this.f44086B.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    public l(m mVar) {
        this.f44086B = new ArrayList(mVar.size());
        addAll(mVar);
    }
}
