package l0;

import android.graphics.Matrix;
import android.graphics.Outline;
import i0.C3602t0;
import i0.C3604u0;
import i0.InterfaceC3586l0;
import i0.Z0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;

/* compiled from: AndroidGraphicsLayer.android.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b`\u0018\u0000 92\u00020\u0001:\u00019J*\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0003\u0010\u0011J;\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00070\u0018H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0007H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b \u0010!R\"\u0010'\u001a\u00020\"8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010-\u001a\u00020(8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u00103\u001a\u00020.8&@&X¦\u000e¢\u0006\f\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00107\u001a\u0002048&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b5\u0010$\"\u0004\b6\u0010&R\u001e\u0010=\u001a\u0004\u0018\u0001088&@&X¦\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001c\u0010@\u001a\u00020.8&@&X¦\u000e¢\u0006\f\u001a\u0004\b>\u00100\"\u0004\b?\u00102R\u001c\u0010C\u001a\u00020.8&@&X¦\u000e¢\u0006\f\u001a\u0004\bA\u00100\"\u0004\bB\u00102R\u001c\u0010F\u001a\u00020.8&@&X¦\u000e¢\u0006\f\u001a\u0004\bD\u00100\"\u0004\bE\u00102R\u001c\u0010I\u001a\u00020.8&@&X¦\u000e¢\u0006\f\u001a\u0004\bG\u00100\"\u0004\bH\u00102R\u001c\u0010L\u001a\u00020.8&@&X¦\u000e¢\u0006\f\u001a\u0004\bJ\u00100\"\u0004\bK\u00102R\"\u0010P\u001a\u00020M8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bN\u0010*\"\u0004\bO\u0010,R\"\u0010S\u001a\u00020M8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bQ\u0010*\"\u0004\bR\u0010,R\u001c\u0010V\u001a\u00020.8&@&X¦\u000e¢\u0006\f\u001a\u0004\bT\u00100\"\u0004\bU\u00102R\u001c\u0010Y\u001a\u00020.8&@&X¦\u000e¢\u0006\f\u001a\u0004\bW\u00100\"\u0004\bX\u00102R\u001c\u0010[\u001a\u00020.8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u00100\"\u0004\bZ\u00102R\u001c\u0010^\u001a\u00020.8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\\\u00100\"\u0004\b]\u00102R\u001c\u0010d\u001a\u00020_8&@&X¦\u000e¢\u0006\f\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001e\u0010j\u001a\u0004\u0018\u00010e8&@&X¦\u000e¢\u0006\f\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u001c\u0010k\u001a\u00020_8&@&X¦\u000e¢\u0006\f\u001a\u0004\bk\u0010a\"\u0004\bl\u0010cR\u0014\u0010n\u001a\u00020_8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bm\u0010aø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006oÀ\u0006\u0001"}, d2 = {"Ll0/d;", "", "", "x", "y", "LU0/r;", "size", "Loa/F;", "v", "(IIJ)V", "Landroid/graphics/Outline;", "outline", "outlineSize", "t", "(Landroid/graphics/Outline;J)V", "Li0/l0;", "canvas", "(Li0/l0;)V", "LU0/d;", "density", "LU0/t;", "layoutDirection", "Ll0/c;", "layer", "Lkotlin/Function1;", "Lk0/f;", "block", "F", "(LU0/d;LU0/t;Ll0/c;LBa/l;)V", "o", "()V", "Landroid/graphics/Matrix;", "M", "()Landroid/graphics/Matrix;", "Ll0/b;", "u", "()I", "L", "(I)V", "compositingStrategy", "Lh0/g;", "getPivotOffset-F1C5BW0", "()J", "z", "(J)V", "pivotOffset", "", "d", "()F", "c", "(F)V", "alpha", "Li0/b0;", "b", "setBlendMode-s9anfk8", "blendMode", "Li0/u0;", "a", "()Li0/u0;", "setColorFilter", "(Li0/u0;)V", "colorFilter", "n", "j", "scaleX", "K", "i", "scaleY", "E", "k", "translationX", "A", "g", "translationY", "N", "p", "shadowElevation", "Li0/t0;", "C", "B", "ambientShadowColor", "J", "I", "spotShadowColor", "H", "m", "rotationX", "w", "e", "rotationY", "f", "rotationZ", "D", "l", "cameraDistance", "", "getClip", "()Z", "G", "(Z)V", "clip", "Li0/Z0;", "s", "()Li0/Z0;", "h", "(Li0/Z0;)V", "renderEffect", "isInvalidated", "r", "q", "hasDisplayList", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: l0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC3871d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f44306a;

    /* compiled from: AndroidGraphicsLayer.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Ll0/d$a;", "", "<init>", "()V", "Lkotlin/Function1;", "Lk0/f;", "Loa/F;", "b", "LBa/l;", "a", "()LBa/l;", "DefaultDrawBlock", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: l0.d$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f44306a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final Ba.l<k0.f, C4153F> DefaultDrawBlock = C0587a.f44308B;

        /* compiled from: AndroidGraphicsLayer.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk0/f;", "Loa/F;", "a", "(Lk0/f;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: l0.d$a$a, reason: collision with other inner class name */
        static final class C0587a extends AbstractC3864v implements Ba.l<k0.f, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            public static final C0587a f44308B = new C0587a();

            C0587a() {
                super(1);
            }

            public final void a(k0.f fVar) {
                k0.f.T0(fVar, C3602t0.INSTANCE.d(), 0L, 0L, 0.0f, null, null, 0, 126, null);
            }

            @Override // Ba.l
            public /* bridge */ /* synthetic */ C4153F invoke(k0.f fVar) {
                a(fVar);
                return C4153F.f46609a;
            }
        }

        private Companion() {
        }

        public final Ba.l<k0.f, C4153F> a() {
            return DefaultDrawBlock;
        }
    }

    /* renamed from: A */
    float getTranslationY();

    void B(long j10);

    /* renamed from: C */
    long getAmbientShadowColor();

    /* renamed from: D */
    float getCameraDistance();

    /* renamed from: E */
    float getTranslationX();

    void F(U0.d density, U0.t layoutDirection, C3870c layer, Ba.l<? super k0.f, C4153F> block);

    void G(boolean z10);

    /* renamed from: H */
    float getRotationX();

    void I(long j10);

    /* renamed from: J */
    long getSpotShadowColor();

    /* renamed from: K */
    float getScaleY();

    void L(int i10);

    Matrix M();

    /* renamed from: N */
    float getShadowElevation();

    /* renamed from: a */
    C3604u0 getColorFilter();

    /* renamed from: b */
    int getBlendMode();

    void c(float f10);

    /* renamed from: d */
    float getAlpha();

    void e(float f10);

    void f(float f10);

    void g(float f10);

    void h(Z0 z02);

    void i(float f10);

    void j(float f10);

    void k(float f10);

    void l(float f10);

    void m(float f10);

    /* renamed from: n */
    float getScaleX();

    void o();

    void p(float f10);

    default boolean q() {
        return true;
    }

    void r(boolean z10);

    Z0 s();

    void t(Outline outline, long outlineSize);

    /* renamed from: u */
    int getCompositingStrategy();

    void v(int x10, int y10, long size);

    /* renamed from: w */
    float getRotationY();

    void x(InterfaceC3586l0 canvas);

    /* renamed from: y */
    float getRotationZ();

    void z(long j10);
}
