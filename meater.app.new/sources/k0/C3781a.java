package k0;

import U0.t;
import h0.C3470a;
import h0.C3476g;
import h0.C3482m;
import i0.AbstractC3582j0;
import i0.C0;
import i0.C3555S;
import i0.C3566b0;
import i0.C3602t0;
import i0.C3604u0;
import i0.H0;
import i0.InterfaceC3586l0;
import i0.P0;
import i0.Q0;
import i0.R0;
import i0.e1;
import i0.f1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import l0.C3870c;

/* compiled from: CanvasDrawScope.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJJ\u0010\u0017\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018JH\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001d\u001a\u00020\u0019*\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJN\u0010$\u001a\u00020#2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b$\u0010%JN\u0010&\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b&\u0010'Jf\u00100\u001a\u00020#2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020*2\u0006\u0010/\u001a\u00020,2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016ø\u0001\u0000¢\u0006\u0004\b0\u00101JV\u00104\u001a\u00020#2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u00103\u001a\u0002022\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b4\u00105JV\u00106\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u00103\u001a\u0002022\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b6\u00107JN\u0010:\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u000f2\u0006\u00109\u001a\u00020\u001f2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b:\u0010;Jf\u0010@\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010<\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020>2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\b@\u0010AJF\u0010D\u001a\u00020#2\u0006\u0010C\u001a\u00020B2\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\bD\u0010EJF\u0010F\u001a\u00020#2\u0006\u0010C\u001a\u00020B2\u0006\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016ø\u0001\u0000¢\u0006\u0004\bF\u0010GR \u0010N\u001a\u00020H8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bI\u0010J\u0012\u0004\bM\u0010\u0003\u001a\u0004\bK\u0010LR\u001a\u0010T\u001a\u00020O8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0018\u0010W\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010Y\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010VR\u0014\u0010]\u001a\u00020Z8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0014\u0010`\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0014\u0010b\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\ba\u0010_\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006d"}, d2 = {"Lk0/a;", "Lk0/f;", "<init>", "()V", "Li0/P0;", "u", "()Li0/P0;", "z", "Lk0/g;", "drawStyle", "F", "(Lk0/g;)Li0/P0;", "Li0/j0;", "brush", "style", "", "alpha", "Li0/u0;", "colorFilter", "Li0/b0;", "blendMode", "Li0/C0;", "filterQuality", "o", "(Li0/j0;Lk0/g;FLi0/u0;II)Li0/P0;", "Li0/t0;", "color", "b", "(JLk0/g;FLi0/u0;II)Li0/P0;", "t", "(JF)J", "Lh0/g;", "topLeft", "Lh0/m;", "size", "Loa/F;", "g1", "(Li0/j0;JJFLk0/g;Li0/u0;I)V", "x0", "(JJJFLk0/g;Li0/u0;I)V", "Li0/H0;", "image", "LU0/n;", "srcOffset", "LU0/r;", "srcSize", "dstOffset", "dstSize", "x1", "(Li0/H0;JJJJFLk0/g;Li0/u0;II)V", "Lh0/a;", "cornerRadius", "d1", "(Li0/j0;JJJFLk0/g;Li0/u0;I)V", "h1", "(JJJJLk0/g;FLi0/u0;I)V", "radius", "center", "N", "(JFJFLk0/g;Li0/u0;I)V", "startAngle", "sweepAngle", "", "useCenter", "q0", "(JFFZJJFLk0/g;Li0/u0;I)V", "Li0/R0;", "path", "O", "(Li0/R0;JFLk0/g;Li0/u0;I)V", "O0", "(Li0/R0;Li0/j0;FLk0/g;Li0/u0;I)V", "Lk0/a$a;", "B", "Lk0/a$a;", "r", "()Lk0/a$a;", "getDrawParams$annotations", "drawParams", "Lk0/d;", "C", "Lk0/d;", "a1", "()Lk0/d;", "drawContext", "D", "Li0/P0;", "fillPaint", "E", "strokePaint", "LU0/t;", "getLayoutDirection", "()LU0/t;", "layoutDirection", "getDensity", "()F", "density", "R0", "fontScale", "a", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: k0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3781a implements f {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final DrawParams drawParams = new DrawParams(null, null, null, 0, 15, null);

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final d drawContext = new b();

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private P0 fillPaint;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private P0 strokePaint;

    /* compiled from: CanvasDrawScope.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\bHÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010!R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\"\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010%R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010&\u001a\u0004\b'\u0010\u0011\"\u0004\b(\u0010)R(\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b\u0012\u0010*\u001a\u0004\b+\u0010\u0013\"\u0004\b,\u0010-\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"Lk0/a$a;", "", "LU0/d;", "density", "LU0/t;", "layoutDirection", "Li0/l0;", "canvas", "Lh0/m;", "size", "<init>", "(LU0/d;LU0/t;Li0/l0;JLkotlin/jvm/internal/k;)V", "a", "()LU0/d;", "b", "()LU0/t;", "c", "()Li0/l0;", "d", "()J", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LU0/d;", "f", "j", "(LU0/d;)V", "LU0/t;", "g", "k", "(LU0/t;)V", "Li0/l0;", "e", "i", "(Li0/l0;)V", "J", "h", "l", "(J)V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: k0.a$a, reason: collision with other inner class name and from toString */
    public static final /* data */ class DrawParams {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private U0.d density;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private t layoutDirection;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private InterfaceC3586l0 canvas;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private long size;

        public /* synthetic */ DrawParams(U0.d dVar, t tVar, InterfaceC3586l0 interfaceC3586l0, long j10, C3854k c3854k) {
            this(dVar, tVar, interfaceC3586l0, j10);
        }

        /* renamed from: a, reason: from getter */
        public final U0.d getDensity() {
            return this.density;
        }

        /* renamed from: b, reason: from getter */
        public final t getLayoutDirection() {
            return this.layoutDirection;
        }

        /* renamed from: c, reason: from getter */
        public final InterfaceC3586l0 getCanvas() {
            return this.canvas;
        }

        /* renamed from: d, reason: from getter */
        public final long getSize() {
            return this.size;
        }

        public final InterfaceC3586l0 e() {
            return this.canvas;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DrawParams)) {
                return false;
            }
            DrawParams drawParams = (DrawParams) other;
            return C3862t.b(this.density, drawParams.density) && this.layoutDirection == drawParams.layoutDirection && C3862t.b(this.canvas, drawParams.canvas) && C3482m.f(this.size, drawParams.size);
        }

        public final U0.d f() {
            return this.density;
        }

        public final t g() {
            return this.layoutDirection;
        }

        public final long h() {
            return this.size;
        }

        public int hashCode() {
            return (((((this.density.hashCode() * 31) + this.layoutDirection.hashCode()) * 31) + this.canvas.hashCode()) * 31) + C3482m.j(this.size);
        }

        public final void i(InterfaceC3586l0 interfaceC3586l0) {
            this.canvas = interfaceC3586l0;
        }

        public final void j(U0.d dVar) {
            this.density = dVar;
        }

        public final void k(t tVar) {
            this.layoutDirection = tVar;
        }

        public final void l(long j10) {
            this.size = j10;
        }

        public String toString() {
            return "DrawParams(density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", canvas=" + this.canvas + ", size=" + ((Object) C3482m.l(this.size)) + ')';
        }

        private DrawParams(U0.d dVar, t tVar, InterfaceC3586l0 interfaceC3586l0, long j10) {
            this.density = dVar;
            this.layoutDirection = tVar;
            this.canvas = interfaceC3586l0;
            this.size = j10;
        }

        public /* synthetic */ DrawParams(U0.d dVar, t tVar, InterfaceC3586l0 interfaceC3586l0, long j10, int i10, C3854k c3854k) {
            this((i10 & 1) != 0 ? e.a() : dVar, (i10 & 2) != 0 ? t.Ltr : tVar, (i10 & 4) != 0 ? new i() : interfaceC3586l0, (i10 & 8) != 0 ? C3482m.INSTANCE.b() : j10, null);
        }
    }

    /* compiled from: CanvasDrawScope.kt */
    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00178V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010!\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u001d8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b\t\u0010 R$\u0010'\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"k0/a$b", "Lk0/d;", "Lk0/h;", "a", "Lk0/h;", "D", "()Lk0/h;", "transform", "Ll0/c;", "b", "Ll0/c;", "F", "()Ll0/c;", "I", "(Ll0/c;)V", "graphicsLayer", "Li0/l0;", "value", "G", "()Li0/l0;", "H", "(Li0/l0;)V", "canvas", "Lh0/m;", "C", "()J", "E", "(J)V", "size", "LU0/t;", "getLayoutDirection", "()LU0/t;", "(LU0/t;)V", "layoutDirection", "LU0/d;", "getDensity", "()LU0/d;", "c", "(LU0/d;)V", "density", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: k0.a$b */
    public static final class b implements d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final h transform = C3782b.b(this);

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private C3870c graphicsLayer;

        b() {
        }

        @Override // k0.d
        public long C() {
            return C3781a.this.getDrawParams().h();
        }

        @Override // k0.d
        /* renamed from: D, reason: from getter */
        public h getTransform() {
            return this.transform;
        }

        @Override // k0.d
        public void E(long j10) {
            C3781a.this.getDrawParams().l(j10);
        }

        @Override // k0.d
        /* renamed from: F, reason: from getter */
        public C3870c getGraphicsLayer() {
            return this.graphicsLayer;
        }

        @Override // k0.d
        public InterfaceC3586l0 G() {
            return C3781a.this.getDrawParams().e();
        }

        @Override // k0.d
        public void H(InterfaceC3586l0 interfaceC3586l0) {
            C3781a.this.getDrawParams().i(interfaceC3586l0);
        }

        @Override // k0.d
        public void I(C3870c c3870c) {
            this.graphicsLayer = c3870c;
        }

        @Override // k0.d
        public void b(t tVar) {
            C3781a.this.getDrawParams().k(tVar);
        }

        @Override // k0.d
        public void c(U0.d dVar) {
            C3781a.this.getDrawParams().j(dVar);
        }

        @Override // k0.d
        public U0.d getDensity() {
            return C3781a.this.getDrawParams().f();
        }

        @Override // k0.d
        public t getLayoutDirection() {
            return C3781a.this.getDrawParams().g();
        }
    }

    private final P0 F(g drawStyle) {
        if (C3862t.b(drawStyle, j.f43725a)) {
            return u();
        }
        if (!(drawStyle instanceof Stroke)) {
            throw new NoWhenBranchMatchedException();
        }
        P0 p0Z = z();
        Stroke kVar = (Stroke) drawStyle;
        if (p0Z.x() != kVar.getWidth()) {
            p0Z.w(kVar.getWidth());
        }
        if (!e1.e(p0Z.q(), kVar.getCap())) {
            p0Z.h(kVar.getCap());
        }
        if (p0Z.j() != kVar.getMiter()) {
            p0Z.n(kVar.getMiter());
        }
        if (!f1.e(p0Z.f(), kVar.getJoin())) {
            p0Z.r(kVar.getJoin());
        }
        if (!C3862t.b(p0Z.getPathEffect(), kVar.getPathEffect())) {
            p0Z.v(kVar.getPathEffect());
        }
        return p0Z;
    }

    private final P0 b(long color, g style, float alpha, C3604u0 colorFilter, int blendMode, int filterQuality) {
        P0 p0F = F(style);
        long jT = t(color, alpha);
        if (!C3602t0.m(p0F.e(), jT)) {
            p0F.t(jT);
        }
        if (p0F.getInternalShader() != null) {
            p0F.l(null);
        }
        if (!C3862t.b(p0F.getInternalColorFilter(), colorFilter)) {
            p0F.g(colorFilter);
        }
        if (!C3566b0.E(p0F.get_blendMode(), blendMode)) {
            p0F.i(blendMode);
        }
        if (!C0.d(p0F.p(), filterQuality)) {
            p0F.o(filterQuality);
        }
        return p0F;
    }

    static /* synthetic */ P0 d(C3781a c3781a, long j10, g gVar, float f10, C3604u0 c3604u0, int i10, int i11, int i12, Object obj) {
        return c3781a.b(j10, gVar, f10, c3604u0, i10, (i12 & 32) != 0 ? f.INSTANCE.b() : i11);
    }

    private final P0 o(AbstractC3582j0 brush, g style, float alpha, C3604u0 colorFilter, int blendMode, int filterQuality) {
        P0 p0F = F(style);
        if (brush != null) {
            brush.a(C(), p0F, alpha);
        } else {
            if (p0F.getInternalShader() != null) {
                p0F.l(null);
            }
            long jE = p0F.e();
            C3602t0.Companion companion = C3602t0.INSTANCE;
            if (!C3602t0.m(jE, companion.a())) {
                p0F.t(companion.a());
            }
            if (p0F.d() != alpha) {
                p0F.c(alpha);
            }
        }
        if (!C3862t.b(p0F.getInternalColorFilter(), colorFilter)) {
            p0F.g(colorFilter);
        }
        if (!C3566b0.E(p0F.get_blendMode(), blendMode)) {
            p0F.i(blendMode);
        }
        if (!C0.d(p0F.p(), filterQuality)) {
            p0F.o(filterQuality);
        }
        return p0F;
    }

    static /* synthetic */ P0 q(C3781a c3781a, AbstractC3582j0 abstractC3582j0, g gVar, float f10, C3604u0 c3604u0, int i10, int i11, int i12, Object obj) {
        if ((i12 & 32) != 0) {
            i11 = f.INSTANCE.b();
        }
        return c3781a.o(abstractC3582j0, gVar, f10, c3604u0, i10, i11);
    }

    private final long t(long j10, float f10) {
        return f10 == 1.0f ? j10 : C3602t0.k(j10, C3602t0.n(j10) * f10, 0.0f, 0.0f, 0.0f, 14, null);
    }

    private final P0 u() {
        P0 p02 = this.fillPaint;
        if (p02 != null) {
            return p02;
        }
        P0 p0A = C3555S.a();
        p0A.s(Q0.INSTANCE.a());
        this.fillPaint = p0A;
        return p0A;
    }

    private final P0 z() {
        P0 p02 = this.strokePaint;
        if (p02 != null) {
            return p02;
        }
        P0 p0A = C3555S.a();
        p0A.s(Q0.INSTANCE.b());
        this.strokePaint = p0A;
        return p0A;
    }

    @Override // k0.f
    public void N(long color, float radius, long center, float alpha, g style, C3604u0 colorFilter, int blendMode) {
        this.drawParams.e().n(center, radius, d(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // k0.f
    public void O(R0 path, long color, float alpha, g style, C3604u0 colorFilter, int blendMode) {
        this.drawParams.e().o(path, d(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // k0.f
    public void O0(R0 path, AbstractC3582j0 brush, float alpha, g style, C3604u0 colorFilter, int blendMode) {
        this.drawParams.e().o(path, q(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // U0.l
    /* renamed from: R0 */
    public float getFontScale() {
        return this.drawParams.f().getFontScale();
    }

    @Override // k0.f
    /* renamed from: a1, reason: from getter */
    public d getDrawContext() {
        return this.drawContext;
    }

    @Override // k0.f
    public void d1(AbstractC3582j0 brush, long topLeft, long size, long cornerRadius, float alpha, g style, C3604u0 colorFilter, int blendMode) {
        this.drawParams.e().m(C3476g.m(topLeft), C3476g.n(topLeft), C3476g.m(topLeft) + C3482m.i(size), C3476g.n(topLeft) + C3482m.g(size), C3470a.d(cornerRadius), C3470a.e(cornerRadius), q(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // k0.f
    public void g1(AbstractC3582j0 brush, long topLeft, long size, float alpha, g style, C3604u0 colorFilter, int blendMode) {
        this.drawParams.e().i(C3476g.m(topLeft), C3476g.n(topLeft), C3476g.m(topLeft) + C3482m.i(size), C3476g.n(topLeft) + C3482m.g(size), q(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // U0.d
    public float getDensity() {
        return this.drawParams.f().getDensity();
    }

    @Override // k0.f
    public t getLayoutDirection() {
        return this.drawParams.g();
    }

    @Override // k0.f
    public void h1(long color, long topLeft, long size, long cornerRadius, g style, float alpha, C3604u0 colorFilter, int blendMode) {
        this.drawParams.e().m(C3476g.m(topLeft), C3476g.n(topLeft), C3476g.m(topLeft) + C3482m.i(size), C3476g.n(topLeft) + C3482m.g(size), C3470a.d(cornerRadius), C3470a.e(cornerRadius), d(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // k0.f
    public void q0(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, g style, C3604u0 colorFilter, int blendMode) {
        this.drawParams.e().r(C3476g.m(topLeft), C3476g.n(topLeft), C3476g.m(topLeft) + C3482m.i(size), C3476g.n(topLeft) + C3482m.g(size), startAngle, sweepAngle, useCenter, d(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    /* renamed from: r, reason: from getter */
    public final DrawParams getDrawParams() {
        return this.drawParams;
    }

    @Override // k0.f
    public void x0(long color, long topLeft, long size, float alpha, g style, C3604u0 colorFilter, int blendMode) {
        this.drawParams.e().i(C3476g.m(topLeft), C3476g.n(topLeft), C3476g.m(topLeft) + C3482m.i(size), C3476g.n(topLeft) + C3482m.g(size), d(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // k0.f
    public void x1(H0 image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, g style, C3604u0 colorFilter, int blendMode, int filterQuality) {
        this.drawParams.e().d(image, srcOffset, srcSize, dstOffset, dstSize, o(null, style, alpha, colorFilter, blendMode, filterQuality));
    }
}
