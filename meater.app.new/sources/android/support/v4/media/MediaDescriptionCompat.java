package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.C0008b;
import android.support.v4.media.C0009c;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0003a();

    /* renamed from: f */
    private final String f6f;

    /* renamed from: g */
    private final CharSequence f7g;

    /* renamed from: h */
    private final CharSequence f8h;

    /* renamed from: i */
    private final CharSequence f9i;

    /* renamed from: j */
    private final Bitmap f10j;

    /* renamed from: k */
    private final Uri f11k;

    /* renamed from: l */
    private final Bundle f12l;

    /* renamed from: m */
    private final Uri f13m;

    /* renamed from: n */
    private Object f14n;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    static class C0003a implements Parcelable.Creator<MediaDescriptionCompat> {
        C0003a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return Build.VERSION.SDK_INT < 21 ? new MediaDescriptionCompat(parcel) : MediaDescriptionCompat.m8a(C0008b.m26a(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i2) {
            return new MediaDescriptionCompat[i2];
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    public static final class C0004b {

        /* renamed from: a */
        private String f15a;

        /* renamed from: b */
        private CharSequence f16b;

        /* renamed from: c */
        private CharSequence f17c;

        /* renamed from: d */
        private CharSequence f18d;

        /* renamed from: e */
        private Bitmap f19e;

        /* renamed from: f */
        private Uri f20f;

        /* renamed from: g */
        private Bundle f21g;

        /* renamed from: h */
        private Uri f22h;

        /* renamed from: a */
        public MediaDescriptionCompat m12a() {
            return new MediaDescriptionCompat(this.f15a, this.f16b, this.f17c, this.f18d, this.f19e, this.f20f, this.f21g, this.f22h);
        }

        /* renamed from: b */
        public C0004b m13b(CharSequence charSequence) {
            this.f18d = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0004b m14c(Bundle bundle) {
            this.f21g = bundle;
            return this;
        }

        /* renamed from: d */
        public C0004b m15d(Bitmap bitmap) {
            this.f19e = bitmap;
            return this;
        }

        /* renamed from: e */
        public C0004b m16e(Uri uri) {
            this.f20f = uri;
            return this;
        }

        /* renamed from: f */
        public C0004b m17f(String str) {
            this.f15a = str;
            return this;
        }

        /* renamed from: g */
        public C0004b m18g(Uri uri) {
            this.f22h = uri;
            return this;
        }

        /* renamed from: h */
        public C0004b m19h(CharSequence charSequence) {
            this.f17c = charSequence;
            return this;
        }

        /* renamed from: i */
        public C0004b m20i(CharSequence charSequence) {
            this.f16b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f6f = str;
        this.f7g = charSequence;
        this.f8h = charSequence2;
        this.f9i = charSequence3;
        this.f10j = bitmap;
        this.f11k = uri;
        this.f12l = bundle;
        this.f13m = uri2;
    }

    /* renamed from: a */
    public static MediaDescriptionCompat m8a(Object obj) {
        int i2;
        Uri uri;
        Bundle bundle = null;
        if (obj == null || (i2 = Build.VERSION.SDK_INT) < 21) {
            return null;
        }
        C0004b c0004b = new C0004b();
        c0004b.m17f(C0008b.m31f(obj));
        c0004b.m20i(C0008b.m33h(obj));
        c0004b.m19h(C0008b.m32g(obj));
        c0004b.m13b(C0008b.m27b(obj));
        c0004b.m15d(C0008b.m29d(obj));
        c0004b.m16e(C0008b.m30e(obj));
        Bundle bundleM28c = C0008b.m28c(obj);
        if (bundleM28c != null) {
            MediaSessionCompat.m54a(bundleM28c);
            uri = (Uri) bundleM28c.getParcelable("android.support.v4.media.description.MEDIA_URI");
        } else {
            uri = null;
        }
        if (uri == null) {
            bundle = bundleM28c;
        } else if (!bundleM28c.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || bundleM28c.size() != 2) {
            bundleM28c.remove("android.support.v4.media.description.MEDIA_URI");
            bundleM28c.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = bundleM28c;
        }
        c0004b.m14c(bundle);
        if (uri != null) {
            c0004b.m18g(uri);
        } else if (i2 >= 23) {
            c0004b.m18g(C0009c.m44a(obj));
        }
        MediaDescriptionCompat mediaDescriptionCompatM12a = c0004b.m12a();
        mediaDescriptionCompatM12a.f14n = obj;
        return mediaDescriptionCompatM12a;
    }

    /* renamed from: b */
    public Object m9b() {
        int i2;
        Object obj = this.f14n;
        if (obj != null || (i2 = Build.VERSION.SDK_INT) < 21) {
            return obj;
        }
        Object objM36b = C0008b.a.m36b();
        C0008b.a.m41g(objM36b, this.f6f);
        C0008b.a.m43i(objM36b, this.f7g);
        C0008b.a.m42h(objM36b, this.f8h);
        C0008b.a.m37c(objM36b, this.f9i);
        C0008b.a.m39e(objM36b, this.f10j);
        C0008b.a.m40f(objM36b, this.f11k);
        Bundle bundle = this.f12l;
        if (i2 < 23 && this.f13m != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f13m);
        }
        C0008b.a.m38d(objM36b, bundle);
        if (i2 >= 23) {
            C0009c.a.m45a(objM36b, this.f13m);
        }
        Object objM35a = C0008b.a.m35a(objM36b);
        this.f14n = objM35a;
        return objM35a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f7g) + ", " + ((Object) this.f8h) + ", " + ((Object) this.f9i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0008b.m34i(m9b(), parcel, i2);
            return;
        }
        parcel.writeString(this.f6f);
        TextUtils.writeToParcel(this.f7g, parcel, i2);
        TextUtils.writeToParcel(this.f8h, parcel, i2);
        TextUtils.writeToParcel(this.f9i, parcel, i2);
        parcel.writeParcelable(this.f10j, i2);
        parcel.writeParcelable(this.f11k, i2);
        parcel.writeBundle(this.f12l);
        parcel.writeParcelable(this.f13m, i2);
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f6f = parcel.readString();
        this.f7g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f8h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f9i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f10j = (Bitmap) parcel.readParcelable(classLoader);
        this.f11k = (Uri) parcel.readParcelable(classLoader);
        this.f12l = parcel.readBundle(classLoader);
        this.f13m = (Uri) parcel.readParcelable(classLoader);
    }
}
