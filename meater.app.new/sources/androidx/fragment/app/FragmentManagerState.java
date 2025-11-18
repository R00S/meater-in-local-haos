package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new C0460a();

    /* renamed from: f */
    ArrayList<FragmentState> f3161f;

    /* renamed from: g */
    ArrayList<String> f3162g;

    /* renamed from: h */
    BackStackState[] f3163h;

    /* renamed from: i */
    int f3164i;

    /* renamed from: j */
    String f3165j;

    /* renamed from: k */
    ArrayList<String> f3166k;

    /* renamed from: l */
    ArrayList<Bundle> f3167l;

    /* renamed from: m */
    ArrayList<FragmentManager.LaunchedFragmentInfo> f3168m;

    /* renamed from: androidx.fragment.app.FragmentManagerState$a */
    class C0460a implements Parcelable.Creator<FragmentManagerState> {
        C0460a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public FragmentManagerState[] newArray(int i2) {
            return new FragmentManagerState[i2];
        }
    }

    public FragmentManagerState() {
        this.f3165j = null;
        this.f3166k = new ArrayList<>();
        this.f3167l = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedList(this.f3161f);
        parcel.writeStringList(this.f3162g);
        parcel.writeTypedArray(this.f3163h, i2);
        parcel.writeInt(this.f3164i);
        parcel.writeString(this.f3165j);
        parcel.writeStringList(this.f3166k);
        parcel.writeTypedList(this.f3167l);
        parcel.writeTypedList(this.f3168m);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f3165j = null;
        this.f3166k = new ArrayList<>();
        this.f3167l = new ArrayList<>();
        this.f3161f = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.f3162g = parcel.createStringArrayList();
        this.f3163h = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f3164i = parcel.readInt();
        this.f3165j = parcel.readString();
        this.f3166k = parcel.createStringArrayList();
        this.f3167l = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f3168m = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }
}
