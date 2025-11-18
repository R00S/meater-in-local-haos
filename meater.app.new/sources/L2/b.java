package L2;

import U1.y;

/* compiled from: SpliceCommand.java */
/* loaded from: classes.dex */
public abstract class b implements y.b {
    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "SCTE-35 splice command: type=" + getClass().getSimpleName();
    }
}
