package A0;

import androidx.compose.ui.platform.i1;
import kotlin.InterfaceC1578x;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;

/* compiled from: ComposeUiNode.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\ba\u0018\u0000 .2\u00020\u0001:\u0001.R\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u00020\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0013\u001a\u00020\u000e8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0019\u001a\u00020\u00148&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001f\u001a\u00020\u001a8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010%\u001a\u00020 8&@&X¦\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8&@&X§\u000e¢\u0006\u0012\u0012\u0004\b+\u0010,\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006/À\u0006\u0001"}, d2 = {"LA0/g;", "", "Ly0/I;", "getMeasurePolicy", "()Ly0/I;", "f", "(Ly0/I;)V", "measurePolicy", "LU0/t;", "getLayoutDirection", "()LU0/t;", "b", "(LU0/t;)V", "layoutDirection", "LU0/d;", "getDensity", "()LU0/d;", "c", "(LU0/d;)V", "density", "Lb0/i;", "getModifier", "()Lb0/i;", "e", "(Lb0/i;)V", "modifier", "Landroidx/compose/ui/platform/i1;", "getViewConfiguration", "()Landroidx/compose/ui/platform/i1;", "l", "(Landroidx/compose/ui/platform/i1;)V", "viewConfiguration", "LO/x;", "getCompositionLocalMap", "()LO/x;", "j", "(LO/x;)V", "compositionLocalMap", "", "getCompositeKeyHash", "()I", "g", "(I)V", "getCompositeKeyHash$annotations", "()V", "compositeKeyHash", "a", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: A0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0828g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f604a;

    /* compiled from: ComposeUiNode.kt */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR)\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R)\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00100\u000e8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0013R)\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00100\u000e8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0016\u0010\u0013R)\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00100\u000e8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013R)\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00100\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0012\u001a\u0004\b \u0010\u0013R)\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00100\u000e8\u0006¢\u0006\f\n\u0004\b#\u0010\u0012\u001a\u0004\b$\u0010\u0013R2\u0010)\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00100\u000e8GX\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010\u0012\u0012\u0004\b(\u0010\u0003\u001a\u0004\b\u0006\u0010\u0013¨\u0006*"}, d2 = {"LA0/g$a;", "", "<init>", "()V", "Lkotlin/Function0;", "LA0/g;", "b", "LBa/a;", "a", "()LBa/a;", "Constructor", "c", "f", "VirtualConstructor", "Lkotlin/Function2;", "Lb0/i;", "Loa/F;", "d", "LBa/p;", "()LBa/p;", "SetModifier", "LU0/d;", "e", "getSetDensity", "SetDensity", "LO/x;", "SetResolvedCompositionLocals", "Ly0/I;", "g", "SetMeasurePolicy", "LU0/t;", "h", "getSetLayoutDirection", "SetLayoutDirection", "Landroidx/compose/ui/platform/i1;", "i", "getSetViewConfiguration", "SetViewConfiguration", "", "j", "getSetCompositeKeyHash$annotations", "SetCompositeKeyHash", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: A0.g$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f604a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final Ba.a<InterfaceC0828g> Constructor = G.INSTANCE.a();

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final Ba.a<InterfaceC0828g> VirtualConstructor = h.f621B;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final Ba.p<InterfaceC0828g, b0.i, C4153F> SetModifier = e.f618B;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final Ba.p<InterfaceC0828g, U0.d, C4153F> SetDensity = b.f615B;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final Ba.p<InterfaceC0828g, InterfaceC1578x, C4153F> SetResolvedCompositionLocals = f.f619B;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private static final Ba.p<InterfaceC0828g, y0.I, C4153F> SetMeasurePolicy = d.f617B;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private static final Ba.p<InterfaceC0828g, U0.t, C4153F> SetLayoutDirection = c.f616B;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private static final Ba.p<InterfaceC0828g, i1, C4153F> SetViewConfiguration = C0012g.f620B;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private static final Ba.p<InterfaceC0828g, Integer, C4153F> SetCompositeKeyHash = C0011a.f614B;

        /* compiled from: ComposeUiNode.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA0/g;", "", "it", "Loa/F;", "a", "(LA0/g;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: A0.g$a$a, reason: collision with other inner class name */
        static final class C0011a extends AbstractC3864v implements Ba.p<InterfaceC0828g, Integer, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            public static final C0011a f614B = new C0011a();

            C0011a() {
                super(2);
            }

            public final void a(InterfaceC0828g interfaceC0828g, int i10) {
                interfaceC0828g.g(i10);
            }

            @Override // Ba.p
            public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC0828g interfaceC0828g, Integer num) {
                a(interfaceC0828g, num.intValue());
                return C4153F.f46609a;
            }
        }

        /* compiled from: ComposeUiNode.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA0/g;", "LU0/d;", "it", "Loa/F;", "a", "(LA0/g;LU0/d;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: A0.g$a$b */
        static final class b extends AbstractC3864v implements Ba.p<InterfaceC0828g, U0.d, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            public static final b f615B = new b();

            b() {
                super(2);
            }

            public final void a(InterfaceC0828g interfaceC0828g, U0.d dVar) {
                interfaceC0828g.c(dVar);
            }

            @Override // Ba.p
            public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC0828g interfaceC0828g, U0.d dVar) {
                a(interfaceC0828g, dVar);
                return C4153F.f46609a;
            }
        }

        /* compiled from: ComposeUiNode.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA0/g;", "LU0/t;", "it", "Loa/F;", "a", "(LA0/g;LU0/t;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: A0.g$a$c */
        static final class c extends AbstractC3864v implements Ba.p<InterfaceC0828g, U0.t, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            public static final c f616B = new c();

            c() {
                super(2);
            }

            public final void a(InterfaceC0828g interfaceC0828g, U0.t tVar) {
                interfaceC0828g.b(tVar);
            }

            @Override // Ba.p
            public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC0828g interfaceC0828g, U0.t tVar) {
                a(interfaceC0828g, tVar);
                return C4153F.f46609a;
            }
        }

        /* compiled from: ComposeUiNode.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA0/g;", "Ly0/I;", "it", "Loa/F;", "a", "(LA0/g;Ly0/I;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: A0.g$a$d */
        static final class d extends AbstractC3864v implements Ba.p<InterfaceC0828g, y0.I, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            public static final d f617B = new d();

            d() {
                super(2);
            }

            public final void a(InterfaceC0828g interfaceC0828g, y0.I i10) {
                interfaceC0828g.f(i10);
            }

            @Override // Ba.p
            public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC0828g interfaceC0828g, y0.I i10) {
                a(interfaceC0828g, i10);
                return C4153F.f46609a;
            }
        }

        /* compiled from: ComposeUiNode.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA0/g;", "Lb0/i;", "it", "Loa/F;", "a", "(LA0/g;Lb0/i;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: A0.g$a$e */
        static final class e extends AbstractC3864v implements Ba.p<InterfaceC0828g, b0.i, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            public static final e f618B = new e();

            e() {
                super(2);
            }

            public final void a(InterfaceC0828g interfaceC0828g, b0.i iVar) {
                interfaceC0828g.e(iVar);
            }

            @Override // Ba.p
            public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC0828g interfaceC0828g, b0.i iVar) {
                a(interfaceC0828g, iVar);
                return C4153F.f46609a;
            }
        }

        /* compiled from: ComposeUiNode.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA0/g;", "LO/x;", "it", "Loa/F;", "a", "(LA0/g;LO/x;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: A0.g$a$f */
        static final class f extends AbstractC3864v implements Ba.p<InterfaceC0828g, InterfaceC1578x, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            public static final f f619B = new f();

            f() {
                super(2);
            }

            public final void a(InterfaceC0828g interfaceC0828g, InterfaceC1578x interfaceC1578x) {
                interfaceC0828g.j(interfaceC1578x);
            }

            @Override // Ba.p
            public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC0828g interfaceC0828g, InterfaceC1578x interfaceC1578x) {
                a(interfaceC0828g, interfaceC1578x);
                return C4153F.f46609a;
            }
        }

        /* compiled from: ComposeUiNode.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LA0/g;", "Landroidx/compose/ui/platform/i1;", "it", "Loa/F;", "a", "(LA0/g;Landroidx/compose/ui/platform/i1;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: A0.g$a$g, reason: collision with other inner class name */
        static final class C0012g extends AbstractC3864v implements Ba.p<InterfaceC0828g, i1, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            public static final C0012g f620B = new C0012g();

            C0012g() {
                super(2);
            }

            public final void a(InterfaceC0828g interfaceC0828g, i1 i1Var) {
                interfaceC0828g.l(i1Var);
            }

            @Override // Ba.p
            public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC0828g interfaceC0828g, i1 i1Var) {
                a(interfaceC0828g, i1Var);
                return C4153F.f46609a;
            }
        }

        /* compiled from: ComposeUiNode.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LA0/G;", "a", "()LA0/G;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: A0.g$a$h */
        static final class h extends AbstractC3864v implements Ba.a<G> {

            /* renamed from: B, reason: collision with root package name */
            public static final h f621B = new h();

            h() {
                super(0);
            }

            @Override // Ba.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final G invoke() {
                return new G(true, 0, 2, null);
            }
        }

        private Companion() {
        }

        public final Ba.a<InterfaceC0828g> a() {
            return Constructor;
        }

        public final Ba.p<InterfaceC0828g, Integer, C4153F> b() {
            return SetCompositeKeyHash;
        }

        public final Ba.p<InterfaceC0828g, y0.I, C4153F> c() {
            return SetMeasurePolicy;
        }

        public final Ba.p<InterfaceC0828g, b0.i, C4153F> d() {
            return SetModifier;
        }

        public final Ba.p<InterfaceC0828g, InterfaceC1578x, C4153F> e() {
            return SetResolvedCompositionLocals;
        }

        public final Ba.a<InterfaceC0828g> f() {
            return VirtualConstructor;
        }
    }

    void b(U0.t tVar);

    void c(U0.d dVar);

    void e(b0.i iVar);

    void f(y0.I i10);

    void g(int i10);

    void j(InterfaceC1578x interfaceC1578x);

    void l(i1 i1Var);
}
