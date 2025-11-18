package k5;

import Ba.p;
import Xb.A0;
import Xb.F;
import Xb.I;
import Xb.InterfaceC1867v0;
import android.view.D;
import android.view.Z;
import com.apptionlabs.meater_app.model.MEATERCloudAccount;
import e5.C3197a;
import fa.AbstractC3352a;
import ja.C3756a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3862t;
import l4.AbstractC3900b;
import l4.InterfaceC3899a;
import l5.UserState;
import oa.C4153F;
import oa.C4173r;
import p4.UserData;
import t4.InterfaceC4555e;
import ta.AbstractC4585a;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: LoginViewModel.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0082@¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001c\u0010\u001aJ\r\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R(\u0010-\u001a\b\u0012\u0004\u0012\u00020&0%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R(\u00101\u001a\b\u0012\u0004\u0012\u00020&0%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010(\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, d2 = {"Lk5/l;", "Lfa/a;", "Lt4/e;", "loginUseCase", "LG5/a;", "preference", "<init>", "(Lt4/e;LG5/a;)V", "Ll4/b;", "Lp4/m;", "it", "Loa/F;", "w", "(Ll4/b;Lta/d;)Ljava/lang/Object;", "data", "z", "(Lp4/m;)V", "resource", "", "y", "(Ll4/b;)Z", "", "errorCode", "r", "(I)Z", "v", "()V", "x", "g", "u", "Lt4/e;", "h", "LG5/a;", "LXb/v0;", "i", "LXb/v0;", "job", "Landroidx/lifecycle/D;", "", "j", "Landroidx/lifecycle/D;", "s", "()Landroidx/lifecycle/D;", "setEmailAddress", "(Landroidx/lifecycle/D;)V", "emailAddress", "k", "t", "setPassword", "password", "LXb/F;", "l", "LXb/F;", "coroutineExceptionHandler", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class l extends AbstractC3352a {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4555e loginUseCase;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final G5.a preference;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1867v0 job;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private D<String> emailAddress;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private D<String> password;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final F coroutineExceptionHandler;

    /* compiled from: LoginViewModel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.qsg.ui.auth.login.LoginViewModel$login$1", f = "LoginViewModel.kt", l = {41, 45, 50, 54, 59}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lja/a;", "it", "Loa/F;", "<anonymous>", "(Lja/a;)V"}, k = 3, mv = {2, 0, 0})
    static final class a extends kotlin.coroutines.jvm.internal.l implements p<C3756a, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        boolean f43766B;

        /* renamed from: C, reason: collision with root package name */
        int f43767C;

        /* renamed from: D, reason: collision with root package name */
        int f43768D;

        /* compiled from: LoginViewModel.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.qsg.ui.auth.login.LoginViewModel$login$1$1", f = "LoginViewModel.kt", l = {62, 68}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
        /* renamed from: k5.l$a$a, reason: collision with other inner class name */
        static final class C0569a extends kotlin.coroutines.jvm.internal.l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f43770B;

            /* renamed from: C, reason: collision with root package name */
            private /* synthetic */ Object f43771C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ l f43772D;

            /* compiled from: LoginViewModel.kt */
            @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.qsg.ui.auth.login.LoginViewModel$login$1$1$2$1", f = "LoginViewModel.kt", l = {69}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
            /* renamed from: k5.l$a$a$a, reason: collision with other inner class name */
            static final class C0570a extends kotlin.coroutines.jvm.internal.l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

                /* renamed from: B, reason: collision with root package name */
                int f43773B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ l f43774C;

                /* renamed from: D, reason: collision with root package name */
                final /* synthetic */ AbstractC3900b<UserData> f43775D;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0570a(l lVar, AbstractC3900b<UserData> abstractC3900b, InterfaceC4588d<? super C0570a> interfaceC4588d) {
                    super(2, interfaceC4588d);
                    this.f43774C = lVar;
                    this.f43775D = abstractC3900b;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                    return new C0570a(this.f43774C, this.f43775D, interfaceC4588d);
                }

                @Override // Ba.p
                public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                    return ((C0570a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = C4696b.e();
                    int i10 = this.f43773B;
                    if (i10 == 0) {
                        C4173r.b(obj);
                        l lVar = this.f43774C;
                        AbstractC3900b<UserData> abstractC3900b = this.f43775D;
                        this.f43773B = 1;
                        if (lVar.w(abstractC3900b, this) == objE) {
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
            C0569a(l lVar, InterfaceC4588d<? super C0569a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f43772D = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                C0569a c0569a = new C0569a(this.f43772D, interfaceC4588d);
                c0569a.f43771C = obj;
                return c0569a;
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((C0569a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Object r0 = ua.C4696b.e()
                    int r1 = r12.f43770B
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L23
                    if (r1 == r3) goto L1d
                    if (r1 != r2) goto L15
                    java.lang.Object r0 = r12.f43771C
                    oa.C4173r.b(r13)
                    goto L94
                L15:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L1d:
                    oa.C4173r.b(r13)     // Catch: java.lang.Throwable -> L21
                    goto L62
                L21:
                    r13 = move-exception
                    goto L69
                L23:
                    oa.C4173r.b(r13)
                    java.lang.Object r13 = r12.f43771C
                    Xb.I r13 = (Xb.I) r13
                    k5.l r13 = r12.f43772D
                    oa.q$a r1 = oa.C4172q.INSTANCE     // Catch: java.lang.Throwable -> L21
                    t4.e r1 = k5.l.o(r13)     // Catch: java.lang.Throwable -> L21
                    p4.g r11 = new p4.g     // Catch: java.lang.Throwable -> L21
                    androidx.lifecycle.D r4 = r13.s()     // Catch: java.lang.Throwable -> L21
                    java.lang.Object r4 = r4.e()     // Catch: java.lang.Throwable -> L21
                    java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L21
                    androidx.lifecycle.D r13 = r13.t()     // Catch: java.lang.Throwable -> L21
                    java.lang.Object r13 = r13.e()     // Catch: java.lang.Throwable -> L21
                    java.lang.String r6 = java.lang.String.valueOf(r13)     // Catch: java.lang.Throwable -> L21
                    h5.a$a r13 = h5.C3490a.INSTANCE     // Catch: java.lang.Throwable -> L21
                    p4.e r8 = r13.a()     // Catch: java.lang.Throwable -> L21
                    r9 = 4
                    r10 = 0
                    r7 = 0
                    r4 = r11
                    r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L21
                    r12.f43770B = r3     // Catch: java.lang.Throwable -> L21
                    java.lang.Object r13 = r1.a(r11, r12)     // Catch: java.lang.Throwable -> L21
                    if (r13 != r0) goto L62
                    return r0
                L62:
                    l4.b r13 = (l4.AbstractC3900b) r13     // Catch: java.lang.Throwable -> L21
                    java.lang.Object r13 = oa.C4172q.a(r13)     // Catch: java.lang.Throwable -> L21
                    goto L73
                L69:
                    oa.q$a r1 = oa.C4172q.INSTANCE
                    java.lang.Object r13 = oa.C4173r.a(r13)
                    java.lang.Object r13 = oa.C4172q.a(r13)
                L73:
                    k5.l r1 = r12.f43772D
                    boolean r3 = oa.C4172q.d(r13)
                    if (r3 == 0) goto L95
                    r3 = r13
                    l4.b r3 = (l4.AbstractC3900b) r3
                    Xb.G0 r4 = Xb.Z.c()
                    k5.l$a$a$a r5 = new k5.l$a$a$a
                    r6 = 0
                    r5.<init>(r1, r3, r6)
                    r12.f43771C = r13
                    r12.f43770B = r2
                    java.lang.Object r1 = Xb.C1837g.g(r4, r5, r12)
                    if (r1 != r0) goto L93
                    return r0
                L93:
                    r0 = r13
                L94:
                    r13 = r0
                L95:
                    java.lang.Throwable r13 = oa.C4172q.b(r13)
                    if (r13 == 0) goto La4
                    java.lang.String r0 = "Exception"
                    java.lang.Object[] r13 = new java.lang.Object[]{r13}
                    U4.b.e(r0, r13)
                La4:
                    oa.F r13 = oa.C4153F.f46609a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: k5.l.a.C0569a.invokeSuspend(java.lang.Object):java.lang.Object");
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
            return l.this.new a(interfaceC4588d);
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x0133 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 349
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: k5.l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: LoginViewModel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.qsg.ui.auth.login.LoginViewModel$resetState$1", f = "LoginViewModel.kt", l = {140}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lja/a;", "it", "Loa/F;", "<anonymous>", "(Lja/a;)V"}, k = 3, mv = {2, 0, 0})
    static final class b extends kotlin.coroutines.jvm.internal.l implements p<C3756a, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f43776B;

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
            return l.this.new b(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f43776B;
            if (i10 == 0) {
                C4173r.b(obj);
                l lVar = l.this;
                UserState userState = new UserState(false, null, null, null, null, null, null, 127, null);
                this.f43776B = 1;
                if (lVar.m(userState, this) == objE) {
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
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"k5/l$c", "Lta/a;", "LXb/F;", "Lta/g;", "context", "", "exception", "Loa/F;", "y", "(Lta/g;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends AbstractC4585a implements F {
        public c(F.Companion companion) {
            super(companion);
        }

        @Override // Xb.F
        public void y(ta.g context, Throwable exception) {
            U4.b.e("Exception", exception);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(InterfaceC4555e loginUseCase, G5.a preference) {
        super(new UserState(false, null, null, null, null, null, null, 127, null), null, null, 6, null);
        C3862t.g(loginUseCase, "loginUseCase");
        C3862t.g(preference, "preference");
        this.loginUseCase = loginUseCase;
        this.preference = preference;
        this.emailAddress = new D<>();
        this.password = new D<>();
        this.coroutineExceptionHandler = new c(F.INSTANCE);
    }

    private final boolean r(int errorCode) {
        return errorCode == 4 || errorCode == 7 || errorCode == 400 || errorCode == 403 || errorCode == 404 || errorCode >= 500;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object w(AbstractC3900b<UserData> abstractC3900b, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        if (!(abstractC3900b instanceof AbstractC3900b.a)) {
            if (!(abstractC3900b instanceof AbstractC3900b.C0590b)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC3900b.C0590b c0590b = (AbstractC3900b.C0590b) abstractC3900b;
            z((UserData) c0590b.a());
            Object objM = m(new UserState(false, null, (UserData) c0590b.a(), null, null, null, null, 122, null), interfaceC4588d);
            return objM == C4696b.e() ? objM : C4153F.f46609a;
        }
        Integer numC = null;
        numC = null;
        if (y(abstractC3900b)) {
            InterfaceC3899a error = ((AbstractC3900b.a) abstractC3900b).getError();
            Object objM2 = m(new UserState(false, null, null, null, null, error != null ? C3197a.c(error) : null, null, 94, null), interfaceC4588d);
            return objM2 == C4696b.e() ? objM2 : C4153F.f46609a;
        }
        AbstractC3900b.a aVar = (AbstractC3900b.a) abstractC3900b;
        InterfaceC3899a error2 = aVar.getError();
        String strC = error2 != null ? C3197a.c(error2) : null;
        InterfaceC3899a error3 = aVar.getError();
        if (error3 != null && C3197a.b(error3) == 8) {
            z((UserData) aVar.a());
            numC = kotlin.coroutines.jvm.internal.b.c(8);
        }
        Object objM3 = m(new UserState(false, strC, null, null, null, null, numC, 60, null), interfaceC4588d);
        return objM3 == C4696b.e() ? objM3 : C4153F.f46609a;
    }

    private final boolean y(AbstractC3900b<UserData> resource) {
        InterfaceC3899a error = resource.getError();
        C3862t.d(error);
        return r(C3197a.b(error)) || C3862t.b(resource.getError(), InterfaceC3899a.b.f44358a);
    }

    private final void z(UserData data) {
        MEATERCloudAccount mEATERCloudAccount = new MEATERCloudAccount();
        if (data != null) {
            mEATERCloudAccount.name = data.getAccountName();
            mEATERCloudAccount.email = this.emailAddress.e();
            mEATERCloudAccount.password = this.password.e();
            mEATERCloudAccount.type = MEATERCloudAccount.AccountType.EmailAndPassword;
            mEATERCloudAccount.accessToken = data.getAccessToken();
            this.preference.k1(mEATERCloudAccount);
        }
    }

    @Override // fa.AbstractC3352a, android.view.Y
    protected void g() {
        super.g();
        InterfaceC1867v0 interfaceC1867v0 = this.job;
        if (interfaceC1867v0 != null) {
            InterfaceC1867v0.a.a(interfaceC1867v0, null, 1, null);
        }
        A0.i(Z.a(this).getCoroutineContext(), null, 1, null);
    }

    public final D<String> s() {
        return this.emailAddress;
    }

    public final D<String> t() {
        return this.password;
    }

    public final void u() {
        this.preference.M();
    }

    public final void v() {
        h(new a(null));
    }

    public final void x() {
        h(new b(null));
    }
}
