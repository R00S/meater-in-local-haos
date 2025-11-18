package g4;

import b4.InterfaceC2226a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C3862t;
import q4.InterfaceC4285a;
import ta.InterfaceC4588d;

/* compiled from: DeviceDataRepository.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\u0007\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Lg4/a;", "Lq4/a;", "Lb4/a;", "network", "<init>", "(Lb4/a;)V", "Ln4/c;", "input", "Ll4/b;", "Ln4/b;", "b", "(Ln4/c;Lta/d;)Ljava/lang/Object;", "Ln4/d;", "", "a", "(Ln4/d;Lta/d;)Ljava/lang/Object;", "Lb4/a;", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: g4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3421a implements InterfaceC4285a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC2226a network;

    /* compiled from: DeviceDataRepository.kt */
    @f(c = "com.apptionlabs.data.repository.DeviceDataRepository", f = "DeviceDataRepository.kt", l = {14}, m = "devices")
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: g4.a$a, reason: collision with other inner class name */
    static final class C0530a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        /* synthetic */ Object f41845B;

        /* renamed from: D, reason: collision with root package name */
        int f41847D;

        C0530a(InterfaceC4588d<? super C0530a> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41845B = obj;
            this.f41847D |= Integer.MIN_VALUE;
            return C3421a.this.b(null, this);
        }
    }

    /* compiled from: DeviceDataRepository.kt */
    @f(c = "com.apptionlabs.data.repository.DeviceDataRepository", f = "DeviceDataRepository.kt", l = {18}, m = "safetyManual")
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: g4.a$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: B, reason: collision with root package name */
        /* synthetic */ Object f41848B;

        /* renamed from: D, reason: collision with root package name */
        int f41850D;

        b(InterfaceC4588d<? super b> interfaceC4588d) {
            super(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f41848B = obj;
            this.f41850D |= Integer.MIN_VALUE;
            return C3421a.this.a(null, this);
        }
    }

    public C3421a(InterfaceC2226a network) {
        C3862t.g(network, "network");
        this.network = network;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q4.InterfaceC4285a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(n4.SafetyManualRequestInput r5, ta.InterfaceC4588d<? super l4.AbstractC3900b<java.lang.String>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof g4.C3421a.b
            if (r0 == 0) goto L13
            r0 = r6
            g4.a$b r0 = (g4.C3421a.b) r0
            int r1 = r0.f41850D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41850D = r1
            goto L18
        L13:
            g4.a$b r0 = new g4.a$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f41848B
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f41850D
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
            b4.a r6 = c(r4)
            r0.f41850D = r3
            java.lang.Object r6 = r6.a(r5, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: g4.C3421a.a(n4.d, ta.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q4.InterfaceC4285a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(n4.PairedDeviceListRequestInput r5, ta.InterfaceC4588d<? super l4.AbstractC3900b<n4.DevicesData>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof g4.C3421a.C0530a
            if (r0 == 0) goto L13
            r0 = r6
            g4.a$a r0 = (g4.C3421a.C0530a) r0
            int r1 = r0.f41847D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f41847D = r1
            goto L18
        L13:
            g4.a$a r0 = new g4.a$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f41845B
            java.lang.Object r1 = ua.C4696b.e()
            int r2 = r0.f41847D
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
            b4.a r6 = c(r4)
            r0.f41847D = r3
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
        throw new UnsupportedOperationException("Method not decompiled: g4.C3421a.b(n4.c, ta.d):java.lang.Object");
    }
}
