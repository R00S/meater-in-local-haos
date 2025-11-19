package W;

import kotlin.C1507J0;
import kotlin.C1560o;
import kotlin.InterfaceC1505I0;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: ComposableLambda.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u001d\u0010\u000b\u001a\u00020\n*\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016¨\u0006\u0018"}, d2 = {"", "bits", "slot", "a", "(II)I", "f", "(I)I", "c", "LO/I0;", "other", "", "e", "(LO/I0;LO/I0;)Z", "key", "tracked", "", "block", "LW/a;", "b", "(IZLjava/lang/Object;)LW/a;", "d", "(IZLjava/lang/Object;LO/l;I)LW/a;", "Ljava/lang/Object;", "lambdaKey", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f18270a = new Object();

    public static final int a(int i10, int i11) {
        return i10 << (((i11 % 10) * 3) + 1);
    }

    public static final a b(int i10, boolean z10, Object obj) {
        return new b(i10, z10, obj);
    }

    public static final int c(int i10) {
        return a(2, i10);
    }

    public static final a d(int i10, boolean z10, Object obj, InterfaceC1554l interfaceC1554l, int i11) {
        if (C1560o.J()) {
            C1560o.S(-1573003438, i11, -1, "androidx.compose.runtime.internal.rememberComposableLambda (ComposableLambda.kt:628)");
        }
        Object objF = interfaceC1554l.f();
        if (objF == InterfaceC1554l.INSTANCE.a()) {
            objF = new b(i10, z10, obj);
            interfaceC1554l.J(objF);
        }
        b bVar = (b) objF;
        bVar.j(obj);
        if (C1560o.J()) {
            C1560o.R();
        }
        return bVar;
    }

    public static final boolean e(InterfaceC1505I0 interfaceC1505I0, InterfaceC1505I0 interfaceC1505I02) {
        if (interfaceC1505I0 != null) {
            if ((interfaceC1505I0 instanceof C1507J0) && (interfaceC1505I02 instanceof C1507J0)) {
                C1507J0 c1507j0 = (C1507J0) interfaceC1505I0;
                if (!c1507j0.r() || C3862t.b(interfaceC1505I0, interfaceC1505I02) || C3862t.b(c1507j0.getAnchor(), ((C1507J0) interfaceC1505I02).getAnchor())) {
                }
            }
            return false;
        }
        return true;
    }

    public static final int f(int i10) {
        return a(1, i10);
    }
}
