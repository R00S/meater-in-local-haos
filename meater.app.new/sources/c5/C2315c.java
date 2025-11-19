package c5;

import P5.Q;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.media.AudioAttributes;
import android.net.Uri;
import com.apptionlabs.meater_app.MainActivity;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.app.MeaterLinkService;
import com.apptionlabs.meater_app.data.Log;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.data.ProtocolParameters;
import com.apptionlabs.meater_app.model.Alert;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.v3protobuf.MCNotificationType;
import f1.m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: LocalNotification.java */
/* renamed from: c5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2315c {

    /* renamed from: d, reason: collision with root package name */
    public static String f31012d = "com.meater.notification.service";

    /* renamed from: e, reason: collision with root package name */
    public static String f31013e = "com.meater.notification";

    /* renamed from: f, reason: collision with root package name */
    private static int f31014f;

    /* renamed from: g, reason: collision with root package name */
    private static final ArrayList<C2315c> f31015g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    private static final HashMap<MCNotificationType, C2317e> f31016h = new HashMap<>();

    /* renamed from: a, reason: collision with root package name */
    private final long f31017a;

    /* renamed from: b, reason: collision with root package name */
    private final MCNotificationType f31018b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31019c;

    /* compiled from: LocalNotification.java */
    /* renamed from: c5.c$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f31020a;

        static {
            int[] iArr = new int[MCNotificationType.values().length];
            f31020a = iArr;
            try {
                iArr[MCNotificationType.NOTIFICATION_TYPE_CONNECTION_LOST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31020a[MCNotificationType.NOTIFICATION_TYPE_READY_FOR_RESTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31020a[MCNotificationType.NOTIFICATION_TYPE_COOK_READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31020a[MCNotificationType.NOTIFICATION_TYPE_ALERT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31020a[MCNotificationType.NOTIFICATION_TYPE_SLIGHTLY_OVERCOOKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31020a[MCNotificationType.NOTIFICATION_TYPE_OVERCOOK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31020a[MCNotificationType.NOTIFICATION_TYPE_HIGH_TEMPERATURE_WARNING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f31020a[MCNotificationType.NOTIFICATION_TYPE_PUT_PROBE_BACK_IN_CHARGER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public C2315c(long j10, MCNotificationType mCNotificationType) {
        this.f31017a = j10;
        this.f31018b = mCNotificationType;
        int i10 = f31014f + 1;
        f31014f = i10;
        this.f31019c = i10;
    }

    public static boolean a() {
        return x4.g.t().b() && Q.x();
    }

    public static void b() {
        Context contextH = x4.g.h();
        NotificationManager notificationManager = (NotificationManager) contextH.getSystemService("notification");
        if (notificationManager == null) {
            return;
        }
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(5).setContentType(4).build();
        HashMap<MCNotificationType, C2317e> map = f31016h;
        MCNotificationType mCNotificationType = MCNotificationType.NOTIFICATION_TYPE_INFO;
        map.put(mCNotificationType, new C2317e(f31013e, contextH.getString(R.string.general_notifications_notification_channel_name), contextH.getString(R.string.general_notifications_notification_channel_description), L5.c.q(contextH, L5.c.r(mCNotificationType))));
        MCNotificationType mCNotificationType2 = MCNotificationType.NOTIFICATION_TYPE_ALERT;
        map.put(mCNotificationType2, new C2317e("com.meater.alert", contextH.getString(R.string.cooking_alert_notification_channel_name), contextH.getString(R.string.cooking_alert_notification_channel_description), L5.c.q(contextH, L5.c.r(mCNotificationType2))));
        MCNotificationType mCNotificationType3 = MCNotificationType.NOTIFICATION_TYPE_HIGH_TEMPERATURE_WARNING;
        map.put(mCNotificationType3, new C2317e("com.meater.high-temperature-warning", contextH.getString(R.string.high_temperature_notification_channel_name), contextH.getString(R.string.high_temperature_warning_notification_channel_description), L5.c.q(contextH, L5.c.r(mCNotificationType3))));
        MCNotificationType mCNotificationType4 = MCNotificationType.NOTIFICATION_TYPE_CONNECTION_LOST;
        map.put(mCNotificationType4, new C2317e("com.meater.connection-lost", contextH.getString(R.string.connection_alert_notification_channel_name), contextH.getString(R.string.connection_alert_notification_channel_description), L5.c.q(contextH, L5.c.r(mCNotificationType4))));
        MCNotificationType mCNotificationType5 = MCNotificationType.NOTIFICATION_TYPE_READY_FOR_RESTING;
        map.put(mCNotificationType5, new C2317e("com.meater.ready-for-resting", contextH.getString(R.string.remove_from_heat_label), contextH.getString(R.string.remove_from_heat_notification_channel_description), L5.c.q(contextH, L5.c.r(mCNotificationType5))));
        MCNotificationType mCNotificationType6 = MCNotificationType.NOTIFICATION_TYPE_COOK_READY;
        map.put(mCNotificationType6, new C2317e("com.meater.ready-to-eat", contextH.getString(R.string.cook_finished_notification_channel_name), contextH.getString(R.string.cook_finished_notification_channel_description), L5.c.q(contextH, L5.c.r(mCNotificationType6))));
        MCNotificationType mCNotificationType7 = MCNotificationType.NOTIFICATION_TYPE_SLIGHTLY_OVERCOOKED;
        map.put(mCNotificationType7, new C2317e("com.meater.slightly-overcooked", contextH.getString(R.string.slightly_overcooked_notification_channel_name), contextH.getString(R.string.slightly_overcooked_notification_channel_description), L5.c.q(contextH, L5.c.r(mCNotificationType7))));
        MCNotificationType mCNotificationType8 = MCNotificationType.NOTIFICATION_TYPE_OVERCOOK;
        map.put(mCNotificationType8, new C2317e("com.meater.overcooked", contextH.getString(R.string.overcooked_label_1), contextH.getString(R.string.overcooked_notification_channel_description), L5.c.q(contextH, L5.c.r(mCNotificationType8))));
        for (C2317e c2317e : map.values()) {
            NotificationChannel notificationChannel = new NotificationChannel(c2317e.f31028a, c2317e.f31029b, 3);
            notificationChannel.setSound(c2317e.f31031d, audioAttributesBuild);
            notificationChannel.setDescription(c2317e.f31030c);
            notificationChannel.enableLights(true);
            notificationChannel.setLightColor(-65536);
            notificationChannel.setVibrationPattern(new long[]{0, 1000, 500, 1000});
            notificationChannel.enableVibration(true);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    private static m.e c(Context context, String str, int i10, int i11, String str2, String str3, long[] jArr) {
        m.e eVar = new m.e(context, str);
        if (i10 != -1) {
            eVar.z(i10);
        }
        if (i11 != -1) {
            eVar.m(i11);
        }
        if (str2 != null) {
            eVar.k(str2);
        }
        if (jArr != null) {
            eVar.D(jArr);
        }
        if (str3 != null) {
            eVar.j(str3).B(new m.c().h(str3));
        }
        return eVar;
    }

    @TargetApi(26)
    public static Notification d(boolean z10) {
        Context contextH = x4.g.h();
        NotificationManager notificationManager = (NotificationManager) contextH.getSystemService("notification");
        if (notificationManager != null) {
            NotificationChannel notificationChannel = new NotificationChannel(f31012d, contextH.getString(R.string.meater_is_running), 2);
            notificationChannel.setShowBadge(false);
            notificationChannel.setDescription(contextH.getString(R.string.service_notification_channel_description));
            notificationChannel.setSound(null, null);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        m.e eVarC = c(contextH, f31012d, R.drawable.launcher_svg, -1, null, contextH.getString(R.string.meater_is_running), null);
        eVarC.E(1).w(true).x(2).F(System.currentTimeMillis() + 500).v(true);
        if (!x4.g.t().i1() && z10) {
            Intent intent = new Intent(contextH, (Class<?>) MainActivity.class);
            intent.putExtra(ProtocolParameters.FOREGROUND_NOTIFICATION, true);
            intent.addFlags(67108864);
            eVarC.i(PendingIntent.getActivity(contextH, 786, intent, new D4.d(134217728, true).getFlags()));
        }
        return eVarC.b();
    }

    private static C2317e e(MCNotificationType mCNotificationType) {
        HashMap<MCNotificationType, C2317e> map = f31016h;
        if (map.size() == 0) {
            return null;
        }
        switch (a.f31020a[mCNotificationType.ordinal()]) {
            case 1:
                return map.get(MCNotificationType.NOTIFICATION_TYPE_CONNECTION_LOST);
            case 2:
                return map.get(MCNotificationType.NOTIFICATION_TYPE_READY_FOR_RESTING);
            case 3:
                return map.get(MCNotificationType.NOTIFICATION_TYPE_COOK_READY);
            case 4:
                return map.get(MCNotificationType.NOTIFICATION_TYPE_ALERT);
            case 5:
                return map.get(MCNotificationType.NOTIFICATION_TYPE_SLIGHTLY_OVERCOOKED);
            case 6:
                return map.get(MCNotificationType.NOTIFICATION_TYPE_OVERCOOK);
            case 7:
                return map.get(MCNotificationType.NOTIFICATION_TYPE_HIGH_TEMPERATURE_WARNING);
            case 8:
                return map.get(MCNotificationType.NOTIFICATION_TYPE_CONNECTION_LOST);
            default:
                return map.get(MCNotificationType.NOTIFICATION_TYPE_INFO);
        }
    }

    private static boolean f(MCNotificationType mCNotificationType) {
        return a.f31020a[mCNotificationType.ordinal()] != 1;
    }

    private static void g(Uri uri) throws IllegalStateException, Resources.NotFoundException, IOException, IllegalArgumentException {
        Log.info("LocalNotification", "playNotificationSoundManuallyIfNeeded <><>  canPlayAlertSoundWhileMuted = " + x4.g.t().b() + " isNotificationAccessGranted " + Q.x());
        if (a() && L5.c.p(x4.g.h()).j(uri) != null) {
            L5.c.p(x4.g.h()).j(uri).h(true);
        }
    }

    static void h(MEATERDevice mEATERDevice, Alert alert, MCNotificationType mCNotificationType, String str, int i10) {
        ArrayList<C2315c> arrayList;
        Context contextH = x4.g.h();
        NotificationManager notificationManager = (NotificationManager) contextH.getSystemService("notification");
        if (notificationManager == null || MeaterLinkService.e() == null) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (true) {
            arrayList = f31015g;
            if (i11 >= arrayList.size()) {
                break;
            }
            C2315c c2315c = arrayList.get(i11);
            if (c2315c.f31017a == mEATERDevice.getDeviceID() && c2315c.f31018b == mCNotificationType) {
                notificationManager.cancel(c2315c.f31019c);
                arrayList2.add(c2315c);
            }
            i11++;
        }
        arrayList.removeAll(arrayList2);
        C2315c c2315c2 = new C2315c(mEATERDevice.getDeviceID(), mCNotificationType);
        arrayList.add(c2315c2);
        C2317e c2317eE = e(mCNotificationType);
        String str2 = f31013e;
        Uri uriQ = L5.c.q(contextH, L5.c.r(mCNotificationType));
        if (c2317eE != null) {
            str2 = c2317eE.f31028a;
            uriQ = c2317eE.f31031d;
        }
        Uri uri = uriQ;
        String strDisplayName = mEATERDevice.getDeviceID() != -1 ? mEATERDevice.displayName() : contextH.getString(R.string.high_temp_warning_screen_label_1);
        if (f(mCNotificationType) != mEATERDevice.isNeedGenericDisConnectNotification()) {
            strDisplayName = "";
        }
        m.e eVarM = c(contextH, str2, R.drawable.launcher_svg, 6, strDisplayName, str, new long[]{500, 500}).f(true).C(contextH.getString(R.string.meater_label)).E(1).A(uri).m(6);
        Intent intent = new Intent(contextH, (Class<?>) MainActivity.class);
        intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, mEATERDevice.getDeviceID());
        if (alert != null) {
            intent.putExtra(MEATERIntent.EXTRA_ALERT_ID, alert.getId().toString());
        }
        intent.addFlags(67108864);
        eVarM.i(PendingIntent.getActivity(contextH, 0, intent, new D4.d(134217728, true).getFlags()));
        j(eVarM);
        notificationManager.notify(c2315c2.f31019c, eVarM.b());
        if (mCNotificationType == MCNotificationType.NOTIFICATION_TYPE_READY_FOR_RESTING || mCNotificationType == MCNotificationType.NOTIFICATION_TYPE_HIGH_TEMPERATURE_WARNING) {
            g(uri);
        }
    }

    public static void i(MEATERDevice mEATERDevice, MCNotificationType mCNotificationType) {
        ArrayList<C2315c> arrayList;
        NotificationManager notificationManager = (NotificationManager) x4.g.h().getSystemService("notification");
        if (notificationManager == null) {
            return;
        }
        C2315c c2315c = null;
        int i10 = 0;
        while (true) {
            arrayList = f31015g;
            if (i10 >= arrayList.size()) {
                break;
            }
            c2315c = arrayList.get(i10);
            if (c2315c.f31017a == mEATERDevice.getDeviceID() && c2315c.f31018b == mCNotificationType) {
                notificationManager.cancel(c2315c.f31019c);
            }
            i10++;
        }
        if (c2315c != null) {
            arrayList.remove(c2315c);
        }
    }

    private static m.e j(m.e eVar) {
        if (V5.c.j().e()) {
            eVar.c(new m.j());
        }
        return eVar;
    }
}
