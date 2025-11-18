package A;

import A.C0794b;
import b0.c;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: Column.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\" \u0010\u0016\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"LA/b$l;", "verticalArrangement", "Lb0/c$b;", "horizontalAlignment", "Ly0/I;", "a", "(LA/b$l;Lb0/c$b;LO/l;I)Ly0/I;", "", "isPrioritizing", "", "mainAxisMin", "crossAxisMin", "mainAxisMax", "crossAxisMax", "LU0/b;", "b", "(ZIIII)J", "Ly0/I;", "getDefaultColumnMeasurePolicy", "()Ly0/I;", "getDefaultColumnMeasurePolicy$annotations", "()V", "DefaultColumnMeasurePolicy", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: A.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0799g {

    /* renamed from: a, reason: collision with root package name */
    private static final y0.I f121a = new ColumnMeasurePolicy(C0794b.f54a.f(), b0.c.INSTANCE.k());

    public static final y0.I a(C0794b.l lVar, c.b bVar, InterfaceC1554l interfaceC1554l, int i10) {
        y0.I i11;
        if (C1560o.J()) {
            C1560o.S(1089876336, i10, -1, "androidx.compose.foundation.layout.columnMeasurePolicy (Column.kt:106)");
        }
        if (C3862t.b(lVar, C0794b.f54a.f()) && C3862t.b(bVar, b0.c.INSTANCE.k())) {
            interfaceC1554l.S(345962472);
            interfaceC1554l.I();
            i11 = f121a;
        } else {
            interfaceC1554l.S(346016319);
            boolean z10 = ((((i10 & 14) ^ 6) > 4 && interfaceC1554l.R(lVar)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && interfaceC1554l.R(bVar)) || (i10 & 48) == 32);
            Object objF = interfaceC1554l.f();
            if (z10 || objF == InterfaceC1554l.INSTANCE.a()) {
                objF = new ColumnMeasurePolicy(lVar, bVar);
                interfaceC1554l.J(objF);
            }
            i11 = (ColumnMeasurePolicy) objF;
            interfaceC1554l.I();
        }
        if (C1560o.J()) {
            C1560o.R();
        }
        return i11;
    }

    public static final long b(boolean z10, int i10, int i11, int i12, int i13) {
        return !z10 ? U0.c.a(i11, i13, i10, i12) : U0.b.INSTANCE.a(i11, i13, i10, i12);
    }
}
