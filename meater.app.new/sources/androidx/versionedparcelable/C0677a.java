package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import okhttp3.HttpUrl;
import p024c.p041e.C0867a;

/* compiled from: VersionedParcelParcel.java */
/* renamed from: androidx.versionedparcelable.a */
/* loaded from: classes.dex */
class C0677a extends VersionedParcel {

    /* renamed from: d */
    private final SparseIntArray f4405d;

    /* renamed from: e */
    private final Parcel f4406e;

    /* renamed from: f */
    private final int f4407f;

    /* renamed from: g */
    private final int f4408g;

    /* renamed from: h */
    private final String f4409h;

    /* renamed from: i */
    private int f4410i;

    /* renamed from: j */
    private int f4411j;

    /* renamed from: k */
    private int f4412k;

    C0677a(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), HttpUrl.FRAGMENT_ENCODE_SET, new C0867a(), new C0867a(), new C0867a());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: A */
    public void mo4709A(byte[] bArr) {
        if (bArr == null) {
            this.f4406e.writeInt(-1);
        } else {
            this.f4406e.writeInt(bArr.length);
            this.f4406e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: C */
    protected void mo4711C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f4406e, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: E */
    public void mo4713E(int i2) {
        this.f4406e.writeInt(i2);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: G */
    public void mo4715G(Parcelable parcelable) {
        this.f4406e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: I */
    public void mo4717I(String str) {
        this.f4406e.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: a */
    public void mo4722a() {
        int i2 = this.f4410i;
        if (i2 >= 0) {
            int i3 = this.f4405d.get(i2);
            int iDataPosition = this.f4406e.dataPosition();
            this.f4406e.setDataPosition(i3);
            this.f4406e.writeInt(iDataPosition - i3);
            this.f4406e.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: b */
    protected VersionedParcel mo4723b() {
        Parcel parcel = this.f4406e;
        int iDataPosition = parcel.dataPosition();
        int i2 = this.f4411j;
        if (i2 == this.f4407f) {
            i2 = this.f4408g;
        }
        return new C0677a(parcel, iDataPosition, i2, this.f4409h + "  ", this.f4402a, this.f4403b, this.f4404c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: g */
    public boolean mo4725g() {
        return this.f4406e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: i */
    public byte[] mo4727i() {
        int i2 = this.f4406e.readInt();
        if (i2 < 0) {
            return null;
        }
        byte[] bArr = new byte[i2];
        this.f4406e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: k */
    protected CharSequence mo4729k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f4406e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: m */
    public boolean mo4731m(int i2) {
        while (this.f4411j < this.f4408g) {
            int i3 = this.f4412k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            this.f4406e.setDataPosition(this.f4411j);
            int i4 = this.f4406e.readInt();
            this.f4412k = this.f4406e.readInt();
            this.f4411j += i4;
        }
        return this.f4412k == i2;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: o */
    public int mo4733o() {
        return this.f4406e.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: q */
    public <T extends Parcelable> T mo4735q() {
        return (T) this.f4406e.readParcelable(C0677a.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: s */
    public String mo4737s() {
        return this.f4406e.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: w */
    public void mo4741w(int i2) {
        mo4722a();
        this.f4410i = i2;
        this.f4405d.put(i2, this.f4406e.dataPosition());
        mo4713E(0);
        mo4713E(i2);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* renamed from: y */
    public void mo4743y(boolean z) {
        this.f4406e.writeInt(z ? 1 : 0);
    }

    private C0677a(Parcel parcel, int i2, int i3, String str, C0867a<String, Method> c0867a, C0867a<String, Method> c0867a2, C0867a<String, Class> c0867a3) {
        super(c0867a, c0867a2, c0867a3);
        this.f4405d = new SparseIntArray();
        this.f4410i = -1;
        this.f4411j = 0;
        this.f4412k = -1;
        this.f4406e = parcel;
        this.f4407f = i2;
        this.f4408g = i3;
        this.f4411j = i2;
        this.f4409h = str;
    }
}
