package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0024g;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0017a();

    /* renamed from: f */
    final int f48f;

    /* renamed from: g */
    final long f49g;

    /* renamed from: h */
    final long f50h;

    /* renamed from: i */
    final float f51i;

    /* renamed from: j */
    final long f52j;

    /* renamed from: k */
    final int f53k;

    /* renamed from: l */
    final CharSequence f54l;

    /* renamed from: m */
    final long f55m;

    /* renamed from: n */
    List<CustomAction> f56n;

    /* renamed from: o */
    final long f57o;

    /* renamed from: p */
    final Bundle f58p;

    /* renamed from: q */
    private Object f59q;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    static class C0017a implements Parcelable.Creator<PlaybackStateCompat> {
        C0017a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i2) {
            return new PlaybackStateCompat[i2];
        }
    }

    PlaybackStateCompat(int i2, long j2, long j3, float f2, long j4, int i3, CharSequence charSequence, long j5, List<CustomAction> list, long j6, Bundle bundle) {
        this.f48f = i2;
        this.f49g = j2;
        this.f50h = j3;
        this.f51i = f2;
        this.f52j = j4;
        this.f53k = i3;
        this.f54l = charSequence;
        this.f55m = j5;
        this.f56n = new ArrayList(list);
        this.f57o = j6;
        this.f58p = bundle;
    }

    /* renamed from: a */
    public static PlaybackStateCompat m68a(Object obj) {
        ArrayList arrayList;
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        List<Object> listM109d = C0024g.m109d(obj);
        if (listM109d != null) {
            ArrayList arrayList2 = new ArrayList(listM109d.size());
            Iterator<Object> it = listM109d.iterator();
            while (it.hasNext()) {
                arrayList2.add(CustomAction.m69a(it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(C0024g.m114i(obj), C0024g.m113h(obj), C0024g.m108c(obj), C0024g.m112g(obj), C0024g.m106a(obj), 0, C0024g.m110e(obj), C0024g.m111f(obj), arrayList, C0024g.m107b(obj), Build.VERSION.SDK_INT >= 22 ? C0025h.m119a(obj) : null);
        playbackStateCompat.f59q = obj;
        return playbackStateCompat;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f48f + ", position=" + this.f49g + ", buffered position=" + this.f50h + ", speed=" + this.f51i + ", updated=" + this.f55m + ", actions=" + this.f52j + ", error code=" + this.f53k + ", error message=" + this.f54l + ", custom actions=" + this.f56n + ", active item id=" + this.f57o + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f48f);
        parcel.writeLong(this.f49g);
        parcel.writeFloat(this.f51i);
        parcel.writeLong(this.f55m);
        parcel.writeLong(this.f50h);
        parcel.writeLong(this.f52j);
        TextUtils.writeToParcel(this.f54l, parcel, i2);
        parcel.writeTypedList(this.f56n);
        parcel.writeLong(this.f57o);
        parcel.writeBundle(this.f58p);
        parcel.writeInt(this.f53k);
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0016a();

        /* renamed from: f */
        private final String f60f;

        /* renamed from: g */
        private final CharSequence f61g;

        /* renamed from: h */
        private final int f62h;

        /* renamed from: i */
        private final Bundle f63i;

        /* renamed from: j */
        private Object f64j;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        static class C0016a implements Parcelable.Creator<CustomAction> {
            C0016a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i2) {
                return new CustomAction[i2];
            }
        }

        CustomAction(String str, CharSequence charSequence, int i2, Bundle bundle) {
            this.f60f = str;
            this.f61g = charSequence;
            this.f62h = i2;
            this.f63i = bundle;
        }

        /* renamed from: a */
        public static CustomAction m69a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            CustomAction customAction = new CustomAction(C0024g.a.m115a(obj), C0024g.a.m118d(obj), C0024g.a.m117c(obj), C0024g.a.m116b(obj));
            customAction.f64j = obj;
            return customAction;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f61g) + ", mIcon=" + this.f62h + ", mExtras=" + this.f63i;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f60f);
            TextUtils.writeToParcel(this.f61g, parcel, i2);
            parcel.writeInt(this.f62h);
            parcel.writeBundle(this.f63i);
        }

        CustomAction(Parcel parcel) {
            this.f60f = parcel.readString();
            this.f61g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f62h = parcel.readInt();
            this.f63i = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f48f = parcel.readInt();
        this.f49g = parcel.readLong();
        this.f51i = parcel.readFloat();
        this.f55m = parcel.readLong();
        this.f50h = parcel.readLong();
        this.f52j = parcel.readLong();
        this.f54l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f56n = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f57o = parcel.readLong();
        this.f58p = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f53k = parcel.readInt();
    }
}
