package J2;

import X1.L;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: MlltFrame.java */
/* loaded from: classes.dex */
public final class l extends i {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: C, reason: collision with root package name */
    public final int f7260C;

    /* renamed from: D, reason: collision with root package name */
    public final int f7261D;

    /* renamed from: E, reason: collision with root package name */
    public final int f7262E;

    /* renamed from: F, reason: collision with root package name */
    public final int[] f7263F;

    /* renamed from: G, reason: collision with root package name */
    public final int[] f7264G;

    /* compiled from: MlltFrame.java */
    class a implements Parcelable.Creator<l> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i10) {
            return new l[i10];
        }
    }

    public l(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f7260C = i10;
        this.f7261D = i11;
        this.f7262E = i12;
        this.f7263F = iArr;
        this.f7264G = iArr2;
    }

    @Override // J2.i, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.f7260C == lVar.f7260C && this.f7261D == lVar.f7261D && this.f7262E == lVar.f7262E && Arrays.equals(this.f7263F, lVar.f7263F) && Arrays.equals(this.f7264G, lVar.f7264G);
    }

    public int hashCode() {
        return ((((((((527 + this.f7260C) * 31) + this.f7261D) * 31) + this.f7262E) * 31) + Arrays.hashCode(this.f7263F)) * 31) + Arrays.hashCode(this.f7264G);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f7260C);
        parcel.writeInt(this.f7261D);
        parcel.writeInt(this.f7262E);
        parcel.writeIntArray(this.f7263F);
        parcel.writeIntArray(this.f7264G);
    }

    l(Parcel parcel) {
        super("MLLT");
        this.f7260C = parcel.readInt();
        this.f7261D = parcel.readInt();
        this.f7262E = parcel.readInt();
        this.f7263F = (int[]) L.i(parcel.createIntArray());
        this.f7264G = (int[]) L.i(parcel.createIntArray());
    }
}
