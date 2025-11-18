package Y1;

import U1.y;
import X1.C1804a;
import X1.L;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import l8.C3915h;

/* compiled from: MdtaMetadataEntry.java */
/* loaded from: classes.dex */
public final class a implements y.b {
    public static final Parcelable.Creator<a> CREATOR = new C0280a();

    /* renamed from: B, reason: collision with root package name */
    public final String f19212B;

    /* renamed from: C, reason: collision with root package name */
    public final byte[] f19213C;

    /* renamed from: D, reason: collision with root package name */
    public final int f19214D;

    /* renamed from: E, reason: collision with root package name */
    public final int f19215E;

    /* compiled from: MdtaMetadataEntry.java */
    /* renamed from: Y1.a$a, reason: collision with other inner class name */
    class C0280a implements Parcelable.Creator<a> {
        C0280a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* synthetic */ a(Parcel parcel, C0280a c0280a) {
        this(parcel);
    }

    private static String b(List<Integer> list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("track types = ");
        C3915h.g(',').b(sb2, list);
        return sb2.toString();
    }

    private static void c(String str, byte[] bArr, int i10) {
        boolean z10;
        byte b10;
        str.hashCode();
        switch (str) {
            case "com.android.capture.fps":
                if (i10 == 23 && bArr.length == 4) {
                    z10 = true;
                }
                C1804a.a(z10);
                break;
            case "editable.tracks.samples.location":
                if (i10 == 75 && bArr.length == 1 && ((b10 = bArr[0]) == 0 || b10 == 1)) {
                    z10 = true;
                }
                C1804a.a(z10);
                break;
            case "editable.tracks.length":
            case "editable.tracks.offset":
                if (i10 == 78 && bArr.length == 8) {
                    z10 = true;
                }
                C1804a.a(z10);
                break;
            case "editable.tracks.map":
                C1804a.a(i10 == 0);
                break;
        }
    }

    public List<Integer> a() {
        C1804a.h(this.f19212B.equals("editable.tracks.map"), "Metadata is not an editable tracks map");
        byte b10 = this.f19213C[1];
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < b10; i10++) {
            arrayList.add(Integer.valueOf(this.f19213C[i10 + 2]));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f19212B.equals(aVar.f19212B) && Arrays.equals(this.f19213C, aVar.f19213C) && this.f19214D == aVar.f19214D && this.f19215E == aVar.f19215E;
    }

    public int hashCode() {
        return ((((((527 + this.f19212B.hashCode()) * 31) + Arrays.hashCode(this.f19213C)) * 31) + this.f19214D) * 31) + this.f19215E;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r3 = this;
            int r0 = r3.f19215E
            if (r0 == 0) goto L57
            r1 = 1
            if (r0 == r1) goto L50
            r1 = 23
            if (r0 == r1) goto L41
            r1 = 67
            if (r0 == r1) goto L36
            r1 = 75
            if (r0 == r1) goto L28
            r1 = 78
            if (r0 == r1) goto L18
            goto L6a
        L18:
            X1.y r0 = new X1.y
            byte[] r1 = r3.f19213C
            r0.<init>(r1)
            long r0 = r0.O()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L70
        L28:
            byte[] r0 = r3.f19213C
            r1 = 0
            r0 = r0[r1]
            int r0 = java.lang.Byte.toUnsignedInt(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L70
        L36:
            byte[] r0 = r3.f19213C
            int r0 = p8.f.f(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L70
        L41:
            byte[] r0 = r3.f19213C
            int r0 = p8.f.f(r0)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L70
        L50:
            byte[] r0 = r3.f19213C
            java.lang.String r0 = X1.L.H(r0)
            goto L70
        L57:
            java.lang.String r0 = r3.f19212B
            java.lang.String r1 = "editable.tracks.map"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6a
            java.util.List r0 = r3.a()
            java.lang.String r0 = b(r0)
            goto L70
        L6a:
            byte[] r0 = r3.f19213C
            java.lang.String r0 = X1.L.q1(r0)
        L70:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "mdta: key="
            r1.append(r2)
            java.lang.String r2 = r3.f19212B
            r1.append(r2)
            java.lang.String r2 = ", value="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.a.toString():java.lang.String");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f19212B);
        parcel.writeByteArray(this.f19213C);
        parcel.writeInt(this.f19214D);
        parcel.writeInt(this.f19215E);
    }

    public a(String str, byte[] bArr, int i10, int i11) {
        c(str, bArr, i11);
        this.f19212B = str;
        this.f19213C = bArr;
        this.f19214D = i10;
        this.f19215E = i11;
    }

    private a(Parcel parcel) {
        String str = (String) L.i(parcel.readString());
        this.f19212B = str;
        byte[] bArr = (byte[]) L.i(parcel.createByteArray());
        this.f19213C = bArr;
        this.f19214D = parcel.readInt();
        int i10 = parcel.readInt();
        this.f19215E = i10;
        c(str, bArr, i10);
    }
}
