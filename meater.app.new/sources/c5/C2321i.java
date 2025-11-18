package c5;

import P5.Q;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import android.widget.RemoteViews;
import com.apptionlabs.meater_app.MainActivity;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.v3protobuf.MCNotificationType;
import f1.m;
import f1.q;
import g1.C3377a;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: ProbeLiveCookNotification.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\nJ\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\nR\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010 ¨\u0006\""}, d2 = {"Lc5/i;", "Lc5/c;", "", "deviceID", "Lcom/apptionlabs/meater_app/v3protobuf/MCNotificationType;", "type", "<init>", "(JLcom/apptionlabs/meater_app/v3protobuf/MCNotificationType;)V", "Loa/F;", "k", "()V", "Lf1/q;", "notificationManagerCompat", "m", "(Lf1/q;)V", "Lcom/apptionlabs/meater_app/model/Probe;", "probe", "o", "(Lcom/apptionlabs/meater_app/model/Probe;)V", "p", "l", "n", "", "i", "Ljava/lang/String;", "COOK_CHANNEL_ID", "Lf1/m$e;", "j", "Lf1/m$e;", "builder", "Lf1/q;", "Lc5/b;", "Lc5/b;", "liveCookNotificationController", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: c5.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2321i extends C2315c {

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String COOK_CHANNEL_ID;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private m.e builder;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private q notificationManagerCompat;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private C2314b liveCookNotificationController;

    public C2321i(long j10, MCNotificationType mCNotificationType) {
        super(j10, mCNotificationType);
        this.COOK_CHANNEL_ID = "com.meater.live_cook";
    }

    private final void k() {
        NotificationChannel notificationChannel = new NotificationChannel(this.COOK_CHANNEL_ID, "Live cook notification", 3);
        notificationChannel.setDescription("Cooks in progress");
        Object systemService = x4.g.h().getSystemService("notification");
        C3862t.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
    }

    private final void m(q notificationManagerCompat) {
        if (C3377a.a(x4.g.h(), "android.permission.POST_NOTIFICATIONS") != 0) {
            return;
        }
        try {
            U4.b.t("Notification notified for id : " + this.f31019c, new Object[0]);
            if (notificationManagerCompat != null) {
                int i10 = this.f31019c;
                m.e eVar = this.builder;
                if (eVar == null) {
                    C3862t.u("builder");
                    eVar = null;
                }
                notificationManagerCompat.f(i10, eVar.b());
            }
        } catch (RemoteException unused) {
            n();
        }
    }

    public final void l() {
        n();
    }

    public final void n() {
        q qVar = this.notificationManagerCompat;
        if (qVar != null) {
            if (qVar != null) {
                qVar.b(this.f31019c);
            }
            this.liveCookNotificationController = null;
        }
    }

    public final void o(Probe probe) {
        C3862t.g(probe, "probe");
        Context contextH = x4.g.h();
        if (x4.g.t().R()) {
            U4.b.g("startCook , Preparing notification", new Object[0]);
            k();
            C2314b c2314b = new C2314b(new C2313a());
            this.liveCookNotificationController = c2314b;
            RemoteViews remoteViewsH = c2314b.h(probe);
            if (remoteViewsH == null) {
                Log.d("Live_Notificaiton_fix", "remoteView==null");
                return;
            }
            this.builder = new m.e(contextH, this.COOK_CHANNEL_ID).l(remoteViewsH).z(R.drawable.launcher_svg).h(Q.i(R.color.primary_color)).w(true).p(probe.shortDeviceIDString()).q(true).B(new m.g());
            Intent intent = new Intent(contextH, (Class<?>) MainActivity.class);
            intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, probe.getDeviceID());
            intent.addFlags(67108864);
            PendingIntent activity = PendingIntent.getActivity(contextH, this.f31019c, intent, new D4.d(134217728, true).getFlags());
            m.e eVar = this.builder;
            if (eVar == null) {
                C3862t.u("builder");
                eVar = null;
            }
            eVar.i(activity);
            if (this.notificationManagerCompat == null) {
                q qVarD = q.d(x4.g.h());
                this.notificationManagerCompat = qVarD;
                m(qVarD);
            }
            U4.b.t("Notification Created for " + probe.getDeviceID(), new Object[0]);
        }
    }

    public final void p(Probe probe) {
        RemoteViews remoteViewsH;
        C3862t.g(probe, "probe");
        C2314b c2314b = this.liveCookNotificationController;
        if (c2314b == null || (remoteViewsH = c2314b.h(probe)) == null) {
            return;
        }
        m.e eVar = this.builder;
        if (eVar == null) {
            C3862t.u("builder");
            eVar = null;
        }
        eVar.l(remoteViewsH);
        m(this.notificationManagerCompat);
    }
}
