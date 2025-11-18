package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: LazyStringArrayList.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.l */
/* loaded from: classes3.dex */
public class C10753l extends AbstractList<String> implements RandomAccess, InterfaceC10754m {

    /* renamed from: f */
    public static final InterfaceC10754m f41323f = new C10753l().mo38431k();

    /* renamed from: g */
    private final List<Object> f41324g;

    public C10753l() {
        this.f41324g = new ArrayList();
    }

    /* renamed from: f */
    private static AbstractC10745d m38423f(Object obj) {
        return obj instanceof AbstractC10745d ? (AbstractC10745d) obj : obj instanceof String ? AbstractC10745d.m38279n((String) obj) : AbstractC10745d.m38277h((byte[]) obj);
    }

    /* renamed from: g */
    private static String m38424g(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC10745d ? ((AbstractC10745d) obj).m38283D() : C10750i.m38416b((byte[]) obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10754m
    /* renamed from: N0 */
    public AbstractC10745d mo38425N0(int i2) {
        Object obj = this.f41324g.get(i2);
        AbstractC10745d abstractC10745dM38423f = m38423f(obj);
        if (abstractC10745dM38423f != obj) {
            this.f41324g.set(i2, abstractC10745dM38423f);
        }
        return abstractC10745dM38423f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i2, String str) {
        this.f41324g.add(i2, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f41324g.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public String get(int i2) {
        Object obj = this.f41324g.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC10745d) {
            AbstractC10745d abstractC10745d = (AbstractC10745d) obj;
            String strM38283D = abstractC10745d.m38283D();
            if (abstractC10745d.mo38290t()) {
                this.f41324g.set(i2, strM38283D);
            }
            return strM38283D;
        }
        byte[] bArr = (byte[]) obj;
        String strM38416b = C10750i.m38416b(bArr);
        if (C10750i.m38415a(bArr)) {
            this.f41324g.set(i2, strM38416b);
        }
        return strM38416b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10754m
    /* renamed from: h1 */
    public void mo38428h1(AbstractC10745d abstractC10745d) {
        this.f41324g.add(abstractC10745d);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public String remove(int i2) {
        Object objRemove = this.f41324g.remove(i2);
        ((AbstractList) this).modCount++;
        return m38424g(objRemove);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10754m
    /* renamed from: j */
    public List<?> mo38430j() {
        return Collections.unmodifiableList(this.f41324g);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10754m
    /* renamed from: k */
    public InterfaceC10754m mo38431k() {
        return new C10762u(this);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public String set(int i2, String str) {
        return m38424g(this.f41324g.set(i2, str));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f41324g.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i2, Collection<? extends String> collection) {
        if (collection instanceof InterfaceC10754m) {
            collection = ((InterfaceC10754m) collection).mo38430j();
        }
        boolean zAddAll = this.f41324g.addAll(i2, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    public C10753l(InterfaceC10754m interfaceC10754m) {
        this.f41324g = new ArrayList(interfaceC10754m.size());
        addAll(interfaceC10754m);
    }
}
