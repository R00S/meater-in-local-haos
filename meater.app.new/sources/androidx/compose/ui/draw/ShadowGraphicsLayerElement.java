package androidx.compose.ui.draw;

import A0.V;
import Ba.l;
import U0.h;
import i0.BlockGraphicsLayerModifier;
import i0.C3602t0;
import i0.c1;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: Shadow.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u001d\u0010\u0004\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001d\u0010\n\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001d\u0010\u000b\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, d2 = {"Landroidx/compose/ui/draw/ShadowGraphicsLayerElement;", "LA0/V;", "Li0/i0;", "LU0/h;", "elevation", "Li0/c1;", "shape", "", "clip", "Li0/t0;", "ambientColor", "spotColor", "<init>", "(FLi0/c1;ZJJLkotlin/jvm/internal/k;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "Loa/F;", "s", "()LBa/l;", "p", "()Li0/i0;", "node", "B", "(Li0/i0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "F", "x", "()F", "c", "Li0/c1;", "y", "()Li0/c1;", "d", "Z", "w", "()Z", "e", "J", "v", "()J", "f", "A", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ShadowGraphicsLayerElement extends V<BlockGraphicsLayerModifier> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float elevation;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final c1 shape;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean clip;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final long ambientColor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final long spotColor;

    /* compiled from: Shadow.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/c;", "Loa/F;", "a", "(Landroidx/compose/ui/graphics/c;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements l<androidx.compose.ui.graphics.c, C4153F> {
        a() {
            super(1);
        }

        public final void a(androidx.compose.ui.graphics.c cVar) {
            cVar.p(cVar.X0(ShadowGraphicsLayerElement.this.getElevation()));
            cVar.n0(ShadowGraphicsLayerElement.this.getShape());
            cVar.G(ShadowGraphicsLayerElement.this.getClip());
            cVar.B(ShadowGraphicsLayerElement.this.getAmbientColor());
            cVar.I(ShadowGraphicsLayerElement.this.getSpotColor());
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(androidx.compose.ui.graphics.c cVar) {
            a(cVar);
            return C4153F.f46609a;
        }
    }

    public /* synthetic */ ShadowGraphicsLayerElement(float f10, c1 c1Var, boolean z10, long j10, long j11, C3854k c3854k) {
        this(f10, c1Var, z10, j10, j11);
    }

    private final l<androidx.compose.ui.graphics.c, C4153F> s() {
        return new a();
    }

    /* renamed from: A, reason: from getter */
    public final long getSpotColor() {
        return this.spotColor;
    }

    @Override // A0.V
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public void n(BlockGraphicsLayerModifier node) {
        node.l2(s());
        node.k2();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShadowGraphicsLayerElement)) {
            return false;
        }
        ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) other;
        return h.w(this.elevation, shadowGraphicsLayerElement.elevation) && C3862t.b(this.shape, shadowGraphicsLayerElement.shape) && this.clip == shadowGraphicsLayerElement.clip && C3602t0.m(this.ambientColor, shadowGraphicsLayerElement.ambientColor) && C3602t0.m(this.spotColor, shadowGraphicsLayerElement.spotColor);
    }

    public int hashCode() {
        return (((((((h.x(this.elevation) * 31) + this.shape.hashCode()) * 31) + Boolean.hashCode(this.clip)) * 31) + C3602t0.s(this.ambientColor)) * 31) + C3602t0.s(this.spotColor);
    }

    @Override // A0.V
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public BlockGraphicsLayerModifier m() {
        return new BlockGraphicsLayerModifier(s());
    }

    public String toString() {
        return "ShadowGraphicsLayerElement(elevation=" + ((Object) h.y(this.elevation)) + ", shape=" + this.shape + ", clip=" + this.clip + ", ambientColor=" + ((Object) C3602t0.t(this.ambientColor)) + ", spotColor=" + ((Object) C3602t0.t(this.spotColor)) + ')';
    }

    /* renamed from: v, reason: from getter */
    public final long getAmbientColor() {
        return this.ambientColor;
    }

    /* renamed from: w, reason: from getter */
    public final boolean getClip() {
        return this.clip;
    }

    /* renamed from: x, reason: from getter */
    public final float getElevation() {
        return this.elevation;
    }

    /* renamed from: y, reason: from getter */
    public final c1 getShape() {
        return this.shape;
    }

    private ShadowGraphicsLayerElement(float f10, c1 c1Var, boolean z10, long j10, long j11) {
        this.elevation = f10;
        this.shape = c1Var;
        this.clip = z10;
        this.ambientColor = j10;
        this.spotColor = j11;
    }
}
