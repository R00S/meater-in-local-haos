package ac;

import cc.C2361F;
import kotlin.C2298n;
import kotlin.Metadata;

/* compiled from: StateFlow.kt */
@Metadata(d1 = {"\u00002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a=\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010\"\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0014"}, d2 = {"T", "value", "Lac/t;", "a", "(Ljava/lang/Object;)Lac/t;", "Lac/H;", "Lta/g;", "context", "", "capacity", "LZb/d;", "onBufferOverflow", "Lac/e;", "d", "(Lac/H;Lta/g;ILZb/d;)Lac/e;", "Lcc/F;", "Lcc/F;", "NONE", "b", "PENDING", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    private static final C2361F f20328a = new C2361F("NONE");

    /* renamed from: b, reason: collision with root package name */
    private static final C2361F f20329b = new C2361F("PENDING");

    public static final <T> t<T> a(T t10) {
        if (t10 == null) {
            t10 = (T) C2298n.f30783a;
        }
        return new I(t10);
    }

    public static final <T> InterfaceC1970e<T> d(H<? extends T> h10, ta.g gVar, int i10, Zb.d dVar) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || dVar != Zb.d.f19651C) ? z.e(h10, gVar, i10, dVar) : h10;
    }
}
