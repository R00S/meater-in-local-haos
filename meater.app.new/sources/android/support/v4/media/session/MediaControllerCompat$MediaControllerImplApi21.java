package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.AbstractC0020c;
import android.support.v4.media.session.InterfaceC0019b;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.core.app.C0241e;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21 {

    /* renamed from: a */
    final Object f31a;

    /* renamed from: b */
    private final List<AbstractC0020c> f32b;

    /* renamed from: c */
    private HashMap<AbstractC0020c, BinderC0011a> f33c;

    /* renamed from: d */
    final MediaSessionCompat.Token f34d;

    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: f */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f35f;

        @Override // android.os.ResultReceiver
        protected void onReceiveResult(int i2, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.f35f.get();
            if (mediaControllerCompat$MediaControllerImplApi21 == null || bundle == null) {
                return;
            }
            synchronized (mediaControllerCompat$MediaControllerImplApi21.f31a) {
                mediaControllerCompat$MediaControllerImplApi21.f34d.m62b(InterfaceC0019b.a.m82H(C0241e.m1546a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                mediaControllerCompat$MediaControllerImplApi21.f34d.m63c(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                mediaControllerCompat$MediaControllerImplApi21.m47a();
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
    private static class BinderC0011a extends AbstractC0020c.c {
        BinderC0011a(AbstractC0020c abstractC0020c) {
            super(abstractC0020c);
        }

        @Override // android.support.v4.media.session.AbstractC0020c.c, android.support.v4.media.session.InterfaceC0018a
        /* renamed from: Z */
        public void mo48Z(Bundle bundle) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.AbstractC0020c.c, android.support.v4.media.session.InterfaceC0018a
        /* renamed from: b0 */
        public void mo49b0(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.AbstractC0020c.c, android.support.v4.media.session.InterfaceC0018a
        /* renamed from: g7 */
        public void mo50g7(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.AbstractC0020c.c, android.support.v4.media.session.InterfaceC0018a
        /* renamed from: j4 */
        public void mo51j4(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.AbstractC0020c.c, android.support.v4.media.session.InterfaceC0018a
        /* renamed from: q0 */
        public void mo52q0(CharSequence charSequence) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.AbstractC0020c.c, android.support.v4.media.session.InterfaceC0018a
        /* renamed from: r0 */
        public void mo53r0() throws RemoteException {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    void m47a() {
        if (this.f34d.m61a() == null) {
            return;
        }
        for (AbstractC0020c abstractC0020c : this.f32b) {
            BinderC0011a binderC0011a = new BinderC0011a(abstractC0020c);
            this.f33c.put(abstractC0020c, binderC0011a);
            abstractC0020c.f68c = binderC0011a;
            try {
                this.f34d.m61a().mo81Z0(binderC0011a);
                abstractC0020c.m91i(13, null, null);
            } catch (RemoteException e2) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e2);
            }
        }
        this.f32b.clear();
    }
}
