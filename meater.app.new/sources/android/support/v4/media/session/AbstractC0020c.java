package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.C0022e;
import android.support.v4.media.session.InterfaceC0018a;
import android.support.v4.media.session.MediaSessionCompat;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: MediaControllerCompat.java */
/* renamed from: android.support.v4.media.session.c */
/* loaded from: classes.dex */
public abstract class AbstractC0020c implements IBinder.DeathRecipient {

    /* renamed from: a */
    final Object f66a;

    /* renamed from: b */
    a f67b;

    /* renamed from: c */
    InterfaceC0018a f68c;

    /* compiled from: MediaControllerCompat.java */
    /* renamed from: android.support.v4.media.session.c$a */
    private class a extends Handler {
    }

    /* compiled from: MediaControllerCompat.java */
    /* renamed from: android.support.v4.media.session.c$b */
    private static class b implements C0022e.a {

        /* renamed from: a */
        private final WeakReference<AbstractC0020c> f69a;

        b(AbstractC0020c abstractC0020c) {
            this.f69a = new WeakReference<>(abstractC0020c);
        }

        @Override // android.support.v4.media.session.C0022e.a
        /* renamed from: Z */
        public void mo92Z(Bundle bundle) {
            AbstractC0020c abstractC0020c = this.f69a.get();
            if (abstractC0020c != null) {
                abstractC0020c.m84b(bundle);
            }
        }

        @Override // android.support.v4.media.session.C0022e.a
        /* renamed from: a */
        public void mo93a(Object obj) {
            AbstractC0020c abstractC0020c = this.f69a.get();
            if (abstractC0020c != null) {
                abstractC0020c.m85c(MediaMetadataCompat.m21a(obj));
            }
        }

        @Override // android.support.v4.media.session.C0022e.a
        /* renamed from: b */
        public void mo94b(int i2, int i3, int i4, int i5, int i6) {
            AbstractC0020c abstractC0020c = this.f69a.get();
            if (abstractC0020c != null) {
                abstractC0020c.m83a(new C0021d(i2, i3, i4, i5, i6));
            }
        }

        @Override // android.support.v4.media.session.C0022e.a
        /* renamed from: b0 */
        public void mo95b0(List<?> list) {
            AbstractC0020c abstractC0020c = this.f69a.get();
            if (abstractC0020c != null) {
                abstractC0020c.m87e(MediaSessionCompat.QueueItem.m56b(list));
            }
        }

        @Override // android.support.v4.media.session.C0022e.a
        /* renamed from: c */
        public void mo96c(Object obj) {
            AbstractC0020c abstractC0020c = this.f69a.get();
            if (abstractC0020c == null || abstractC0020c.f68c != null) {
                return;
            }
            abstractC0020c.m86d(PlaybackStateCompat.m68a(obj));
        }

        @Override // android.support.v4.media.session.C0022e.a
        /* renamed from: d */
        public void mo97d(String str, Bundle bundle) {
            AbstractC0020c abstractC0020c = this.f69a.get();
            if (abstractC0020c != null) {
                if (abstractC0020c.f68c == null || Build.VERSION.SDK_INT >= 23) {
                    abstractC0020c.m90h(str, bundle);
                }
            }
        }

        @Override // android.support.v4.media.session.C0022e.a
        /* renamed from: q0 */
        public void mo98q0(CharSequence charSequence) {
            AbstractC0020c abstractC0020c = this.f69a.get();
            if (abstractC0020c != null) {
                abstractC0020c.m88f(charSequence);
            }
        }

