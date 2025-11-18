package p024c.p038c.p039b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import p019b.p022b.p023a.InterfaceC0821a;
import p019b.p022b.p023a.InterfaceC0822b;

/* compiled from: CustomTabsClient.java */
/* renamed from: c.c.b.b */
/* loaded from: classes.dex */
public class C0858b {

    /* renamed from: a */
    private final InterfaceC0822b f5653a;

    /* renamed from: b */
    private final ComponentName f5654b;

    /* compiled from: CustomTabsClient.java */
    /* renamed from: c.c.b.b$a */
    static class a extends AbstractServiceConnectionC0860d {

        /* renamed from: f */
        final /* synthetic */ Context f5655f;

        a(Context context) {
            this.f5655f = context;
        }

        @Override // p024c.p038c.p039b.AbstractServiceConnectionC0860d
        /* renamed from: a */
        public final void mo5396a(ComponentName componentName, C0858b c0858b) {
            c0858b.m5395d(0L);
            this.f5655f.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* compiled from: CustomTabsClient.java */
    /* renamed from: c.c.b.b$b */
    class b extends InterfaceC0821a.a {

        /* renamed from: f */
        private Handler f5656f = new Handler(Looper.getMainLooper());

        /* renamed from: g */
        final /* synthetic */ C0857a f5657g;

        /* compiled from: CustomTabsClient.java */
        /* renamed from: c.c.b.b$b$a */
        class a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ int f5659f;

            /* renamed from: g */
            final /* synthetic */ Bundle f5660g;

            a(int i2, Bundle bundle) {
                this.f5659f = i2;
                this.f5660g = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0857a c0857a = b.this.f5657g;
                throw null;
            }
        }

        /* compiled from: CustomTabsClient.java */
        /* renamed from: c.c.b.b$b$b, reason: collision with other inner class name */
        class RunnableC11445b implements Runnable {

            /* renamed from: f */
            final /* synthetic */ String f5662f;

            /* renamed from: g */
            final /* synthetic */ Bundle f5663g;

            RunnableC11445b(String str, Bundle bundle) {
                this.f5662f = str;
                this.f5663g = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0857a c0857a = b.this.f5657g;
                throw null;
            }
        }

        /* compiled from: CustomTabsClient.java */
        /* renamed from: c.c.b.b$b$c */
        class c implements Runnable {

            /* renamed from: f */
            final /* synthetic */ Bundle f5665f;

            c(Bundle bundle) {
                this.f5665f = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0857a c0857a = b.this.f5657g;
                throw null;
            }
        }

        /* compiled from: CustomTabsClient.java */
        /* renamed from: c.c.b.b$b$d */
        class d implements Runnable {

            /* renamed from: f */
            final /* synthetic */ String f5667f;

            /* renamed from: g */
            final /* synthetic */ Bundle f5668g;

            d(String str, Bundle bundle) {
                this.f5667f = str;
                this.f5668g = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0857a c0857a = b.this.f5657g;
                throw null;
            }
        }

        /* compiled from: CustomTabsClient.java */
        /* renamed from: c.c.b.b$b$e */
        class e implements Runnable {

            /* renamed from: f */
            final /* synthetic */ int f5670f;

            /* renamed from: g */
            final /* synthetic */ Uri f5671g;

            /* renamed from: h */
            final /* synthetic */ boolean f5672h;

            /* renamed from: i */
            final /* synthetic */ Bundle f5673i;

            e(int i2, Uri uri, boolean z, Bundle bundle) {
                this.f5670f = i2;
                this.f5671g = uri;
                this.f5672h = z;
                this.f5673i = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0857a c0857a = b.this.f5657g;
                throw null;
            }
        }

        b(C0857a c0857a) {
        }

        @Override // p019b.p022b.p023a.InterfaceC0821a
        /* renamed from: B6 */
        public void mo5250B6(Bundle bundle) throws RemoteException {
            if (this.f5657g == null) {
                return;
            }
            this.f5656f.post(new c(bundle));
        }

        @Override // p019b.p022b.p023a.InterfaceC0821a
        /* renamed from: J6 */
        public void mo5251J6(int i2, Uri uri, boolean z, Bundle bundle) throws RemoteException {
            if (this.f5657g == null) {
                return;
            }
            this.f5656f.post(new e(i2, uri, z, bundle));
        }

        @Override // p019b.p022b.p023a.InterfaceC0821a
        /* renamed from: N4 */
        public void mo5252N4(String str, Bundle bundle) throws RemoteException {
            if (this.f5657g == null) {
                return;
            }
            this.f5656f.post(new RunnableC11445b(str, bundle));
        }

        @Override // p019b.p022b.p023a.InterfaceC0821a
        /* renamed from: q6 */
        public void mo5253q6(String str, Bundle bundle) throws RemoteException {
            if (this.f5657g == null) {
                return;
            }
            this.f5656f.post(new d(str, bundle));
        }

        @Override // p019b.p022b.p023a.InterfaceC0821a
        /* renamed from: r5 */
        public void mo5254r5(int i2, Bundle bundle) {
            if (this.f5657g == null) {
                return;
            }
            this.f5656f.post(new a(i2, bundle));
        }
    }

    C0858b(InterfaceC0822b interfaceC0822b, ComponentName componentName) {
        this.f5653a = interfaceC0822b;
        this.f5654b = componentName;
    }

    /* renamed from: a */
    public static boolean m5392a(Context context, String str, AbstractServiceConnectionC0860d abstractServiceConnectionC0860d) {
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, abstractServiceConnectionC0860d, 33);
    }

    /* renamed from: b */
    public static boolean m5393b(Context context, String str) {
        if (str == null) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            return m5392a(applicationContext, str, new a(applicationContext));
        } catch (SecurityException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public C0861e m5394c(C0857a c0857a) {
        b bVar = new b(c0857a);
        try {
            if (this.f5653a.mo5257x4(bVar)) {
                return new C0861e(this.f5653a, bVar, this.f5654b);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public boolean m5395d(long j2) {
        try {
            return this.f5653a.mo5255p3(j2);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
