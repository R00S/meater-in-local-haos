package android.support.v4.media;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import p024c.p041e.C0867a;

/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* renamed from: f */
    static final C0867a<String, Integer> f23f;

    /* renamed from: g */
    private static final String[] f24g;

    /* renamed from: h */
    private static final String[] f25h;

    /* renamed from: i */
    private static final String[] f26i;

    /* renamed from: j */
    final Bundle f27j;

    /* renamed from: k */
    private Object f28k;

    /* renamed from: android.support.v4.media.MediaMetadataCompat$a */
    static class C0005a implements Parcelable.Creator<MediaMetadataCompat> {
        C0005a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat[] newArray(int i2) {
            return new MediaMetadataCompat[i2];
        }
    }

    static {
        C0867a<String, Integer> c0867a = new C0867a<>();
        f23f = c0867a;
        c0867a.put("android.media.metadata.TITLE", 1);
        c0867a.put("android.media.metadata.ARTIST", 1);
        c0867a.put("android.media.metadata.DURATION", 0);
        c0867a.put("android.media.metadata.ALBUM", 1);
        c0867a.put("android.media.metadata.AUTHOR", 1);
        c0867a.put("android.media.metadata.WRITER", 1);
        c0867a.put("android.media.metadata.COMPOSER", 1);
        c0867a.put("android.media.metadata.COMPILATION", 1);
        c0867a.put("android.media.metadata.DATE", 1);
        c0867a.put("android.media.metadata.YEAR", 0);
        c0867a.put("android.media.metadata.GENRE", 1);
        c0867a.put("android.media.metadata.TRACK_NUMBER", 0);
        c0867a.put("android.media.metadata.NUM_TRACKS", 0);
        c0867a.put("android.media.metadata.DISC_NUMBER", 0);
        c0867a.put("android.media.metadata.ALBUM_ARTIST", 1);
        c0867a.put("android.media.metadata.ART", 2);
        c0867a.put("android.media.metadata.ART_URI", 1);
        c0867a.put("android.media.metadata.ALBUM_ART", 2);
        c0867a.put("android.media.metadata.ALBUM_ART_URI", 1);
        c0867a.put("android.media.metadata.USER_RATING", 3);
        c0867a.put("android.media.metadata.RATING", 3);
        c0867a.put("android.media.metadata.DISPLAY_TITLE", 1);
        c0867a.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c0867a.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c0867a.put("android.media.metadata.DISPLAY_ICON", 2);
        c0867a.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c0867a.put("android.media.metadata.MEDIA_ID", 1);
        c0867a.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c0867a.put("android.media.metadata.MEDIA_URI", 1);
        c0867a.put("android.media.metadata.ADVERTISEMENT", 0);
        c0867a.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        f24g = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        f25h = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        f26i = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new C0005a();
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f27j = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    /* renamed from: a */
    public static MediaMetadataCompat m21a(Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        C0010d.m46a(obj, parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        MediaMetadataCompat mediaMetadataCompatCreateFromParcel = CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        mediaMetadataCompatCreateFromParcel.f28k = obj;
        return mediaMetadataCompatCreateFromParcel;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeBundle(this.f27j);
    }
}
