package kotlin;

import kotlin.Metadata;

/* compiled from: Composables.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\"\u0011\u0010\t\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0011\u0010\r\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Loa/F;", "c", "()V", "LO/q;", "d", "(LO/l;I)LO/q;", "LO/I0;", "b", "(LO/l;I)LO/I0;", "currentRecomposeScope", "", "a", "(LO/l;I)I", "currentCompositeKeyHash", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: O.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1550j {
    public static final int a(InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(524444915, i10, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:228)");
        }
        int iK = interfaceC1554l.K();
        if (C1560o.J()) {
            C1560o.R();
        }
        return iK;
    }

    public static final InterfaceC1505I0 b(InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(394957799, i10, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:196)");
        }
        InterfaceC1505I0 interfaceC1505I0B = interfaceC1554l.b();
        if (interfaceC1505I0B == null) {
            throw new IllegalStateException("no recompose scope found");
        }
        interfaceC1554l.B(interfaceC1505I0B);
        if (C1560o.J()) {
            C1560o.R();
        }
        return interfaceC1505I0B;
    }

    public static final void c() {
        throw new IllegalStateException("Invalid applier");
    }

    public static final AbstractC1564q d(InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(-1165786124, i10, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:484)");
        }
        AbstractC1564q abstractC1564qL = interfaceC1554l.L();
        if (C1560o.J()) {
            C1560o.R();
        }
        return abstractC1564qL;
    }
}
