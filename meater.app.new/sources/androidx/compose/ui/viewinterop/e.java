package androidx.compose.ui.viewinterop;

import A0.G;
import A0.InterfaceC0828g;
import A0.m0;
import Ba.p;
import U0.t;
import android.content.Context;
import android.view.InterfaceC2114v;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.platform.M;
import kotlin.AbstractC1564q;
import kotlin.C1;
import kotlin.C1509K0;
import kotlin.C1550j;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1578x;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.W0;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import t3.InterfaceC4549f;
import x0.C5047a;

/* compiled from: AndroidView.android.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aM\u0010\t\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001a{\u0010\r\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00022\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00022\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a3\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a^\u0010 \u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00100\u00132\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a#\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0010H\u0002¢\u0006\u0004\b#\u0010$\"#\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Landroid/view/View;", "T", "Lkotlin/Function1;", "Landroid/content/Context;", "factory", "Lb0/i;", "modifier", "Loa/F;", "update", "b", "(LBa/l;Lb0/i;LBa/l;LO/l;II)V", "onReset", "onRelease", "a", "(LBa/l;Lb0/i;LBa/l;LBa/l;LBa/l;LO/l;II)V", "Lkotlin/Function0;", "LA0/G;", "d", "(LBa/l;LO/l;I)LBa/a;", "LO/C1;", "", "compositeKeyHash", "LU0/d;", "density", "Landroidx/lifecycle/v;", "lifecycleOwner", "Lt3/f;", "savedStateRegistryOwner", "LU0/t;", "layoutDirection", "LO/x;", "compositionLocalMap", "g", "(LO/l;Lb0/i;ILU0/d;Landroidx/lifecycle/v;Lt3/f;LU0/t;LO/x;)V", "Landroidx/compose/ui/viewinterop/i;", "f", "(LA0/G;)Landroidx/compose/ui/viewinterop/i;", "LBa/l;", "e", "()LBa/l;", "NoOpUpdate", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final Ba.l<View, C4153F> f23573a = h.f23591B;

    /* compiled from: AndroidView.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Ba.l<Context, T> f23574B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ b0.i f23575C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Ba.l<T, C4153F> f23576D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ int f23577E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f23578F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Ba.l<? super Context, ? extends T> lVar, b0.i iVar, Ba.l<? super T, C4153F> lVar2, int i10, int i11) {
            super(2);
            this.f23574B = lVar;
            this.f23575C = iVar;
            this.f23576D = lVar2;
            this.f23577E = i10;
            this.f23578F = i11;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            e.b(this.f23574B, this.f23575C, this.f23576D, interfaceC1554l, C1509K0.a(this.f23577E | 1), this.f23578F);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "LA0/G;", "Lkotlin/Function1;", "Loa/F;", "it", "a", "(LA0/G;LBa/l;)V"}, k = 3, mv = {1, 8, 0})
    static final class b<T> extends AbstractC3864v implements p<G, Ba.l<? super T, ? extends C4153F>, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f23579B = new b();

        b() {
            super(2);
        }

        public final void a(G g10, Ba.l<? super T, C4153F> lVar) {
            e.f(g10).setResetBlock(lVar);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(G g10, Object obj) {
            a(g10, (Ba.l) obj);
            return C4153F.f46609a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "LA0/G;", "Lkotlin/Function1;", "Loa/F;", "it", "a", "(LA0/G;LBa/l;)V"}, k = 3, mv = {1, 8, 0})
    static final class c<T> extends AbstractC3864v implements p<G, Ba.l<? super T, ? extends C4153F>, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final c f23580B = new c();

        c() {
            super(2);
        }

        public final void a(G g10, Ba.l<? super T, C4153F> lVar) {
            e.f(g10).setUpdateBlock(lVar);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(G g10, Object obj) {
            a(g10, (Ba.l) obj);
            return C4153F.f46609a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "LA0/G;", "Lkotlin/Function1;", "Loa/F;", "it", "a", "(LA0/G;LBa/l;)V"}, k = 3, mv = {1, 8, 0})
    static final class d<T> extends AbstractC3864v implements p<G, Ba.l<? super T, ? extends C4153F>, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final d f23581B = new d();

        d() {
            super(2);
        }

        public final void a(G g10, Ba.l<? super T, C4153F> lVar) {
            e.f(g10).setReleaseBlock(lVar);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(G g10, Object obj) {
            a(g10, (Ba.l) obj);
            return C4153F.f46609a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "LA0/G;", "Lkotlin/Function1;", "Loa/F;", "it", "a", "(LA0/G;LBa/l;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.viewinterop.e$e, reason: collision with other inner class name */
    static final class C0337e<T> extends AbstractC3864v implements p<G, Ba.l<? super T, ? extends C4153F>, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final C0337e f23582B = new C0337e();

        C0337e() {
            super(2);
        }

        public final void a(G g10, Ba.l<? super T, C4153F> lVar) {
            e.f(g10).setUpdateBlock(lVar);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(G g10, Object obj) {
            a(g10, (Ba.l) obj);
            return C4153F.f46609a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "LA0/G;", "Lkotlin/Function1;", "Loa/F;", "it", "a", "(LA0/G;LBa/l;)V"}, k = 3, mv = {1, 8, 0})
    static final class f<T> extends AbstractC3864v implements p<G, Ba.l<? super T, ? extends C4153F>, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final f f23583B = new f();

        f() {
            super(2);
        }

        public final void a(G g10, Ba.l<? super T, C4153F> lVar) {
            e.f(g10).setReleaseBlock(lVar);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(G g10, Object obj) {
            a(g10, (Ba.l) obj);
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidView.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class g extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Ba.l<Context, T> f23584B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ b0.i f23585C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Ba.l<T, C4153F> f23586D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Ba.l<T, C4153F> f23587E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Ba.l<T, C4153F> f23588F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ int f23589G;

        /* renamed from: H, reason: collision with root package name */
        final /* synthetic */ int f23590H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(Ba.l<? super Context, ? extends T> lVar, b0.i iVar, Ba.l<? super T, C4153F> lVar2, Ba.l<? super T, C4153F> lVar3, Ba.l<? super T, C4153F> lVar4, int i10, int i11) {
            super(2);
            this.f23584B = lVar;
            this.f23585C = iVar;
            this.f23586D = lVar2;
            this.f23587E = lVar3;
            this.f23588F = lVar4;
            this.f23589G = i10;
            this.f23590H = i11;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            e.a(this.f23584B, this.f23585C, this.f23586D, this.f23587E, this.f23588F, interfaceC1554l, C1509K0.a(this.f23589G | 1), this.f23590H);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "LA0/G;", "a", "()LA0/G;"}, k = 3, mv = {1, 8, 0})
    static final class i extends AbstractC3864v implements Ba.a<G> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Context f23592B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ Ba.l<Context, T> f23593C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ AbstractC1564q f23594D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Y.g f23595E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f23596F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ View f23597G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(Context context, Ba.l<? super Context, ? extends T> lVar, AbstractC1564q abstractC1564q, Y.g gVar, int i10, View view) {
            super(0);
            this.f23592B = context;
            this.f23593C = lVar;
            this.f23594D = abstractC1564q;
            this.f23595E = gVar;
            this.f23596F = i10;
            this.f23597G = view;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final G invoke() {
            Context context = this.f23592B;
            Ba.l<Context, T> lVar = this.f23593C;
            AbstractC1564q abstractC1564q = this.f23594D;
            Y.g gVar = this.f23595E;
            int i10 = this.f23596F;
            KeyEvent.Callback callback = this.f23597G;
            C3862t.e(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
            return new androidx.compose.ui.viewinterop.i(context, lVar, abstractC1564q, gVar, i10, (m0) callback).getLayoutNode();
        }
    }

    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "LA0/G;", "Lb0/i;", "it", "Loa/F;", "a", "(LA0/G;Lb0/i;)V"}, k = 3, mv = {1, 8, 0})
    static final class j extends AbstractC3864v implements p<G, b0.i, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final j f23598B = new j();

        j() {
            super(2);
        }

        public final void a(G g10, b0.i iVar) {
            e.f(g10).setModifier(iVar);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(G g10, b0.i iVar) {
            a(g10, iVar);
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "LA0/G;", "LU0/d;", "it", "Loa/F;", "a", "(LA0/G;LU0/d;)V"}, k = 3, mv = {1, 8, 0})
    static final class k extends AbstractC3864v implements p<G, U0.d, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final k f23599B = new k();

        k() {
            super(2);
        }

        public final void a(G g10, U0.d dVar) {
            e.f(g10).setDensity(dVar);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(G g10, U0.d dVar) {
            a(g10, dVar);
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "LA0/G;", "Landroidx/lifecycle/v;", "it", "Loa/F;", "a", "(LA0/G;Landroidx/lifecycle/v;)V"}, k = 3, mv = {1, 8, 0})
    static final class l extends AbstractC3864v implements p<G, InterfaceC2114v, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final l f23600B = new l();

        l() {
            super(2);
        }

        public final void a(G g10, InterfaceC2114v interfaceC2114v) {
            e.f(g10).setLifecycleOwner(interfaceC2114v);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(G g10, InterfaceC2114v interfaceC2114v) {
            a(g10, interfaceC2114v);
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "LA0/G;", "Lt3/f;", "it", "Loa/F;", "a", "(LA0/G;Lt3/f;)V"}, k = 3, mv = {1, 8, 0})
    static final class m extends AbstractC3864v implements p<G, InterfaceC4549f, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final m f23601B = new m();

        m() {
            super(2);
        }

        public final void a(G g10, InterfaceC4549f interfaceC4549f) {
            e.f(g10).setSavedStateRegistryOwner(interfaceC4549f);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(G g10, InterfaceC4549f interfaceC4549f) {
            a(g10, interfaceC4549f);
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "T", "LA0/G;", "LU0/t;", "it", "Loa/F;", "a", "(LA0/G;LU0/t;)V"}, k = 3, mv = {1, 8, 0})
    static final class n extends AbstractC3864v implements p<G, t, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final n f23602B = new n();

        /* compiled from: AndroidView.android.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f23603a;

            static {
                int[] iArr = new int[t.values().length];
                try {
                    iArr[t.Ltr.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[t.Rtl.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f23603a = iArr;
            }
        }

        n() {
            super(2);
        }

        public final void a(G g10, t tVar) {
            androidx.compose.ui.viewinterop.i iVarF = e.f(g10);
            int i10 = a.f23603a[tVar.ordinal()];
            int i11 = 1;
            if (i10 == 1) {
                i11 = 0;
            } else if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iVarF.setLayoutDirection(i11);
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(G g10, t tVar) {
            a(g10, tVar);
            return C4153F.f46609a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T extends android.view.View> void a(Ba.l<? super android.content.Context, ? extends T> r21, b0.i r22, Ba.l<? super T, oa.C4153F> r23, Ba.l<? super T, oa.C4153F> r24, Ba.l<? super T, oa.C4153F> r25, kotlin.InterfaceC1554l r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.e.a(Ba.l, b0.i, Ba.l, Ba.l, Ba.l, O.l, int, int):void");
    }

    public static final <T extends View> void b(Ba.l<? super Context, ? extends T> lVar, b0.i iVar, Ba.l<? super T, C4153F> lVar2, InterfaceC1554l interfaceC1554l, int i10, int i11) {
        int i12;
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(-1783766393);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (interfaceC1554lR.l(lVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= interfaceC1554lR.R(iVar) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= interfaceC1554lR.l(lVar2) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
        } else {
            if (i13 != 0) {
                iVar = b0.i.INSTANCE;
            }
            if (i14 != 0) {
                lVar2 = f23573a;
            }
            if (C1560o.J()) {
                C1560o.S(-1783766393, i12, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:107)");
            }
            a(lVar, iVar, null, f23573a, lVar2, interfaceC1554lR, (i12 & 14) | 3072 | (i12 & 112) | ((i12 << 6) & 57344), 4);
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        b0.i iVar2 = iVar;
        Ba.l<? super T, C4153F> lVar3 = lVar2;
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new a(lVar, iVar2, lVar3, i10, i11));
        }
    }

    private static final <T extends View> Ba.a<G> d(Ba.l<? super Context, ? extends T> lVar, InterfaceC1554l interfaceC1554l, int i10) {
        if (C1560o.J()) {
            C1560o.S(2030558801, i10, -1, "androidx.compose.ui.viewinterop.createAndroidViewNodeFactory (AndroidView.android.kt:266)");
        }
        int iA = C1550j.a(interfaceC1554l, 0);
        Context context = (Context) interfaceC1554l.o(M.g());
        AbstractC1564q abstractC1564qD = C1550j.d(interfaceC1554l, 0);
        Y.g gVar = (Y.g) interfaceC1554l.o(Y.i.d());
        View view = (View) interfaceC1554l.o(M.k());
        boolean zL = interfaceC1554l.l(context) | ((((i10 & 14) ^ 6) > 4 && interfaceC1554l.R(lVar)) || (i10 & 6) == 4) | interfaceC1554l.l(abstractC1564qD) | interfaceC1554l.l(gVar) | interfaceC1554l.h(iA) | interfaceC1554l.l(view);
        Object objF = interfaceC1554l.f();
        if (zL || objF == InterfaceC1554l.INSTANCE.a()) {
            objF = new i(context, lVar, abstractC1564qD, gVar, iA, view);
            interfaceC1554l.J(objF);
        }
        Ba.a<G> aVar = (Ba.a) objF;
        if (C1560o.J()) {
            C1560o.R();
        }
        return aVar;
    }

    public static final Ba.l<View, C4153F> e() {
        return f23573a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends View> androidx.compose.ui.viewinterop.i<T> f(G g10) {
        androidx.compose.ui.viewinterop.c interopViewFactoryHolder = g10.getInteropViewFactoryHolder();
        if (interopViewFactoryHolder != null) {
            return (androidx.compose.ui.viewinterop.i) interopViewFactoryHolder;
        }
        C5047a.c("Required value was null.");
        throw new KotlinNothingValueException();
    }

    private static final <T extends View> void g(InterfaceC1554l interfaceC1554l, b0.i iVar, int i10, U0.d dVar, InterfaceC2114v interfaceC2114v, InterfaceC4549f interfaceC4549f, t tVar, InterfaceC1578x interfaceC1578x) {
        InterfaceC0828g.Companion companion = InterfaceC0828g.INSTANCE;
        C1.b(interfaceC1554l, interfaceC1578x, companion.e());
        C1.b(interfaceC1554l, iVar, j.f23598B);
        C1.b(interfaceC1554l, dVar, k.f23599B);
        C1.b(interfaceC1554l, interfaceC2114v, l.f23600B);
        C1.b(interfaceC1554l, interfaceC4549f, m.f23601B);
        C1.b(interfaceC1554l, tVar, n.f23602B);
        p<InterfaceC0828g, Integer, C4153F> pVarB = companion.b();
        if (interfaceC1554l.n() || !C3862t.b(interfaceC1554l.f(), Integer.valueOf(i10))) {
            interfaceC1554l.J(Integer.valueOf(i10));
            interfaceC1554l.k(Integer.valueOf(i10), pVarB);
        }
    }

    /* compiled from: AndroidView.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/view/View;", "Loa/F;", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 8, 0})
    static final class h extends AbstractC3864v implements Ba.l<View, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final h f23591B = new h();

        h() {
            super(1);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(View view) {
            a(view);
            return C4153F.f46609a;
        }

        public final void a(View view) {
        }
    }
}
