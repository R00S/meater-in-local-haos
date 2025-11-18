package android.support.v4.media.session;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* compiled from: MediaControllerCompatApi21.java */
/* renamed from: android.support.v4.media.session.e */
/* loaded from: classes.dex */
class C0022e {

    /* compiled from: MediaControllerCompatApi21.java */
    /* renamed from: android.support.v4.media.session.e$a */
    public interface a {
        /* renamed from: Z */
        void mo92Z(Bundle bundle);

        /* renamed from: a */
        void mo93a(Object obj);

        /* renamed from: b */
        void mo94b(int i2, int i3, int i4, int i5, int i6);

        /* renamed from: b0 */
        void mo95b0(List<?> list);

        /* renamed from: c */
        void mo96c(Object obj);

        /* renamed from: d */
        void mo97d(String str, Bundle bundle);

        /* renamed from: q0 */
        void mo98q0(CharSequence charSequence);

        /* renamed from: r0 */
        void mo99r0();
    }

    /* compiled from: MediaControllerCompatApi21.java */
    /* renamed from: android.support.v4.media.session.e$b */
    static class b<T extends a> extends MediaController.Callback {

        /* renamed from: a */
        protected final T f76a;

        public b(T t) {
            this.f76a = t;
        }

        @Override // android.media.session.MediaController.Callback
        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            this.f76a.mo94b(playbackInfo.getPlaybackType(), c.m102b(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }

        @Override // android.media.session.MediaController.Callback
        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.m54a(bundle);
            this.f76a.mo92Z(bundle);
        }

        @Override // android.media.session.MediaController.Callback
        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f76a.mo93a(mediaMetadata);
        }

        @Override // android.media.session.MediaController.Callback
        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f76a.mo96c(playbackState);
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            this.f76a.mo95b0(list);
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueTitleChanged(CharSequence charSequence) {
            this.f76a.mo98q0(charSequence);
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionDestroyed() {
            this.f76a.mo99r0();
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.m54a(bundle);
            this.f76a.mo97d(str, bundle);
        }
    }

    /* compiled from: MediaControllerCompatApi21.java */
    /* renamed from: android.support.v4.media.session.e$c */
    public static class c {
        /* renamed from: a */
        public static AudioAttributes m101a(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getAudioAttributes();
        }

        /* renamed from: b */
        public static int m102b(Object obj) {
            return m103c(m101a(obj));
        }

        /* renamed from: c */
        private static int m103c(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            int usage = audioAttributes.getUsage();
            if (usage == 13) {
                return 1;
            }
            switch (usage) {
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                default:
                    return 3;
            }
        }
    }

    /* renamed from: a */
    public static Object m100a(a aVar) {
        return new b(aVar);
    }
}
