package androidx.compose.foundation.layout;

import A0.B;
import b0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import y0.AbstractC5096a;
import y0.H;
import y0.J;
import y0.K;

/* compiled from: AlignmentLine.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/foundation/layout/b;", "LA0/B;", "Lb0/i$c;", "Ly0/a;", "alignmentLine", "LU0/h;", "before", "after", "<init>", "(Ly0/a;FFLkotlin/jvm/internal/k;)V", "Ly0/K;", "Ly0/H;", "measurable", "LU0/b;", "constraints", "Ly0/J;", "b", "(Ly0/K;Ly0/H;J)Ly0/J;", "O", "Ly0/a;", "getAlignmentLine", "()Ly0/a;", "k2", "(Ly0/a;)V", "P", "F", "getBefore-D9Ej5fM", "()F", "l2", "(F)V", "Q", "getAfter-D9Ej5fM", "j2", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class b extends i.c implements B {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private AbstractC5096a alignmentLine;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private float before;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private float after;

    public /* synthetic */ b(AbstractC5096a abstractC5096a, float f10, float f11, C3854k c3854k) {
        this(abstractC5096a, f10, f11);
    }

    @Override // A0.B
    public J b(K k10, H h10, long j10) {
        return a.c(k10, this.alignmentLine, this.before, this.after, h10, j10);
    }

    public final void j2(float f10) {
        this.after = f10;
    }

    public final void k2(AbstractC5096a abstractC5096a) {
        this.alignmentLine = abstractC5096a;
    }

    public final void l2(float f10) {
        this.before = f10;
    }

    private b(AbstractC5096a abstractC5096a, float f10, float f11) {
        this.alignmentLine = abstractC5096a;
        this.before = f10;
        this.after = f11;
    }
}
