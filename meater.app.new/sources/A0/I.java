package A0;

import b0.i;
import i0.AbstractC3582j0;
import i0.C3604u0;
import i0.H0;
import i0.InterfaceC3586l0;
import i0.R0;
import k0.C3781a;
import k0.InterfaceC3783c;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import l0.C3870c;

/* compiled from: LayoutNodeDrawScope.kt */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006Jq\u0010\u001a\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJY\u0010\u001e\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\t2\b\b\u0002\u0010\u001d\u001a\u00020\u000e2\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJw\u0010*\u001a\u00020\u00192\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020\"2\b\b\u0002\u0010'\u001a\u00020$2\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010)\u001a\u00020(H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010+JM\u00100\u001a\u00020\u00192\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101JM\u00102\u001a\u00020\u00192\u0006\u0010-\u001a\u00020,2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b2\u00103JY\u00104\u001a\u00020\u00192\u0006\u0010/\u001a\u00020.2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105JY\u00106\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b6\u00107Jc\u0010:\u001a\u00020\u00192\u0006\u0010/\u001a\u00020.2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u00109\u001a\u0002082\b\b\u0003\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b:\u0010;Jc\u0010<\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u00109\u001a\u0002082\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0003\u0010\u0012\u001a\u00020\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0096\u0001ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020?*\u00020>H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020>*\u00020BH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010DJ\u001a\u0010E\u001a\u00020>*\u00020\tH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bE\u0010FJ\u001a\u0010G\u001a\u00020>*\u00020?H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u00020I*\u00020\u0010H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\t*\u00020>H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bL\u0010FJ\u0017\u0010M\u001a\u00020\t*\u00020BH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bM\u0010DJ\u0017\u0010N\u001a\u00020\u0010*\u00020IH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bN\u0010KJ\u0017\u0010O\u001a\u00020B*\u00020>H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\bO\u0010PJ\u001a\u0010Q\u001a\u00020B*\u00020\tH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bQ\u0010PJ\u000f\u0010R\u001a\u00020\u0019H\u0016¢\u0006\u0004\bR\u0010SJ#\u0010Y\u001a\u00020\u0019*\u00020T2\u0006\u0010V\u001a\u00020U2\b\u0010X\u001a\u0004\u0018\u00010W¢\u0006\u0004\bY\u0010ZJ<\u0010_\u001a\u00020\u00192\u0006\u0010V\u001a\u00020U2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\\\u001a\u00020[2\u0006\u0010^\u001a\u00020]2\b\u0010X\u001a\u0004\u0018\u00010WH\u0000ø\u0001\u0000¢\u0006\u0004\b_\u0010`J<\u0010a\u001a\u00020\u00192\u0006\u0010V\u001a\u00020U2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\\\u001a\u00020[2\u0006\u0010^\u001a\u00020T2\b\u0010X\u001a\u0004\u0018\u00010WH\u0000ø\u0001\u0000¢\u0006\u0004\ba\u0010bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0018\u0010^\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u001a\u0010\u001d\u001a\u00020\u000e8VX\u0096\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0014\u0010m\u001a\u00020\t8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0014\u0010q\u001a\u00020n8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0014\u0010s\u001a\u00020\t8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\br\u0010lR\u0014\u0010w\u001a\u00020t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bu\u0010vR\u001a\u0010\u0011\u001a\u00020\u00108VX\u0096\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bg\u0010j\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006x"}, d2 = {"LA0/I;", "Lk0/f;", "Lk0/c;", "Lk0/a;", "canvasDrawScope", "<init>", "(Lk0/a;)V", "Li0/t0;", "color", "", "startAngle", "sweepAngle", "", "useCenter", "Lh0/g;", "topLeft", "Lh0/m;", "size", "alpha", "Lk0/g;", "style", "Li0/u0;", "colorFilter", "Li0/b0;", "blendMode", "Loa/F;", "q0", "(JFFZJJFLk0/g;Li0/u0;I)V", "radius", "center", "N", "(JFJFLk0/g;Li0/u0;I)V", "Li0/H0;", "image", "LU0/n;", "srcOffset", "LU0/r;", "srcSize", "dstOffset", "dstSize", "Li0/C0;", "filterQuality", "x1", "(Li0/H0;JJJJFLk0/g;Li0/u0;II)V", "Li0/R0;", "path", "Li0/j0;", "brush", "O0", "(Li0/R0;Li0/j0;FLk0/g;Li0/u0;I)V", "O", "(Li0/R0;JFLk0/g;Li0/u0;I)V", "g1", "(Li0/j0;JJFLk0/g;Li0/u0;I)V", "x0", "(JJJFLk0/g;Li0/u0;I)V", "Lh0/a;", "cornerRadius", "d1", "(Li0/j0;JJJFLk0/g;Li0/u0;I)V", "h1", "(JJJJLk0/g;FLi0/u0;I)V", "LU0/h;", "", "i1", "(F)I", "LU0/v;", "i0", "(J)F", "G0", "(F)F", "E0", "(I)F", "LU0/k;", "Z", "(J)J", "X0", "w1", "t1", "s", "(F)J", "x", "C1", "()V", "LA0/r;", "Li0/l0;", "canvas", "Ll0/c;", "layer", "o", "(LA0/r;Li0/l0;Ll0/c;)V", "LA0/c0;", "coordinator", "Lb0/i$c;", "drawNode", "b", "(Li0/l0;JLA0/c0;Lb0/i$c;Ll0/c;)V", "d", "(Li0/l0;JLA0/c0;LA0/r;Ll0/c;)V", "B", "Lk0/a;", "getCanvasDrawScope", "()Lk0/a;", "C", "LA0/r;", "p1", "()J", "getDensity", "()F", "density", "Lk0/d;", "a1", "()Lk0/d;", "drawContext", "R0", "fontScale", "LU0/t;", "getLayoutDirection", "()LU0/t;", "layoutDirection", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class I implements k0.f, InterfaceC3783c {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final C3781a canvasDrawScope;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private r drawNode;

    public I(C3781a c3781a) {
        this.canvasDrawScope = c3781a;
    }

    @Override // k0.f
    public long C() {
        return this.canvasDrawScope.C();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v5, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    @Override // k0.InterfaceC3783c
    public void C1() {
        InterfaceC3586l0 interfaceC3586l0G = getDrawContext().G();
        r rVar = this.drawNode;
        C3862t.d(rVar);
        AbstractC0834m abstractC0834mB = J.b(rVar);
        if (abstractC0834mB == 0) {
            AbstractC0823c0 abstractC0823c0H = C0832k.h(rVar, e0.a(4));
            if (abstractC0823c0H.r2() == rVar.getNode()) {
                abstractC0823c0H = abstractC0823c0H.getWrapped();
                C3862t.d(abstractC0823c0H);
            }
            abstractC0823c0H.N2(interfaceC3586l0G, getDrawContext().getGraphicsLayer());
            return;
        }
        int iA = e0.a(4);
        Q.b bVar = null;
        while (abstractC0834mB != 0) {
            if (abstractC0834mB instanceof r) {
                o((r) abstractC0834mB, interfaceC3586l0G, getDrawContext().getGraphicsLayer());
            } else if ((abstractC0834mB.getKindSet() & iA) != 0 && (abstractC0834mB instanceof AbstractC0834m)) {
                i.c delegate = abstractC0834mB.getDelegate();
                int i10 = 0;
                abstractC0834mB = abstractC0834mB;
                while (delegate != null) {
                    if ((delegate.getKindSet() & iA) != 0) {
                        i10++;
                        if (i10 == 1) {
                            abstractC0834mB = delegate;
                        } else {
                            if (bVar == null) {
                                bVar = new Q.b(new i.c[16], 0);
                            }
                            if (abstractC0834mB != 0) {
                                bVar.c(abstractC0834mB);
                                abstractC0834mB = 0;
                            }
                            bVar.c(delegate);
                        }
                    }
                    delegate = delegate.getChild();
                    abstractC0834mB = abstractC0834mB;
                }
                if (i10 == 1) {
                }
            }
            abstractC0834mB = C0832k.g(bVar);
        }
    }

    @Override // U0.d
    public float E0(int i10) {
        return this.canvasDrawScope.E0(i10);
    }

    @Override // U0.d
    public float G0(float f10) {
        return this.canvasDrawScope.G0(f10);
    }

    @Override // k0.f
    public void N(long color, float radius, long center, float alpha, k0.g style, C3604u0 colorFilter, int blendMode) {
        this.canvasDrawScope.N(color, radius, center, alpha, style, colorFilter, blendMode);
    }

    @Override // k0.f
    public void O(R0 path, long color, float alpha, k0.g style, C3604u0 colorFilter, int blendMode) {
        this.canvasDrawScope.O(path, color, alpha, style, colorFilter, blendMode);
    }

    @Override // k0.f
    public void O0(R0 path, AbstractC3582j0 brush, float alpha, k0.g style, C3604u0 colorFilter, int blendMode) {
        this.canvasDrawScope.O0(path, brush, alpha, style, colorFilter, blendMode);
    }

    @Override // U0.l
    /* renamed from: R0 */
    public float getFontScale() {
        return this.canvasDrawScope.getFontScale();
    }

    @Override // U0.d
    public float X0(float f10) {
        return this.canvasDrawScope.X0(f10);
    }

    @Override // U0.d
    public long Z(long j10) {
        return this.canvasDrawScope.Z(j10);
    }

    @Override // k0.f
    /* renamed from: a1 */
    public k0.d getDrawContext() {
        return this.canvasDrawScope.getDrawContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [b0.i$c] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final void b(InterfaceC3586l0 canvas, long size, AbstractC0823c0 coordinator, i.c drawNode, C3870c layer) {
        int iA = e0.a(4);
        AbstractC0834m abstractC0834mG = drawNode;
        Q.b bVar = null;
        while (abstractC0834mG != 0) {
            if (abstractC0834mG instanceof r) {
                d(canvas, size, coordinator, abstractC0834mG, layer);
            } else if ((abstractC0834mG.getKindSet() & iA) != 0 && (abstractC0834mG instanceof AbstractC0834m)) {
                i.c delegate = abstractC0834mG.getDelegate();
                int i10 = 0;
                abstractC0834mG = abstractC0834mG;
                while (delegate != null) {
                    if ((delegate.getKindSet() & iA) != 0) {
                        i10++;
                        if (i10 == 1) {
                            abstractC0834mG = delegate;
                        } else {
                            if (bVar == null) {
                                bVar = new Q.b(new i.c[16], 0);
                            }
                            if (abstractC0834mG != 0) {
                                bVar.c(abstractC0834mG);
                                abstractC0834mG = 0;
                            }
                            bVar.c(delegate);
                        }
                    }
                    delegate = delegate.getChild();
                    abstractC0834mG = abstractC0834mG;
                }
                if (i10 == 1) {
                }
            }
            abstractC0834mG = C0832k.g(bVar);
        }
    }

    public final void d(InterfaceC3586l0 canvas, long size, AbstractC0823c0 coordinator, r drawNode, C3870c layer) {
        r rVar = this.drawNode;
        this.drawNode = drawNode;
        C3781a c3781a = this.canvasDrawScope;
        U0.t layoutDirection = coordinator.getLayoutDirection();
        U0.d density = c3781a.getDrawContext().getDensity();
        U0.t layoutDirection2 = c3781a.getDrawContext().getLayoutDirection();
        InterfaceC3586l0 interfaceC3586l0G = c3781a.getDrawContext().G();
        long jC = c3781a.getDrawContext().C();
        C3870c graphicsLayer = c3781a.getDrawContext().getGraphicsLayer();
        k0.d drawContext = c3781a.getDrawContext();
        drawContext.c(coordinator);
        drawContext.b(layoutDirection);
        drawContext.H(canvas);
        drawContext.E(size);
        drawContext.I(layer);
        canvas.h();
        try {
            drawNode.d(this);
            canvas.t();
            k0.d drawContext2 = c3781a.getDrawContext();
            drawContext2.c(density);
            drawContext2.b(layoutDirection2);
            drawContext2.H(interfaceC3586l0G);
            drawContext2.E(jC);
            drawContext2.I(graphicsLayer);
            this.drawNode = rVar;
        } catch (Throwable th) {
            canvas.t();
            k0.d drawContext3 = c3781a.getDrawContext();
            drawContext3.c(density);
            drawContext3.b(layoutDirection2);
            drawContext3.H(interfaceC3586l0G);
            drawContext3.E(jC);
            drawContext3.I(graphicsLayer);
            throw th;
        }
    }

    @Override // k0.f
    public void d1(AbstractC3582j0 brush, long topLeft, long size, long cornerRadius, float alpha, k0.g style, C3604u0 colorFilter, int blendMode) {
        this.canvasDrawScope.d1(brush, topLeft, size, cornerRadius, alpha, style, colorFilter, blendMode);
    }

    @Override // k0.f
    public void g1(AbstractC3582j0 brush, long topLeft, long size, float alpha, k0.g style, C3604u0 colorFilter, int blendMode) {
        this.canvasDrawScope.g1(brush, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // U0.d
    public float getDensity() {
        return this.canvasDrawScope.getDensity();
    }

    @Override // k0.f
    public U0.t getLayoutDirection() {
        return this.canvasDrawScope.getLayoutDirection();
    }

    @Override // k0.f
    public void h1(long color, long topLeft, long size, long cornerRadius, k0.g style, float alpha, C3604u0 colorFilter, int blendMode) {
        this.canvasDrawScope.h1(color, topLeft, size, cornerRadius, style, alpha, colorFilter, blendMode);
    }

    @Override // U0.l
    public float i0(long j10) {
        return this.canvasDrawScope.i0(j10);
    }

    @Override // U0.d
    public int i1(float f10) {
        return this.canvasDrawScope.i1(f10);
    }

    public final void o(r rVar, InterfaceC3586l0 interfaceC3586l0, C3870c c3870c) {
        AbstractC0823c0 abstractC0823c0H = C0832k.h(rVar, e0.a(4));
        abstractC0823c0H.getLayoutNode().c0().d(interfaceC3586l0, U0.s.d(abstractC0823c0H.a()), abstractC0823c0H, rVar, c3870c);
    }

    @Override // k0.f
    public long p1() {
        return this.canvasDrawScope.p1();
    }

    @Override // k0.f
    public void q0(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, k0.g style, C3604u0 colorFilter, int blendMode) {
        this.canvasDrawScope.q0(color, startAngle, sweepAngle, useCenter, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // U0.l
    public long s(float f10) {
        return this.canvasDrawScope.s(f10);
    }

    @Override // U0.d
    public long t1(long j10) {
        return this.canvasDrawScope.t1(j10);
    }

    @Override // U0.d
    public float w1(long j10) {
        return this.canvasDrawScope.w1(j10);
    }

    @Override // U0.d
    public long x(float f10) {
        return this.canvasDrawScope.x(f10);
    }

    @Override // k0.f
    public void x0(long color, long topLeft, long size, float alpha, k0.g style, C3604u0 colorFilter, int blendMode) {
        this.canvasDrawScope.x0(color, topLeft, size, alpha, style, colorFilter, blendMode);
    }

    @Override // k0.f
    public void x1(H0 image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, k0.g style, C3604u0 colorFilter, int blendMode, int filterQuality) {
        this.canvasDrawScope.x1(image, srcOffset, srcSize, dstOffset, dstSize, alpha, style, colorFilter, blendMode, filterQuality);
    }

    public /* synthetic */ I(C3781a c3781a, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? new C3781a() : c3781a);
    }
}
