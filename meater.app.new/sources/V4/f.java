package V4;

import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.udp.MEATERLinkAddress;
import com.apptionlabs.meater_app.v1protobuf.V1MLProbe;
import com.apptionlabs.meater_app.v1protobuf.V1MasterMessage;
import com.apptionlabs.meater_app.v2protobuf.V2MLProbe;
import com.apptionlabs.meater_app.v2protobuf.V2MasterMessage;
import com.apptionlabs.meater_app.v3protobuf.MLDevice;
import com.apptionlabs.meater_app.v3protobuf.MasterMessage;
import com.apptionlabs.meater_app.v3protobuf.PingPongMessage;
import com.apptionlabs.meater_app.v3protobuf.PingPongMessageType;
import d5.C3042a;

/* compiled from: BlockWiFiSetupConnectivityTester.java */
/* loaded from: classes2.dex */
public class f extends t {

    /* renamed from: m, reason: collision with root package name */
    private static final Handler f18089m = new Handler(Looper.getMainLooper());

    /* renamed from: a, reason: collision with root package name */
    private MEATERDevice f18090a;

    /* renamed from: b, reason: collision with root package name */
    private g f18091b;

    /* renamed from: f, reason: collision with root package name */
    private MEATERLinkAddress f18095f;

    /* renamed from: i, reason: collision with root package name */
    private boolean f18098i;

    /* renamed from: l, reason: collision with root package name */
    private CountDownTimer f18101l;

    /* renamed from: c, reason: collision with root package name */
    private boolean f18092c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f18093d = false;

    /* renamed from: e, reason: collision with root package name */
    private int f18094e = -1;

    /* renamed from: g, reason: collision with root package name */
    private long f18096g = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f18097h = 0;

    /* renamed from: j, reason: collision with root package name */
    private Runnable f18099j = null;

    /* renamed from: k, reason: collision with root package name */
    private final Runnable f18100k = new Runnable() { // from class: V4.e
        @Override // java.lang.Runnable
        public final void run() {
            this.f18088B.m();
        }
    };

    public f(MEATERDevice mEATERDevice, g gVar, boolean z10) {
        this.f18098i = false;
        this.f18090a = mEATERDevice;
        this.f18091b = gVar;
        this.f18098i = z10;
        U4.b.f("Starting connectivity test for device %s", mEATERDevice.getDebugLogDescription());
        o();
        j();
        if (mEATERDevice.getMEATERDeviceType().mMEATERDeviceSupportsPingPongMessage()) {
            this.f18095f = mEATERDevice.getMeaterLinkAddress();
            n();
        }
    }

    private void i(int i10) {
        if (i10 != this.f18094e) {
            this.f18094e = i10;
            return;
        }
        U4.b.f("%s has passed the connectivity test", this.f18090a.getDebugLogDescription());
        this.f18092c = true;
        Runnable runnable = this.f18099j;
        if (runnable != null) {
            f18089m.removeCallbacks(runnable);
            this.f18099j = null;
        }
        f18089m.removeCallbacks(this.f18100k);
        this.f18091b.a(this.f18090a);
    }

