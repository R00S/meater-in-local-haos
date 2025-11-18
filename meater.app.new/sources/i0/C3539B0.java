package i0;

import android.graphics.ColorSpace;
import j0.AbstractC3703c;
import j0.C3707g;
import j0.InterfaceC3710j;
import j0.TransferParameters;
import j0.WhitePoint;
import java.util.function.DoubleUnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: AndroidColorSpace.android.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Li0/B0;", "", "<init>", "()V", "Lj0/c;", "Landroid/graphics/ColorSpace;", "e", "(Lj0/c;)Landroid/graphics/ColorSpace;", "h", "(Landroid/graphics/ColorSpace;)Lj0/c;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: i0.B0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3539B0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C3539B0 f42815a = new C3539B0();

    private C3539B0() {
    }

    public static final ColorSpace e(AbstractC3703c abstractC3703c) {
        ColorSpace.Rgb rgb;
        C3707g c3707g = C3707g.f43324a;
        if (C3862t.b(abstractC3703c, c3707g.w())) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (C3862t.b(abstractC3703c, c3707g.e())) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (C3862t.b(abstractC3703c, c3707g.f())) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (C3862t.b(abstractC3703c, c3707g.g())) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (C3862t.b(abstractC3703c, c3707g.h())) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (C3862t.b(abstractC3703c, c3707g.i())) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (C3862t.b(abstractC3703c, c3707g.j())) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (C3862t.b(abstractC3703c, c3707g.k())) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (C3862t.b(abstractC3703c, c3707g.m())) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (C3862t.b(abstractC3703c, c3707g.n())) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (C3862t.b(abstractC3703c, c3707g.o())) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (C3862t.b(abstractC3703c, c3707g.p())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (C3862t.b(abstractC3703c, c3707g.q())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (C3862t.b(abstractC3703c, c3707g.r())) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (C3862t.b(abstractC3703c, c3707g.u())) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (C3862t.b(abstractC3703c, c3707g.v())) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (!(abstractC3703c instanceof j0.x)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        j0.x xVar = (j0.x) abstractC3703c;
        float[] fArrC = xVar.getWhitePoint().c();
        TransferParameters transferParameters = xVar.getTransferParameters();
        ColorSpace.Rgb.TransferParameters transferParameters2 = transferParameters != null ? new ColorSpace.Rgb.TransferParameters(transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma()) : null;
        if (transferParameters2 != null) {
            rgb = new ColorSpace.Rgb(abstractC3703c.getName(), xVar.getPrimaries(), fArrC, transferParameters2);
        } else {
            String name = abstractC3703c.getName();
            float[] primaries = xVar.getPrimaries();
            final Ba.l<Double, Double> lVarL = xVar.L();
            DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: i0.x0
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d10) {
                    return C3539B0.f(lVarL, d10);
                }
            };
            final Ba.l<Double, Double> lVarH = xVar.H();
            rgb = new ColorSpace.Rgb(name, primaries, fArrC, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: i0.y0
                @Override // java.util.function.DoubleUnaryOperator
                public final double applyAsDouble(double d10) {
                    return C3539B0.g(lVarH, d10);
                }
            }, abstractC3703c.f(0), abstractC3703c.e(0));
        }
        return rgb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double f(Ba.l lVar, double d10) {
        return ((Number) lVar.invoke(Double.valueOf(d10))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double g(Ba.l lVar, double d10) {
        return ((Number) lVar.invoke(Double.valueOf(d10))).doubleValue();
    }

    public static final AbstractC3703c h(final ColorSpace colorSpace) {
        WhitePoint whitePoint;
        TransferParameters transferParameters;
        int id2 = colorSpace.getId();
        if (id2 == ColorSpace.Named.SRGB.ordinal()) {
            return C3707g.f43324a.w();
        }
        if (id2 == ColorSpace.Named.ACES.ordinal()) {
            return C3707g.f43324a.e();
        }
        if (id2 == ColorSpace.Named.ACESCG.ordinal()) {
            return C3707g.f43324a.f();
        }
        if (id2 == ColorSpace.Named.ADOBE_RGB.ordinal()) {
            return C3707g.f43324a.g();
        }
        if (id2 == ColorSpace.Named.BT2020.ordinal()) {
            return C3707g.f43324a.h();
        }
        if (id2 == ColorSpace.Named.BT709.ordinal()) {
            return C3707g.f43324a.i();
        }
        if (id2 == ColorSpace.Named.CIE_LAB.ordinal()) {
            return C3707g.f43324a.j();
        }
        if (id2 == ColorSpace.Named.CIE_XYZ.ordinal()) {
            return C3707g.f43324a.k();
        }
        if (id2 == ColorSpace.Named.DCI_P3.ordinal()) {
            return C3707g.f43324a.m();
        }
        if (id2 == ColorSpace.Named.DISPLAY_P3.ordinal()) {
            return C3707g.f43324a.n();
        }
        if (id2 == ColorSpace.Named.EXTENDED_SRGB.ordinal()) {
            return C3707g.f43324a.o();
        }
        if (id2 == ColorSpace.Named.LINEAR_EXTENDED_SRGB.ordinal()) {
            return C3707g.f43324a.p();
        }
        if (id2 == ColorSpace.Named.LINEAR_SRGB.ordinal()) {
            return C3707g.f43324a.q();
        }
        if (id2 == ColorSpace.Named.NTSC_1953.ordinal()) {
            return C3707g.f43324a.r();
        }
        if (id2 == ColorSpace.Named.PRO_PHOTO_RGB.ordinal()) {
            return C3707g.f43324a.u();
        }
        if (id2 == ColorSpace.Named.SMPTE_C.ordinal()) {
            return C3707g.f43324a.v();
        }
        if (!(colorSpace instanceof ColorSpace.Rgb)) {
            return C3707g.f43324a.w();
        }
        ColorSpace.Rgb rgb = (ColorSpace.Rgb) colorSpace;
        ColorSpace.Rgb.TransferParameters transferParameters2 = rgb.getTransferParameters();
        WhitePoint whitePoint2 = rgb.getWhitePoint().length == 3 ? new WhitePoint(rgb.getWhitePoint()[0], rgb.getWhitePoint()[1], rgb.getWhitePoint()[2]) : new WhitePoint(rgb.getWhitePoint()[0], rgb.getWhitePoint()[1]);
        if (transferParameters2 != null) {
            whitePoint = whitePoint2;
            transferParameters = new TransferParameters(transferParameters2.g, transferParameters2.a, transferParameters2.b, transferParameters2.c, transferParameters2.d, transferParameters2.e, transferParameters2.f);
        } else {
            whitePoint = whitePoint2;
            transferParameters = null;
        }
        return new j0.x(rgb.getName(), rgb.getPrimaries(), whitePoint, rgb.getTransform(), new InterfaceC3710j() { // from class: i0.z0
            @Override // j0.InterfaceC3710j
            public final double a(double d10) {
                return C3539B0.i(colorSpace, d10);
            }
        }, new InterfaceC3710j() { // from class: i0.A0
            @Override // j0.InterfaceC3710j
            public final double a(double d10) {
                return C3539B0.j(colorSpace, d10);
            }
        }, colorSpace.getMinValue(0), colorSpace.getMaxValue(0), transferParameters, rgb.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double i(ColorSpace colorSpace, double d10) {
        return ((ColorSpace.Rgb) colorSpace).getOetf().applyAsDouble(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double j(ColorSpace colorSpace, double d10) {
        return ((ColorSpace.Rgb) colorSpace).getEotf().applyAsDouble(d10);
    }
}
