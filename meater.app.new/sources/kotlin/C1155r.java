package kotlin;

import Ba.p;
import U0.h;
import Xb.C1841i;
import Xb.I;
import ac.InterfaceC1970e;
import ac.InterfaceC1971f;
import java.util.ArrayList;
import java.util.List;
import kotlin.C1516O;
import kotlin.C1560o;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C3854k;
import kotlin.x1;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;
import z.C5155d;
import z.C5156e;
import z.C5157f;
import z.C5158g;
import z.InterfaceC5159h;
import z.InterfaceC5160i;
import z.m;

/* compiled from: FloatingActionButton.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"LI/r;", "LI/J;", "LU0/h;", "defaultElevation", "pressedElevation", "hoveredElevation", "focusedElevation", "<init>", "(FFFFLkotlin/jvm/internal/k;)V", "Lz/i;", "interactionSource", "LO/x1;", "a", "(Lz/i;LO/l;I)LO/x1;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "F", "b", "c", "d", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: I.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1155r implements InterfaceC1123J {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float defaultElevation;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float pressedElevation;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float hoveredElevation;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float focusedElevation;

    /* compiled from: FloatingActionButton.kt */
    @f(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$1$1", f = "FloatingActionButton.kt", l = {283}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I.r$a */
    static final class a extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f6451B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C1124K f6452C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ C1155r f6453D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C1124K c1124k, C1155r c1155r, InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f6452C = c1124k;
            this.f6453D = c1155r;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return new a(this.f6452C, this.f6453D, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f6451B;
            if (i10 == 0) {
                C4173r.b(obj);
                C1124K c1124k = this.f6452C;
                float f10 = this.f6453D.defaultElevation;
                float f11 = this.f6453D.pressedElevation;
                float f12 = this.f6453D.hoveredElevation;
                float f13 = this.f6453D.focusedElevation;
                this.f6451B = 1;
                if (c1124k.f(f10, f11, f12, f13, this) == objE) {
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

    /* compiled from: FloatingActionButton.kt */
    @f(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2$1", f = "FloatingActionButton.kt", l = {293}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: I.r$b */
    static final class b extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f6454B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f6455C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ InterfaceC5160i f6456D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ C1124K f6457E;

        /* compiled from: FloatingActionButton.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lz/h;", "interaction", "Loa/F;", "b", "(Lz/h;Lta/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: I.r$b$a */
        static final class a<T> implements InterfaceC1971f {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ List<InterfaceC5159h> f6458B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ I f6459C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ C1124K f6460D;

            /* compiled from: FloatingActionButton.kt */
            @f(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2$1$1$1", f = "FloatingActionButton.kt", l = {319}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: I.r$b$a$a, reason: collision with other inner class name */
            static final class C0124a extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

                /* renamed from: B, reason: collision with root package name */
                int f6461B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ C1124K f6462C;

                /* renamed from: D, reason: collision with root package name */
                final /* synthetic */ InterfaceC5159h f6463D;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0124a(C1124K c1124k, InterfaceC5159h interfaceC5159h, InterfaceC4588d<? super C0124a> interfaceC4588d) {
                    super(2, interfaceC4588d);
                    this.f6462C = c1124k;
                    this.f6463D = interfaceC5159h;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                    return new C0124a(this.f6462C, this.f6463D, interfaceC4588d);
                }

                @Override // Ba.p
                public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                    return ((C0124a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = C4696b.e();
                    int i10 = this.f6461B;
                    if (i10 == 0) {
                        C4173r.b(obj);
                        C1124K c1124k = this.f6462C;
                        InterfaceC5159h interfaceC5159h = this.f6463D;
                        this.f6461B = 1;
                        if (c1124k.b(interfaceC5159h, this) == objE) {
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

            a(List<InterfaceC5159h> list, I i10, C1124K c1124k) {
                this.f6458B = list;
                this.f6459C = i10;
                this.f6460D = c1124k;
            }

            @Override // ac.InterfaceC1971f
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object a(InterfaceC5159h interfaceC5159h, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                if (interfaceC5159h instanceof C5157f) {
                    this.f6458B.add(interfaceC5159h);
                } else if (interfaceC5159h instanceof C5158g) {
                    this.f6458B.remove(((C5158g) interfaceC5159h).getEnter());
                } else if (interfaceC5159h instanceof C5155d) {
                    this.f6458B.add(interfaceC5159h);
                } else if (interfaceC5159h instanceof C5156e) {
                    this.f6458B.remove(((C5156e) interfaceC5159h).getFocus());
                } else if (interfaceC5159h instanceof m.b) {
                    this.f6458B.add(interfaceC5159h);
                } else if (interfaceC5159h instanceof m.c) {
                    this.f6458B.remove(((m.c) interfaceC5159h).getPress());
                } else if (interfaceC5159h instanceof m.a) {
                    this.f6458B.remove(((m.a) interfaceC5159h).getPress());
                }
                C1841i.d(this.f6459C, null, null, new C0124a(this.f6460D, (InterfaceC5159h) r.w0(this.f6458B), null), 3, null);
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC5160i interfaceC5160i, C1124K c1124k, InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f6456D = interfaceC5160i;
            this.f6457E = c1124k;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            b bVar = new b(this.f6456D, this.f6457E, interfaceC4588d);
            bVar.f6455C = obj;
            return bVar;
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f6454B;
            if (i10 == 0) {
                C4173r.b(obj);
                I i11 = (I) this.f6455C;
                ArrayList arrayList = new ArrayList();
                InterfaceC1970e<InterfaceC5159h> interfaceC1970eB = this.f6456D.b();
                a aVar = new a(arrayList, i11, this.f6457E);
                this.f6454B = 1;
                if (interfaceC1970eB.b(aVar, this) == objE) {
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

    public /* synthetic */ C1155r(float f10, float f11, float f12, float f13, C3854k c3854k) {
        this(f10, f11, f12, f13);
    }

    @Override // kotlin.InterfaceC1123J
    public x1<h> a(InterfaceC5160i interfaceC5160i, InterfaceC1554l interfaceC1554l, int i10) {
        interfaceC1554l.S(-478475335);
        if (C1560o.J()) {
            C1560o.S(-478475335, i10, -1, "androidx.compose.material.DefaultFloatingActionButtonElevation.elevation (FloatingActionButton.kt:271)");
        }
        int i11 = i10 & 14;
        int i12 = i11 ^ 6;
        boolean z10 = (i12 > 4 && interfaceC1554l.R(interfaceC5160i)) || (i10 & 6) == 4;
        Object objF = interfaceC1554l.f();
        if (z10 || objF == InterfaceC1554l.INSTANCE.a()) {
            objF = new C1124K(this.defaultElevation, this.pressedElevation, this.hoveredElevation, this.focusedElevation, null);
            interfaceC1554l.J(objF);
        }
        C1124K c1124k = (C1124K) objF;
        boolean zL = interfaceC1554l.l(c1124k) | ((((i10 & 112) ^ 48) > 32 && interfaceC1554l.R(this)) || (i10 & 48) == 32);
        Object objF2 = interfaceC1554l.f();
        if (zL || objF2 == InterfaceC1554l.INSTANCE.a()) {
            objF2 = new a(c1124k, this, null);
            interfaceC1554l.J(objF2);
        }
        C1516O.e(this, (p) objF2, interfaceC1554l, (i10 >> 3) & 14);
        boolean zL2 = interfaceC1554l.l(c1124k) | ((i12 > 4 && interfaceC1554l.R(interfaceC5160i)) || (i10 & 6) == 4);
        Object objF3 = interfaceC1554l.f();
        if (zL2 || objF3 == InterfaceC1554l.INSTANCE.a()) {
            objF3 = new b(interfaceC5160i, c1124k, null);
            interfaceC1554l.J(objF3);
        }
        C1516O.e(interfaceC5160i, (p) objF3, interfaceC1554l, i11);
        x1<h> x1VarC = c1124k.c();
        if (C1560o.J()) {
            C1560o.R();
        }
        interfaceC1554l.I();
        return x1VarC;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C1155r)) {
            return false;
        }
        C1155r c1155r = (C1155r) other;
        if (h.w(this.defaultElevation, c1155r.defaultElevation) && h.w(this.pressedElevation, c1155r.pressedElevation) && h.w(this.hoveredElevation, c1155r.hoveredElevation)) {
            return h.w(this.focusedElevation, c1155r.focusedElevation);
        }
        return false;
    }

    public int hashCode() {
        return (((((h.x(this.defaultElevation) * 31) + h.x(this.pressedElevation)) * 31) + h.x(this.hoveredElevation)) * 31) + h.x(this.focusedElevation);
    }

    private C1155r(float f10, float f11, float f12, float f13) {
        this.defaultElevation = f10;
        this.pressedElevation = f11;
        this.hoveredElevation = f12;
        this.focusedElevation = f13;
    }
}
