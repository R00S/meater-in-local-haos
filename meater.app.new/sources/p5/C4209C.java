package p5;

import E4.e;
import P5.Q;
import android.os.Handler;
import android.os.Looper;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.data.DevicesType;
import com.apptionlabs.meater_app.model.DeviceConnectionState;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import com.apptionlabs.meater_app.model.MEATERPlus;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.versions.FirmwareVersion;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import x4.b;
import z4.C5181k;
import z4.a0;

/* compiled from: MeaterPlusFirmwareFactory.kt */
@Metadata(d1 = {"\u0000g\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u00010\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\bJ\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\bR\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010.R\u0016\u00102\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u00101¨\u00063"}, d2 = {"Lp5/C;", "Lp5/m;", "Lp5/C$a;", "builder", "<init>", "(Lp5/C$a;)V", "Loa/F;", "i", "()V", "Lcom/apptionlabs/meater_app/data/DevicesType;", "k", "()Lcom/apptionlabs/meater_app/data/DevicesType;", "Ljava/nio/ByteBuffer;", "firmwareImage", "n", "(Ljava/nio/ByteBuffer;)V", "h", "j", "l", "a", "Lcom/apptionlabs/meater_app/model/MEATERPlus;", "Lcom/apptionlabs/meater_app/model/MEATERPlus;", "device", "", "b", "Ljava/lang/String;", "firmwareUrl", "Lp5/l;", "c", "Lp5/l;", "callback", "", "d", "J", "startTime", "e", "firmwareVersion", "", "f", "I", "firmwareCrc", "", "g", "Z", "isUpdateInProgress", "Lz4/a0;", "Lz4/a0;", "updater", "p5/C$d", "Lp5/C$d;", "localCallback", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: p5.C, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4209C implements InterfaceC4222m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private MEATERPlus device;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String firmwareUrl;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private InterfaceC4221l callback;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long startTime;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private String firmwareVersion;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int firmwareCrc;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isUpdateInProgress;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private a0 updater;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private d localCallback;

    /* compiled from: MeaterPlusFirmwareFactory.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001a\u0010\u0019J\r\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0005\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001eR\u0018\u0010\f\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001eR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001f¨\u0006 "}, d2 = {"Lp5/C$a;", "", "<init>", "()V", "LT4/p;", "device", "g", "(LT4/p;)Lp5/C$a;", "", "firmwareUrl", "i", "(Ljava/lang/String;)Lp5/C$a;", "firmwareCRC", "h", "Lp5/l;", "callback", "f", "(Lp5/l;)Lp5/C$a;", "Lp5/C;", "a", "()Lp5/C;", "Lcom/apptionlabs/meater_app/model/MEATERPlus;", "c", "()Lcom/apptionlabs/meater_app/model/MEATERPlus;", "e", "()Ljava/lang/String;", "d", "b", "()Lp5/l;", "Lcom/apptionlabs/meater_app/model/MEATERPlus;", "Ljava/lang/String;", "Lp5/l;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: p5.C$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private MEATERPlus device;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private String firmwareUrl;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private String firmwareCRC;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private InterfaceC4221l callback;

        public final C4209C a() {
            return new C4209C(this);
        }

        public final InterfaceC4221l b() {
            InterfaceC4221l interfaceC4221l = this.callback;
            if (interfaceC4221l != null) {
                return interfaceC4221l;
            }
            C3862t.u("callback");
            return null;
        }

        public final MEATERPlus c() {
            MEATERPlus mEATERPlus = this.device;
            if (mEATERPlus != null) {
                return mEATERPlus;
            }
            C3862t.u("device");
            return null;
        }

        /* renamed from: d, reason: from getter */
        public final String getFirmwareCRC() {
            return this.firmwareCRC;
        }

        /* renamed from: e, reason: from getter */
        public final String getFirmwareUrl() {
            return this.firmwareUrl;
        }

        public final a f(InterfaceC4221l callback) {
            C3862t.d(callback);
            this.callback = callback;
            return this;
        }

        public final a g(T4.p device) {
            C3862t.g(device, "device");
            this.device = (MEATERPlus) device;
            return this;
        }

        public final a h(String firmwareCRC) {
            this.firmwareCRC = firmwareCRC;
            return this;
        }

        public final a i(String firmwareUrl) {
            this.firmwareUrl = firmwareUrl;
            return this;
        }
    }

    /* compiled from: MeaterPlusFirmwareFactory.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: p5.C$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47508a;

        static {
            int[] iArr = new int[MEATERDeviceType.values().length];
            try {
                iArr[MEATERDeviceType.PLUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MEATERDeviceType.PLUS_SE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_PLUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MEATERDeviceType.SECOND_GENERATION_PLUS_PRO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f47508a = iArr;
        }
    }

    /* compiled from: MeaterPlusFirmwareFactory.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"p5/C$c", "LE4/e$b;", "Ljava/nio/ByteBuffer;", "firmwareImage", "Loa/F;", "b", "(Ljava/nio/ByteBuffer;)V", "a", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: p5.C$c */
    public static final class c implements e.b {
        c() {
        }

        @Override // E4.e.b
        public void a() {
            C4209C.this.l();
        }

        @Override // E4.e.b
        public void b(ByteBuffer firmwareImage) {
            C4209C.this.n(firmwareImage);
        }
    }

    /* compiled from: MeaterPlusFirmwareFactory.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0004¨\u0006\u0010"}, d2 = {"p5/C$d", "Lz4/a0$d;", "Loa/F;", "c", "()V", "", "reason", "a", "(Ljava/lang/String;)V", "", "progress", "f", "(D)V", "e", "d", "b", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: p5.C$d */
    public static final class d implements a0.d {
        d() {
        }

        @Override // z4.a0.d
        public void a(String reason) {
            InterfaceC4221l interfaceC4221l = C4209C.this.callback;
            if (interfaceC4221l != null) {
                interfaceC4221l.c(reason);
            }
            C4209C.this.isUpdateInProgress = false;
        }

        @Override // z4.a0.d
        public void b() {
            C4209C.this.isUpdateInProgress = true;
            InterfaceC4221l interfaceC4221l = C4209C.this.callback;
            if (interfaceC4221l != null) {
                interfaceC4221l.f();
            }
        }

        @Override // z4.a0.d
        public void c() {
            C4209C.this.h();
            InterfaceC4221l interfaceC4221l = C4209C.this.callback;
            if (interfaceC4221l != null) {
                interfaceC4221l.d();
            }
            C4209C.this.isUpdateInProgress = false;
        }

        @Override // z4.a0.d
        public void d() {
            InterfaceC4221l interfaceC4221l = C4209C.this.callback;
            if (interfaceC4221l != null) {
                interfaceC4221l.a();
            }
            C4209C.this.isUpdateInProgress = false;
        }

        @Override // z4.a0.d
        public void e() {
            InterfaceC4221l interfaceC4221l = C4209C.this.callback;
            if (interfaceC4221l != null) {
                interfaceC4221l.g();
            }
            C4209C.this.isUpdateInProgress = false;
        }

        @Override // z4.a0.d
        public void f(double progress) {
            InterfaceC4221l interfaceC4221l = C4209C.this.callback;
            if (interfaceC4221l != null) {
                interfaceC4221l.b(progress * 100.0d);
            }
            C4209C.this.isUpdateInProgress = true;
        }
    }

    /* compiled from: MeaterPlusFirmwareFactory.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"p5/C$e", "LE4/e$b;", "Ljava/nio/ByteBuffer;", "firmwareImage", "Loa/F;", "b", "(Ljava/nio/ByteBuffer;)V", "a", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: p5.C$e */
    public static final class e implements e.b {
        e() {
        }

        @Override // E4.e.b
        public void a() {
            InterfaceC4221l interfaceC4221l = C4209C.this.callback;
            if (interfaceC4221l != null) {
                interfaceC4221l.c(x4.g.h().getResources().getString(R.string.error_text_something_went_wrong));
            }
        }

        @Override // E4.e.b
        public void b(ByteBuffer firmwareImage) {
            C4209C.this.n(firmwareImage);
        }
    }

    public C4209C(a builder) {
        C3862t.g(builder, "builder");
        this.device = builder.c();
        this.firmwareUrl = builder.getFirmwareUrl();
        this.firmwareCrc = Q.f(builder.getFirmwareCRC());
        this.callback = builder.b();
        this.localCallback = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        if (this.device.relatedProbe() != null) {
            Probe probeRelatedProbe = this.device.relatedProbe();
            C3862t.d(probeRelatedProbe);
            probeRelatedProbe.setFirstSeenAdvertising(System.currentTimeMillis() + 20000);
        }
        this.device.setOtaUpdateInProgress(null);
        if (this.device.getBleConnection() != null) {
            C5181k bleConnection = this.device.getBleConnection();
            C3862t.d(bleConnection);
            bleConnection.n();
        }
    }

    private final void i() {
        DevicesType devicesTypeK = k();
        this.firmwareCrc = Q.f(FirmwareVersion.sharedInstance().getUpdateCrc(devicesTypeK));
        this.firmwareVersion = FirmwareVersion.sharedInstance().getVersion(devicesTypeK);
        ByteBuffer firmware = FirmwareVersion.sharedInstance().getFirmware(devicesTypeK);
        if (firmware != null) {
            n(firmware);
        } else {
            this.localCallback.a("Could not Find OTA");
        }
    }

    private final void j() {
        String str = this.firmwareVersion;
        if (str != null) {
            x4.b.j(b.EnumC0768b.f52663P.title, b.a.f52609G.title, str, null, 8, null);
        }
        e.Companion companion = E4.e.INSTANCE;
        String str2 = this.firmwareUrl;
        C3862t.d(str2);
        companion.c(str2, new c());
    }

    private final DevicesType k() {
        int i10 = b.f47508a[this.device.getMEATERDeviceType().ordinal()];
        if (i10 == 1) {
            return DevicesType.MEATER_PLUS;
        }
        if (i10 == 2) {
            return DevicesType.MEATER_PLUS_SE;
        }
        if (i10 == 3) {
            return DevicesType.MEATER_PLUSV2;
        }
        if (i10 != 4) {
            return null;
        }
        return DevicesType.MEATER_PLUS_PRO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: p5.B
            @Override // java.lang.Runnable
            public final void run() {
                C4209C.m(this.f47494B);
            }
        }, 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(C4209C c4209c) {
        e.Companion companion = E4.e.INSTANCE;
        String str = c4209c.firmwareUrl;
        C3862t.d(str);
        companion.c(str, c4209c.new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(ByteBuffer firmwareImage) {
        MEATERPlus mEATERPlus = this.device;
        if (mEATERPlus == null || mEATERPlus.getBleConnection() == null) {
            this.localCallback.e();
            return;
        }
        this.startTime = System.currentTimeMillis() / 1000;
        this.device.setBatteryLevel(0);
        this.device.setFirmwareRevision(null);
        a0 a0Var = new a0(this.device, firmwareImage, this.firmwareCrc, this.localCallback);
        this.updater = a0Var;
        a0Var.u();
        this.localCallback.f(0.0d);
    }

    @Override // p5.InterfaceC4222m
    public void a() {
        this.device.setConnectionState(DeviceConnectionState.OFFLINE);
        this.device.notifyStateUpdatedForSelfAndChildren();
        if (this.firmwareUrl == null) {
            i();
        } else {
            j();
        }
        this.isUpdateInProgress = true;
    }
}
