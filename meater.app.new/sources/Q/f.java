package Q;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import s.C4388J;
import s.C4389K;
import s.U;

/* compiled from: ScopeMap.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b\f\u0010\nJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0005J\u001d\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00168\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"LQ/f;", "", "Key", "Scope", "<init>", "()V", "key", "scope", "Loa/F;", "a", "(Ljava/lang/Object;Ljava/lang/Object;)V", "value", "h", "element", "", "c", "(Ljava/lang/Object;)Z", "b", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "g", "(Ljava/lang/Object;)V", "Ls/J;", "Ls/J;", "d", "()Ls/J;", "map", "", "e", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f<Key, Scope> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C4388J<Object, Object> map = U.d();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r7v1, types: [s.K] */
    public final void a(Key key, Scope scope) {
        C4388J<Object, Object> c4388j = this.map;
        int iK = c4388j.k(key);
        boolean z10 = iK < 0;
        Scope scope2 = z10 ? null : c4388j.values[iK];
        if (scope2 != null) {
            if (scope2 instanceof C4389K) {
                C3862t.e(scope2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.add$lambda$0>");
                ((C4389K) scope2).h(scope);
            } else if (scope2 != scope) {
                ?? c4389k = new C4389K(0, 1, null);
                C3862t.e(scope2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.add$lambda$0");
                c4389k.h(scope2);
                c4389k.h(scope);
                scope = c4389k;
            }
            scope = scope2;
        }
        if (!z10) {
            c4388j.values[iK] = scope;
            return;
        }
        int i10 = ~iK;
        c4388j.keys[i10] = key;
        c4388j.values[i10] = scope;
    }

    public final void b() {
        this.map.h();
    }

    public final boolean c(Key element) {
        return this.map.a(element);
    }

    public final C4388J<Object, Object> d() {
        return this.map;
    }

    public final int e() {
        return this.map.get_size();
    }

    public final boolean f(Key key, Scope scope) {
        Object objB = this.map.b(key);
        if (objB == null) {
            return false;
        }
        if (!(objB instanceof C4389K)) {
            if (!C3862t.b(objB, scope)) {
                return false;
            }
            this.map.o(key);
            return true;
        }
        C4389K c4389k = (C4389K) objB;
        boolean zX = c4389k.x(scope);
        if (zX && c4389k.d()) {
            this.map.o(key);
        }
        return zX;
    }

    public final void g(Scope scope) {
        boolean zD;
        C4388J<Object, Object> c4388j = this.map;
        long[] jArr = c4388j.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = c4388j.keys[i13];
                        Object obj2 = c4388j.values[i13];
                        if (obj2 instanceof C4389K) {
                            C3862t.e(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScope$lambda$3>");
                            C4389K c4389k = (C4389K) obj2;
                            c4389k.x(scope);
                            zD = c4389k.d();
                        } else {
                            zD = obj2 == scope;
                        }
                        if (zD) {
                            c4388j.p(i13);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void h(Key key, Scope value) {
        this.map.r(key, value);
    }
}
