package b6;

import Ba.p;
import Xb.C1841i;
import Xb.C1854o0;
import Xb.I;
import android.content.Context;
import f6.LoginDeviceRemote;
import f6.LoginRequest;
import f6.LoginResponse;
import j6.InterfaceC3748a;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.O;
import nd.s;
import nd.t;
import oa.C4153F;
import oa.C4173r;
import oc.C4178B;
import oc.C4180D;
import oc.F;
import oc.InterfaceC4182b;
import r4.InterfaceC4344a;
import ta.InterfaceC4588d;
import ua.C4696b;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lb6/b;", "Loc/b;", "Landroid/content/Context;", "context", "Lr4/a;", "deviceProviderUseCase", "<init>", "(Landroid/content/Context;Lr4/a;)V", "Loc/D;", "response", "", "c", "(Loc/D;)I", "Loc/F;", "route", "Loc/B;", "a", "(Loc/F;Loc/D;)Loc/B;", "d", "Landroid/content/Context;", "e", "Lr4/a;", "getDeviceProviderUseCase", "()Lr4/a;", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: b6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2250b implements InterfaceC4182b {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4344a deviceProviderUseCase;

    @f(c = "com.apptionlabs.network.interceptor.RefreshTokenAuthenticator$authenticate$1", f = "RefreshTokenAuthenticator.kt", l = {51}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: b6.b$a */
    static final class a extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        Object f30630B;

        /* renamed from: C, reason: collision with root package name */
        int f30631C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ O<String> f30632D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ InterfaceC3748a f30633E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ LoginRequest f30634F;

        /* renamed from: G, reason: collision with root package name */
        final /* synthetic */ C2250b f30635G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(O<String> o10, InterfaceC3748a interfaceC3748a, LoginRequest loginRequest, C2250b c2250b, InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f30632D = o10;
            this.f30633E = interfaceC3748a;
            this.f30634F = loginRequest;
            this.f30635G = c2250b;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return new a(this.f30632D, this.f30633E, this.f30634F, this.f30635G, interfaceC4588d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            O<String> o10;
            Object objE = C4696b.e();
            int i10 = this.f30631C;
            if (i10 == 0) {
                C4173r.b(obj);
                O<String> o11 = this.f30632D;
                InterfaceC3748a interfaceC3748a = this.f30633E;
                LoginRequest loginRequest = this.f30634F;
                this.f30630B = o11;
                this.f30631C = 1;
                Object objG = interfaceC3748a.g(loginRequest, this);
                if (objG == objE) {
                    return objE;
                }
                o10 = o11;
                obj = objG;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o10 = (O) this.f30630B;
                C4173r.b(obj);
            }
            LoginResponse loginResponse = (LoginResponse) ((s) obj).a();
            o10.f43978B = loginResponse != null ? loginResponse.getAccessToken() : 0;
            new X5.f(this.f30635G.context).a("access-token_v1", this.f30632D.f43978B);
            return C4153F.f46609a;
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }
    }

    public C2250b(Context context, InterfaceC4344a deviceProviderUseCase) {
        C3862t.g(context, "context");
        C3862t.g(deviceProviderUseCase, "deviceProviderUseCase");
        this.context = context;
        this.deviceProviderUseCase = deviceProviderUseCase;
    }

    private final int c(C4180D response) {
        int i10 = 0;
        while (response != null) {
            i10++;
            response = response.getPriorResponse();
        }
        return i10;
    }

    @Override // oc.InterfaceC4182b
    public C4178B a(F route, C4180D response) throws IOException {
        C3862t.g(response, "response");
        if (c(response) >= 2) {
            throw new IOException();
        }
        LoginRequest loginRequest = new LoginRequest(String.valueOf(new X5.a(this.context).a("user-email")), String.valueOf(new X5.f(this.context).b("meater-cloud-token_v1")), null, LoginDeviceRemote.INSTANCE.a(this.deviceProviderUseCase.a()));
        try {
            O o10 = new O();
            C1841i.d(C1854o0.f19099B, null, null, new a(o10, (InterfaceC3748a) new t.b().a(od.a.f()).b("https://api.cloud.meater.com/").d().b(InterfaceC3748a.class), loginRequest, this, null), 3, null);
            return response.getRequest().i().d("Authorization", "Bearer " + o10.f43978B).b();
        } catch (IOException unused) {
            throw new IOException();
        }
    }
}
