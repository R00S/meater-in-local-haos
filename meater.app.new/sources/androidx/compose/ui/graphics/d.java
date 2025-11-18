package androidx.compose.ui.graphics;

import U0.t;
import h0.C3482m;
import i0.C3602t0;
import i0.G0;
import i0.N0;
import i0.Y0;
import i0.Z0;
import i0.c1;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: GraphicsLayerScope.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0003R\"\u0010\u000e\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R*\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R*\u0010!\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014\"\u0004\b \u0010\u0016R*\u0010%\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0012\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016R*\u0010)\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0012\u001a\u0004\b'\u0010\u0014\"\u0004\b(\u0010\u0016R0\u0010.\u001a\u00020*2\u0006\u0010\u0010\u001a\u00020*8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\t\u0010'\u001a\u0004\b+\u0010,\"\u0004\b\b\u0010-R0\u00100\u001a\u00020*2\u0006\u0010\u0010\u001a\u00020*8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b'\u0010'\u001a\u0004\b/\u0010,\"\u0004\b\t\u0010-R*\u00102\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b&\u0010\u0014\"\u0004\b1\u0010\u0016R*\u00106\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b3\u0010\u0012\u001a\u0004\b4\u0010\u0014\"\u0004\b5\u0010\u0016R*\u00109\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b/\u0010\u0012\u001a\u0004\b7\u0010\u0014\"\u0004\b8\u0010\u0016R*\u0010<\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b:\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b;\u0010\u0016R0\u0010A\u001a\u00020=2\u0006\u0010\u0010\u001a\u00020=8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b>\u0010'\u001a\u0004\b?\u0010,\"\u0004\b@\u0010-R*\u0010H\u001a\u00020B2\u0006\u0010\u0010\u001a\u00020B8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\b3\u0010E\"\u0004\bF\u0010GR*\u0010N\u001a\u00020I2\u0006\u0010\u0010\u001a\u00020I8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010J\u001a\u0004\bK\u0010L\"\u0004\b\"\u0010MR0\u0010S\u001a\u00020O2\u0006\u0010\u0010\u001a\u00020O8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bP\u0010\t\u001a\u0004\bQ\u0010\u000b\"\u0004\bR\u0010\rR(\u0010W\u001a\u00020T8\u0016@\u0016X\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bU\u0010'\u001a\u0004\b\u0011\u0010,\"\u0004\bV\u0010-R\"\u0010]\u001a\u00020X8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bV\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\bP\u0010\\R\"\u0010c\u001a\u00020^8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010_\u001a\u0004\b`\u0010a\"\u0004\bU\u0010bR.\u0010l\u001a\u0004\u0018\u00010d2\b\u0010e\u001a\u0004\u0018\u00010d8\u0000@AX\u0080\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u0014\u0010n\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010\u0014R\u0014\u0010p\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010\u0014R.\u0010r\u001a\u0004\u0018\u00010q2\b\u0010\u0010\u001a\u0004\u0018\u00010q8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\b\u0012\u0010t\"\u0004\bu\u0010v\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006w"}, d2 = {"Landroidx/compose/ui/graphics/d;", "Landroidx/compose/ui/graphics/c;", "<init>", "()V", "Loa/F;", "Q", "U", "", "B", "I", "u", "()I", "setMutatedFields$ui_release", "(I)V", "mutatedFields", "", "value", "C", "F", "n", "()F", "j", "(F)V", "scaleX", "D", "K", "i", "scaleY", "E", "b", "c", "alpha", "k", "translationX", "G", "A", "g", "translationY", "H", "J", "p", "shadowElevation", "Li0/t0;", "d", "()J", "(J)V", "ambientShadowColor", "M", "spotShadowColor", "m", "rotationX", "L", "w", "e", "rotationY", "y", "f", "rotationZ", "N", "l", "cameraDistance", "Landroidx/compose/ui/graphics/f;", "O", "f1", "j1", "transformOrigin", "Li0/c1;", "P", "Li0/c1;", "()Li0/c1;", "n0", "(Li0/c1;)V", "shape", "", "Z", "o", "()Z", "(Z)V", "clip", "Landroidx/compose/ui/graphics/a;", "R", "q", "v", "compositingStrategy", "Lh0/m;", "S", "T", "size", "LU0/d;", "LU0/d;", "r", "()LU0/d;", "(LU0/d;)V", "graphicsDensity", "LU0/t;", "LU0/t;", "t", "()LU0/t;", "(LU0/t;)V", "layoutDirection", "Li0/N0;", "<set-?>", "V", "Li0/N0;", "z", "()Li0/N0;", "setOutline$ui_release", "(Li0/N0;)V", "outline", "getDensity", "density", "R0", "fontScale", "Li0/Z0;", "renderEffect", "Li0/Z0;", "()Li0/Z0;", "h", "(Li0/Z0;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private int mutatedFields;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private float translationX;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private float translationY;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private float shadowElevation;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private float rotationX;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private float rotationY;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private float rotationZ;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private boolean clip;

    /* renamed from: V, reason: collision with root package name and from kotlin metadata */
    private N0 outline;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private float scaleX = 1.0f;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private float scaleY = 1.0f;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private float alpha = 1.0f;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private long ambientShadowColor = G0.a();

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private long spotShadowColor = G0.a();

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    private float cameraDistance = 8.0f;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private long transformOrigin = f.INSTANCE.a();

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private c1 shape = Y0.a();

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private int compositingStrategy = a.INSTANCE.a();

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private long size = C3482m.INSTANCE.a();

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    private U0.d graphicsDensity = U0.f.b(1.0f, 0.0f, 2, null);

    /* renamed from: U, reason: collision with root package name and from kotlin metadata */
    private t layoutDirection = t.Ltr;

    @Override // androidx.compose.ui.graphics.c
    /* renamed from: A, reason: from getter */
    public float getTranslationY() {
        return this.translationY;
    }

    @Override // androidx.compose.ui.graphics.c
    public void B(long j10) {
        if (C3602t0.m(this.ambientShadowColor, j10)) {
            return;
        }
        this.mutatedFields |= 64;
        this.ambientShadowColor = j10;
    }

    /* renamed from: C, reason: from getter */
    public long getSize() {
        return this.size;
    }

    @Override // androidx.compose.ui.graphics.c
    /* renamed from: D, reason: from getter */
    public float getCameraDistance() {
        return this.cameraDistance;
    }

    @Override // androidx.compose.ui.graphics.c
    /* renamed from: E, reason: from getter */
    public float getTranslationX() {
        return this.translationX;
    }

    public Z0 F() {
        return null;
    }

    @Override // androidx.compose.ui.graphics.c
    public void G(boolean z10) {
        if (this.clip != z10) {
            this.mutatedFields |= 16384;
            this.clip = z10;
        }
    }

    @Override // androidx.compose.ui.graphics.c
    /* renamed from: H, reason: from getter */
    public float getRotationX() {
        return this.rotationX;
    }

    @Override // androidx.compose.ui.graphics.c
    public void I(long j10) {
        if (C3602t0.m(this.spotShadowColor, j10)) {
            return;
        }
        this.mutatedFields |= 128;
        this.spotShadowColor = j10;
    }

    /* renamed from: J, reason: from getter */
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    @Override // androidx.compose.ui.graphics.c
    /* renamed from: K, reason: from getter */
    public float getScaleY() {
        return this.scaleY;
    }

    /* renamed from: L, reason: from getter */
    public c1 getShape() {
        return this.shape;
    }

    /* renamed from: M, reason: from getter */
    public long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    public final void Q() {
        j(1.0f);
        i(1.0f);
        c(1.0f);
        k(0.0f);
        g(0.0f);
        p(0.0f);
        B(G0.a());
        I(G0.a());
        m(0.0f);
        e(0.0f);
        f(0.0f);
        l(8.0f);
        j1(f.INSTANCE.a());
        n0(Y0.a());
        G(false);
        h(null);
        v(a.INSTANCE.a());
        T(C3482m.INSTANCE.a());
        this.outline = null;
        this.mutatedFields = 0;
    }

    public final void R(U0.d dVar) {
        this.graphicsDensity = dVar;
    }

    @Override // U0.l
    /* renamed from: R0 */
    public float getFontScale() {
        return this.graphicsDensity.getFontScale();
    }

    public final void S(t tVar) {
        this.layoutDirection = tVar;
    }

    public void T(long j10) {
        this.size = j10;
    }

    public final void U() {
        this.outline = getShape().a(getSize(), this.layoutDirection, this.graphicsDensity);
    }

    /* renamed from: b, reason: from getter */
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.graphics.c
    public void c(float f10) {
        if (this.alpha == f10) {
            return;
        }
        this.mutatedFields |= 4;
        this.alpha = f10;
    }

    /* renamed from: d, reason: from getter */
    public long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    @Override // androidx.compose.ui.graphics.c
    public void e(float f10) {
        if (this.rotationY == f10) {
            return;
        }
        this.mutatedFields |= 512;
        this.rotationY = f10;
    }

    @Override // androidx.compose.ui.graphics.c
    public void f(float f10) {
        if (this.rotationZ == f10) {
            return;
        }
        this.mutatedFields |= 1024;
        this.rotationZ = f10;
    }

    @Override // androidx.compose.ui.graphics.c
    /* renamed from: f1, reason: from getter */
    public long getTransformOrigin() {
        return this.transformOrigin;
    }

    @Override // androidx.compose.ui.graphics.c
    public void g(float f10) {
        if (this.translationY == f10) {
            return;
        }
        this.mutatedFields |= 16;
        this.translationY = f10;
    }

    @Override // U0.d
    public float getDensity() {
        return this.graphicsDensity.getDensity();
    }

    @Override // androidx.compose.ui.graphics.c
    public void h(Z0 z02) {
        if (C3862t.b(null, z02)) {
            return;
        }
        this.mutatedFields |= 131072;
    }

    @Override // androidx.compose.ui.graphics.c
    public void i(float f10) {
        if (this.scaleY == f10) {
            return;
        }
        this.mutatedFields |= 2;
        this.scaleY = f10;
    }

    @Override // androidx.compose.ui.graphics.c
    public void j(float f10) {
        if (this.scaleX == f10) {
            return;
        }
        this.mutatedFields |= 1;
        this.scaleX = f10;
    }

    @Override // androidx.compose.ui.graphics.c
    public void j1(long j10) {
        if (f.e(this.transformOrigin, j10)) {
            return;
        }
        this.mutatedFields |= 4096;
        this.transformOrigin = j10;
    }

    @Override // androidx.compose.ui.graphics.c
    public void k(float f10) {
        if (this.translationX == f10) {
            return;
        }
        this.mutatedFields |= 8;
        this.translationX = f10;
    }

    @Override // androidx.compose.ui.graphics.c
    public void l(float f10) {
        if (this.cameraDistance == f10) {
            return;
        }
        this.mutatedFields |= 2048;
        this.cameraDistance = f10;
    }

    @Override // androidx.compose.ui.graphics.c
    public void m(float f10) {
        if (this.rotationX == f10) {
            return;
        }
        this.mutatedFields |= 256;
        this.rotationX = f10;
    }

    @Override // androidx.compose.ui.graphics.c
    /* renamed from: n, reason: from getter */
    public float getScaleX() {
        return this.scaleX;
    }

    @Override // androidx.compose.ui.graphics.c
    public void n0(c1 c1Var) {
        if (C3862t.b(this.shape, c1Var)) {
            return;
        }
        this.mutatedFields |= 8192;
        this.shape = c1Var;
    }

    /* renamed from: o, reason: from getter */
    public boolean getClip() {
        return this.clip;
    }

    @Override // androidx.compose.ui.graphics.c
    public void p(float f10) {
        if (this.shadowElevation == f10) {
            return;
        }
        this.mutatedFields |= 32;
        this.shadowElevation = f10;
    }

    /* renamed from: q, reason: from getter */
    public int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    /* renamed from: r, reason: from getter */
    public final U0.d getGraphicsDensity() {
        return this.graphicsDensity;
    }

    /* renamed from: t, reason: from getter */
    public final t getLayoutDirection() {
        return this.layoutDirection;
    }

    /* renamed from: u, reason: from getter */
    public final int getMutatedFields() {
        return this.mutatedFields;
    }

    @Override // androidx.compose.ui.graphics.c
    public void v(int i10) {
        if (a.e(this.compositingStrategy, i10)) {
            return;
        }
        this.mutatedFields |= 32768;
        this.compositingStrategy = i10;
    }

    @Override // androidx.compose.ui.graphics.c
    /* renamed from: w, reason: from getter */
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // androidx.compose.ui.graphics.c
    /* renamed from: y, reason: from getter */
    public float getRotationZ() {
        return this.rotationZ;
    }

    /* renamed from: z, reason: from getter */
    public final N0 getOutline() {
        return this.outline;
    }
}
