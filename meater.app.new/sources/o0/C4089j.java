package o0;

import i0.R0;
import java.util.List;
import kotlin.Metadata;
import o0.AbstractC4086g;

/* compiled from: PathParser.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0014\n\u0002\b\u0005\u001a!\u0010\u0004\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a_\u0010\r\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\r\u0010\u0013\u001a_\u0010\f\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u001a\"\u001a\u0010\u001f\u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"", "Lo0/g;", "Li0/R0;", "target", "c", "(Ljava/util/List;Li0/R0;)Li0/R0;", "p", "", "x0", "y0", "x1", "y1", "a", "b", "theta", "", "isMoreThanHalf", "isPositiveArc", "Loa/F;", "(Li0/R0;DDDDDDDZZ)V", "cx", "cy", "e1x", "e1y", "start", "sweep", "(Li0/R0;DDDDDDDDD)V", "", "[F", "getEmptyArray", "()[F", "EmptyArray", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: o0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4089j {

    /* renamed from: a, reason: collision with root package name */
    private static final float[] f46206a = new float[0];

    private static final void a(R0 r02, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        double d19 = d12;
        double d20 = 4;
        int iCeil = (int) Math.ceil(Math.abs((d18 * d20) / 3.141592653589793d));
        double dCos = Math.cos(d16);
        double dSin = Math.sin(d16);
        double dCos2 = Math.cos(d17);
        double dSin2 = Math.sin(d17);
        double d21 = -d19;
        double d22 = d21 * dCos;
        double d23 = d13 * dSin;
        double d24 = (d22 * dSin2) - (d23 * dCos2);
        double d25 = d21 * dSin;
        double d26 = d13 * dCos;
        double d27 = (dSin2 * d25) + (dCos2 * d26);
        double d28 = d18 / iCeil;
        double d29 = d14;
        double d30 = d27;
        double d31 = d24;
        int i10 = 0;
        double d32 = d15;
        double d33 = d17;
        while (i10 < iCeil) {
            double d34 = d33 + d28;
            double dSin3 = Math.sin(d34);
            double dCos3 = Math.cos(d34);
            int i11 = iCeil;
            double d35 = (d10 + ((d19 * dCos) * dCos3)) - (d23 * dSin3);
            double d36 = d11 + (d19 * dSin * dCos3) + (d26 * dSin3);
            double d37 = (d22 * dSin3) - (d23 * dCos3);
            double d38 = (dSin3 * d25) + (dCos3 * d26);
            double d39 = d34 - d33;
            double dTan = Math.tan(d39 / 2);
            double dSin4 = (Math.sin(d39) * (Math.sqrt(d20 + ((3.0d * dTan) * dTan)) - 1)) / 3;
            r02.q((float) (d29 + (d31 * dSin4)), (float) (d32 + (d30 * dSin4)), (float) (d35 - (dSin4 * d37)), (float) (d36 - (dSin4 * d38)), (float) d35, (float) d36);
            i10++;
            d28 = d28;
            dSin = dSin;
            d29 = d35;
            d25 = d25;
            d33 = d34;
            d30 = d38;
            d20 = d20;
            d31 = d37;
            dCos = dCos;
            iCeil = i11;
            d32 = d36;
            d19 = d12;
        }
    }

    private static final void b(R0 r02, double d10, double d11, double d12, double d13, double d14, double d15, double d16, boolean z10, boolean z11) {
        double d17;
        double d18;
        double d19 = (d16 / 180) * 3.141592653589793d;
        double dCos = Math.cos(d19);
        double dSin = Math.sin(d19);
        double d20 = ((d10 * dCos) + (d11 * dSin)) / d14;
        double d21 = (((-d10) * dSin) + (d11 * dCos)) / d15;
        double d22 = ((d12 * dCos) + (d13 * dSin)) / d14;
        double d23 = (((-d12) * dSin) + (d13 * dCos)) / d15;
        double d24 = d20 - d22;
        double d25 = d21 - d23;
        double d26 = 2;
        double d27 = (d20 + d22) / d26;
        double d28 = (d21 + d23) / d26;
        double d29 = (d24 * d24) + (d25 * d25);
        if (d29 == 0.0d) {
            return;
        }
        double d30 = (1.0d / d29) - 0.25d;
        if (d30 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d29) / 1.99999d);
            b(r02, d10, d11, d12, d13, d14 * dSqrt, d15 * dSqrt, d16, z10, z11);
            return;
        }
        double dSqrt2 = Math.sqrt(d30);
        double d31 = d24 * dSqrt2;
        double d32 = dSqrt2 * d25;
        if (z10 == z11) {
            d17 = d27 - d32;
            d18 = d28 + d31;
        } else {
            d17 = d27 + d32;
            d18 = d28 - d31;
        }
        double dAtan2 = Math.atan2(d21 - d18, d20 - d17);
        double dAtan22 = Math.atan2(d23 - d18, d22 - d17) - dAtan2;
        if (z11 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d33 = d17 * d14;
        double d34 = d18 * d15;
        a(r02, (d33 * dCos) - (d34 * dSin), (d33 * dSin) + (d34 * dCos), d14, d15, d10, d11, d19, dAtan2, dAtan22);
    }

    public static final R0 c(List<? extends AbstractC4086g> list, R0 r02) {
        AbstractC4086g abstractC4086g;
        float f10;
        int i10;
        int i11;
        float f11;
        float f12;
        float x12;
        float dy1;
        float dy;
        float x22;
        float y22;
        float dy2;
        float f13;
        float f14;
        float y12;
        float x23;
        float y23;
        float f15;
        float f16;
        List<? extends AbstractC4086g> list2 = list;
        R0 r03 = r02;
        int iN = r02.n();
        r02.r();
        r03.l(iN);
        AbstractC4086g abstractC4086g2 = list.isEmpty() ? AbstractC4086g.b.f46153c : list2.get(0);
        int size = list.size();
        float f17 = 0.0f;
        int i12 = 0;
        float x13 = 0.0f;
        float arcStartY = 0.0f;
        float arcStartX = 0.0f;
        float y10 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        while (i12 < size) {
            AbstractC4086g abstractC4086g3 = list2.get(i12);
            if (abstractC4086g3 instanceof AbstractC4086g.b) {
                r02.close();
                abstractC4086g = abstractC4086g3;
                f10 = f17;
                i10 = i12;
                i11 = size;
                x13 = f18;
                arcStartX = x13;
                arcStartY = f19;
                y10 = arcStartY;
            } else {
                if (abstractC4086g3 instanceof AbstractC4086g.RelativeMoveTo) {
                    AbstractC4086g.RelativeMoveTo relativeMoveTo = (AbstractC4086g.RelativeMoveTo) abstractC4086g3;
                    arcStartX += relativeMoveTo.getDx();
                    y10 += relativeMoveTo.getDy();
                    r03.g(relativeMoveTo.getDx(), relativeMoveTo.getDy());
                    f18 = arcStartX;
                } else if (abstractC4086g3 instanceof AbstractC4086g.MoveTo) {
                    AbstractC4086g.MoveTo moveTo = (AbstractC4086g.MoveTo) abstractC4086g3;
                    float x10 = moveTo.getX();
                    float y11 = moveTo.getY();
                    r03.p(moveTo.getX(), moveTo.getY());
                    arcStartX = x10;
                    f18 = arcStartX;
                    y10 = y11;
                } else {
                    if (abstractC4086g3 instanceof AbstractC4086g.RelativeLineTo) {
                        AbstractC4086g.RelativeLineTo relativeLineTo = (AbstractC4086g.RelativeLineTo) abstractC4086g3;
                        r03.u(relativeLineTo.getDx(), relativeLineTo.getDy());
                        arcStartX += relativeLineTo.getDx();
                        dy2 = relativeLineTo.getDy();
                    } else {
                        if (abstractC4086g3 instanceof AbstractC4086g.LineTo) {
                            AbstractC4086g.LineTo lineTo = (AbstractC4086g.LineTo) abstractC4086g3;
                            r03.w(lineTo.getX(), lineTo.getY());
                            x22 = lineTo.getX();
                            y22 = lineTo.getY();
                        } else {
                            if (abstractC4086g3 instanceof AbstractC4086g.RelativeHorizontalTo) {
                                AbstractC4086g.RelativeHorizontalTo relativeHorizontalTo = (AbstractC4086g.RelativeHorizontalTo) abstractC4086g3;
                                r03.u(relativeHorizontalTo.getDx(), f17);
                                arcStartX += relativeHorizontalTo.getDx();
                            } else if (abstractC4086g3 instanceof AbstractC4086g.HorizontalTo) {
                                AbstractC4086g.HorizontalTo horizontalTo = (AbstractC4086g.HorizontalTo) abstractC4086g3;
                                r03.w(horizontalTo.getX(), y10);
                                arcStartX = horizontalTo.getX();
                            } else if (abstractC4086g3 instanceof AbstractC4086g.RelativeVerticalTo) {
                                AbstractC4086g.RelativeVerticalTo relativeVerticalTo = (AbstractC4086g.RelativeVerticalTo) abstractC4086g3;
                                r03.u(f17, relativeVerticalTo.getDy());
                                dy2 = relativeVerticalTo.getDy();
                            } else if (abstractC4086g3 instanceof AbstractC4086g.VerticalTo) {
                                AbstractC4086g.VerticalTo verticalTo = (AbstractC4086g.VerticalTo) abstractC4086g3;
                                r03.w(arcStartX, verticalTo.getY());
                                y10 = verticalTo.getY();
                            } else {
                                if (abstractC4086g3 instanceof AbstractC4086g.RelativeCurveTo) {
                                    AbstractC4086g.RelativeCurveTo relativeCurveTo = (AbstractC4086g.RelativeCurveTo) abstractC4086g3;
                                    r02.h(relativeCurveTo.getDx1(), relativeCurveTo.getDy1(), relativeCurveTo.getDx2(), relativeCurveTo.getDy2(), relativeCurveTo.getDx3(), relativeCurveTo.getDy3());
                                    x12 = relativeCurveTo.getDx2() + arcStartX;
                                    dy1 = relativeCurveTo.getDy2() + y10;
                                    arcStartX += relativeCurveTo.getDx3();
                                    dy = relativeCurveTo.getDy3();
                                } else {
                                    if (abstractC4086g3 instanceof AbstractC4086g.CurveTo) {
                                        AbstractC4086g.CurveTo curveTo = (AbstractC4086g.CurveTo) abstractC4086g3;
                                        r02.q(curveTo.getX1(), curveTo.getY1(), curveTo.getX2(), curveTo.getY2(), curveTo.getX3(), curveTo.getY3());
                                        x12 = curveTo.getX2();
                                        y12 = curveTo.getY2();
                                        x23 = curveTo.getX3();
                                        y23 = curveTo.getY3();
                                    } else if (abstractC4086g3 instanceof AbstractC4086g.RelativeReflectiveCurveTo) {
                                        if (abstractC4086g2.getIsCurve()) {
                                            f16 = y10 - arcStartY;
                                            f15 = arcStartX - x13;
                                        } else {
                                            f15 = f17;
                                            f16 = f15;
                                        }
                                        AbstractC4086g.RelativeReflectiveCurveTo relativeReflectiveCurveTo = (AbstractC4086g.RelativeReflectiveCurveTo) abstractC4086g3;
                                        r02.h(f15, f16, relativeReflectiveCurveTo.getDx1(), relativeReflectiveCurveTo.getDy1(), relativeReflectiveCurveTo.getDx2(), relativeReflectiveCurveTo.getDy2());
                                        x12 = relativeReflectiveCurveTo.getDx1() + arcStartX;
                                        dy1 = relativeReflectiveCurveTo.getDy1() + y10;
                                        arcStartX += relativeReflectiveCurveTo.getDx2();
                                        dy = relativeReflectiveCurveTo.getDy2();
                                    } else if (abstractC4086g3 instanceof AbstractC4086g.ReflectiveCurveTo) {
                                        if (abstractC4086g2.getIsCurve()) {
                                            float f20 = 2;
                                            f14 = (f20 * y10) - arcStartY;
                                            f13 = (arcStartX * f20) - x13;
                                        } else {
                                            f13 = arcStartX;
                                            f14 = y10;
                                        }
                                        AbstractC4086g.ReflectiveCurveTo reflectiveCurveTo = (AbstractC4086g.ReflectiveCurveTo) abstractC4086g3;
                                        r02.q(f13, f14, reflectiveCurveTo.getX1(), reflectiveCurveTo.getY1(), reflectiveCurveTo.getX2(), reflectiveCurveTo.getY2());
                                        x12 = reflectiveCurveTo.getX1();
                                        y12 = reflectiveCurveTo.getY1();
                                        x23 = reflectiveCurveTo.getX2();
                                        y23 = reflectiveCurveTo.getY2();
                                    } else if (abstractC4086g3 instanceof AbstractC4086g.RelativeQuadTo) {
                                        AbstractC4086g.RelativeQuadTo relativeQuadTo = (AbstractC4086g.RelativeQuadTo) abstractC4086g3;
                                        r03.a(relativeQuadTo.getDx1(), relativeQuadTo.getDy1(), relativeQuadTo.getDx2(), relativeQuadTo.getDy2());
                                        x13 = relativeQuadTo.getDx1() + arcStartX;
                                        arcStartY = relativeQuadTo.getDy1() + y10;
                                        arcStartX += relativeQuadTo.getDx2();
                                        dy2 = relativeQuadTo.getDy2();
                                    } else if (abstractC4086g3 instanceof AbstractC4086g.QuadTo) {
                                        AbstractC4086g.QuadTo quadTo = (AbstractC4086g.QuadTo) abstractC4086g3;
                                        r03.m(quadTo.getX1(), quadTo.getY1(), quadTo.getX2(), quadTo.getY2());
                                        x13 = quadTo.getX1();
                                        arcStartY = quadTo.getY1();
                                        x22 = quadTo.getX2();
                                        y22 = quadTo.getY2();
                                    } else if (abstractC4086g3 instanceof AbstractC4086g.RelativeReflectiveQuadTo) {
                                        if (abstractC4086g2.getIsQuad()) {
                                            f11 = arcStartX - x13;
                                            f12 = y10 - arcStartY;
                                        } else {
                                            f11 = f17;
                                            f12 = f11;
                                        }
                                        AbstractC4086g.RelativeReflectiveQuadTo relativeReflectiveQuadTo = (AbstractC4086g.RelativeReflectiveQuadTo) abstractC4086g3;
                                        r03.a(f11, f12, relativeReflectiveQuadTo.getDx(), relativeReflectiveQuadTo.getDy());
                                        x12 = f11 + arcStartX;
                                        dy1 = f12 + y10;
                                        arcStartX += relativeReflectiveQuadTo.getDx();
                                        dy = relativeReflectiveQuadTo.getDy();
                                    } else if (abstractC4086g3 instanceof AbstractC4086g.ReflectiveQuadTo) {
                                        if (abstractC4086g2.getIsQuad()) {
                                            float f21 = 2;
                                            arcStartX = (arcStartX * f21) - x13;
                                            y10 = (f21 * y10) - arcStartY;
                                        }
                                        AbstractC4086g.ReflectiveQuadTo reflectiveQuadTo = (AbstractC4086g.ReflectiveQuadTo) abstractC4086g3;
                                        r03.m(arcStartX, y10, reflectiveQuadTo.getX(), reflectiveQuadTo.getY());
                                        float x11 = reflectiveQuadTo.getX();
                                        arcStartY = y10;
                                        abstractC4086g = abstractC4086g3;
                                        f10 = f17;
                                        i10 = i12;
                                        i11 = size;
                                        y10 = reflectiveQuadTo.getY();
                                        float f22 = arcStartX;
                                        arcStartX = x11;
                                        x13 = f22;
                                    } else if (abstractC4086g3 instanceof AbstractC4086g.RelativeArcTo) {
                                        AbstractC4086g.RelativeArcTo relativeArcTo = (AbstractC4086g.RelativeArcTo) abstractC4086g3;
                                        float arcStartDx = relativeArcTo.getArcStartDx() + arcStartX;
                                        float arcStartDy = relativeArcTo.getArcStartDy() + y10;
                                        abstractC4086g = abstractC4086g3;
                                        i10 = i12;
                                        f10 = 0.0f;
                                        i11 = size;
                                        b(r02, arcStartX, y10, arcStartDx, arcStartDy, relativeArcTo.getHorizontalEllipseRadius(), relativeArcTo.getVerticalEllipseRadius(), relativeArcTo.getTheta(), relativeArcTo.getIsMoreThanHalf(), relativeArcTo.getIsPositiveArc());
                                        arcStartY = arcStartDy;
                                        y10 = arcStartY;
                                        x13 = arcStartDx;
                                        arcStartX = x13;
                                    } else {
                                        abstractC4086g = abstractC4086g3;
                                        f10 = f17;
                                        i10 = i12;
                                        i11 = size;
                                        if (abstractC4086g instanceof AbstractC4086g.ArcTo) {
                                            AbstractC4086g.ArcTo arcTo = (AbstractC4086g.ArcTo) abstractC4086g;
                                            b(r02, arcStartX, y10, arcTo.getArcStartX(), arcTo.getArcStartY(), arcTo.getHorizontalEllipseRadius(), arcTo.getVerticalEllipseRadius(), arcTo.getTheta(), arcTo.getIsMoreThanHalf(), arcTo.getIsPositiveArc());
                                            arcStartX = arcTo.getArcStartX();
                                            arcStartY = arcTo.getArcStartY();
                                            y10 = arcStartY;
                                            x13 = arcStartX;
                                        }
                                    }
                                    arcStartX = x23;
                                    y10 = y23;
                                    abstractC4086g = abstractC4086g3;
                                    f10 = f17;
                                    i10 = i12;
                                    i11 = size;
                                    arcStartY = y12;
                                    x13 = x12;
                                }
                                y10 += dy;
                                arcStartY = dy1;
                                abstractC4086g = abstractC4086g3;
                                f10 = f17;
                                i10 = i12;
                                i11 = size;
                                x13 = x12;
                            }
                            abstractC4086g = abstractC4086g3;
                            f10 = f17;
                            i10 = i12;
                            i11 = size;
                        }
                        y10 = y22;
                        arcStartX = x22;
                        abstractC4086g = abstractC4086g3;
                        f10 = f17;
                        i10 = i12;
                        i11 = size;
                    }
                    y10 += dy2;
                    abstractC4086g = abstractC4086g3;
                    f10 = f17;
                    i10 = i12;
                    i11 = size;
                }
                f19 = y10;
                abstractC4086g = abstractC4086g3;
                f10 = f17;
                i10 = i12;
                i11 = size;
            }
            i12 = i10 + 1;
            r03 = r02;
            abstractC4086g2 = abstractC4086g;
            f17 = f10;
            size = i11;
            list2 = list;
        }
        return r02;
    }
}
