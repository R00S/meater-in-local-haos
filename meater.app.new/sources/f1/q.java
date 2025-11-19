package f1;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import b.InterfaceC2194a;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: NotificationManagerCompat.java */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: d, reason: collision with root package name */
    private static String f41171d;

    /* renamed from: g, reason: collision with root package name */
    private static d f41174g;

    /* renamed from: a, reason: collision with root package name */
    private final Context f41175a;

    /* renamed from: b, reason: collision with root package name */
    private final NotificationManager f41176b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f41170c = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static Set<String> f41172e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private static final Object f41173f = new Object();

    /* compiled from: NotificationManagerCompat.java */
    static class a {
        static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    private static class b implements e {

        /* renamed from: a, reason: collision with root package name */
        final String f41177a;

        /* renamed from: b, reason: collision with root package name */
        final int f41178b;

        /* renamed from: c, reason: collision with root package name */
        final String f41179c;

        /* renamed from: d, reason: collision with root package name */
        final Notification f41180d;

        b(String str, int i10, String str2, Notification notification) {
            this.f41177a = str;
            this.f41178b = i10;
            this.f41179c = str2;
            this.f41180d = notification;
        }

        @Override // f1.q.e
        public void a(InterfaceC2194a interfaceC2194a) {
            interfaceC2194a.f1(this.f41177a, this.f41178b, this.f41179c, this.f41180d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f41177a + ", id:" + this.f41178b + ", tag:" + this.f41179c + "]";
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final ComponentName f41181a;

        /* renamed from: b, reason: collision with root package name */
        final IBinder f41182b;

        c(ComponentName componentName, IBinder iBinder) {
            this.f41181a = componentName;
            this.f41182b = iBinder;
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    private static class d implements Handler.Callback, ServiceConnection {

        /* renamed from: B, reason: collision with root package name */
        private final Context f41183B;

        /* renamed from: C, reason: collision with root package name */
        private final HandlerThread f41184C;

        /* renamed from: D, reason: collision with root package name */
        private final Handler f41185D;

        /* renamed from: E, reason: collision with root package name */
        private final Map<ComponentName, a> f41186E = new HashMap();

        /* renamed from: F, reason: collision with root package name */
        private Set<String> f41187F = new HashSet();

        /* compiled from: NotificationManagerCompat.java */
        private static class a {

            /* renamed from: a, reason: collision with root package name */
            final ComponentName f41188a;

            /* renamed from: c, reason: collision with root package name */
            InterfaceC2194a f41190c;

            /* renamed from: b, reason: collision with root package name */
            boolean f41189b = false;

            /* renamed from: d, reason: collision with root package name */
            ArrayDeque<e> f41191d = new ArrayDeque<>();

            /* renamed from: e, reason: collision with root package name */
            int f41192e = 0;

            a(ComponentName componentName) {
                this.f41188a = componentName;
            }
        }

        d(Context context) {
            this.f41183B = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f41184C = handlerThread;
            handlerThread.start();
            this.f41185D = new Handler(handlerThread.getLooper(), this);
        }

        private boolean a(a aVar) {
            if (aVar.f41189b) {
                return true;
            }
            boolean zBindService = this.f41183B.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f41188a), this, 33);
            aVar.f41189b = zBindService;
            if (zBindService) {
                aVar.f41192e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f41188a);
                this.f41183B.unbindService(this);
            }
            return aVar.f41189b;
        }

        private void b(a aVar) {
            if (aVar.f41189b) {
                this.f41183B.unbindService(this);
                aVar.f41189b = false;
            }
            aVar.f41190c = null;
        }

        private void c(e eVar) {
            j();
            for (a aVar : this.f41186E.values()) {
                aVar.f41191d.add(eVar);
                g(aVar);
            }
        }

        private void d(ComponentName componentName) {
            a aVar = this.f41186E.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        private void e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.f41186E.get(componentName);
            if (aVar != null) {
                aVar.f41190c = InterfaceC2194a.AbstractBinderC0418a.c(iBinder);
                aVar.f41192e = 0;
                g(aVar);
            }
        }

        private void f(ComponentName componentName) {
            a aVar = this.f41186E.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        private void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f41188a + ", " + aVar.f41191d.size() + " queued tasks");
            }
            if (aVar.f41191d.isEmpty()) {
                return;
            }
            if (!a(aVar) || aVar.f41190c == null) {
                i(aVar);
                return;
            }
            while (true) {
                e eVarPeek = aVar.f41191d.peek();
                if (eVarPeek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + eVarPeek);
                    }
                    eVarPeek.a(aVar.f41190c);
                    aVar.f41191d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + aVar.f41188a);
                    }
                } catch (RemoteException e10) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f41188a, e10);
                }
            }
            if (aVar.f41191d.isEmpty()) {
                return;
            }
            i(aVar);
        }

        private void i(a aVar) {
            if (this.f41185D.hasMessages(3, aVar.f41188a)) {
                return;
            }
            int i10 = aVar.f41192e;
            int i11 = i10 + 1;
            aVar.f41192e = i11;
            if (i11 <= 6) {
                int i12 = (1 << i10) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i12 + " ms");
                }
                this.f41185D.sendMessageDelayed(this.f41185D.obtainMessage(3, aVar.f41188a), i12);
                return;
            }
            Log.w("NotifManCompat", "Giving up on delivering " + aVar.f41191d.size() + " tasks to " + aVar.f41188a + " after " + aVar.f41192e + " retries");
            aVar.f41191d.clear();
        }

        private void j() {
            Set<String> setE = q.e(this.f41183B);
            if (setE.equals(this.f41187F)) {
                return;
            }
            this.f41187F = setE;
            List<ResolveInfo> listQueryIntentServices = this.f41183B.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (setE.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f41186E.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    this.f41186E.put(componentName2, new a(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, a>> it = this.f41186E.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ComponentName, a> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + next.getKey());
                    }
                    b(next.getValue());
                    it.remove();
                }
            }
        }

        public void h(e eVar) {
            this.f41185D.obtainMessage(0, eVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c((e) message.obj);
                return true;
            }
            if (i10 == 1) {
                c cVar = (c) message.obj;
                e(cVar.f41181a, cVar.f41182b);
                return true;
            }
            if (i10 == 2) {
                f((ComponentName) message.obj);
                return true;
            }
            if (i10 != 3) {
                return false;
            }
            d((ComponentName) message.obj);
            return true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f41185D.obtainMessage(1, new c(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f41185D.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    private interface e {
        void a(InterfaceC2194a interfaceC2194a);
    }

    private q(Context context) {
        this.f41175a = context;
        this.f41176b = (NotificationManager) context.getSystemService("notification");
    }

    public static q d(Context context) {
        return new q(context);
    }

    public static Set<String> e(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f41170c) {
            if (string != null) {
                try {
                    if (!string.equals(f41171d)) {
                        String[] strArrSplit = string.split(":", -1);
                        HashSet hashSet = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet.add(componentNameUnflattenFromString.getPackageName());
                            }
                        }
                        f41172e = hashSet;
                        f41171d = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            set = f41172e;
        }
        return set;
    }

    private void h(e eVar) {
        synchronized (f41173f) {
            try {
                if (f41174g == null) {
                    f41174g = new d(this.f41175a.getApplicationContext());
                }
                f41174g.h(eVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean i(Notification notification) {
        Bundle bundleA = m.a(notification);
        return bundleA != null && bundleA.getBoolean("android.support.useSideChannel");
    }

    public boolean a() {
        return a.a(this.f41176b);
    }

    public void b(int i10) {
        c(null, i10);
    }

    public void c(String str, int i10) {
        this.f41176b.cancel(str, i10);
    }

    public void f(int i10, Notification notification) {
        g(null, i10, notification);
    }

    public void g(String str, int i10, Notification notification) {
        if (!i(notification)) {
            this.f41176b.notify(str, i10, notification);
        } else {
            h(new b(this.f41175a.getPackageName(), i10, str, notification));
            this.f41176b.cancel(str, i10);
        }
    }
}
