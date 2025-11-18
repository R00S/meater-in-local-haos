package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new C0461a();

    /* renamed from: f */
    final String f3169f;

    /* renamed from: g */
    final String f3170g;

    /* renamed from: h */
    final boolean f3171h;

    /* renamed from: i */
    final int f3172i;

    /* renamed from: j */
    final int f3173j;

    /* renamed from: k */
    final String f3174k;

    /* renamed from: l */
    final boolean f3175l;

    /* renamed from: m */
    final boolean f3176m;

    /* renamed from: n */
    final boolean f3177n;

    /* renamed from: o */
    final Bundle f3178o;

    /* renamed from: p */
    final boolean f3179p;

    /* renamed from: q */
    final int f3180q;

    /* renamed from: r */
    Bundle f3181r;

    /* renamed from: androidx.fragment.app.FragmentState$a */
    class C0461a implements Parcelable.Creator<FragmentState> {
        C0461a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentState[] newArray(int i2) {
            return new FragmentState[i2];
        }
    }

    FragmentState(Fragment fragment) {
        this.f3169f = fragment.getClass().getName();
        this.f3170g = fragment.mWho;
        this.f3171h = fragment.mFromLayout;
        this.f3172i = fragment.mFragmentId;
        this.f3173j = fragment.mContainerId;
        this.f3174k = fragment.mTag;
        this.f3175l = fragment.mRetainInstance;
        this.f3176m = fragment.mRemoving;
        this.f3177n = fragment.mDetached;
        this.f3178o = fragment.mArguments;
        this.f3179p = fragment.mHidden;
        this.f3180q = fragment.mMaxState.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f3169f);
        sb.append(" (");
        sb.append(this.f3170g);
        sb.append(")}:");
        if (this.f3171h) {
            sb.append(" fromLayout");
        }
        if (this.f3173j != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f3173j));
        }
        String str = this.f3174k;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f3174k);
        }
        if (this.f3175l) {
            sb.append(" retainInstance");
        }
        if (this.f3176m) {
            sb.append(" removing");
        }
        if (this.f3177n) {
            sb.append(" detached");
        }
        if (this.f3179p) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f3169f);
        parcel.writeString(this.f3170g);
        parcel.writeInt(this.f3171h ? 1 : 0);
        parcel.writeInt(this.f3172i);
        parcel.writeInt(this.f3173j);
        parcel.writeString(this.f3174k);
        parcel.writeInt(this.f3175l ? 1 : 0);
        parcel.writeInt(this.f3176m ? 1 : 0);
        parcel.writeInt(this.f3177n ? 1 : 0);
        parcel.writeBundle(this.f3178o);
        parcel.writeInt(this.f3179p ? 1 : 0);
        parcel.writeBundle(this.f3181r);
        parcel.writeInt(this.f3180q);
    }

    FragmentState(Parcel parcel) {
        this.f3169f = parcel.readString();
        this.f3170g = parcel.readString();
        this.f3171h = parcel.readInt() != 0;
        this.f3172i = parcel.readInt();
        this.f3173j = parcel.readInt();
        this.f3174k = parcel.readString();
        this.f3175l = parcel.readInt() != 0;
        this.f3176m = parcel.readInt() != 0;
        this.f3177n = parcel.readInt() != 0;
        this.f3178o = parcel.readBundle();
        this.f3179p = parcel.readInt() != 0;
        this.f3181r = parcel.readBundle();
        this.f3180q = parcel.readInt();
    }
}
