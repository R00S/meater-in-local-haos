package androidx.core.app;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.v4.app.InterfaceC0001a;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: NotificationManagerCompat.java */
/* renamed from: androidx.core.app.l */
/* loaded from: classes.dex */
public final class C0248l {

    /* renamed from: b */
    private static String f2154b;

    /* renamed from: e */
    private static c f2157e;

    /* renamed from: f */
    private final Context f2158f;

    /* renamed from: g */
    private final NotificationManager f2159g;

    /* renamed from: a */
    private static final Object f2153a = new Object();

    /* renamed from: c */
    private static Set<String> f2155c = new HashSet();

    /* renamed from: d */
    private static final Object f2156d = new Object();

    /* compiled from: NotificationManagerCompat.java */
    /* renamed from: androidx.core.app.l$a */
    private static class a implements d {

        /* renamed from: a */
        final String f2160a;

        /* renamed from: b */
        final int f2161b;

        /* renamed from: c */
        final String f2162c;

        /* renamed from: d */
        final Notification f2163d;

        a(String str, int i2, String str2, Notification notification) {
            this.f2160a = str;
            this.f2161b = i2;
            this.f2162c = str2;
            this.f2163d = notification;
        }

        @Override // androidx.core.app.C0248l.d
        /* renamed from: a */
        public void mo1635a(InterfaceC0001a interfaceC0001a) throws RemoteException {
            interfaceC0001a.mo2F6(this.f2160a, this.f2161b, this.f2162c, this.f2163d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f2160a + ", id:" + this.f2161b + ", tag:" + this.f2162c + "]";
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    /* renamed from: androidx.core.app.l$b */
    private static class b {

        /* renamed from: a */
        final ComponentName f2164a;

        /* renamed from: b */
        final IBinder f2165b;

        b(ComponentName componentName, IBinder iBinder) {
            this.f2164a = componentName;
            this.f2165b = iBinder;
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    /* renamed from: androidx.core.app.l$c */
    private static class c implements Handler.Callback, ServiceConnection {

        /* renamed from: f */
        private final Context f2166f;

        /* renamed from: g */
        private final HandlerThread f2167g;

        /* renamed from: h */
        private final Handler f2168h;

        /* renamed from: i */
        private final Map<ComponentName, a> f2169i = new HashMap();

        /* renamed from: j */
        private Set<String> f2170j = new HashSet();

        /* compiled from: NotificationManagerCompat.java */
        /* renamed from: androidx.core.app.l$c$a */
        private static class a {

            /* renamed from: a */
            final ComponentName f2171a;

            /* renamed from: c */
            InterfaceC0001a f2173c;

            /* renamed from: b */
            boolean f2172b = false;

            /* renamed from: d */
            ArrayDeque<d> f2174d = new ArrayDeque<>();

            /* renamed from: e */
            int f2175e = 0;

            a(ComponentName componentName) {
                this.f2171a = componentName;
            }
        }

        c(Context context) {
            this.f2166f = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f2167g = handlerThread;
            handlerThread.start();
            this.f2168h = new Handler(handlerThread.getLooper(), this);
        }

        /* renamed from: a */
        private boolean m1636a(a aVar) {
            if (aVar.f2172b) {
                return true;
            }
            boolean zBindService = this.f2166f.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f2171a), this, 33);
            aVar.f2172b = zBindService;
            if (zBindService) {
                aVar.f2175e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f2171a);
                this.f2166f.unbindService(this);
            }
            return aVar.f2172b;
        }

        /* renamed from: b */
        private void m1637b(a aVar) {
            if (aVar.f2172b) {
                this.f2166f.unbindService(this);
                aVar.f2172b = false;
            }
            aVar.f2173c = null;
        }

        /* renamed from: c */
        private void m1638c(d dVar) {
            m1644j();
            for (a aVar : this.f2169i.values()) {
                aVar.f2174d.add(dVar);
                m1642g(aVar);
            }
        }

        /* renamed from: d */
        private void m1639d(ComponentName componentName) {
            a aVar = this.f2169i.get(componentName);
            if (aVar != null) {
                m1642g(aVar);
            }
        }

        /* renamed from: e */
        private void m1640e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.f2169i.get(componentName);
            if (aVar != null) {
                aVar.f2173c = InterfaceC0001a.a.m3H(iBinder);
                aVar.f2175e = 0;
                m1642g(aVar);
            }
        }

        /* renamed from: f */
        private void m1641f(ComponentName componentName) {
            a aVar = this.f2169i.get(componentName);
            if (aVar != null) {
                m1637b(aVar);
            }
        }

        /* renamed from: g */
        private void m1642g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f2171a + ", " + aVar.f2174d.size() + " queued tasks");
            }
            if (aVar.f2174d.isEmpty()) {
                return;
            }
            if (!m1636a(aVar) || aVar.f2173c == null) {
                m1643i(aVar);
                return;
            }
            while (true) {
                d dVarPeek = aVar.f2174d.peek();
                if (dVarPeek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + dVarPeek);
                    }
                    dVarPeek.mo1635a(aVar.f2173c);
                    aVar.f2174d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + aVar.f2171a);
                    }
                } catch (RemoteException e2) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f2171a, e2);
                }
            }
            if (aVar.f2174d.isEmpty()) {
                return;
            }
            m1643i(aVar);
        }

        /* renamed from: i */
        private void m1643i(a aVar) {
            if (this.f2168h.hasMessages(3, aVar.f2171a)) {
                return;
            }
            int i2 = aVar.f2175e + 1;
            aVar.f2175e = i2;
            if (i2 <= 6) {
                int i3 = (1 << (i2 - 1)) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i3 + " ms");
                }
                this.f2168h.sendMessageDelayed(this.f2168h.obtainMessage(3, aVar.f2171a), i3);
                return;
            }
            Log.w("NotifManCompat", "Giving up on delivering " + aVar.f2174d.size() + " tasks to " + aVar.f2171a + " after " + aVar.f2175e + " retries");
            aVar.f2174d.clear();
        }

        /* renamed from: j */
        private void m1644j() {
            Set<String> setM1629c = C0248l.m1629c(this.f2166f);
            if (setM1629c.equals(this.f2170j)) {
                return;
            }
            this.f2170j = setM1629c;
            List<ResolveInfo> listQueryIntentServices = this.f2166f.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (setM1629c.contains(resolveInfo.serviceInfo.packageName)) {
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
                if (!this.f2169i.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    this.f2169i.put(componentName2, new a(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, a>> it = this.f2169i.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ComponentName, a> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + next.getKey());
                    }
                    m1637b(next.getValue());
                    it.remove();
                }
            }
        }

        /* renamed from: h */
        public void m1645h(d dVar) {
            this.f2168h.obtainMessage(0, dVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                m1638c((d) message.obj);
                return true;
            }
            if (i2 == 1) {
                b bVar = (b) message.obj;
                m1640e(bVar.f2164a, bVar.f2165b);
                return true;
            }
            if (i2 == 2) {
                m1641f((ComponentName) message.obj);
                return true;
            }
            if (i2 != 3) {
                return false;
            }
            m1639d((ComponentName) message.obj);
            return true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f2168h.obtainMessage(1, new b(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f2168h.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    /* renamed from: androidx.core.app.l$d */
    private interface d {
        /* renamed from: a */
        void mo1635a(InterfaceC0001a interfaceC0001a) throws RemoteException;
    }

    private C0248l(Context context) {
        this.f2158f = context;
        this.f2159g = (NotificationManager) context.getSystemService("notification");
    }

    /* renamed from: b */
    public static C0248l m1628b(Context context) {
        return new C0248l(context);
    }

    /* renamed from: c */
    public static Set<String> m1629c(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f2153a) {
            if (string != null) {
                if (!string.equals(f2154b)) {
                    String[] strArrSplit = string.split(":", -1);
                    HashSet hashSet = new HashSet(strArrSplit.length);
                    for (String str : strArrSplit) {
                        ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                        if (componentNameUnflattenFromString != null) {
                            hashSet.add(componentNameUnflattenFromString.getPackageName());
                        }
                    }
                    f2155c = hashSet;
                    f2154b = string;
                }
                set = f2155c;
            } else {
                set = f2155c;
            }
        }
        return set;
    }

    /* renamed from: f */
    private void m1630f(d dVar) {
        synchronized (f2156d) {
            if (f2157e == null) {
                f2157e = new c(this.f2158f.getApplicationContext());
            }
            f2157e.m1645h(dVar);
        }
    }

    /* renamed from: g */
    private static boolean m1631g(Notification notification) {
        Bundle bundleM1557a = C0245i.m1557a(notification);
        return bundleM1557a != null && bundleM1557a.getBoolean("android.support.useSideChannel");
    }

    /* renamed from: a */
    public boolean m1632a() throws ClassNotFoundException {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            return this.f2159g.areNotificationsEnabled();
        }
        if (i2 < 19) {
            return true;
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f2158f.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f2158f.getApplicationInfo();
        String packageName = this.f2158f.getApplicationContext().getPackageName();
        int i3 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i3), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    /* renamed from: d */
    public void m1633d(int i2, Notification notification) {
        m1634e(null, i2, notification);
    }

    /* renamed from: e */
    public void m1634e(String str, int i2, Notification notification) {
        if (!m1631g(notification)) {
            this.f2159g.notify(str, i2, notification);
        } else {
            m1630f(new a(this.f2158f.getPackageName(), i2, str, notification));
            this.f2159g.cancel(str, i2);
        }
    }
}
