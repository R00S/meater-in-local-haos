package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.WrapContentElement;
import androidx.compose.ui.platform.C2037q0;
import androidx.compose.ui.platform.C2040s0;
import b0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: Size.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u001e\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001e\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u001e\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0004\u001a&\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a*\u0010\r\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\n\u001a>\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001e\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0004\u001a\u001d\u0010\u0017\u001a\u00020\u0000*\u00020\u00002\b\b\u0003\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0004\u001a\u001d\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\b\b\u0003\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0004\u001a\u001d\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\b\b\u0003\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0019\u0010\u0004\u001a'\u0010\u001e\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a'\u0010!\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020 2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b!\u0010\"\u001a'\u0010$\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020#2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b$\u0010%\u001a*\u0010&\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010\n\"\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010(\"\u0014\u0010+\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010(\"\u0014\u0010,\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010(\"\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/\"\u0014\u00101\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010/\"\u0014\u00103\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010/\"\u0014\u00104\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010/\"\u0014\u00106\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010/\"\u0014\u00107\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00068"}, d2 = {"Lb0/i;", "LU0/h;", "width", "q", "(Lb0/i;F)Lb0/i;", "height", "i", "size", "m", "n", "(Lb0/i;FF)Lb0/i;", "min", "max", "j", "minWidth", "minHeight", "maxWidth", "maxHeight", "o", "(Lb0/i;FFFF)Lb0/i;", "l", "", "fraction", "g", "c", "e", "Lb0/c$b;", "align", "", "unbounded", "v", "(Lb0/i;Lb0/c$b;Z)Lb0/i;", "Lb0/c$c;", "r", "(Lb0/i;Lb0/c$c;Z)Lb0/i;", "Lb0/c;", "t", "(Lb0/i;Lb0/c;Z)Lb0/i;", "a", "Landroidx/compose/foundation/layout/FillElement;", "Landroidx/compose/foundation/layout/FillElement;", "FillWholeMaxWidth", "b", "FillWholeMaxHeight", "FillWholeMaxSize", "Landroidx/compose/foundation/layout/WrapContentElement;", "d", "Landroidx/compose/foundation/layout/WrapContentElement;", "WrapContentWidthCenter", "WrapContentWidthStart", "f", "WrapContentHeightCenter", "WrapContentHeightTop", "h", "WrapContentSizeCenter", "WrapContentSizeTopStart", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private static final FillElement f22301a;

    /* renamed from: b, reason: collision with root package name */
    private static final FillElement f22302b;

    /* renamed from: c, reason: collision with root package name */
    private static final FillElement f22303c;

    /* renamed from: d, reason: collision with root package name */
    private static final WrapContentElement f22304d;

    /* renamed from: e, reason: collision with root package name */
    private static final WrapContentElement f22305e;

    /* renamed from: f, reason: collision with root package name */
    private static final WrapContentElement f22306f;

    /* renamed from: g, reason: collision with root package name */
    private static final WrapContentElement f22307g;

    /* renamed from: h, reason: collision with root package name */
    private static final WrapContentElement f22308h;

    /* renamed from: i, reason: collision with root package name */
    private static final WrapContentElement f22309i;

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/s0;", "Loa/F;", "a", "(Landroidx/compose/ui/platform/s0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class a extends AbstractC3864v implements Ba.l<C2040s0, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ float f22310B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10) {
            super(1);
            this.f22310B = f10;
        }

        public final void a(C2040s0 c2040s0) {
            c2040s0.b("height");
            c2040s0.c(U0.h.p(this.f22310B));
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C2040s0 c2040s0) {
            a(c2040s0);
            return C4153F.f46609a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/s0;", "Loa/F;", "a", "(Landroidx/compose/ui/platform/s0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class b extends AbstractC3864v implements Ba.l<C2040s0, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ float f22311B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ float f22312C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f10, float f11) {
            super(1);
            this.f22311B = f10;
            this.f22312C = f11;
        }

        public final void a(C2040s0 c2040s0) {
            c2040s0.b("heightIn");
            c2040s0.getProperties().b("min", U0.h.p(this.f22311B));
            c2040s0.getProperties().b("max", U0.h.p(this.f22312C));
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C2040s0 c2040s0) {
            a(c2040s0);
            return C4153F.f46609a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/s0;", "Loa/F;", "a", "(Landroidx/compose/ui/platform/s0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class c extends AbstractC3864v implements Ba.l<C2040s0, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ float f22313B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f10) {
            super(1);
            this.f22313B = f10;
        }

        public final void a(C2040s0 c2040s0) {
            c2040s0.b("requiredHeight");
            c2040s0.c(U0.h.p(this.f22313B));
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C2040s0 c2040s0) {
            a(c2040s0);
            return C4153F.f46609a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/s0;", "Loa/F;", "a", "(Landroidx/compose/ui/platform/s0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class d extends AbstractC3864v implements Ba.l<C2040s0, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ float f22314B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(float f10) {
            super(1);
            this.f22314B = f10;
        }

        public final void a(C2040s0 c2040s0) {
            c2040s0.b("size");
            c2040s0.c(U0.h.p(this.f22314B));
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C2040s0 c2040s0) {
            a(c2040s0);
            return C4153F.f46609a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/s0;", "Loa/F;", "a", "(Landroidx/compose/ui/platform/s0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class e extends AbstractC3864v implements Ba.l<C2040s0, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ float f22315B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ float f22316C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(float f10, float f11) {
            super(1);
            this.f22315B = f10;
            this.f22316C = f11;
        }

        public final void a(C2040s0 c2040s0) {
            c2040s0.b("size");
            c2040s0.getProperties().b("width", U0.h.p(this.f22315B));
            c2040s0.getProperties().b("height", U0.h.p(this.f22316C));
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C2040s0 c2040s0) {
            a(c2040s0);
            return C4153F.f46609a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/s0;", "Loa/F;", "a", "(Landroidx/compose/ui/platform/s0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class f extends AbstractC3864v implements Ba.l<C2040s0, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ float f22317B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ float f22318C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ float f22319D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ float f22320E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(float f10, float f11, float f12, float f13) {
            super(1);
            this.f22317B = f10;
            this.f22318C = f11;
            this.f22319D = f12;
            this.f22320E = f13;
        }

        public final void a(C2040s0 c2040s0) {
            c2040s0.b("sizeIn");
            c2040s0.getProperties().b("minWidth", U0.h.p(this.f22317B));
            c2040s0.getProperties().b("minHeight", U0.h.p(this.f22318C));
            c2040s0.getProperties().b("maxWidth", U0.h.p(this.f22319D));
            c2040s0.getProperties().b("maxHeight", U0.h.p(this.f22320E));
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C2040s0 c2040s0) {
            a(c2040s0);
            return C4153F.f46609a;
        }
    }

    /* compiled from: InspectableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/s0;", "Loa/F;", "a", "(Landroidx/compose/ui/platform/s0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class g extends AbstractC3864v implements Ba.l<C2040s0, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ float f22321B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(float f10) {
            super(1);
            this.f22321B = f10;
        }

        public final void a(C2040s0 c2040s0) {
            c2040s0.b("width");
            c2040s0.c(U0.h.p(this.f22321B));
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(C2040s0 c2040s0) {
            a(c2040s0);
            return C4153F.f46609a;
        }
    }

    static {
        FillElement.Companion aVar = FillElement.INSTANCE;
        f22301a = aVar.c(1.0f);
        f22302b = aVar.a(1.0f);
        f22303c = aVar.b(1.0f);
        WrapContentElement.Companion aVar2 = WrapContentElement.INSTANCE;
        c.Companion companion = b0.c.INSTANCE;
        f22304d = aVar2.c(companion.g(), false);
        f22305e = aVar2.c(companion.k(), false);
        f22306f = aVar2.a(companion.i(), false);
        f22307g = aVar2.a(companion.l(), false);
        f22308h = aVar2.b(companion.e(), false);
        f22309i = aVar2.b(companion.o(), false);
    }

    public static final b0.i a(b0.i iVar, float f10, float f11) {
        return iVar.e(new UnspecifiedConstraintsElement(f10, f11, null));
    }

    public static /* synthetic */ b0.i b(b0.i iVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = U0.h.INSTANCE.c();
        }
        if ((i10 & 2) != 0) {
            f11 = U0.h.INSTANCE.c();
        }
        return a(iVar, f10, f11);
    }

    public static final b0.i c(b0.i iVar, float f10) {
        return iVar.e(f10 == 1.0f ? f22302b : FillElement.INSTANCE.a(f10));
    }

    public static /* synthetic */ b0.i d(b0.i iVar, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return c(iVar, f10);
    }

    public static final b0.i e(b0.i iVar, float f10) {
        return iVar.e(f10 == 1.0f ? f22303c : FillElement.INSTANCE.b(f10));
    }

    public static /* synthetic */ b0.i f(b0.i iVar, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return e(iVar, f10);
    }

    public static final b0.i g(b0.i iVar, float f10) {
        return iVar.e(f10 == 1.0f ? f22301a : FillElement.INSTANCE.c(f10));
    }

    public static /* synthetic */ b0.i h(b0.i iVar, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 1.0f;
        }
        return g(iVar, f10);
    }

    public static final b0.i i(b0.i iVar, float f10) {
        return iVar.e(new SizeElement(0.0f, f10, 0.0f, f10, true, C2037q0.b() ? new a(f10) : C2037q0.a(), 5, null));
    }

    public static final b0.i j(b0.i iVar, float f10, float f11) {
        return iVar.e(new SizeElement(0.0f, f10, 0.0f, f11, true, C2037q0.b() ? new b(f10, f11) : C2037q0.a(), 5, null));
    }

    public static /* synthetic */ b0.i k(b0.i iVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = U0.h.INSTANCE.c();
        }
        if ((i10 & 2) != 0) {
            f11 = U0.h.INSTANCE.c();
        }
        return j(iVar, f10, f11);
    }

    public static final b0.i l(b0.i iVar, float f10) {
        return iVar.e(new SizeElement(0.0f, f10, 0.0f, f10, false, C2037q0.b() ? new c(f10) : C2037q0.a(), 5, null));
    }

    public static final b0.i m(b0.i iVar, float f10) {
        return iVar.e(new SizeElement(f10, f10, f10, f10, true, C2037q0.b() ? new d(f10) : C2037q0.a(), null));
    }

    public static final b0.i n(b0.i iVar, float f10, float f11) {
        return iVar.e(new SizeElement(f10, f11, f10, f11, true, C2037q0.b() ? new e(f10, f11) : C2037q0.a(), null));
    }

    public static final b0.i o(b0.i iVar, float f10, float f11, float f12, float f13) {
        return iVar.e(new SizeElement(f10, f11, f12, f13, true, C2037q0.b() ? new f(f10, f11, f12, f13) : C2037q0.a(), null));
    }

    public static /* synthetic */ b0.i p(b0.i iVar, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = U0.h.INSTANCE.c();
        }
        if ((i10 & 2) != 0) {
            f11 = U0.h.INSTANCE.c();
        }
        if ((i10 & 4) != 0) {
            f12 = U0.h.INSTANCE.c();
        }
        if ((i10 & 8) != 0) {
            f13 = U0.h.INSTANCE.c();
        }
        return o(iVar, f10, f11, f12, f13);
    }

    public static final b0.i q(b0.i iVar, float f10) {
        return iVar.e(new SizeElement(f10, 0.0f, f10, 0.0f, true, C2037q0.b() ? new g(f10) : C2037q0.a(), 10, null));
    }

    public static final b0.i r(b0.i iVar, c.InterfaceC0420c interfaceC0420c, boolean z10) {
        c.Companion companion = b0.c.INSTANCE;
        return iVar.e((!C3862t.b(interfaceC0420c, companion.i()) || z10) ? (!C3862t.b(interfaceC0420c, companion.l()) || z10) ? WrapContentElement.INSTANCE.a(interfaceC0420c, z10) : f22307g : f22306f);
    }

    public static /* synthetic */ b0.i s(b0.i iVar, c.InterfaceC0420c interfaceC0420c, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC0420c = b0.c.INSTANCE.i();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return r(iVar, interfaceC0420c, z10);
    }

    public static final b0.i t(b0.i iVar, b0.c cVar, boolean z10) {
        c.Companion companion = b0.c.INSTANCE;
        return iVar.e((!C3862t.b(cVar, companion.e()) || z10) ? (!C3862t.b(cVar, companion.o()) || z10) ? WrapContentElement.INSTANCE.b(cVar, z10) : f22309i : f22308h);
    }

    public static /* synthetic */ b0.i u(b0.i iVar, b0.c cVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cVar = b0.c.INSTANCE.e();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return t(iVar, cVar, z10);
    }

    public static final b0.i v(b0.i iVar, c.b bVar, boolean z10) {
        c.Companion companion = b0.c.INSTANCE;
        return iVar.e((!C3862t.b(bVar, companion.g()) || z10) ? (!C3862t.b(bVar, companion.k()) || z10) ? WrapContentElement.INSTANCE.c(bVar, z10) : f22305e : f22304d);
    }

    public static /* synthetic */ b0.i w(b0.i iVar, c.b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bVar = b0.c.INSTANCE.g();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return v(iVar, bVar, z10);
    }
}
