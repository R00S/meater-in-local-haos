package o0;

import i0.AbstractC3582j0;
import i0.C3560X;
import i0.C3561Y;
import i0.R0;
import i0.U0;
import java.util.List;
import k0.Stroke;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4165j;
import oa.EnumC4168m;
import oa.InterfaceC4164i;

/* compiled from: Vector.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR*\u0010\u0013\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u0012R.\u0010\u001b\u001a\u0004\u0018\u00010\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010#\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R6\u0010+\u001a\b\u0012\u0004\u0012\u00020%0$2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020%0$8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R0\u00103\u001a\u00020,2\u0006\u0010\r\u001a\u00020,8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R*\u00107\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u001e\u001a\u0004\b5\u0010 \"\u0004\b6\u0010\"R*\u0010:\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b8\u0010 \"\u0004\b9\u0010\"R.\u0010<\u001a\u0004\u0018\u00010\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0016\u001a\u0004\b4\u0010\u0018\"\u0004\b;\u0010\u001aR0\u0010@\u001a\u00020=2\u0006\u0010\r\u001a\u00020=8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0011\u0010.\u001a\u0004\b>\u00100\"\u0004\b?\u00102R0\u0010D\u001a\u00020A2\u0006\u0010\r\u001a\u00020A8\u0006@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b)\u0010.\u001a\u0004\bB\u00100\"\u0004\bC\u00102R*\u0010G\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u001e\u001a\u0004\bE\u0010 \"\u0004\bF\u0010\"R*\u0010J\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010\u001e\u001a\u0004\bH\u0010 \"\u0004\bI\u0010\"R*\u0010M\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010\u001e\u001a\u0004\bK\u0010 \"\u0004\bL\u0010\"R*\u0010P\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010\u001e\u001a\u0004\bN\u0010 \"\u0004\bO\u0010\"R\u0016\u0010S\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010RR\u0016\u0010T\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010RR\u0016\u0010U\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010RR\u0018\u0010X\u001a\u0004\u0018\u00010V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010WR\u0014\u0010[\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010ZR\u0016\u0010\\\u001a\u00020Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010ZR\u001b\u0010`\u001a\u00020]8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010^\u001a\u0004\b-\u0010_\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006a"}, d2 = {"Lo0/f;", "Lo0/k;", "<init>", "()V", "Loa/F;", "v", "w", "Lk0/f;", "a", "(Lk0/f;)V", "", "toString", "()Ljava/lang/String;", "value", "b", "Ljava/lang/String;", "getName", "j", "(Ljava/lang/String;)V", "name", "Li0/j0;", "c", "Li0/j0;", "e", "()Li0/j0;", "h", "(Li0/j0;)V", "fill", "", "d", "F", "getFillAlpha", "()F", "i", "(F)V", "fillAlpha", "", "Lo0/g;", "Ljava/util/List;", "getPathData", "()Ljava/util/List;", "k", "(Ljava/util/List;)V", "pathData", "Li0/T0;", "f", "I", "getPathFillType-Rg-k1Os", "()I", "l", "(I)V", "pathFillType", "g", "getStrokeAlpha", "n", "strokeAlpha", "getStrokeLineWidth", "r", "strokeLineWidth", "m", "stroke", "Li0/e1;", "getStrokeLineCap-KaPHkGw", "o", "strokeLineCap", "Li0/f1;", "getStrokeLineJoin-LxFBmk8", "p", "strokeLineJoin", "getStrokeLineMiter", "q", "strokeLineMiter", "getTrimPathStart", "u", "trimPathStart", "getTrimPathEnd", "s", "trimPathEnd", "getTrimPathOffset", "t", "trimPathOffset", "", "Z", "isPathDirty", "isStrokeDirty", "isTrimPathDirty", "Lk0/k;", "Lk0/k;", "strokeStyle", "Li0/R0;", "Li0/R0;", "path", "renderPath", "Li0/U0;", "Loa/i;", "()Li0/U0;", "pathMeasure", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: o0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4085f extends AbstractC4090k {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private AbstractC3582j0 fill;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float fillAlpha;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private List<? extends AbstractC4086g> pathData;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int pathFillType;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float strokeAlpha;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private float strokeLineWidth;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private AbstractC3582j0 stroke;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int strokeLineCap;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int strokeLineJoin;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private float strokeLineMiter;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private float trimPathStart;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float trimPathEnd;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private float trimPathOffset;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean isPathDirty;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean isStrokeDirty;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean isTrimPathDirty;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private Stroke strokeStyle;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final R0 path;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private R0 renderPath;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4164i pathMeasure;

    /* compiled from: Vector.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li0/U0;", "a", "()Li0/U0;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: o0.f$a */
    static final class a extends AbstractC3864v implements Ba.a<U0> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f46143B = new a();

        a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final U0 invoke() {
            return C3560X.a();
        }
    }

    public C4085f() {
        super(null);
        this.name = "";
        this.fillAlpha = 1.0f;
        this.pathData = C4093n.d();
        this.pathFillType = C4093n.a();
        this.strokeAlpha = 1.0f;
        this.strokeLineCap = C4093n.b();
        this.strokeLineJoin = C4093n.c();
        this.strokeLineMiter = 4.0f;
        this.trimPathEnd = 1.0f;
        this.isPathDirty = true;
        this.isStrokeDirty = true;
        R0 r0A = C3561Y.a();
        this.path = r0A;
        this.renderPath = r0A;
        this.pathMeasure = C4165j.b(EnumC4168m.f46628D, a.f46143B);
    }

    private final U0 f() {
        return (U0) this.pathMeasure.getValue();
    }

    private final void v() {
        C4089j.c(this.pathData, this.path);
        w();
    }

    private final void w() {
        if (this.trimPathStart == 0.0f && this.trimPathEnd == 1.0f) {
            this.renderPath = this.path;
            return;
        }
        if (C3862t.b(this.renderPath, this.path)) {
            this.renderPath = C3561Y.a();
        } else {
            int iN = this.renderPath.n();
            this.renderPath.r();
            this.renderPath.l(iN);
        }
        f().c(this.path, false);
        float fA = f().a();
        float f10 = this.trimPathStart;
        float f11 = this.trimPathOffset;
        float f12 = ((f10 + f11) % 1.0f) * fA;
        float f13 = ((this.trimPathEnd + f11) % 1.0f) * fA;
        if (f12 <= f13) {
            f().b(f12, f13, this.renderPath, true);
        } else {
            f().b(f12, fA, this.renderPath, true);
            f().b(0.0f, f13, this.renderPath, true);
        }
    }

    @Override // o0.AbstractC4090k
    public void a(k0.f fVar) {
        if (this.isPathDirty) {
            v();
        } else if (this.isTrimPathDirty) {
            w();
        }
        this.isPathDirty = false;
        this.isTrimPathDirty = false;
        AbstractC3582j0 abstractC3582j0 = this.fill;
        if (abstractC3582j0 != null) {
            k0.f.H0(fVar, this.renderPath, abstractC3582j0, this.fillAlpha, null, null, 0, 56, null);
        }
        AbstractC3582j0 abstractC3582j02 = this.stroke;
        if (abstractC3582j02 != null) {
            Stroke stroke = this.strokeStyle;
            if (this.isStrokeDirty || stroke == null) {
                stroke = new Stroke(this.strokeLineWidth, this.strokeLineMiter, this.strokeLineCap, this.strokeLineJoin, null, 16, null);
                this.strokeStyle = stroke;
                this.isStrokeDirty = false;
            }
            k0.f.H0(fVar, this.renderPath, abstractC3582j02, this.strokeAlpha, stroke, null, 0, 48, null);
        }
    }

    /* renamed from: e, reason: from getter */
    public final AbstractC3582j0 getFill() {
        return this.fill;
    }

    /* renamed from: g, reason: from getter */
    public final AbstractC3582j0 getStroke() {
        return this.stroke;
    }

    public final void h(AbstractC3582j0 abstractC3582j0) {
        this.fill = abstractC3582j0;
        c();
    }

    public final void i(float f10) {
        this.fillAlpha = f10;
        c();
    }

    public final void j(String str) {
        this.name = str;
        c();
    }

    public final void k(List<? extends AbstractC4086g> list) {
        this.pathData = list;
        this.isPathDirty = true;
        c();
    }

    public final void l(int i10) {
        this.pathFillType = i10;
        this.renderPath.l(i10);
        c();
    }

    public final void m(AbstractC3582j0 abstractC3582j0) {
        this.stroke = abstractC3582j0;
        c();
    }

    public final void n(float f10) {
        this.strokeAlpha = f10;
        c();
    }

    public final void o(int i10) {
        this.strokeLineCap = i10;
        this.isStrokeDirty = true;
        c();
    }

    public final void p(int i10) {
        this.strokeLineJoin = i10;
        this.isStrokeDirty = true;
        c();
    }

    public final void q(float f10) {
        this.strokeLineMiter = f10;
        this.isStrokeDirty = true;
        c();
    }

    public final void r(float f10) {
        this.strokeLineWidth = f10;
        this.isStrokeDirty = true;
        c();
    }

    public final void s(float f10) {
        this.trimPathEnd = f10;
        this.isTrimPathDirty = true;
        c();
    }

    public final void t(float f10) {
        this.trimPathOffset = f10;
        this.isTrimPathDirty = true;
        c();
    }

    public String toString() {
        return this.path.toString();
    }

    public final void u(float f10) {
        this.trimPathStart = f10;
        this.isTrimPathDirty = true;
        c();
    }
}
