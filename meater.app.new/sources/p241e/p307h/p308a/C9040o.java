package p241e.p307h.p308a;

import android.os.IBinder;
import android.os.RemoteException;
import com.liulishuo.filedownloader.message.C8694b;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.services.AbstractServiceConnectionC8701a;
import com.liulishuo.filedownloader.services.FileDownloadService;
import p241e.p307h.p308a.p313i0.InterfaceC9025a;
import p241e.p307h.p308a.p313i0.InterfaceC9026b;
import p241e.p307h.p308a.p315k0.C9031a;

/* compiled from: FileDownloadServiceUIGuard.java */
/* renamed from: e.h.a.o */
/* loaded from: classes2.dex */
class C9040o extends AbstractServiceConnectionC8701a<a, InterfaceC9026b> {

    /* compiled from: FileDownloadServiceUIGuard.java */
    /* renamed from: e.h.a.o$a */
    protected static class a extends InterfaceC9025a.a {
        protected a() {
        }

        @Override // p241e.p307h.p308a.p313i0.InterfaceC9025a
        /* renamed from: D4 */
        public void mo28910D4(MessageSnapshot messageSnapshot) throws RemoteException {
            C8694b.m27535a().m27536b(messageSnapshot);
        }
    }

    C9040o() {
        super(FileDownloadService.SeparateProcessService.class);
    }

    @Override // p241e.p307h.p308a.InterfaceC9046u
    /* renamed from: Q */
    public byte mo29030Q(int i2) {
        if (!isConnected()) {
            return C9031a.m28948b(i2);
        }
        try {
            return m27607d().mo27633Q(i2);
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return (byte) 0;
        }
    }

    @Override // p241e.p307h.p308a.InterfaceC9046u
    /* renamed from: S */
    public boolean mo29031S(String str, String str2, boolean z, int i2, int i3, int i4, boolean z2, FileDownloadHeader fileDownloadHeader, boolean z3) {
        if (!isConnected()) {
            return C9031a.m28951e(str, str2, z);
        }
        try {
            m27607d().mo27634S(str, str2, z, i2, i3, i4, z2, fileDownloadHeader, z3);
            return true;
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // p241e.p307h.p308a.InterfaceC9046u
    /* renamed from: a0 */
    public boolean mo29032a0(int i2) {
        if (!isConnected()) {
            return C9031a.m28950d(i2);
        }
        try {
            return m27607d().mo27639a0(i2);
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.liulishuo.filedownloader.services.AbstractServiceConnectionC8701a
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public InterfaceC9026b mo27604a(IBinder iBinder) {
        return InterfaceC9026b.a.m28912E0(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.liulishuo.filedownloader.services.AbstractServiceConnectionC8701a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public a mo27606c() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.liulishuo.filedownloader.services.AbstractServiceConnectionC8701a
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo27608e(InterfaceC9026b interfaceC9026b, a aVar) throws RemoteException {
        interfaceC9026b.mo27646v1(aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.liulishuo.filedownloader.services.AbstractServiceConnectionC8701a
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo27609g(InterfaceC9026b interfaceC9026b, a aVar) throws RemoteException {
        interfaceC9026b.mo27635V4(aVar);
    }

    @Override // p241e.p307h.p308a.InterfaceC9046u
    /* renamed from: o0 */
    public boolean mo29033o0(int i2) {
        if (!isConnected()) {
            return C9031a.m28947a(i2);
        }
        try {
            return m27607d().mo27642o0(i2);
        } catch (RemoteException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // p241e.p307h.p308a.InterfaceC9046u
    /* renamed from: t0 */
    public void mo29034t0(boolean z) {
        if (!isConnected()) {
            C9031a.m28952f(z);
            return;
        }
        try {
            try {
                m27607d().mo27644t0(z);
            } catch (RemoteException e2) {
                e2.printStackTrace();
            }
        } finally {
            this.f33037i = false;
        }
    }
}
