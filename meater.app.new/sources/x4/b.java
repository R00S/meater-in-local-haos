package x4;

import Ub.k;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.meatCutStructure.MeatCut;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.model.TemperatureLog;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.V;
import va.C4929b;
import va.InterfaceC4928a;

/* compiled from: GATracking.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003 \u001e#B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J#\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0014\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u0016\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0007¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lx4/b;", "", "<init>", "()V", "Loa/F;", "d", "Landroid/app/Activity;", "activity", "", "pageToTrack", "l", "(Landroid/app/Activity;Ljava/lang/String;)V", "Lx4/b$b;", "category", "Lx4/b$a;", "action", "Lx4/b$c;", "label", "", "value", "i", "(Lx4/b$b;Lx4/b$a;Lx4/b$c;Ljava/lang/Long;)V", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "Lcom/apptionlabs/meater_app/model/Probe;", "probe", "e", "(Lcom/apptionlabs/meater_app/model/Probe;)V", "Lcom/apptionlabs/meater_app/v3protobuf/DeviceCookState;", "cookState", "a", "(Lcom/apptionlabs/meater_app/v3protobuf/DeviceCookState;)Ljava/lang/String;", "b", "(Lcom/apptionlabs/meater_app/model/Probe;)Ljava/lang/String;", "name", "c", "(Ljava/lang/String;Ljava/lang/String;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f52604a = new b();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GATracking.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lx4/b$a;", "", "", "title", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "B", "Ljava/lang/String;", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* renamed from: C, reason: collision with root package name */
        public static final a f52605C = new a("BUTTON_PRESSED", 0, "Button_Pressed");

        /* renamed from: D, reason: collision with root package name */
        public static final a f52606D = new a("RECEIVED", 1, "Received");

        /* renamed from: E, reason: collision with root package name */
        public static final a f52607E = new a("COMPLETE", 2, "Complete");

        /* renamed from: F, reason: collision with root package name */
        public static final a f52608F = new a("CANCELLED", 3, "Cancelled");

        /* renamed from: G, reason: collision with root package name */
        public static final a f52609G = new a("START", 4, "Start");

        /* renamed from: H, reason: collision with root package name */
        public static final a f52610H = new a("TIMEOUT", 5, "Timeout");

        /* renamed from: I, reason: collision with root package name */
        public static final a f52611I = new a("OLD_TIMEOUT", 6, "OldTimeout");

        /* renamed from: J, reason: collision with root package name */
        public static final a f52612J = new a("DISCONNECTED", 7, "Disconnected");

        /* renamed from: K, reason: collision with root package name */
        public static final a f52613K = new a("FAILED", 8, "Failed");

        /* renamed from: L, reason: collision with root package name */
        public static final a f52614L = new a("WRITECOOK", 9, "WriteCook");

        /* renamed from: M, reason: collision with root package name */
        public static final a f52615M = new a("NETWORKENCTYPE", 10, "NetworkEncType");

        /* renamed from: N, reason: collision with root package name */
        public static final a f52616N = new a("SHOWWARNING", 11, "ShowWarning");

        /* renamed from: O, reason: collision with root package name */
        private static final /* synthetic */ a[] f52617O;

        /* renamed from: P, reason: collision with root package name */
        private static final /* synthetic */ InterfaceC4928a f52618P;

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        public final String title;

        static {
            a[] aVarArrC = c();
            f52617O = aVarArrC;
            f52618P = C4929b.a(aVarArrC);
        }

        private a(String str, int i10, String str2) {
            this.title = str2;
        }

        private static final /* synthetic */ a[] c() {
            return new a[]{f52605C, f52606D, f52607E, f52608F, f52609G, f52610H, f52611I, f52612J, f52613K, f52614L, f52615M, f52616N};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f52617O.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GATracking.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0003\b\u0086\u0001\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001¨\u0006\u0088\u0001"}, d2 = {"Lx4/b$b;", "", "", "title", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "B", "Ljava/lang/String;", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a0", "b0", "c0", "d0", "e0", "f0", "g0", "h0", "i0", "j0", "k0", "l0", "m0", "n0", "o0", "p0", "q0", "r0", "s0", "t0", "u0", "v0", "w0", "x0", "y0", "z0", "A0", "B0", "C0", "D0", "E0", "F0", "G0", "H0", "I0", "J0", "K0", "L0", "M0", "N0", "O0", "P0", "Q0", "R0", "S0", "T0", "U0", "V0", "W0", "X0", "Y0", "Z0", "a1", "b1", "c1", "d1", "e1", "f1", "g1", "h1", "i1", "j1", "k1", "l1", "m1", "n1", "o1", "p1", "q1", "r1", "s1", "t1", "u1", "v1", "w1", "x1", "y1", "z1", "A1", "B1", "C1", "D1", "E1", "F1", "G1", "H1", "I1", "J1", "K1", "L1", "M1", "N1", "O1", "P1", "Q1", "R1", "S1", "T1", "U1", "V1", "W1", "X1", "Y1", "Z1", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: x4.b$b, reason: collision with other inner class name */
    public static final class EnumC0768b {

        /* renamed from: a2, reason: collision with root package name */
        private static final /* synthetic */ EnumC0768b[] f52698a2;

        /* renamed from: b2, reason: collision with root package name */
        private static final /* synthetic */ InterfaceC4928a f52701b2;

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        public final String title;

        /* renamed from: C, reason: collision with root package name */
        public static final EnumC0768b f52624C = new EnumC0768b("MENU_PRESSED", 0, "Menu_Pressed");

        /* renamed from: D, reason: collision with root package name */
        public static final EnumC0768b f52627D = new EnumC0768b("SIGN_UP_TO_NEWSLETTER", 1, "sign_up_to_newsletter");

        /* renamed from: E, reason: collision with root package name */
        public static final EnumC0768b f52630E = new EnumC0768b("SIGN_UP_TO_CLOUD", 2, "Sign_Up_To_Cloud");

        /* renamed from: F, reason: collision with root package name */
        public static final EnumC0768b f52633F = new EnumC0768b("OFFERS_PRESSED", 3, "offers_pressed");

        /* renamed from: G, reason: collision with root package name */
        public static final EnumC0768b f52636G = new EnumC0768b("NEED_HELP", 4, "Need_Help");

        /* renamed from: H, reason: collision with root package name */
        public static final EnumC0768b f52639H = new EnumC0768b("SOCIAL_SHARE_COOK_PRESSED", 5, "Social_Share_Cook_Pressed");

        /* renamed from: I, reason: collision with root package name */
        public static final EnumC0768b f52642I = new EnumC0768b("SOCIAL_SHARE_COOK_SHARED", 6, "Social_Share_Cook_Shared");

        /* renamed from: J, reason: collision with root package name */
        public static final EnumC0768b f52645J = new EnumC0768b("SOCIAL_SHARE_COOK_NOT_SHARED", 7, "Social_Share_Cook_Not_Shared");

        /* renamed from: K, reason: collision with root package name */
        public static final EnumC0768b f52648K = new EnumC0768b("SOCIAL_SHARE_COOK_CANCEL_ON_PREVIEW", 8, "Social_Share_Cook_Cancel_On_Preview");

        /* renamed from: L, reason: collision with root package name */
        public static final EnumC0768b f52651L = new EnumC0768b("QSG_SUBMIT_PRESSED", 9, "QSG_Submit_Pressed");

        /* renamed from: M, reason: collision with root package name */
        public static final EnumC0768b f52654M = new EnumC0768b("QSG_SKIP_PRESSED", 10, "QSG_Skip_Pressed");

        /* renamed from: N, reason: collision with root package name */
        public static final EnumC0768b f52657N = new EnumC0768b("INVALID", 11, "Invalid");

        /* renamed from: O, reason: collision with root package name */
        public static final EnumC0768b f52660O = new EnumC0768b("MBLOCKOTAUPDATE", 12, "MBlockOTAUpdate");

        /* renamed from: P, reason: collision with root package name */
        public static final EnumC0768b f52663P = new EnumC0768b("MPLUSOTAUPDATE", 13, "MPlusOTAUpdate");

        /* renamed from: Q, reason: collision with root package name */
        public static final EnumC0768b f52666Q = new EnumC0768b("COOKSTATE", 14, "CookState");

        /* renamed from: R, reason: collision with root package name */
        public static final EnumC0768b f52669R = new EnumC0768b("AMBIENT_DASH_TAPPED", 15, "ambient_dash_tapped");

        /* renamed from: S, reason: collision with root package name */
        public static final EnumC0768b f52672S = new EnumC0768b("BLOCKERROR", 16, "BlockError");

        /* renamed from: T, reason: collision with root package name */
        public static final EnumC0768b f52675T = new EnumC0768b("MEATERBLOCKWIFINETWORKSELECTION", 17, "MEATERBlockWiFiNetworkSelection");

        /* renamed from: U, reason: collision with root package name */
        public static final EnumC0768b f52678U = new EnumC0768b("PROBETEMPERATUREWARNING", 18, "ProbeTemperatureWarning");

        /* renamed from: V, reason: collision with root package name */
        public static final EnumC0768b f52681V = new EnumC0768b("ALERTFIRED", 19, "AlertFired");

        /* renamed from: W, reason: collision with root package name */
        public static final EnumC0768b f52684W = new EnumC0768b("USERCOMPLETEDSETUP", 20, "UserCompletedSetup");

        /* renamed from: X, reason: collision with root package name */
        public static final EnumC0768b f52687X = new EnumC0768b("PHONE_RESTART_NOTIFICATION", 21, "Phone_Restart_Notification");

        /* renamed from: Y, reason: collision with root package name */
        public static final EnumC0768b f52690Y = new EnumC0768b("CUSTOM_COOK_START", 22, "custom_cook_start");

        /* renamed from: Z, reason: collision with root package name */
        public static final EnumC0768b f52693Z = new EnumC0768b("CONNECTION_DETAILS_DASHBOARD_TAPPED", 23, "connection_details_dashboard_tapped");

        /* renamed from: a0, reason: collision with root package name */
        public static final EnumC0768b f52696a0 = new EnumC0768b("HELP_CONTEXT_TAPPED", 24, "help_context_tapped");

        /* renamed from: b0, reason: collision with root package name */
        public static final EnumC0768b f52699b0 = new EnumC0768b("SETTING_CONTEXT_TAPPED", 25, "settings_context_tapped");

        /* renamed from: c0, reason: collision with root package name */
        public static final EnumC0768b f52702c0 = new EnumC0768b("PREVIOUS_CONTEXT_TAPPED", 26, "previous_context_tapped");

        /* renamed from: d0, reason: collision with root package name */
        public static final EnumC0768b f52704d0 = new EnumC0768b("DEVICES_CONTEXT_TAPPED", 27, "devices_context_tapped");

        /* renamed from: e0, reason: collision with root package name */
        public static final EnumC0768b f52706e0 = new EnumC0768b("CONNECTIONS_CONTEXT_TAPPED", 28, "connections_context_tapped");

        /* renamed from: f0, reason: collision with root package name */
        public static final EnumC0768b f52708f0 = new EnumC0768b("CLOUD_PREVIOUS_COOKS_TAPPED", 29, "cloud_previous_cooks_tapped");

        /* renamed from: g0, reason: collision with root package name */
        public static final EnumC0768b f52710g0 = new EnumC0768b("ENABLE_NEARBY_DEVICES", 30, "enable_nearby_devices");

        /* renamed from: h0, reason: collision with root package name */
        public static final EnumC0768b f52712h0 = new EnumC0768b("DISABLE_NEARBY_DEVICES", 31, "disable_nearby_devices");

        /* renamed from: i0, reason: collision with root package name */
        public static final EnumC0768b f52714i0 = new EnumC0768b("ENABLE_SCREEN_ON_COOK", 32, "enable_screen_on_cook");

        /* renamed from: j0, reason: collision with root package name */
        public static final EnumC0768b f52716j0 = new EnumC0768b("DISABLE_SCREEN_ON_COOK", 33, "disable_screen_on_cook");

        /* renamed from: k0, reason: collision with root package name */
        public static final EnumC0768b f52718k0 = new EnumC0768b("ENABLE_PROBE_INSERTION_INSTRUCTIONS", 34, "enable_probe_insertion_instructions");

        /* renamed from: l0, reason: collision with root package name */
        public static final EnumC0768b f52720l0 = new EnumC0768b("DISABLE_PROBE_INSERTION_INSTRUCTIONS", 35, "disable_probe_insertion_instructions");

        /* renamed from: m0, reason: collision with root package name */
        public static final EnumC0768b f52722m0 = new EnumC0768b("ENABLE_CHARGER_INSERTION_INSTRUCTIONS", 36, "enable_charger_placement_instructions");

        /* renamed from: n0, reason: collision with root package name */
        public static final EnumC0768b f52724n0 = new EnumC0768b("DISABLE_CHARGER_INSERTION_INSTRUCTIONS", 37, "disable_charger_placement_instructions");

        /* renamed from: o0, reason: collision with root package name */
        public static final EnumC0768b f52726o0 = new EnumC0768b("TEMP_SCALE_CHANGED", 38, "temp_scale_change");

        /* renamed from: p0, reason: collision with root package name */
        public static final EnumC0768b f52728p0 = new EnumC0768b("ENABLE_MEATER_CLOUD", 39, "enable_meater_cloud");

        /* renamed from: q0, reason: collision with root package name */
        public static final EnumC0768b f52730q0 = new EnumC0768b("DISABLE_MEATER_CLOUD", 40, "disable_meater_cloud");

        /* renamed from: r0, reason: collision with root package name */
        public static final EnumC0768b f52732r0 = new EnumC0768b("ENABLE_MEATER_LINK", 41, "enable_meater_link");

        /* renamed from: s0, reason: collision with root package name */
        public static final EnumC0768b f52734s0 = new EnumC0768b("DISABLE_MEATER_LINK", 42, "disable_meater_link");

        /* renamed from: t0, reason: collision with root package name */
        public static final EnumC0768b f52736t0 = new EnumC0768b("PAIRED_DEVICES_SETTING", 43, "paired_devices_settings");

        /* renamed from: u0, reason: collision with root package name */
        public static final EnumC0768b f52738u0 = new EnumC0768b("NOTIFY_FIVE_MIN_ON", 44, "notify_5m_on");

        /* renamed from: v0, reason: collision with root package name */
        public static final EnumC0768b f52740v0 = new EnumC0768b("NOTIFY_FIVE_MIN_OFF", 45, "notify_5m_off");

        /* renamed from: w0, reason: collision with root package name */
        public static final EnumC0768b f52742w0 = new EnumC0768b("NOTIFICATION_EXPIRE_AUTO_ON", 46, "notifications_expire_auto_on");

        /* renamed from: x0, reason: collision with root package name */
        public static final EnumC0768b f52744x0 = new EnumC0768b("NOTIFICATION_EXPIRE_AUTO_OFF", 47, "notifications_expire_auto_off");

        /* renamed from: y0, reason: collision with root package name */
        public static final EnumC0768b f52746y0 = new EnumC0768b("COOK_CONFIGURED", 48, "cook_configured");

        /* renamed from: z0, reason: collision with root package name */
        public static final EnumC0768b f52748z0 = new EnumC0768b("COOK_STARTED", 49, "cook_started");

        /* renamed from: A0, reason: collision with root package name */
        public static final EnumC0768b f52620A0 = new EnumC0768b("COOK_RFR", 50, "cook_rfr");

        /* renamed from: B0, reason: collision with root package name */
        public static final EnumC0768b f52622B0 = new EnumC0768b("COOK_RESTING", 51, "cook_resting");

        /* renamed from: C0, reason: collision with root package name */
        public static final EnumC0768b f52625C0 = new EnumC0768b("COOK_CANCELLED", 52, "cook_cancelled");

        /* renamed from: D0, reason: collision with root package name */
        public static final EnumC0768b f52628D0 = new EnumC0768b("COOK_READY", 53, "cook_ready");

        /* renamed from: E0, reason: collision with root package name */
        public static final EnumC0768b f52631E0 = new EnumC0768b("COOK_UNDERCOOK", 54, "cook_undercook");

        /* renamed from: F0, reason: collision with root package name */
        public static final EnumC0768b f52634F0 = new EnumC0768b("COOK_OVERCOOKED", 55, "cook_overcooked");

        /* renamed from: G0, reason: collision with root package name */
        public static final EnumC0768b f52637G0 = new EnumC0768b("CLOUD_SIGN_IN_SETTINGS", 56, "cloud_sign_in_settings");

        /* renamed from: H0, reason: collision with root package name */
        public static final EnumC0768b f52640H0 = new EnumC0768b("CLOUD_OFFERS_TAPPED", 57, "cloud_offers_tapped");

        /* renamed from: I0, reason: collision with root package name */
        public static final EnumC0768b f52643I0 = new EnumC0768b("NEWS_DISPLAYED", 58, "news_displayed");

        /* renamed from: J0, reason: collision with root package name */
        public static final EnumC0768b f52646J0 = new EnumC0768b("PREVIOUS_COOK_GUIDED_COOK_SCREEN", 59, "previous_cook_guided_cook_screen");

        /* renamed from: K0, reason: collision with root package name */
        public static final EnumC0768b f52649K0 = new EnumC0768b("CLOUD_ICON_TAPPED", 60, "cloud_icon_tapped");

        /* renamed from: L0, reason: collision with root package name */
        public static final EnumC0768b f52652L0 = new EnumC0768b("MEAT_LIST_SEARCH", 61, "meat_list_search");

        /* renamed from: M0, reason: collision with root package name */
        public static final EnumC0768b f52655M0 = new EnumC0768b("PREVIOUS_COOK_STARTED", 62, "previous_cook_started");

        /* renamed from: N0, reason: collision with root package name */
        public static final EnumC0768b f52658N0 = new EnumC0768b("AMBIENT_FALLS_SETUP", 63, "ambient_falls_setup");

        /* renamed from: O0, reason: collision with root package name */
        public static final EnumC0768b f52661O0 = new EnumC0768b("AMBIENT_RISES_SETUP", 64, "ambient_rises_setup");

        /* renamed from: P0, reason: collision with root package name */
        public static final EnumC0768b f52664P0 = new EnumC0768b("INTERNAL_FALLS_SETUP", 65, "internal_falls_setup");

        /* renamed from: Q0, reason: collision with root package name */
        public static final EnumC0768b f52667Q0 = new EnumC0768b("INTERNAL_RISES_SETUP", 66, "internal_rises_setup");

        /* renamed from: R0, reason: collision with root package name */
        public static final EnumC0768b f52670R0 = new EnumC0768b("TIME_ELAPSED_SETUP", 67, "time_elapsed_setup");

        /* renamed from: S0, reason: collision with root package name */
        public static final EnumC0768b f52673S0 = new EnumC0768b("TIME_REMAINING_SETUP", 68, "time_remaining_setup");

        /* renamed from: T0, reason: collision with root package name */
        public static final EnumC0768b f52676T0 = new EnumC0768b("INTERVAL_ALERT_SETUP", 69, "interval_alert_setup");

        /* renamed from: U0, reason: collision with root package name */
        public static final EnumC0768b f52679U0 = new EnumC0768b("ESTIMATE_READY_SETUP", 70, "estimate_ready_alert_setup");

        /* renamed from: V0, reason: collision with root package name */
        public static final EnumC0768b f52682V0 = new EnumC0768b("USDA_TEMPS_TAPPED", 71, "usda_temps_tapped");

        /* renamed from: W0, reason: collision with root package name */
        public static final EnumC0768b f52685W0 = new EnumC0768b("USDA_GRAPH_TAPPED", 72, "usda_graph_tapped");

        /* renamed from: X0, reason: collision with root package name */
        public static final EnumC0768b f52688X0 = new EnumC0768b("BLOCK_UPDATE_FAILED_ERROR", 73, "block_update_failed_error");

        /* renamed from: Y0, reason: collision with root package name */
        public static final EnumC0768b f52691Y0 = new EnumC0768b("NEED_HELP_NO_PROBES_CONNECTED", 74, "need_help_no_probes_connected");

        /* renamed from: Z0, reason: collision with root package name */
        public static final EnumC0768b f52694Z0 = new EnumC0768b("NEED_HELP_OVERCOOK", 75, "need_help_overcook");

        /* renamed from: a1, reason: collision with root package name */
        public static final EnumC0768b f52697a1 = new EnumC0768b("NEED_HELP_TOO_MANY_DISCONNECTIONS", 76, "need_help_too_many_disconnections");

        /* renamed from: b1, reason: collision with root package name */
        public static final EnumC0768b f52700b1 = new EnumC0768b("NEED_HELP_LOW_BATTERY", 77, "need_help_low_battery");

        /* renamed from: c1, reason: collision with root package name */
        public static final EnumC0768b f52703c1 = new EnumC0768b("NEED_HELP_HIGH_TEMPERATURE", 78, "need_help_high_temperature");

        /* renamed from: d1, reason: collision with root package name */
        public static final EnumC0768b f52705d1 = new EnumC0768b("NEED_HELP_CONTACT_SUPPORT", 79, "need_help_contact_support");

        /* renamed from: e1, reason: collision with root package name */
        public static final EnumC0768b f52707e1 = new EnumC0768b("NEED_HELP_GET_IN_TOUCH", 80, "need_help_get_in_touch");

        /* renamed from: f1, reason: collision with root package name */
        public static final EnumC0768b f52709f1 = new EnumC0768b("NEED_HELP_WIFI_SETUP", 81, "need_help_block_wifi_setup");

        /* renamed from: g1, reason: collision with root package name */
        public static final EnumC0768b f52711g1 = new EnumC0768b("REVIEW_REQUEST_MADE", 82, "review_request_made");

        /* renamed from: h1, reason: collision with root package name */
        public static final EnumC0768b f52713h1 = new EnumC0768b("REVIEW_REQUEST_DO_NOTHING", 83, "review_request_do_nothing");

        /* renamed from: i1, reason: collision with root package name */
        public static final EnumC0768b f52715i1 = new EnumC0768b("REVIEW_REQUEST_FAILED", 84, "review_request_failed");

        /* renamed from: j1, reason: collision with root package name */
        public static final EnumC0768b f52717j1 = new EnumC0768b("REVIEW_REQUEST_SHOW", 85, "review_request_show");

        /* renamed from: k1, reason: collision with root package name */
        public static final EnumC0768b f52719k1 = new EnumC0768b("REVIEW_REQUEST_YES_RESPONSE", 86, "review_request_yes_response");

        /* renamed from: l1, reason: collision with root package name */
        public static final EnumC0768b f52721l1 = new EnumC0768b("REVIEW_REQUEST_NO_RESPONSE", 87, "review_request_no_response");

        /* renamed from: m1, reason: collision with root package name */
        public static final EnumC0768b f52723m1 = new EnumC0768b("BEEF_SETUP", 88, "beef_setup");

        /* renamed from: n1, reason: collision with root package name */
        public static final EnumC0768b f52725n1 = new EnumC0768b("PORK_SETUP", 89, "pork_setup");

        /* renamed from: o1, reason: collision with root package name */
        public static final EnumC0768b f52727o1 = new EnumC0768b("POULTRY_SETUP", 90, "poultry_setup");

        /* renamed from: p1, reason: collision with root package name */
        public static final EnumC0768b f52729p1 = new EnumC0768b("LAMB_SETUP", 91, "lamb_setup");

        /* renamed from: q1, reason: collision with root package name */
        public static final EnumC0768b f52731q1 = new EnumC0768b("FISH_SETUP", 92, "fish_setup");

        /* renamed from: r1, reason: collision with root package name */
        public static final EnumC0768b f52733r1 = new EnumC0768b("OTHER_SETUP", 93, "other_setup");

        /* renamed from: s1, reason: collision with root package name */
        public static final EnumC0768b f52735s1 = new EnumC0768b("CLOUD_REGISTER_SUCCESS", 94, "cloud_register_success");

        /* renamed from: t1, reason: collision with root package name */
        public static final EnumC0768b f52737t1 = new EnumC0768b("MEATER_PLUS_SHUT_DOWN_PROBE_IN_CHARGER", 95, "meater_plus_shutdown_probe_in_charger");

        /* renamed from: u1, reason: collision with root package name */
        public static final EnumC0768b f52739u1 = new EnumC0768b("MEATER_PLUS_SHUT_DOWN_OUT_OF_BATTERY", 96, "meater_plus_shutdown_out_of_battery");

        /* renamed from: v1, reason: collision with root package name */
        public static final EnumC0768b f52741v1 = new EnumC0768b("MEATER_PLUS_SHUT_DOWN_PROBE_UPSIDE_DOWN", 97, "meater_plus_shutdown_probe_upside_down");

        /* renamed from: w1, reason: collision with root package name */
        public static final EnumC0768b f52743w1 = new EnumC0768b("MEATER_PLUS_SHUT_DOWN_NO_PROBE_TIME_OUT", 98, "meater_plus_shutdown_no_probe_timeout");

        /* renamed from: x1, reason: collision with root package name */
        public static final EnumC0768b f52745x1 = new EnumC0768b("MEATER_PLUS_SHUT_DOWN_NO_COOK_TIMEOUT", 99, "meater_plus_shutdown_no_cook_timeout");

        /* renamed from: y1, reason: collision with root package name */
        public static final EnumC0768b f52747y1 = new EnumC0768b("COOK_NOTE_ADD", 100, "cook_note_add");

        /* renamed from: z1, reason: collision with root package name */
        public static final EnumC0768b f52749z1 = new EnumC0768b("COOK_NOTE_SAVE", 101, "cook_note_save");

        /* renamed from: A1, reason: collision with root package name */
        public static final EnumC0768b f52621A1 = new EnumC0768b("TAB_NOTE_SELECTED", 102, "tab_note_selected");

        /* renamed from: B1, reason: collision with root package name */
        public static final EnumC0768b f52623B1 = new EnumC0768b("TAB_DETAIL_SELECTED", 103, "tab_details_selected");

        /* renamed from: C1, reason: collision with root package name */
        public static final EnumC0768b f52626C1 = new EnumC0768b("EDIT_NOTE", 104, "edit_note");

        /* renamed from: D1, reason: collision with root package name */
        public static final EnumC0768b f52629D1 = new EnumC0768b("DELETE_NOTE", Temperature.MAX_INTERNAL_SECOND_GEN_PROBE, "delete_note");

        /* renamed from: E1, reason: collision with root package name */
        public static final EnumC0768b f52632E1 = new EnumC0768b("BLE_SCANNER_CRASH", 106, "ble_scanner_crash");

        /* renamed from: F1, reason: collision with root package name */
        public static final EnumC0768b f52635F1 = new EnumC0768b("VIDEO_PLAYLIST_SELECTED", 107, "video_playlist_selected");

        /* renamed from: G1, reason: collision with root package name */
        public static final EnumC0768b f52638G1 = new EnumC0768b("VIDEO_SELECTED", 108, "video_selected");

        /* renamed from: H1, reason: collision with root package name */
        public static final EnumC0768b f52641H1 = new EnumC0768b("FACEBOOK_SELECTED", 109, "facebook_selected");

        /* renamed from: I1, reason: collision with root package name */
        public static final EnumC0768b f52644I1 = new EnumC0768b("YOUTUBE_SELECTED", 110, "youtube_selected");

        /* renamed from: J1, reason: collision with root package name */
        public static final EnumC0768b f52647J1 = new EnumC0768b("INSTAGRAM_SELECTED", 111, "instagram_selected");

        /* renamed from: K1, reason: collision with root package name */
        public static final EnumC0768b f52650K1 = new EnumC0768b("TIKTOK_SELECTED", 112, "tiktok_selected");

        /* renamed from: L1, reason: collision with root package name */
        public static final EnumC0768b f52653L1 = new EnumC0768b("PINTREST_SELECTED", 113, "pintrest_selected");

        /* renamed from: M1, reason: collision with root package name */
        public static final EnumC0768b f52656M1 = new EnumC0768b("TWITTER_SELECTED", 114, "twitter_selected");

        /* renamed from: N1, reason: collision with root package name */
        public static final EnumC0768b f52659N1 = new EnumC0768b("SORT_VIOLATES_GENERAL_CONTRACT", 115, "sort_violates_general_contract");

        /* renamed from: O1, reason: collision with root package name */
        public static final EnumC0768b f52662O1 = new EnumC0768b("SAFETY_COMPLIANCE_VIEWED", 116, "safety_compliance_viewed");

        /* renamed from: P1, reason: collision with root package name */
        public static final EnumC0768b f52665P1 = new EnumC0768b("CLIP_BUY", 117, "clip_buy");

        /* renamed from: Q1, reason: collision with root package name */
        public static final EnumC0768b f52668Q1 = new EnumC0768b("CRASH_ON_SERVICE_START", 118, "crash_on_service_start");

        /* renamed from: R1, reason: collision with root package name */
        public static final EnumC0768b f52671R1 = new EnumC0768b("HANDLE_CRASH_SSL_EXCEPTION", 119, "handle_crash_ssl_exception");

        /* renamed from: S1, reason: collision with root package name */
        public static final EnumC0768b f52674S1 = new EnumC0768b("UNPAIR_DEVICE", TemperatureLog.MAX_TEMPERATURE_HISTORY_SAMPLES, "unpair_device");

        /* renamed from: T1, reason: collision with root package name */
        public static final EnumC0768b f52677T1 = new EnumC0768b("APPLIANCE_SELECTED", 121, "appliance_selected");

        /* renamed from: U1, reason: collision with root package name */
        public static final EnumC0768b f52680U1 = new EnumC0768b("SOCKET_TIME_OUT_EXCEPTION", 122, "socket_timeout_exception");

        /* renamed from: V1, reason: collision with root package name */
        public static final EnumC0768b f52683V1 = new EnumC0768b("HIGH_AMBIENT_NO_COOK", 123, "high_ambient_no_cook");

        /* renamed from: W1, reason: collision with root package name */
        public static final EnumC0768b f52686W1 = new EnumC0768b("AP_MODE_OTA", 124, "ap_mode_ota");

        /* renamed from: X1, reason: collision with root package name */
        public static final EnumC0768b f52689X1 = new EnumC0768b("AP_MODE_OTA_JOIN", 125, "ap_mode_ota_join");

        /* renamed from: Y1, reason: collision with root package name */
        public static final EnumC0768b f52692Y1 = new EnumC0768b("AP_MODE_OTA_CANCEL", 126, "ap_mode_ota_cancel");

        /* renamed from: Z1, reason: collision with root package name */
        public static final EnumC0768b f52695Z1 = new EnumC0768b("NL_GRIP_CLIP_ORDER", 127, "nl_grip_clips_order");

        static {
            EnumC0768b[] enumC0768bArrC = c();
            f52698a2 = enumC0768bArrC;
            f52701b2 = C4929b.a(enumC0768bArrC);
        }

        private EnumC0768b(String str, int i10, String str2) {
            this.title = str2;
        }

        private static final /* synthetic */ EnumC0768b[] c() {
            return new EnumC0768b[]{f52624C, f52627D, f52630E, f52633F, f52636G, f52639H, f52642I, f52645J, f52648K, f52651L, f52654M, f52657N, f52660O, f52663P, f52666Q, f52669R, f52672S, f52675T, f52678U, f52681V, f52684W, f52687X, f52690Y, f52693Z, f52696a0, f52699b0, f52702c0, f52704d0, f52706e0, f52708f0, f52710g0, f52712h0, f52714i0, f52716j0, f52718k0, f52720l0, f52722m0, f52724n0, f52726o0, f52728p0, f52730q0, f52732r0, f52734s0, f52736t0, f52738u0, f52740v0, f52742w0, f52744x0, f52746y0, f52748z0, f52620A0, f52622B0, f52625C0, f52628D0, f52631E0, f52634F0, f52637G0, f52640H0, f52643I0, f52646J0, f52649K0, f52652L0, f52655M0, f52658N0, f52661O0, f52664P0, f52667Q0, f52670R0, f52673S0, f52676T0, f52679U0, f52682V0, f52685W0, f52688X0, f52691Y0, f52694Z0, f52697a1, f52700b1, f52703c1, f52705d1, f52707e1, f52709f1, f52711g1, f52713h1, f52715i1, f52717j1, f52719k1, f52721l1, f52723m1, f52725n1, f52727o1, f52729p1, f52731q1, f52733r1, f52735s1, f52737t1, f52739u1, f52741v1, f52743w1, f52745x1, f52747y1, f52749z1, f52621A1, f52623B1, f52626C1, f52629D1, f52632E1, f52635F1, f52638G1, f52641H1, f52644I1, f52647J1, f52650K1, f52653L1, f52656M1, f52659N1, f52662O1, f52665P1, f52668Q1, f52671R1, f52674S1, f52677T1, f52680U1, f52683V1, f52686W1, f52689X1, f52692Y1, f52695Z1};
        }

        public static EnumC0768b valueOf(String str) {
            return (EnumC0768b) Enum.valueOf(EnumC0768b.class, str);
        }

        public static EnumC0768b[] values() {
            return (EnumC0768b[]) f52698a2.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GATracking.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b \b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!¨\u0006\""}, d2 = {"Lx4/b$c;", "", "", "title", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "B", "Ljava/lang/String;", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a0", "b0", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c {

        /* renamed from: C, reason: collision with root package name */
        public static final c f52751C = new c("DASHBOARD", 0, "Dashboard");

        /* renamed from: D, reason: collision with root package name */
        public static final c f52752D = new c("SINGLE_PROBE", 1, "Single_Probe");

        /* renamed from: E, reason: collision with root package name */
        public static final c f52753E = new c("OFFERS", 2, "Offers");

        /* renamed from: F, reason: collision with root package name */
        public static final c f52754F = new c("CLOUD_STATUS", 3, "Cloud_Status");

        /* renamed from: G, reason: collision with root package name */
        public static final c f52755G = new c("HELP", 4, "Help");

        /* renamed from: H, reason: collision with root package name */
        public static final c f52756H = new c("CAMERA", 5, "Camera");

        /* renamed from: I, reason: collision with root package name */
        public static final c f52757I = new c("PHOTO_LIBRARY", 6, "PhotoLibrary");

        /* renamed from: J, reason: collision with root package name */
        public static final c f52758J = new c("GRAPH", 7, "Graph");

        /* renamed from: K, reason: collision with root package name */
        public static final c f52759K = new c("QSG", 8, "QSG");

        /* renamed from: L, reason: collision with root package name */
        public static final c f52760L = new c("COOK_SETUP", 9, "Cook_Setup");

        /* renamed from: M, reason: collision with root package name */
        public static final c f52761M = new c("FAILED", 10, "Failed");

        /* renamed from: N, reason: collision with root package name */
        public static final c f52762N = new c("NOT_SIGNED_IN_TO_CLOUD", 11, "Not_signed_in_to_cloud");

        /* renamed from: O, reason: collision with root package name */
        public static final c f52763O = new c("GENERAL", 12, "general");

        /* renamed from: P, reason: collision with root package name */
        public static final c f52764P = new c("INTERNAL", 13, "internal");

        /* renamed from: Q, reason: collision with root package name */
        public static final c f52765Q = new c("AMBIENT", 14, "ambient");

        /* renamed from: R, reason: collision with root package name */
        public static final c f52766R = new c("TIME", 15, "time");

        /* renamed from: S, reason: collision with root package name */
        public static final c f52767S = new c("SIGNED_IN_TO_CLOUD", 16, "Signed_in_to_cloud");

        /* renamed from: T, reason: collision with root package name */
        public static final c f52768T = new c("ALL", 17, "all");

        /* renamed from: U, reason: collision with root package name */
        public static final c f52769U = new c("GUEST", 18, "guest");

        /* renamed from: V, reason: collision with root package name */
        public static final c f52770V = new c("BEEF", 19, "beef");

        /* renamed from: W, reason: collision with root package name */
        public static final c f52771W = new c("POULTRY", 20, "poultry");

        /* renamed from: X, reason: collision with root package name */
        public static final c f52772X = new c("PORK", 21, "pork");

        /* renamed from: Y, reason: collision with root package name */
        public static final c f52773Y = new c("LAMB", 22, "lamb");

        /* renamed from: Z, reason: collision with root package name */
        public static final c f52774Z = new c("FISH", 23, "fish");

        /* renamed from: a0, reason: collision with root package name */
        public static final c f52775a0 = new c("OTHER", 24, "other");

        /* renamed from: b0, reason: collision with root package name */
        public static final c f52776b0 = new c("JUICY_COOK", 25, "juicy_cook");

        /* renamed from: c0, reason: collision with root package name */
        private static final /* synthetic */ c[] f52777c0;

        /* renamed from: d0, reason: collision with root package name */
        private static final /* synthetic */ InterfaceC4928a f52778d0;

        /* renamed from: B, reason: collision with root package name and from kotlin metadata */
        public final String title;

        static {
            c[] cVarArrC = c();
            f52777c0 = cVarArrC;
            f52778d0 = C4929b.a(cVarArrC);
        }

        private c(String str, int i10, String str2) {
            this.title = str2;
        }

        private static final /* synthetic */ c[] c() {
            return new c[]{f52751C, f52752D, f52753E, f52754F, f52755G, f52756H, f52757I, f52758J, f52759K, f52760L, f52761M, f52762N, f52763O, f52764P, f52765Q, f52766R, f52767S, f52768T, f52769U, f52770V, f52771W, f52772X, f52773Y, f52774Z, f52775a0, f52776b0};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f52777c0.clone();
        }
    }

    private b() {
    }

    public static final String a(DeviceCookState cookState) {
        C3862t.g(cookState, "cookState");
        return cookState.getValue() <= DeviceCookState.COOK_STATE_OVERCOOK.getValue() ? new String[]{"Cancelled", "Configured", "Started", "Ready For Resting", "Resting", "Slightly Underdone", "Finished", "Slightly Overdone", "OVERCOOK"}[cookState.getValue()] : "InvalidState";
    }

    public static final String b(Probe probe) {
        String nameLong;
        C3862t.g(probe, "probe");
        if (probe.getCookState().getValue() == DeviceCookState.COOK_STATE_NOT_STARTED.getValue()) {
            return "No Cook Setup";
        }
        MeatCut meatCut = probe.getmCut();
        if (meatCut == null || (nameLong = meatCut.getNameLong()) == null) {
            nameLong = "Custom Cook";
        }
        V v10 = V.f43983a;
        String str = String.format(Locale.US, "%s (%s)", Arrays.copyOf(new Object[]{nameLong, probe.getConnectionMethod().toString()}, 2));
        C3862t.f(str, "format(...)");
        return str;
    }

    public static final void c(String name, String value) {
        C3862t.g(name, "name");
        C3862t.g(value, "value");
        if (Config.INSTANCE.getInstance().FIREBASE_ENABLED) {
            FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(g.h());
            C3862t.f(firebaseAnalytics, "getInstance(...)");
            firebaseAnalytics.b(true);
            firebaseAnalytics.c(name, value);
        }
    }

    public static final void d() {
        if (Config.INSTANCE.getInstance().FIREBASE_ENABLED) {
            Context contextH = g.h();
            FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(contextH);
            C3862t.f(firebaseAnalytics, "getInstance(...)");
            firebaseAnalytics.b(true);
            com.google.firebase.crashlytics.a aVarB = com.google.firebase.crashlytics.a.b();
            C3862t.f(aVarB, "getInstance(...)");
            aVarB.f(true);
            aVarB.g(E4.i.D().G());
            firebaseAnalytics.c("is_amazon_device", String.valueOf(contextH.getResources().getBoolean(R.bool.amazon_device)));
        }
    }

    public static final void e(Probe probe) {
        C3862t.g(probe, "probe");
        String str = EnumC0768b.f52666Q.title;
        DeviceCookState cookState = probe.getCookState();
        C3862t.f(cookState, "getCookState(...)");
        j(str, a(cookState), b(probe), null, 8, null);
    }

    public static final void f(String category, String str, String str2) {
        C3862t.g(category, "category");
        j(category, str, str2, null, 8, null);
    }

    public static final void g(String category, String action, String label, Long value) {
        C3862t.g(category, "category");
        boolean z10 = category.length() <= 40;
        boolean zB = k.INSTANCE.c("[A-Za-z0-9_]+").b(category);
        if (!z10 || !zB) {
            U4.b.j("Invalid event name " + category, new Object[0]);
        }
        if (Config.INSTANCE.getInstance().FIREBASE_ENABLED) {
            Bundle bundle = new Bundle();
            bundle.putString("action", action);
            bundle.putString("label", label);
            if (value != null) {
                bundle.putLong("value", value.longValue());
            }
            FirebaseAnalytics.getInstance(g.h()).a(category, bundle);
        }
    }

    public static final void h(EnumC0768b category, a aVar, c cVar) {
        C3862t.g(category, "category");
        k(category, aVar, cVar, null, 8, null);
    }

    public static final void i(EnumC0768b category, a action, c label, Long value) {
        C3862t.g(category, "category");
        g(category.title, action != null ? action.title : null, label != null ? label.title : null, value);
    }

    public static /* synthetic */ void j(String str, String str2, String str3, Long l10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            l10 = null;
        }
        g(str, str2, str3, l10);
    }

    public static /* synthetic */ void k(EnumC0768b enumC0768b, a aVar, c cVar, Long l10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            l10 = null;
        }
        i(enumC0768b, aVar, cVar, l10);
    }

    public static final void l(Activity activity, String pageToTrack) {
        if (activity == null || pageToTrack == null || !Config.INSTANCE.getInstance().FIREBASE_ENABLED) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("screen_name", pageToTrack);
        bundle.putString("screen_class", activity.getClass().getSimpleName());
        FirebaseAnalytics.getInstance(activity).a("screen_view", bundle);
    }
}
