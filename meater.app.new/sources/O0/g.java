package O0;

import R0.j;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import h0.C3476g;
import h0.C3482m;
import i0.AbstractC3582j0;
import i0.C3555S;
import i0.C3566b0;
import i0.C3606v0;
import i0.P0;
import i0.Q0;
import i0.Shadow;
import i0.a1;
import k0.Stroke;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import kotlin.x1;

/* compiled from: AndroidTextPaint.android.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u001c\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010#R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b(\u0010)R(\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b+\u0010,\u0012\u0004\b0\u0010\n\u001a\u0004\b-\u0010.\"\u0004\b/\u0010\u0012R*\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001c\u00101\u0012\u0004\b6\u0010\n\u001a\u0004\b2\u00103\"\u0004\b4\u00105R2\u0010?\u001a\u0012\u0012\f\u0012\n\u0018\u000108j\u0004\u0018\u0001`9\u0018\u0001078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R0\u0010F\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0081\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0018\n\u0004\b \u0010@\u0012\u0004\bE\u0010\n\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010GR\u0014\u0010I\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010HR*\u0010M\u001a\u00020'2\u0006\u0010J\u001a\u00020'8F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b%\u0010K\"\u0004\b+\u0010L\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006N"}, d2 = {"LO0/g;", "Landroid/text/TextPaint;", "", "flags", "", "density", "<init>", "(IF)V", "Loa/F;", "a", "()V", "LR0/j;", "textDecoration", "i", "(LR0/j;)V", "Li0/b1;", "shadow", "h", "(Li0/b1;)V", "Li0/t0;", "color", "f", "(J)V", "Li0/j0;", "brush", "Lh0/m;", "size", "alpha", "e", "(Li0/j0;JF)V", "Lk0/g;", "drawStyle", "g", "(Lk0/g;)V", "Li0/P0;", "Li0/P0;", "backingComposePaint", "b", "LR0/j;", "Li0/b0;", "c", "I", "backingBlendMode", "d", "Li0/b1;", "getShadow$ui_text_release", "()Li0/b1;", "setShadow$ui_text_release", "getShadow$ui_text_release$annotations", "Li0/j0;", "getBrush$ui_text_release", "()Li0/j0;", "setBrush$ui_text_release", "(Li0/j0;)V", "getBrush$ui_text_release$annotations", "LO/x1;", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "LO/x1;", "getShaderState$ui_text_release", "()LO/x1;", "setShaderState$ui_text_release", "(LO/x1;)V", "shaderState", "Lh0/m;", "getBrushSize-VsRJwc0$ui_text_release", "()Lh0/m;", "setBrushSize-iaC8Vc4$ui_text_release", "(Lh0/m;)V", "getBrushSize-VsRJwc0$ui_text_release$annotations", "brushSize", "Lk0/g;", "()Li0/P0;", "composePaint", "value", "()I", "(I)V", "blendMode", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g extends TextPaint {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private P0 backingComposePaint;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private R0.j textDecoration;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int backingBlendMode;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Shadow shadow;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private AbstractC3582j0 brush;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private x1<? extends Shader> shaderState;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private C3482m brushSize;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private k0.g drawStyle;

    /* compiled from: AndroidTextPaint.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "a", "()Landroid/graphics/Shader;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.a<Shader> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ AbstractC3582j0 f13092B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ long f13093C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC3582j0 abstractC3582j0, long j10) {
            super(0);
            this.f13092B = abstractC3582j0;
            this.f13093C = j10;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Shader invoke() {
            return ((a1) this.f13092B).b(this.f13093C);
        }
    }

    public g(int i10, float f10) {
        super(i10);
        ((TextPaint) this).density = f10;
        this.textDecoration = R0.j.INSTANCE.b();
        this.backingBlendMode = k0.f.INSTANCE.a();
        this.shadow = Shadow.INSTANCE.a();
    }

    private final void a() {
        this.shaderState = null;
        this.brush = null;
        this.brushSize = null;
        setShader(null);
    }

    private final P0 c() {
        P0 p02 = this.backingComposePaint;
        if (p02 != null) {
            return p02;
        }
        P0 p0B = C3555S.b(this);
        this.backingComposePaint = p0B;
        return p0B;
    }

    /* renamed from: b, reason: from getter */
    public final int getBackingBlendMode() {
        return this.backingBlendMode;
    }

    public final void d(int i10) {
        if (C3566b0.E(i10, this.backingBlendMode)) {
            return;
        }
        c().i(i10);
        this.backingBlendMode = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(i0.AbstractC3582j0 r5, long r6, float r8) {
        /*
            r4 = this;
            if (r5 != 0) goto L6
            r4.a()
            goto L6a
        L6:
            boolean r0 = r5 instanceof i0.SolidColor
            if (r0 == 0) goto L18
            i0.d1 r5 = (i0.SolidColor) r5
            long r5 = r5.getValue()
            long r5 = R0.l.b(r5, r8)
            r4.f(r5)
            goto L6a
        L18:
            boolean r0 = r5 instanceof i0.a1
            if (r0 == 0) goto L6a
            i0.j0 r0 = r4.brush
            boolean r0 = kotlin.jvm.internal.C3862t.b(r0, r5)
            r1 = 0
            if (r0 == 0) goto L35
            h0.m r0 = r4.brushSize
            if (r0 != 0) goto L2b
            r0 = r1
            goto L33
        L2b:
            long r2 = r0.getPackedValue()
            boolean r0 = h0.C3482m.f(r2, r6)
        L33:
            if (r0 != 0) goto L54
        L35:
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 == 0) goto L3f
            r1 = 1
        L3f:
            if (r1 == 0) goto L54
            r4.brush = r5
            h0.m r0 = h0.C3482m.c(r6)
            r4.brushSize = r0
            O0.g$a r0 = new O0.g$a
            r0.<init>(r5, r6)
            O.x1 r5 = kotlin.m1.d(r0)
            r4.shaderState = r5
        L54:
            i0.P0 r5 = r4.c()
            O.x1<? extends android.graphics.Shader> r6 = r4.shaderState
            if (r6 == 0) goto L63
            java.lang.Object r6 = r6.getValue()
            android.graphics.Shader r6 = (android.graphics.Shader) r6
            goto L64
        L63:
            r6 = 0
        L64:
            r5.l(r6)
            O0.h.a(r4, r8)
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.g.e(i0.j0, long, float):void");
    }

    public final void f(long color) {
        if (color != 16) {
            setColor(C3606v0.j(color));
            a();
        }
    }

    public final void g(k0.g drawStyle) {
        if (drawStyle == null || C3862t.b(this.drawStyle, drawStyle)) {
            return;
        }
        this.drawStyle = drawStyle;
        if (C3862t.b(drawStyle, k0.j.f43725a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (drawStyle instanceof Stroke) {
            c().s(Q0.INSTANCE.b());
            Stroke stroke = (Stroke) drawStyle;
            c().w(stroke.getWidth());
            c().n(stroke.getMiter());
            c().r(stroke.getJoin());
            c().h(stroke.getCap());
            c().v(stroke.getPathEffect());
        }
    }

    public final void h(Shadow shadow) {
        if (shadow == null || C3862t.b(this.shadow, shadow)) {
            return;
        }
        this.shadow = shadow;
        if (C3862t.b(shadow, Shadow.INSTANCE.a())) {
            clearShadowLayer();
        } else {
            setShadowLayer(P0.d.b(this.shadow.getBlurRadius()), C3476g.m(this.shadow.getOffset()), C3476g.n(this.shadow.getOffset()), C3606v0.j(this.shadow.getColor()));
        }
    }

    public final void i(R0.j textDecoration) {
        if (textDecoration == null || C3862t.b(this.textDecoration, textDecoration)) {
            return;
        }
        this.textDecoration = textDecoration;
        j.Companion companion = R0.j.INSTANCE;
        setUnderlineText(textDecoration.d(companion.c()));
        setStrikeThruText(this.textDecoration.d(companion.a()));
    }
}
