package android.support.v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: MediaControllerCompat.java */
/* loaded from: classes.dex */
public abstract class c implements IBinder.DeathRecipient {

    /* renamed from: a, reason: collision with root package name */
    final MediaController.Callback f20527a = new a(this);

    /* renamed from: b, reason: collision with root package name */
    android.support.v4.media.session.a f20528b;

    /* compiled from: MediaControllerCompat.java */
    private static class a extends MediaController.Callback {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<c> f20529a;

        a(c cVar) {
            this.f20529a = new WeakReference<>(cVar);
        }

        @Override // android.media.session.MediaController.Callback
        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            c cVar = this.f20529a.get();
            if (cVar != null) {
                cVar.a(new d(playbackInfo.getPlaybackType(), AudioAttributesCompat.c(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.a(bundle);
            c cVar = this.f20529a.get();
            if (cVar != null) {
                cVar.b(bundle);
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            c cVar = this.f20529a.get();
            if (cVar != null) {
                cVar.c(MediaMetadataCompat.a(mediaMetadata));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onPlaybackStateChanged(PlaybackState playbackState) {
            c cVar = this.f20529a.get();
            if (cVar == null || cVar.f20528b != null) {
                return;
            }
            cVar.d(PlaybackStateCompat.a(playbackState));
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            c cVar = this.f20529a.get();
            if (cVar != null) {
                cVar.e(MediaSessionCompat.QueueItem.b(list));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueTitleChanged(CharSequence charSequence) {
            c cVar = this.f20529a.get();
            if (cVar != null) {
                cVar.f(charSequence);
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionDestroyed() {
            c cVar = this.f20529a.get();
            if (cVar != null) {
                cVar.g();
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.a(bundle);
            c cVar = this.f20529a.get();
            if (cVar != null) {
                cVar.h(str, bundle);
            }
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        i(8, null, null);
    }

    public void g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MediaControllerCompat.java */
    static class b extends a.AbstractBinderC0296a {

        /* renamed from: B, reason: collision with root package name */
        private final WeakReference<c> f20530B;

        b(c cVar) {
            this.f20530B = new WeakReference<>(cVar);
        }

        @Override // android.support.v4.media.session.a
        public void L() {
            c cVar = this.f20530B.get();
            if (cVar != null) {
                cVar.i(13, null, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void N0(int i10) {
            c cVar = this.f20530B.get();
            if (cVar != null) {
                cVar.i(12, Integer.valueOf(i10), null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void h0(boolean z10) {
            c cVar = this.f20530B.get();
            if (cVar != null) {
                cVar.i(11, Boolean.valueOf(z10), null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void j(String str, Bundle bundle) {
            c cVar = this.f20530B.get();
            if (cVar != null) {
                cVar.i(1, str, bundle);
            }
        }

        @Override // android.support.v4.media.session.a
        public void p1(PlaybackStateCompat playbackStateCompat) {
            c cVar = this.f20530B.get();
            if (cVar != null) {
                cVar.i(2, playbackStateCompat, null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void q(int i10) {
            c cVar = this.f20530B.get();
            if (cVar != null) {
                cVar.i(9, Integer.valueOf(i10), null);
            }
        }

        @Override // android.support.v4.media.session.a
        public void s0(boolean z10) {
        }
    }

    public void a(d dVar) {
    }

    public void b(Bundle bundle) {
    }

    public void c(MediaMetadataCompat mediaMetadataCompat) {
    }

    public void d(PlaybackStateCompat playbackStateCompat) {
    }

    public void e(List<MediaSessionCompat.QueueItem> list) {
    }

    public void f(CharSequence charSequence) {
    }

    public void h(String str, Bundle bundle) {
    }

    void i(int i10, Object obj, Bundle bundle) {
    }
}
