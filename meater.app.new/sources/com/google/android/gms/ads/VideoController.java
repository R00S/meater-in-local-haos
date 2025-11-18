package com.google.android.gms.ads;

import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzaar;
import com.google.android.gms.internal.ads.zzacc;
import com.google.android.gms.internal.ads.zzard;
import com.google.android.gms.internal.ads.zzbad;

@zzard
/* loaded from: classes2.dex */
public final class VideoController {

    @KeepForSdk
    public static final int PLAYBACK_STATE_ENDED = 3;

    @KeepForSdk
    public static final int PLAYBACK_STATE_PAUSED = 2;

    @KeepForSdk
    public static final int PLAYBACK_STATE_PLAYING = 1;

    @KeepForSdk
    public static final int PLAYBACK_STATE_READY = 5;

    @KeepForSdk
    public static final int PLAYBACK_STATE_UNKNOWN = 0;
    private final Object lock = new Object();
    private zzaar zzaav;
    private VideoLifecycleCallbacks zzaaw;

    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    public final float getAspectRatio() {
        synchronized (this.lock) {
            zzaar zzaarVar = this.zzaav;
            if (zzaarVar == null) {
                return 0.0f;
            }
            try {
                return zzaarVar.mo16195T();
            } catch (RemoteException e2) {
                zzbad.m17347c("Unable to call getAspectRatio on video controller.", e2);
                return 0.0f;
            }
        }
    }

    @KeepForSdk
    public final int getPlaybackState() {
        synchronized (this.lock) {
            zzaar zzaarVar = this.zzaav;
            if (zzaarVar == null) {
                return 0;
            }
            try {
                return zzaarVar.mo16190F();
            } catch (RemoteException e2) {
                zzbad.m17347c("Unable to call getPlaybackState on video controller.", e2);
                return 0;
            }
        }
    }

    public final VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.lock) {
            videoLifecycleCallbacks = this.zzaaw;
        }
        return videoLifecycleCallbacks;
    }

    public final boolean hasVideoContent() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzaav != null;
        }
        return z;
    }

    public final boolean isClickToExpandEnabled() {
        synchronized (this.lock) {
            zzaar zzaarVar = this.zzaav;
            if (zzaarVar == null) {
                return false;
            }
            try {
                return zzaarVar.mo16197d1();
            } catch (RemoteException e2) {
                zzbad.m17347c("Unable to call isClickToExpandEnabled.", e2);
                return false;
            }
        }
    }

    public final boolean isCustomControlsEnabled() {
        synchronized (this.lock) {
            zzaar zzaarVar = this.zzaav;
            if (zzaarVar == null) {
                return false;
            }
            try {
                return zzaarVar.mo16199l5();
            } catch (RemoteException e2) {
                zzbad.m17347c("Unable to call isUsingCustomPlayerControls.", e2);
                return false;
            }
        }
    }

    public final boolean isMuted() {
        synchronized (this.lock) {
            zzaar zzaarVar = this.zzaav;
            if (zzaarVar == null) {
                return true;
            }
            try {
                return zzaarVar.mo16191G1();
            } catch (RemoteException e2) {
                zzbad.m17347c("Unable to call isMuted on video controller.", e2);
                return true;
            }
        }
    }

    public final void mute(boolean z) {
        synchronized (this.lock) {
            zzaar zzaarVar = this.zzaav;
            if (zzaarVar == null) {
                return;
            }
            try {
                zzaarVar.mo16200o2(z);
            } catch (RemoteException e2) {
                zzbad.m17347c("Unable to call mute on video controller.", e2);
            }
        }
    }

    public final void pause() {
        synchronized (this.lock) {
            zzaar zzaarVar = this.zzaav;
            if (zzaarVar == null) {
                return;
            }
            try {
                zzaarVar.pause();
            } catch (RemoteException e2) {
                zzbad.m17347c("Unable to call pause on video controller.", e2);
            }
        }
    }

    public final void play() {
        synchronized (this.lock) {
            zzaar zzaarVar = this.zzaav;
            if (zzaarVar == null) {
                return;
            }
            try {
                zzaarVar.mo16198k5();
            } catch (RemoteException e2) {
                zzbad.m17347c("Unable to call play on video controller.", e2);
            }
        }
    }

    public final void setVideoLifecycleCallbacks(VideoLifecycleCallbacks videoLifecycleCallbacks) {
        Preconditions.m14373l(videoLifecycleCallbacks, "VideoLifecycleCallbacks may not be null.");
        synchronized (this.lock) {
            this.zzaaw = videoLifecycleCallbacks;
            zzaar zzaarVar = this.zzaav;
            if (zzaarVar == null) {
                return;
            }
            try {
                zzaarVar.mo16193R1(new zzacc(videoLifecycleCallbacks));
            } catch (RemoteException e2) {
                zzbad.m17347c("Unable to call setVideoLifecycleCallbacks on video controller.", e2);
            }
        }
    }

    public final void zza(zzaar zzaarVar) {
        synchronized (this.lock) {
            this.zzaav = zzaarVar;
            VideoLifecycleCallbacks videoLifecycleCallbacks = this.zzaaw;
            if (videoLifecycleCallbacks != null) {
                setVideoLifecycleCallbacks(videoLifecycleCallbacks);
            }
        }
    }

    public final zzaar zzdh() {
        zzaar zzaarVar;
        synchronized (this.lock) {
            zzaarVar = this.zzaav;
        }
        return zzaarVar;
    }
}
