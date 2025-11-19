package androidx.compose.foundation.layout;

import A0.V;
import androidx.compose.ui.platform.C2040s0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import oa.C4153F;

/* compiled from: Padding.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bR(\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R(\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010!R(\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010!R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00065"}, d2 = {"Landroidx/compose/foundation/layout/PaddingElement;", "LA0/V;", "Landroidx/compose/foundation/layout/p;", "LU0/h;", "start", "top", "end", "bottom", "", "rtlAware", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/s0;", "Loa/F;", "inspectorInfo", "<init>", "(FFFFZLBa/l;Lkotlin/jvm/internal/k;)V", "p", "()Landroidx/compose/foundation/layout/p;", "node", "s", "(Landroidx/compose/foundation/layout/p;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "F", "getStart-D9Ej5fM", "()F", "setStart-0680j_4", "(F)V", "c", "getTop-D9Ej5fM", "setTop-0680j_4", "d", "getEnd-D9Ej5fM", "setEnd-0680j_4", "e", "getBottom-D9Ej5fM", "setBottom-0680j_4", "f", "Z", "getRtlAware", "()Z", "setRtlAware", "(Z)V", "g", "LBa/l;", "getInspectorInfo", "()LBa/l;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class PaddingElement extends V<p> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float start;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float top;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float end;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float bottom;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean rtlAware;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Ba.l<C2040s0, C4153F> inspectorInfo;

    public /* synthetic */ PaddingElement(float f10, float f11, float f12, float f13, boolean z10, Ba.l lVar, C3854k c3854k) {
        this(f10, f11, f12, f13, z10, lVar);
    }

    public boolean equals(Object other) {
        PaddingElement paddingElement = other instanceof PaddingElement ? (PaddingElement) other : null;
        return paddingElement != null && U0.h.w(this.start, paddingElement.start) && U0.h.w(this.top, paddingElement.top) && U0.h.w(this.end, paddingElement.end) && U0.h.w(this.bottom, paddingElement.bottom) && this.rtlAware == paddingElement.rtlAware;
    }

    public int hashCode() {
        return (((((((U0.h.x(this.start) * 31) + U0.h.x(this.top)) * 31) + U0.h.x(this.end)) * 31) + U0.h.x(this.bottom)) * 31) + Boolean.hashCode(this.rtlAware);
    }

    @Override // A0.V
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public p m() {
        return new p(this.start, this.top, this.end, this.bottom, this.rtlAware, null);
    }

    @Override // A0.V
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void n(p node) {
        node.p2(this.start);
        node.q2(this.top);
        node.n2(this.end);
        node.m2(this.bottom);
        node.o2(this.rtlAware);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private PaddingElement(float f10, float f11, float f12, float f13, boolean z10, Ba.l<? super C2040s0, C4153F> lVar) {
        this.start = f10;
        this.top = f11;
        this.end = f12;
        this.bottom = f13;
        this.rtlAware = z10;
        this.inspectorInfo = lVar;
        if (f10 >= 0.0f || U0.h.w(f10, U0.h.INSTANCE.c())) {
            float f14 = this.top;
            if (f14 >= 0.0f || U0.h.w(f14, U0.h.INSTANCE.c())) {
                float f15 = this.end;
                if (f15 >= 0.0f || U0.h.w(f15, U0.h.INSTANCE.c())) {
                    float f16 = this.bottom;
                    if (f16 >= 0.0f || U0.h.w(f16, U0.h.INSTANCE.c())) {
                        return;
                    }
                }
            }
        }
        throw new IllegalArgumentException("Padding must be non-negative");
    }
}
