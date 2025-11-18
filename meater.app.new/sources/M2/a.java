package M2;

import H2.b;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: VorbisComment.java */
/* loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new C0186a();

    /* compiled from: VorbisComment.java */
    /* renamed from: M2.a$a, reason: collision with other inner class name */
    class C0186a implements Parcelable.Creator<a> {
        C0186a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(String str, String str2) {
        super(str, str2);
    }

    a(Parcel parcel) {
        super(parcel);
    }
}
