package W;

import T.t;
import kotlin.AbstractC1572u;
import kotlin.C1580y;
import kotlin.D1;
import kotlin.InterfaceC1583z0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: PersistentCompositionLocalMap.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00162\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u0005:\u0002\u000e\u0017B3\u0012\"\u0010\u0007\u001a\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\u00020\u00052\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"LW/e;", "LT/d;", "LO/u;", "", "LO/D1;", "LO/z0;", "LT/t;", "node", "", "size", "<init>", "(LT/t;I)V", "T", "key", "a", "(LO/u;)Ljava/lang/Object;", "value", "v", "(LO/u;LO/D1;)LO/z0;", "LW/e$a;", "x", "()LW/e$a;", "H", "b", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e extends T.d<AbstractC1572u<Object>, D1<Object>> implements InterfaceC1583z0 {

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: I, reason: collision with root package name */
    private static final e f18273I;

    /* compiled from: PersistentCompositionLocalMap.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00040\u00012\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"LW/e$a;", "LT/f;", "LO/u;", "", "LO/D1;", "LO/z0$a;", "LW/e;", "map", "<init>", "(LW/e;)V", "p", "()LW/e;", "H", "LW/e;", "getMap$runtime_release", "setMap$runtime_release", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends T.f<AbstractC1572u<Object>, D1<Object>> implements InterfaceC1583z0.a {

        /* renamed from: H, reason: collision with root package name and from kotlin metadata */
        private e map;

        public a(e eVar) {
            super(eVar);
            this.map = eVar;
        }

        @Override // T.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof AbstractC1572u) {
                return q((AbstractC1572u) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof D1) {
                return s((D1) obj);
            }
            return false;
        }

        @Override // T.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (obj instanceof AbstractC1572u) {
                return u((AbstractC1572u) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof AbstractC1572u) ? obj2 : w((AbstractC1572u) obj, (D1) obj2);
        }

        @Override // T.f
        /* renamed from: p, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public e g() {
            e eVar;
            if (i() == this.map.p()) {
                eVar = this.map;
            } else {
                m(new V.e());
                eVar = new e(i(), size());
            }
            this.map = eVar;
            return eVar;
        }

        public /* bridge */ boolean q(AbstractC1572u<Object> abstractC1572u) {
            return super.containsKey(abstractC1572u);
        }

        @Override // T.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (obj instanceof AbstractC1572u) {
                return x((AbstractC1572u) obj);
            }
            return null;
        }

        public /* bridge */ boolean s(D1<Object> d12) {
            return super.containsValue(d12);
        }

        public /* bridge */ D1<Object> u(AbstractC1572u<Object> abstractC1572u) {
            return (D1) super.get(abstractC1572u);
        }

        public /* bridge */ D1<Object> w(AbstractC1572u<Object> abstractC1572u, D1<Object> d12) {
            return (D1) super.getOrDefault(abstractC1572u, d12);
        }

        public /* bridge */ D1<Object> x(AbstractC1572u<Object> abstractC1572u) {
            return (D1) super.remove(abstractC1572u);
        }
    }

    /* compiled from: PersistentCompositionLocalMap.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"LW/e$b;", "", "<init>", "()V", "LW/e;", "Empty", "LW/e;", "a", "()LW/e;", "getEmpty$annotations", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: W.e$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final e a() {
            return e.f18273I;
        }

        private Companion() {
        }
    }

    static {
        t tVarA = t.INSTANCE.a();
        C3862t.e(tVarA, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.ValueHolder<kotlin.Any?>>");
        f18273I = new e(tVarA, 0);
    }

    public e(t<AbstractC1572u<Object>, D1<Object>> tVar, int i10) {
        super(tVar, i10);
    }

    public /* bridge */ D1<Object> A(AbstractC1572u<Object> abstractC1572u) {
        return (D1) super.get(abstractC1572u);
    }

    public /* bridge */ D1<Object> B(AbstractC1572u<Object> abstractC1572u, D1<Object> d12) {
        return (D1) super.getOrDefault(abstractC1572u, d12);
    }

    @Override // kotlin.InterfaceC1578x
    public <T> T a(AbstractC1572u<T> key) {
        return (T) C1580y.b(this, key);
    }

    @Override // T.d, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof AbstractC1572u) {
            return y((AbstractC1572u) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractC3823d, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof D1) {
            return z((D1) obj);
        }
        return false;
    }

    @Override // T.d, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof AbstractC1572u) {
            return A((AbstractC1572u) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof AbstractC1572u) ? obj2 : B((AbstractC1572u) obj, (D1) obj2);
    }

    @Override // kotlin.InterfaceC1583z0
    public InterfaceC1583z0 v(AbstractC1572u<Object> key, D1<Object> value) {
        t.b<AbstractC1572u<Object>, D1<Object>> bVarP = p().P(key.hashCode(), key, value, 0);
        return bVarP == null ? this : new e(bVarP.a(), size() + bVarP.getSizeDelta());
    }

    @Override // kotlin.InterfaceC1583z0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public a t() {
        return new a(this);
    }

    public /* bridge */ boolean y(AbstractC1572u<Object> abstractC1572u) {
        return super.containsKey(abstractC1572u);
    }

    public /* bridge */ boolean z(D1<Object> d12) {
        return super.containsValue(d12);
    }
}
