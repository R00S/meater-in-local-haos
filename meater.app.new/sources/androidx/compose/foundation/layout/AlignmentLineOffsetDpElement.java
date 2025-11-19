package androidx.compose.foundation.layout;

import A0.V;
import androidx.compose.ui.platform.C2040s0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import y0.AbstractC5096a;

/* compiled from: AlignmentLine.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u0007\u001a\u00020\u00058\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineOffsetDpElement;", "LA0/V;", "Landroidx/compose/foundation/layout/b;", "Ly0/a;", "alignmentLine", "LU0/h;", "before", "after", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/s0;", "Loa/F;", "inspectorInfo", "<init>", "(Ly0/a;FFLBa/l;Lkotlin/jvm/internal/k;)V", "p", "()Landroidx/compose/foundation/layout/b;", "node", "s", "(Landroidx/compose/foundation/layout/b;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "Ly0/a;", "getAlignmentLine", "()Ly0/a;", "c", "F", "getBefore-D9Ej5fM", "()F", "d", "getAfter-D9Ej5fM", "e", "LBa/l;", "getInspectorInfo", "()LBa/l;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AlignmentLineOffsetDpElement extends V<b> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5096a alignmentLine;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float before;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float after;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<C2040s0, C4153F> inspectorInfo;

    public /* synthetic */ AlignmentLineOffsetDpElement(AbstractC5096a abstractC5096a, float f10, float f11, Ba.l lVar, C3854k c3854k) {
        this(abstractC5096a, f10, f11, lVar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        AlignmentLineOffsetDpElement alignmentLineOffsetDpElement = other instanceof AlignmentLineOffsetDpElement ? (AlignmentLineOffsetDpElement) other : null;
        if (alignmentLineOffsetDpElement == null) {
            return false;
        }
        return C3862t.b(this.alignmentLine, alignmentLineOffsetDpElement.alignmentLine) && U0.h.w(this.before, alignmentLineOffsetDpElement.before) && U0.h.w(this.after, alignmentLineOffsetDpElement.after);
    }

    public int hashCode() {
        return (((this.alignmentLine.hashCode() * 31) + U0.h.x(this.before)) * 31) + U0.h.x(this.after);
    }

    @Override // A0.V
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public b m() {
        return new b(this.alignmentLine, this.before, this.after, null);
    }

    @Override // A0.V
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void n(b node) {
        node.k2(this.alignmentLine);
        node.l2(this.before);
        node.j2(this.after);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AlignmentLineOffsetDpElement(AbstractC5096a abstractC5096a, float f10, float f11, Ba.l<? super C2040s0, C4153F> lVar) {
        this.alignmentLine = abstractC5096a;
        this.before = f10;
        this.after = f11;
        this.inspectorInfo = lVar;
        if ((f10 < 0.0f && !U0.h.w(f10, U0.h.INSTANCE.c())) || (f11 < 0.0f && !U0.h.w(f11, U0.h.INSTANCE.c()))) {
            throw new IllegalArgumentException("Padding from alignment line must be a non-negative number");
        }
    }
}
