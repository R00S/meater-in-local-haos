package f1;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import f1.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s.C4392b;

/* compiled from: NotificationCompatBuilder.java */
/* loaded from: classes.dex */
class o implements l {

    /* renamed from: a, reason: collision with root package name */
    private final Context f41159a;

    /* renamed from: b, reason: collision with root package name */
    private final Notification.Builder f41160b;

    /* renamed from: c, reason: collision with root package name */
    private final m.e f41161c;

    /* renamed from: d, reason: collision with root package name */
    private RemoteViews f41162d;

    /* renamed from: e, reason: collision with root package name */
    private RemoteViews f41163e;

    /* renamed from: f, reason: collision with root package name */
    private final List<Bundle> f41164f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f41165g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    private int f41166h;

    /* renamed from: i, reason: collision with root package name */
    private RemoteViews f41167i;

    /* compiled from: NotificationCompatBuilder.java */
    static class a {
        static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        static Notification.Builder e(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder f(Notification.Builder builder, boolean z10) {
            return builder.setGroupSummary(z10);
        }

        static Notification.Builder g(Notification.Builder builder, boolean z10) {
            return builder.setLocalOnly(z10);
        }

        static Notification.Builder h(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    static class b {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder c(Notification.Builder builder, int i10) {
            return builder.setColor(i10);
        }

        static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        static Notification.Builder f(Notification.Builder builder, int i10) {
            return builder.setVisibility(i10);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    static class c {
        static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    static class d {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAllowGeneratedReplies(z10);
        }

        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    static class e {
        static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setBadgeIconType(i10);
        }

        static Notification.Builder c(Notification.Builder builder, boolean z10) {
            return builder.setColorized(z10);
        }

        static Notification.Builder d(Notification.Builder builder, int i10) {
            return builder.setGroupAlertBehavior(i10);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder g(Notification.Builder builder, long j10) {
            return builder.setTimeoutAfter(j10);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    static class f {
        static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, int i10) {
            return builder.setSemanticAction(i10);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    static class g {
        static Notification.Builder a(Notification.Builder builder, boolean z10) {
            return builder.setAllowSystemGeneratedContextualActions(z10);
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z10) {
            return builder.setContextual(z10);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    static class h {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
            return builder.setAuthenticationRequired(z10);
        }

        static Notification.Builder b(Notification.Builder builder, int i10) {
            return builder.setForegroundServiceBehavior(i10);
        }
    }

    o(m.e eVar) {
        int i10;
        this.f41161c = eVar;
        Context context = eVar.f41105a;
        this.f41159a = context;
        Notification.Builder builderA = e.a(context, eVar.f41094K);
        this.f41160b = builderA;
        Notification notification = eVar.f41101R;
        builderA.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f41113i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f41109e).setContentText(eVar.f41110f).setContentInfo(eVar.f41115k).setContentIntent(eVar.f41111g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f41112h, (notification.flags & 128) != 0).setNumber(eVar.f41116l).setProgress(eVar.f41124t, eVar.f41125u, eVar.f41126v);
        IconCompat iconCompat = eVar.f41114j;
        c.b(builderA, iconCompat == null ? null : iconCompat.o(context));
        builderA.setSubText(eVar.f41121q).setUsesChronometer(eVar.f41119o).setPriority(eVar.f41117m);
        m.i iVar = eVar.f41120p;
        if (iVar instanceof m.f) {
            Iterator<m.a> it = ((m.f) iVar).h().iterator();
            while (it.hasNext()) {
                b(it.next());
            }
        } else {
            Iterator<m.a> it2 = eVar.f41106b.iterator();
            while (it2.hasNext()) {
                b(it2.next());
            }
        }
        Bundle bundle = eVar.f41087D;
        if (bundle != null) {
            this.f41165g.putAll(bundle);
        }
        int i11 = Build.VERSION.SDK_INT;
        this.f41162d = eVar.f41091H;
        this.f41163e = eVar.f41092I;
        this.f41160b.setShowWhen(eVar.f41118n);
        a.g(this.f41160b, eVar.f41130z);
        a.e(this.f41160b, eVar.f41127w);
        a.h(this.f41160b, eVar.f41129y);
        a.f(this.f41160b, eVar.f41128x);
        this.f41166h = eVar.f41098O;
        b.b(this.f41160b, eVar.f41086C);
        b.c(this.f41160b, eVar.f41088E);
        b.f(this.f41160b, eVar.f41089F);
        b.d(this.f41160b, eVar.f41090G);
        b.e(this.f41160b, notification.sound, notification.audioAttributes);
        List listE = i11 < 28 ? e(g(eVar.f41107c), eVar.f41104U) : eVar.f41104U;
        if (listE != null && !listE.isEmpty()) {
            Iterator it3 = listE.iterator();
            while (it3.hasNext()) {
                b.a(this.f41160b, (String) it3.next());
            }
        }
        this.f41167i = eVar.f41093J;
        if (eVar.f41108d.size() > 0) {
            Bundle bundle2 = eVar.d().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i12 = 0; i12 < eVar.f41108d.size(); i12++) {
                bundle4.putBundle(Integer.toString(i12), p.a(eVar.f41108d.get(i12)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.d().putBundle("android.car.EXTENSIONS", bundle2);
            this.f41165g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i13 = Build.VERSION.SDK_INT;
        Object obj = eVar.f41103T;
        if (obj != null) {
            c.c(this.f41160b, obj);
        }
        this.f41160b.setExtras(eVar.f41087D);
        d.e(this.f41160b, eVar.f41123s);
        RemoteViews remoteViews = eVar.f41091H;
        if (remoteViews != null) {
            d.c(this.f41160b, remoteViews);
        }
        RemoteViews remoteViews2 = eVar.f41092I;
        if (remoteViews2 != null) {
            d.b(this.f41160b, remoteViews2);
        }
        RemoteViews remoteViews3 = eVar.f41093J;
        if (remoteViews3 != null) {
            d.d(this.f41160b, remoteViews3);
        }
        e.b(this.f41160b, eVar.f41095L);
        e.e(this.f41160b, eVar.f41122r);
        e.f(this.f41160b, eVar.f41096M);
        e.g(this.f41160b, eVar.f41097N);
        e.d(this.f41160b, eVar.f41098O);
        if (eVar.f41085B) {
            e.c(this.f41160b, eVar.f41084A);
        }
        if (!TextUtils.isEmpty(eVar.f41094K)) {
            this.f41160b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (i13 >= 28) {
            Iterator<u> it4 = eVar.f41107c.iterator();
            while (it4.hasNext()) {
                f.a(this.f41160b, it4.next().h());
            }
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 29) {
            g.a(this.f41160b, eVar.f41100Q);
            g.b(this.f41160b, m.d.a(null));
        }
        if (i14 >= 31 && (i10 = eVar.f41099P) != 0) {
            h.b(this.f41160b, i10);
        }
        if (eVar.f41102S) {
            if (this.f41161c.f41128x) {
                this.f41166h = 2;
            } else {
                this.f41166h = 1;
            }
            this.f41160b.setVibrate(null);
            this.f41160b.setSound(null);
            int i15 = notification.defaults & (-4);
            notification.defaults = i15;
            this.f41160b.setDefaults(i15);
            if (TextUtils.isEmpty(this.f41161c.f41127w)) {
                a.e(this.f41160b, "silent");
            }
            e.d(this.f41160b, this.f41166h);
        }
    }

    private void b(m.a aVar) {
        IconCompat iconCompatD = aVar.d();
        Notification.Action.Builder builderA = c.a(iconCompatD != null ? iconCompatD.n() : null, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : w.b(aVar.e())) {
                a.c(builderA, remoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i10 = Build.VERSION.SDK_INT;
        d.a(builderA, aVar.b());
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i10 >= 28) {
            f.b(builderA, aVar.f());
        }
        if (i10 >= 29) {
            g.c(builderA, aVar.j());
        }
        if (i10 >= 31) {
            h.a(builderA, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        a.b(builderA, bundle);
        a.a(this.f41160b, a.d(builderA));
    }

    private static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C4392b c4392b = new C4392b(list.size() + list2.size());
        c4392b.addAll(list);
        c4392b.addAll(list2);
        return new ArrayList(c4392b);
    }

    private static List<String> g(List<u> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<u> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().g());
        }
        return arrayList;
    }

    @Override // f1.l
    public Notification.Builder a() {
        return this.f41160b;
    }

    public Notification c() {
        Bundle bundleA;
        RemoteViews remoteViewsF;
        RemoteViews remoteViewsD;
        m.i iVar = this.f41161c.f41120p;
        if (iVar != null) {
            iVar.b(this);
        }
        RemoteViews remoteViewsE = iVar != null ? iVar.e(this) : null;
        Notification notificationD = d();
        if (remoteViewsE != null) {
            notificationD.contentView = remoteViewsE;
        } else {
            RemoteViews remoteViews = this.f41161c.f41091H;
            if (remoteViews != null) {
                notificationD.contentView = remoteViews;
            }
        }
        if (iVar != null && (remoteViewsD = iVar.d(this)) != null) {
            notificationD.bigContentView = remoteViewsD;
        }
        if (iVar != null && (remoteViewsF = this.f41161c.f41120p.f(this)) != null) {
            notificationD.headsUpContentView = remoteViewsF;
        }
        if (iVar != null && (bundleA = m.a(notificationD)) != null) {
            iVar.a(bundleA);
        }
        return notificationD;
    }

    protected Notification d() {
        return this.f41160b.build();
    }

    Context f() {
        return this.f41159a;
    }
}
