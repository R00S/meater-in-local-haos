package J2;

import X1.L;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: ChapterFrame.java */
/* loaded from: classes.dex */
public final class c extends i {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: C, reason: collision with root package name */
    public final String f7232C;

    /* renamed from: D, reason: collision with root package name */
    public final int f7233D;

    /* renamed from: E, reason: collision with root package name */
    public final int f7234E;

    /* renamed from: F, reason: collision with root package name */
    public final long f7235F;

    /* renamed from: G, reason: collision with root package name */
    public final long f7236G;

    /* renamed from: H, reason: collision with root package name */
    private final i[] f7237H;

    /* compiled from: ChapterFrame.java */
    class a implements Parcelable.Creator<c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c(String str, int i10, int i11, long j10, long j11, i[] iVarArr) {
        super("CHAP");
        this.f7232C = str;
        this.f7233D = i10;
        this.f7234E = i11;
        this.f7235F = j10;
        this.f7236G = j11;
        this.f7237H = iVarArr;
    }

    @Override // J2.i, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f7233D == cVar.f7233D && this.f7234E == cVar.f7234E && this.f7235F == cVar.f7235F && this.f7236G == cVar.f7236G && L.d(this.f7232C, cVar.f7232C) && Arrays.equals(this.f7237H, cVar.f7237H);
    }

    public int hashCode() {
        int i10 = (((((((527 + this.f7233D) * 31) + this.f7234E) * 31) + ((int) this.f7235F)) * 31) + ((int) this.f7236G)) * 31;
        String str = this.f7232C;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f7232C);
        parcel.writeInt(this.f7233D);
        parcel.writeInt(this.f7234E);
        parcel.writeLong(this.f7235F);
        parcel.writeLong(this.f7236G);
        parcel.writeInt(this.f7237H.length);
        for (i iVar : this.f7237H) {
            parcel.writeParcelable(iVar, 0);
        }
    }

    c(Parcel parcel) {
        super("CHAP");
        this.f7232C = (String) L.i(parcel.readString());
        this.f7233D = parcel.readInt();
        this.f7234E = parcel.readInt();
        this.f7235F = parcel.readLong();
        this.f7236G = parcel.readLong();
        int i10 = parcel.readInt();
        this.f7237H = new i[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f7237H[i11] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}
