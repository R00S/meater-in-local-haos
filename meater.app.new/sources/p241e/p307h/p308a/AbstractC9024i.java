package p241e.p307h.p308a;

import p241e.p307h.p308a.p315k0.C9034d;

/* compiled from: FileDownloadListener.java */
/* renamed from: e.h.a.i */
/* loaded from: classes2.dex */
public abstract class AbstractC9024i {
    public AbstractC9024i() {
    }

    protected void blockComplete(InterfaceC8991a interfaceC8991a) throws Throwable {
    }

    protected abstract void completed(InterfaceC8991a interfaceC8991a);

    protected abstract void connected(InterfaceC8991a interfaceC8991a, String str, boolean z, int i2, int i3);

    protected abstract void error(InterfaceC8991a interfaceC8991a, Throwable th);

    protected boolean isInvalid() {
        return false;
    }

    protected abstract void paused(InterfaceC8991a interfaceC8991a, int i2, int i3);

    protected abstract void pending(InterfaceC8991a interfaceC8991a, int i2, int i3);

    protected abstract void progress(InterfaceC8991a interfaceC8991a, int i2, int i3);

    protected abstract void retry(InterfaceC8991a interfaceC8991a, Throwable th, int i2, int i3);

    protected void started(InterfaceC8991a interfaceC8991a) {
    }

    protected abstract void warn(InterfaceC8991a interfaceC8991a);

    public AbstractC9024i(int i2) {
        C9034d.m28970i(this, "not handle priority any more", new Object[0]);
    }
}
