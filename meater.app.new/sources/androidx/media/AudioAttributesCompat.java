package androidx.media;

import C9.h;
import android.media.AudioAttributes;
import android.util.SparseIntArray;
import z3.b;

/* loaded from: classes.dex */
public class AudioAttributesCompat implements b {

    /* renamed from: b, reason: collision with root package name */
    private static final SparseIntArray f26010b;

    /* renamed from: c, reason: collision with root package name */
    static boolean f26011c;

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f26012d;

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributesImpl f26013a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f26010b = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
        f26012d = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    }

    public AudioAttributesCompat() {
    }

    static int a(boolean z10, int i10, int i11) {
        if ((i10 & 1) == 1) {
            return z10 ? 1 : 7;
        }
        if ((i10 & 4) == 4) {
            return z10 ? 0 : 6;
        }
        switch (i11) {
            case 0:
            case 1:
            case h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return z10 ? 0 : 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return 5;
            case 6:
                return 2;
            case h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return 10;
            case h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return 1;
            case 15:
            default:
                if (!z10) {
                    return 3;
                }
                throw new IllegalArgumentException("Unknown usage value " + i11 + " in audio attributes");
        }
    }

    static String b(int i10) {
        switch (i10) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case h.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return "USAGE_NOTIFICATION_EVENT";
            case h.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 15:
            default:
                return "unknown usage " + i10;
            case 16:
                return "USAGE_ASSISTANT";
        }
    }

    public static AudioAttributesCompat c(Object obj) {
        if (f26011c) {
            return null;
        }
        return new AudioAttributesCompat(new AudioAttributesImplApi26((AudioAttributes) obj));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f26013a;
        return audioAttributesImpl == null ? audioAttributesCompat.f26013a == null : audioAttributesImpl.equals(audioAttributesCompat.f26013a);
    }

    public int hashCode() {
        return this.f26013a.hashCode();
    }

    public String toString() {
        return this.f26013a.toString();
    }

    AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.f26013a = audioAttributesImpl;
    }
}