        @Override // android.support.v4.media.session.C0022e.a
        /* renamed from: r0 */
        public void mo99r0() {
            AbstractC0020c abstractC0020c = this.f69a.get();
            if (abstractC0020c != null) {
                abstractC0020c.m89g();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MediaControllerCompat.java */
    /* renamed from: android.support.v4.media.session.c$c */
    static class c extends InterfaceC0018a.a {

        /* renamed from: f */
        private final WeakReference<AbstractC0020c> f70f;

        c(AbstractC0020c abstractC0020c) {
            this.f70f = new WeakReference<>(abstractC0020c);
        }

        @Override // android.support.v4.media.session.InterfaceC0018a
        /* renamed from: A4 */
        public void mo74A4(int i2) throws RemoteException {
            AbstractC0020c abstractC0020c = this.f70f.get();
            if (abstractC0020c != null) {
                abstractC0020c.m91i(9, Integer.valueOf(i2), null);
            }
        }

        @Override // android.support.v4.media.session.InterfaceC0018a
        /* renamed from: J0 */
        public void mo75J0(String str, Bundle bundle) throws RemoteException {
            AbstractC0020c abstractC0020c = this.f70f.get();
            if (abstractC0020c != null) {
                abstractC0020c.m91i(1, str, bundle);
            }
        }

        @Override // android.support.v4.media.session.InterfaceC0018a
        /* renamed from: S3 */
        public void mo76S3(boolean z) throws RemoteException {
        }

        @Override // android.support.v4.media.session.InterfaceC0018a
        /* renamed from: U6 */
        public void mo77U6(PlaybackStateCompat playbackStateCompat) throws RemoteException {
            AbstractC0020c abstractC0020c = this.f70f.get();
            if (abstractC0020c != null) {
                abstractC0020c.m91i(2, playbackStateCompat, null);
            }
        }

        @Override // android.support.v4.media.session.InterfaceC0018a
        /* renamed from: V1 */
        public void mo78V1() throws RemoteException {
            AbstractC0020c abstractC0020c = this.f70f.get();
            if (abstractC0020c != null) {
                abstractC0020c.m91i(13, null, null);
            }
        }

        /* renamed from: Z */
        public void mo48Z(Bundle bundle) throws RemoteException {
            AbstractC0020c abstractC0020c = this.f70f.get();
            if (abstractC0020c != null) {
                abstractC0020c.m91i(7, bundle, null);
            }
        }

        /* renamed from: b0 */
        public void mo49b0(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
            AbstractC0020c abstractC0020c = this.f70f.get();
            if (abstractC0020c != null) {
                abstractC0020c.m91i(5, list, null);
            }
        }

        @Override // android.support.v4.media.session.InterfaceC0018a
        /* renamed from: c5 */
        public void mo79c5(int i2) throws RemoteException {
            AbstractC0020c abstractC0020c = this.f70f.get();
            if (abstractC0020c != null) {
                abstractC0020c.m91i(12, Integer.valueOf(i2), null);
            }
        }

        /* renamed from: g7 */
        public void mo50g7(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
            AbstractC0020c abstractC0020c = this.f70f.get();
            if (abstractC0020c != null) {
                abstractC0020c.m91i(4, parcelableVolumeInfo != null ? new C0021d(parcelableVolumeInfo.f43f, parcelableVolumeInfo.f44g, parcelableVolumeInfo.f45h, parcelableVolumeInfo.f46i, parcelableVolumeInfo.f47j) : null, null);
            }
        }

        /* renamed from: j4 */
        public void mo51j4(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
            AbstractC0020c abstractC0020c = this.f70f.get();
            if (abstractC0020c != null) {
                abstractC0020c.m91i(3, mediaMetadataCompat, null);
            }
        }

        @Override // android.support.v4.media.session.InterfaceC0018a
        /* renamed from: k3 */
        public void mo80k3(boolean z) throws RemoteException {
            AbstractC0020c abstractC0020c = this.f70f.get();
            if (abstractC0020c != null) {
                abstractC0020c.m91i(11, Boolean.valueOf(z), null);
            }
        }

        /* renamed from: q0 */
        public void mo52q0(CharSequence charSequence) throws RemoteException {
            AbstractC0020c abstractC0020c = this.f70f.get();
            if (abstractC0020c != null) {
                abstractC0020c.m91i(6, charSequence, null);
            }
        }

        /* renamed from: r0 */
        public void mo53r0() throws RemoteException {
            AbstractC0020c abstractC0020c = this.f70f.get();
            if (abstractC0020c != null) {
                abstractC0020c.m91i(8, null, null);
            }
        }
    }

    public AbstractC0020c() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f66a = C0022e.m100a(new b(this));
            return;
        }
        c cVar = new c(this);
        this.f68c = cVar;
        this.f66a = cVar;
    }

    /* renamed from: a */
    public void m83a(C0021d c0021d) {
    }

    /* renamed from: b */
    public void m84b(Bundle bundle) {
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        m91i(8, null, null);
    }

    /* renamed from: c */
    public void m85c(MediaMetadataCompat mediaMetadataCompat) {
    }

    /* renamed from: d */
    public void m86d(PlaybackStateCompat playbackStateCompat) {
    }

    /* renamed from: e */
    public void m87e(List<MediaSessionCompat.QueueItem> list) {
    }

    /* renamed from: f */
    public void m88f(CharSequence charSequence) {
    }

    /* renamed from: g */
    public void m89g() {
    }

    /* renamed from: h */
    public void m90h(String str, Bundle bundle) {
    }

    /* renamed from: i */
    void m91i(int i2, Object obj, Bundle bundle) {
        if (this.f67b != null) {
            throw null;
        }
    }
}
