package s;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: IntList.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00020\u0000\"\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006¨\u0006\b"}, d2 = {"", "", "elements", "Ls/m;", "a", "([I)Ls/m;", "Ls/m;", "EmptyIntList", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: s.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4404n {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC4403m f48722a = new C4379A(0);

    public static final AbstractC4403m a(int... elements) {
        C3862t.g(elements, "elements");
        C4379A c4379a = new C4379A(elements.length);
        c4379a.l(elements);
        return c4379a;
    }
}
