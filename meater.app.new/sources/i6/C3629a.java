package i6;

import c6.CommonResponse;
import com.apptionlabs.meater_app.data.Temperature;
import e4.InterfaceC3196a;
import f6.CertificateResponse;
import f6.CurrentOffersResponse;
import f6.ForgotPasswordRequest;
import f6.LoginDeviceRemote;
import f6.LoginRequest;
import f6.LoginResponse;
import f6.MarkOfferResponse;
import f6.MarkOfferViewedRequest;
import f6.OfferDataRemote;
import f6.SaveWatchedVideoRequest;
import f6.SignUpRequest;
import f6.SignUpResponse;
import f6.WatchedVideosResponse;
import j6.InterfaceC3748a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import nd.s;
import oa.C4153F;
import oa.C4173r;
import p4.CalibrationData;
import p4.CalibrationRequestInput;
import p4.CurrentOffers;
import p4.CurrentOffersRequestInput;
import p4.ForgotPasswordRequestInput;
import p4.LoginRequestInput;
import p4.MarkOfferViewedRequestInput;
import p4.MarkOffers;
import p4.SaveWatchedVideoRequestInput;
import p4.SignUpRequestInput;
import p4.UserData;
import p4.WatchedVideos;
import ta.InterfaceC4588d;
import ua.C4696b;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\fH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\u0006\u0010\u0007\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\bH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\u0006\u0010\u0007\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\b2\u0006\u0010\u0007\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\b2\u0006\u0010\u0007\u001a\u00020\u001dH\u0096@¢\u0006\u0004\b\u001f\u0010 J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\b2\u0006\u0010\u0007\u001a\u00020!H\u0096@¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010%¨\u0006&"}, d2 = {"Li6/a;", "Le4/a;", "Lj6/a;", "service", "<init>", "(Lj6/a;)V", "Lp4/g;", "input", "LZ3/a;", "Lp4/m;", "f", "(Lp4/g;Lta/d;)Ljava/lang/Object;", "Lp4/l;", "c", "(Lp4/l;Lta/d;)Ljava/lang/Object;", "Lp4/f;", "Lm4/c;", "b", "(Lp4/f;Lta/d;)Ljava/lang/Object;", "Lp4/n;", "a", "(Lta/d;)Ljava/lang/Object;", "Lp4/k;", "g", "(Lp4/k;Lta/d;)Ljava/lang/Object;", "Lp4/d;", "Lp4/c;", "d", "(Lp4/d;Lta/d;)Ljava/lang/Object;", "Lp4/b;", "Lp4/a;", "e", "(Lp4/b;Lta/d;)Ljava/lang/Object;", "Lp4/h;", "Lp4/i;", "h", "(Lp4/h;Lta/d;)Ljava/lang/Object;", "Lj6/a;", "network_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: i6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3629a implements InterfaceC3196a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC3748a service;

    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.network.user.UserRESTDataSource$forgot$2", f = "UserRESTDataSource.kt", l = {Temperature.MAX_AMBIENT_BLOCK}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lnd/s;", "Lc6/a;", "<anonymous>", "()Lnd/s;"}, k = 3, mv = {2, 0, 0})
    /* renamed from: i6.a$a, reason: collision with other inner class name */
    static final class C0548a extends kotlin.coroutines.jvm.internal.l implements Ba.l<InterfaceC4588d<? super s<CommonResponse>>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f43105B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ ForgotPasswordRequestInput f43107D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0548a(ForgotPasswordRequestInput forgotPasswordRequestInput, InterfaceC4588d<? super C0548a> interfaceC4588d) {
            super(1, interfaceC4588d);
            this.f43107D = forgotPasswordRequestInput;
        }

        @Override // Ba.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4588d<? super s<CommonResponse>> interfaceC4588d) {
            return ((C0548a) create(interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(InterfaceC4588d<?> interfaceC4588d) {
            return C3629a.this.new C0548a(this.f43107D, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f43105B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC3748a interfaceC3748a = C3629a.this.service;
                ForgotPasswordRequest forgotPasswordRequest = new ForgotPasswordRequest(this.f43107D.getEmail());
                this.f43105B = 1;
                obj = interfaceC3748a.c(forgotPasswordRequest, this);
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

    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.network.user.UserRESTDataSource$forgot$3", f = "UserRESTDataSource.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc6/a;", "it", "Lm4/c;", "<anonymous>", "(Lc6/a;)Lm4/c;"}, k = 3, mv = {2, 0, 0})
    /* renamed from: i6.a$b */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Ba.p<CommonResponse, InterfaceC4588d<? super m4.CommonResponse>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f43108B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f43109C;

        b(InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CommonResponse commonResponse, InterfaceC4588d<? super m4.CommonResponse> interfaceC4588d) {
            return ((b) create(commonResponse, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            b bVar = new b(interfaceC4588d);
            bVar.f43109C = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f43108B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            CommonResponse commonResponse = (CommonResponse) this.f43109C;
            return new m4.CommonResponse(commonResponse.getStatus(), commonResponse.getErrorCode(), commonResponse.getMessage());
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.network.user.UserRESTDataSource$getCalibrationCertificate$2", f = "UserRESTDataSource.kt", l = {116}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lnd/s;", "Lf6/b;", "<anonymous>", "()Lnd/s;"}, k = 3, mv = {2, 0, 0})
    /* renamed from: i6.a$c */
    static final class c extends kotlin.coroutines.jvm.internal.l implements Ba.l<InterfaceC4588d<? super s<CertificateResponse>>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f43110B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ CalibrationRequestInput f43112D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CalibrationRequestInput calibrationRequestInput, InterfaceC4588d<? super c> interfaceC4588d) {
            super(1, interfaceC4588d);
            this.f43112D = calibrationRequestInput;
        }

        @Override // Ba.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4588d<? super s<CertificateResponse>> interfaceC4588d) {
            return ((c) create(interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(InterfaceC4588d<?> interfaceC4588d) {
            return C3629a.this.new c(this.f43112D, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f43110B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC3748a interfaceC3748a = C3629a.this.service;
                String secureID = this.f43112D.getSecureID();
                this.f43110B = 1;
                obj = interfaceC3748a.b(secureID, this);
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

    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.network.user.UserRESTDataSource$getCalibrationCertificate$3", f = "UserRESTDataSource.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf6/b;", "it", "Lp4/a;", "<anonymous>", "(Lf6/b;)Lp4/a;"}, k = 3, mv = {2, 0, 0})
    /* renamed from: i6.a$d */
    static final class d extends kotlin.coroutines.jvm.internal.l implements Ba.p<CertificateResponse, InterfaceC4588d<? super CalibrationData>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f43113B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f43114C;

        d(InterfaceC4588d<? super d> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CertificateResponse certificateResponse, InterfaceC4588d<? super CalibrationData> interfaceC4588d) {
            return ((d) create(certificateResponse, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            d dVar = new d(interfaceC4588d);
            dVar.f43114C = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f43113B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            return ((CertificateResponse) this.f43114C).a();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.network.user.UserRESTDataSource$getCurrentOffers$2", f = "UserRESTDataSource.kt", l = {103}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lnd/s;", "Lf6/d;", "<anonymous>", "()Lnd/s;"}, k = 3, mv = {2, 0, 0})
    /* renamed from: i6.a$e */
    static final class e extends kotlin.coroutines.jvm.internal.l implements Ba.l<InterfaceC4588d<? super s<CurrentOffersResponse>>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f43115B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ CurrentOffersRequestInput f43117D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(CurrentOffersRequestInput currentOffersRequestInput, InterfaceC4588d<? super e> interfaceC4588d) {
            super(1, interfaceC4588d);
            this.f43117D = currentOffersRequestInput;
        }

        @Override // Ba.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4588d<? super s<CurrentOffersResponse>> interfaceC4588d) {
            return ((e) create(interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(InterfaceC4588d<?> interfaceC4588d) {
            return C3629a.this.new e(this.f43117D, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f43115B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC3748a interfaceC3748a = C3629a.this.service;
                String devices = this.f43117D.getDevices();
                this.f43115B = 1;
                obj = interfaceC3748a.h(devices, this);
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

    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.network.user.UserRESTDataSource$getCurrentOffers$3", f = "UserRESTDataSource.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf6/d;", "it", "Lp4/c;", "<anonymous>", "(Lf6/d;)Lp4/c;"}, k = 3, mv = {2, 0, 0})
    /* renamed from: i6.a$f */
    static final class f extends kotlin.coroutines.jvm.internal.l implements Ba.p<CurrentOffersResponse, InterfaceC4588d<? super CurrentOffers>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f43118B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f43119C;

        f(InterfaceC4588d<? super f> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CurrentOffersResponse currentOffersResponse, InterfaceC4588d<? super CurrentOffers> interfaceC4588d) {
            return ((f) create(currentOffersResponse, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            f fVar = new f(interfaceC4588d);
            fVar.f43119C = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f43118B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            CurrentOffersResponse currentOffersResponse = (CurrentOffersResponse) this.f43119C;
            List<OfferDataRemote> listA = currentOffersResponse.getData().a();
            ArrayList arrayList = new ArrayList(r.x(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList.add(((OfferDataRemote) it.next()).a());
            }
            return new CurrentOffers(arrayList, currentOffersResponse.getData().getRecieves_newsletter(), kotlin.coroutines.jvm.internal.b.c(currentOffersResponse.getStatusCode()), currentOffersResponse.getError(), currentOffersResponse.getMessage());
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.network.user.UserRESTDataSource$getWatchedVideos$2", f = "UserRESTDataSource.kt", l = {75}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lnd/s;", "Lf6/p;", "<anonymous>", "()Lnd/s;"}, k = 3, mv = {2, 0, 0})
    /* renamed from: i6.a$g */
    static final class g extends kotlin.coroutines.jvm.internal.l implements Ba.l<InterfaceC4588d<? super s<WatchedVideosResponse>>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f43120B;

        g(InterfaceC4588d<? super g> interfaceC4588d) {
            super(1, interfaceC4588d);
        }

        @Override // Ba.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4588d<? super s<WatchedVideosResponse>> interfaceC4588d) {
            return ((g) create(interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(InterfaceC4588d<?> interfaceC4588d) {
            return C3629a.this.new g(interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f43120B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC3748a interfaceC3748a = C3629a.this.service;
                this.f43120B = 1;
                obj = interfaceC3748a.a(this);
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

    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.network.user.UserRESTDataSource$getWatchedVideos$3", f = "UserRESTDataSource.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf6/p;", "it", "Lp4/n;", "<anonymous>", "(Lf6/p;)Lp4/n;"}, k = 3, mv = {2, 0, 0})
    /* renamed from: i6.a$h */
    static final class h extends kotlin.coroutines.jvm.internal.l implements Ba.p<WatchedVideosResponse, InterfaceC4588d<? super WatchedVideos>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f43122B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f43123C;

        h(InterfaceC4588d<? super h> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(WatchedVideosResponse watchedVideosResponse, InterfaceC4588d<? super WatchedVideos> interfaceC4588d) {
            return ((h) create(watchedVideosResponse, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            h hVar = new h(interfaceC4588d);
            hVar.f43123C = obj;
            return hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f43122B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            WatchedVideosResponse watchedVideosResponse = (WatchedVideosResponse) this.f43123C;
            return new WatchedVideos(watchedVideosResponse.d(), kotlin.coroutines.jvm.internal.b.c(watchedVideosResponse.getStatusCode()), watchedVideosResponse.getError(), watchedVideosResponse.getMessage());
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.network.user.UserRESTDataSource$login$2", f = "UserRESTDataSource.kt", l = {16}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lnd/s;", "Lf6/h;", "<anonymous>", "()Lnd/s;"}, k = 3, mv = {2, 0, 0})
    /* renamed from: i6.a$i */
    static final class i extends kotlin.coroutines.jvm.internal.l implements Ba.l<InterfaceC4588d<? super s<LoginResponse>>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f43124B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ LoginRequestInput f43126D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(LoginRequestInput loginRequestInput, InterfaceC4588d<? super i> interfaceC4588d) {
            super(1, interfaceC4588d);
            this.f43126D = loginRequestInput;
        }

        @Override // Ba.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4588d<? super s<LoginResponse>> interfaceC4588d) {
            return ((i) create(interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(InterfaceC4588d<?> interfaceC4588d) {
            return C3629a.this.new i(this.f43126D, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f43124B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC3748a interfaceC3748a = C3629a.this.service;
                LoginRequest loginRequest = new LoginRequest(this.f43126D.getEmail(), this.f43126D.getPassword(), this.f43126D.getCheckTerms(), LoginDeviceRemote.INSTANCE.a(this.f43126D.getDevice()));
                this.f43124B = 1;
                obj = interfaceC3748a.g(loginRequest, this);
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

    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.network.user.UserRESTDataSource$login$3", f = "UserRESTDataSource.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf6/h;", "it", "Lp4/m;", "<anonymous>", "(Lf6/h;)Lp4/m;"}, k = 3, mv = {2, 0, 0})
    /* renamed from: i6.a$j */
    static final class j extends kotlin.coroutines.jvm.internal.l implements Ba.p<LoginResponse, InterfaceC4588d<? super UserData>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f43127B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f43128C;

        j(InterfaceC4588d<? super j> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(LoginResponse loginResponse, InterfaceC4588d<? super UserData> interfaceC4588d) {
            return ((j) create(loginResponse, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            j jVar = new j(interfaceC4588d);
            jVar.f43128C = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f43127B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            LoginResponse loginResponse = (LoginResponse) this.f43128C;
            return new UserData(loginResponse.getAccountName(), loginResponse.getAccountEmail(), loginResponse.getAccessToken(), loginResponse.getStatus(), loginResponse.getErrorCode(), loginResponse.getMessage());
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.network.user.UserRESTDataSource$markOfferViewed$2", f = "UserRESTDataSource.kt", l = {121}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lnd/s;", "Lf6/i;", "<anonymous>", "()Lnd/s;"}, k = 3, mv = {2, 0, 0})
    /* renamed from: i6.a$k */
    static final class k extends kotlin.coroutines.jvm.internal.l implements Ba.l<InterfaceC4588d<? super s<MarkOfferResponse>>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f43129B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ MarkOfferViewedRequestInput f43131D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(MarkOfferViewedRequestInput markOfferViewedRequestInput, InterfaceC4588d<? super k> interfaceC4588d) {
            super(1, interfaceC4588d);
            this.f43131D = markOfferViewedRequestInput;
        }

        @Override // Ba.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4588d<? super s<MarkOfferResponse>> interfaceC4588d) {
            return ((k) create(interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(InterfaceC4588d<?> interfaceC4588d) {
            return C3629a.this.new k(this.f43131D, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f43129B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC3748a interfaceC3748a = C3629a.this.service;
                MarkOfferViewedRequest markOfferViewedRequest = new MarkOfferViewedRequest(this.f43131D.a());
                this.f43129B = 1;
                obj = interfaceC3748a.f(markOfferViewedRequest, this);
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

    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.network.user.UserRESTDataSource$markOfferViewed$3", f = "UserRESTDataSource.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf6/i;", "it", "Lp4/i;", "<anonymous>", "(Lf6/i;)Lp4/i;"}, k = 3, mv = {2, 0, 0})
    /* renamed from: i6.a$l */
    static final class l extends kotlin.coroutines.jvm.internal.l implements Ba.p<MarkOfferResponse, InterfaceC4588d<? super MarkOffers>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f43132B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f43133C;

        l(InterfaceC4588d<? super l> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(MarkOfferResponse markOfferResponse, InterfaceC4588d<? super MarkOffers> interfaceC4588d) {
            return ((l) create(markOfferResponse, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            l lVar = new l(interfaceC4588d);
            lVar.f43133C = obj;
            return lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f43132B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            MarkOfferResponse markOfferResponse = (MarkOfferResponse) this.f43133C;
            return new MarkOffers(markOfferResponse.c(), kotlin.coroutines.jvm.internal.b.c(markOfferResponse.getStatusCode()), markOfferResponse.getError(), markOfferResponse.getMessage());
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.network.user.UserRESTDataSource$saveWatchedVideos$2", f = "UserRESTDataSource.kt", l = {87}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lnd/s;", "Lf6/p;", "<anonymous>", "()Lnd/s;"}, k = 3, mv = {2, 0, 0})
    /* renamed from: i6.a$m */
    static final class m extends kotlin.coroutines.jvm.internal.l implements Ba.l<InterfaceC4588d<? super s<WatchedVideosResponse>>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f43134B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ SaveWatchedVideoRequestInput f43136D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(SaveWatchedVideoRequestInput saveWatchedVideoRequestInput, InterfaceC4588d<? super m> interfaceC4588d) {
            super(1, interfaceC4588d);
            this.f43136D = saveWatchedVideoRequestInput;
        }

        @Override // Ba.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4588d<? super s<WatchedVideosResponse>> interfaceC4588d) {
            return ((m) create(interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(InterfaceC4588d<?> interfaceC4588d) {
            return C3629a.this.new m(this.f43136D, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f43134B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC3748a interfaceC3748a = C3629a.this.service;
                SaveWatchedVideoRequest saveWatchedVideoRequest = new SaveWatchedVideoRequest(this.f43136D.a());
                this.f43134B = 1;
                obj = interfaceC3748a.e(saveWatchedVideoRequest, this);
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

    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.network.user.UserRESTDataSource$saveWatchedVideos$3", f = "UserRESTDataSource.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf6/p;", "it", "Lp4/n;", "<anonymous>", "(Lf6/p;)Lp4/n;"}, k = 3, mv = {2, 0, 0})
    /* renamed from: i6.a$n */
    static final class n extends kotlin.coroutines.jvm.internal.l implements Ba.p<WatchedVideosResponse, InterfaceC4588d<? super WatchedVideos>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f43137B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f43138C;

        n(InterfaceC4588d<? super n> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(WatchedVideosResponse watchedVideosResponse, InterfaceC4588d<? super WatchedVideos> interfaceC4588d) {
            return ((n) create(watchedVideosResponse, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            n nVar = new n(interfaceC4588d);
            nVar.f43138C = obj;
            return nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f43137B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            WatchedVideosResponse watchedVideosResponse = (WatchedVideosResponse) this.f43138C;
            return new WatchedVideos(watchedVideosResponse.d(), kotlin.coroutines.jvm.internal.b.c(watchedVideosResponse.getStatusCode()), watchedVideosResponse.getError(), watchedVideosResponse.getMessage());
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.network.user.UserRESTDataSource$signup$2", f = "UserRESTDataSource.kt", l = {36}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lnd/s;", "Lf6/o;", "<anonymous>", "()Lnd/s;"}, k = 3, mv = {2, 0, 0})
    /* renamed from: i6.a$o */
    static final class o extends kotlin.coroutines.jvm.internal.l implements Ba.l<InterfaceC4588d<? super s<SignUpResponse>>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f43139B;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ SignUpRequestInput f43141D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(SignUpRequestInput signUpRequestInput, InterfaceC4588d<? super o> interfaceC4588d) {
            super(1, interfaceC4588d);
            this.f43141D = signUpRequestInput;
        }

        @Override // Ba.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4588d<? super s<SignUpResponse>> interfaceC4588d) {
            return ((o) create(interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(InterfaceC4588d<?> interfaceC4588d) {
            return C3629a.this.new o(this.f43141D, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f43139B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC3748a interfaceC3748a = C3629a.this.service;
                SignUpRequest signUpRequest = new SignUpRequest(this.f43141D.getFirstName(), this.f43141D.getLastName(), this.f43141D.getEmail(), this.f43141D.getPassword(), this.f43141D.getAgreeToTerms(), this.f43141D.getEmailOptIn(), this.f43141D.getLocale());
                this.f43139B = 1;
                obj = interfaceC3748a.d(signUpRequest, this);
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

    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.network.user.UserRESTDataSource$signup$3", f = "UserRESTDataSource.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf6/o;", "it", "Lp4/m;", "<anonymous>", "(Lf6/o;)Lp4/m;"}, k = 3, mv = {2, 0, 0})
    /* renamed from: i6.a$p */
    static final class p extends kotlin.coroutines.jvm.internal.l implements Ba.p<SignUpResponse, InterfaceC4588d<? super UserData>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f43142B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f43143C;

        p(InterfaceC4588d<? super p> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SignUpResponse signUpResponse, InterfaceC4588d<? super UserData> interfaceC4588d) {
            return ((p) create(signUpResponse, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            p pVar = new p(interfaceC4588d);
            pVar.f43143C = obj;
            return pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f43142B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            SignUpResponse signUpResponse = (SignUpResponse) this.f43143C;
            return new UserData(signUpResponse.getAccountName(), signUpResponse.getAccountEmail(), null, signUpResponse.getStatus(), signUpResponse.getErrorCode(), signUpResponse.getMessage());
        }
    }

    public C3629a(InterfaceC3748a service) {
        C3862t.g(service, "service");
        this.service = service;
    }

    @Override // e4.InterfaceC3196a
    public Object a(InterfaceC4588d<? super Z3.a<WatchedVideos>> interfaceC4588d) {
        return X5.e.d(new g(null), new h(null), interfaceC4588d);
    }

    @Override // e4.InterfaceC3196a
    public Object b(ForgotPasswordRequestInput forgotPasswordRequestInput, InterfaceC4588d<? super Z3.a<m4.CommonResponse>> interfaceC4588d) {
        return X5.e.d(new C0548a(forgotPasswordRequestInput, null), new b(null), interfaceC4588d);
    }

    @Override // e4.InterfaceC3196a
    public Object c(SignUpRequestInput signUpRequestInput, InterfaceC4588d<? super Z3.a<UserData>> interfaceC4588d) {
        return X5.e.d(new o(signUpRequestInput, null), new p(null), interfaceC4588d);
    }

    @Override // e4.InterfaceC3196a
    public Object d(CurrentOffersRequestInput currentOffersRequestInput, InterfaceC4588d<? super Z3.a<CurrentOffers>> interfaceC4588d) {
        return X5.e.d(new e(currentOffersRequestInput, null), new f(null), interfaceC4588d);
    }

    @Override // e4.InterfaceC3196a
    public Object e(CalibrationRequestInput calibrationRequestInput, InterfaceC4588d<? super Z3.a<CalibrationData>> interfaceC4588d) {
        return X5.e.d(new c(calibrationRequestInput, null), new d(null), interfaceC4588d);
    }

    @Override // e4.InterfaceC3196a
    public Object f(LoginRequestInput loginRequestInput, InterfaceC4588d<? super Z3.a<UserData>> interfaceC4588d) {
        return X5.e.d(new i(loginRequestInput, null), new j(null), interfaceC4588d);
    }

    @Override // e4.InterfaceC3196a
    public Object g(SaveWatchedVideoRequestInput saveWatchedVideoRequestInput, InterfaceC4588d<? super Z3.a<WatchedVideos>> interfaceC4588d) {
        return X5.e.d(new m(saveWatchedVideoRequestInput, null), new n(null), interfaceC4588d);
    }

    @Override // e4.InterfaceC3196a
    public Object h(MarkOfferViewedRequestInput markOfferViewedRequestInput, InterfaceC4588d<? super Z3.a<MarkOffers>> interfaceC4588d) {
        return X5.e.d(new k(markOfferViewedRequestInput, null), new l(null), interfaceC4588d);
    }
}
