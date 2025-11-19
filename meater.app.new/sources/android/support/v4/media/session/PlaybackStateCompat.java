package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: B, reason: collision with root package name */
    final int f20509B;

    /* renamed from: C, reason: collision with root package name */
    final long f20510C;

    /* renamed from: D, reason: collision with root package name */
    final long f20511D;

    /* renamed from: E, reason: collision with root package name */
    final float f20512E;

    /* renamed from: F, reason: collision with root package name */
    final long f20513F;

    /* renamed from: G, reason: collision with root package name */
    final int f20514G;

    /* renamed from: H, reason: collision with root package name */
    final CharSequence f20515H;

    /* renamed from: I, reason: collision with root package name */
    final long f20516I;

    /* renamed from: J, reason: collision with root package name */
    List<CustomAction> f20517J;

    /* renamed from: K, reason: collision with root package name */
    final long f20518K;

    /* renamed from: L, reason: collision with root package name */
    final Bundle f20519L;

    /* renamed from: M, reason: collision with root package name */
    private PlaybackState f20520M;

    class a implements Parcelable.Creator<PlaybackStateCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    private static class b {
        static void a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }

        static PlaybackState.CustomAction b(PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        static PlaybackState c(PlaybackState.Builder builder) {
            return builder.build();
        }

        static PlaybackState.Builder d() {
            return new PlaybackState.Builder();
        }

        static PlaybackState.CustomAction.Builder e(String str, CharSequence charSequence, int i10) {
            return new PlaybackState.CustomAction.Builder(str, charSequence, i10);
        }

        static String f(PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        static long g(PlaybackState playbackState) {
            return playbackState.getActions();
        }

        static long h(PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }

        static long i(PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }

        static List<PlaybackState.CustomAction> j(PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }

        static CharSequence k(PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }

        static Bundle l(PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        static int m(PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }

        static long n(PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }

        static CharSequence o(PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        static float p(PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }

        static long q(PlaybackState playbackState) {
            return playbackState.getPosition();
        }

        static int r(PlaybackState playbackState) {
            return playbackState.getState();
        }

        static void s(PlaybackState.Builder builder, long j10) {
            builder.setActions(j10);
        }

        static void t(PlaybackState.Builder builder, long j10) {
            builder.setActiveQueueItemId(j10);
        }

        static void u(PlaybackState.Builder builder, long j10) {
            builder.setBufferedPosition(j10);
        }

        static void v(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        static void w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        static void x(PlaybackState.Builder builder, int i10, long j10, float f10, long j11) {
            builder.setState(i10, j10, f10, j11);
        }
    }

    private static class c {
        static Bundle a(PlaybackState playbackState) {
            return playbackState.getExtras();
        }

        static void b(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }
    }

    PlaybackStateCompat(int i10, long j10, long j11, float f10, long j12, int i11, CharSequence charSequence, long j13, List<CustomAction> list, long j14, Bundle bundle) {
        this.f20509B = i10;
        this.f20510C = j10;
        this.f20511D = j11;
        this.f20512E = f10;
        this.f20513F = j12;
        this.f20514G = i11;
        this.f20515H = charSequence;
        this.f20516I = j13;
        this.f20517J = new ArrayList(list);
        this.f20518K = j14;
        this.f20519L = bundle;
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList = null;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> listJ = b.j(playbackState);
        if (listJ != null) {
            arrayList = new ArrayList(listJ.size());
            Iterator<PlaybackState.CustomAction> it = listJ.iterator();
            while (it.hasNext()) {
                arrayList.add(CustomAction.a(it.next()));
            }
        }
        Bundle bundleA = c.a(playbackState);
        MediaSessionCompat.a(bundleA);
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(b.r(playbackState), b.q(playbackState), b.i(playbackState), b.p(playbackState), b.g(playbackState), 0, b.k(playbackState), b.n(playbackState), arrayList, b.h(playbackState), bundleA);
        playbackStateCompat.f20520M = playbackState;
        return playbackStateCompat;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f20509B + ", position=" + this.f20510C + ", buffered position=" + this.f20511D + ", speed=" + this.f20512E + ", updated=" + this.f20516I + ", actions=" + this.f20513F + ", error code=" + this.f20514G + ", error message=" + this.f20515H + ", custom actions=" + this.f20517J + ", active item id=" + this.f20518K + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f20509B);
        parcel.writeLong(this.f20510C);
        parcel.writeFloat(this.f20512E);
        parcel.writeLong(this.f20516I);
        parcel.writeLong(this.f20511D);
        parcel.writeLong(this.f20513F);
        TextUtils.writeToParcel(this.f20515H, parcel, i10);
        parcel.writeTypedList(this.f20517J);
        parcel.writeLong(this.f20518K);
        parcel.writeBundle(this.f20519L);
        parcel.writeInt(this.f20514G);
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: B, reason: collision with root package name */
        private final String f20521B;

        /* renamed from: C, reason: collision with root package name */
        private final CharSequence f20522C;

        /* renamed from: D, reason: collision with root package name */
        private final int f20523D;

        /* renamed from: E, reason: collision with root package name */
        private final Bundle f20524E;

        /* renamed from: F, reason: collision with root package name */
        private PlaybackState.CustomAction f20525F;

        class a implements Parcelable.Creator<CustomAction> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        CustomAction(String str, CharSequence charSequence, int i10, Bundle bundle) {
            this.f20521B = str;
            this.f20522C = charSequence;
            this.f20523D = i10;
            this.f20524E = bundle;
        }

        public static CustomAction a(Object obj) {
            if (obj == null) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            Bundle bundleL = b.l(customAction);
            MediaSessionCompat.a(bundleL);
            CustomAction customAction2 = new CustomAction(b.f(customAction), b.o(customAction), b.m(customAction), bundleL);
            customAction2.f20525F = customAction;
            return customAction2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f20522C) + ", mIcon=" + this.f20523D + ", mExtras=" + this.f20524E;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f20521B);
            TextUtils.writeToParcel(this.f20522C, parcel, i10);
            parcel.writeInt(this.f20523D);
            parcel.writeBundle(this.f20524E);
        }

        CustomAction(Parcel parcel) {
            this.f20521B = parcel.readString();
            this.f20522C = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f20523D = parcel.readInt();
            this.f20524E = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f20509B = parcel.readInt();
        this.f20510C = parcel.readLong();
        this.f20512E = parcel.readFloat();
        this.f20516I = parcel.readLong();
        this.f20511D = parcel.readLong();
        this.f20513F = parcel.readLong();
        this.f20515H = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f20517J = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f20518K = parcel.readLong();
        this.f20519L = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f20514G = parcel.readInt();
    }
}
