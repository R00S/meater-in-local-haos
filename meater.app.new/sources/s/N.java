package s;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: ObjectIntMap.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\b¨\u0006\n"}, d2 = {"K", "Ls/M;", "a", "()Ls/M;", "Ls/G;", "b", "()Ls/G;", "", "Ls/G;", "EmptyObjectIntMap", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    private static final C4385G<Object> f48646a = new C4385G<>(0);

    public static final <K> M<K> a() {
        C4385G<Object> c4385g = f48646a;
        C3862t.e(c4385g, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        return c4385g;
    }

    public static final <K> C4385G<K> b() {
        return new C4385G<>(0, 1, null);
    }
}
