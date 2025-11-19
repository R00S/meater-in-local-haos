package android.support.v4.media;

import android.annotation.SuppressLint;
import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import s.C4391a;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* renamed from: D, reason: collision with root package name */
    static final C4391a<String, Integer> f20483D;

    /* renamed from: E, reason: collision with root package name */
    private static final String[] f20484E;

    /* renamed from: F, reason: collision with root package name */
    private static final String[] f20485F;

    /* renamed from: G, reason: collision with root package name */
    private static final String[] f20486G;

    /* renamed from: B, reason: collision with root package name */
    final Bundle f20487B;

    /* renamed from: C, reason: collision with root package name */
    private MediaMetadata f20488C;

    class a implements Parcelable.Creator<MediaMetadataCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat[] newArray(int i10) {
            return new MediaMetadataCompat[i10];
        }
    }

    static {
        C4391a<String, Integer> c4391a = new C4391a<>();
        f20483D = c4391a;
        c4391a.put("android.media.metadata.TITLE", 1);
        c4391a.put("android.media.metadata.ARTIST", 1);
        c4391a.put("android.media.metadata.DURATION", 0);
        c4391a.put("android.media.metadata.ALBUM", 1);
        c4391a.put("android.media.metadata.AUTHOR", 1);
        c4391a.put("android.media.metadata.WRITER", 1);
        c4391a.put("android.media.metadata.COMPOSER", 1);
        c4391a.put("android.media.metadata.COMPILATION", 1);
        c4391a.put("android.media.metadata.DATE", 1);
        c4391a.put("android.media.metadata.YEAR", 0);
        c4391a.put("android.media.metadata.GENRE", 1);
        c4391a.put("android.media.metadata.TRACK_NUMBER", 0);
        c4391a.put("android.media.metadata.NUM_TRACKS", 0);
        c4391a.put("android.media.metadata.DISC_NUMBER", 0);
        c4391a.put("android.media.metadata.ALBUM_ARTIST", 1);
        c4391a.put("android.media.metadata.ART", 2);
        c4391a.put("android.media.metadata.ART_URI", 1);
        c4391a.put("android.media.metadata.ALBUM_ART", 2);
        c4391a.put("android.media.metadata.ALBUM_ART_URI", 1);
        c4391a.put("android.media.metadata.USER_RATING", 3);
        c4391a.put("android.media.metadata.RATING", 3);
        c4391a.put("android.media.metadata.DISPLAY_TITLE", 1);
        c4391a.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c4391a.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c4391a.put("android.media.metadata.DISPLAY_ICON", 2);
        c4391a.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c4391a.put("android.media.metadata.MEDIA_ID", 1);
        c4391a.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c4391a.put("android.media.metadata.MEDIA_URI", 1);
        c4391a.put("android.media.metadata.ADVERTISEMENT", 0);
        c4391a.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        f20484E = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        f20485F = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        f20486G = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new a();
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f20487B = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    public static MediaMetadataCompat a(Object obj) {
        if (obj == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        mediaMetadata.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        MediaMetadataCompat mediaMetadataCompatCreateFromParcel = CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        mediaMetadataCompatCreateFromParcel.f20488C = mediaMetadata;
        return mediaMetadataCompatCreateFromParcel;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeBundle(this.f20487B);
    }
}
