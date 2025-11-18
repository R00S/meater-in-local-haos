package i8;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.play:review@@2.0.2 */
@SuppressLint({"RestrictedApi"})
/* renamed from: i8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3631a implements Parcelable {
    public static final Parcelable.Creator<AbstractC3631a> CREATOR = new e();

    abstract PendingIntent a();

    abstract boolean b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(a(), 0);
        parcel.writeInt(b() ? 1 : 0);
    }
}
