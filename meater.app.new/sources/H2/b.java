package H2;

import U1.x;
import U1.y;
import X1.L;
import android.os.Parcel;
import android.os.Parcelable;
import l8.C3910c;
import p8.f;

/* compiled from: VorbisComment.java */
@Deprecated
/* loaded from: classes.dex */
public class b implements y.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: B, reason: collision with root package name */
    public final String f5491B;

    /* renamed from: C, reason: collision with root package name */
    public final String f5492C;

    /* compiled from: VorbisComment.java */
    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(String str, String str2) {
        this.f5491B = C3910c.f(str);
        this.f5492C = str2;
    }

    @Override // U1.y.b
    public void L0(x.b bVar) {
        String str = this.f5491B;
        str.hashCode();
        switch (str) {
            case "TOTALTRACKS":
                Integer numM = f.m(this.f5492C);
                if (numM != null) {
                    bVar.r0(numM);
                    break;
                }
                break;
            case "TOTALDISCS":
                Integer numM2 = f.m(this.f5492C);
                if (numM2 != null) {
                    bVar.q0(numM2);
                    break;
                }
                break;
            case "TRACKNUMBER":
                Integer numM3 = f.m(this.f5492C);
                if (numM3 != null) {
                    bVar.s0(numM3);
                    break;
                }
                break;
            case "ALBUM":
                bVar.P(this.f5492C);
                break;
            case "GENRE":
                bVar.c0(this.f5492C);
                break;
            case "TITLE":
                bVar.p0(this.f5492C);
                break;
            case "DESCRIPTION":
                bVar.W(this.f5492C);
                break;
            case "DISCNUMBER":
                Integer numM4 = f.m(this.f5492C);
                if (numM4 != null) {
                    bVar.X(numM4);
                    break;
                }
                break;
            case "ALBUMARTIST":
                bVar.O(this.f5492C);
                break;
            case "ARTIST":
                bVar.Q(this.f5492C);
                break;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f5491B.equals(bVar.f5491B) && this.f5492C.equals(bVar.f5492C);
    }

    public int hashCode() {
        return ((527 + this.f5491B.hashCode()) * 31) + this.f5492C.hashCode();
    }

    public String toString() {
        return "VC: " + this.f5491B + "=" + this.f5492C;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5491B);
        parcel.writeString(this.f5492C);
    }

    protected b(Parcel parcel) {
        this.f5491B = (String) L.i(parcel.readString());
        this.f5492C = (String) L.i(parcel.readString());
    }
}
