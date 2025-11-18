package X1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: NetworkTypeObserver.java */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    private static s f18692e;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f18693a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<WeakReference<c>> f18694b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final Object f18695c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private int f18696d = 0;

    /* compiled from: NetworkTypeObserver.java */
    private static final class b {

        /* compiled from: NetworkTypeObserver.java */
        private static final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* renamed from: a, reason: collision with root package name */
            private final s f18697a;

            public a(s sVar) {
                this.f18697a = sVar;
            }

            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.f18697a.k(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        public static void a(Context context, s sVar) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) C1804a.e((TelephonyManager) context.getSystemService("phone"));
                a aVar = new a(sVar);
                telephonyManager.registerTelephonyCallback(context.getMainExecutor(), aVar);
                telephonyManager.unregisterTelephonyCallback(aVar);
            } catch (RuntimeException unused) {
                sVar.k(5);
            }
        }
    }

    /* compiled from: NetworkTypeObserver.java */
    public interface c {
        void a(int i10);
    }

    /* compiled from: NetworkTypeObserver.java */
    private final class d extends BroadcastReceiver {
        private d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int iG = s.g(context);
            if (L.f18626a < 31 || iG != 5) {
                s.this.k(iG);
            } else {
                b.a(context, s.this);
            }
        }
    }

    private s(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new d(), intentFilter);
    }

    public static synchronized s d(Context context) {
        try {
            if (f18692e == null) {
                f18692e = new s(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f18692e;
    }

    private static int e(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case C9.h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case C9.h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case C9.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 14:
            case 15:
            case 17:
                return 4;
            case C9.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return L.f18626a >= 29 ? 9 : 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int g(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i10 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i10 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return e(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(c cVar) {
        cVar.a(f());
    }

    private void j() {
        Iterator<WeakReference<c>> it = this.f18694b.iterator();
        while (it.hasNext()) {
            WeakReference<c> next = it.next();
            if (next.get() == null) {
                this.f18694b.remove(next);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(int i10) {
        synchronized (this.f18695c) {
            try {
                if (this.f18696d == i10) {
                    return;
                }
                this.f18696d = i10;
                Iterator<WeakReference<c>> it = this.f18694b.iterator();
                while (it.hasNext()) {
                    WeakReference<c> next = it.next();
                    c cVar = next.get();
                    if (cVar != null) {
                        cVar.a(i10);
                    } else {
                        this.f18694b.remove(next);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int f() {
        int i10;
        synchronized (this.f18695c) {
            i10 = this.f18696d;
        }
        return i10;
    }

    public void i(final c cVar) {
        j();
        this.f18694b.add(new WeakReference<>(cVar));
        this.f18693a.post(new Runnable() { // from class: X1.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f18690B.h(cVar);
            }
        });
    }
}
