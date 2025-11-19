package F3;

import Ba.p;
import F3.i;
import Xb.Z;
import Zb.r;
import Zb.t;
import ac.C1972g;
import ac.InterfaceC1970e;
import android.app.Activity;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import o3.ExecutorC4121m;
import oa.C4153F;
import oa.C4173r;
import r1.InterfaceC4334a;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: WindowInfoTrackerImpl.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LF3/i;", "LF3/f;", "LF3/l;", "windowMetricsCalculator", "LG3/a;", "windowBackend", "<init>", "(LF3/l;LG3/a;)V", "Landroid/app/Activity;", "activity", "Lac/e;", "LF3/j;", "a", "(Landroid/app/Activity;)Lac/e;", "b", "LF3/l;", "c", "LG3/a;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i implements f {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l windowMetricsCalculator;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final G3.a windowBackend;

    /* compiled from: WindowInfoTrackerImpl.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$2", f = "WindowInfoTrackerImpl.kt", l = {63}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LZb/t;", "LF3/j;", "Loa/F;", "<anonymous>", "(LZb/t;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.l implements p<t<? super j>, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f4513B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f4514C;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Activity f4516E;

        /* compiled from: WindowInfoTrackerImpl.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loa/F;", "a", "()V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: F3.i$a$a, reason: collision with other inner class name */
        static final class C0086a extends AbstractC3864v implements Ba.a<C4153F> {

            /* renamed from: B, reason: collision with root package name */
            final /* synthetic */ i f4517B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ InterfaceC4334a<j> f4518C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0086a(i iVar, InterfaceC4334a<j> interfaceC4334a) {
                super(0);
                this.f4517B = iVar;
                this.f4518C = interfaceC4334a;
            }

            public final void a() {
                this.f4517B.windowBackend.b(this.f4518C);
            }

            @Override // Ba.a
            public /* bridge */ /* synthetic */ C4153F invoke() {
                a();
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Activity activity, InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f4516E = activity;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n(t tVar, j jVar) {
            tVar.w(jVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            a aVar = i.this.new a(this.f4516E, interfaceC4588d);
            aVar.f4514C = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f4513B;
            if (i10 == 0) {
                C4173r.b(obj);
                final t tVar = (t) this.f4514C;
                InterfaceC4334a<j> interfaceC4334a = new InterfaceC4334a() { // from class: F3.h
                    @Override // r1.InterfaceC4334a
                    public final void accept(Object obj2) {
                        i.a.n(tVar, (j) obj2);
                    }
                };
                i.this.windowBackend.a(this.f4516E, new ExecutorC4121m(), interfaceC4334a);
                C0086a c0086a = new C0086a(i.this, interfaceC4334a);
                this.f4513B = 1;
                if (r.a(tVar, c0086a, this) == objE) {
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

        @Override // Ba.p
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(t<? super j> tVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(tVar, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }
    }

    public i(l windowMetricsCalculator, G3.a windowBackend) {
        C3862t.g(windowMetricsCalculator, "windowMetricsCalculator");
        C3862t.g(windowBackend, "windowBackend");
        this.windowMetricsCalculator = windowMetricsCalculator;
        this.windowBackend = windowBackend;
    }

    @Override // F3.f
    public InterfaceC1970e<j> a(Activity activity) {
        C3862t.g(activity, "activity");
        return C1972g.t(C1972g.e(new a(activity, null)), Z.c());
    }
}
