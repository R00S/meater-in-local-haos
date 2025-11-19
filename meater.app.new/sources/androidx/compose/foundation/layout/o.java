package androidx.compose.foundation.layout;

import A.N;
import A.PaddingValues;
import androidx.compose.ui.platform.C2040s0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;

/* compiled from: Padding.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a>\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001e\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\u0015\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0017\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0017\u0010\u0016\u001a\u001a\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a&\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a:\u0010\u001c\u001a\u00020\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Lb0/i;", "LU0/h;", "start", "top", "end", "bottom", "l", "(Lb0/i;FFFF)Lb0/i;", "horizontal", "vertical", "j", "(Lb0/i;FF)Lb0/i;", "all", "i", "(Lb0/i;F)Lb0/i;", "LA/N;", "paddingValues", "h", "(Lb0/i;LA/N;)Lb0/i;", "LU0/t;", "layoutDirection", "g", "(LA/N;LU0/t;)F", "f", "a", "(F)LA/N;", "b", "(FF)LA/N;", "d", "(FFFF)LA/N;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o {

    /* compiled from: Padding.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/s0;", "Loa/F;", "a", "(Landroidx/compose/ui/platform/s0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.l<C2040s0, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ float f22281B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ float f22282C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ float f22283D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ float f22284E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f10, float f11, float f12, float f13) {
            super(1);
            this.f22281B = f10;
            this.f22282C = f11;
            this.f22283D = f12;
            this.f22284E = f13;
        }

        public final void a(C2040s0 c2040s0) {
            c2040s0.b("padding");
            c2040s0.getProperties().b("start", U0.h.p(this.f22281B));
            c2040s0.getProperties().b("top", U0.h.p(this.f22282C));
            c2040s0.getProperties().b("end", U0.h.p(this.f22283D));
            c2040s0.getProperties().b("bottom", U0.h.p(this.f22284E));
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C2040s0 c2040s0) {
            a(c2040s0);
            return C4153F.f46609a;
        }
    }

    /* compiled from: Padding.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/s0;", "Loa/F;", "a", "(Landroidx/compose/ui/platform/s0;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.l<C2040s0, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ float f22285B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ float f22286C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(float f10, float f11) {
            super(1);
            this.f22285B = f10;
            this.f22286C = f11;
        }

        public final void a(C2040s0 c2040s0) {
            c2040s0.b("padding");
            c2040s0.getProperties().b("horizontal", U0.h.p(this.f22285B));
            c2040s0.getProperties().b("vertical", U0.h.p(this.f22286C));
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C2040s0 c2040s0) {
            a(c2040s0);
            return C4153F.f46609a;
        }
    }

    /* compiled from: Padding.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/s0;", "Loa/F;", "a", "(Landroidx/compose/ui/platform/s0;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends AbstractC3864v implements Ba.l<C2040s0, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ float f22287B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(float f10) {
            super(1);
            this.f22287B = f10;
        }

        public final void a(C2040s0 c2040s0) {
            c2040s0.b("padding");
            c2040s0.c(U0.h.p(this.f22287B));
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C2040s0 c2040s0) {
            a(c2040s0);
            return C4153F.f46609a;
        }
    }

    /* compiled from: Padding.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/s0;", "Loa/F;", "a", "(Landroidx/compose/ui/platform/s0;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends AbstractC3864v implements Ba.l<C2040s0, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ N f22288B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(N n10) {
            super(1);
            this.f22288B = n10;
        }

        public final void a(C2040s0 c2040s0) {
            c2040s0.b("padding");
            c2040s0.getProperties().b("paddingValues", this.f22288B);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C2040s0 c2040s0) {
            a(c2040s0);
            return C4153F.f46609a;
        }
    }

    public static final N a(float f10) {
        return new PaddingValues(f10, f10, f10, f10, null);
    }

    public static final N b(float f10, float f11) {
        return new PaddingValues(f10, f11, f10, f11, null);
    }

    public static /* synthetic */ N c(float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = U0.h.u(0);
        }
        if ((i10 & 2) != 0) {
            f11 = U0.h.u(0);
        }
        return b(f10, f11);
    }

    public static final N d(float f10, float f11, float f12, float f13) {
        return new PaddingValues(f10, f11, f12, f13, null);
    }

    public static /* synthetic */ N e(float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = U0.h.u(0);
        }
        if ((i10 & 2) != 0) {
            f11 = U0.h.u(0);
        }
        if ((i10 & 4) != 0) {
            f12 = U0.h.u(0);
        }
        if ((i10 & 8) != 0) {
            f13 = U0.h.u(0);
        }
        return d(f10, f11, f12, f13);
    }

    public static final float f(N n10, U0.t tVar) {
        return tVar == U0.t.Ltr ? n10.c(tVar) : n10.a(tVar);
    }

    public static final float g(N n10, U0.t tVar) {
        return tVar == U0.t.Ltr ? n10.a(tVar) : n10.c(tVar);
    }

    public static final b0.i h(b0.i iVar, N n10) {
        return iVar.e(new PaddingValuesElement(n10, new d(n10)));
    }

    public static final b0.i i(b0.i iVar, float f10) {
        return iVar.e(new PaddingElement(f10, f10, f10, f10, true, new c(f10), null));
    }

    public static final b0.i j(b0.i iVar, float f10, float f11) {
        return iVar.e(new PaddingElement(f10, f11, f10, f11, true, new b(f10, f11), null));
    }

    public static /* synthetic */ b0.i k(b0.i iVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = U0.h.u(0);
        }
        if ((i10 & 2) != 0) {
            f11 = U0.h.u(0);
        }
        return j(iVar, f10, f11);
    }

    public static final b0.i l(b0.i iVar, float f10, float f11, float f12, float f13) {
        return iVar.e(new PaddingElement(f10, f11, f12, f13, true, new a(f10, f11, f12, f13), null));
    }

    public static /* synthetic */ b0.i m(b0.i iVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = U0.h.u(0);
        }
        if ((i10 & 2) != 0) {
            f11 = U0.h.u(0);
        }
        if ((i10 & 4) != 0) {
            f12 = U0.h.u(0);
        }
        if ((i10 & 8) != 0) {
            f13 = U0.h.u(0);
        }
        return l(iVar, f10, f11, f12, f13);
    }
}
