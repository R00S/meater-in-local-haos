package androidx.compose.foundation.lazy.layout;

import A0.v0;
import A0.w0;
import Ba.l;
import Ba.p;
import F0.ScrollAxisRange;
import F0.v;
import F0.x;
import Xb.C1841i;
import Xb.I;
import b0.i;
import kotlin.C;
import kotlin.EnumC5037q;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import kotlin.q;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: LazyLayoutSemantics.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J;\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u000eJ\u0013\u0010\u0014\u001a\u00020\u000f*\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R$\u0010*\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\n\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'R\u0014\u0010-\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00103\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010,¨\u00064"}, d2 = {"Landroidx/compose/foundation/lazy/layout/g;", "Lb0/i$c;", "LA0/v0;", "Lkotlin/Function0;", "LC/q;", "itemProviderLambda", "LC/C;", "state", "Lx/q;", "orientation", "", "userScrollEnabled", "reverseScrolling", "<init>", "(LBa/a;LC/C;Lx/q;ZZ)V", "Loa/F;", "o2", "()V", "n2", "LF0/x;", "m1", "(LF0/x;)V", "O", "LBa/a;", "P", "LC/C;", "Q", "Lx/q;", "R", "Z", "S", "LF0/j;", "T", "LF0/j;", "scrollAxisRange", "Lkotlin/Function1;", "", "", "U", "LBa/l;", "indexForKeyMapping", "V", "scrollToIndexAction", "m2", "()Z", "isVertical", "LF0/b;", "l2", "()LF0/b;", "collectionInfo", "O1", "shouldAutoInvalidate", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class g extends i.c implements v0 {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Ba.a<? extends q> itemProviderLambda;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    private C state;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private EnumC5037q orientation;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private boolean userScrollEnabled;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private boolean reverseScrolling;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    private ScrollAxisRange scrollAxisRange;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata */
    private final l<Object, Integer> indexForKeyMapping = new b();

    /* renamed from: V, reason: collision with root package name and from kotlin metadata */
    private l<? super Integer, Boolean> scrollToIndexAction;

    /* compiled from: LazyLayoutSemantics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.a<Float> {
        a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(g.this.state.a() - g.this.state.c());
        }
    }

    /* compiled from: LazyLayoutSemantics.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "needle", "", "a", "(Ljava/lang/Object;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements l<Object, Integer> {
        b() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(Object obj) {
            q qVar = (q) g.this.itemProviderLambda.invoke();
            int iA = qVar.a();
            int i10 = 0;
            while (true) {
                if (i10 >= iA) {
                    i10 = -1;
                    break;
                }
                if (C3862t.b(qVar.b(i10), obj)) {
                    break;
                }
                i10++;
            }
            return Integer.valueOf(i10);
        }
    }

    /* compiled from: LazyLayoutSemantics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class c extends AbstractC3864v implements Ba.a<Float> {
        c() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(g.this.state.b());
        }
    }

    /* compiled from: LazyLayoutSemantics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class d extends AbstractC3864v implements Ba.a<Float> {
        d() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(g.this.state.e());
        }
    }

    /* compiled from: LazyLayoutSemantics.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "index", "", "a", "(I)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class e extends AbstractC3864v implements l<Integer, Boolean> {

        /* compiled from: LazyLayoutSemantics.kt */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2", f = "LazyLayoutSemantics.kt", l = {205}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f22445B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ g f22446C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ int f22447D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g gVar, int i10, InterfaceC4588d<? super a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f22446C = gVar;
                this.f22447D = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new a(this.f22446C, this.f22447D, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = C4696b.e();
                int i10 = this.f22445B;
                if (i10 == 0) {
                    C4173r.b(obj);
                    C c10 = this.f22446C.state;
                    int i11 = this.f22447D;
                    this.f22445B = 1;
                    if (c10.d(i11, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C4173r.b(obj);
                }
                return C4153F.f46609a;
            }
        }

        e() {
            super(1);
        }

        public final Boolean a(int i10) {
            q qVar = (q) g.this.itemProviderLambda.invoke();
            if (i10 >= 0 && i10 < qVar.a()) {
                C1841i.d(g.this.J1(), null, null, new a(g.this, i10, null), 3, null);
                return Boolean.TRUE;
            }
            throw new IllegalArgumentException(("Can't scroll to index " + i10 + ", it is out of bounds [0, " + qVar.a() + ')').toString());
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
            return a(num.intValue());
        }
    }

    public g(Ba.a<? extends q> aVar, C c10, EnumC5037q enumC5037q, boolean z10, boolean z11) {
        this.itemProviderLambda = aVar;
        this.state = c10;
        this.orientation = enumC5037q;
        this.userScrollEnabled = z10;
        this.reverseScrolling = z11;
        o2();
    }

    private final F0.b l2() {
        return this.state.f();
    }

    private final boolean m2() {
        return this.orientation == EnumC5037q.Vertical;
    }

    private final void o2() {
        this.scrollAxisRange = new ScrollAxisRange(new c(), new d(), this.reverseScrolling);
        this.scrollToIndexAction = this.userScrollEnabled ? new e() : null;
    }

    @Override // b0.i.c
    /* renamed from: O1 */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // A0.v0
    public void m1(x xVar) {
        v.N(xVar, true);
        v.m(xVar, this.indexForKeyMapping);
        if (m2()) {
            ScrollAxisRange scrollAxisRange = this.scrollAxisRange;
            if (scrollAxisRange == null) {
                C3862t.u("scrollAxisRange");
                scrollAxisRange = null;
            }
            v.O(xVar, scrollAxisRange);
        } else {
            ScrollAxisRange scrollAxisRange2 = this.scrollAxisRange;
            if (scrollAxisRange2 == null) {
                C3862t.u("scrollAxisRange");
                scrollAxisRange2 = null;
            }
            v.D(xVar, scrollAxisRange2);
        }
        l<? super Integer, Boolean> lVar = this.scrollToIndexAction;
        if (lVar != null) {
            v.y(xVar, null, lVar, 1, null);
        }
        v.j(xVar, null, new a(), 1, null);
        v.z(xVar, l2());
    }

    public final void n2(Ba.a<? extends q> itemProviderLambda, C state, EnumC5037q orientation, boolean userScrollEnabled, boolean reverseScrolling) {
        this.itemProviderLambda = itemProviderLambda;
        this.state = state;
        if (this.orientation != orientation) {
            this.orientation = orientation;
            w0.b(this);
        }
        if (this.userScrollEnabled == userScrollEnabled && this.reverseScrolling == reverseScrolling) {
            return;
        }
        this.userScrollEnabled = userScrollEnabled;
        this.reverseScrolling = reverseScrolling;
        o2();
        w0.b(this);
    }
}
