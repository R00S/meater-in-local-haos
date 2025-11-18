package o0;

import U0.s;
import U0.t;
import i0.C3566b0;
import i0.C3590n0;
import i0.C3602t0;
import i0.C3604u0;
import i0.H0;
import i0.I0;
import i0.InterfaceC3586l0;
import i0.J0;
import k0.C3781a;
import kotlin.Metadata;
import oa.C4153F;
import x0.C5047a;

/* compiled from: DrawCache.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007JD\u0010\u0012\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0010ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aR*\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010\u001c\u0012\u0004\b!\u0010\u0003\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010&R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010(R\u001c\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b)\u0010*R\u001c\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, d2 = {"Lo0/a;", "", "<init>", "()V", "Lk0/f;", "Loa/F;", "a", "(Lk0/f;)V", "Li0/I0;", "config", "LU0/r;", "size", "LU0/d;", "density", "LU0/t;", "layoutDirection", "Lkotlin/Function1;", "block", "b", "(IJLU0/d;LU0/t;LBa/l;)V", "target", "", "alpha", "Li0/u0;", "colorFilter", "c", "(Lk0/f;FLi0/u0;)V", "Li0/H0;", "Li0/H0;", "d", "()Li0/H0;", "setMCachedImage", "(Li0/H0;)V", "getMCachedImage$annotations", "mCachedImage", "Li0/l0;", "Li0/l0;", "cachedCanvas", "LU0/d;", "scopeDensity", "LU0/t;", "e", "J", "f", "I", "Lk0/a;", "g", "Lk0/a;", "cacheScope", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: o0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4080a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private H0 mCachedImage;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private InterfaceC3586l0 cachedCanvas;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private U0.d scopeDensity;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private t layoutDirection = t.Ltr;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long size = U0.r.INSTANCE.a();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int config = I0.INSTANCE.b();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final C3781a cacheScope = new C3781a();

    private final void a(k0.f fVar) {
        k0.f.T0(fVar, C3602t0.INSTANCE.a(), 0L, 0L, 0.0f, null, null, C3566b0.INSTANCE.a(), 62, null);
    }

    public final void b(int config, long size, U0.d density, t layoutDirection, Ba.l<? super k0.f, C4153F> block) {
        this.scopeDensity = density;
        this.layoutDirection = layoutDirection;
        H0 h0B = this.mCachedImage;
        InterfaceC3586l0 interfaceC3586l0A = this.cachedCanvas;
        if (h0B == null || interfaceC3586l0A == null || U0.r.g(size) > h0B.b() || U0.r.f(size) > h0B.a() || !I0.g(this.config, config)) {
            h0B = J0.b(U0.r.g(size), U0.r.f(size), config, false, null, 24, null);
            interfaceC3586l0A = C3590n0.a(h0B);
            this.mCachedImage = h0B;
            this.cachedCanvas = interfaceC3586l0A;
            this.config = config;
        }
        this.size = size;
        C3781a c3781a = this.cacheScope;
        long jD = s.d(size);
        C3781a.DrawParams drawParams = c3781a.getDrawParams();
        U0.d density2 = drawParams.getDensity();
        t layoutDirection2 = drawParams.getLayoutDirection();
        InterfaceC3586l0 canvas = drawParams.getCanvas();
        long size2 = drawParams.getSize();
        C3781a.DrawParams drawParams2 = c3781a.getDrawParams();
        drawParams2.j(density);
        drawParams2.k(layoutDirection);
        drawParams2.i(interfaceC3586l0A);
        drawParams2.l(jD);
        interfaceC3586l0A.h();
        a(c3781a);
        block.invoke(c3781a);
        interfaceC3586l0A.t();
        C3781a.DrawParams drawParams3 = c3781a.getDrawParams();
        drawParams3.j(density2);
        drawParams3.k(layoutDirection2);
        drawParams3.i(canvas);
        drawParams3.l(size2);
        h0B.c();
    }

    public final void c(k0.f target, float alpha, C3604u0 colorFilter) {
        H0 h02 = this.mCachedImage;
        if (!(h02 != null)) {
            C5047a.b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        k0.f.e0(target, h02, 0L, this.size, 0L, 0L, alpha, null, colorFilter, 0, 0, 858, null);
    }

    /* renamed from: d, reason: from getter */
    public final H0 getMCachedImage() {
        return this.mCachedImage;
    }
}
