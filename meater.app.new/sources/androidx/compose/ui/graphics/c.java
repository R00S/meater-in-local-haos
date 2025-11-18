package androidx.compose.ui.graphics;

import i0.Z0;
import i0.c1;
import kotlin.Metadata;

/* compiled from: GraphicsLayerScope.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\u0004\"\u0004\b\t\u0010\u0006R\u001c\u0010\r\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0004\"\u0004\b\f\u0010\u0006R\u001c\u0010\u0010\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u0004\"\u0004\b\u000f\u0010\u0006R\u001c\u0010\u0013\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0004\"\u0004\b\u0012\u0010\u0006R\u001c\u0010\u0016\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0004\"\u0004\b\u0015\u0010\u0006R*\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00178V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001c\u0010\"\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b \u0010\u0004\"\u0004\b!\u0010\u0006R\u001c\u0010%\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b#\u0010\u0004\"\u0004\b$\u0010\u0006R\u001c\u0010(\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b&\u0010\u0004\"\u0004\b'\u0010\u0006R\u001c\u0010+\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b)\u0010\u0004\"\u0004\b*\u0010\u0006R\"\u0010/\u001a\u00020,8&@&X¦\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR\u001c\u00105\u001a\u0002008&@&X¦\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068f@&X¦\u000e¢\u0006\u0012\u0012\u0004\b;\u0010<\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R(\u0010D\u001a\u0004\u0018\u00010>2\b\u0010?\u001a\u0004\u0018\u00010>8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR*\u0010F\u001a\u00020E2\u0006\u0010F\u001a\u00020E8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bG\u0010H\"\u0004\bI\u0010Jø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006KÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/c;", "LU0/d;", "", "n", "()F", "j", "(F)V", "scaleX", "K", "i", "scaleY", "getAlpha", "c", "alpha", "E", "k", "translationX", "A", "g", "translationY", "getShadowElevation", "p", "shadowElevation", "Li0/t0;", "ambientShadowColor", "getAmbientShadowColor-0d7_KjU", "()J", "B", "(J)V", "spotShadowColor", "getSpotShadowColor-0d7_KjU", "I", "H", "m", "rotationX", "w", "e", "rotationY", "y", "f", "rotationZ", "D", "l", "cameraDistance", "Landroidx/compose/ui/graphics/f;", "f1", "j1", "transformOrigin", "Li0/c1;", "getShape", "()Li0/c1;", "n0", "(Li0/c1;)V", "shape", "", "getClip", "()Z", "G", "(Z)V", "getClip$annotations", "()V", "clip", "Li0/Z0;", "<anonymous parameter 0>", "getRenderEffect", "()Li0/Z0;", "h", "(Li0/Z0;)V", "renderEffect", "Landroidx/compose/ui/graphics/a;", "compositingStrategy", "getCompositingStrategy--NrFUSI", "()I", "v", "(I)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface c extends U0.d {
    float A();

    float D();

    float E();

    void G(boolean z10);

    float H();

    float K();

    void c(float f10);

    void e(float f10);

    void f(float f10);

    long f1();

    void g(float f10);

    void i(float f10);

    void j(float f10);

    void j1(long j10);

    void k(float f10);

    void l(float f10);

    void m(float f10);

    float n();

    void n0(c1 c1Var);

    void p(float f10);

    float w();

    float y();

    default void B(long j10) {
    }

    default void I(long j10) {
    }

    default void h(Z0 z02) {
    }

    default void v(int i10) {
    }
}
