package androidx.compose.ui.graphics;

import A0.AbstractC0823c0;
import A0.B;
import A0.C0832k;
import A0.e0;
import Ba.l;
import b0.i;
import i0.C3602t0;
import i0.Z0;
import i0.c1;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import oa.C4153F;
import y0.H;
import y0.J;
import y0.K;
import y0.Z;

/* compiled from: GraphicsLayerModifier.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b?\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0093\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ&\u0010&\u001a\u00020%*\u00020 2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0016ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R\"\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010,\u001a\u0004\b5\u0010.\"\u0004\b6\u00100R\"\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010,\u001a\u0004\b8\u0010.\"\u0004\b9\u00100R\"\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010,\u001a\u0004\b;\u0010.\"\u0004\b<\u00100R\"\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010,\u001a\u0004\b>\u0010.\"\u0004\b?\u00100R\"\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010,\u001a\u0004\bA\u0010.\"\u0004\bB\u00100R\"\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010,\u001a\u0004\bD\u0010.\"\u0004\bE\u00100R\"\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010,\u001a\u0004\bG\u0010.\"\u0004\bH\u00100R\"\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010,\u001a\u0004\bJ\u0010.\"\u0004\bK\u00100R(\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010R\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R(\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b]\u0010M\u001a\u0004\b^\u0010O\"\u0004\b_\u0010QR(\u0010\u0018\u001a\u00020\u00168\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b`\u0010M\u001a\u0004\ba\u0010O\"\u0004\bb\u0010QR(\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bc\u0010b\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010l\u001a\u000e\u0012\u0004\u0012\u00020i\u0012\u0004\u0012\u00020\u001d0h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u0014\u0010s\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010Z\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006t"}, d2 = {"Landroidx/compose/ui/graphics/e;", "LA0/B;", "Lb0/i$c;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/f;", "transformOrigin", "Li0/c1;", "shape", "", "clip", "Li0/Z0;", "renderEffect", "Li0/t0;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/a;", "compositingStrategy", "<init>", "(FFFFFFFFFFJLi0/c1;ZLi0/Z0;JJILkotlin/jvm/internal/k;)V", "Loa/F;", "s2", "()V", "Ly0/K;", "Ly0/H;", "measurable", "LU0/b;", "constraints", "Ly0/J;", "b", "(Ly0/K;Ly0/H;J)Ly0/J;", "", "toString", "()Ljava/lang/String;", "O", "F", "n", "()F", "j", "(F)V", "P", "K", "i", "Q", "k2", "c", "R", "E", "k", "S", "A", "g", "T", "p2", "p", "U", "H", "m", "V", "w", "e", "W", "y", "f", "X", "D", "l", "Y", "J", "f1", "()J", "j1", "(J)V", "Z", "Li0/c1;", "q2", "()Li0/c1;", "n0", "(Li0/c1;)V", "a0", "m2", "()Z", "G", "(Z)V", "b0", "l2", "B", "c0", "r2", "I", "d0", "n2", "()I", "v", "(I)V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "e0", "LBa/l;", "layerBlock", "Li0/Z0;", "o2", "()Li0/Z0;", "h", "(Li0/Z0;)V", "O1", "shouldAutoInvalidate", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.graphics.e, reason: from toString */
/* loaded from: classes.dex */
final class SimpleGraphicsLayerModifier extends i.c implements B {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
    private float scaleX;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata and from toString */
    private float scaleY;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private float alpha;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata and from toString */
    private float translationX;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata and from toString */
    private float translationY;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata and from toString */
    private float shadowElevation;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata and from toString */
    private float rotationX;

    /* renamed from: V, reason: collision with root package name and from kotlin metadata and from toString */
    private float rotationY;

    /* renamed from: W, reason: collision with root package name and from kotlin metadata and from toString */
    private float rotationZ;

    /* renamed from: X, reason: collision with root package name and from kotlin metadata and from toString */
    private float cameraDistance;

    /* renamed from: Y, reason: collision with root package name and from kotlin metadata and from toString */
    private long transformOrigin;

