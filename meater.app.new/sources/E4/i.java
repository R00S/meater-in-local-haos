package E4;

import P5.F;
import P5.Q;
import P5.z;
import T4.o;
import T4.p;
import T4.s;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import c5.C2316d;
import com.apptionlabs.meater_app.app.MeaterLinkService;
import com.apptionlabs.meater_app.cloud.responses.MeaterCloudAccountResponse;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.NetworkConstant;
import com.apptionlabs.meater_app.data.ProtocolParameters;
import com.apptionlabs.meater_app.model.CloudMQTTConnectionState;
import com.apptionlabs.meater_app.model.DeviceConnectionMethod;
import com.apptionlabs.meater_app.model.DeviceConnectionState;
import com.apptionlabs.meater_app.model.DeviceType;
import com.apptionlabs.meater_app.model.MEATERCloudAccount;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.model.ThisDevice;
import com.apptionlabs.meater_app.v3protobuf.CloudDisconnectedState;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;
import com.apptionlabs.meater_app.v3protobuf.MCCookStatsMessage;
import com.apptionlabs.meater_app.v3protobuf.MCNotificationType;
import com.apptionlabs.meater_app.v3protobuf.MCSubscriptionMessage;
import com.apptionlabs.meater_app.v3protobuf.MeaterLinkMessage;
import j1.C3724i;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import oa.InterfaceC4164i;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttSecurityException;

/* compiled from: MEATERCloudMQTT.java */
/* loaded from: classes.dex */
public class i implements s {

    /* renamed from: W, reason: collision with root package name */
    public static boolean f3891W = false;

    /* renamed from: X, reason: collision with root package name */
    private static i f3892X;

    /* renamed from: B, reason: collision with root package name */
    private final long f3893B = 10;

    /* renamed from: C, reason: collision with root package name */
    private final InterfaceC4164i<NetworkConstant> f3894C = jd.b.d(NetworkConstant.class);

    /* renamed from: D, reason: collision with root package name */
    private CloudMQTTConnectionState f3895D;

    /* renamed from: E, reason: collision with root package name */
    private final ArrayList<p> f3896E;

    /* renamed from: F, reason: collision with root package name */
    private final ArrayList<p> f3897F;

    /* renamed from: G, reason: collision with root package name */
    private ByteBuffer f3898G;

    /* renamed from: H, reason: collision with root package name */
    private long f3899H;

    /* renamed from: I, reason: collision with root package name */
    private long f3900I;

    /* renamed from: J, reason: collision with root package name */
    private long f3901J;

    /* renamed from: K, reason: collision with root package name */
    public j f3902K;

    /* renamed from: L, reason: collision with root package name */
    private Timer f3903L;

    /* renamed from: M, reason: collision with root package name */
    private Timer f3904M;

    /* renamed from: N, reason: collision with root package name */
    private Timer f3905N;

    /* renamed from: O, reason: collision with root package name */
    private org.eclipse.paho.android.service.d f3906O;

    /* renamed from: P, reason: collision with root package name */
    private MEATERCloudAccount f3907P;

    /* renamed from: Q, reason: collision with root package name */
    private String f3908Q;

    /* renamed from: R, reason: collision with root package name */
    private final Context f3909R;

    /* renamed from: S, reason: collision with root package name */
    private final T4.i f3910S;

    /* renamed from: T, reason: collision with root package name */
    private long f3911T;

    /* renamed from: U, reason: collision with root package name */
    private o f3912U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f3913V;

