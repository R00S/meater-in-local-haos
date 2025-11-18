package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.support.v4.media.session.c;
import android.util.Log;
import f1.g;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import z3.C5169a;

/* loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21 {

    /* renamed from: a, reason: collision with root package name */
    final Object f20491a;

    /* renamed from: b, reason: collision with root package name */
    private final List<c> f20492b;

    /* renamed from: c, reason: collision with root package name */
    private HashMap<c, a> f20493c;

    /* renamed from: d, reason: collision with root package name */
    final MediaSessionCompat.Token f20494d;

    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: B, reason: collision with root package name */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f20495B;

        @Override // android.os.ResultReceiver
        protected void onReceiveResult(int i10, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.f20495B.get();
            if (mediaControllerCompat$MediaControllerImplApi21 == null || bundle == null) {
                return;
            }
            synchronized (mediaControllerCompat$MediaControllerImplApi21.f20491a) {
                mediaControllerCompat$MediaControllerImplApi21.f20494d.b(b.a.c(g.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                mediaControllerCompat$MediaControllerImplApi21.f20494d.c(C5169a.b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                mediaControllerCompat$MediaControllerImplApi21.a();
            }
        }
    }

    private static class a extends c.b {
        a(c cVar) {
            super(cVar);
        }

        @Override // android.support.v4.media.session.a
        public void A0() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void B0(MediaMetadataCompat mediaMetadataCompat) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void M(Bundle bundle) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void O(List<MediaSessionCompat.QueueItem> list) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void s1(ParcelableVolumeInfo parcelableVolumeInfo) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.a
        public void u0(CharSequence charSequence) {
            throw new AssertionError();
        }
    }

    void a() {
        if (this.f20494d.a() == null) {
            return;
        }
        for (c cVar : this.f20492b) {
            a aVar = new a(cVar);
            this.f20493c.put(cVar, aVar);
            cVar.f20528b = aVar;
            try {
                this.f20494d.a().p(aVar);
                cVar.i(13, null, null);
            } catch (RemoteException e10) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
            }
        }
        this.f20492b.clear();
    }
}
