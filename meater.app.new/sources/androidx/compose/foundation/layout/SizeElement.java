package androidx.compose.foundation.layout;

import A0.V;
import androidx.compose.ui.platform.C2040s0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import oa.C4153F;

/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b \u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/compose/foundation/layout/SizeElement;", "LA0/V;", "Landroidx/compose/foundation/layout/s;", "LU0/h;", "minWidth", "minHeight", "maxWidth", "maxHeight", "", "enforceIncoming", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/s0;", "Loa/F;", "inspectorInfo", "<init>", "(FFFFZLBa/l;Lkotlin/jvm/internal/k;)V", "p", "()Landroidx/compose/foundation/layout/s;", "node", "s", "(Landroidx/compose/foundation/layout/s;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "b", "F", "c", "d", "e", "f", "Z", "g", "LBa/l;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SizeElement extends V<s> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float minWidth;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float minHeight;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float maxWidth;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float maxHeight;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean enforceIncoming;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<C2040s0, C4153F> inspectorInfo;

    public /* synthetic */ SizeElement(float f10, float f11, float f12, float f13, boolean z10, Ba.l lVar, C3854k c3854k) {
        this(f10, f11, f12, f13, z10, lVar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) other;
        return U0.h.w(this.minWidth, sizeElement.minWidth) && U0.h.w(this.minHeight, sizeElement.minHeight) && U0.h.w(this.maxWidth, sizeElement.maxWidth) && U0.h.w(this.maxHeight, sizeElement.maxHeight) && this.enforceIncoming == sizeElement.enforceIncoming;
    }

    public int hashCode() {
        return (((((((U0.h.x(this.minWidth) * 31) + U0.h.x(this.minHeight)) * 31) + U0.h.x(this.maxWidth)) * 31) + U0.h.x(this.maxHeight)) * 31) + Boolean.hashCode(this.enforceIncoming);
    }

    @Override // A0.V
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public s m() {
        return new s(this.minWidth, this.minHeight, this.maxWidth, this.maxHeight, this.enforceIncoming, null);
    }

    @Override // A0.V
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void n(s node) {
        node.o2(this.minWidth);
        node.n2(this.minHeight);
        node.m2(this.maxWidth);
        node.l2(this.maxHeight);
        node.k2(this.enforceIncoming);
    }

    public /* synthetic */ SizeElement(float f10, float f11, float f12, float f13, boolean z10, Ba.l lVar, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? U0.h.INSTANCE.c() : f10, (i10 & 2) != 0 ? U0.h.INSTANCE.c() : f11, (i10 & 4) != 0 ? U0.h.INSTANCE.c() : f12, (i10 & 8) != 0 ? U0.h.INSTANCE.c() : f13, z10, lVar, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SizeElement(float f10, float f11, float f12, float f13, boolean z10, Ba.l<? super C2040s0, C4153F> lVar) {
        this.minWidth = f10;
        this.minHeight = f11;
        this.maxWidth = f12;
        this.maxHeight = f13;
        this.enforceIncoming = z10;
        this.inspectorInfo = lVar;
    }
}
