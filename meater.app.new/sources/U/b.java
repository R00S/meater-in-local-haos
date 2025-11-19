package U;

import R.f;
import T.d;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractC3828i;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: PersistentOrderedSet.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 #*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001$B/\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006%"}, d2 = {"LU/b;", "E", "Lkotlin/collections/i;", "LR/f;", "", "firstElement", "lastElement", "LT/d;", "LU/a;", "hashMap", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;LT/d;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "add", "(Ljava/lang/Object;)LR/f;", "remove", "", "iterator", "()Ljava/util/Iterator;", "C", "Ljava/lang/Object;", "getFirstElement$runtime_release", "()Ljava/lang/Object;", "D", "getLastElement$runtime_release", "LT/d;", "getHashMap$runtime_release", "()LT/d;", "", "getSize", "()I", "size", "F", "a", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b<E> extends AbstractC3828i<E> implements f<E> {

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: G, reason: collision with root package name */
    public static final int f16717G = 8;

    /* renamed from: H, reason: collision with root package name */
    private static final b f16718H;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final Object firstElement;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final Object lastElement;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final d<E, a> hashMap;

    /* compiled from: PersistentOrderedSet.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0001\u0010\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LU/b$a;", "", "<init>", "()V", "E", "LR/f;", "a", "()LR/f;", "LU/b;", "", "EMPTY", "LU/b;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: U.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final <E> f<E> a() {
            return b.f16718H;
        }

        private Companion() {
        }
    }

    static {
        V.c cVar = V.c.f17989a;
        f16718H = new b(cVar, cVar, d.INSTANCE.a());
    }

    public b(Object obj, Object obj2, d<E, a> dVar) {
        this.firstElement = obj;
        this.lastElement = obj2;
        this.hashMap = dVar;
    }

    @Override // java.util.Collection, java.util.Set, R.f
    public f<E> add(E element) {
        if (this.hashMap.containsKey(element)) {
            return this;
        }
        if (isEmpty()) {
            return new b(element, element, this.hashMap.s(element, new a()));
        }
        Object obj = this.lastElement;
        Object obj2 = this.hashMap.get(obj);
        C3862t.d(obj2);
        return new b(this.firstElement, element, this.hashMap.s(obj, ((a) obj2).e(element)).s(element, new a(obj)));
    }

    @Override // kotlin.collections.AbstractC3820a, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return this.hashMap.containsKey(element);
    }

    @Override // kotlin.collections.AbstractC3820a
    /* renamed from: getSize */
    public int get_size() {
        return this.hashMap.size();
    }

    @Override // kotlin.collections.AbstractC3820a, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new c(this.firstElement, this.hashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, R.f
    public f<E> remove(E element) {
        a aVar = this.hashMap.get(element);
        if (aVar == null) {
            return this;
        }
        d dVarU = this.hashMap.u(element);
        if (aVar.b()) {
            V v10 = dVarU.get(aVar.getPrevious());
            C3862t.d(v10);
            dVarU = dVarU.s(aVar.getPrevious(), ((a) v10).e(aVar.getNext()));
        }
        if (aVar.a()) {
            V v11 = dVarU.get(aVar.getNext());
            C3862t.d(v11);
            dVarU = dVarU.s(aVar.getNext(), ((a) v11).f(aVar.getPrevious()));
        }
        return new b(!aVar.b() ? aVar.getNext() : this.firstElement, !aVar.a() ? aVar.getPrevious() : this.lastElement, dVarU);
    }
}
