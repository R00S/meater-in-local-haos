package com.liulishuo.filedownloader.model;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p241e.p307h.p308a.p315k0.C9036f;

/* loaded from: classes2.dex */
public class FileDownloadModel implements Parcelable {
    public static final Parcelable.Creator<FileDownloadModel> CREATOR = new C8698a();

    /* renamed from: f */
    private int f33015f;

    /* renamed from: g */
    private String f33016g;

    /* renamed from: h */
    private String f33017h;

    /* renamed from: i */
    private boolean f33018i;

    /* renamed from: j */
    private String f33019j;

    /* renamed from: k */
    private final AtomicInteger f33020k;

    /* renamed from: l */
    private final AtomicLong f33021l;

    /* renamed from: m */
    private long f33022m;

    /* renamed from: n */
    private String f33023n;

    /* renamed from: o */
    private String f33024o;

    /* renamed from: p */
    private int f33025p;

    /* renamed from: q */
    private boolean f33026q;

    /* renamed from: com.liulishuo.filedownloader.model.FileDownloadModel$a */
    static class C8698a implements Parcelable.Creator<FileDownloadModel> {
        C8698a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FileDownloadModel createFromParcel(Parcel parcel) {
            return new FileDownloadModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public FileDownloadModel[] newArray(int i2) {
            return new FileDownloadModel[i2];
        }
    }

    public FileDownloadModel() {
        this.f33021l = new AtomicLong();
        this.f33020k = new AtomicInteger();
    }

    /* renamed from: B */
    public void m27555B(String str) {
        this.f33016g = str;
    }

    /* renamed from: C */
    public ContentValues m27556C() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", Integer.valueOf(m27561e()));
        contentValues.put("url", m27568l());
        contentValues.put("path", m27562f());
        contentValues.put("status", Byte.valueOf(m27564h()));
        contentValues.put("sofar", Long.valueOf(m27563g()));
        contentValues.put("total", Long.valueOf(m27567k()));
        contentValues.put("errMsg", m27559c());
        contentValues.put("etag", m27558b());
        contentValues.put("connectionCount", Integer.valueOf(m27557a()));
        contentValues.put("pathAsDirectory", Boolean.valueOf(m27572p()));
        if (m27572p() && m27560d() != null) {
            contentValues.put("filename", m27560d());
        }
        return contentValues;
    }

    /* renamed from: a */
    public int m27557a() {
        return this.f33025p;
    }

    /* renamed from: b */
    public String m27558b() {
        return this.f33024o;
    }

    /* renamed from: c */
    public String m27559c() {
        return this.f33023n;
    }

    /* renamed from: d */
    public String m27560d() {
        return this.f33019j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public int m27561e() {
        return this.f33015f;
    }

    /* renamed from: f */
    public String m27562f() {
        return this.f33017h;
    }

    /* renamed from: g */
    public long m27563g() {
        return this.f33021l.get();
    }

    /* renamed from: h */
    public byte m27564h() {
        return (byte) this.f33020k.get();
    }

    /* renamed from: i */
    public String m27565i() {
        return C9036f.m28975B(m27562f(), m27572p(), m27560d());
    }

    /* renamed from: j */
    public String m27566j() {
        if (m27565i() == null) {
            return null;
        }
        return C9036f.m28976C(m27565i());
    }

    /* renamed from: k */
    public long m27567k() {
        return this.f33022m;
    }

    /* renamed from: l */
    public String m27568l() {
        return this.f33016g;
    }

    /* renamed from: m */
    public void m27569m(long j2) {
        this.f33021l.addAndGet(j2);
    }

    /* renamed from: n */
    public boolean m27570n() {
        return this.f33022m == -1;
    }

    /* renamed from: o */
    public boolean m27571o() {
        return this.f33026q;
    }

    /* renamed from: p */
    public boolean m27572p() {
        return this.f33018i;
    }

    /* renamed from: q */
    public void m27573q() {
        this.f33025p = 1;
    }

    /* renamed from: r */
    public void m27574r(int i2) {
        this.f33025p = i2;
    }

    /* renamed from: s */
    public void m27575s(String str) {
        this.f33024o = str;
    }

    /* renamed from: t */
    public void m27576t(String str) {
        this.f33023n = str;
    }

    public String toString() {
        return C9036f.m29009o("id[%d], url[%s], path[%s], status[%d], sofar[%s], total[%d], etag[%s], %s", Integer.valueOf(this.f33015f), this.f33016g, this.f33017h, Integer.valueOf(this.f33020k.get()), this.f33021l, Long.valueOf(this.f33022m), this.f33024o, super.toString());
    }

    /* renamed from: u */
    public void m27577u(String str) {
        this.f33019j = str;
    }

    /* renamed from: v */
    public void m27578v(int i2) {
        this.f33015f = i2;
    }

    /* renamed from: w */
    public void m27579w(String str, boolean z) {
        this.f33017h = str;
        this.f33018i = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f33015f);
        parcel.writeString(this.f33016g);
        parcel.writeString(this.f33017h);
        parcel.writeByte(this.f33018i ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f33019j);
        parcel.writeByte((byte) this.f33020k.get());
        parcel.writeLong(this.f33021l.get());
        parcel.writeLong(this.f33022m);
        parcel.writeString(this.f33023n);
        parcel.writeString(this.f33024o);
        parcel.writeInt(this.f33025p);
        parcel.writeByte(this.f33026q ? (byte) 1 : (byte) 0);
    }

    /* renamed from: x */
    public void m27580x(long j2) {
        this.f33021l.set(j2);
    }

    /* renamed from: y */
    public void m27581y(byte b2) {
        this.f33020k.set(b2);
    }

    /* renamed from: z */
    public void m27582z(long j2) {
        this.f33026q = j2 > 2147483647L;
        this.f33022m = j2;
    }

    protected FileDownloadModel(Parcel parcel) {
        this.f33015f = parcel.readInt();
        this.f33016g = parcel.readString();
        this.f33017h = parcel.readString();
        this.f33018i = parcel.readByte() != 0;
        this.f33019j = parcel.readString();
        this.f33020k = new AtomicInteger(parcel.readByte());
        this.f33021l = new AtomicLong(parcel.readLong());
        this.f33022m = parcel.readLong();
        this.f33023n = parcel.readString();
        this.f33024o = parcel.readString();
        this.f33025p = parcel.readInt();
        this.f33026q = parcel.readByte() != 0;
    }
}
