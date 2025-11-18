package androidx.compose.foundation.layout;

import A0.V;
import androidx.compose.ui.platform.C2040s0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import oa.C4153F;

/* compiled from: Offset.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0005\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/foundation/layout/OffsetElement;", "LA0/V;", "Landroidx/compose/foundation/layout/m;", "LU0/h;", "x", "y", "", "rtlAware", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/s0;", "Loa/F;", "inspectorInfo", "<init>", "(FFZLBa/l;Lkotlin/jvm/internal/k;)V", "p", "()Landroidx/compose/foundation/layout/m;", "node", "s", "(Landroidx/compose/foundation/layout/m;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "F", "getX-D9Ej5fM", "()F", "c", "getY-D9Ej5fM", "d", "Z", "getRtlAware", "()Z", "e", "LBa/l;", "getInspectorInfo", "()LBa/l;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.OffsetElement, reason: from toString */
/* loaded from: classes.dex */
final class OffsetModifierElement extends V<m> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float x;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final float y;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean rtlAware;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<C2040s0, C4153F> inspectorInfo;

    public /* synthetic */ OffsetModifierElement(float f10, float f11, boolean z10, Ba.l lVar, C3854k c3854k) {
        this(f10, f11, z10, lVar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        OffsetModifierElement offsetModifierElement = other instanceof OffsetModifierElement ? (OffsetModifierElement) other : null;
        if (offsetModifierElement == null) {
            return false;
        }
        return U0.h.w(this.x, offsetModifierElement.x) && U0.h.w(this.y, offsetModifierElement.y) && this.rtlAware == offsetModifierElement.rtlAware;
    }

    public int hashCode() {
        return (((U0.h.x(this.x) * 31) + U0.h.x(this.y)) * 31) + Boolean.hashCode(this.rtlAware);
    }

    @Override // A0.V
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public m m() {
        return new m(this.x, this.y, this.rtlAware, null);
    }

    @Override // A0.V
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void n(m node) {
        node.n2(this.x);
        node.o2(this.y);
        node.m2(this.rtlAware);
    }

    public String toString() {
        return "OffsetModifierElement(x=" + ((Object) U0.h.y(this.x)) + ", y=" + ((Object) U0.h.y(this.y)) + ", rtlAware=" + this.rtlAware + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    private OffsetModifierElement(float f10, float f11, boolean z10, Ba.l<? super C2040s0, C4153F> lVar) {
        this.x = f10;
        this.y = f11;
        this.rtlAware = z10;
        this.inspectorInfo = lVar;
    }
}
