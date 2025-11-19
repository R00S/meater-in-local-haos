package kotlin;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Metadata;

/* compiled from: SnapshotState.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\n\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"T", "value", "LO/l1;", "policy", "LO/p0;", "b", "(Ljava/lang/Object;LO/l1;)LO/p0;", "Landroidx/compose/runtime/snapshots/k;", "a", "()Landroidx/compose/runtime/snapshots/k;", "newValue", "LO/x1;", "d", "(Ljava/lang/Object;LO/l;I)LO/x1;", "runtime_release"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
/* loaded from: classes.dex */
final /* synthetic */ class r1 {
    public static final <T> SnapshotStateList<T> a() {
        return new SnapshotStateList<>();
    }

    public static final <T> InterfaceC1563p0<T> b(T t10, l1<T> l1Var) {
        return C1530b.d(t10, l1Var);
    }

    public static /* synthetic */ InterfaceC1563p0 c(Object obj, l1 l1Var, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            l1Var = m1.o();
        }
        return m1.g(obj, l1Var);
    }

    public static final <T> x1<T> d(T t10, InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(-1058319986, i10, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:309)");
        }
        Object objF = interfaceC1554l.f();
        if (objF == InterfaceC1554l.INSTANCE.a()) {
            objF = c(t10, null, 2, null);
            interfaceC1554l.J(objF);
        }
        InterfaceC1563p0 interfaceC1563p0 = (InterfaceC1563p0) objF;
        interfaceC1563p0.setValue(t10);
        if (C1560o.J()) {
            C1560o.R();
        }
        return interfaceC1563p0;
    }
}
