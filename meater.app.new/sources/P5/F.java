package P5;

import android.os.Build;
import com.apptionlabs.meater_app.cloud.requests.CloudStatusRequest;
import com.apptionlabs.meater_app.cloud.responses.MeaterCloudAccountResponse;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.versions.SafetyInfoJson;

/* compiled from: ServerUtils.java */
/* loaded from: classes2.dex */
public class F {

    /* renamed from: a, reason: collision with root package name */
    private static final F f13994a = new F();

    /* renamed from: b, reason: collision with root package name */
    private static long f13995b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f13996c = false;

    /* compiled from: ServerUtils.java */
    class a implements nd.d<MeaterCloudAccountResponse> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f13997a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ nd.d f13998b;

        a(boolean z10, nd.d dVar) {
            this.f13997a = z10;
            this.f13998b = dVar;
        }

        @Override // nd.d
        public void onFailure(nd.b<MeaterCloudAccountResponse> bVar, Throwable th) {
            F.f13996c = false;
            if (this.f13997a || F.f13995b < System.currentTimeMillis() - Config.SERVER_POLL_CHECK_INTERVAL) {
                U4.b.e("checkServerIsRunning server call failed " + th.getMessage(), new Object[0]);
                nd.d dVar = this.f13998b;
                if (dVar != null) {
                    dVar.onFailure(bVar, th);
                }
            }
        }

        @Override // nd.d
        public void onResponse(nd.b<MeaterCloudAccountResponse> bVar, nd.s<MeaterCloudAccountResponse> sVar) {
            MeaterCloudAccountResponse meaterCloudAccountResponseA;
            F.f13996c = false;
            if (this.f13997a || F.f13995b < System.currentTimeMillis() - Config.SERVER_POLL_CHECK_INTERVAL) {
                if (sVar.f() && (meaterCloudAccountResponseA = sVar.a()) != null && meaterCloudAccountResponseA.available) {
                    F.f13995b = System.currentTimeMillis();
                    if (meaterCloudAccountResponseA.messageIntervalMaster > 0) {
                        x4.g.t().u0(meaterCloudAccountResponseA.messageIntervalMaster);
                        U4.b.e("checkServerIsRunning messageIntervalMaster %s " + meaterCloudAccountResponseA.messageIntervalMaster, new Object[0]);
                    }
                    if (meaterCloudAccountResponseA.messageIntervalStats > 0) {
                        x4.g.t().v0(meaterCloudAccountResponseA.messageIntervalStats);
                        U4.b.e("checkServerIsRunning messageIntervalStats %s " + meaterCloudAccountResponseA.messageIntervalStats, new Object[0]);
                    }
                    U4.b.v("checkServerIsRunning before set value syncOnLaunch %s " + x4.g.t().l1(), new Object[0]);
                    x4.g.t().d1(meaterCloudAccountResponseA.sync_on_launch);
                    U4.b.v("checkServerIsRunning syncOnLaunch %s " + meaterCloudAccountResponseA.sync_on_launch, new Object[0]);
                    x4.g.t().y0(meaterCloudAccountResponseA.keyCookInfoUploadInterval);
                    x4.g.t().h1(meaterCloudAccountResponseA.userInfoIntervalMillis);
                    SafetyInfoJson safetyInfoJson = meaterCloudAccountResponseA.safety_info;
                    x4.g.t().Z0(safetyInfoJson != null ? safetyInfoJson.getVersion_latest() : 0);
                    if (x4.g.t().F() > r.b() || x4.g.t().i1()) {
                        new E4.c();
                    }
                }
                nd.d dVar = this.f13998b;
                if (dVar != null) {
                    dVar.onResponse(bVar, sVar);
                }
            }
        }
    }

    public static void d(nd.d<MeaterCloudAccountResponse> dVar) {
        e(false, dVar);
    }

    public static void e(boolean z10, nd.d<MeaterCloudAccountResponse> dVar) {
        U4.b.e("checkServerIsRunning and intervals (if time elapsed since last call)", new Object[0]);
        if (z10 || f13995b < System.currentTimeMillis() - Config.SERVER_POLL_CHECK_INTERVAL) {
            U4.b.e("checkServerIsRunning Now Call Server", new Object[0]);
            CloudStatusRequest cloudStatusRequest = new CloudStatusRequest();
            cloudStatusRequest.platform = "Android";
            cloudStatusRequest.osVersion = Build.VERSION.RELEASE;
            cloudStatusRequest.version = "4.6.3";
            if (f13996c) {
                return;
            }
            f13996c = true;
            try {
                x4.f.f52783a.d().z(cloudStatusRequest).enqueue(new a(z10, dVar));
            } finally {
                f13996c = false;
            }
        }
    }

    public static void i() {
        f13995b = 0L;
        f13996c = false;
    }

    public static F j() {
        return f13994a;
    }

    public long f() {
        long j10 = x4.g.t().j();
        if (j10 == 0) {
            j10 = Config.MC_BROADCAST_INTERVAL_WIFI;
        }
        return Math.min(Math.max(j10, 1000L), Config.MC_BROADCAST_INTERVAL_CELLULAR_MAX);
    }

    public long g() {
        long jK = x4.g.t().k();
        if (jK == 0) {
            jK = Config.MC_STATS_INTERVAL;
        }
        return Math.min(Math.max(jK, 1000L), 300000L);
    }

    public long h() {
        return 66000L;
    }
}
