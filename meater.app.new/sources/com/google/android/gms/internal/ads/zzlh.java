package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzlh implements Parcelable {
    public static final Parcelable.Creator<zzlh> CREATOR = new s00();

    /* renamed from: A */
    private final int f26459A;

    /* renamed from: B */
    public final long f26460B;

    /* renamed from: C */
    public final int f26461C;

    /* renamed from: D */
    public final String f26462D;

    /* renamed from: E */
    private final int f26463E;

    /* renamed from: F */
    private int f26464F;

    /* renamed from: f */
    private final String f26465f;

    /* renamed from: g */
    public final int f26466g;

    /* renamed from: h */
    public final String f26467h;

    /* renamed from: i */
    private final zzpo f26468i;

    /* renamed from: j */
    private final String f26469j;

    /* renamed from: k */
    public final String f26470k;

    /* renamed from: l */
    public final int f26471l;

    /* renamed from: m */
    public final List<byte[]> f26472m;

    /* renamed from: n */
    public final zzne f26473n;

    /* renamed from: o */
    public final int f26474o;

    /* renamed from: p */
    public final int f26475p;

    /* renamed from: q */
    public final float f26476q;

    /* renamed from: r */
    public final int f26477r;

    /* renamed from: s */
    public final float f26478s;

    /* renamed from: t */
    private final int f26479t;

    /* renamed from: u */
    private final byte[] f26480u;

    /* renamed from: v */
    private final zztb f26481v;

    /* renamed from: w */
    public final int f26482w;

    /* renamed from: x */
    public final int f26483x;

    /* renamed from: y */
    public final int f26484y;

    /* renamed from: z */
    private final int f26485z;

    private zzlh(String str, String str2, String str3, String str4, int i2, int i3, int i4, int i5, float f2, int i6, float f3, byte[] bArr, int i7, zztb zztbVar, int i8, int i9, int i10, int i11, int i12, int i13, String str5, int i14, long j2, List<byte[]> list, zzne zzneVar, zzpo zzpoVar) {
        this.f26465f = str;
        this.f26469j = str2;
        this.f26470k = str3;
        this.f26467h = str4;
        this.f26466g = i2;
        this.f26471l = i3;
        this.f26474o = i4;
        this.f26475p = i5;
        this.f26476q = f2;
        this.f26477r = i6;
        this.f26478s = f3;
        this.f26480u = bArr;
        this.f26479t = i7;
        this.f26481v = zztbVar;
        this.f26482w = i8;
        this.f26483x = i9;
        this.f26484y = i10;
        this.f26485z = i11;
        this.f26459A = i12;
        this.f26461C = i13;
        this.f26462D = str5;
        this.f26463E = i14;
        this.f26460B = j2;
        this.f26472m = list == null ? Collections.emptyList() : list;
        this.f26473n = zzneVar;
        this.f26468i = zzpoVar;
    }

    /* renamed from: b */
    public static zzlh m20197b(String str, String str2, String str3, int i2, int i3, int i4, int i5, float f2, List<byte[]> list, int i6, float f3, byte[] bArr, int i7, zztb zztbVar, zzne zzneVar) {
        return new zzlh(str, null, str2, null, -1, i3, i4, i5, -1.0f, i6, f3, bArr, i7, zztbVar, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, zzneVar, null);
    }

    /* renamed from: c */
    public static zzlh m20198c(String str, String str2, String str3, int i2, int i3, int i4, int i5, int i6, List<byte[]> list, zzne zzneVar, int i7, String str4) {
        return new zzlh(str, null, str2, null, -1, i3, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i4, i5, i6, -1, -1, i7, str4, -1, Long.MAX_VALUE, list, zzneVar, null);
    }

    /* renamed from: d */
    public static zzlh m20199d(String str, String str2, String str3, int i2, int i3, int i4, int i5, List<byte[]> list, zzne zzneVar, int i6, String str4) {
        return m20198c(str, str2, null, -1, -1, i4, i5, -1, null, zzneVar, 0, str4);
    }

    /* renamed from: e */
    public static zzlh m20200e(String str, String str2, String str3, int i2, int i3, String str4, int i4, zzne zzneVar, long j2, List<byte[]> list) {
        return new zzlh(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i3, str4, -1, j2, list, zzneVar, null);
    }

    /* renamed from: f */
    public static zzlh m20201f(String str, String str2, String str3, int i2, int i3, String str4, zzne zzneVar) {
        return m20200e(str, str2, null, -1, i3, str4, -1, zzneVar, Long.MAX_VALUE, Collections.emptyList());
    }

    /* renamed from: g */
    public static zzlh m20202g(String str, String str2, String str3, int i2, zzne zzneVar) {
        return new zzlh(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, null, null);
    }

    /* renamed from: h */
    public static zzlh m20203h(String str, String str2, String str3, int i2, List<byte[]> list, String str4, zzne zzneVar) {
        return new zzlh(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, zzneVar, null);
    }

    @TargetApi(16)
    /* renamed from: i */
    private static void m20204i(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }

    /* renamed from: a */
    public final zzlh m20205a(zzpo zzpoVar) {
        return new zzlh(this.f26465f, this.f26469j, this.f26470k, this.f26467h, this.f26466g, this.f26471l, this.f26474o, this.f26475p, this.f26476q, this.f26477r, this.f26478s, this.f26480u, this.f26479t, this.f26481v, this.f26482w, this.f26483x, this.f26484y, this.f26485z, this.f26459A, this.f26461C, this.f26462D, this.f26463E, this.f26460B, this.f26472m, this.f26473n, zzpoVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzlh.class == obj.getClass()) {
            zzlh zzlhVar = (zzlh) obj;
            if (this.f26466g == zzlhVar.f26466g && this.f26471l == zzlhVar.f26471l && this.f26474o == zzlhVar.f26474o && this.f26475p == zzlhVar.f26475p && this.f26476q == zzlhVar.f26476q && this.f26477r == zzlhVar.f26477r && this.f26478s == zzlhVar.f26478s && this.f26479t == zzlhVar.f26479t && this.f26482w == zzlhVar.f26482w && this.f26483x == zzlhVar.f26483x && this.f26484y == zzlhVar.f26484y && this.f26485z == zzlhVar.f26485z && this.f26459A == zzlhVar.f26459A && this.f26460B == zzlhVar.f26460B && this.f26461C == zzlhVar.f26461C && zzsy.m20543g(this.f26465f, zzlhVar.f26465f) && zzsy.m20543g(this.f26462D, zzlhVar.f26462D) && this.f26463E == zzlhVar.f26463E && zzsy.m20543g(this.f26469j, zzlhVar.f26469j) && zzsy.m20543g(this.f26470k, zzlhVar.f26470k) && zzsy.m20543g(this.f26467h, zzlhVar.f26467h) && zzsy.m20543g(this.f26473n, zzlhVar.f26473n) && zzsy.m20543g(this.f26468i, zzlhVar.f26468i) && zzsy.m20543g(this.f26481v, zzlhVar.f26481v) && Arrays.equals(this.f26480u, zzlhVar.f26480u) && this.f26472m.size() == zzlhVar.f26472m.size()) {
                for (int i2 = 0; i2 < this.f26472m.size(); i2++) {
                    if (!Arrays.equals(this.f26472m.get(i2), zzlhVar.f26472m.get(i2))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f26464F == 0) {
            String str = this.f26465f;
            int iHashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.f26469j;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f26470k;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f26467h;
            int iHashCode4 = (((((((((((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f26466g) * 31) + this.f26474o) * 31) + this.f26475p) * 31) + this.f26482w) * 31) + this.f26483x) * 31;
            String str5 = this.f26462D;
            int iHashCode5 = (((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f26463E) * 31;
            zzne zzneVar = this.f26473n;
            int iHashCode6 = (iHashCode5 + (zzneVar == null ? 0 : zzneVar.hashCode())) * 31;
            zzpo zzpoVar = this.f26468i;
            this.f26464F = iHashCode6 + (zzpoVar != null ? zzpoVar.hashCode() : 0);
        }
        return this.f26464F;
    }

    /* renamed from: j */
    public final zzlh m20206j(int i2) {
        return new zzlh(this.f26465f, this.f26469j, this.f26470k, this.f26467h, this.f26466g, i2, this.f26474o, this.f26475p, this.f26476q, this.f26477r, this.f26478s, this.f26480u, this.f26479t, this.f26481v, this.f26482w, this.f26483x, this.f26484y, this.f26485z, this.f26459A, this.f26461C, this.f26462D, this.f26463E, this.f26460B, this.f26472m, this.f26473n, this.f26468i);
    }

    /* renamed from: k */
    public final zzlh m20207k(int i2, int i3) {
        return new zzlh(this.f26465f, this.f26469j, this.f26470k, this.f26467h, this.f26466g, this.f26471l, this.f26474o, this.f26475p, this.f26476q, this.f26477r, this.f26478s, this.f26480u, this.f26479t, this.f26481v, this.f26482w, this.f26483x, this.f26484y, i2, i3, this.f26461C, this.f26462D, this.f26463E, this.f26460B, this.f26472m, this.f26473n, this.f26468i);
    }

    /* renamed from: l */
    public final zzlh m20208l(long j2) {
        return new zzlh(this.f26465f, this.f26469j, this.f26470k, this.f26467h, this.f26466g, this.f26471l, this.f26474o, this.f26475p, this.f26476q, this.f26477r, this.f26478s, this.f26480u, this.f26479t, this.f26481v, this.f26482w, this.f26483x, this.f26484y, this.f26485z, this.f26459A, this.f26461C, this.f26462D, this.f26463E, j2, this.f26472m, this.f26473n, this.f26468i);
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(16)
    /* renamed from: m */
    public final MediaFormat m20209m() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f26470k);
        String str = this.f26462D;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        m20204i(mediaFormat, "max-input-size", this.f26471l);
        m20204i(mediaFormat, "width", this.f26474o);
        m20204i(mediaFormat, "height", this.f26475p);
        float f2 = this.f26476q;
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        m20204i(mediaFormat, "rotation-degrees", this.f26477r);
        m20204i(mediaFormat, "channel-count", this.f26482w);
        m20204i(mediaFormat, "sample-rate", this.f26483x);
        m20204i(mediaFormat, "encoder-delay", this.f26485z);
        m20204i(mediaFormat, "encoder-padding", this.f26459A);
        for (int i2 = 0; i2 < this.f26472m.size(); i2++) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i2);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap(this.f26472m.get(i2)));
        }
        zztb zztbVar = this.f26481v;
        if (zztbVar != null) {
            m20204i(mediaFormat, "color-transfer", zztbVar.f27040h);
            m20204i(mediaFormat, "color-standard", zztbVar.f27038f);
            m20204i(mediaFormat, "color-range", zztbVar.f27039g);
            byte[] bArr = zztbVar.f27041i;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    /* renamed from: n */
    public final int m20210n() {
        int i2;
        int i3 = this.f26474o;
        if (i3 == -1 || (i2 = this.f26475p) == -1) {
            return -1;
        }
        return i3 * i2;
    }

    public final String toString() {
        String str = this.f26465f;
        String str2 = this.f26469j;
        String str3 = this.f26470k;
        int i2 = this.f26466g;
        String str4 = this.f26462D;
        int i3 = this.f26474o;
        int i4 = this.f26475p;
        float f2 = this.f26476q;
        int i5 = this.f26482w;
        int i6 = this.f26483x;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 100 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(str4);
        sb.append(", [");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(", ");
        sb.append(f2);
        sb.append("], [");
        sb.append(i5);
        sb.append(", ");
        sb.append(i6);
        sb.append("])");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f26465f);
        parcel.writeString(this.f26469j);
        parcel.writeString(this.f26470k);
        parcel.writeString(this.f26467h);
        parcel.writeInt(this.f26466g);
        parcel.writeInt(this.f26471l);
        parcel.writeInt(this.f26474o);
        parcel.writeInt(this.f26475p);
        parcel.writeFloat(this.f26476q);
        parcel.writeInt(this.f26477r);
        parcel.writeFloat(this.f26478s);
        parcel.writeInt(this.f26480u != null ? 1 : 0);
        byte[] bArr = this.f26480u;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f26479t);
        parcel.writeParcelable(this.f26481v, i2);
        parcel.writeInt(this.f26482w);
        parcel.writeInt(this.f26483x);
        parcel.writeInt(this.f26484y);
        parcel.writeInt(this.f26485z);
        parcel.writeInt(this.f26459A);
        parcel.writeInt(this.f26461C);
        parcel.writeString(this.f26462D);
        parcel.writeInt(this.f26463E);
        parcel.writeLong(this.f26460B);
        int size = this.f26472m.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeByteArray(this.f26472m.get(i3));
        }
        parcel.writeParcelable(this.f26473n, 0);
        parcel.writeParcelable(this.f26468i, 0);
    }

    zzlh(Parcel parcel) {
        this.f26465f = parcel.readString();
        this.f26469j = parcel.readString();
        this.f26470k = parcel.readString();
        this.f26467h = parcel.readString();
        this.f26466g = parcel.readInt();
        this.f26471l = parcel.readInt();
        this.f26474o = parcel.readInt();
        this.f26475p = parcel.readInt();
        this.f26476q = parcel.readFloat();
        this.f26477r = parcel.readInt();
        this.f26478s = parcel.readFloat();
        this.f26480u = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.f26479t = parcel.readInt();
        this.f26481v = (zztb) parcel.readParcelable(zztb.class.getClassLoader());
        this.f26482w = parcel.readInt();
        this.f26483x = parcel.readInt();
        this.f26484y = parcel.readInt();
        this.f26485z = parcel.readInt();
        this.f26459A = parcel.readInt();
        this.f26461C = parcel.readInt();
        this.f26462D = parcel.readString();
        this.f26463E = parcel.readInt();
        this.f26460B = parcel.readLong();
        int i2 = parcel.readInt();
        this.f26472m = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            this.f26472m.add(parcel.createByteArray());
        }
        this.f26473n = (zzne) parcel.readParcelable(zzne.class.getClassLoader());
        this.f26468i = (zzpo) parcel.readParcelable(zzpo.class.getClassLoader());
    }
}
