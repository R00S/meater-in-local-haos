package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import s.C4391a;

/* compiled from: VersionedParcelParcel.java */
/* loaded from: classes.dex */
class a extends VersionedParcel {

    /* renamed from: d, reason: collision with root package name */
    private final SparseIntArray f29705d;

    /* renamed from: e, reason: collision with root package name */
    private final Parcel f29706e;

    /* renamed from: f, reason: collision with root package name */
    private final int f29707f;

    /* renamed from: g, reason: collision with root package name */
    private final int f29708g;

    /* renamed from: h, reason: collision with root package name */
    private final String f29709h;

    /* renamed from: i, reason: collision with root package name */
    private int f29710i;

    /* renamed from: j, reason: collision with root package name */
    private int f29711j;

    /* renamed from: k, reason: collision with root package name */
    private int f29712k;

    a(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C4391a(), new C4391a(), new C4391a());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f29706e.writeInt(-1);
        } else {
            this.f29706e.writeInt(bArr.length);
            this.f29706e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f29706e, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void E(int i10) {
        this.f29706e.writeInt(i10);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void G(Parcelable parcelable) {
        this.f29706e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void I(String str) {
        this.f29706e.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void a() {
        int i10 = this.f29710i;
        if (i10 >= 0) {
            int i11 = this.f29705d.get(i10);
            int iDataPosition = this.f29706e.dataPosition();
            this.f29706e.setDataPosition(i11);
            this.f29706e.writeInt(iDataPosition - i11);
            this.f29706e.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected VersionedParcel b() {
        Parcel parcel = this.f29706e;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.f29711j;
        if (i10 == this.f29707f) {
            i10 = this.f29708g;
        }
        return new a(parcel, iDataPosition, i10, this.f29709h + "  ", this.f29702a, this.f29703b, this.f29704c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean g() {
        return this.f29706e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] i() {
        int i10 = this.f29706e.readInt();
        if (i10 < 0) {
            return null;
        }
        byte[] bArr = new byte[i10];
        this.f29706e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f29706e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean m(int i10) {
        while (this.f29711j < this.f29708g) {
            int i11 = this.f29712k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f29706e.setDataPosition(this.f29711j);
            int i12 = this.f29706e.readInt();
            this.f29712k = this.f29706e.readInt();
            this.f29711j += i12;
        }
        return this.f29712k == i10;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int o() {
        return this.f29706e.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public <T extends Parcelable> T q() {
        return (T) this.f29706e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String s() {
        return this.f29706e.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void w(int i10) {
        a();
        this.f29710i = i10;
        this.f29705d.put(i10, this.f29706e.dataPosition());
        E(0);
        E(i10);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void y(boolean z10) {
        this.f29706e.writeInt(z10 ? 1 : 0);
    }

    private a(Parcel parcel, int i10, int i11, String str, C4391a<String, Method> c4391a, C4391a<String, Method> c4391a2, C4391a<String, Class> c4391a3) {
        super(c4391a, c4391a2, c4391a3);
        this.f29705d = new SparseIntArray();
        this.f29710i = -1;
        this.f29712k = -1;
        this.f29706e = parcel;
        this.f29707f = i10;
        this.f29708g = i11;
        this.f29711j = i10;
        this.f29709h = str;
    }
}
