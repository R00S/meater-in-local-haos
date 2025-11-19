package J2;

import X1.L;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: ChapterTocFrame.java */
/* loaded from: classes.dex */
public final class d extends i {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: C, reason: collision with root package name */
    public final String f7238C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f7239D;

    /* renamed from: E, reason: collision with root package name */
    public final boolean f7240E;

    /* renamed from: F, reason: collision with root package name */
    public final String[] f7241F;

    /* renamed from: G, reason: collision with root package name */
    private final i[] f7242G;

    /* compiled from: ChapterTocFrame.java */
    class a implements Parcelable.Creator<d> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    public d(String str, boolean z10, boolean z11, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f7238C = str;
        this.f7239D = z10;
        this.f7240E = z11;
        this.f7241F = strArr;
        this.f7242G = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f7239D == dVar.f7239D && this.f7240E == dVar.f7240E && L.d(this.f7238C, dVar.f7238C) && Arrays.equals(this.f7241F, dVar.f7241F) && Arrays.equals(this.f7242G, dVar.f7242G);
    }

    public int hashCode() {
        int i10 = (((527 + (this.f7239D ? 1 : 0)) * 31) + (this.f7240E ? 1 : 0)) * 31;
        String str = this.f7238C;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f7238C);
        parcel.writeByte(this.f7239D ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f7240E ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f7241F);
        parcel.writeInt(this.f7242G.length);
        for (i iVar : this.f7242G) {
            parcel.writeParcelable(iVar, 0);
        }
    }

    d(Parcel parcel) {
        super("CTOC");
        this.f7238C = (String) L.i(parcel.readString());
        this.f7239D = parcel.readByte() != 0;
        this.f7240E = parcel.readByte() != 0;
        this.f7241F = (String[]) L.i(parcel.createStringArray());
        int i10 = parcel.readInt();
        this.f7242G = new i[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f7242G[i11] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}
