package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.facebook.C5641a0;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;

/* compiled from: AttributionIdentifiers.kt */
/* renamed from: com.facebook.internal.q */
/* loaded from: classes2.dex */
public final class C5697q {

    /* renamed from: a */
    public static final a f14488a = new a(null);

    /* renamed from: b */
    private static final String f14489b = C5697q.class.getCanonicalName();

    /* renamed from: c */
    public static C5697q f14490c;

    /* renamed from: d */
    private String f14491d;

    /* renamed from: e */
    private long f14492e;

    /* renamed from: f */
    private String f14493f;

    /* renamed from: g */
    private String f14494g;

    /* renamed from: h */
    private boolean f14495h;

    /* compiled from: AttributionIdentifiers.kt */
    /* renamed from: com.facebook.internal.q$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9789g c9789g) {
            this();
        }

        /* renamed from: a */
        private final C5697q m11622a(C5697q c5697q) {
            c5697q.f14492e = System.currentTimeMillis();
            C5697q.f14490c = c5697q;
            return c5697q;
        }

        /* renamed from: b */
        private final C5697q m11623b(Context context) {
            C5697q c5697qM11624c = m11624c(context);
            if (c5697qM11624c != null) {
                return c5697qM11624c;
            }
            C5697q c5697qM11625d = m11625d(context);
            return c5697qM11625d == null ? new C5697q() : c5697qM11625d;
        }

        /* renamed from: c */
        private final C5697q m11624c(Context context) {
            Object objM11547R;
            try {
                if (!m11627g(context)) {
                    return null;
                }
                C5696p0 c5696p0 = C5696p0.f14478a;
                boolean zBooleanValue = false;
                Method methodM11540J = C5696p0.m11540J("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class);
                if (methodM11540J == null || (objM11547R = C5696p0.m11547R(null, methodM11540J, context)) == null) {
                    return null;
                }
                Method methodM11539I = C5696p0.m11539I(objM11547R.getClass(), "getId", new Class[0]);
                Method methodM11539I2 = C5696p0.m11539I(objM11547R.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                if (methodM11539I != null && methodM11539I2 != null) {
                    C5697q c5697q = new C5697q();
                    c5697q.f14491d = (String) C5696p0.m11547R(objM11547R, methodM11539I, new Object[0]);
                    Boolean bool = (Boolean) C5696p0.m11547R(objM11547R, methodM11539I2, new Object[0]);
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    }
                    c5697q.f14495h = zBooleanValue;
                    return c5697q;
                }
                return null;
            } catch (Exception e2) {
                C5696p0 c5696p02 = C5696p0.f14478a;
                C5696p0.m11573i0("android_id", e2);
                return null;
            }
        }

        /* renamed from: d */
        private final C5697q m11625d(Context context) {
            if (!m11627g(context)) {
                return null;
            }
            c cVar = new c();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                try {
                    if (context.bindService(intent, cVar, 1)) {
                        b bVar = new b(cVar.m11632a());
                        C5697q c5697q = new C5697q();
                        c5697q.f14491d = bVar.m11630H();
                        c5697q.f14495h = bVar.m11631P();
                        return c5697q;
                    }
                } catch (Exception e2) {
                    C5696p0 c5696p0 = C5696p0.f14478a;
                    C5696p0.m11573i0("android_id", e2);
                } finally {
                    context.unbindService(cVar);
                }
            } catch (SecurityException unused) {
            }
            return null;
        }

