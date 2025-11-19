package T;

import T.t;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractC3823d;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: PersistentHashMap.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000 +*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001,B#\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u000fH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0012\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u000eR\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00010'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"LT/d;", "K", "V", "Lkotlin/collections/d;", "", "LT/t;", "node", "", "size", "<init>", "(LT/t;I)V", "LR/d;", "", "m", "()LR/d;", "", "d", "()Ljava/util/Set;", "key", "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "s", "(Ljava/lang/Object;Ljava/lang/Object;)LT/d;", "u", "(Ljava/lang/Object;)LT/d;", "C", "LT/t;", "p", "()LT/t;", "D", "I", "h", "()I", "n", "keys", "LR/b;", "q", "()LR/b;", "values", "E", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class d<K, V> extends AbstractC3823d<K, V> implements Map, Ca.a {

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: F, reason: collision with root package name */
    public static final int f15722F = 8;

    /* renamed from: G, reason: collision with root package name */
    private static final d f15723G = new d(t.INSTANCE.a(), 0);

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final t<K, V> node;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* compiled from: PersistentHashMap.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\bR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LT/d$a;", "", "<init>", "()V", "K", "V", "LT/d;", "a", "()LT/d;", "", "EMPTY", "LT/d;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: T.d$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final <K, V> d<K, V> a() {
            d<K, V> dVar = d.f15723G;
            C3862t.e(dVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return dVar;
        }

        private Companion() {
        }
    }

    public d(t<K, V> tVar, int i10) {
        this.node = tVar;
        this.size = i10;
    }

    private final R.d<Map.Entry<K, V>> m() {
        return new n(this);
    }

    @Override // java.util.Map
    public boolean containsKey(K key) {
        return this.node.k(key != null ? key.hashCode() : 0, key, 0);
    }

    @Override // kotlin.collections.AbstractC3823d
    public final Set<Map.Entry<K, V>> d() {
        return m();
    }

    @Override // java.util.Map
    public V get(K key) {
        return this.node.o(key != null ? key.hashCode() : 0, key, 0);
    }

    @Override // kotlin.collections.AbstractC3823d
    /* renamed from: h, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // kotlin.collections.AbstractC3823d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public R.d<K> g() {
        return new p(this);
    }

    public final t<K, V> p() {
        return this.node;
    }

    @Override // kotlin.collections.AbstractC3823d
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public R.b<V> i() {
        return new r(this);
    }

    public d<K, V> s(K key, V value) {
        t.b<K, V> bVarP = this.node.P(key != null ? key.hashCode() : 0, key, value, 0);
        return bVarP == null ? this : new d<>(bVarP.a(), size() + bVarP.getSizeDelta());
    }

    public d<K, V> u(K key) {
        t<K, V> tVarQ = this.node.Q(key != null ? key.hashCode() : 0, key, 0);
        return this.node == tVarQ ? this : tVarQ == null ? INSTANCE.a() : new d<>(tVarQ, size() - 1);
    }
}
