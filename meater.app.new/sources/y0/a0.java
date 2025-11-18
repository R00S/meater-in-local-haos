package y0;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;
import y0.Z;

/* compiled from: Placeable.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\" \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f\"\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0011"}, d2 = {"LA0/P;", "lookaheadCapablePlaceable", "Ly0/Z$a;", "a", "(LA0/P;)Ly0/Z$a;", "LA0/m0;", "owner", "b", "(LA0/m0;)Ly0/Z$a;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "Loa/F;", "LBa/l;", "DefaultLayerBlock", "LU0/b;", "J", "DefaultConstraints", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Ba.l<androidx.compose.ui.graphics.c, C4153F> f53007a = a.f53009B;

    /* renamed from: b, reason: collision with root package name */
    private static final long f53008b = U0.c.b(0, 0, 0, 0, 15, null);

    public static final Z.a a(A0.P p10) {
        return new C5094E(p10);
    }

    public static final Z.a b(A0.m0 m0Var) {
        return new V(m0Var);
    }

    /* compiled from: Placeable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/c;", "Loa/F;", "a", "(Landroidx/compose/ui/graphics/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.l<androidx.compose.ui.graphics.c, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f53009B = new a();

        a() {
            super(1);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(androidx.compose.ui.graphics.c cVar) {
            a(cVar);
            return C4153F.f46609a;
        }

        public final void a(androidx.compose.ui.graphics.c cVar) {
        }
    }
}
