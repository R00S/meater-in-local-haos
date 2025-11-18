package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import kotlin.jvm.internal.C9801m;

/* compiled from: PlatformServiceClient.kt */
/* renamed from: com.facebook.internal.l0 */
/* loaded from: classes2.dex */
public abstract class AbstractServiceConnectionC5688l0 implements ServiceConnection {

    /* renamed from: f */
    private final Context f14449f;

    /* renamed from: g */
    private final Handler f14450g;

    /* renamed from: h */
    private b f14451h;

    /* renamed from: i */
    private boolean f14452i;

    /* renamed from: j */
    private Messenger f14453j;

    /* renamed from: k */
    private final int f14454k;

    /* renamed from: l */
    private final int f14455l;

    /* renamed from: m */
    private final String f14456m;

    /* renamed from: n */
    private final int f14457n;

    /* renamed from: o */
    private final String f14458o;

    /* compiled from: PlatformServiceClient.kt */
    /* renamed from: com.facebook.internal.l0$a */
    public static final class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            C9801m.m32346f(message, "message");
            AbstractServiceConnectionC5688l0.this.m11503d(message);
        }
    }

    /* compiled from: PlatformServiceClient.kt */
    /* renamed from: com.facebook.internal.l0$b */
    public interface b {
        /* renamed from: a */
        void mo11507a(Bundle bundle);
    }

    public AbstractServiceConnectionC5688l0(Context context, int i2, int i3, int i4, String str, String str2) {
        C9801m.m32346f(context, "context");
        C9801m.m32346f(str, "applicationId");
        Context applicationContext = context.getApplicationContext();
        this.f14449f = applicationContext != null ? applicationContext : context;
        this.f14454k = i2;
        this.f14455l = i3;
        this.f14456m = str;
        this.f14457n = i4;
        this.f14458o = str2;
        this.f14450g = new a();
    }

    /* renamed from: a */
    private final void m11499a(Bundle bundle) {
        if (this.f14452i) {
            this.f14452i = false;
            b bVar = this.f14451h;
            if (bVar == null) {
                return;
            }
            bVar.mo11507a(bundle);
        }
    }

    /* renamed from: f */
    private final void m11500f() throws RemoteException {
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.f14456m);
        String str = this.f14458o;
        if (str != null) {
            bundle.putString("com.facebook.platform.extra.NONCE", str);
        }
        mo11504e(bundle);
        Message messageObtain = Message.obtain((Handler) null, this.f14454k);
        messageObtain.arg1 = this.f14457n;
        messageObtain.setData(bundle);
        messageObtain.replyTo = new Messenger(this.f14450g);
        try {
            Messenger messenger = this.f14453j;
            if (messenger == null) {
                return;
            }
            messenger.send(messageObtain);
        } catch (RemoteException unused) {
            m11499a(null);
        }
    }

    /* renamed from: b */
    public final void m11501b() {
        this.f14452i = false;
    }

    /* renamed from: c */
    protected final Context m11502c() {
        return this.f14449f;
    }

    /* renamed from: d */
    protected final void m11503d(Message message) {
        C9801m.m32346f(message, "message");
        if (message.what == this.f14455l) {
            Bundle data = message.getData();
            if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                m11499a(null);
            } else {
                m11499a(data);
            }
            try {
                this.f14449f.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* renamed from: e */
    protected abstract void mo11504e(Bundle bundle);

    /* renamed from: g */
    public final void m11505g(b bVar) {
        this.f14451h = bVar;
    }

    /* renamed from: h */
    public final boolean m11506h() {
        synchronized (this) {
            boolean z = false;
            if (this.f14452i) {
                return false;
            }
            C5686k0 c5686k0 = C5686k0.f14437a;
            if (C5686k0.m11476r(this.f14457n) == -1) {
                return false;
            }
            Intent intentM11469k = C5686k0.m11469k(m11502c());
            if (intentM11469k != null) {
                this.f14452i = true;
                m11502c().bindService(intentM11469k, this, 1);
                z = true;
            }
            return z;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) throws RemoteException {
        C9801m.m32346f(componentName, "name");
        C9801m.m32346f(iBinder, "service");
        this.f14453j = new Messenger(iBinder);
        m11500f();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        C9801m.m32346f(componentName, "name");
        this.f14453j = null;
        try {
            this.f14449f.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        m11499a(null);
    }
}
