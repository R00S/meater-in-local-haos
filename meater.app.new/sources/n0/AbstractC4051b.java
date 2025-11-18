package n0;

import Ba.l;
import U0.t;
import h0.C3476g;
import h0.C3478i;
import h0.C3479j;
import h0.C3482m;
import h0.C3483n;
import i0.C3555S;
import i0.C3604u0;
import i0.InterfaceC3586l0;
import i0.P0;
import k0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: Painter.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\t*\u00020\u0014H$¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00172\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ2\u0010!\u001a\u00020\t*\u00020\u00142\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010#R\u0016\u0010&\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010%R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010'R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010(R\u0016\u0010\u001c\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010)R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010+R\u001a\u0010/\u001a\u00020\u001f8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b-\u0010.\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, d2 = {"Ln0/b;", "", "<init>", "()V", "Li0/P0;", "i", "()Li0/P0;", "Li0/u0;", "colorFilter", "Loa/F;", "e", "(Li0/u0;)V", "", "alpha", "d", "(F)V", "LU0/t;", "rtl", "f", "(LU0/t;)V", "Lk0/f;", "j", "(Lk0/f;)V", "", "a", "(F)Z", "b", "(Li0/u0;)Z", "layoutDirection", "c", "(LU0/t;)Z", "Lh0/m;", "size", "g", "(Lk0/f;JFLi0/u0;)V", "Li0/P0;", "layerPaint", "Z", "useLayer", "Li0/u0;", "F", "LU0/t;", "Lkotlin/Function1;", "LBa/l;", "drawLambda", "h", "()J", "intrinsicSize", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: n0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4051b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private P0 layerPaint;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean useLayer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private C3604u0 colorFilter;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float alpha = 1.0f;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private t layoutDirection = t.Ltr;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final l<f, C4153F> drawLambda = new a();

    /* compiled from: Painter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk0/f;", "Loa/F;", "a", "(Lk0/f;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: n0.b$a */
    static final class a extends AbstractC3864v implements l<f, C4153F> {
        a() {
            super(1);
        }

        public final void a(f fVar) {
            AbstractC4051b.this.j(fVar);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(f fVar) {
            a(fVar);
            return C4153F.f46609a;
        }
    }

    private final void d(float alpha) {
        if (this.alpha == alpha) {
            return;
        }
        if (!a(alpha)) {
            if (alpha == 1.0f) {
                P0 p02 = this.layerPaint;
                if (p02 != null) {
                    p02.c(alpha);
                }
                this.useLayer = false;
            } else {
                i().c(alpha);
                this.useLayer = true;
            }
        }
        this.alpha = alpha;
    }

    private final void e(C3604u0 colorFilter) {
        if (C3862t.b(this.colorFilter, colorFilter)) {
            return;
        }
        if (!b(colorFilter)) {
            if (colorFilter == null) {
                P0 p02 = this.layerPaint;
                if (p02 != null) {
                    p02.g(null);
                }
                this.useLayer = false;
            } else {
                i().g(colorFilter);
                this.useLayer = true;
            }
        }
        this.colorFilter = colorFilter;
    }

    private final void f(t rtl) {
        if (this.layoutDirection != rtl) {
            c(rtl);
            this.layoutDirection = rtl;
        }
    }

    private final P0 i() {
        P0 p02 = this.layerPaint;
        if (p02 != null) {
            return p02;
        }
        P0 p0A = C3555S.a();
        this.layerPaint = p0A;
        return p0A;
    }

    protected abstract boolean a(float alpha);

    protected abstract boolean b(C3604u0 colorFilter);

    protected boolean c(t layoutDirection) {
        return false;
    }

    public final void g(f fVar, long j10, float f10, C3604u0 c3604u0) {
        d(f10);
        e(c3604u0);
        f(fVar.getLayoutDirection());
        float fI = C3482m.i(fVar.C()) - C3482m.i(j10);
        float fG = C3482m.g(fVar.C()) - C3482m.g(j10);
        fVar.getDrawContext().getTransform().f(0.0f, 0.0f, fI, fG);
        if (f10 > 0.0f) {
            try {
                if (C3482m.i(j10) > 0.0f && C3482m.g(j10) > 0.0f) {
                    if (this.useLayer) {
                        C3478i c3478iA = C3479j.a(C3476g.INSTANCE.c(), C3483n.a(C3482m.i(j10), C3482m.g(j10)));
                        InterfaceC3586l0 interfaceC3586l0G = fVar.getDrawContext().G();
                        try {
                            interfaceC3586l0G.q(c3478iA, i());
                            j(fVar);
                            interfaceC3586l0G.t();
                        } catch (Throwable th) {
                            interfaceC3586l0G.t();
                            throw th;
                        }
                    } else {
                        j(fVar);
                    }
                }
            } catch (Throwable th2) {
                fVar.getDrawContext().getTransform().f(-0.0f, -0.0f, -fI, -fG);
                throw th2;
            }
        }
        fVar.getDrawContext().getTransform().f(-0.0f, -0.0f, -fI, -fG);
    }

    public abstract long h();

    protected abstract void j(f fVar);
}