        /* renamed from: f */
        private final String m11626f(Context context) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return packageManager.getInstallerPackageName(context.getPackageName());
        }

        /* renamed from: g */
        private final boolean m11627g(Context context) throws ClassNotFoundException {
            C5696p0 c5696p0 = C5696p0.f14478a;
            Method methodM11540J = C5696p0.m11540J("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
            if (methodM11540J == null) {
                return false;
            }
            Object objM11547R = C5696p0.m11547R(null, methodM11540J, context);
            return (objM11547R instanceof Integer) && C9801m.m32341a(objM11547R, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008b A[Catch: all -> 0x00fc, Exception -> 0x00fe, TryCatch #4 {Exception -> 0x00fe, all -> 0x00fc, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:10:0x0033, B:12:0x0055, B:14:0x0064, B:21:0x0085, B:23:0x008b, B:25:0x0090, B:27:0x0095, B:17:0x006e, B:19:0x007d, B:49:0x00f4, B:50:0x00fb), top: B:71:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0090 A[Catch: all -> 0x00fc, Exception -> 0x00fe, TryCatch #4 {Exception -> 0x00fe, all -> 0x00fc, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:10:0x0033, B:12:0x0055, B:14:0x0064, B:21:0x0085, B:23:0x008b, B:25:0x0090, B:27:0x0095, B:17:0x006e, B:19:0x007d, B:49:0x00f4, B:50:0x00fb), top: B:71:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0095 A[Catch: all -> 0x00fc, Exception -> 0x00fe, TRY_LEAVE, TryCatch #4 {Exception -> 0x00fe, all -> 0x00fc, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:10:0x0033, B:12:0x0055, B:14:0x0064, B:21:0x0085, B:23:0x008b, B:25:0x0090, B:27:0x0095, B:17:0x006e, B:19:0x007d, B:49:0x00f4, B:50:0x00fb), top: B:71:0x0010 }] */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.facebook.internal.C5697q m11628e(android.content.Context r14) {
            /*
                Method dump skipped, instructions count: 289
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C5697q.a.m11628e(android.content.Context):com.facebook.internal.q");
        }

        /* renamed from: h */
        public final boolean m11629h(Context context) {
            C9801m.m32346f(context, "context");
            C5697q c5697qM11628e = m11628e(context);
            return c5697qM11628e != null && c5697qM11628e.m11621k();
        }
    }

    /* compiled from: AttributionIdentifiers.kt */
    /* renamed from: com.facebook.internal.q$b */
    private static final class b implements IInterface {

        /* renamed from: f */
        public static final a f14496f = new a(null);

        /* renamed from: g */
        private final IBinder f14497g;

        /* compiled from: AttributionIdentifiers.kt */
        /* renamed from: com.facebook.internal.q$b$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(C9789g c9789g) {
                this();
            }
        }

        public b(IBinder iBinder) {
            C9801m.m32346f(iBinder, "binder");
            this.f14497g = iBinder;
        }

        /* renamed from: H */
        public final String m11630H() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            C9801m.m32345e(parcelObtain, "obtain()");
            Parcel parcelObtain2 = Parcel.obtain();
            C9801m.m32345e(parcelObtain2, "obtain()");
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f14497g.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        /* renamed from: P */
        public final boolean m11631P() throws RemoteException {
            Parcel parcelObtain = Parcel.obtain();
            C9801m.m32345e(parcelObtain, "obtain()");
            Parcel parcelObtain2 = Parcel.obtain();
            C9801m.m32345e(parcelObtain2, "obtain()");
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(1);
                this.f14497g.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f14497g;
        }
    }

    /* compiled from: AttributionIdentifiers.kt */
    /* renamed from: com.facebook.internal.q$c */
    private static final class c implements ServiceConnection {

        /* renamed from: f */
        private final AtomicBoolean f14498f = new AtomicBoolean(false);

        /* renamed from: g */
        private final BlockingQueue<IBinder> f14499g = new LinkedBlockingDeque();

        /* renamed from: a */
        public final IBinder m11632a() throws InterruptedException {
            if (!(!this.f14498f.compareAndSet(true, true))) {
                throw new IllegalStateException("Binder already consumed".toString());
            }
            IBinder iBinderTake = this.f14499g.take();
            C9801m.m32345e(iBinderTake, "queue.take()");
            return iBinderTake;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) throws InterruptedException {
            if (iBinder != null) {
                try {
                    this.f14499g.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: h */
    public final String m11618h() {
        C5641a0 c5641a0 = C5641a0.f14199a;
        if (C5641a0.m11304w() && C5641a0.m11283b()) {
            return this.f14491d;
        }
        return null;
    }

    /* renamed from: i */
    public final String m11619i() {
        return this.f14494g;
    }

    /* renamed from: j */
    public final String m11620j() {
        return this.f14493f;
    }

    /* renamed from: k */
    public final boolean m11621k() {
        return this.f14495h;
    }
}
