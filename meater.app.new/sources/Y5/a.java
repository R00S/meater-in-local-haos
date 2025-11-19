package Y5;

import Ba.p;
import X5.e;
import b4.InterfaceC2226a;
import d6.DeviceRemote;
import d6.PairedDeviceResponse;
import d6.SafetyManualRequest;
import f6.LoginDeviceRemote;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C3862t;
import n4.Device;
import n4.DevicesData;
import n4.PairedDeviceListRequestInput;
import n4.SafetyManualRequestInput;
import nd.s;
import oa.C4153F;
import oa.C4173r;
import oc.E;
import ta.InterfaceC4588d;
import ua.C4696b;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\u0007\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"LY5/a;", "Lb4/a;", "LZ5/a;", "service", "<init>", "(LZ5/a;)V", "Ln4/c;", "input", "LZ3/a;", "Ln4/b;", "b", "(Ln4/c;Lta/d;)Ljava/lang/Object;", "Ln4/d;", "", "a", "(Ln4/d;Lta/d;)Ljava/lang/Object;", "LZ5/a;", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a implements InterfaceC2226a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Z5.a service;

    @f(c = "com.apptionlabs.network.device.DeviceRESTDataSource$devices$2", f = "DeviceRESTDataSource.kt", l = {18}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lnd/s;", "Ld6/b;", "<anonymous>", "()Lnd/s;"}, k = 3, mv = {2, 0, 0})
    /* renamed from: Y5.a$a, reason: collision with other inner class name */
    static final class C0283a extends l implements Ba.l<InterfaceC4588d<? super s<PairedDeviceResponse>>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f19427B;

        C0283a(InterfaceC4588d<? super C0283a> interfaceC4588d) {
            super(1, interfaceC4588d);
        }

        @Override // Ba.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4588d<? super s<PairedDeviceResponse>> interfaceC4588d) {
            return ((C0283a) create(interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(InterfaceC4588d<?> interfaceC4588d) {
            return a.this.new C0283a(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f19427B;
            if (i10 == 0) {
                C4173r.b(obj);
                Z5.a aVar = a.this.service;
                this.f19427B = 1;
                obj = aVar.a(this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            return obj;
        }
    }

    @f(c = "com.apptionlabs.network.device.DeviceRESTDataSource$devices$3", f = "DeviceRESTDataSource.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld6/b;", "it", "Ln4/b;", "<anonymous>", "(Ld6/b;)Ln4/b;"}, k = 3, mv = {2, 0, 0})
    static final class b extends l implements p<PairedDeviceResponse, InterfaceC4588d<? super DevicesData>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f19429B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f19430C;

        b(InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(PairedDeviceResponse pairedDeviceResponse, InterfaceC4588d<? super DevicesData> interfaceC4588d) {
            return ((b) create(pairedDeviceResponse, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            b bVar = new b(interfaceC4588d);
            bVar.f19430C = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f19429B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            PairedDeviceResponse pairedDeviceResponse = (PairedDeviceResponse) this.f19430C;
            List<DeviceRemote> listC = pairedDeviceResponse.c();
            ArrayList arrayList = new ArrayList(r.x(listC, 10));
            for (DeviceRemote deviceRemote : listC) {
                arrayList.add(new Device(deviceRemote.getId(), deviceRemote.getProbeNumber()));
            }
            return new DevicesData(arrayList, pairedDeviceResponse.getStatusCode(), pairedDeviceResponse.getError(), pairedDeviceResponse.getMessage());
        }
    }

    @f(c = "com.apptionlabs.network.device.DeviceRESTDataSource$safetyManual$2", f = "DeviceRESTDataSource.kt", l = {33}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lnd/s;", "Loc/E;", "<anonymous>", "()Lnd/s;"}, k = 3, mv = {2, 0, 0})
    static final class c extends l implements Ba.l<InterfaceC4588d<? super s<E>>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f19431B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ SafetyManualRequestInput f19433D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(SafetyManualRequestInput safetyManualRequestInput, InterfaceC4588d<? super c> interfaceC4588d) {
            super(1, interfaceC4588d);
            this.f19433D = safetyManualRequestInput;
        }

        @Override // Ba.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4588d<? super s<E>> interfaceC4588d) {
            return ((c) create(interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(InterfaceC4588d<?> interfaceC4588d) {
            return a.this.new c(this.f19433D, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f19431B;
            if (i10 == 0) {
                C4173r.b(obj);
                Z5.a aVar = a.this.service;
                String webPageUrl = this.f19433D.getWebPageUrl();
                SafetyManualRequest safetyManualRequest = new SafetyManualRequest(LoginDeviceRemote.INSTANCE.a(this.f19433D.getDevice()));
                this.f19431B = 1;
                obj = aVar.b(webPageUrl, safetyManualRequest, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            return obj;
        }
    }

    @f(c = "com.apptionlabs.network.device.DeviceRESTDataSource$safetyManual$3", f = "DeviceRESTDataSource.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Loc/E;", "it", "", "<anonymous>", "(Loc/E;)Ljava/lang/String;"}, k = 3, mv = {2, 0, 0})
    static final class d extends l implements p<E, InterfaceC4588d<? super String>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f19434B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f19435C;

        d(InterfaceC4588d<? super d> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(E e10, InterfaceC4588d<? super String> interfaceC4588d) {
            return ((d) create(e10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            d dVar = new d(interfaceC4588d);
            dVar.f19435C = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f19434B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            return ((E) this.f19435C).j();
        }
    }

    public a(Z5.a service) {
        C3862t.g(service, "service");
        this.service = service;
    }

    @Override // b4.InterfaceC2226a
    public Object a(SafetyManualRequestInput safetyManualRequestInput, InterfaceC4588d<? super Z3.a<String>> interfaceC4588d) {
        return e.d(new c(safetyManualRequestInput, null), new d(null), interfaceC4588d);
    }

    @Override // b4.InterfaceC2226a
    public Object b(PairedDeviceListRequestInput pairedDeviceListRequestInput, InterfaceC4588d<? super Z3.a<DevicesData>> interfaceC4588d) {
        return e.d(new C0283a(null), new b(null), interfaceC4588d);
    }
}
