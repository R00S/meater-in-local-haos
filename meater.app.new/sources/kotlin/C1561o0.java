package kotlin;

import Aa.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.W;
import s.C4388J;

/* compiled from: Composer.kt */
@b
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0083@\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\u0088\u0001\u0005\u0092\u0001\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0004¨\u0006\u001d"}, d2 = {"LO/o0;", "K", "", "V", "Ls/J;", "map", "b", "(Ls/J;)Ls/J;", "key", "value", "Loa/F;", "f", "(Ls/J;Ljava/lang/Object;Ljava/lang/Object;)V", "e", "(Ls/J;Ljava/lang/Object;)Ljava/lang/Object;", "", "g", "(Ls/J;)Ljava/lang/String;", "", "d", "(Ls/J;)I", "other", "", "c", "(Ls/J;Ljava/lang/Object;)Z", "a", "Ls/J;", "getMap", "()Ls/J;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1561o0<K, V> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C4388J<K, Object> map;

    private /* synthetic */ C1561o0(C4388J c4388j) {
        this.map = c4388j;
    }

    public static final /* synthetic */ C1561o0 a(C4388J c4388j) {
        return new C1561o0(c4388j);
    }

    public static boolean c(C4388J<K, Object> c4388j, Object obj) {
        return (obj instanceof C1561o0) && C3862t.b(c4388j, ((C1561o0) obj).getMap());
    }

    public static int d(C4388J<K, Object> c4388j) {
        return c4388j.hashCode();
    }

    public static final V e(C4388J<K, Object> c4388j, K k10) {
        V v10 = (V) c4388j.b(k10);
        if (v10 == null) {
            return null;
        }
        if (W.n(v10)) {
            List listC = W.c(v10);
            Object objRemove = listC.remove(0);
            if (listC.isEmpty()) {
                c4388j.o(k10);
            }
            v10 = (V) objRemove;
        } else {
            c4388j.o(k10);
        }
        C3862t.e(v10, "null cannot be cast to non-null type V of androidx.compose.runtime.MutableScatterMultiMap.pop_impl$lambda$1");
        return v10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(C4388J<K, Object> c4388j, K k10, V v10) {
        int iK = c4388j.k(k10);
        boolean z10 = iK < 0;
        Object obj = z10 ? null : c4388j.values[iK];
        if (obj != null) {
            if (W.n(obj)) {
                C3862t.e(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<V of androidx.compose.runtime.MutableScatterMultiMap.put_impl$lambda$0>");
                List listC = W.c(obj);
                listC.add(v10);
                v10 = listC;
            } else {
                v10 = (V) r.s(obj, v10);
            }
        }
        if (!z10) {
            c4388j.values[iK] = v10;
            return;
        }
        int i10 = ~iK;
        c4388j.keys[i10] = k10;
        c4388j.values[i10] = v10;
    }

    public static String g(C4388J<K, Object> c4388j) {
        return "MutableScatterMultiMap(map=" + c4388j + ')';
    }

    public boolean equals(Object obj) {
        return c(this.map, obj);
    }

    /* renamed from: h, reason: from getter */
    public final /* synthetic */ C4388J getMap() {
        return this.map;
    }

    public int hashCode() {
        return d(this.map);
    }

    public String toString() {
        return g(this.map);
    }

    public static <K, V> C4388J<K, Object> b(C4388J<K, Object> c4388j) {
        return c4388j;
    }
}
