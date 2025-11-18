package Z7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import s.X;
import y1.AbstractC5121a;

/* compiled from: ExtendableSavedState.java */
/* loaded from: classes2.dex */
public class a extends AbstractC5121a {
    public static final Parcelable.Creator<a> CREATOR = new C0286a();

    /* renamed from: D, reason: collision with root package name */
    public final X<String, Bundle> f19601D;

    /* compiled from: ExtendableSavedState.java */
    /* renamed from: Z7.a$a, reason: collision with other inner class name */
    class C0286a implements Parcelable.ClassLoaderCreator<a> {
        C0286a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* synthetic */ a(Parcel parcel, ClassLoader classLoader, C0286a c0286a) {
        this(parcel, classLoader);
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f19601D + "}";
    }

    @Override // y1.AbstractC5121a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        int size = this.f19601D.getSize();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i11 = 0; i11 < size; i11++) {
            strArr[i11] = this.f19601D.h(i11);
            bundleArr[i11] = this.f19601D.l(i11);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f19601D = new X<>();
    }

    private a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i10 = parcel.readInt();
        String[] strArr = new String[i10];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i10];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f19601D = new X<>(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f19601D.put(strArr[i11], bundleArr[i11]);
        }
    }
}
