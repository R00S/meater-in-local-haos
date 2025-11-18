package p5;

import B4.l;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiNetworkSuggestion;
import android.os.Build;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.model.MEATERBlock;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import va.C4929b;
import va.InterfaceC4928a;
import x4.b;
import z4.C5177g;

/* compiled from: BlockWiFiAccessPointController.kt */
@Metadata(d1 = {"\u0000S\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004*\u0001:\b\u0007\u0018\u00002\u00020\u0001:\u0001,B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012 \u0010\u000b\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\u0004\u0012\u00020\n0\u0006¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u000fJ'\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00072\u000e\u0010\u0018\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u001f\u001a\u00020\n2\n\u0010\u000e\u001a\u00060\bj\u0002`\tH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\"\u0010\u0014J\u0017\u0010%\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\n¢\u0006\u0004\b'\u0010\u000fJ\r\u0010(\u001a\u00020\n¢\u0006\u0004\b(\u0010\u000fJ\r\u0010)\u001a\u00020\n¢\u0006\u0004\b)\u0010\u000fJ\r\u0010*\u001a\u00020\n¢\u0006\u0004\b*\u0010\u000fJ\r\u0010+\u001a\u00020\n¢\u0006\u0004\b+\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R.\u0010\u000b\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00103\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00102R\u0016\u00105\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00104R\u0018\u00108\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00107R\u001e\u0010\u0018\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u00109R\u0014\u0010<\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010;¨\u0006="}, d2 = {"Lp5/g;", "", "Landroid/content/Context;", "context", "Lcom/apptionlabs/meater_app/model/MEATERBlock;", "block", "Lkotlin/Function2;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Loa/F;", "completion", "<init>", "(Landroid/content/Context;Lcom/apptionlabs/meater_app/model/MEATERBlock;LBa/p;)V", "e", "()V", "p", "", "ssid", "f", "(Ljava/lang/String;)V", "i", "r", "success", "error", "d", "(ZLjava/lang/Exception;)V", "Lp5/g$a;", "newState", "o", "(Lp5/g$a;)V", "n", "(Ljava/lang/Exception;)V", "message", "j", "Lz4/g;", "connection", "m", "(Lz4/g;)V", "g", "h", "k", "q", "l", "a", "Landroid/content/Context;", "b", "Lcom/apptionlabs/meater_app/model/MEATERBlock;", "c", "LBa/p;", "Lz4/g;", "bleConnection", "Lp5/g$a;", "state", "Ljava/util/Timer;", "Ljava/util/Timer;", "timer", "Ljava/lang/Exception;", "p5/g$c", "Lp5/g$c;", "hotspotReceiver", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: p5.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4216g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final MEATERBlock block;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Ba.p<Boolean, Exception, C4153F> completion;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private C5177g bleConnection;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private a state;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Timer timer;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Exception error;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final c hotspotReceiver;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BlockWiFiAccessPointController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lp5/g$a;", "", "<init>", "(Ljava/lang/String;I)V", "B", "C", "D", "E", "F", "G", "H", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: p5.g$a */
    public static final class a {

        /* renamed from: B, reason: collision with root package name */
        public static final a f47520B = new a("WaitingForReady", 0);

        /* renamed from: C, reason: collision with root package name */
        public static final a f47521C = new a("ReadyToStart", 1);

        /* renamed from: D, reason: collision with root package name */
        public static final a f47522D = new a("WaitingForAPModeToStart", 2);

        /* renamed from: E, reason: collision with root package name */
        public static final a f47523E = new a("BlockConfirmedAPMode", 3);

        /* renamed from: F, reason: collision with root package name */
        public static final a f47524F = new a("PromptingToJoinNetwork", 4);

        /* renamed from: G, reason: collision with root package name */
        public static final a f47525G = new a("JoinedBlockNetwork", 5);

        /* renamed from: H, reason: collision with root package name */
        public static final a f47526H = new a("Error", 6);

        /* renamed from: I, reason: collision with root package name */
        private static final /* synthetic */ a[] f47527I;

        /* renamed from: J, reason: collision with root package name */
        private static final /* synthetic */ InterfaceC4928a f47528J;

        static {
            a[] aVarArrC = c();
            f47527I = aVarArrC;
            f47528J = C4929b.a(aVarArrC);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] c() {
            return new a[]{f47520B, f47521C, f47522D, f47523E, f47524F, f47525G, f47526H};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f47527I.clone();
        }
    }

    /* compiled from: BlockWiFiAccessPointController.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: p5.g$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f47529a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f47520B.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f47521C.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.f47522D.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.f47523E.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.f47524F.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.f47525G.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[a.f47526H.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f47529a = iArr;
        }
    }

    /* compiled from: BlockWiFiAccessPointController.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"p5/g$c", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Loa/F;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: p5.g$c */
    public static final class c extends BroadcastReceiver {
        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (C3862t.b(intent != null ? intent.getAction() : null, MEATERIntent.INTENT_BLOCK_MODE)) {
                U4.b.b("BlockWiFiAccessPointController ,Block is fully setup ", new Object[0]);
                Timer timer = C4216g.this.timer;
                if (timer != null) {
                    timer.cancel();
                }
                C4216g.this.p();
            }
        }
    }

    /* compiled from: BlockWiFiAccessPointController.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"p5/g$d", "Ljava/util/TimerTask;", "Loa/F;", "run", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: p5.g$d */
    public static final class d extends TimerTask {
        d() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C4216g.this.i();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4216g(Context context, MEATERBlock block, Ba.p<? super Boolean, ? super Exception, C4153F> completion) {
        C3862t.g(context, "context");
        C3862t.g(block, "block");
        C3862t.g(completion, "completion");
        this.context = context;
        this.block = block;
        this.completion = completion;
        this.state = a.f47520B;
        this.hotspotReceiver = new c();
    }

    private final void d(boolean success, Exception error) {
        U4.b.b("BlockWiFiAccessPointController callCompletion success = %s ", Boolean.valueOf(success));
        if (!success) {
            j("WiFi configuration failed: " + (error != null ? error.getMessage() : null));
            C5177g c5177g = this.bleConnection;
            if (c5177g != null) {
                c5177g.k0();
            }
        }
        if (success) {
            x4.b.j(b.EnumC0768b.f52689X1.title, "", "", null, 8, null);
        } else {
            x4.b.j(b.EnumC0768b.f52692Y1.title, "", "", null, 8, null);
        }
        this.completion.invoke(Boolean.valueOf(success), error);
    }

    private final void e() {
        if (this.block.isOnlyConnectedOverSecondaryMethod() || !this.block.isReachableOverLink()) {
            o(a.f47521C);
            U4.b.b("BlockWiFiAccessPointController ,ReadyToStart", new Object[0]);
        } else {
            U4.b.b("BlockWiFiAccessPointController ,Block is not ready", new Object[0]);
            n(new Exception("Block is not ready"));
            o(a.f47526H);
        }
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
        }
        n(new Exception("Timed out joining hotspot"));
        o(a.f47526H);
        r();
    }

    private final void j(String message) {
        System.out.println((Object) message);
    }

    private final void n(Exception e10) {
        j("Error: " + e10.getMessage());
        this.error = e10;
    }

    private final void o(a newState) {
        a aVar = this.state;
        if (aVar != newState) {
            j("[STATE] " + aVar + " -> " + newState);
            this.state = newState;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() {
        String debugLogDescription = this.block.getDebugLogDescription();
        C5177g c5177g = this.bleConnection;
        U4.b.b("BlockWiFiAccessPointController ,Telling " + debugLogDescription + " to enter AP mode current is " + (c5177g != null ? c5177g.n0() : null), new Object[0]);
        C5177g c5177g2 = this.bleConnection;
        if ((c5177g2 != null ? c5177g2.n0() : null) == l.e.eBlockStatusModeWifiAp) {
            U4.b.b("BlockWiFiAccessPointController ,setting BlockConfirmedAPMode......", new Object[0]);
            o(a.f47523E);
            r();
            return;
        }
        j("Telling " + this.block.getDebugLogDescription() + " to enter AP mode");
        o(a.f47522D);
        C5177g c5177g3 = this.bleConnection;
        if (c5177g3 != null) {
            c5177g3.l0();
        }
    }

    private final void r() {
        switch (b.f47529a[this.state.ordinal()]) {
            case 1:
                e();
                return;
            case 2:
                p();
                return;
            case 3:
                j("Waiting for AP mode to start");
                return;
            case 4:
                h();
                return;
            case 5:
                j("Prompting user to join network");
                return;
            case 6:
                d(true, null);
                return;
            case 7:
                d(false, this.error);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void g() {
        this.state = a.f47520B;
        r();
    }

    public final void h() {
        o(a.f47524F);
        String strWifiSetupAccessPointSSID = this.block.wifiSetupAccessPointSSID();
        U4.b.b("BlockWiFiAccessPointController ssid %s", strWifiSetupAccessPointSSID);
        if (Build.VERSION.SDK_INT >= 29) {
            WifiNetworkSuggestion wifiNetworkSuggestionBuild = C4210a.a().setSsid(strWifiSetupAccessPointSSID).setIsAppInteractionRequired(true).build();
            C3862t.f(wifiNetworkSuggestionBuild, "build(...)");
            Object systemService = this.context.getSystemService("wifi");
            C3862t.e(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
            WifiManager wifiManager = (WifiManager) systemService;
            U4.b.b("Removed previous suggestion, status: %s", Integer.valueOf(wifiManager.removeNetworkSuggestions(kotlin.collections.r.e(wifiNetworkSuggestionBuild))));
            int iAddNetworkSuggestions = wifiManager.addNetworkSuggestions(kotlin.collections.r.e(wifiNetworkSuggestionBuild));
            U4.b.b("BlockWiFiAccessPointController suggestion status: %s", Integer.valueOf(iAddNetworkSuggestions));
            if (iAddNetworkSuggestions == 0) {
                U4.b.b("Successfully suggested Wi-Fi network: " + strWifiSetupAccessPointSSID, new Object[0]);
                o(a.f47525G);
                r();
            } else {
                n(new Exception("Failed to suggest Wi-Fi network"));
                U4.b.b("Failed to suggest Wi-Fi network", new Object[0]);
                o(a.f47526H);
            }
        } else {
            j("Connecting using deprecated WifiConfiguration for SSID: " + strWifiSetupAccessPointSSID);
            C3862t.d(strWifiSetupAccessPointSSID);
            f(strWifiSetupAccessPointSSID);
        }
        Timer timer = new Timer();
        this.timer = timer;
        timer.schedule(new d(), Config.MC_BROADCAST_INTERVAL_CELLULAR_MAX);
    }

    public final void k() {
        IntentFilter intentFilter = new IntentFilter(MEATERIntent.INTENT_BLOCK_MODE);
        if (Build.VERSION.SDK_INT >= 33) {
            this.context.registerReceiver(this.hotspotReceiver, intentFilter, 2);
        } else {
            this.context.registerReceiver(this.hotspotReceiver, intentFilter);
        }
    }

    public final void l() {
        if (Build.VERSION.SDK_INT >= 29) {
            WifiNetworkSuggestion wifiNetworkSuggestionBuild = C4210a.a().setSsid(this.block.wifiSetupAccessPointSSID()).setIsAppInteractionRequired(true).build();
            C3862t.f(wifiNetworkSuggestionBuild, "build(...)");
            Object systemService = this.context.getSystemService("wifi");
            C3862t.e(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
            U4.b.b("removeNetworkSuggestion " + ((WifiManager) systemService).removeNetworkSuggestions(kotlin.collections.r.e(wifiNetworkSuggestionBuild)) + " >>>>", new Object[0]);
        }
    }

    public final void m(C5177g connection) {
        this.bleConnection = connection;
    }

    public final void q() {
        try {
            l();
            this.context.unregisterReceiver(this.hotspotReceiver);
        } catch (IllegalArgumentException unused) {
            j("Receiver was not registered or already unregistered.");
        }
    }

    private final void f(String ssid) {
    }
}
