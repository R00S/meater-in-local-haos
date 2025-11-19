package s;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: IntObjectMap.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aI\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0011¨\u0006\u0013"}, d2 = {"V", "Ls/o;", "a", "()Ls/o;", "Ls/B;", "b", "()Ls/B;", "", "key1", "value1", "key2", "value2", "key3", "value3", "c", "(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Ls/B;", "", "Ls/B;", "EmptyIntObjectMap", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: s.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4406p {

    /* renamed from: a, reason: collision with root package name */
    private static final C4380B f48728a = new C4380B(0);

    public static final <V> AbstractC4405o<V> a() {
        C4380B c4380b = f48728a;
        C3862t.e(c4380b, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        return c4380b;
    }

    public static final <V> C4380B<V> b() {
        return new C4380B<>(0, 1, null);
    }

    public static final <V> C4380B<V> c(int i10, V v10, int i11, V v11, int i12, V v12) {
        C4380B<V> c4380b = new C4380B<>(0, 1, null);
        c4380b.t(i10, v10);
        c4380b.t(i11, v11);
        c4380b.t(i12, v12);
        return c4380b;
    }
}
