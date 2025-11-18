package i5;

import Ba.p;
import Xb.C1841i;
import Xb.F;
import Xb.I;
import Xb.InterfaceC1867v0;
import android.util.Patterns;
import android.view.D;
import android.view.Z;
import com.apptionlabs.meater_app.R;
import e5.C3197a;
import fa.AbstractC3352a;
import j5.ForgotState;
import ja.C3756a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C3862t;
import l4.AbstractC3900b;
import l4.InterfaceC3899a;
import m4.CommonResponse;
import oa.C4153F;
import oa.C4173r;
import t4.InterfaceC4553c;
import ta.AbstractC4585a;
import ta.InterfaceC4588d;
import ta.g;
import ua.C4696b;

/* compiled from: ForgotPasswordViewModel.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0082@¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR(\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Li5/f;", "Lfa/a;", "Lt4/c;", "useCase", "LG5/a;", "preference", "<init>", "(Lt4/c;LG5/a;)V", "Ll4/b;", "Lm4/c;", "it", "Loa/F;", "s", "(Ll4/b;Lta/d;)Ljava/lang/Object;", "Ll4/b$a;", "resource", "", "v", "(Ll4/b$a;)Z", "t", "()V", "u", "g", "Lt4/c;", "h", "LG5/a;", "LXb/v0;", "i", "LXb/v0;", "job", "Landroidx/lifecycle/D;", "", "j", "Landroidx/lifecycle/D;", "r", "()Landroidx/lifecycle/D;", "setEmailAddress", "(Landroidx/lifecycle/D;)V", "emailAddress", "LXb/F;", "k", "LXb/F;", "coroutineExceptionHandler", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class f extends AbstractC3352a {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4553c useCase;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final G5.a preference;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1867v0 job;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private D<String> emailAddress;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final F coroutineExceptionHandler;

    /* compiled from: ForgotPasswordViewModel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.qsg.ui.auth.forgot.ForgotPasswordViewModel$recoverPassword$1", f = "ForgotPasswordViewModel.kt", l = {36, 40, 45}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lja/a;", "it", "Loa/F;", "<anonymous>", "(Lja/a;)V"}, k = 3, mv = {2, 0, 0})
    static final class a extends l implements p<C3756a, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        boolean f43093B;

        /* renamed from: C, reason: collision with root package name */
        int f43094C;

        /* compiled from: ForgotPasswordViewModel.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.qsg.ui.auth.forgot.ForgotPasswordViewModel$recoverPassword$1$1", f = "ForgotPasswordViewModel.kt", l = {47, 49}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
        /* renamed from: i5.f$a$a, reason: collision with other inner class name */
        static final class C0546a extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f43096B;

            /* renamed from: C, reason: collision with root package name */
            private /* synthetic */ Object f43097C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ f f43098D;

            /* compiled from: ForgotPasswordViewModel.kt */
            @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.qsg.ui.auth.forgot.ForgotPasswordViewModel$recoverPassword$1$1$2$1", f = "ForgotPasswordViewModel.kt", l = {50}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
            /* renamed from: i5.f$a$a$a, reason: collision with other inner class name */
            static final class C0547a extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

                /* renamed from: B, reason: collision with root package name */
                int f43099B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ f f43100C;

                /* renamed from: D, reason: collision with root package name */
                final /* synthetic */ AbstractC3900b<CommonResponse> f43101D;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0547a(f fVar, AbstractC3900b<CommonResponse> abstractC3900b, InterfaceC4588d<? super C0547a> interfaceC4588d) {
                    super(2, interfaceC4588d);
                    this.f43100C = fVar;
                    this.f43101D = abstractC3900b;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                    return new C0547a(this.f43100C, this.f43101D, interfaceC4588d);
                }

                @Override // Ba.p
                public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                    return ((C0547a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = C4696b.e();
                    int i10 = this.f43099B;
                    if (i10 == 0) {
                        C4173r.b(obj);
                        f fVar = this.f43100C;
                        AbstractC3900b<CommonResponse> abstractC3900b = this.f43101D;
                        this.f43099B = 1;
                        if (fVar.s(abstractC3900b, this) == objE) {
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
            C0546a(f fVar, InterfaceC4588d<? super C0546a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f43098D = fVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                C0546a c0546a = new C0546a(this.f43098D, interfaceC4588d);
                c0546a.f43097C = obj;
                return c0546a;
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((C0546a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = ua.C4696b.e()
                    int r1 = r7.f43096B
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L22
                    if (r1 == r3) goto L1c
                    if (r1 != r2) goto L14
                    java.lang.Object r0 = r7.f43097C
                    oa.C4173r.b(r8)
                    goto L7d
                L14:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1c:
                    oa.C4173r.b(r8)     // Catch: java.lang.Throwable -> L20
                    goto L4b
                L20:
                    r8 = move-exception
                    goto L52
                L22:
                    oa.C4173r.b(r8)
                    java.lang.Object r8 = r7.f43097C
                    Xb.I r8 = (Xb.I) r8
                    i5.f r8 = r7.f43098D
                    oa.q$a r1 = oa.C4172q.INSTANCE     // Catch: java.lang.Throwable -> L20
                    t4.c r1 = i5.f.o(r8)     // Catch: java.lang.Throwable -> L20
                    p4.f r4 = new p4.f     // Catch: java.lang.Throwable -> L20
                    androidx.lifecycle.D r8 = r8.r()     // Catch: java.lang.Throwable -> L20
                    java.lang.Object r8 = r8.e()     // Catch: java.lang.Throwable -> L20
                    java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L20
                    r4.<init>(r8)     // Catch: java.lang.Throwable -> L20
                    r7.f43096B = r3     // Catch: java.lang.Throwable -> L20
                    java.lang.Object r8 = r1.a(r4, r7)     // Catch: java.lang.Throwable -> L20
                    if (r8 != r0) goto L4b
                    return r0
                L4b:
                    l4.b r8 = (l4.AbstractC3900b) r8     // Catch: java.lang.Throwable -> L20
                    java.lang.Object r8 = oa.C4172q.a(r8)     // Catch: java.lang.Throwable -> L20
                    goto L5c
                L52:
                    oa.q$a r1 = oa.C4172q.INSTANCE
                    java.lang.Object r8 = oa.C4173r.a(r8)
                    java.lang.Object r8 = oa.C4172q.a(r8)
                L5c:
                    i5.f r1 = r7.f43098D
                    boolean r3 = oa.C4172q.d(r8)
                    if (r3 == 0) goto L7e
                    r3 = r8
                    l4.b r3 = (l4.AbstractC3900b) r3
                    Xb.G0 r4 = Xb.Z.c()
                    i5.f$a$a$a r5 = new i5.f$a$a$a
                    r6 = 0
                    r5.<init>(r1, r3, r6)
                    r7.f43097C = r8
                    r7.f43096B = r2
                    java.lang.Object r1 = Xb.C1837g.g(r4, r5, r7)
                    if (r1 != r0) goto L7c
                    return r0
                L7c:
                    r0 = r8
                L7d:
                    r8 = r0
                L7e:
                    java.lang.Throwable r8 = oa.C4172q.b(r8)
                    if (r8 == 0) goto L8d
                    java.lang.String r0 = "Exception"
                    java.lang.Object[] r8 = new java.lang.Object[]{r8}
                    U4.b.e(r0, r8)
                L8d:
                    oa.F r8 = oa.C4153F.f46609a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: i5.f.a.C0546a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        a(InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C3756a c3756a, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(c3756a, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return f.this.new a(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean zMatches;
            Object objE = C4696b.e();
            int i10 = this.f43094C;
            if (i10 == 0) {
                C4173r.b(obj);
                zMatches = Patterns.EMAIL_ADDRESS.matcher(String.valueOf(f.this.r().e())).matches();
                if (zMatches) {
                    f fVar = f.this;
                    ForgotState forgotState = new ForgotState(false, null, null, kotlin.coroutines.jvm.internal.b.c(0), null, 23, null);
                    this.f43093B = zMatches;
                    this.f43094C = 2;
                    if (fVar.m(forgotState, this) == objE) {
                        return objE;
                    }
                } else {
                    f fVar2 = f.this;
                    ForgotState forgotState2 = new ForgotState(false, null, null, kotlin.coroutines.jvm.internal.b.c(R.string.empty_email_field_error), null, 23, null);
                    this.f43093B = zMatches;
                    this.f43094C = 1;
                    if (fVar2.m(forgotState2, this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C4173r.b(obj);
                    f fVar3 = f.this;
                    fVar3.job = C1841i.d(Z.a(fVar3), Xb.Z.b().s(f.this.coroutineExceptionHandler), null, new C0546a(f.this, null), 2, null);
                    return C4153F.f46609a;
                }
                zMatches = this.f43093B;
                C4173r.b(obj);
            }
            if (zMatches) {
                f fVar4 = f.this;
                ForgotState forgotState3 = new ForgotState(true, null, null, null, null, 30, null);
                this.f43094C = 3;
                if (fVar4.m(forgotState3, this) == objE) {
                    return objE;
                }
                f fVar32 = f.this;
                fVar32.job = C1841i.d(Z.a(fVar32), Xb.Z.b().s(f.this.coroutineExceptionHandler), null, new C0546a(f.this, null), 2, null);
            }
            return C4153F.f46609a;
        }
    }

    /* compiled from: ForgotPasswordViewModel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.qsg.ui.auth.forgot.ForgotPasswordViewModel$resetState$1", f = "ForgotPasswordViewModel.kt", l = {97}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lja/a;", "it", "Loa/F;", "<anonymous>", "(Lja/a;)V"}, k = 3, mv = {2, 0, 0})
    static final class b extends l implements p<C3756a, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f43102B;

        b(InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C3756a c3756a, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((b) create(c3756a, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return f.this.new b(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f43102B;
            if (i10 == 0) {
                C4173r.b(obj);
                f fVar = f.this;
                ForgotState forgotState = new ForgotState(false, null, null, null, null, 31, null);
                this.f43102B = 1;
                if (fVar.m(forgotState, this) == objE) {
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

    /* compiled from: CoroutineExceptionHandler.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"i5/f$c", "Lta/a;", "LXb/F;", "Lta/g;", "context", "", "exception", "Loa/F;", "y", "(Lta/g;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends AbstractC4585a implements F {
        public c(F.Companion companion) {
            super(companion);
        }

        @Override // Xb.F
        public void y(g context, Throwable exception) {
            U4.b.e("Exception", exception);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(InterfaceC4553c useCase, G5.a preference) {
        super(new ForgotState(false, null, null, null, null, 31, null), null, null, 6, null);
        C3862t.g(useCase, "useCase");
        C3862t.g(preference, "preference");
        this.useCase = useCase;
        this.preference = preference;
        this.emailAddress = new D<>();
        this.coroutineExceptionHandler = new c(F.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s(AbstractC3900b<CommonResponse> abstractC3900b, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        if (!(abstractC3900b instanceof AbstractC3900b.a)) {
            if (!(abstractC3900b instanceof AbstractC3900b.C0590b)) {
                throw new NoWhenBranchMatchedException();
            }
            Object objM = m(new ForgotState(false, null, kotlin.coroutines.jvm.internal.b.a(true), null, null, 26, null), interfaceC4588d);
            return objM == C4696b.e() ? objM : C4153F.f46609a;
        }
        AbstractC3900b.a<CommonResponse> aVar = (AbstractC3900b.a) abstractC3900b;
        if (v(aVar)) {
            Object objM2 = m(new ForgotState(false, null, null, null, kotlin.coroutines.jvm.internal.b.c(502), 14, null), interfaceC4588d);
            return objM2 == C4696b.e() ? objM2 : C4153F.f46609a;
        }
        InterfaceC3899a error = aVar.getError();
        Object objM3 = m(new ForgotState(false, error != null ? C3197a.c(error) : null, null, null, null, 28, null), interfaceC4588d);
        return objM3 == C4696b.e() ? objM3 : C4153F.f46609a;
    }

    private final boolean v(AbstractC3900b.a<CommonResponse> resource) {
        InterfaceC3899a error = resource.getError();
        return error != null && C3197a.b(error) == 502;
    }

    public final D<String> r() {
        return this.emailAddress;
    }

    public final void t() {
        h(new a(null));
    }

    public final void u() {
        h(new b(null));
    }
}
