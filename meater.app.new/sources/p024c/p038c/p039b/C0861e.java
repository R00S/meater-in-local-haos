package p024c.p038c.p039b;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;
import p019b.p022b.p023a.InterfaceC0821a;
import p019b.p022b.p023a.InterfaceC0822b;

/* compiled from: CustomTabsSession.java */
/* renamed from: c.c.b.e */
/* loaded from: classes.dex */
public final class C0861e {

    /* renamed from: a */
    private final Object f5683a = new Object();

    /* renamed from: b */
    private final InterfaceC0822b f5684b;

    /* renamed from: c */
    private final InterfaceC0821a f5685c;

    /* renamed from: d */
    private final ComponentName f5686d;

    C0861e(InterfaceC0822b interfaceC0822b, InterfaceC0821a interfaceC0821a, ComponentName componentName) {
        this.f5684b = interfaceC0822b;
        this.f5685c = interfaceC0821a;
        this.f5686d = componentName;
    }

    /* renamed from: a */
    IBinder m5406a() {
        return this.f5685c.asBinder();
    }

    /* renamed from: b */
    ComponentName m5407b() {
        return this.f5686d;
    }

    /* renamed from: c */
    public boolean m5408c(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.f5684b.mo5256q1(this.f5685c, uri, bundle, list);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