    /* renamed from: Z, reason: collision with root package name and from kotlin metadata and from toString */
    private c1 shape;

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean clip;

    /* renamed from: b0, reason: collision with root package name and from kotlin metadata and from toString */
    private long ambientShadowColor;

    /* renamed from: c0, reason: collision with root package name and from kotlin metadata and from toString */
    private long spotShadowColor;

    /* renamed from: d0, reason: collision with root package name and from kotlin metadata and from toString */
    private int compositingStrategy;

    /* renamed from: e0, reason: collision with root package name and from kotlin metadata */
    private l<? super c, C4153F> layerBlock;

    /* compiled from: GraphicsLayerModifier.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/c;", "Loa/F;", "a", "(Landroidx/compose/ui/graphics/c;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.e$a */
    static final class a extends AbstractC3864v implements l<c, C4153F> {
        a() {
            super(1);
        }

        public final void a(c cVar) {
            cVar.j(SimpleGraphicsLayerModifier.this.getScaleX());
            cVar.i(SimpleGraphicsLayerModifier.this.getScaleY());
            cVar.c(SimpleGraphicsLayerModifier.this.getAlpha());
            cVar.k(SimpleGraphicsLayerModifier.this.getTranslationX());
            cVar.g(SimpleGraphicsLayerModifier.this.getTranslationY());
            cVar.p(SimpleGraphicsLayerModifier.this.getShadowElevation());
            cVar.m(SimpleGraphicsLayerModifier.this.getRotationX());
            cVar.e(SimpleGraphicsLayerModifier.this.getRotationY());
            cVar.f(SimpleGraphicsLayerModifier.this.getRotationZ());
            cVar.l(SimpleGraphicsLayerModifier.this.getCameraDistance());
            cVar.j1(SimpleGraphicsLayerModifier.this.getTransformOrigin());
            cVar.n0(SimpleGraphicsLayerModifier.this.getShape());
            cVar.G(SimpleGraphicsLayerModifier.this.getClip());
            SimpleGraphicsLayerModifier.this.o2();
            cVar.h(null);
            cVar.B(SimpleGraphicsLayerModifier.this.getAmbientShadowColor());
            cVar.I(SimpleGraphicsLayerModifier.this.getSpotShadowColor());
            cVar.v(SimpleGraphicsLayerModifier.this.getCompositingStrategy());
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(c cVar) {
            a(cVar);
            return C4153F.f46609a;
        }
    }

    /* compiled from: GraphicsLayerModifier.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.graphics.e$b */
    static final class b extends AbstractC3864v implements l<Z.a, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Z f22846B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ SimpleGraphicsLayerModifier f22847C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Z z10, SimpleGraphicsLayerModifier simpleGraphicsLayerModifier) {
            super(1);
            this.f22846B = z10;
            this.f22847C = simpleGraphicsLayerModifier;
        }

