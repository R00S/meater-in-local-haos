package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class AbsSavedState implements Parcelable {

    /* renamed from: g */
    private final Parcelable f2523g;

    /* renamed from: f */
    public static final AbsSavedState f2522f = new AbsSavedState() { // from class: androidx.customview.view.AbsSavedState.1
    };
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new C0335a();

    /* renamed from: androidx.customview.view.AbsSavedState$a */
    static class C0335a implements Parcelable.ClassLoaderCreator<AbsSavedState> {
        C0335a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbsSavedState createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.f2522f;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public AbsSavedState[] newArray(int i2) {
            return new AbsSavedState[i2];
        }
    }

    /* renamed from: a */
    public final Parcelable m2342a() {
        return this.f2523g;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f2523g, i2);
    }

    private AbsSavedState() {
        this.f2523g = null;
    }

    protected AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.f2523g = parcelable == f2522f ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f2523g = parcelable == null ? f2522f : parcelable;
    }
}
