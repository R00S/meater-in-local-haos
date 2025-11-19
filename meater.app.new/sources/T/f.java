package T;

import V.DeltaCounter;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractC3826g;
import kotlin.jvm.internal.C3862t;

/* compiled from: PersistentHashMapBuilder.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\u00020\u00162\u0014\u0010\u0015\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\u0010J\u001d\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR*\u0010'\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R.\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u00106\u001a\u0004\u0018\u00018\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R*\u0010B\u001a\u0002072\u0006\u0010\u0011\u001a\u0002078\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b?\u00109\u001a\u0004\b@\u0010;\"\u0004\bA\u0010=R&\u0010G\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010D0C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010FR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00010J8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006N"}, d2 = {"LT/f;", "K", "V", "", "Lkotlin/collections/g;", "LT/d;", "map", "<init>", "(LT/d;)V", "g", "()LT/d;", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "from", "Loa/F;", "putAll", "(Ljava/util/Map;)V", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "clear", "()V", "B", "LT/d;", "LV/e;", "<set-?>", "C", "LV/e;", "j", "()LV/e;", "m", "(LV/e;)V", "ownership", "LT/t;", "D", "LT/t;", "i", "()LT/t;", "setNode$runtime_release", "(LT/t;)V", "node", "E", "Ljava/lang/Object;", "getOperationResult$runtime_release", "()Ljava/lang/Object;", "l", "(Ljava/lang/Object;)V", "operationResult", "", "F", "I", "h", "()I", "k", "(I)V", "modCount", "G", "c", "n", "size", "", "", "a", "()Ljava/util/Set;", "entries", "b", "keys", "", "d", "()Ljava/util/Collection;", "values", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class f<K, V> extends AbstractC3826g<K, V> implements Map, Ca.e {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private d<K, V> map;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private V.e ownership = new V.e();

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private t<K, V> node;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private V operationResult;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private int modCount;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private int size;

    public f(d<K, V> dVar) {
        this.map = dVar;
        this.node = this.map.p();
        this.size = this.map.size();
    }

    @Override // kotlin.collections.AbstractC3826g
    public Set<Map.Entry<K, V>> a() {
        return new h(this);
    }

    @Override // kotlin.collections.AbstractC3826g
    public Set<K> b() {
        return new j(this);
    }

    @Override // kotlin.collections.AbstractC3826g
    /* renamed from: c, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        t<K, V> tVarA = t.INSTANCE.a();
        C3862t.e(tVarA, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.node = tVarA;
        n(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(K key) {
        return this.node.k(key != null ? key.hashCode() : 0, key, 0);
    }

    @Override // kotlin.collections.AbstractC3826g
    public Collection<V> d() {
        return new l(this);
    }

    public d<K, V> g() {
        d<K, V> dVar;
        if (this.node == this.map.p()) {
            dVar = this.map;
        } else {
            this.ownership = new V.e();
            dVar = new d<>(this.node, size());
        }
        this.map = dVar;
        return dVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(K key) {
        return this.node.o(key != null ? key.hashCode() : 0, key, 0);
    }

    /* renamed from: h, reason: from getter */
    public final int getModCount() {
        return this.modCount;
    }

    public final t<K, V> i() {
        return this.node;
    }

    /* renamed from: j, reason: from getter */
    public final V.e getOwnership() {
        return this.ownership;
    }

    public final void k(int i10) {
        this.modCount = i10;
    }

    public final void l(V v10) {
        this.operationResult = v10;
    }

    protected final void m(V.e eVar) {
        this.ownership = eVar;
    }

    public void n(int i10) {
        this.size = i10;
        this.modCount++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K key, V value) {
        this.operationResult = null;
        this.node = this.node.D(key != null ? key.hashCode() : 0, key, value, 0, this);
        return this.operationResult;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        d<K, V> dVarG = from instanceof d ? (d) from : null;
        if (dVarG == null) {
            f fVar = from instanceof f ? (f) from : null;
            dVarG = fVar != null ? fVar.g() : null;
        }
        if (dVarG == null) {
            super.putAll(from);
            return;
        }
        DeltaCounter deltaCounter = new DeltaCounter(0, 1, null);
        int size = size();
        t<K, V> tVar = this.node;
        t<K, V> tVarP = dVarG.p();
        C3862t.e(tVarP, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.node = tVar.E(tVarP, 0, deltaCounter, this);
        int size2 = (dVarG.size() + size) - deltaCounter.getCount();
        if (size != size2) {
            n(size2);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(K key) {
        this.operationResult = null;
        t tVarG = this.node.G(key != null ? key.hashCode() : 0, key, 0, this);
        if (tVarG == null) {
            tVarG = t.INSTANCE.a();
            C3862t.e(tVarG, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.node = tVarG;
        return this.operationResult;
    }

    @Override // java.util.Map
    public final boolean remove(Object key, Object value) {
        int size = size();
        t tVarH = this.node.H(key != null ? key.hashCode() : 0, key, value, 0, this);
        if (tVarH == null) {
            tVarH = t.INSTANCE.a();
            C3862t.e(tVarH, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.node = tVarH;
        return size != size();
    }
}
