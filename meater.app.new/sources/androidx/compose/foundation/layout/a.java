package androidx.compose.foundation.layout;

import U0.h;
import androidx.compose.ui.platform.C2037q0;
import androidx.compose.ui.platform.C2040s0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;
import y0.AbstractC5096a;
import y0.C5097b;
import y0.C5111p;
import y0.H;
import y0.J;
import y0.K;
import y0.Z;

/* compiled from: AlignmentLine.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a2\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a*\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a>\u0010\u0012\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\"\u0018\u0010\u0017\u001a\u00020\u0014*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Lb0/i;", "Ly0/a;", "alignmentLine", "LU0/h;", "before", "after", "e", "(Lb0/i;Ly0/a;FF)Lb0/i;", "top", "bottom", "g", "(Lb0/i;FF)Lb0/i;", "Ly0/K;", "Ly0/H;", "measurable", "LU0/b;", "constraints", "Ly0/J;", "c", "(Ly0/K;Ly0/a;FFLy0/H;J)Ly0/J;", "", "d", "(Ly0/a;)Z", "horizontal", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* compiled from: AlignmentLine.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.layout.a$a, reason: collision with other inner class name */
    static final class C0317a extends AbstractC3864v implements Ba.l<Z.a, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ AbstractC5096a f22217B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ float f22218C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ int f22219D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f22220E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f22221F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ Z f22222G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ int f22223H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0317a(AbstractC5096a abstractC5096a, float f10, int i10, int i11, int i12, Z z10, int i13) {
            super(1);
            this.f22217B = abstractC5096a;
            this.f22218C = f10;
            this.f22219D = i10;
            this.f22220E = i11;
            this.f22221F = i12;
            this.f22222G = z10;
            this.f22223H = i13;
        }

        public final void a(Z.a aVar) {
            int width;
            if (a.d(this.f22217B)) {
                width = 0;
            } else {
                width = !U0.h.w(this.f22218C, U0.h.INSTANCE.c()) ? this.f22219D : (this.f22220E - this.f22221F) - this.f22222G.getWidth();
            }
            Z.a.l(aVar, this.f22222G, width, a.d(this.f22217B) ? !U0.h.w(this.f22218C, U0.h.INSTANCE.c()) ? this.f22219D : (this.f22223H - this.f22221F) - this.f22222G.getHeight() : 0, 0.0f, 4, null);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
            a(aVar);
            return C4153F.f46609a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/s0;", "Loa/F;", "a", "(Landroidx/compose/ui/platform/s0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class b extends AbstractC3864v implements Ba.l<C2040s0, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ AbstractC5096a f22224B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ float f22225C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ float f22226D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC5096a abstractC5096a, float f10, float f11) {
            super(1);
            this.f22224B = abstractC5096a;
            this.f22225C = f10;
            this.f22226D = f11;
        }

        public final void a(C2040s0 c2040s0) {
            c2040s0.b("paddingFrom");
            c2040s0.getProperties().b("alignmentLine", this.f22224B);
            c2040s0.getProperties().b("before", U0.h.p(this.f22225C));
            c2040s0.getProperties().b("after", U0.h.p(this.f22226D));
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C2040s0 c2040s0) {
            a(c2040s0);
            return C4153F.f46609a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J c(K k10, AbstractC5096a abstractC5096a, float f10, float f11, H h10, long j10) {
        Z zT = h10.T(d(abstractC5096a) ? U0.b.d(j10, 0, 0, 0, 0, 11, null) : U0.b.d(j10, 0, 0, 0, 0, 14, null));
        int iJ = zT.J(abstractC5096a);
        if (iJ == Integer.MIN_VALUE) {
            iJ = 0;
        }
        int height = d(abstractC5096a) ? zT.getHeight() : zT.getWidth();
        int iK = d(abstractC5096a) ? U0.b.k(j10) : U0.b.l(j10);
        h.Companion companion = U0.h.INSTANCE;
        int i10 = iK - height;
        int iK2 = Ha.g.k((!U0.h.w(f10, companion.c()) ? k10.i1(f10) : 0) - iJ, 0, i10);
        int iK3 = Ha.g.k(((!U0.h.w(f11, companion.c()) ? k10.i1(f11) : 0) - height) + iJ, 0, i10 - iK2);
        int width = d(abstractC5096a) ? zT.getWidth() : Math.max(zT.getWidth() + iK2 + iK3, U0.b.n(j10));
        int iMax = d(abstractC5096a) ? Math.max(zT.getHeight() + iK2 + iK3, U0.b.m(j10)) : zT.getHeight();
        return K.E1(k10, width, iMax, null, new C0317a(abstractC5096a, f10, iK2, width, iK3, zT, iMax), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(AbstractC5096a abstractC5096a) {
        return abstractC5096a instanceof C5111p;
    }

    public static final b0.i e(b0.i iVar, AbstractC5096a abstractC5096a, float f10, float f11) {
        return iVar.e(new AlignmentLineOffsetDpElement(abstractC5096a, f10, f11, C2037q0.b() ? new b(abstractC5096a, f10, f11) : C2037q0.a(), null));
    }

    public static /* synthetic */ b0.i f(b0.i iVar, AbstractC5096a abstractC5096a, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = U0.h.INSTANCE.c();
        }
        if ((i10 & 4) != 0) {
            f11 = U0.h.INSTANCE.c();
        }
        return e(iVar, abstractC5096a, f10, f11);
    }

    public static final b0.i g(b0.i iVar, float f10, float f11) {
        h.Companion companion = U0.h.INSTANCE;
        return iVar.e(!U0.h.w(f10, companion.c()) ? f(b0.i.INSTANCE, C5097b.a(), f10, 0.0f, 4, null) : b0.i.INSTANCE).e(!U0.h.w(f11, companion.c()) ? f(b0.i.INSTANCE, C5097b.b(), 0.0f, f11, 2, null) : b0.i.INSTANCE);
    }
}
