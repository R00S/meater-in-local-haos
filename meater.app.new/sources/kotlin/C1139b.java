package kotlin;

import Ba.p;
import Ba.q;
import Ba.r;
import Xb.C1841i;
import Xb.I;
import Xb.InterfaceC1867v0;
import Xb.J;
import ac.InterfaceC1970e;
import ac.InterfaceC1971f;
import androidx.compose.material.AnchoredDragFinishedSignal;
import b0.i;
import kotlin.C4758k0;
import kotlin.C5032l;
import kotlin.EnumC5037q;
import kotlin.InterfaceC4753i;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.O;
import kotlin.m1;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;
import z.InterfaceC5162k;

/* compiled from: AnchoredDraggable.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001aY\u0010\u0014\u001a\u00020\t\"\u0004\b\u0000\u0010\u0001*\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a2\u0010\u0019\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0016\u001a\u00028\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0081@¢\u0006\u0004\b\u0019\u0010\u001a\u001aH\u0010!\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\"\u0010 \u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u001eH\u0082@¢\u0006\u0004\b!\u0010\"\u001a\u001b\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#\"\u0004\b\u0000\u0010\u0001H\u0002¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"", "T", "Lkotlin/Function1;", "LI/v;", "Loa/F;", "builder", "LI/u;", "a", "(LBa/l;)LI/u;", "Lb0/i;", "LI/c;", "state", "Lx/q;", "orientation", "", "enabled", "reverseDirection", "Lz/k;", "interactionSource", "startDragImmediately", "d", "(Lb0/i;LI/c;Lx/q;ZZLz/k;Z)Lb0/i;", "targetValue", "", "velocity", "f", "(LI/c;Ljava/lang/Object;FLta/d;)Ljava/lang/Object;", "I", "Lkotlin/Function0;", "inputs", "Lkotlin/Function2;", "Lta/d;", "block", "i", "(LBa/a;LBa/p;Lta/d;)Ljava/lang/Object;", "LI/O;", "h", "()LI/O;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: I.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1139b {

    /* compiled from: AnchoredDraggable.kt */
    @f(c = "androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1", f = "AnchoredDraggable.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "LXb/I;", "", "velocity", "Loa/F;", "<anonymous>", "(LXb/I;F)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I.b$a */
    static final class a extends l implements q<I, Float, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f6057B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f6058C;

        /* renamed from: D, reason: collision with root package name */
        /* synthetic */ float f6059D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ C1140c<T> f6060E;

        /* compiled from: AnchoredDraggable.kt */
        @f(c = "androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1$1", f = "AnchoredDraggable.kt", l = {186}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: I.b$a$a, reason: collision with other inner class name */
        static final class C0114a extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f6061B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ C1140c<T> f6062C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ float f6063D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0114a(C1140c<T> c1140c, float f10, InterfaceC4588d<? super C0114a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f6062C = c1140c;
                this.f6063D = f10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new C0114a(this.f6062C, this.f6063D, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((C0114a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = C4696b.e();
                int i10 = this.f6061B;
                if (i10 == 0) {
                    C4173r.b(obj);
                    C1140c<T> c1140c = this.f6062C;
                    float f10 = this.f6063D;
                    this.f6061B = 1;
                    if (c1140c.F(f10, this) == objE) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C1140c<T> c1140c, InterfaceC4588d<? super a> interfaceC4588d) {
            super(3, interfaceC4588d);
            this.f6060E = c1140c;
        }

        public final Object b(I i10, float f10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            a aVar = new a(this.f6060E, interfaceC4588d);
            aVar.f6058C = i10;
            aVar.f6059D = f10;
            return aVar.invokeSuspend(C4153F.f46609a);
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ Object g(I i10, Float f10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return b(i10, f10.floatValue(), interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f6057B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            C1841i.d((I) this.f6058C, null, null, new C0114a(this.f6060E, this.f6059D, null), 3, null);
            return C4153F.f46609a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: AnchoredDraggable.kt */
    @f(c = "androidx.compose.material.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", l = {706}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "LI/a;", "LI/u;", "anchors", "latestTarget", "Loa/F;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I.b$b, reason: collision with other inner class name */
    static final class C0115b<T> extends l implements r<InterfaceC1138a, InterfaceC1158u<T>, T, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f6064B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f6065C;

        /* renamed from: D, reason: collision with root package name */
        /* synthetic */ Object f6066D;

        /* renamed from: E, reason: collision with root package name */
        /* synthetic */ Object f6067E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ C1140c<T> f6068F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ float f6069G;

        /* compiled from: AnchoredDraggable.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "", "value", "velocity", "Loa/F;", "a", "(FF)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: I.b$b$a */
        static final class a extends AbstractC3864v implements p<Float, Float, C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ InterfaceC1138a f6070B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ L f6071C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC1138a interfaceC1138a, L l10) {
                super(2);
                this.f6070B = interfaceC1138a;
                this.f6071C = l10;
            }

            public final void a(float f10, float f11) {
                this.f6070B.a(f10, f11);
                this.f6071C.f43975B = f10;
            }

            @Override // Ba.p
            public /* bridge */ /* synthetic */ C4153F invoke(Float f10, Float f11) {
                a(f10.floatValue(), f11.floatValue());
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0115b(C1140c<T> c1140c, float f10, InterfaceC4588d<? super C0115b> interfaceC4588d) {
            super(4, interfaceC4588d);
            this.f6068F = c1140c;
            this.f6069G = f10;
        }

        @Override // Ba.r
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object k(InterfaceC1138a interfaceC1138a, InterfaceC1158u<T> interfaceC1158u, T t10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            C0115b c0115b = new C0115b(this.f6068F, this.f6069G, interfaceC4588d);
            c0115b.f6065C = interfaceC1138a;
            c0115b.f6066D = interfaceC1158u;
            c0115b.f6067E = t10;
            return c0115b.invokeSuspend(C4153F.f46609a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f6064B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC1138a interfaceC1138a = (InterfaceC1138a) this.f6065C;
                float fD = ((InterfaceC1158u) this.f6066D).d(this.f6067E);
                if (!Float.isNaN(fD)) {
                    L l10 = new L();
                    float fV = Float.isNaN(this.f6068F.v()) ? 0.0f : this.f6068F.v();
                    l10.f43975B = fV;
                    float f10 = this.f6069G;
                    InterfaceC4753i<Float> interfaceC4753iO = this.f6068F.o();
                    a aVar = new a(interfaceC1138a, l10);
                    this.f6065C = null;
                    this.f6066D = null;
                    this.f6064B = 1;
                    if (C4758k0.b(fV, fD, f10, interfaceC4753iO, aVar, this) == objE) {
                        return objE;
                    }
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

    /* compiled from: AnchoredDraggable.kt */
    @f(c = "androidx.compose.material.AnchoredDraggableKt", f = "AnchoredDraggable.kt", l = {737}, m = "restartable")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: I.b$c */
    static final class c<I> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        /* synthetic */ Object f6072B;

        /* renamed from: C, reason: collision with root package name */
        int f6073C;

        c(InterfaceC4588d<? super c> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f6072B = obj;
            this.f6073C |= Integer.MIN_VALUE;
            return C1139b.i(null, null, this);
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @f(c = "androidx.compose.material.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", l = {740}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I.b$d */
    static final class d extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f6074B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f6075C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Ba.a<I> f6076D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ p<I, InterfaceC4588d<? super C4153F>, Object> f6077E;

        /* compiled from: AnchoredDraggable.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "latestInputs", "Loa/F;", "a", "(Ljava/lang/Object;Lta/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: I.b$d$a */
        static final class a<T> implements InterfaceC1971f {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ O<InterfaceC1867v0> f6078B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ I f6079C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ p<I, InterfaceC4588d<? super C4153F>, Object> f6080D;

            /* compiled from: AnchoredDraggable.kt */
            @f(c = "androidx.compose.material.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", l = {746}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"I", "LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: I.b$d$a$a, reason: collision with other inner class name */
            static final class C0116a extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

                /* renamed from: B, reason: collision with root package name */
                int f6081B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ p<I, InterfaceC4588d<? super C4153F>, Object> f6082C;

                /* renamed from: D, reason: collision with root package name */
                final /* synthetic */ I f6083D;

                /* renamed from: E, reason: collision with root package name */
                final /* synthetic */ I f6084E;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0116a(p<? super I, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar, I i10, I i11, InterfaceC4588d<? super C0116a> interfaceC4588d) {
                    super(2, interfaceC4588d);
                    this.f6082C = pVar;
                    this.f6083D = i10;
                    this.f6084E = i11;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                    return new C0116a(this.f6082C, this.f6083D, this.f6084E, interfaceC4588d);
                }

                @Override // Ba.p
                public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                    return ((C0116a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = C4696b.e();
                    int i10 = this.f6081B;
                    if (i10 == 0) {
                        C4173r.b(obj);
                        p<I, InterfaceC4588d<? super C4153F>, Object> pVar = this.f6082C;
                        I i11 = this.f6083D;
                        this.f6081B = 1;
                        if (pVar.invoke(i11, this) == objE) {
                            return objE;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C4173r.b(obj);
                    }
                    J.c(this.f6084E, new AnchoredDragFinishedSignal());
                    return C4153F.f46609a;
                }
            }

            /* compiled from: AnchoredDraggable.kt */
            @f(c = "androidx.compose.material.AnchoredDraggableKt$restartable$2$1", f = "AnchoredDraggable.kt", l = {743}, m = "emit")
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: I.b$d$a$b, reason: collision with other inner class name */
            static final class C0117b extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: B, reason: collision with root package name */
                Object f6085B;

                /* renamed from: C, reason: collision with root package name */
                Object f6086C;

                /* renamed from: D, reason: collision with root package name */
                Object f6087D;

                /* renamed from: E, reason: collision with root package name */
                /* synthetic */ Object f6088E;

                /* renamed from: F, reason: collision with root package name */
                final /* synthetic */ a<T> f6089F;

                /* renamed from: G, reason: collision with root package name */
                int f6090G;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0117b(a<? super T> aVar, InterfaceC4588d<? super C0117b> interfaceC4588d) {
                    super(interfaceC4588d);
                    this.f6089F = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f6088E = obj;
                    this.f6090G |= Integer.MIN_VALUE;
                    return this.f6089F.a(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(O<InterfaceC1867v0> o10, I i10, p<? super I, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar) {
                this.f6078B = o10;
                this.f6079C = i10;
                this.f6080D = pVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // ac.InterfaceC1971f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a(I r8, ta.InterfaceC4588d<? super oa.C4153F> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof kotlin.C1139b.d.a.C0117b
                    if (r0 == 0) goto L13
                    r0 = r9
                    I.b$d$a$b r0 = (kotlin.C1139b.d.a.C0117b) r0
                    int r1 = r0.f6090G
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f6090G = r1
                    goto L18
                L13:
                    I.b$d$a$b r0 = new I.b$d$a$b
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.f6088E
                    java.lang.Object r1 = ua.C4696b.e()
                    int r2 = r0.f6090G
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.f6087D
                    Xb.v0 r8 = (Xb.InterfaceC1867v0) r8
                    java.lang.Object r8 = r0.f6086C
                    java.lang.Object r0 = r0.f6085B
                    I.b$d$a r0 = (kotlin.C1139b.d.a) r0
                    oa.C4173r.b(r9)
                    goto L5e
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    oa.C4173r.b(r9)
                    kotlin.jvm.internal.O<Xb.v0> r9 = r7.f6078B
                    T r9 = r9.f43978B
                    Xb.v0 r9 = (Xb.InterfaceC1867v0) r9
                    if (r9 == 0) goto L5d
                    androidx.compose.material.AnchoredDragFinishedSignal r2 = new androidx.compose.material.AnchoredDragFinishedSignal
                    r2.<init>()
                    r9.e(r2)
                    r0.f6085B = r7
                    r0.f6086C = r8
                    r0.f6087D = r9
                    r0.f6090G = r3
                    java.lang.Object r9 = r9.o(r0)
                    if (r9 != r1) goto L5d
                    return r1
                L5d:
                    r0 = r7
                L5e:
                    kotlin.jvm.internal.O<Xb.v0> r9 = r0.f6078B
                    Xb.I r1 = r0.f6079C
                    Xb.K r3 = Xb.K.f19033E
                    I.b$d$a$a r4 = new I.b$d$a$a
                    Ba.p<I, ta.d<? super oa.F>, java.lang.Object> r0 = r0.f6080D
                    r2 = 0
                    r4.<init>(r0, r8, r1, r2)
                    r5 = 1
                    r6 = 0
                    Xb.v0 r8 = Xb.C1837g.d(r1, r2, r3, r4, r5, r6)
                    r9.f43978B = r8
                    oa.F r8 = oa.C4153F.f46609a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.C1139b.d.a.a(java.lang.Object, ta.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Ba.a<? extends I> aVar, p<? super I, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar, InterfaceC4588d<? super d> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f6076D = aVar;
            this.f6077E = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            d dVar = new d(this.f6076D, this.f6077E, interfaceC4588d);
            dVar.f6075C = obj;
            return dVar;
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((d) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f6074B;
            if (i10 == 0) {
                C4173r.b(obj);
                I i11 = (I) this.f6075C;
                O o10 = new O();
                InterfaceC1970e interfaceC1970eN = m1.n(this.f6076D);
                a aVar = new a(o10, i11, this.f6077E);
                this.f6074B = 1;
                if (interfaceC1970eN.b(aVar, this) == objE) {
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

    public static final <T> InterfaceC1158u<T> a(Ba.l<? super C1159v<T>, C4153F> lVar) {
        C1159v c1159v = new C1159v();
        lVar.invoke(c1159v);
        return new MapDraggableAnchors(c1159v.b());
    }

    public static final <T> i d(i iVar, C1140c<T> c1140c, EnumC5037q enumC5037q, boolean z10, boolean z11, InterfaceC5162k interfaceC5162k, boolean z12) {
        return C5032l.g(iVar, c1140c.getDraggableState(), enumC5037q, (32 & 4) != 0 ? true : z10, (32 & 8) != 0 ? null : interfaceC5162k, (32 & 16) != 0 ? false : z12, (32 & 32) != 0 ? C5032l.f52478a : null, (32 & 64) != 0 ? C5032l.f52479b : new a(c1140c, null), (32 & 128) != 0 ? false : z11);
    }

    public static /* synthetic */ i e(i iVar, C1140c c1140c, EnumC5037q enumC5037q, boolean z10, boolean z11, InterfaceC5162k interfaceC5162k, boolean z12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z13 = z10;
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        boolean z14 = z11;
        if ((i10 & 16) != 0) {
            interfaceC5162k = null;
        }
        InterfaceC5162k interfaceC5162k2 = interfaceC5162k;
        if ((i10 & 32) != 0) {
            z12 = c1140c.x();
        }
        return d(iVar, c1140c, enumC5037q, z13, z14, interfaceC5162k2, z12);
    }

    public static final <T> Object f(C1140c<T> c1140c, T t10, float f10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objK = C1140c.k(c1140c, t10, null, new C0115b(c1140c, f10, null), interfaceC4588d, 2, null);
        return objK == C4696b.e() ? objK : C4153F.f46609a;
    }

    public static /* synthetic */ Object g(C1140c c1140c, Object obj, float f10, InterfaceC4588d interfaceC4588d, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            f10 = c1140c.u();
        }
        return f(c1140c, obj, f10, interfaceC4588d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> MapDraggableAnchors<T> h() {
        return new MapDraggableAnchors<>(M.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <I> java.lang.Object i(Ba.a<? extends I> r4, Ba.p<? super I, ? super ta.InterfaceC4588d<? super oa.C4153F>, ? extends java.lang.Object> r5, ta.InterfaceC4588d<? super oa.C4153F> r6) {
        /*
            boolean r0 = r6 instanceof kotlin.C1139b.c
            if (r0 == 0) goto L13
            r0 = r6
            I.b$c r0 = (kotlin.C1139b.c) r0
            int r1 = r0.f6073C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6073C = r1
            goto L18
        L13:
            I.b$c r0 = new I.b$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f6072B
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f6073C
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            oa.C4173r.b(r6)     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            goto L43
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            oa.C4173r.b(r6)
            I.b$d r6 = new I.b$d     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            r0.f6073C = r3     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            java.lang.Object r4 = Xb.J.d(r6, r0)     // Catch: androidx.compose.material.AnchoredDragFinishedSignal -> L43
            if (r4 != r1) goto L43
            return r1
        L43:
            oa.F r4 = oa.C4153F.f46609a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C1139b.i(Ba.a, Ba.p, ta.d):java.lang.Object");
    }
}
