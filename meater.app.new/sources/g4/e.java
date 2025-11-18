package g4;

import e4.InterfaceC3196a;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import q4.InterfaceC4289e;
import ta.InterfaceC4588d;

/* compiled from: UserDataRepository.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\fH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\u0006\u0010\u0007\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\bH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\u0006\u0010\u0007\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\b2\u0006\u0010\u0007\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\b2\u0006\u0010\u0007\u001a\u00020\u001dH\u0096@¢\u0006\u0004\b\u001f\u0010 J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\b2\u0006\u0010\u0007\u001a\u00020!H\u0096@¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010%¨\u0006&"}, d2 = {"Lg4/e;", "Lq4/e;", "Le4/a;", "network", "<init>", "(Le4/a;)V", "Lp4/g;", "input", "Ll4/b;", "Lp4/m;", "f", "(Lp4/g;Lta/d;)Ljava/lang/Object;", "Lp4/l;", "c", "(Lp4/l;Lta/d;)Ljava/lang/Object;", "Lp4/f;", "Lm4/c;", "b", "(Lp4/f;Lta/d;)Ljava/lang/Object;", "Lp4/n;", "a", "(Lta/d;)Ljava/lang/Object;", "Lp4/k;", "g", "(Lp4/k;Lta/d;)Ljava/lang/Object;", "Lp4/d;", "Lp4/c;", "d", "(Lp4/d;Lta/d;)Ljava/lang/Object;", "Lp4/b;", "Lp4/a;", "e", "(Lp4/b;Lta/d;)Ljava/lang/Object;", "Lp4/h;", "Lp4/i;", "h", "(Lp4/h;Lta/d;)Ljava/lang/Object;", "Le4/a;", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e implements InterfaceC4289e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC3196a network;

    /* compiled from: UserDataRepository.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.data.repository.UserDataRepository", f = "UserDataRepository.kt", l = {21}, m = "forgot")
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        /* synthetic */ Object f41864B;

        /* renamed from: D, reason: collision with root package name */
        int f41866D;

        a(InterfaceC4588d<? super a> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41864B = obj;
            this.f41866D |= Integer.MIN_VALUE;
            return e.this.b(null, this);
        }
    }

    /* compiled from: UserDataRepository.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.data.repository.UserDataRepository", f = "UserDataRepository.kt", l = {37}, m = "getCalibrationCertificate")
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        /* synthetic */ Object f41867B;

        /* renamed from: D, reason: collision with root package name */
        int f41869D;

        b(InterfaceC4588d<? super b> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41867B = obj;
            this.f41869D |= Integer.MIN_VALUE;
            return e.this.e(null, this);
        }
    }

    /* compiled from: UserDataRepository.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.data.repository.UserDataRepository", f = "UserDataRepository.kt", l = {33}, m = "getCurrentOffers")
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        /* synthetic */ Object f41870B;

        /* renamed from: D, reason: collision with root package name */
        int f41872D;

        c(InterfaceC4588d<? super c> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41870B = obj;
            this.f41872D |= Integer.MIN_VALUE;
            return e.this.d(null, this);
        }
    }

    /* compiled from: UserDataRepository.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.data.repository.UserDataRepository", f = "UserDataRepository.kt", l = {25}, m = "getWatchedVideos")
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        /* synthetic */ Object f41873B;

        /* renamed from: D, reason: collision with root package name */
        int f41875D;

        d(InterfaceC4588d<? super d> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41873B = obj;
            this.f41875D |= Integer.MIN_VALUE;
            return e.this.a(this);
        }
    }

    /* compiled from: UserDataRepository.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.data.repository.UserDataRepository", f = "UserDataRepository.kt", l = {C9.h.PERF_SESSIONS_FIELD_NUMBER}, m = "login")
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: g4.e$e, reason: collision with other inner class name */
    static final class C0531e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        /* synthetic */ Object f41876B;

        /* renamed from: D, reason: collision with root package name */
        int f41878D;

        C0531e(InterfaceC4588d<? super C0531e> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41876B = obj;
            this.f41878D |= Integer.MIN_VALUE;
            return e.this.f(null, this);
        }
    }

    /* compiled from: UserDataRepository.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.data.repository.UserDataRepository", f = "UserDataRepository.kt", l = {41}, m = "markCurrentOfferViewed")
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        /* synthetic */ Object f41879B;

        /* renamed from: D, reason: collision with root package name */
        int f41881D;

        f(InterfaceC4588d<? super f> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41879B = obj;
            this.f41881D |= Integer.MIN_VALUE;
            return e.this.h(null, this);
        }
    }

    /* compiled from: UserDataRepository.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.data.repository.UserDataRepository", f = "UserDataRepository.kt", l = {29}, m = "saveWatchedVideos")
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        /* synthetic */ Object f41882B;

        /* renamed from: D, reason: collision with root package name */
        int f41884D;

        g(InterfaceC4588d<? super g> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41882B = obj;
            this.f41884D |= Integer.MIN_VALUE;
            return e.this.g(null, this);
        }
    }

    /* compiled from: UserDataRepository.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.data.repository.UserDataRepository", f = "UserDataRepository.kt", l = {17}, m = "signup")
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        /* synthetic */ Object f41885B;

        /* renamed from: D, reason: collision with root package name */
        int f41887D;

        h(InterfaceC4588d<? super h> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41885B = obj;
            this.f41887D |= Integer.MIN_VALUE;
            return e.this.c(null, this);
        }
    }

    public e(InterfaceC3196a network) {
        C3862t.g(network, "network");
        this.network = network;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q4.InterfaceC4289e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(ta.InterfaceC4588d<? super l4.AbstractC3900b<p4.WatchedVideos>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof g4.e.d
            if (r0 == 0) goto L13
            r0 = r6
            g4.e$d r0 = (g4.e.d) r0
            int r1 = r0.f41875D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41875D = r1
            goto L18
        L13:
            g4.e$d r0 = new g4.e$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f41873B
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f41875D
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            oa.C4173r.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            oa.C4173r.b(r6)
            e4.a r6 = i(r5)
            r0.f41875D = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            Z3.a r6 = (Z3.a) r6
            boolean r0 = r6 instanceof Z3.a.ClientError
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L5e
            l4.b$a r0 = new l4.b$a
            l4.a$a r3 = new l4.a$a
            Z3.a$a r6 = (Z3.a.ClientError) r6
            int r4 = r6.getCode()
            java.lang.String r6 = r6.getMessage()
            r3.<init>(r4, r6)
            r0.<init>(r3, r2, r1, r2)
            goto L92
        L5e:
            boolean r0 = r6 instanceof Z3.a.ServerError
            if (r0 == 0) goto L77
            l4.b$a r0 = new l4.b$a
            l4.a$a r3 = new l4.a$a
            Z3.a$c r6 = (Z3.a.ServerError) r6
            int r4 = r6.getCode()
            java.lang.String r6 = r6.getMessage()
            r3.<init>(r4, r6)
            r0.<init>(r3, r2, r1, r2)
            goto L92
        L77:
            boolean r0 = r6 instanceof Z3.a.NoInternet
            if (r0 == 0) goto L83
            l4.b$a r0 = new l4.b$a
            l4.a$b r6 = l4.InterfaceC3899a.b.f44358a
            r0.<init>(r6, r2, r1, r2)
            goto L92
        L83:
            boolean r0 = r6 instanceof Z3.a.Success
            if (r0 == 0) goto L93
            l4.b$b r0 = new l4.b$b
            Z3.a$d r6 = (Z3.a.Success) r6
            java.lang.Object r6 = r6.a()
            r0.<init>(r6)
        L92:
            return r0
        L93:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.e.a(ta.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q4.InterfaceC4289e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(p4.ForgotPasswordRequestInput r5, ta.InterfaceC4588d<? super l4.AbstractC3900b<m4.CommonResponse>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof g4.e.a
            if (r0 == 0) goto L13
            r0 = r6
            g4.e$a r0 = (g4.e.a) r0
            int r1 = r0.f41866D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41866D = r1
            goto L18
        L13:
            g4.e$a r0 = new g4.e$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f41864B
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f41866D
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            oa.C4173r.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            oa.C4173r.b(r6)
            e4.a r6 = i(r4)
            r0.f41866D = r3
            java.lang.Object r6 = r6.b(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            Z3.a r6 = (Z3.a) r6
            boolean r5 = r6 instanceof Z3.a.ClientError
            r0 = 2
            r1 = 0
            if (r5 == 0) goto L5e
            l4.b$a r5 = new l4.b$a
            l4.a$a r2 = new l4.a$a
            Z3.a$a r6 = (Z3.a.ClientError) r6
            int r3 = r6.getCode()
            java.lang.String r6 = r6.getMessage()
            r2.<init>(r3, r6)
            r5.<init>(r2, r1, r0, r1)
            goto L92
        L5e:
            boolean r5 = r6 instanceof Z3.a.ServerError
            if (r5 == 0) goto L77
            l4.b$a r5 = new l4.b$a
            l4.a$a r2 = new l4.a$a
            Z3.a$c r6 = (Z3.a.ServerError) r6
            int r3 = r6.getCode()
            java.lang.String r6 = r6.getMessage()
            r2.<init>(r3, r6)
            r5.<init>(r2, r1, r0, r1)
            goto L92
        L77:
            boolean r5 = r6 instanceof Z3.a.NoInternet
            if (r5 == 0) goto L83
            l4.b$a r5 = new l4.b$a
            l4.a$b r6 = l4.InterfaceC3899a.b.f44358a
            r5.<init>(r6, r1, r0, r1)
            goto L92
        L83:
            boolean r5 = r6 instanceof Z3.a.Success
            if (r5 == 0) goto L93
            l4.b$b r5 = new l4.b$b
            Z3.a$d r6 = (Z3.a.Success) r6
            java.lang.Object r6 = r6.a()
            r5.<init>(r6)
        L92:
            return r5
        L93:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.e.b(p4.f, ta.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q4.InterfaceC4289e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(p4.SignUpRequestInput r5, ta.InterfaceC4588d<? super l4.AbstractC3900b<p4.UserData>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof g4.e.h
            if (r0 == 0) goto L13
            r0 = r6
            g4.e$h r0 = (g4.e.h) r0
            int r1 = r0.f41887D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41887D = r1
            goto L18
        L13:
            g4.e$h r0 = new g4.e$h
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f41885B
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f41887D
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            oa.C4173r.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            oa.C4173r.b(r6)
            e4.a r6 = i(r4)
            r0.f41887D = r3
            java.lang.Object r6 = r6.c(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            Z3.a r6 = (Z3.a) r6
            boolean r5 = r6 instanceof Z3.a.ClientError
            r0 = 2
            r1 = 0
            if (r5 == 0) goto L5e
            l4.b$a r5 = new l4.b$a
            l4.a$a r2 = new l4.a$a
            Z3.a$a r6 = (Z3.a.ClientError) r6
            int r3 = r6.getCode()
            java.lang.String r6 = r6.getMessage()
            r2.<init>(r3, r6)
            r5.<init>(r2, r1, r0, r1)
            goto L92
        L5e:
            boolean r5 = r6 instanceof Z3.a.ServerError
            if (r5 == 0) goto L77
            l4.b$a r5 = new l4.b$a
            l4.a$a r2 = new l4.a$a
            Z3.a$c r6 = (Z3.a.ServerError) r6
            int r3 = r6.getCode()
            java.lang.String r6 = r6.getMessage()
            r2.<init>(r3, r6)
            r5.<init>(r2, r1, r0, r1)
            goto L92
        L77:
            boolean r5 = r6 instanceof Z3.a.NoInternet
            if (r5 == 0) goto L83
            l4.b$a r5 = new l4.b$a
            l4.a$b r6 = l4.InterfaceC3899a.b.f44358a
            r5.<init>(r6, r1, r0, r1)
            goto L92
        L83:
            boolean r5 = r6 instanceof Z3.a.Success
            if (r5 == 0) goto L93
            l4.b$b r5 = new l4.b$b
            Z3.a$d r6 = (Z3.a.Success) r6
            java.lang.Object r6 = r6.a()
            r5.<init>(r6)
        L92:
            return r5
        L93:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.e.c(p4.l, ta.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q4.InterfaceC4289e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(p4.CurrentOffersRequestInput r5, ta.InterfaceC4588d<? super l4.AbstractC3900b<p4.CurrentOffers>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof g4.e.c
            if (r0 == 0) goto L13
            r0 = r6
            g4.e$c r0 = (g4.e.c) r0
            int r1 = r0.f41872D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41872D = r1
            goto L18
        L13:
            g4.e$c r0 = new g4.e$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f41870B
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f41872D
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            oa.C4173r.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            oa.C4173r.b(r6)
            e4.a r6 = i(r4)
            r0.f41872D = r3
            java.lang.Object r6 = r6.d(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            Z3.a r6 = (Z3.a) r6
            boolean r5 = r6 instanceof Z3.a.ClientError
            r0 = 2
            r1 = 0
            if (r5 == 0) goto L5e
            l4.b$a r5 = new l4.b$a
            l4.a$a r2 = new l4.a$a
            Z3.a$a r6 = (Z3.a.ClientError) r6
            int r3 = r6.getCode()
            java.lang.String r6 = r6.getMessage()
            r2.<init>(r3, r6)
            r5.<init>(r2, r1, r0, r1)
            goto L92
        L5e:
            boolean r5 = r6 instanceof Z3.a.ServerError
            if (r5 == 0) goto L77
            l4.b$a r5 = new l4.b$a
            l4.a$a r2 = new l4.a$a
            Z3.a$c r6 = (Z3.a.ServerError) r6
            int r3 = r6.getCode()
            java.lang.String r6 = r6.getMessage()
            r2.<init>(r3, r6)
            r5.<init>(r2, r1, r0, r1)
            goto L92
        L77:
            boolean r5 = r6 instanceof Z3.a.NoInternet
            if (r5 == 0) goto L83
            l4.b$a r5 = new l4.b$a
            l4.a$b r6 = l4.InterfaceC3899a.b.f44358a
            r5.<init>(r6, r1, r0, r1)
            goto L92
        L83:
            boolean r5 = r6 instanceof Z3.a.Success
            if (r5 == 0) goto L93
            l4.b$b r5 = new l4.b$b
            Z3.a$d r6 = (Z3.a.Success) r6
            java.lang.Object r6 = r6.a()
            r5.<init>(r6)
        L92:
            return r5
        L93:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.e.d(p4.d, ta.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q4.InterfaceC4289e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(p4.CalibrationRequestInput r5, ta.InterfaceC4588d<? super l4.AbstractC3900b<p4.CalibrationData>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof g4.e.b
            if (r0 == 0) goto L13
            r0 = r6
            g4.e$b r0 = (g4.e.b) r0
            int r1 = r0.f41869D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41869D = r1
            goto L18
        L13:
            g4.e$b r0 = new g4.e$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f41867B
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f41869D
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            oa.C4173r.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            oa.C4173r.b(r6)
            e4.a r6 = i(r4)
            r0.f41869D = r3
            java.lang.Object r6 = r6.e(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            Z3.a r6 = (Z3.a) r6
            boolean r5 = r6 instanceof Z3.a.ClientError
            r0 = 2
            r1 = 0
            if (r5 == 0) goto L5e
            l4.b$a r5 = new l4.b$a
            l4.a$a r2 = new l4.a$a
            Z3.a$a r6 = (Z3.a.ClientError) r6
            int r3 = r6.getCode()
            java.lang.String r6 = r6.getMessage()
            r2.<init>(r3, r6)
            r5.<init>(r2, r1, r0, r1)
            goto L92
        L5e:
            boolean r5 = r6 instanceof Z3.a.ServerError
            if (r5 == 0) goto L77
            l4.b$a r5 = new l4.b$a
            l4.a$a r2 = new l4.a$a
            Z3.a$c r6 = (Z3.a.ServerError) r6
            int r3 = r6.getCode()
            java.lang.String r6 = r6.getMessage()
            r2.<init>(r3, r6)
            r5.<init>(r2, r1, r0, r1)
            goto L92
        L77:
            boolean r5 = r6 instanceof Z3.a.NoInternet
            if (r5 == 0) goto L83
            l4.b$a r5 = new l4.b$a
            l4.a$b r6 = l4.InterfaceC3899a.b.f44358a
            r5.<init>(r6, r1, r0, r1)
            goto L92
        L83:
            boolean r5 = r6 instanceof Z3.a.Success
            if (r5 == 0) goto L93
            l4.b$b r5 = new l4.b$b
            Z3.a$d r6 = (Z3.a.Success) r6
            java.lang.Object r6 = r6.a()
            r5.<init>(r6)
        L92:
            return r5
        L93:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.e.e(p4.b, ta.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q4.InterfaceC4289e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object f(p4.LoginRequestInput r5, ta.InterfaceC4588d<? super l4.AbstractC3900b<p4.UserData>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof g4.e.C0531e
            if (r0 == 0) goto L13
            r0 = r6
            g4.e$e r0 = (g4.e.C0531e) r0
            int r1 = r0.f41878D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41878D = r1
            goto L18
        L13:
            g4.e$e r0 = new g4.e$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f41876B
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f41878D
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            oa.C4173r.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            oa.C4173r.b(r6)
            e4.a r6 = i(r4)
            r0.f41878D = r3
            java.lang.Object r6 = r6.f(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            Z3.a r6 = (Z3.a) r6
            boolean r5 = r6 instanceof Z3.a.ClientError
            r0 = 2
            r1 = 0
            if (r5 == 0) goto L5e
            l4.b$a r5 = new l4.b$a
            l4.a$a r2 = new l4.a$a
            Z3.a$a r6 = (Z3.a.ClientError) r6
            int r3 = r6.getCode()
            java.lang.String r6 = r6.getMessage()
            r2.<init>(r3, r6)
            r5.<init>(r2, r1, r0, r1)
            goto L92
        L5e:
            boolean r5 = r6 instanceof Z3.a.ServerError
            if (r5 == 0) goto L77
            l4.b$a r5 = new l4.b$a
            l4.a$a r2 = new l4.a$a
            Z3.a$c r6 = (Z3.a.ServerError) r6
            int r3 = r6.getCode()
            java.lang.String r6 = r6.getMessage()
            r2.<init>(r3, r6)
            r5.<init>(r2, r1, r0, r1)
            goto L92
        L77:
            boolean r5 = r6 instanceof Z3.a.NoInternet
            if (r5 == 0) goto L83
            l4.b$a r5 = new l4.b$a
            l4.a$b r6 = l4.InterfaceC3899a.b.f44358a
            r5.<init>(r6, r1, r0, r1)
            goto L92
        L83:
            boolean r5 = r6 instanceof Z3.a.Success
            if (r5 == 0) goto L93
            l4.b$b r5 = new l4.b$b
            Z3.a$d r6 = (Z3.a.Success) r6
            java.lang.Object r6 = r6.a()
            r5.<init>(r6)
        L92:
            return r5
        L93:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.e.f(p4.g, ta.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q4.InterfaceC4289e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object g(p4.SaveWatchedVideoRequestInput r5, ta.InterfaceC4588d<? super l4.AbstractC3900b<p4.WatchedVideos>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof g4.e.g
            if (r0 == 0) goto L13
            r0 = r6
            g4.e$g r0 = (g4.e.g) r0
            int r1 = r0.f41884D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41884D = r1
            goto L18
        L13:
            g4.e$g r0 = new g4.e$g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f41882B
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f41884D
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            oa.C4173r.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            oa.C4173r.b(r6)
            e4.a r6 = i(r4)
            r0.f41884D = r3
            java.lang.Object r6 = r6.g(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            Z3.a r6 = (Z3.a) r6
            boolean r5 = r6 instanceof Z3.a.ClientError
            r0 = 2
            r1 = 0
            if (r5 == 0) goto L5e
            l4.b$a r5 = new l4.b$a
            l4.a$a r2 = new l4.a$a
            Z3.a$a r6 = (Z3.a.ClientError) r6
            int r3 = r6.getCode()
            java.lang.String r6 = r6.getMessage()
            r2.<init>(r3, r6)
            r5.<init>(r2, r1, r0, r1)
            goto L92
        L5e:
            boolean r5 = r6 instanceof Z3.a.ServerError
            if (r5 == 0) goto L77
            l4.b$a r5 = new l4.b$a
            l4.a$a r2 = new l4.a$a
            Z3.a$c r6 = (Z3.a.ServerError) r6
            int r3 = r6.getCode()
            java.lang.String r6 = r6.getMessage()
            r2.<init>(r3, r6)
            r5.<init>(r2, r1, r0, r1)
            goto L92
        L77:
            boolean r5 = r6 instanceof Z3.a.NoInternet
            if (r5 == 0) goto L83
            l4.b$a r5 = new l4.b$a
            l4.a$b r6 = l4.InterfaceC3899a.b.f44358a
            r5.<init>(r6, r1, r0, r1)
            goto L92
        L83:
            boolean r5 = r6 instanceof Z3.a.Success
            if (r5 == 0) goto L93
            l4.b$b r5 = new l4.b$b
            Z3.a$d r6 = (Z3.a.Success) r6
            java.lang.Object r6 = r6.a()
            r5.<init>(r6)
        L92:
            return r5
        L93:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.e.g(p4.k, ta.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q4.InterfaceC4289e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object h(p4.MarkOfferViewedRequestInput r5, ta.InterfaceC4588d<? super l4.AbstractC3900b<p4.MarkOffers>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof g4.e.f
            if (r0 == 0) goto L13
            r0 = r6
            g4.e$f r0 = (g4.e.f) r0
            int r1 = r0.f41881D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41881D = r1
            goto L18
        L13:
            g4.e$f r0 = new g4.e$f
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f41879B
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f41881D
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            oa.C4173r.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            oa.C4173r.b(r6)
            e4.a r6 = i(r4)
            r0.f41881D = r3
            java.lang.Object r6 = r6.h(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            Z3.a r6 = (Z3.a) r6
            boolean r5 = r6 instanceof Z3.a.ClientError
            r0 = 2
            r1 = 0
            if (r5 == 0) goto L5e
            l4.b$a r5 = new l4.b$a
            l4.a$a r2 = new l4.a$a
            Z3.a$a r6 = (Z3.a.ClientError) r6
            int r3 = r6.getCode()
            java.lang.String r6 = r6.getMessage()
            r2.<init>(r3, r6)
            r5.<init>(r2, r1, r0, r1)
            goto L92
        L5e:
            boolean r5 = r6 instanceof Z3.a.ServerError
            if (r5 == 0) goto L77
            l4.b$a r5 = new l4.b$a
            l4.a$a r2 = new l4.a$a
            Z3.a$c r6 = (Z3.a.ServerError) r6
            int r3 = r6.getCode()
            java.lang.String r6 = r6.getMessage()
            r2.<init>(r3, r6)
            r5.<init>(r2, r1, r0, r1)
            goto L92
        L77:
            boolean r5 = r6 instanceof Z3.a.NoInternet
            if (r5 == 0) goto L83
            l4.b$a r5 = new l4.b$a
            l4.a$b r6 = l4.InterfaceC3899a.b.f44358a
            r5.<init>(r6, r1, r0, r1)
            goto L92
        L83:
            boolean r5 = r6 instanceof Z3.a.Success
            if (r5 == 0) goto L93
            l4.b$b r5 = new l4.b$b
            Z3.a$d r6 = (Z3.a.Success) r6
            java.lang.Object r6 = r6.a()
            r5.<init>(r6)
        L92:
            return r5
        L93:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.e.h(p4.h, ta.d):java.lang.Object");
    }
}
