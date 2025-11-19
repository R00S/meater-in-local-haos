package kotlin;

import i0.C3602t0;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;

/* compiled from: IconButton.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\n\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"LK/z;", "", "<init>", "()V", "LK/y;", "b", "(LO/l;I)LK/y;", "LK/o;", "Li0/t0;", "localContentColor", "a", "(LK/o;J)LK/y;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: K.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1305z {

    /* renamed from: a, reason: collision with root package name */
    public static final C1305z f8631a = new C1305z();

    private C1305z() {
    }

    public final C1304y a(ColorScheme colorScheme, long j10) {
        C1304y defaultIconButtonColorsCached = colorScheme.getDefaultIconButtonColorsCached();
        if (defaultIconButtonColorsCached != null) {
            return defaultIconButtonColorsCached;
        }
        C3602t0.Companion companion = C3602t0.INSTANCE;
        C1304y c1304y = new C1304y(companion.d(), j10, companion.d(), C3602t0.k(j10, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.S(c1304y);
        return c1304y;
    }

    public final C1304y b(InterfaceC1554l interfaceC1554l, int i10) {
        interfaceC1554l.S(-1519621781);
        if (C1560o.J()) {
            C1560o.S(-1519621781, i10, -1, "androidx.compose.material3.IconButtonDefaults.iconButtonColors (IconButton.kt:592)");
        }
        long value = ((C3602t0) interfaceC1554l.o(C1298s.a())).getValue();
        C1304y c1304yA = a(C1252D.f7860a.a(interfaceC1554l, 6), value);
        if (C3602t0.m(c1304yA.getContentColor(), value)) {
            if (C1560o.J()) {
                C1560o.R();
            }
            interfaceC1554l.I();
            return c1304yA;
        }
        C1304y c1304yC = c1304yA.c((5 & 1) != 0 ? c1304yA.containerColor : 0L, (5 & 2) != 0 ? c1304yA.contentColor : value, (5 & 4) != 0 ? c1304yA.disabledContainerColor : 0L, (5 & 8) != 0 ? c1304yA.disabledContentColor : C3602t0.k(value, 0.38f, 0.0f, 0.0f, 0.0f, 14, null));
        if (C1560o.J()) {
            C1560o.R();
        }
        interfaceC1554l.I();
        return c1304yC;
    }
}
