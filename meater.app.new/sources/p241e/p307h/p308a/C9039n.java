package p241e.p307h.p308a;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.services.BinderC8705e;
import com.liulishuo.filedownloader.services.FileDownloadService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p241e.p307h.p308a.p312h0.C9021b;
import p241e.p307h.p308a.p315k0.C9031a;
import p241e.p307h.p308a.p315k0.C9034d;
import p241e.p307h.p308a.p315k0.C9036f;

/* compiled from: FileDownloadServiceSharedTransmit.java */
/* renamed from: e.h.a.n */
/* loaded from: classes2.dex */
class C9039n implements InterfaceC9046u, BinderC8705e.a {

    /* renamed from: f */
    private static final Class<?> f34838f = FileDownloadService.SharedMainProcessService.class;

    /* renamed from: g */
    private boolean f34839g = false;

    /* renamed from: h */
    private final ArrayList<Runnable> f34840h = new ArrayList<>();

    /* renamed from: i */
    private BinderC8705e f34841i;

    C9039n() {
    }

    @Override // p241e.p307h.p308a.InterfaceC9046u
    /* renamed from: Q */
    public byte mo29030Q(int i2) {
        return !isConnected() ? C9031a.m28948b(i2) : this.f34841i.mo27633Q(i2);
    }

    @Override // p241e.p307h.p308a.InterfaceC9046u
    /* renamed from: S */
    public boolean mo29031S(String str, String str2, boolean z, int i2, int i3, int i4, boolean z2, FileDownloadHeader fileDownloadHeader, boolean z3) {
        if (!isConnected()) {
            return C9031a.m28951e(str, str2, z);
        }
        this.f34841i.mo27634S(str, str2, z, i2, i3, i4, z2, fileDownloadHeader, z3);
        return true;
    }

    @Override // com.liulishuo.filedownloader.services.BinderC8705e.a
    /* renamed from: a */
    public void mo27647a(BinderC8705e binderC8705e) {
        this.f34841i = binderC8705e;
        List list = (List) this.f34840h.clone();
        this.f34840h.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        C9004f.m28724e().m28906b(new C9021b(C9021b.a.connected, f34838f));
    }

    @Override // p241e.p307h.p308a.InterfaceC9046u
    /* renamed from: a0 */
    public boolean mo29032a0(int i2) {
        return !isConnected() ? C9031a.m28950d(i2) : this.f34841i.mo27639a0(i2);
    }

    /* renamed from: b */
    public void m29036b(Context context, Runnable runnable) {
        if (runnable != null && !this.f34840h.contains(runnable)) {
            this.f34840h.add(runnable);
        }
        Intent intent = new Intent(context, f34838f);
        boolean zM28989P = C9036f.m28989P(context);
        this.f34839g = zM28989P;
        intent.putExtra("is_foreground", zM28989P);
        if (!this.f34839g) {
            context.startService(intent);
            return;
        }
        if (C9034d.f34819a) {
            C9034d.m28962a(this, "start foreground service", new Object[0]);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        }
    }

    @Override // p241e.p307h.p308a.InterfaceC9046u
    public boolean isConnected() {
        return this.f34841i != null;
    }

    @Override // p241e.p307h.p308a.InterfaceC9046u
    /* renamed from: o0 */
    public boolean mo29033o0(int i2) {
        return !isConnected() ? C9031a.m28947a(i2) : this.f34841i.mo27642o0(i2);
    }

    @Override // p241e.p307h.p308a.InterfaceC9046u
    /* renamed from: t0 */
    public void mo29034t0(boolean z) {
        if (!isConnected()) {
            C9031a.m28952f(z);
        } else {
            this.f34841i.mo27644t0(z);
            this.f34839g = false;
        }
    }

    @Override // p241e.p307h.p308a.InterfaceC9046u
    /* renamed from: u0 */
    public void mo27610u0(Context context) {
        m29036b(context, null);
    }

    @Override // p241e.p307h.p308a.InterfaceC9046u
    /* renamed from: v0 */
    public boolean mo27611v0() {
        return this.f34839g;
    }
}
