package q5;

import Xb.A0;
import Xb.C1837g;
import Xb.C1841i;
import Xb.F;
import Xb.G0;
import Xb.InterfaceC1867v0;
import Xb.Z;
import h5.C3490a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3862t;
import l4.AbstractC3900b;
import n4.SafetyManualRequestInput;
import oa.C4153F;
import oa.C4173r;
import r4.InterfaceC4346c;
import ta.AbstractC4585a;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: ManualViewModel.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001dR\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010#R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0%8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001f0%8F¢\u0006\u0006\u001a\u0004\b)\u0010'¨\u0006+"}, d2 = {"Lq5/u;", "Landroidx/lifecycle/Y;", "Lr4/c;", "safetyManualUseCase", "LG5/a;", "preference", "<init>", "(Lr4/c;LG5/a;)V", "Ll4/b;", "", "it", "Loa/F;", "m", "(Ll4/b;)V", "webURL", "j", "(Ljava/lang/String;)V", "g", "()V", "b", "Lr4/c;", "c", "LG5/a;", "LXb/v0;", "d", "LXb/v0;", "job", "Landroidx/lifecycle/D;", "e", "Landroidx/lifecycle/D;", "_safetyManual", "", "f", "_showLocalCopy", "LXb/F;", "LXb/F;", "coroutineExceptionHandler", "Landroidx/lifecycle/B;", "k", "()Landroidx/lifecycle/B;", "safetyManual", "l", "showLocalCopy", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: q5.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4311u extends android.view.Y {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4346c safetyManualUseCase;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final G5.a preference;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1867v0 job;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final android.view.D<String> _safetyManual;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final android.view.D<Boolean> _showLocalCopy;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Xb.F coroutineExceptionHandler;

    /* compiled from: ManualViewModel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.qsg.ui.info.ManualViewModel$fetchSafetyManual$1", f = "ManualViewModel.kt", l = {36, 41}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: q5.u$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements Ba.p<Xb.I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f48071B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ String f48073D;

        /* compiled from: ManualViewModel.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.qsg.ui.info.ManualViewModel$fetchSafetyManual$1$1", f = "ManualViewModel.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
        /* renamed from: q5.u$a$a, reason: collision with other inner class name */
        static final class C0668a extends kotlin.coroutines.jvm.internal.l implements Ba.p<Xb.I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f48074B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ C4311u f48075C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ AbstractC3900b<String> f48076D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0668a(C4311u c4311u, AbstractC3900b<String> abstractC3900b, InterfaceC4588d<? super C0668a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f48075C = c4311u;
                this.f48076D = abstractC3900b;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new C0668a(this.f48075C, this.f48076D, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(Xb.I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((C0668a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C4696b.e();
                if (this.f48074B != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
                this.f48075C.m(this.f48076D);
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f48073D = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return C4311u.this.new a(this.f48073D, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(Xb.I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f48071B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC4346c interfaceC4346c = C4311u.this.safetyManualUseCase;
                SafetyManualRequestInput safetyManualRequestInput = new SafetyManualRequestInput(this.f48073D, C3490a.INSTANCE.a());
                this.f48071B = 1;
                obj = interfaceC4346c.a(safetyManualRequestInput, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C4173r.b(obj);
                    return C4153F.f46609a;
                }
                C4173r.b(obj);
            }
            G0 g0C = Z.c();
            C0668a c0668a = new C0668a(C4311u.this, (AbstractC3900b) obj, null);
            this.f48071B = 2;
            if (C1837g.g(g0C, c0668a, this) == objE) {
                return objE;
            }
            return C4153F.f46609a;
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"q5/u$b", "Lta/a;", "LXb/F;", "Lta/g;", "context", "", "exception", "Loa/F;", "y", "(Lta/g;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: q5.u$b */
    public static final class b extends AbstractC4585a implements Xb.F {
        public b(F.Companion companion) {
            super(companion);
        }

        @Override // Xb.F
        public void y(ta.g context, Throwable exception) {
            U4.b.e("Exception", exception);
        }
    }

    public C4311u(InterfaceC4346c safetyManualUseCase, G5.a preference) {
        C3862t.g(safetyManualUseCase, "safetyManualUseCase");
        C3862t.g(preference, "preference");
        this.safetyManualUseCase = safetyManualUseCase;
        this.preference = preference;
        this._safetyManual = new android.view.D<>();
        this._showLocalCopy = new android.view.D<>();
        this.coroutineExceptionHandler = new b(Xb.F.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void m(AbstractC3900b<String> it) {
        if (it instanceof AbstractC3900b.a) {
            this._showLocalCopy.l(Boolean.TRUE);
        } else {
            if (!(it instanceof AbstractC3900b.C0590b)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = (String) ((AbstractC3900b.C0590b) it).a();
            if (str != null) {
                this._safetyManual.l(str);
            }
        }
    }

    @Override // android.view.Y
    protected void g() {
        super.g();
        InterfaceC1867v0 interfaceC1867v0 = this.job;
        if (interfaceC1867v0 != null) {
            InterfaceC1867v0.a.a(interfaceC1867v0, null, 1, null);
        }
        A0.i(android.view.Z.a(this).getCoroutineContext(), null, 1, null);
    }

    public final void j(String webURL) {
        C3862t.g(webURL, "webURL");
        this.job = C1841i.d(android.view.Z.a(this), Z.b().s(this.coroutineExceptionHandler), null, new a(webURL, null), 2, null);
    }

    public final android.view.B<String> k() {
        return this._safetyManual;
    }

    public final android.view.B<Boolean> l() {
        return this._showLocalCopy;
    }
}
