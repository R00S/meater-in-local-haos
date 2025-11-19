package m5;

import Ba.p;
import Xb.C1841i;
import Xb.F;
import Xb.I;
import Xb.InterfaceC1867v0;
import android.util.Patterns;
import android.view.D;
import android.view.Z;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.model.MEATERCloudAccount;
import com.apptionlabs.meater_app.model.TemperatureLog;
import e5.C3197a;
import fa.AbstractC3352a;
import ja.C3756a;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import l4.AbstractC3900b;
import l4.InterfaceC3899a;
import n5.SignUpState;
import oa.C4153F;
import oa.C4173r;
import p4.UserData;
import t4.InterfaceC4555e;
import t4.InterfaceC4558h;
import ta.AbstractC4585a;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: SignUpViewModel.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0010\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u000f¢\u0006\u0004\b!\u0010 J\r\u0010\"\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010 J\r\u0010#\u001a\u00020\u000f¢\u0006\u0004\b#\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R(\u00106\u001a\b\u0012\u0004\u0012\u00020/0.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R(\u0010:\u001a\b\u0012\u0004\u0012\u00020/0.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00101\u001a\u0004\b8\u00103\"\u0004\b9\u00105R(\u0010>\u001a\b\u0012\u0004\u0012\u00020/0.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u00101\u001a\u0004\b<\u00103\"\u0004\b=\u00105R(\u0010B\u001a\b\u0012\u0004\u0012\u00020/0.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u00101\u001a\u0004\b@\u00103\"\u0004\bA\u00105R(\u0010F\u001a\b\u0012\u0004\u0012\u00020/0.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u00101\u001a\u0004\bD\u00103\"\u0004\bE\u00105R0\u0010K\u001a\u0010\u0012\f\u0012\n G*\u0004\u0018\u00010\r0\r0.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u00101\u001a\u0004\bI\u00103\"\u0004\bJ\u00105R$\u0010R\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0017\u0010X\u001a\u00020S8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u0014\u0010[\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010Z¨\u0006\\"}, d2 = {"Lm5/a;", "Lfa/a;", "Lt4/h;", "signUpCase", "Lt4/e;", "loginCase", "LG5/a;", "preference", "<init>", "(Lt4/h;Lt4/e;LG5/a;)V", "Ll4/b;", "Lp4/m;", "it", "", "signUpResponse", "Loa/F;", "E", "(Ll4/b;ZLta/d;)Ljava/lang/Object;", "data", "K", "(Lp4/m;)V", "J", "resource", "H", "(Ll4/b;)Z", "", "errorCode", "s", "(I)Z", "C", "()Z", "I", "()V", "D", "F", "B", "g", "Lt4/h;", "h", "Lt4/e;", "i", "LG5/a;", "LXb/v0;", "j", "LXb/v0;", "job", "Landroidx/lifecycle/D;", "", "k", "Landroidx/lifecycle/D;", "x", "()Landroidx/lifecycle/D;", "setFirstName", "(Landroidx/lifecycle/D;)V", "firstName", "l", "y", "setLastName", "lastName", "m", "v", "setEmailAddress", "emailAddress", "n", "z", "setPassword", "password", "o", "u", "setConfirmPassword", "confirmPassword", "kotlin.jvm.PlatformType", "p", "A", "setTermCheck", "termCheck", "q", "Ljava/lang/Boolean;", "w", "()Ljava/lang/Boolean;", "G", "(Ljava/lang/Boolean;)V", "emailOptInCheck", "Lcom/apptionlabs/meater_app/model/MEATERCloudAccount;", "r", "Lcom/apptionlabs/meater_app/model/MEATERCloudAccount;", "t", "()Lcom/apptionlabs/meater_app/model/MEATERCloudAccount;", "account", "LXb/F;", "LXb/F;", "coroutineExceptionHandler", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: m5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3953a extends AbstractC3352a {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4558h signUpCase;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4555e loginCase;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final G5.a preference;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1867v0 job;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private D<String> firstName;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private D<String> lastName;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private D<String> emailAddress;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private D<String> password;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private D<String> confirmPassword;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private D<Boolean> termCheck;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private Boolean emailOptInCheck;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final MEATERCloudAccount account;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final F coroutineExceptionHandler;

    /* compiled from: SignUpViewModel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.qsg.ui.auth.signup.SignUpViewModel$login$1", f = "SignUpViewModel.kt", l = {241}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lja/a;", "it", "Loa/F;", "<anonymous>", "(Lja/a;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: m5.a$a, reason: collision with other inner class name */
    static final class C0602a extends kotlin.coroutines.jvm.internal.l implements p<C3756a, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f45058B;

        /* compiled from: SignUpViewModel.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.qsg.ui.auth.signup.SignUpViewModel$login$1$1", f = "SignUpViewModel.kt", l = {244, 250}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
        /* renamed from: m5.a$a$a, reason: collision with other inner class name */
        static final class C0603a extends kotlin.coroutines.jvm.internal.l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f45060B;

            /* renamed from: C, reason: collision with root package name */
            private /* synthetic */ Object f45061C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ C3953a f45062D;

            /* compiled from: SignUpViewModel.kt */
            @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.qsg.ui.auth.signup.SignUpViewModel$login$1$1$2$1", f = "SignUpViewModel.kt", l = {251}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
            /* renamed from: m5.a$a$a$a, reason: collision with other inner class name */
            static final class C0604a extends kotlin.coroutines.jvm.internal.l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

                /* renamed from: B, reason: collision with root package name */
                int f45063B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ C3953a f45064C;

                /* renamed from: D, reason: collision with root package name */
                final /* synthetic */ AbstractC3900b<UserData> f45065D;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0604a(C3953a c3953a, AbstractC3900b<UserData> abstractC3900b, InterfaceC4588d<? super C0604a> interfaceC4588d) {
                    super(2, interfaceC4588d);
                    this.f45064C = c3953a;
                    this.f45065D = abstractC3900b;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                    return new C0604a(this.f45064C, this.f45065D, interfaceC4588d);
                }

                @Override // Ba.p
                public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                    return ((C0604a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = C4696b.e();
                    int i10 = this.f45063B;
                    if (i10 == 0) {
                        C4173r.b(obj);
                        C3953a c3953a = this.f45064C;
                        AbstractC3900b<UserData> abstractC3900b = this.f45065D;
                        this.f45063B = 1;
                        if (c3953a.E(abstractC3900b, false, this) == objE) {
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
            C0603a(C3953a c3953a, InterfaceC4588d<? super C0603a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f45062D = c3953a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                C0603a c0603a = new C0603a(this.f45062D, interfaceC4588d);
                c0603a.f45061C = obj;
                return c0603a;
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((C0603a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Object r0 = ua.C4696b.e()
                    int r1 = r12.f45060B
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L23
                    if (r1 == r3) goto L1d
                    if (r1 != r2) goto L15
                    java.lang.Object r0 = r12.f45061C
                    oa.C4173r.b(r13)
                    goto L92
                L15:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L1d:
                    oa.C4173r.b(r13)     // Catch: java.lang.Throwable -> L21
                    goto L60
                L21:
                    r13 = move-exception
                    goto L67
                L23:
                    oa.C4173r.b(r13)
                    java.lang.Object r13 = r12.f45061C
                    Xb.I r13 = (Xb.I) r13
                    m5.a r13 = r12.f45062D
                    oa.q$a r1 = oa.C4172q.INSTANCE     // Catch: java.lang.Throwable -> L21
                    t4.e r1 = m5.C3953a.o(r13)     // Catch: java.lang.Throwable -> L21
                    p4.g r11 = new p4.g     // Catch: java.lang.Throwable -> L21
                    com.apptionlabs.meater_app.model.MEATERCloudAccount r4 = r13.getAccount()     // Catch: java.lang.Throwable -> L21
                    java.lang.String r5 = r4.email     // Catch: java.lang.Throwable -> L21
                    java.lang.String r4 = "email"
                    kotlin.jvm.internal.C3862t.f(r5, r4)     // Catch: java.lang.Throwable -> L21
                    com.apptionlabs.meater_app.model.MEATERCloudAccount r13 = r13.getAccount()     // Catch: java.lang.Throwable -> L21
                    java.lang.String r6 = r13.password     // Catch: java.lang.Throwable -> L21
                    java.lang.String r13 = "password"
                    kotlin.jvm.internal.C3862t.f(r6, r13)     // Catch: java.lang.Throwable -> L21
                    h5.a$a r13 = h5.C3490a.INSTANCE     // Catch: java.lang.Throwable -> L21
                    p4.e r8 = r13.a()     // Catch: java.lang.Throwable -> L21
                    r9 = 4
                    r10 = 0
                    r7 = 0
                    r4 = r11
                    r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L21
                    r12.f45060B = r3     // Catch: java.lang.Throwable -> L21
                    java.lang.Object r13 = r1.a(r11, r12)     // Catch: java.lang.Throwable -> L21
                    if (r13 != r0) goto L60
                    return r0
                L60:
                    l4.b r13 = (l4.AbstractC3900b) r13     // Catch: java.lang.Throwable -> L21
                    java.lang.Object r13 = oa.C4172q.a(r13)     // Catch: java.lang.Throwable -> L21
                    goto L71
                L67:
                    oa.q$a r1 = oa.C4172q.INSTANCE
                    java.lang.Object r13 = oa.C4173r.a(r13)
                    java.lang.Object r13 = oa.C4172q.a(r13)
                L71:
                    m5.a r1 = r12.f45062D
                    boolean r3 = oa.C4172q.d(r13)
                    if (r3 == 0) goto L93
                    r3 = r13
                    l4.b r3 = (l4.AbstractC3900b) r3
                    Xb.G0 r4 = Xb.Z.c()
                    m5.a$a$a$a r5 = new m5.a$a$a$a
                    r6 = 0
                    r5.<init>(r1, r3, r6)
                    r12.f45061C = r13
                    r12.f45060B = r2
                    java.lang.Object r1 = Xb.C1837g.g(r4, r5, r12)
                    if (r1 != r0) goto L91
                    return r0
                L91:
                    r0 = r13
                L92:
                    r13 = r0
                L93:
                    java.lang.Throwable r13 = oa.C4172q.b(r13)
                    if (r13 == 0) goto La2
                    java.lang.String r0 = "Exception"
                    java.lang.Object[] r13 = new java.lang.Object[]{r13}
                    U4.b.e(r0, r13)
                La2:
                    oa.F r13 = oa.C4153F.f46609a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: m5.C3953a.C0602a.C0603a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        C0602a(InterfaceC4588d<? super C0602a> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C3756a c3756a, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((C0602a) create(c3756a, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return C3953a.this.new C0602a(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f45058B;
            if (i10 == 0) {
                C4173r.b(obj);
                C3953a c3953a = C3953a.this;
                SignUpState signUpState = new SignUpState(true, null, null, null, null, null, null, null, null, false, false, null, false, null, null, 32766, null);
                this.f45058B = 1;
                if (c3953a.m(signUpState, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            C3953a c3953a2 = C3953a.this;
            c3953a2.job = C1841i.d(Z.a(c3953a2), Xb.Z.b().s(C3953a.this.coroutineExceptionHandler), null, new C0603a(C3953a.this, null), 2, null);
            return C4153F.f46609a;
        }
    }

    /* compiled from: SignUpViewModel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.qsg.ui.auth.signup.SignUpViewModel", f = "SignUpViewModel.kt", l = {187, 192, 201, 209, 217}, m = "mapState")
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: m5.a$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        Object f45066B;

        /* renamed from: C, reason: collision with root package name */
        Object f45067C;

        /* renamed from: D, reason: collision with root package name */
        /* synthetic */ Object f45068D;

        /* renamed from: F, reason: collision with root package name */
        int f45070F;

        b(InterfaceC4588d<? super b> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f45068D = obj;
            this.f45070F |= Integer.MIN_VALUE;
            return C3953a.this.E(null, false, this);
        }
    }

    /* compiled from: SignUpViewModel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.qsg.ui.auth.signup.SignUpViewModel$resetState$1", f = "SignUpViewModel.kt", l = {274}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lja/a;", "it", "Loa/F;", "<anonymous>", "(Lja/a;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: m5.a$c */
    static final class c extends kotlin.coroutines.jvm.internal.l implements p<C3756a, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f45071B;

        c(InterfaceC4588d<? super c> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C3756a c3756a, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((c) create(c3756a, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return C3953a.this.new c(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f45071B;
            if (i10 == 0) {
                C4173r.b(obj);
                C3953a c3953a = C3953a.this;
                SignUpState signUpState = new SignUpState(false, null, null, null, null, null, null, null, null, false, false, null, false, null, null, 32767, null);
                this.f45071B = 1;
                if (c3953a.m(signUpState, this) == objE) {
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

    /* compiled from: SignUpViewModel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.qsg.ui.auth.signup.SignUpViewModel$signUp$1", f = "SignUpViewModel.kt", l = {72, 76, 83, 87, 94, 98, Temperature.MAX_INTERNAL_SECOND_GEN_PROBE, 109, 116, TemperatureLog.MAX_TEMPERATURE_HISTORY_SAMPLES, 128, 132, 140, 146, 159}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lja/a;", "it", "Loa/F;", "<anonymous>", "(Lja/a;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: m5.a$d */
    static final class d extends kotlin.coroutines.jvm.internal.l implements p<C3756a, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f45073B;

        /* renamed from: C, reason: collision with root package name */
        int f45074C;

        /* renamed from: D, reason: collision with root package name */
        int f45075D;

        /* renamed from: E, reason: collision with root package name */
        int f45076E;

        /* renamed from: F, reason: collision with root package name */
        int f45077F;

        /* renamed from: G, reason: collision with root package name */
        boolean f45078G;

        /* renamed from: H, reason: collision with root package name */
        boolean f45079H;

        /* renamed from: I, reason: collision with root package name */
        boolean f45080I;

        /* renamed from: J, reason: collision with root package name */
        int f45081J;

        /* compiled from: SignUpViewModel.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.qsg.ui.auth.signup.SignUpViewModel$signUp$1$1", f = "SignUpViewModel.kt", l = {161, 171}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
        /* renamed from: m5.a$d$a, reason: collision with other inner class name */
        static final class C0605a extends kotlin.coroutines.jvm.internal.l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f45083B;

            /* renamed from: C, reason: collision with root package name */
            private /* synthetic */ Object f45084C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ C3953a f45085D;

            /* compiled from: SignUpViewModel.kt */
            @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.qsg.ui.auth.signup.SignUpViewModel$signUp$1$1$2$1", f = "SignUpViewModel.kt", l = {172}, m = "invokeSuspend")
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
            /* renamed from: m5.a$d$a$a, reason: collision with other inner class name */
            static final class C0606a extends kotlin.coroutines.jvm.internal.l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

                /* renamed from: B, reason: collision with root package name */
                int f45086B;

                /* renamed from: C, reason: collision with root package name */
                final /* synthetic */ C3953a f45087C;

                /* renamed from: D, reason: collision with root package name */
                final /* synthetic */ AbstractC3900b<UserData> f45088D;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0606a(C3953a c3953a, AbstractC3900b<UserData> abstractC3900b, InterfaceC4588d<? super C0606a> interfaceC4588d) {
                    super(2, interfaceC4588d);
                    this.f45087C = c3953a;
                    this.f45088D = abstractC3900b;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                    return new C0606a(this.f45087C, this.f45088D, interfaceC4588d);
                }

                @Override // Ba.p
                public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                    return ((C0606a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objE = C4696b.e();
                    int i10 = this.f45086B;
                    if (i10 == 0) {
                        C4173r.b(obj);
                        C3953a c3953a = this.f45087C;
                        AbstractC3900b<UserData> abstractC3900b = this.f45088D;
                        this.f45086B = 1;
                        if (c3953a.E(abstractC3900b, true, this) == objE) {
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
            C0605a(C3953a c3953a, InterfaceC4588d<? super C0605a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f45085D = c3953a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                C0605a c0605a = new C0605a(this.f45085D, interfaceC4588d);
                c0605a.f45084C = obj;
                return c0605a;
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((C0605a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                /*
                    r13 = this;
                    java.lang.Object r0 = ua.C4696b.e()
                    int r1 = r13.f45083B
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L23
                    if (r1 == r3) goto L1d
                    if (r1 != r2) goto L15
                    java.lang.Object r0 = r13.f45084C
                    oa.C4173r.b(r14)
                    goto Lb5
                L15:
                    java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r14.<init>(r0)
                    throw r14
                L1d:
                    oa.C4173r.b(r14)     // Catch: java.lang.Throwable -> L21
                    goto L83
                L21:
                    r14 = move-exception
                    goto L8a
                L23:
                    oa.C4173r.b(r14)
                    java.lang.Object r14 = r13.f45084C
                    Xb.I r14 = (Xb.I) r14
                    m5.a r14 = r13.f45085D
                    oa.q$a r1 = oa.C4172q.INSTANCE     // Catch: java.lang.Throwable -> L21
                    t4.h r1 = m5.C3953a.p(r14)     // Catch: java.lang.Throwable -> L21
                    p4.l r12 = new p4.l     // Catch: java.lang.Throwable -> L21
                    androidx.lifecycle.D r4 = r14.x()     // Catch: java.lang.Throwable -> L21
                    java.lang.Object r4 = r4.e()     // Catch: java.lang.Throwable -> L21
                    java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L21
                    androidx.lifecycle.D r4 = r14.y()     // Catch: java.lang.Throwable -> L21
                    java.lang.Object r4 = r4.e()     // Catch: java.lang.Throwable -> L21
                    java.lang.String r6 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L21
                    androidx.lifecycle.D r4 = r14.v()     // Catch: java.lang.Throwable -> L21
                    java.lang.Object r4 = r4.e()     // Catch: java.lang.Throwable -> L21
                    java.lang.String r7 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L21
                    androidx.lifecycle.D r4 = r14.z()     // Catch: java.lang.Throwable -> L21
                    java.lang.Object r4 = r4.e()     // Catch: java.lang.Throwable -> L21
                    java.lang.String r8 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L21
                    java.lang.Boolean r14 = r14.getEmailOptInCheck()     // Catch: java.lang.Throwable -> L21
                    kotlin.jvm.internal.C3862t.d(r14)     // Catch: java.lang.Throwable -> L21
                    boolean r10 = r14.booleanValue()     // Catch: java.lang.Throwable -> L21
                    h5.a$a r14 = h5.C3490a.INSTANCE     // Catch: java.lang.Throwable -> L21
                    java.lang.String r11 = r14.d()     // Catch: java.lang.Throwable -> L21
                    r9 = 1
                    r4 = r12
                    r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L21
                    r13.f45083B = r3     // Catch: java.lang.Throwable -> L21
                    java.lang.Object r14 = r1.a(r12, r13)     // Catch: java.lang.Throwable -> L21
                    if (r14 != r0) goto L83
                    return r0
                L83:
                    l4.b r14 = (l4.AbstractC3900b) r14     // Catch: java.lang.Throwable -> L21
                    java.lang.Object r14 = oa.C4172q.a(r14)     // Catch: java.lang.Throwable -> L21
                    goto L94
                L8a:
                    oa.q$a r1 = oa.C4172q.INSTANCE
                    java.lang.Object r14 = oa.C4173r.a(r14)
                    java.lang.Object r14 = oa.C4172q.a(r14)
                L94:
                    m5.a r1 = r13.f45085D
                    boolean r3 = oa.C4172q.d(r14)
                    if (r3 == 0) goto Lb6
                    r3 = r14
                    l4.b r3 = (l4.AbstractC3900b) r3
                    Xb.G0 r4 = Xb.Z.c()
                    m5.a$d$a$a r5 = new m5.a$d$a$a
                    r6 = 0
                    r5.<init>(r1, r3, r6)
                    r13.f45084C = r14
                    r13.f45083B = r2
                    java.lang.Object r1 = Xb.C1837g.g(r4, r5, r13)
                    if (r1 != r0) goto Lb4
                    return r0
                Lb4:
                    r0 = r14
                Lb5:
                    r14 = r0
                Lb6:
                    java.lang.Throwable r14 = oa.C4172q.b(r14)
                    if (r14 == 0) goto Lc5
                    java.lang.String r0 = "Exception"
                    java.lang.Object[] r14 = new java.lang.Object[]{r14}
                    U4.b.e(r0, r14)
                Lc5:
                    oa.F r14 = oa.C4153F.f46609a
                    return r14
                */
                throw new UnsupportedOperationException("Method not decompiled: m5.C3953a.d.C0605a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        d(InterfaceC4588d<? super d> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C3756a c3756a, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((d) create(c3756a, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return C3953a.this.new d(interfaceC4588d);
        }

        /* JADX WARN: Removed duplicated region for block: B:102:0x05b9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x020b  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x025a  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x02a1  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x02ef  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0335  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0385  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x03cc  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x041b  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0466 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:78:0x046a  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x04ae  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x04f4  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0539  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x057e A[ADDED_TO_REGION] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r40) {
            /*
                Method dump skipped, instructions count: 1544
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: m5.C3953a.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"m5/a$e", "Lta/a;", "LXb/F;", "Lta/g;", "context", "", "exception", "Loa/F;", "y", "(Lta/g;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: m5.a$e */
    public static final class e extends AbstractC4585a implements F {
        public e(F.Companion companion) {
            super(companion);
        }

        @Override // Xb.F
        public void y(ta.g context, Throwable exception) {
            U4.b.e("Exception", exception);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3953a(InterfaceC4558h signUpCase, InterfaceC4555e loginCase, G5.a preference) {
        super(new SignUpState(false, null, null, null, null, null, null, null, null, false, false, null, false, null, null, 32767, null), null, null, 6, null);
        C3862t.g(signUpCase, "signUpCase");
        C3862t.g(loginCase, "loginCase");
        C3862t.g(preference, "preference");
        this.signUpCase = signUpCase;
        this.loginCase = loginCase;
        this.preference = preference;
        this.firstName = new D<>();
        this.lastName = new D<>();
        this.emailAddress = new D<>();
        this.password = new D<>();
        this.confirmPassword = new D<>();
        this.termCheck = new D<>(Boolean.FALSE);
        this.account = new MEATERCloudAccount();
        this.coroutineExceptionHandler = new e(F.INSTANCE);
        this.firstName.o("");
        this.lastName.o("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object E(l4.AbstractC3900b<p4.UserData> r29, boolean r30, ta.InterfaceC4588d<? super oa.C4153F> r31) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m5.C3953a.E(l4.b, boolean, ta.d):java.lang.Object");
    }

    private final boolean H(AbstractC3900b<UserData> resource) {
        InterfaceC3899a error = resource.getError();
        C3862t.d(error);
        return s(C3197a.b(error)) || C3862t.b(resource.getError(), InterfaceC3899a.b.f44358a);
    }

    private final void J(UserData data) {
        if (data != null) {
            this.account.accessToken = data.getAccessToken();
            this.preference.k1(this.account);
        }
    }

    private final void K(UserData data) {
        if (data != null) {
            this.account.name = data.getAccountName();
            this.account.email = data.getAccountEmail();
            this.account.password = this.password.e();
            MEATERCloudAccount mEATERCloudAccount = this.account;
            mEATERCloudAccount.type = MEATERCloudAccount.AccountType.EmailAndPassword;
            this.preference.k1(mEATERCloudAccount);
        }
    }

    private final boolean s(int errorCode) {
        return errorCode == 4 || errorCode == 7 || errorCode == 400 || errorCode == 403 || errorCode == 404 || errorCode >= 500;
    }

    public final D<Boolean> A() {
        return this.termCheck;
    }

    public final void B() {
        this.preference.M();
    }

    public final boolean C() {
        String strE = this.firstName.e();
        C3862t.d(strE);
        if (strE.length() > 0) {
            String strE2 = this.lastName.e();
            C3862t.d(strE2);
            if (strE2.length() > 0 && Patterns.EMAIL_ADDRESS.matcher(String.valueOf(this.emailAddress.e())).matches() && String.valueOf(this.password.e()).length() >= 8 && String.valueOf(this.confirmPassword.e()).length() >= 8 && C3862t.b(String.valueOf(this.password.e()), String.valueOf(this.confirmPassword.e()))) {
                Boolean boolE = this.termCheck.e();
                C3862t.d(boolE);
                if (boolE.booleanValue() && this.emailOptInCheck != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void D() {
        h(new C0602a(null));
    }

    public final void F() {
        h(new c(null));
    }

    public final void G(Boolean bool) {
        this.emailOptInCheck = bool;
    }

    public final void I() {
        h(new d(null));
    }

    /* renamed from: t, reason: from getter */
    public final MEATERCloudAccount getAccount() {
        return this.account;
    }

    public final D<String> u() {
        return this.confirmPassword;
    }

    public final D<String> v() {
        return this.emailAddress;
    }

    /* renamed from: w, reason: from getter */
    public final Boolean getEmailOptInCheck() {
        return this.emailOptInCheck;
    }

    public final D<String> x() {
        return this.firstName;
    }

    public final D<String> y() {
        return this.lastName;
    }

    public final D<String> z() {
        return this.password;
    }
}