    /* compiled from: MEATERCloudMQTT.java */
    class a implements T4.i {
        a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
        @Override // T4.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(boolean r3, O4.b r4) {
            /*
                r2 = this;
                E4.i r0 = E4.i.v()
                if (r0 != 0) goto L7
                return
            L7:
                if (r3 == 0) goto L1f
                O4.b r3 = O4.b.f13237B
                if (r4 != r3) goto Le
                goto L1f
            Le:
                O4.b r3 = O4.b.f13239D
                if (r4 != r3) goto L15
                E4.i$j r3 = E4.i.j.ReachableViaWiFi
                goto L21
            L15:
                O4.b r3 = O4.b.f13238C
                if (r4 != r3) goto L1c
                E4.i$j r3 = E4.i.j.ReachableViaWWAN
                goto L21
            L1c:
                E4.i$j r3 = E4.i.j.NotReachable
                goto L21
            L1f:
                E4.i$j r3 = E4.i.j.NotReachable
            L21:
                E4.i r4 = E4.i.this
                E4.i.l(r4, r3)
                E4.i r4 = E4.i.this
                boolean r4 = r4.X()
                if (r4 == 0) goto L3f
                E4.i r4 = E4.i.this
                E4.i$j r0 = r4.f3902K
                if (r3 == r0) goto L3f
                r0 = 10
                E4.i.e(r4, r0)
                E4.i r4 = E4.i.this
                r4.M()
                goto L4b
            L3f:
                E4.i r4 = E4.i.this
                r0 = 2
                E4.i.e(r4, r0)
                E4.i r4 = E4.i.this
                E4.i.g(r4)
            L4b:
                E4.i r4 = E4.i.this
                r4.f3902K = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: E4.i.a.a(boolean, O4.b):void");
        }
    }

    /* compiled from: MEATERCloudMQTT.java */
    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            i.this.z0();
        }
    }

    /* compiled from: MEATERCloudMQTT.java */
    class c implements Fc.h {
        c() {
        }

        @Override // Fc.h
        public void a(String str, Fc.m mVar) {
            i.this.R(str, mVar);
        }

        @Override // Fc.h
        public void b(Throwable th) {
            i.this.K();
            i.this.w();
        }

        @Override // Fc.h
        public void d(Fc.c cVar) {
            Object objE = cVar.e();
            if (objE == null || !objE.equals(i.this.t0())) {
                return;
            }
            i.this.D0();
        }
    }

    /* compiled from: MEATERCloudMQTT.java */
    class d implements Fc.a {

        /* compiled from: MEATERCloudMQTT.java */
        class a extends TimerTask {
            a() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                i.this.l0();
            }
        }

        d() {
        }

        @Override // Fc.a
        public void a(Fc.e eVar) {
            i.this.x();
            U4.b.e("Connected to MEATER Cloud as %s", i.this.G());
            i iVar = i.this;
            CloudMQTTConnectionState cloudMQTTConnectionState = CloudMQTTConnectionState.CONNECTED;
            iVar.u0(cloudMQTTConnectionState);
            i.this.f3897F.clear();
            i.this.f3896E.clear();
            i.this.C0();
            if (i.this.f3904M != null) {
                i.this.f3904M.cancel();
            }
            i.this.f3904M = new Timer(true);
            i.this.f3904M.schedule(new a(), 0L, 1000L);
            i.this.u0(cloudMQTTConnectionState);
            i.this.f3901J = 10L;
        }

        @Override // Fc.a
        public void b(Fc.e eVar, Throwable th) {
            i.this.f3908Q = null;
            U4.b.e("Failed to connect to MEATER Cloud: %s", th.getLocalizedMessage());
            if (th.getClass() == MqttSecurityException.class) {
                i.this.E0();
            }
            i.this.K();
            i.this.w();
        }
    }

    /* compiled from: MEATERCloudMQTT.java */
    class e extends TimerTask {
        e() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                i.this.F();
            } catch (IllegalStateException e10) {
                U4.b.e("Error Too many bind requests(999+) for service: %s", e10.getLocalizedMessage());
            }
        }
    }

    /* compiled from: MEATERCloudMQTT.java */
    public enum j {
        ReachableViaWiFi,
        ReachableViaWWAN,
        NotReachable
    }

    private i(Context context) {
        a aVar = new a();
        this.f3910S = aVar;
        this.f3911T = 0L;
        this.f3909R = context;
        this.f3896E = new ArrayList<>();
        this.f3897F = new ArrayList<>();
        this.f3901J = 10L;
        z.f14085a.c(aVar);
    }

    private String A(p pVar) {
        return "MEATERCloud/Devices/" + pVar.getDeviceIDString() + "/CLIENT";
    }

    private void A0(p pVar) {
        if (X()) {
            U4.b.e("Client unsubscribe %s", pVar.getDeviceIDString());
            try {
                this.f3906O.B(A(pVar)).c(new g(pVar));
            } catch (MqttException e10) {
                B(pVar, e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(p pVar, Throwable th) {
        U4.b.e("Client unsubscribe failed %s\n%s", pVar.getDeviceIDString(), Log.getStackTraceString(th));
        this.f3897F.add(pVar);
    }

    private void B0(p pVar) {
        if (X()) {
            U4.b.e("Master unsubscribe %s", pVar.getDeviceIDString());
            try {
                this.f3906O.B(c0(pVar)).c(new C0068i(pVar));
            } catch (MqttException e10) {
                d0(pVar, e10);
            }
        }
    }

    public static boolean C() {
        if (!x4.g.t().T() || !x4.g.t().S() || x4.g.t().l() == null || MeaterLinkService.e() == null) {
            return false;
        }
        return (f0().isEmpty() && o0().isEmpty()) ? false : true;
    }

    public static i D() {
        return E(x4.g.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D0() {
        ArrayList<p> arrayListF0 = f0();
        Iterator<p> it = e0().iterator();
        while (it.hasNext()) {
            p next = it.next();
            if (!this.f3897F.contains(next)) {
                w0(next);
                this.f3897F.add(next);
            }
        }
        Iterator<p> it2 = arrayListF0.iterator();
        while (it2.hasNext()) {
            p next2 = it2.next();
            if (!this.f3896E.contains(next2)) {
                x0(next2);
                this.f3896E.add(next2);
            }
        }
    }

    public static i E(Context context) {
        if (f3892X == null) {
            f3892X = new i(context);
        }
        return f3892X;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E0() {
        if (this.f3913V) {
            return;
        }
        if (System.currentTimeMillis() - this.f3911T < Config.SERVER_POLL_CHECK_INTERVAL) {
            U4.b.e("Won't revalidate credentials now as we have done so already in the last 10 mins", new Object[0]);
            return;
        }
        MEATERCloudAccount mEATERCloudAccountL = x4.g.t().l();
        if (mEATERCloudAccountL == null) {
            return;
        }
        if (this.f3912U == null) {
            this.f3912U = new F5.b(this);
        }
        MeaterCloudAccountResponse meaterCloudAccountResponse = new MeaterCloudAccountResponse();
        meaterCloudAccountResponse.setEmail(mEATERCloudAccountL.email);
        meaterCloudAccountResponse.setClientVersion(String.format(Locale.US, "MEATER-Android-v%s", x4.g.i()));
        U4.b.e("Will attempt to revalidate credentials via HTTP API...", new Object[0]);
        MEATERCloudAccount.AccountType accountType = mEATERCloudAccountL.type;
        if (accountType == MEATERCloudAccount.AccountType.Google) {
            meaterCloudAccountResponse.setToken(mEATERCloudAccountL.password);
            this.f3912U.d(meaterCloudAccountResponse);
        } else if (accountType == MEATERCloudAccount.AccountType.Facebook) {
            meaterCloudAccountResponse.setToken(mEATERCloudAccountL.password);
            this.f3912U.e(meaterCloudAccountResponse);
        } else {
            meaterCloudAccountResponse.setPassword(mEATERCloudAccountL.password);
            this.f3912U.a(meaterCloudAccountResponse);
        }
    }

    private String H(String str) {
        String[] strArrSplit = str.split("/");
        if (strArrSplit.length == 4 && strArrSplit[0].equals("MEATERCloud") && strArrSplit[1].equals("Devices")) {
            return strArrSplit[3];
        }
        return null;
    }

    private List<p> I(String str) {
        String[] strArrSplit = str.split("/");
        if (strArrSplit.length == 4 && strArrSplit[0].equals("MEATERCloud") && strArrSplit[1].equals("Devices")) {
            return M4.h.f11978a.g(Q.r(strArrSplit[2]));
        }
        U4.b.e("DeviceForTopic return null, no deviceID", new Object[0]);
        return null;
    }

    private void N(CloudMQTTConnectionState cloudMQTTConnectionState) {
        U4.b.v("doCookSyncRequestOnFirstConnection syncOnLaunch = %s , new state = %s onLaunchAndConnectCloudCookSyncRequestSent = %s  " + x4.g.t().l1(), cloudMQTTConnectionState, Boolean.valueOf(f3891W));
        if (!f3891W && cloudMQTTConnectionState == CloudMQTTConnectionState.CONNECTED && x4.g.t().l1()) {
            f3891W = true;
            F4.h.f4556a.c();
        }
    }

    private org.eclipse.paho.android.service.d Q() {
        org.eclipse.paho.android.service.d dVar = new org.eclipse.paho.android.service.d(this.f3909R, this.f3894C.getValue().getCloudMQTTHost(), String.format(Locale.US, "MEATER-Android-v%s-%d", x4.g.i(), Integer.valueOf((int) Math.floor(System.nanoTime() % 1000000.0d))));
        dVar.t(new c());
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(String str, Fc.m mVar) {
        byte[] bArrB = mVar.b();
        List<p> listI = I(str);
        if (listI.size() == 0) {
            Z("Received message on unknown topic: %s (%d bytes)", str, Integer.valueOf(bArrB.length));
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<p> it = listI.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            p next = it.next();
            MEATERDevice mEATERDevice = next.getDeviceType() == DeviceType.MEATER_DEVICE ? (MEATERDevice) next : null;
            String strH = H(str);
            if (strH.equals("CLIENT")) {
                if (this.f3897F.contains(next) && (mEATERDevice == null || mEATERDevice.getConnectionState() != DeviceConnectionState.CONNECTED || next.getConnectionMethod() == DeviceConnectionMethod.MEATER_CLOUD || !mEATERDevice.isReachableOverLink())) {
                    arrayList.add(next);
                }
            } else if (!strH.equals("MASTER") || this.f3896E.contains(next)) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() == 0) {
            return;
        }
        if (bArrB.length != 0) {
            V4.l.g0().x(bArrB, null);
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            p pVar = (p) it2.next();
            MEATERDevice mEATERDevice2 = pVar.getDeviceType() == DeviceType.MEATER_DEVICE ? (MEATERDevice) pVar : null;
            if (mEATERDevice2 != null) {
                if (mEATERDevice2.getConnectionState() == DeviceConnectionState.CONNECTED && mEATERDevice2.isPaired() && mEATERDevice2.isMEATERProbe()) {
                    ((Probe) pVar).showConnectionLostWarning();
                }
                mEATERDevice2.setConnectionState(DeviceConnectionState.OFFLINE);
            }
        }
    }

    public static boolean S() {
        return !M4.h.f11978a.K().isEmpty();
    }

    public static boolean T() {
        return x4.g.t().T() && x4.g.t().S();
    }

    public static boolean U() {
        return x4.g.t().l() != null;
    }

    private long V(long j10) {
        return j10 + ((long) (Math.random() * j10));
    }

    private void Z(String str, Object... objArr) {
        String str2 = String.format(Locale.US, str, objArr);
        U4.b.e(str2, new Object[0]);
        for (Probe probe : M4.h.f11978a.L()) {
            if (probe.getEventLog() != null) {
                probe.getEventLog().addErrorEvent(str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(j jVar) {
        U4.b.e("Connection is now " + jVar.toString(), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(p pVar, Throwable th) {
        U4.b.e("Master subscribe failed %s\n%s", pVar.getDeviceIDString(), Log.getStackTraceString(th));
        this.f3896E.remove(pVar);
    }

    private String c0(p pVar) {
        return "MEATERCloud/Devices/" + pVar.getDeviceIDString() + "/MASTER";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(p pVar, Throwable th) {
        U4.b.e("Master unsubscribe failed %s\n%s", pVar.getDeviceIDString(), Log.getStackTraceString(th));
        this.f3896E.add(pVar);
    }

    private ArrayList<p> e0() {
        List<p> listO0 = o0();
        ArrayList<p> arrayList = new ArrayList<>();
        for (p pVar : listO0) {
            DeviceConnectionMethod connectionMethod = pVar.getConnectionMethod();
            MEATERDevice mEATERDeviceO = pVar.getDeviceType() == DeviceType.MEATER_DEVICE ? (MEATERDevice) pVar : M4.h.f11978a.o(pVar.getDeviceID());
            if (mEATERDeviceO == null && connectionMethod == DeviceConnectionMethod.MEATER_CLOUD) {
                arrayList.add(pVar);
            } else if (mEATERDeviceO != null) {
                DeviceConnectionState connectionState = mEATERDeviceO.getConnectionState();
                boolean z10 = connectionMethod.isBluetoothConnectionMethod() && connectionState == DeviceConnectionState.ATTEMPTING_RECONNECT;
                boolean zIsReachableOverLink = mEATERDeviceO.isReachableOverLink();
                if (!z10 && (connectionMethod == DeviceConnectionMethod.MEATER_CLOUD || connectionState != DeviceConnectionState.CONNECTED || !zIsReachableOverLink)) {
                    arrayList.add(pVar);
                }
            }
        }
        return arrayList;
    }

    private static ArrayList<p> f0() {
        ArrayList<p> arrayList = new ArrayList<>(M4.h.f11978a.E());
        if (arrayList.size() == 0) {
            return arrayList;
        }
        arrayList.add(ThisDevice.INSTANCE);
        return arrayList;
    }

    private Fc.k g0() {
        MEATERCloudAccount mEATERCloudAccount = this.f3907P;
        if (mEATERCloudAccount == null || mEATERCloudAccount.email == null) {
            return null;
        }
        Fc.k kVar = new Fc.k();
        kVar.r(this.f3907P.email);
        kVar.q(this.f3907P.passwordForConnection().toCharArray());
        kVar.o(true);
        kVar.t("MEATERCloud/Disconnections/" + G() + "/" + this.f3908Q, new byte[]{1}, 1, false);
        return kVar;
    }

    private void h0() {
        C2316d.K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0() {
        if (X()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = this.f3899H;
            long j11 = jCurrentTimeMillis - j10;
            long j12 = jCurrentTimeMillis - this.f3900I;
            if (j10 == 0 || j11 >= F.j().f()) {
                for (MEATERDevice mEATERDevice : M4.h.f11978a.E()) {
                    if (mEATERDevice.getConnectionState() == DeviceConnectionState.CONNECTED) {
                        j0(mEATERDevice);
                    }
                }
                this.f3899H = jCurrentTimeMillis;
                return;
            }
            if (this.f3900I == 0 || j12 >= F.j().g()) {
                Iterator<Probe> it = M4.h.f11978a.L().iterator();
                while (it.hasNext()) {
                    i0(it.next());
                }
                this.f3900I = jCurrentTimeMillis;
            }
        }
    }

    private boolean n0(Probe probe) {
        return probe.getCookState() != DeviceCookState.COOK_STATE_NOT_STARTED && probe.getCookState() != DeviceCookState.COOK_STATE_COOK_CONFIGURED && probe.getConnectionMethod().isBluetoothConnectionMethod() && probe.getConnectionState() == DeviceConnectionState.CONNECTED && probe.getCookID() != 0 && probe.cookTimeElapsed() >= 300;
    }

    private static List<p> o0() {
        List<p> listO = M4.h.f11978a.O();
        if (listO.size() == 0) {
            return listO;
        }
        listO.addAll(V4.l.g0().t());
        return listO;
    }

    private void p0() {
        Intent intent = new Intent(ProtocolParameters.MEATER_UPDATE_GOOGLE_FB_PASSWORD);
        intent.putExtra(ProtocolParameters.MEATER_NOTIF_CLOUD_CONNECTION_STATE, 0);
        intent.setPackage(x4.g.h().getPackageName());
        this.f3909R.sendBroadcast(intent);
    }

    private void s0(byte[] bArr, p pVar, boolean z10) {
        m0(A(pVar), bArr, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String t0() {
        return String.format(Locale.US, "MEATERCloud/Sessions/%s/%s", G(), this.f3908Q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0(CloudMQTTConnectionState cloudMQTTConnectionState) {
        if (this.f3895D != cloudMQTTConnectionState) {
            this.f3895D = cloudMQTTConnectionState;
            C2316d.b();
            N(cloudMQTTConnectionState);
        }
    }

    private void v0() {
        x();
        try {
            Timer timer = new Timer(true);
            this.f3905N = timer;
            timer.schedule(new b(), 10000L);
        } catch (IllegalStateException e10) {
            U4.b.e("Failed to cancel timer %s", e10.getLocalizedMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        if (C()) {
            long jV = V(this.f3901J);
            U4.b.e("Will attempt to reconnect to MEATER Cloud in %d (interval: %d seconds)", Long.valueOf(jV), Long.valueOf(this.f3901J));
            Timer timer = this.f3903L;
            if (timer != null) {
                try {
                    timer.cancel();
                } catch (IllegalStateException e10) {
                    U4.b.e("Error cancelling reconnect timer: %s", e10.getLocalizedMessage());
                }
            }
            try {
                Timer timer2 = new Timer(true);
                this.f3903L = timer2;
                timer2.schedule(new e(), jV * 1000);
            } catch (IllegalStateException e11) {
                U4.b.e("Error schedule reconnect timer: %s", e11.getLocalizedMessage());
            }
            this.f3901J = Math.min(600L, this.f3901J * 2);
        }
    }

    private void w0(p pVar) {
        if (X()) {
            U4.b.e("Client subscribe %s", pVar.getDeviceIDString());
            try {
                this.f3906O.w(A(pVar), 1).c(new f(pVar));
            } catch (MqttException e10) {
                z(pVar, e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        Timer timer = this.f3905N;
        if (timer != null) {
            try {
                timer.cancel();
            } catch (IllegalStateException unused) {
            }
            this.f3905N = null;
        }
    }

    private void x0(p pVar) {
        if (X()) {
            U4.b.e("Master subscribe %s", pVar.getDeviceIDString());
            try {
                this.f3906O.w(c0(pVar), 1).c(new h(pVar));
            } catch (MqttException e10) {
                b0(pVar, e10);
            }
        }
    }

    private ByteBuffer y0(List<p> list, List<p> list2) {
        MCSubscriptionMessage mCSubscriptionMessageB = V4.p.B(list, list2, this.f3907P);
        if (mCSubscriptionMessageB != null) {
            return ByteBuffer.wrap(mCSubscriptionMessageB.encode());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(p pVar, Throwable th) {
        U4.b.e("Client subscribe failed %s\n%s", pVar.getDeviceIDString(), Log.getStackTraceString(th));
        this.f3897F.remove(pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z0() {
        K();
        w();
    }

    public void C0() {
        if (!C()) {
            K();
            return;
        }
        ArrayList<p> arrayListF0 = f0();
        List<p> listO0 = o0();
        ArrayList<p> arrayListE0 = e0();
        if (arrayListF0.size() > 0 || listO0.size() > 0) {
            if (this.f3906O == null) {
                F();
                return;
            } else if (!X()) {
                return;
            }
        }
        Iterator it = new ArrayList(this.f3897F).iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            if (!arrayListE0.contains(pVar)) {
                A0(pVar);
                this.f3897F.remove(pVar);
            }
        }
        Iterator it2 = new ArrayList(this.f3896E).iterator();
        while (it2.hasNext()) {
            p pVar2 = (p) it2.next();
            if (!arrayListF0.contains(pVar2)) {
                B0(pVar2);
                this.f3896E.remove(pVar2);
            }
        }
        ByteBuffer byteBufferY0 = y0(arrayListF0, listO0);
        if (byteBufferY0 == null || byteBufferY0.equals(this.f3898G)) {
            D0();
            return;
        }
        U4.b.e("Updating session subscriptions", new Object[0]);
        this.f3898G = byteBufferY0;
        m0(t0(), this.f3898G.array(), false);
    }

    public void F() {
        org.eclipse.paho.android.service.d dVar;
        Timer timer = this.f3903L;
        if (timer != null) {
            timer.cancel();
            this.f3903L = null;
        }
        if (!C()) {
            K();
            return;
        }
        if (this.f3906O != null) {
            return;
        }
        MEATERCloudAccount mEATERCloudAccountL = x4.g.t().l();
        this.f3907P = mEATERCloudAccountL;
        if (mEATERCloudAccountL == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 33 || x4.g.y()) {
            this.f3906O = Q();
            u0(CloudMQTTConnectionState.CONNECTING);
            v0();
            this.f3908Q = UUID.randomUUID().toString();
            try {
                Fc.k kVarG0 = g0();
                if (kVarG0 != null && (dVar = this.f3906O) != null) {
                    dVar.f(kVarG0, null, new d());
                }
            } catch (MqttException e10) {
                e10.printStackTrace();
                K();
                w();
            }
        }
    }

    public String G() {
        return String.format(Locale.US, "Android-%s", x4.g.t().r());
    }

    @Override // T4.s
    public void J(nd.s<MeaterCloudAccountResponse> sVar, MeaterCloudAccountResponse meaterCloudAccountResponse) {
        if (sVar.f()) {
            this.f3911T = System.currentTimeMillis();
            U4.b.e("Credentials seem fine, we will assume the cloud is having problems.", new Object[0]);
            return;
        }
        MeaterCloudAccountResponse.ErrorStatus error = MeaterCloudAccountResponse.parseError(sVar);
        if (E4.g.j(error.code) == E4.g.BAD_CREDENTIALS) {
            U4.b.e("Credentials are still bad, must prompt the user to sign in again.", new Object[0]);
            x4.g.t().c();
            h0();
        } else if (E4.g.j(error.code) == E4.g.USER_MUST_ADD_PASSWORD) {
            p0();
            this.f3913V = true;
        } else if (E4.g.j(error.code) == E4.g.APP_UPDATE_NEEDED) {
            this.f3913V = true;
        }
    }

    public void K() {
        org.eclipse.paho.android.service.d dVar = this.f3906O;
        if (dVar != null) {
            dVar.t(null);
            x();
            Timer timer = this.f3904M;
            if (timer != null) {
                timer.cancel();
                this.f3904M = null;
            }
            U4.b.e("Disconnect from MEATER Cloud", new Object[0]);
            u0(CloudMQTTConnectionState.DISCONNECTED);
            try {
                this.f3906O.j();
            } catch (Exception e10) {
                U4.b.e("Disconnect failed:\n%s", Log.getStackTraceString(e10));
            }
            this.f3906O = null;
            this.f3907P = null;
            this.f3898G = null;
            this.f3897F.clear();
            this.f3896E.clear();
            u0(CloudMQTTConnectionState.DISCONNECTED);
            this.f3908Q = null;
            M4.h.f11978a.q(DeviceConnectionMethod.MEATER_CLOUD);
        }
    }

    public void L() {
        K();
        z.f14085a.d();
        f3892X = null;
    }

    public void M() {
        K();
        C0();
    }

    public CloudDisconnectedState O() {
        if (this.f3895D != null && !S()) {
            return CloudDisconnectedState.CLOUD_DISCONNECTED_STATE_NO_DEVICES;
        }
        CloudMQTTConnectionState cloudMQTTConnectionState = this.f3895D;
        return (cloudMQTTConnectionState == null || cloudMQTTConnectionState == CloudMQTTConnectionState.DISCONNECTED) ? !U() ? CloudDisconnectedState.CLOUD_DISCONNECTED_STATE_NO_ACCOUNT : !T() ? CloudDisconnectedState.CLOUD_DISCONNECTED_STATE_DISABLED : !S() ? CloudDisconnectedState.CLOUD_DISCONNECTED_STATE_NO_DEVICES : (this.f3909R == null || z.f14085a.b()) ? CloudDisconnectedState.CLOUD_DISCONNECTED_STATE_NO_CLOUD_CONNECTION : CloudDisconnectedState.CLOUD_DISCONNECTED_STATE_NO_INTERNET : CloudDisconnectedState.CLOUD_DISCONNECTED_STATE_NONE;
    }

    public CloudMQTTConnectionState P() {
        return this.f3895D;
    }

    public boolean W() {
        return this.f3913V;
    }

    public boolean X() {
        return this.f3895D == CloudMQTTConnectionState.CONNECTED;
    }

    public boolean Y() {
        return this.f3895D == CloudMQTTConnectionState.CONNECTING;
    }

    protected void finalize() {
        U4.b.e("Finalize <MEATERCloudMQTT-%s>", this);
    }

    public void i0(Probe probe) {
        if (X() && n0(probe)) {
            MCCookStatsMessage mCCookStatsMessageG = V4.p.g(probe);
            U4.b.e("Posting Cook Stats for cook " + probe.cookIDString(), new Object[0]);
            m0("MEATERCloud/CookStats/" + probe.cookIDString(), mCCookStatsMessageG.encode(), false);
        }
    }

    public void j0(p pVar) {
        U4.b.e("Posting MASTER message for %s", pVar.getDebugLogDescription());
        s0(new MeaterLinkMessage.Builder().header(V4.p.s(0)).masterMessage(V4.p.o(new ArrayList(C3724i.a(new Object[]{pVar})), 0)).build().encode(), pVar, true);
    }

    public void k0(Probe probe, MCNotificationType mCNotificationType, int i10) {
        if (m0("MEATERCloud/Notifications/" + probe.getDeviceIDString(), V4.p.y(mCNotificationType, i10, probe).encode(), false)) {
            U4.b.e("Posted push notification for %s", probe.getDeviceIDString());
        } else {
            U4.b.e("Failed to post push notification for %s", probe.getDeviceIDString());
        }
    }

    public boolean m0(String str, byte[] bArr, boolean z10) {
        if (!X()) {
            return false;
        }
        try {
            Fc.m mVar = new Fc.m(bArr);
            mVar.k(z10);
            this.f3906O.p(str, mVar, str, null);
            return true;
        } catch (NullPointerException unused) {
            K();
            return false;
        } catch (MqttException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public void q0(byte[] bArr, p pVar, boolean z10) {
        if (m0(c0(pVar), bArr, z10)) {
            return;
        }
        U4.b.e("Failed to post client message for %s", pVar.getDeviceIDString());
    }

    public void r0(byte[] bArr, p pVar, boolean z10) {
        if (m0(A(pVar), bArr, z10)) {
            return;
        }
        U4.b.e("Failed to post master message for %s", pVar.getDeviceIDString());
    }

    public void y(MEATERDevice mEATERDevice) {
        r0(new byte[0], mEATERDevice, true);
    }

    @Override // T4.s
    public void s() {
    }

    /* compiled from: MEATERCloudMQTT.java */
    class f implements Fc.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p f3920a;

        f(p pVar) {
            this.f3920a = pVar;
        }

        @Override // Fc.a
        public void b(Fc.e eVar, Throwable th) {
            i.this.z(this.f3920a, th);
        }

        @Override // Fc.a
        public void a(Fc.e eVar) {
        }
    }

    /* compiled from: MEATERCloudMQTT.java */
    class g implements Fc.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p f3922a;

        g(p pVar) {
            this.f3922a = pVar;
        }

        @Override // Fc.a
        public void b(Fc.e eVar, Throwable th) {
            i.this.B(this.f3922a, th);
        }

        @Override // Fc.a
        public void a(Fc.e eVar) {
        }
    }

    /* compiled from: MEATERCloudMQTT.java */
    class h implements Fc.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p f3924a;

        h(p pVar) {
            this.f3924a = pVar;
        }

        @Override // Fc.a
        public void b(Fc.e eVar, Throwable th) {
            i.this.b0(this.f3924a, th);
        }

        @Override // Fc.a
        public void a(Fc.e eVar) {
        }
    }

    /* compiled from: MEATERCloudMQTT.java */
    /* renamed from: E4.i$i, reason: collision with other inner class name */
    class C0068i implements Fc.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ p f3926a;

        C0068i(p pVar) {
            this.f3926a = pVar;
        }

        @Override // Fc.a
        public void b(Fc.e eVar, Throwable th) {
            i.this.d0(this.f3926a, th);
        }

        @Override // Fc.a
        public void a(Fc.e eVar) {
        }
    }
}
