package kotlin;

import java.util.List;
import kotlin.Metadata;
import s.C4379A;

/* compiled from: Composition.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0005\u001a\u00020\u00042\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\b\u001a\u00020\u00072\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0011\u001a\u00020\r*\u00020\u00102\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014\" \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"LO/f;", "applier", "LO/q;", "parent", "LO/p;", "a", "(LO/f;LO/q;)LO/p;", "LO/T0;", "b", "(LO/f;LO/q;)LO/T0;", "T", "", "", "Loa/F;", "f", "(Ljava/util/List;II)V", "Ls/A;", "g", "(Ls/A;II)V", "", "Ljava/lang/Object;", "PendingApplyNoModifications", "LO/B;", "LO/s;", "LO/B;", "getCompositionImplServiceKey", "()LO/B;", "CompositionImplServiceKey", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1570t {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f13025a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final InterfaceC1490B<C1568s> f13026b = new a();

    /* compiled from: Composition.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"O/t$a", "LO/B;", "LO/s;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O.t$a */
    public static final class a implements InterfaceC1490B<C1568s> {
        a() {
        }
    }

    public static final InterfaceC1562p a(InterfaceC1542f<?> interfaceC1542f, AbstractC1564q abstractC1564q) {
        return new C1568s(abstractC1564q, interfaceC1542f, null, 4, null);
    }

    public static final T0 b(InterfaceC1542f<?> interfaceC1542f, AbstractC1564q abstractC1564q) {
        return new C1568s(abstractC1564q, interfaceC1542f, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> void f(List<T> list, int i10, int i11) {
        T t10 = list.get(i10);
        list.set(i10, list.get(i11));
        list.set(i11, t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(C4379A c4379a, int i10, int i11) {
        int iA = c4379a.a(i10);
        c4379a.o(i10, c4379a.a(i11));
        c4379a.o(i11, iA);
    }
}
