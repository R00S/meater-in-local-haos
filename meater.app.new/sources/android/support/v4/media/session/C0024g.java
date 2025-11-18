package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* compiled from: PlaybackStateCompatApi21.java */
/* renamed from: android.support.v4.media.session.g */
/* loaded from: classes.dex */
class C0024g {

    /* compiled from: PlaybackStateCompatApi21.java */
    /* renamed from: android.support.v4.media.session.g$a */
    static final class a {
        /* renamed from: a */
        public static String m115a(Object obj) {
            return ((PlaybackState.CustomAction) obj).getAction();
        }

        /* renamed from: b */
        public static Bundle m116b(Object obj) {
            return ((PlaybackState.CustomAction) obj).getExtras();
        }

        /* renamed from: c */
        public static int m117c(Object obj) {
            return ((PlaybackState.CustomAction) obj).getIcon();
        }

        /* renamed from: d */
        public static CharSequence m118d(Object obj) {
            return ((PlaybackState.CustomAction) obj).getName();
        }
    }

    /* renamed from: a */
    public static long m106a(Object obj) {
        return ((PlaybackState) obj).getActions();
    }

    /* renamed from: b */
    public static long m107b(Object obj) {
        return ((PlaybackState) obj).getActiveQueueItemId();
    }

    /* renamed from: c */
    public static long m108c(Object obj) {
        return ((PlaybackState) obj).getBufferedPosition();
    }

    /* renamed from: d */
    public static List<Object> m109d(Object obj) {
        return ((PlaybackState) obj).getCustomActions();
    }

    /* renamed from: e */
    public static CharSequence m110e(Object obj) {
        return ((PlaybackState) obj).getErrorMessage();
    }

    /* renamed from: f */
    public static long m111f(Object obj) {
        return ((PlaybackState) obj).getLastPositionUpdateTime();
    }

    /* renamed from: g */
    public static float m112g(Object obj) {
        return ((PlaybackState) obj).getPlaybackSpeed();
    }

    /* renamed from: h */
    public static long m113h(Object obj) {
        return ((PlaybackState) obj).getPosition();
    }

    /* renamed from: i */
    public static int m114i(Object obj) {
        return ((PlaybackState) obj).getState();
    }
}
