package T5;

import Xb.C1841i;
import Xb.F;
import Xb.I;
import Xb.InterfaceC1867v0;
import android.view.B;
import android.view.D;
import android.view.Y;
import android.view.Z;
import com.apptionlabs.meater_app.data.LocalStorage;
import com.apptionlabs.meater_app.model.CalibrationCertificate;
import com.apptionlabs.meater_app.model.SensorResistance;
import com.apptionlabs.meater_app.model.UiState;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3862t;
import l4.AbstractC3900b;
import oa.C4153F;
import oa.C4173r;
import p4.CalibrationData;
import t4.InterfaceC4551a;
import ta.AbstractC4585a;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: CalibrationViewModel.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010)\u001a\u0010\u0012\f\u0012\n &*\u0004\u0018\u00010\f0\f0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\"\u0010+\u001a\u0010\u0012\f\u0012\n &*\u0004\u0018\u00010\f0\f0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010(R\"\u0010-\u001a\u0010\u0012\f\u0012\n &*\u0004\u0018\u00010\f0\f0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010(R\"\u0010/\u001a\u0010\u0012\f\u0012\n &*\u0004\u0018\u00010\f0\f0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010(R\u001d\u00104\u001a\b\u0012\u0004\u0012\u0002000%8\u0006¢\u0006\f\n\u0004\b1\u0010(\u001a\u0004\b2\u00103R \u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010(R#\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006078\u0006¢\u0006\f\n\u0004\b\u001d\u00108\u001a\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\"\u0010C\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u0010@\u001a\u0004\b=\u0010A\"\u0004\bB\u0010\u0018R\u0014\u0010E\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0013\u0010D¨\u0006F"}, d2 = {"LT5/a;", "Landroidx/lifecycle/Y;", "Lt4/a;", "calibrationUseCase", "<init>", "(Lt4/a;)V", "", "Lcom/apptionlabs/meater_app/model/SensorResistance;", "sensorList", "Loa/F;", "q", "(Ljava/util/List;)V", "", "secureID", "o", "(Ljava/lang/String;)V", "Ll4/b;", "Lp4/a;", "calibrationResponse", "m", "(Ll4/b;)V", "Lcom/apptionlabs/meater_app/model/CalibrationCertificate;", "calibrationCertificate", "r", "(Lcom/apptionlabs/meater_app/model/CalibrationCertificate;)V", "", "deviceID", "n", "(J)Ljava/lang/String;", "j", "(J)V", "b", "Lt4/a;", "LXb/v0;", "c", "LXb/v0;", "calibrationJob", "Landroidx/lifecycle/D;", "kotlin.jvm.PlatformType", "d", "Landroidx/lifecycle/D;", "startDate", "e", "bath0", "f", "bath50", "g", "bath100", "Lcom/apptionlabs/meater_app/model/UiState;", "h", "l", "()Landroidx/lifecycle/D;", "uiState", "i", "_sensor", "Landroidx/lifecycle/B;", "Landroidx/lifecycle/B;", "getSensor", "()Landroidx/lifecycle/B;", "sensor", "LXb/F;", "k", "LXb/F;", "coroutineExceptionHandler", "Lcom/apptionlabs/meater_app/model/CalibrationCertificate;", "()Lcom/apptionlabs/meater_app/model/CalibrationCertificate;", "p", "certificate", "Ljava/lang/String;", "degree", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends Y {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4551a calibrationUseCase;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1867v0 calibrationJob;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final D<String> startDate;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final D<String> bath0;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final D<String> bath50;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final D<String> bath100;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final D<UiState> uiState;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final D<List<SensorResistance>> _sensor;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final B<List<SensorResistance>> sensor;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final F coroutineExceptionHandler;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public CalibrationCertificate certificate;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final String degree;

    /* compiled from: CalibrationViewModel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.viewmodel.CalibrationViewModel$requestCalibrationCertificate$1", f = "CalibrationViewModel.kt", l = {75, 77}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: T5.a$a, reason: collision with other inner class name */
    static final class C0233a extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f16005B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f16006C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ String f16007D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ a f16008E;

        /* compiled from: CalibrationViewModel.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.viewmodel.CalibrationViewModel$requestCalibrationCertificate$1$2$1", f = "CalibrationViewModel.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
        /* renamed from: T5.a$a$a, reason: collision with other inner class name */
        static final class C0234a extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f16009B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ a f16010C;

            /* renamed from: D, reason: collision with root package name */
            final /* synthetic */ AbstractC3900b<CalibrationData> f16011D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0234a(a aVar, AbstractC3900b<CalibrationData> abstractC3900b, InterfaceC4588d<? super C0234a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f16010C = aVar;
                this.f16011D = abstractC3900b;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new C0234a(this.f16010C, this.f16011D, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((C0234a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C4696b.e();
                if (this.f16009B != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
                this.f16010C.m(this.f16011D);
                return C4153F.f46609a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0233a(String str, a aVar, InterfaceC4588d<? super C0233a> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f16007D = str;
            this.f16008E = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            C0233a c0233a = new C0233a(this.f16007D, this.f16008E, interfaceC4588d);
            c0233a.f16006C = obj;
            return c0233a;
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((C0233a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = ua.C4696b.e()
                int r1 = r7.f16005B
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r0 = r7.f16006C
                oa.C4173r.b(r8)
                goto L73
            L14:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1c:
                oa.C4173r.b(r8)     // Catch: java.lang.Throwable -> L20
                goto L41
            L20:
                r8 = move-exception
                goto L48
            L22:
                oa.C4173r.b(r8)
                java.lang.Object r8 = r7.f16006C
                Xb.I r8 = (Xb.I) r8
                p4.b r8 = new p4.b
                java.lang.String r1 = r7.f16007D
                r8.<init>(r1)
                T5.a r1 = r7.f16008E
                oa.q$a r4 = oa.C4172q.INSTANCE     // Catch: java.lang.Throwable -> L20
                t4.a r1 = T5.a.h(r1)     // Catch: java.lang.Throwable -> L20
                r7.f16005B = r3     // Catch: java.lang.Throwable -> L20
                java.lang.Object r8 = r1.a(r8, r7)     // Catch: java.lang.Throwable -> L20
                if (r8 != r0) goto L41
                return r0
            L41:
                l4.b r8 = (l4.AbstractC3900b) r8     // Catch: java.lang.Throwable -> L20
                java.lang.Object r8 = oa.C4172q.a(r8)     // Catch: java.lang.Throwable -> L20
                goto L52
            L48:
                oa.q$a r1 = oa.C4172q.INSTANCE
                java.lang.Object r8 = oa.C4173r.a(r8)
                java.lang.Object r8 = oa.C4172q.a(r8)
            L52:
                T5.a r1 = r7.f16008E
                boolean r3 = oa.C4172q.d(r8)
                if (r3 == 0) goto L74
                r3 = r8
                l4.b r3 = (l4.AbstractC3900b) r3
                Xb.G0 r4 = Xb.Z.c()
                T5.a$a$a r5 = new T5.a$a$a
                r6 = 0
                r5.<init>(r1, r3, r6)
                r7.f16006C = r8
                r7.f16005B = r2
                java.lang.Object r1 = Xb.C1837g.g(r4, r5, r7)
                if (r1 != r0) goto L72
                return r0
            L72:
                r0 = r8
            L73:
                r8 = r0
            L74:
                T5.a r0 = r7.f16008E
                java.lang.Throwable r8 = oa.C4172q.b(r8)
                if (r8 == 0) goto L93
                java.lang.String r1 = "Exception"
                java.lang.Object[] r8 = new java.lang.Object[]{r8}
                U4.b.e(r1, r8)
                androidx.lifecycle.D r8 = r0.l()
                com.apptionlabs.meater_app.model.UiState$Error r0 = new com.apptionlabs.meater_app.model.UiState$Error
                java.lang.String r1 = ""
                r0.<init>(r1)
                r8.o(r0)
            L93:
                oa.F r8 = oa.C4153F.f46609a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: T5.a.C0233a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"T5/a$b", "Lta/a;", "LXb/F;", "Lta/g;", "context", "", "exception", "Loa/F;", "y", "(Lta/g;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends AbstractC4585a implements F {
        public b(F.Companion companion) {
            super(companion);
        }

        @Override // Xb.F
        public void y(ta.g context, Throwable exception) {
            U4.b.e("Exception", exception);
        }
    }

    public a(InterfaceC4551a calibrationUseCase) {
        C3862t.g(calibrationUseCase, "calibrationUseCase");
        this.calibrationUseCase = calibrationUseCase;
        this.startDate = new D<>("");
        this.bath0 = new D<>("");
        this.bath50 = new D<>("");
        this.bath100 = new D<>("");
        this.uiState = new D<>();
        D<List<SensorResistance>> d10 = new D<>();
        this._sensor = d10;
        this.sensor = d10;
        this.coroutineExceptionHandler = new b(F.INSTANCE);
        this.degree = " ℃";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void m(AbstractC3900b<CalibrationData> calibrationResponse) {
        List<CalibrationData.Data> listA;
        if (calibrationResponse instanceof AbstractC3900b.a) {
            this.uiState.o(new UiState.Error(""));
            return;
        }
        if (!(calibrationResponse instanceof AbstractC3900b.C0590b)) {
            throw new NoWhenBranchMatchedException();
        }
        CalibrationData calibrationData = (CalibrationData) ((AbstractC3900b.C0590b) calibrationResponse).a();
        if (calibrationData == null || (listA = calibrationData.a()) == null) {
            return;
        }
        CalibrationCertificate calibrationCertificate = new CalibrationCertificate();
        CalibrationData.Data data = listA.get(0);
        calibrationCertificate.setSecureID(data.getSecureID());
        calibrationCertificate.setTestDateTime(data.getTestDateTime());
        calibrationCertificate.setBath0C(Float.valueOf(data.getBath0C()));
        calibrationCertificate.setBath50C(Float.valueOf(data.getBath50C()));
        calibrationCertificate.setBath100C(Float.valueOf(data.getBath100C()));
        ArrayList arrayList = new ArrayList();
        List<CalibrationData.Data.SensorResistance> listE = data.e();
        if (listE != null) {
            for (CalibrationData.Data.SensorResistance sensorResistance : listE) {
                SensorResistance sensorResistance2 = new SensorResistance();
                sensorResistance2.sensorNumber = Long.valueOf(sensorResistance.getSensorNumber());
                sensorResistance2.resistance0C = Float.valueOf(sensorResistance.getResistance0C());
                sensorResistance2.resistance50C = Float.valueOf(sensorResistance.getResistance50C());
                sensorResistance2.resistance100C = Float.valueOf(sensorResistance.getResistance100C());
                sensorResistance2.temperature0C = Float.valueOf(sensorResistance.getTemperature0C());
                sensorResistance2.temperature50C = Float.valueOf(sensorResistance.getTemperature50C());
                sensorResistance2.temperature100C = Float.valueOf(sensorResistance.getTemperature100C());
                arrayList.add(sensorResistance2);
            }
        }
        calibrationCertificate.setSensorResistances(arrayList);
        r(calibrationCertificate);
    }

    private final String n(long deviceID) {
        String hexString = Long.toHexString(deviceID);
        C3862t.f(hexString, "toHexString(...)");
        Locale locale = Locale.getDefault();
        C3862t.f(locale, "getDefault(...)");
        String upperCase = hexString.toUpperCase(locale);
        C3862t.f(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    private final void o(String secureID) {
        this.calibrationJob = C1841i.d(Z.a(this), Xb.Z.b().s(this.coroutineExceptionHandler), null, new C0233a(secureID, this, null), 2, null);
    }

    private final void q(List<? extends SensorResistance> sensorList) {
        this._sensor.l(sensorList);
    }

    private final void r(CalibrationCertificate calibrationCertificate) {
        if (calibrationCertificate.getSecureID() == null) {
            this.uiState.o(new UiState.Error(""));
            return;
        }
        if (calibrationCertificate.getMacAddress() == null) {
            calibrationCertificate.setMacAddress(calibrationCertificate.getSecureID());
        }
        p(calibrationCertificate);
        LocalStorage.sharedStorage().calibrationCertificateDAO().a(calibrationCertificate);
        this.startDate.o(calibrationCertificate.getCalibrationTestDate());
        this.bath0.o(calibrationCertificate.getBath0C() + this.degree);
        this.bath50.o(calibrationCertificate.getBath50C() + this.degree);
        this.bath100.o(calibrationCertificate.getBath100C() + this.degree);
        List<SensorResistance> sensorResistances = calibrationCertificate.getSensorResistances();
        C3862t.f(sensorResistances, "getSensorResistances(...)");
        q(sensorResistances);
        this.uiState.o(new UiState.Success(""));
    }

    public final void j(long secureID) {
        this.uiState.o(UiState.Loading.INSTANCE);
        String strN = n(secureID);
        CalibrationCertificate calibrationCertificateB = LocalStorage.sharedStorage().calibrationCertificateDAO().b(strN);
        if (calibrationCertificateB != null) {
            r(calibrationCertificateB);
        } else {
            o(strN);
        }
    }

    public final CalibrationCertificate k() {
        CalibrationCertificate calibrationCertificate = this.certificate;
        if (calibrationCertificate != null) {
            return calibrationCertificate;
        }
        C3862t.u("certificate");
        return null;
    }

    public final D<UiState> l() {
        return this.uiState;
    }

    public final void p(CalibrationCertificate calibrationCertificate) {
        C3862t.g(calibrationCertificate, "<set-?>");
        this.certificate = calibrationCertificate;
    }
}
