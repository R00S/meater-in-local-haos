package i0;

import android.graphics.Paint;
import android.graphics.Shader;
import kotlin.Metadata;

/* compiled from: AndroidPaint.android.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0013\u0010\b\u001a\u00060\u0002j\u0002`\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001e\u0010\u0014\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R.\u0010!\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010%\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010#\"\u0004\b\u0012\u0010$R*\u0010'\u001a\u00020&2\u0006\u0010'\u001a\u00020&8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u001b\u0010(\"\u0004\b)\u0010*R*\u0010.\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\r\u0010+\"\u0004\b,\u0010-R*\u00102\u001a\u00020/2\u0006\u0010\u001a\u001a\u00020/8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b0\u0010+\"\u0004\b1\u0010-R$\u00105\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b3\u0010#\"\u0004\b4\u0010$R*\u00109\u001a\u0002062\u0006\u0010\u001a\u001a\u0002068V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b7\u0010+\"\u0004\b8\u0010-R*\u0010=\u001a\u00020:2\u0006\u0010\u001a\u001a\u00020:8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b;\u0010+\"\u0004\b<\u0010-R$\u0010@\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b>\u0010#\"\u0004\b?\u0010$R*\u0010D\u001a\u00020A2\u0006\u0010\u001a\u001a\u00020A8V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bB\u0010+\"\u0004\bC\u0010-R4\u0010I\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00112\u000e\u0010\u001a\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR(\u0010M\u001a\u0004\u0018\u00010\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u00158V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\n\u0010J\"\u0004\bK\u0010L\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006N"}, d2 = {"Li0/Q;", "Li0/P0;", "Landroid/graphics/Paint;", "internalPaint", "<init>", "(Landroid/graphics/Paint;)V", "()V", "Landroidx/compose/ui/graphics/NativePaint;", "k", "()Landroid/graphics/Paint;", "a", "Landroid/graphics/Paint;", "Li0/b0;", "b", "I", "_blendMode", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "c", "Landroid/graphics/Shader;", "internalShader", "Li0/u0;", "d", "Li0/u0;", "internalColorFilter", "Li0/S0;", "value", "e", "Li0/S0;", "u", "()Li0/S0;", "v", "(Li0/S0;)V", "pathEffect", "", "()F", "(F)V", "alpha", "Li0/t0;", "color", "()J", "t", "(J)V", "()I", "i", "(I)V", "blendMode", "Li0/Q0;", "getStyle-TiuSbCo", "s", "style", "x", "w", "strokeWidth", "Li0/e1;", "q", "h", "strokeCap", "Li0/f1;", "f", "r", "strokeJoin", "j", "n", "strokeMiterLimit", "Li0/C0;", "p", "o", "filterQuality", "m", "()Landroid/graphics/Shader;", "l", "(Landroid/graphics/Shader;)V", "shader", "()Li0/u0;", "g", "(Li0/u0;)V", "colorFilter", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: i0.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3554Q implements P0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Paint internalPaint;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int _blendMode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Shader internalShader;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private C3604u0 internalColorFilter;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private S0 pathEffect;

    public C3554Q(Paint paint) {
        this.internalPaint = paint;
        this._blendMode = C3566b0.INSTANCE.B();
    }

    @Override // i0.P0
    /* renamed from: a, reason: from getter */
    public C3604u0 getInternalColorFilter() {
        return this.internalColorFilter;
    }

    @Override // i0.P0
    /* renamed from: b, reason: from getter */
    public int get_blendMode() {
        return this._blendMode;
    }

    @Override // i0.P0
    public void c(float f10) {
        C3555S.k(this.internalPaint, f10);
    }

    @Override // i0.P0
    public float d() {
        return C3555S.c(this.internalPaint);
    }

    @Override // i0.P0
    public long e() {
        return C3555S.d(this.internalPaint);
    }

    @Override // i0.P0
    public int f() {
        return C3555S.g(this.internalPaint);
    }

    @Override // i0.P0
    public void g(C3604u0 c3604u0) {
        this.internalColorFilter = c3604u0;
        C3555S.n(this.internalPaint, c3604u0);
    }

    @Override // i0.P0
    public void h(int i10) {
        C3555S.r(this.internalPaint, i10);
    }

    @Override // i0.P0
    public void i(int i10) {
        if (C3566b0.E(this._blendMode, i10)) {
            return;
        }
        this._blendMode = i10;
        C3555S.l(this.internalPaint, i10);
    }

    @Override // i0.P0
    public float j() {
        return C3555S.h(this.internalPaint);
    }

    @Override // i0.P0
    /* renamed from: k, reason: from getter */
    public Paint getInternalPaint() {
        return this.internalPaint;
    }

    @Override // i0.P0
    public void l(Shader shader) {
        this.internalShader = shader;
        C3555S.q(this.internalPaint, shader);
    }

    @Override // i0.P0
    /* renamed from: m, reason: from getter */
    public Shader getInternalShader() {
        return this.internalShader;
    }

    @Override // i0.P0
    public void n(float f10) {
        C3555S.t(this.internalPaint, f10);
    }

    @Override // i0.P0
    public void o(int i10) {
        C3555S.o(this.internalPaint, i10);
    }

    @Override // i0.P0
    public int p() {
        return C3555S.e(this.internalPaint);
    }

    @Override // i0.P0
    public int q() {
        return C3555S.f(this.internalPaint);
    }

    @Override // i0.P0
    public void r(int i10) {
        C3555S.s(this.internalPaint, i10);
    }

    @Override // i0.P0
    public void s(int i10) {
        C3555S.v(this.internalPaint, i10);
    }

    @Override // i0.P0
    public void t(long j10) {
        C3555S.m(this.internalPaint, j10);
    }

    @Override // i0.P0
    /* renamed from: u, reason: from getter */
    public S0 getPathEffect() {
        return this.pathEffect;
    }

    @Override // i0.P0
    public void v(S0 s02) {
        C3555S.p(this.internalPaint, s02);
        this.pathEffect = s02;
    }

    @Override // i0.P0
    public void w(float f10) {
        C3555S.u(this.internalPaint, f10);
    }

    @Override // i0.P0
    public float x() {
        return C3555S.i(this.internalPaint);
    }

    public C3554Q() {
        this(C3555S.j());
    }
}
