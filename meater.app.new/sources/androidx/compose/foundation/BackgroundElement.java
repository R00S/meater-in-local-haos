package androidx.compose.foundation;

import A0.V;
import androidx.compose.ui.platform.C2040s0;
import i0.AbstractC3582j0;
import i0.C3602t0;
import i0.c1;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: Background.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BA\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/foundation/BackgroundElement;", "LA0/V;", "Landroidx/compose/foundation/c;", "Li0/t0;", "color", "Li0/j0;", "brush", "", "alpha", "Li0/c1;", "shape", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/s0;", "Loa/F;", "inspectorInfo", "<init>", "(JLi0/j0;FLi0/c1;LBa/l;Lkotlin/jvm/internal/k;)V", "p", "()Landroidx/compose/foundation/c;", "node", "s", "(Landroidx/compose/foundation/c;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "J", "c", "Li0/j0;", "d", "F", "e", "Li0/c1;", "f", "LBa/l;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BackgroundElement extends V<c> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long color;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC3582j0 brush;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float alpha;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final c1 shape;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<C2040s0, C4153F> inspectorInfo;

    public /* synthetic */ BackgroundElement(long j10, AbstractC3582j0 abstractC3582j0, float f10, c1 c1Var, Ba.l lVar, C3854k c3854k) {
        this(j10, abstractC3582j0, f10, c1Var, lVar);
    }

    public boolean equals(Object other) {
        BackgroundElement backgroundElement = other instanceof BackgroundElement ? (BackgroundElement) other : null;
        return backgroundElement != null && C3602t0.m(this.color, backgroundElement.color) && C3862t.b(this.brush, backgroundElement.brush) && this.alpha == backgroundElement.alpha && C3862t.b(this.shape, backgroundElement.shape);
    }

    public int hashCode() {
        int iS = C3602t0.s(this.color) * 31;
        AbstractC3582j0 abstractC3582j0 = this.brush;
        return ((((iS + (abstractC3582j0 != null ? abstractC3582j0.hashCode() : 0)) * 31) + Float.hashCode(this.alpha)) * 31) + this.shape.hashCode();
    }

    @Override // A0.V
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public c m() {
        return new c(this.color, this.brush, this.alpha, this.shape, null);
    }

    @Override // A0.V
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void n(c node) {
        node.o2(this.color);
        node.n2(this.brush);
        node.c(this.alpha);
        node.n0(this.shape);
    }

    public /* synthetic */ BackgroundElement(long j10, AbstractC3582j0 abstractC3582j0, float f10, c1 c1Var, Ba.l lVar, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? C3602t0.INSTANCE.e() : j10, (i10 & 2) != 0 ? null : abstractC3582j0, f10, c1Var, lVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private BackgroundElement(long j10, AbstractC3582j0 abstractC3582j0, float f10, c1 c1Var, Ba.l<? super C2040s0, C4153F> lVar) {
        this.color = j10;
        this.brush = abstractC3582j0;
        this.alpha = f10;
        this.shape = c1Var;
        this.inspectorInfo = lVar;
    }
}
