package T;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractC3828i;
import kotlin.jvm.internal.C3862t;

/* compiled from: PersistentHashMapContentViews.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0005B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\f\u001a\u00020\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u000eH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"LT/n;", "K", "V", "LR/d;", "", "Lkotlin/collections/i;", "LT/d;", "map", "<init>", "(LT/d;)V", "element", "", "c", "(Ljava/util/Map$Entry;)Z", "", "iterator", "()Ljava/util/Iterator;", "C", "LT/d;", "", "getSize", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n<K, V> extends AbstractC3828i<Map.Entry<? extends K, ? extends V>> implements R.d<Map.Entry<? extends K, ? extends V>> {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final d<K, V> map;

    public n(d<K, V> dVar) {
        this.map = dVar;
    }

    public boolean c(Map.Entry<? extends K, ? extends V> element) {
        if (element == null) {
            return false;
        }
        V v10 = this.map.get(element.getKey());
        return v10 != null ? C3862t.b(v10, element.getValue()) : element.getValue() == null && this.map.containsKey(element.getKey());
    }

    @Override // kotlin.collections.AbstractC3820a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return c((Map.Entry) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractC3820a
    public int getSize() {
        return this.map.size();
    }

    @Override // kotlin.collections.AbstractC3820a, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<Map.Entry<K, V>> iterator() {
        return new o(this.map.p());
    }
}
