package U1;

import X1.C1804a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* compiled from: DrmInitData.java */
/* renamed from: U1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1738n implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<C1738n> CREATOR = new a();

    /* renamed from: B, reason: collision with root package name */
    private final b[] f17087B;

    /* renamed from: C, reason: collision with root package name */
    private int f17088C;

    /* renamed from: D, reason: collision with root package name */
    public final String f17089D;

    /* renamed from: E, reason: collision with root package name */
    public final int f17090E;

    /* compiled from: DrmInitData.java */
    /* renamed from: U1.n$a */
    class a implements Parcelable.Creator<C1738n> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1738n createFromParcel(Parcel parcel) {
            return new C1738n(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1738n[] newArray(int i10) {
            return new C1738n[i10];
        }
    }

    /* compiled from: DrmInitData.java */
    /* renamed from: U1.n$b */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: B, reason: collision with root package name */
        private int f17091B;

        /* renamed from: C, reason: collision with root package name */
        public final UUID f17092C;

        /* renamed from: D, reason: collision with root package name */
        public final String f17093D;

        /* renamed from: E, reason: collision with root package name */
        public final String f17094E;

        /* renamed from: F, reason: collision with root package name */
        public final byte[] f17095F;

        /* compiled from: DrmInitData.java */
        /* renamed from: U1.n$b$a */
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

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public boolean a(b bVar) {
            return c() && !bVar.c() && d(bVar.f17092C);
        }

        public b b(byte[] bArr) {
            return new b(this.f17092C, this.f17093D, this.f17094E, bArr);
        }

        public boolean c() {
            return this.f17095F != null;
        }

        public boolean d(UUID uuid) {
            return C1732h.f17047a.equals(this.f17092C) || uuid.equals(this.f17092C);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            return X1.L.d(this.f17093D, bVar.f17093D) && X1.L.d(this.f17094E, bVar.f17094E) && X1.L.d(this.f17092C, bVar.f17092C) && Arrays.equals(this.f17095F, bVar.f17095F);
        }

        public int hashCode() {
            if (this.f17091B == 0) {
                int iHashCode = this.f17092C.hashCode() * 31;
                String str = this.f17093D;
                this.f17091B = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f17094E.hashCode()) * 31) + Arrays.hashCode(this.f17095F);
            }
            return this.f17091B;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f17092C.getMostSignificantBits());
            parcel.writeLong(this.f17092C.getLeastSignificantBits());
            parcel.writeString(this.f17093D);
            parcel.writeString(this.f17094E);
            parcel.writeByteArray(this.f17095F);
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f17092C = (UUID) C1804a.e(uuid);
            this.f17093D = str;
            this.f17094E = z.t((String) C1804a.e(str2));
            this.f17095F = bArr;
        }

        b(Parcel parcel) {
            this.f17092C = new UUID(parcel.readLong(), parcel.readLong());
            this.f17093D = parcel.readString();
            this.f17094E = (String) X1.L.i(parcel.readString());
            this.f17095F = parcel.createByteArray();
        }
    }

    public C1738n(List<b> list) {
        this(null, false, (b[]) list.toArray(new b[0]));
    }

    private static boolean b(ArrayList<b> arrayList, int i10, UUID uuid) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (arrayList.get(i11).f17092C.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static C1738n d(C1738n c1738n, C1738n c1738n2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (c1738n != null) {
            str = c1738n.f17089D;
            for (b bVar : c1738n.f17087B) {
                if (bVar.c()) {
                    arrayList.add(bVar);
                }
            }
        } else {
            str = null;
        }
        if (c1738n2 != null) {
            if (str == null) {
                str = c1738n2.f17089D;
            }
            int size = arrayList.size();
            for (b bVar2 : c1738n2.f17087B) {
                if (bVar2.c() && !b(arrayList, size, bVar2.f17092C)) {
                    arrayList.add(bVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C1738n(str, arrayList);
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(b bVar, b bVar2) {
        UUID uuid = C1732h.f17047a;
        return uuid.equals(bVar.f17092C) ? uuid.equals(bVar2.f17092C) ? 0 : 1 : bVar.f17092C.compareTo(bVar2.f17092C);
    }

    public C1738n c(String str) {
        return X1.L.d(this.f17089D, str) ? this : new C1738n(str, false, this.f17087B);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public b e(int i10) {
        return this.f17087B[i10];
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1738n.class != obj.getClass()) {
            return false;
        }
        C1738n c1738n = (C1738n) obj;
        return X1.L.d(this.f17089D, c1738n.f17089D) && Arrays.equals(this.f17087B, c1738n.f17087B);
    }

    public int hashCode() {
        if (this.f17088C == 0) {
            String str = this.f17089D;
            this.f17088C = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f17087B);
        }
        return this.f17088C;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f17089D);
        parcel.writeTypedArray(this.f17087B, 0);
    }

    public C1738n(String str, List<b> list) {
        this(str, false, (b[]) list.toArray(new b[0]));
    }

    public C1738n(b... bVarArr) {
        this((String) null, bVarArr);
    }

    public C1738n(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    private C1738n(String str, boolean z10, b... bVarArr) {
        this.f17089D = str;
        bVarArr = z10 ? (b[]) bVarArr.clone() : bVarArr;
        this.f17087B = bVarArr;
        this.f17090E = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    C1738n(Parcel parcel) {
        this.f17089D = parcel.readString();
        b[] bVarArr = (b[]) X1.L.i((b[]) parcel.createTypedArray(b.CREATOR));
        this.f17087B = bVarArr;
        this.f17090E = bVarArr.length;
    }
}
