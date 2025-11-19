package kotlin;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: ParcelableSnapshotMutableIntState.android.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u000f2\u00020\u00012\u00020\u0002:\u0001\u0010B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"LO/u0;", "LO/i1;", "Landroid/os/Parcelable;", "", "value", "<init>", "(I)V", "Landroid/os/Parcel;", "parcel", "flags", "Loa/F;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "D", "b", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"BanParcelableUsage"})
/* renamed from: O.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1573u0 extends MutableIntState implements Parcelable {
    public static final Parcelable.Creator<C1573u0> CREATOR = new a();

    /* compiled from: ParcelableSnapshotMutableIntState.android.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"O/u0$a", "Landroid/os/Parcelable$Creator;", "LO/u0;", "Landroid/os/Parcel;", "parcel", "a", "(Landroid/os/Parcel;)LO/u0;", "", "size", "", "b", "(I)[LO/u0;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: O.u0$a */
    public static final class a implements Parcelable.Creator<C1573u0> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1573u0 createFromParcel(Parcel parcel) {
            return new C1573u0(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1573u0[] newArray(int size) {
            return new C1573u0[size];
        }
    }

    public C1573u0(int i10) {
        super(i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeInt(d());
    }
}
