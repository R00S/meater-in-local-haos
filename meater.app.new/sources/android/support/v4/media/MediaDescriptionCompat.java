package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: B, reason: collision with root package name */
    private final String f20466B;

    /* renamed from: C, reason: collision with root package name */
    private final CharSequence f20467C;

    /* renamed from: D, reason: collision with root package name */
    private final CharSequence f20468D;

    /* renamed from: E, reason: collision with root package name */
    private final CharSequence f20469E;

    /* renamed from: F, reason: collision with root package name */
    private final Bitmap f20470F;

    /* renamed from: G, reason: collision with root package name */
    private final Uri f20471G;

    /* renamed from: H, reason: collision with root package name */
    private final Bundle f20472H;

    /* renamed from: I, reason: collision with root package name */
    private final Uri f20473I;

    /* renamed from: J, reason: collision with root package name */
    private MediaDescription f20474J;

    class a implements Parcelable.Creator<MediaDescriptionCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i10) {
            return new MediaDescriptionCompat[i10];
        }
    }

    private static class b {
        static MediaDescription a(MediaDescription.Builder builder) {
            return builder.build();
        }

        static MediaDescription.Builder b() {
            return new MediaDescription.Builder();
        }

        static CharSequence c(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        static Bundle d(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        static Bitmap e(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        static Uri f(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        static String g(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        static CharSequence h(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        static CharSequence i(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        static void j(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        static void k(MediaDescription.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        static void l(MediaDescription.Builder builder, Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        static void m(MediaDescription.Builder builder, Uri uri) {
            builder.setIconUri(uri);
        }

        static void n(MediaDescription.Builder builder, String str) {
            builder.setMediaId(str);
        }

        static void o(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        static void p(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    private static class c {
        static Uri a(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        static void b(MediaDescription.Builder builder, Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private String f20475a;

        /* renamed from: b, reason: collision with root package name */
        private CharSequence f20476b;

        /* renamed from: c, reason: collision with root package name */
        private CharSequence f20477c;

        /* renamed from: d, reason: collision with root package name */
        private CharSequence f20478d;

        /* renamed from: e, reason: collision with root package name */
        private Bitmap f20479e;

        /* renamed from: f, reason: collision with root package name */
        private Uri f20480f;

        /* renamed from: g, reason: collision with root package name */
        private Bundle f20481g;

        /* renamed from: h, reason: collision with root package name */
        private Uri f20482h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f20475a, this.f20476b, this.f20477c, this.f20478d, this.f20479e, this.f20480f, this.f20481g, this.f20482h);
        }

        public d b(CharSequence charSequence) {
            this.f20478d = charSequence;
            return this;
        }

        public d c(Bundle bundle) {
            this.f20481g = bundle;
            return this;
        }

        public d d(Bitmap bitmap) {
            this.f20479e = bitmap;
            return this;
        }

        public d e(Uri uri) {
            this.f20480f = uri;
            return this;
        }

        public d f(String str) {
            this.f20475a = str;
            return this;
        }

        public d g(Uri uri) {
            this.f20482h = uri;
            return this;
        }

        public d h(CharSequence charSequence) {
            this.f20477c = charSequence;
            return this;
        }

        public d i(CharSequence charSequence) {
            this.f20476b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f20466B = str;
        this.f20467C = charSequence;
        this.f20468D = charSequence2;
        this.f20469E = charSequence3;
        this.f20470F = bitmap;
        this.f20471G = uri;
        this.f20472H = bundle;
        this.f20473I = uri2;
    }

    public static MediaDescriptionCompat a(Object obj) {
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        d dVar = new d();
        MediaDescription mediaDescription = (MediaDescription) obj;
        dVar.f(b.g(mediaDescription));
        dVar.i(b.i(mediaDescription));
        dVar.h(b.h(mediaDescription));
        dVar.b(b.c(mediaDescription));
        dVar.d(b.e(mediaDescription));
        dVar.e(b.f(mediaDescription));
        Bundle bundleD = b.d(mediaDescription);
        if (bundleD != null) {
            bundleD = MediaSessionCompat.b(bundleD);
        }
        Uri uri = bundleD != null ? (Uri) bundleD.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
        if (uri == null) {
            bundle = bundleD;
        } else if (!bundleD.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || bundleD.size() != 2) {
            bundleD.remove("android.support.v4.media.description.MEDIA_URI");
            bundleD.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = bundleD;
        }
        dVar.c(bundle);
        if (uri != null) {
            dVar.g(uri);
        } else {
            dVar.g(c.a(mediaDescription));
        }
        MediaDescriptionCompat mediaDescriptionCompatA = dVar.a();
        mediaDescriptionCompatA.f20474J = mediaDescription;
        return mediaDescriptionCompatA;
    }

    public Object b() {
        MediaDescription mediaDescription = this.f20474J;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builderB = b.b();
        b.n(builderB, this.f20466B);
        b.p(builderB, this.f20467C);
        b.o(builderB, this.f20468D);
        b.j(builderB, this.f20469E);
        b.l(builderB, this.f20470F);
        b.m(builderB, this.f20471G);
        b.k(builderB, this.f20472H);
        c.b(builderB, this.f20473I);
        MediaDescription mediaDescriptionA = b.a(builderB);
        this.f20474J = mediaDescriptionA;
        return mediaDescriptionA;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f20467C) + ", " + ((Object) this.f20468D) + ", " + ((Object) this.f20469E);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        ((MediaDescription) b()).writeToParcel(parcel, i10);
    }
}