        public final void a(Z.a aVar) {
            Z.a.v(aVar, this.f22846B, 0, 0, 0.0f, this.f22847C.layerBlock, 4, null);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
            a(aVar);
            return C4153F.f46609a;
        }
    }

    public /* synthetic */ SimpleGraphicsLayerModifier(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, c1 c1Var, boolean z10, Z0 z02, long j11, long j12, int i10, C3854k c3854k) {
        this(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, j10, c1Var, z10, z02, j11, j12, i10);
    }

    /* renamed from: A, reason: from getter */
    public final float getTranslationY() {
        return this.translationY;
    }

    public final void B(long j10) {
        this.ambientShadowColor = j10;
    }

    /* renamed from: D, reason: from getter */
    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    /* renamed from: E, reason: from getter */
    public final float getTranslationX() {
        return this.translationX;
    }

    public final void G(boolean z10) {
        this.clip = z10;
    }

    /* renamed from: H, reason: from getter */
    public final float getRotationX() {
        return this.rotationX;
    }

    public final void I(long j10) {
        this.spotShadowColor = j10;
    }

    /* renamed from: K, reason: from getter */
    public final float getScaleY() {
        return this.scaleY;
    }

    @Override // b0.i.c
    /* renamed from: O1 */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // A0.B
    public J b(K k10, H h10, long j10) {
        Z zT = h10.T(j10);
        return K.E1(k10, zT.getWidth(), zT.getHeight(), null, new b(zT, this), 4, null);
    }

    public final void c(float f10) {
        this.alpha = f10;
    }

    public final void e(float f10) {
        this.rotationY = f10;
    }

    public final void f(float f10) {
        this.rotationZ = f10;
    }

    /* renamed from: f1, reason: from getter */
    public final long getTransformOrigin() {
        return this.transformOrigin;
    }

    public final void g(float f10) {
        this.translationY = f10;
    }

    public final void i(float f10) {
        this.scaleY = f10;
    }

    public final void j(float f10) {
        this.scaleX = f10;
    }

    public final void j1(long j10) {
        this.transformOrigin = j10;
    }

    public final void k(float f10) {
        this.translationX = f10;
    }

    /* renamed from: k2, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    public final void l(float f10) {
        this.cameraDistance = f10;
    }

    /* renamed from: l2, reason: from getter */
    public final long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    public final void m(float f10) {
        this.rotationX = f10;
    }

    /* renamed from: m2, reason: from getter */
    public final boolean getClip() {
        return this.clip;
    }

    /* renamed from: n, reason: from getter */
    public final float getScaleX() {
        return this.scaleX;
    }

    public final void n0(c1 c1Var) {
        this.shape = c1Var;
    }

    /* renamed from: n2, reason: from getter */
    public final int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    public final Z0 o2() {
        return null;
    }

    public final void p(float f10) {
        this.shadowElevation = f10;
    }

    /* renamed from: p2, reason: from getter */
    public final float getShadowElevation() {
        return this.shadowElevation;
    }

    /* renamed from: q2, reason: from getter */
    public final c1 getShape() {
        return this.shape;
    }

    /* renamed from: r2, reason: from getter */
    public final long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    public final void s2() {
        AbstractC0823c0 wrapped = C0832k.h(this, e0.a(2)).getWrapped();
        if (wrapped != null) {
            wrapped.f3(this.layerBlock, true);
        }
    }

    public String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", alpha = " + this.alpha + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", shadowElevation=" + this.shadowElevation + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", rotationZ=" + this.rotationZ + ", cameraDistance=" + this.cameraDistance + ", transformOrigin=" + ((Object) f.i(this.transformOrigin)) + ", shape=" + this.shape + ", clip=" + this.clip + ", renderEffect=" + ((Object) null) + ", ambientShadowColor=" + ((Object) C3602t0.t(this.ambientShadowColor)) + ", spotShadowColor=" + ((Object) C3602t0.t(this.spotShadowColor)) + ", compositingStrategy=" + ((Object) androidx.compose.ui.graphics.a.g(this.compositingStrategy)) + ')';
    }

    public final void v(int i10) {
        this.compositingStrategy = i10;
    }

    /* renamed from: w, reason: from getter */
    public final float getRotationY() {
        return this.rotationY;
    }

    /* renamed from: y, reason: from getter */
    public final float getRotationZ() {
        return this.rotationZ;
    }

    private SimpleGraphicsLayerModifier(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, long j10, c1 c1Var, boolean z10, Z0 z02, long j11, long j12, int i10) {
        this.scaleX = f10;
        this.scaleY = f11;
        this.alpha = f12;
        this.translationX = f13;
        this.translationY = f14;
        this.shadowElevation = f15;
        this.rotationX = f16;
        this.rotationY = f17;
        this.rotationZ = f18;
        this.cameraDistance = f19;
        this.transformOrigin = j10;
        this.shape = c1Var;
        this.clip = z10;
        this.ambientShadowColor = j11;
        this.spotShadowColor = j12;
        this.compositingStrategy = i10;
        this.layerBlock = new a();
    }

    public final void h(Z0 z02) {
    }
}
