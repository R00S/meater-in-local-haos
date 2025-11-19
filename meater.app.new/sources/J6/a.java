package J6;

import Ba.p;
import F3.j;
import ac.InterfaceC1970e;
import ac.InterfaceC1971f;
import android.app.Activity;
import java.util.List;
import kotlin.C1560o;
import kotlin.InterfaceC1497E0;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C3862t;
import kotlin.m1;
import kotlin.x1;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: DisplayFeatures.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/app/Activity;", "activity", "", "LF3/a;", "a", "(Landroid/app/Activity;LO/l;I)Ljava/util/List;", "adaptive_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class a {

    /* compiled from: DisplayFeatures.kt */
    @f(c = "com.google.accompanist.adaptive.DisplayFeaturesKt$calculateDisplayFeatures$displayFeatures$2", f = "DisplayFeatures.kt", l = {38}, m = "invokeSuspend")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: J6.a$a, reason: collision with other inner class name */
    static final class C0155a extends l implements p<InterfaceC1497E0<List<? extends F3.a>>, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f7635B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f7636C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ InterfaceC1970e<j> f7637D;

        /* compiled from: DisplayFeatures.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: J6.a$a$a, reason: collision with other inner class name */
        static final class C0156a implements InterfaceC1971f<j> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ InterfaceC1497E0<List<F3.a>> f7638B;

            C0156a(InterfaceC1497E0<List<F3.a>> interfaceC1497E0) {
                this.f7638B = interfaceC1497E0;
            }

            @Override // ac.InterfaceC1971f
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object a(j jVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                this.f7638B.setValue(jVar.a());
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0155a(InterfaceC1970e<j> interfaceC1970e, InterfaceC4588d<? super C0155a> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f7637D = interfaceC1970e;
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC1497E0<List<F3.a>> interfaceC1497E0, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((C0155a) create(interfaceC1497E0, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            C0155a c0155a = new C0155a(this.f7637D, interfaceC4588d);
            c0155a.f7636C = obj;
            return c0155a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f7635B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC1497E0 interfaceC1497E0 = (InterfaceC1497E0) this.f7636C;
                InterfaceC1970e<j> interfaceC1970e = this.f7637D;
                C0156a c0156a = new C0156a(interfaceC1497E0);
                this.f7635B = 1;
                if (interfaceC1970e.b(c0156a, this) == objE) {
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

    public static final List<F3.a> a(Activity activity, InterfaceC1554l interfaceC1554l, int i10) {
        C3862t.g(activity, "activity");
        interfaceC1554l.e(1964197697);
        if (C1560o.J()) {
            C1560o.S(1964197697, i10, -1, "com.google.accompanist.adaptive.calculateDisplayFeatures (DisplayFeatures.kt:30)");
        }
        interfaceC1554l.e(1157296644);
        boolean zR = interfaceC1554l.R(activity);
        Object objF = interfaceC1554l.f();
        if (zR || objF == InterfaceC1554l.INSTANCE.a()) {
            objF = F3.f.INSTANCE.d(activity);
            interfaceC1554l.J(objF);
        }
        interfaceC1554l.O();
        F3.f fVar = (F3.f) objF;
        interfaceC1554l.e(511388516);
        boolean zR2 = interfaceC1554l.R(fVar) | interfaceC1554l.R(activity);
        Object objF2 = interfaceC1554l.f();
        if (zR2 || objF2 == InterfaceC1554l.INSTANCE.a()) {
            objF2 = fVar.a(activity);
            interfaceC1554l.J(objF2);
        }
        interfaceC1554l.O();
        List<F3.a> listB = b(m1.j(r.m(), new C0155a((InterfaceC1970e) objF2, null), interfaceC1554l, 64));
        if (C1560o.J()) {
            C1560o.R();
        }
        interfaceC1554l.O();
        return listB;
    }

    private static final List<F3.a> b(x1<? extends List<? extends F3.a>> x1Var) {
        return (List) x1Var.getValue();
    }
}