    private static void j() {
        if (x4.g.t().T()) {
            return;
        }
        x4.g.t().L0(true);
        l.g0().c();
        C3042a.f().c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k() {
        MEATERLinkAddress mEATERLinkAddress;
        long j10 = this.f18096g;
        if (j10 == 0 || (mEATERLinkAddress = this.f18095f) == null) {
            return;
        }
        b.g(j10, mEATERLinkAddress);
        f18089m.postDelayed(this.f18099j, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l() {
        MEATERLinkAddress mEATERLinkAddress;
        long j10 = this.f18096g;
        if (j10 == 0 || (mEATERLinkAddress = this.f18095f) == null) {
            return;
        }
        b.h(j10, mEATERLinkAddress);
        f18089m.postDelayed(this.f18099j, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m() {
        MEATERDevice mEATERDevice;
        V4.a aVar;
        Runnable runnable = this.f18099j;
        if (runnable != null) {
            f18089m.removeCallbacks(runnable);
            this.f18099j = null;
        }
        if (this.f18092c || (mEATERDevice = this.f18090a) == null) {
            return;
        }
        U4.b.f("%s has failed the connectivity test", mEATERDevice.getDebugLogDescription());
        if (!this.f18093d) {
            aVar = V4.a.RECEIVE_BROADCAST;
        } else if (this.f18096g == 0) {
            aVar = V4.a.NO_PROBES;
        } else {
            aVar = V4.a.RECEIVE_UNICAST;
            if (this.f18098i) {
                E4.i.D().X();
            }
        }
        U4.b.f("%s failed the connectivity test", this.f18090a.getDebugLogDescription());
        this.f18092c = true;
        this.f18091b.b(this.f18090a, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        if (this.f18101l == null) {
            p();
        }
        int i10 = this.f18097h + 1;
        this.f18097h = i10;
        b.f(this.f18095f, i10);
    }

    private void o() {
        Handler handler = f18089m;
        handler.removeCallbacks(this.f18100k);
        try {
            handler.postDelayed(this.f18100k, Config.MC_STATS_INTERVAL);
        } catch (Exception e10) {
            U4.b.f("Reset timeout failed: %s", e10.getLocalizedMessage());
            this.f18091b.b(this.f18090a, V4.a.NO_ERROR);
        }
    }

    private void p() {
        this.f18101l = new a(Config.MC_STATS_INTERVAL, 4000L).start();
    }

    @Override // V4.t
    void a(MasterMessage masterMessage, int i10, MEATERLinkAddress mEATERLinkAddress) {
        if (this.f18092c || this.f18090a == null) {
            return;
        }
        MLDevice mLDeviceE = b.e(masterMessage);
        if (mLDeviceE != null) {
            b.g(mLDeviceE.identifier.longValue(), mEATERLinkAddress);
        }
        i(i10);
    }

    @Override // V4.t
    void b(V1MasterMessage v1MasterMessage, int i10, MEATERLinkAddress mEATERLinkAddress) {
        if (this.f18092c || this.f18090a == null) {
            return;
        }
        this.f18093d = true;
        b.a(v1MasterMessage);
        V1MLProbe v1MLProbeC = b.c(v1MasterMessage);
        if (v1MLProbeC == null) {
            U4.b.f("Got v1 msg #%d from %s, but the block has no probes connected", Integer.valueOf(i10), mEATERLinkAddress.toString());
            return;
        }
        this.f18096g = v1MLProbeC.probeSerialNum.longValue();
        if (this.f18095f == null) {
            o();
        }
        MEATERLinkAddress mEATERLinkAddress2 = this.f18095f;
        if (mEATERLinkAddress2 == null || !mEATERLinkAddress2.equals(mEATERLinkAddress)) {
            this.f18095f = mEATERLinkAddress;
            Runnable runnable = this.f18099j;
            if (runnable != null) {
                f18089m.removeCallbacks(runnable);
            }
            Runnable runnable2 = new Runnable() { // from class: V4.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18086B.k();
                }
            };
            this.f18099j = runnable2;
            try {
                f18089m.postDelayed(runnable2, 1000L);
            } catch (Exception e10) {
                U4.b.f("Reset timeout failed: %s", e10.getLocalizedMessage());
                this.f18091b.b(this.f18090a, V4.a.NO_ERROR);
            }
        }
        U4.b.f("Got v1 msg #%d from %s", Integer.valueOf(i10), mEATERLinkAddress.toString());
        i(i10);
    }

    @Override // V4.t
    void c(V2MasterMessage v2MasterMessage, int i10, MEATERLinkAddress mEATERLinkAddress) {
        if (this.f18092c || this.f18090a == null) {
            return;
        }
        this.f18093d = true;
        b.b(v2MasterMessage);
        V2MLProbe v2MLProbeD = b.d(v2MasterMessage);
        if (v2MLProbeD == null) {
            U4.b.f("Got v2 msg #%d from %s", Integer.valueOf(i10), mEATERLinkAddress.toString());
            return;
        }
        this.f18096g = v2MLProbeD.identifier.longValue();
        if (this.f18095f == null) {
            o();
        }
        MEATERLinkAddress mEATERLinkAddress2 = this.f18095f;
        if (mEATERLinkAddress2 == null || !mEATERLinkAddress2.equals(mEATERLinkAddress)) {
            this.f18095f = mEATERLinkAddress;
            Runnable runnable = this.f18099j;
            if (runnable != null) {
                f18089m.removeCallbacks(runnable);
            }
            Runnable runnable2 = new Runnable() { // from class: V4.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18087B.l();
                }
            };
            this.f18099j = runnable2;
            try {
                f18089m.postDelayed(runnable2, 1000L);
            } catch (Exception e10) {
                U4.b.f("Reset timeout failed: %s", e10.getLocalizedMessage());
                this.f18091b.b(this.f18090a, V4.a.NO_ERROR);
            }
        }
        U4.b.f("Got v2 msg #%d from %s", Integer.valueOf(i10), mEATERLinkAddress.toString());
        i(i10);
    }

    @Override // V4.t
    void d(PingPongMessage pingPongMessage, int i10, MEATERLinkAddress mEATERLinkAddress) {
        U4.b.n(" Got PongMessage for block ", new Object[0]);
        if (pingPongMessage.type == PingPongMessageType.PING) {
            return;
        }
        if (this.f18097h != pingPongMessage.value.intValue() || this.f18090a == null) {
            return;
        }
        CountDownTimer countDownTimer = this.f18101l;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        U4.b.f("%s has passed the connectivity test", this.f18090a.getDebugLogDescription());
        this.f18092c = true;
        Runnable runnable = this.f18099j;
        if (runnable != null) {
            f18089m.removeCallbacks(runnable);
            this.f18099j = null;
        }
        f18089m.removeCallbacks(this.f18100k);
        this.f18091b.a(this.f18090a);
    }

    /* compiled from: BlockWiFiSetupConnectivityTester.java */
    class a extends CountDownTimer {
        a(long j10, long j11) {
            super(j10, j11);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            f.this.n();
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
        }
    }
}
