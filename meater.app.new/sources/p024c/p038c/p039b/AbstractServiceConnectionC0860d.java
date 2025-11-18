package p024c.p038c.p039b;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import p019b.p022b.p023a.InterfaceC0822b;

/* compiled from: CustomTabsServiceConnection.java */
/* renamed from: c.c.b.d */
/* loaded from: classes.dex */
public abstract class AbstractServiceConnectionC0860d implements ServiceConnection {

    /* compiled from: CustomTabsServiceConnection.java */
    /* renamed from: c.c.b.d$a */
    class a extends C0858b {
        a(InterfaceC0822b interfaceC0822b, ComponentName componentName) {
            super(interfaceC0822b, componentName);
        }
    }

    /* renamed from: a */
    public abstract void mo5396a(ComponentName componentName, C0858b c0858b);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        mo5396a(componentName, new a(InterfaceC0822b.a.m5258H(iBinder), componentName));
    }
}
