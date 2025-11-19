package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: TimeModel.java */
/* loaded from: classes2.dex */
class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: B, reason: collision with root package name */
    private final b f37524B;

    /* renamed from: C, reason: collision with root package name */
    private final b f37525C;

    /* renamed from: D, reason: collision with root package name */
    final int f37526D;

    /* renamed from: E, reason: collision with root package name */
    int f37527E;

    /* renamed from: F, reason: collision with root package name */
    int f37528F;

    /* renamed from: G, reason: collision with root package name */
    int f37529G;

    /* renamed from: H, reason: collision with root package name */
    int f37530H;

    /* compiled from: TimeModel.java */
    class a implements Parcelable.Creator<e> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e() {
        this(0);
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, "%02d");
    }

    public static String b(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static int c(int i10) {
        return i10 >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f37527E == eVar.f37527E && this.f37528F == eVar.f37528F && this.f37526D == eVar.f37526D && this.f37529G == eVar.f37529G;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f37526D), Integer.valueOf(this.f37527E), Integer.valueOf(this.f37528F), Integer.valueOf(this.f37529G)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f37527E);
        parcel.writeInt(this.f37528F);
        parcel.writeInt(this.f37529G);
        parcel.writeInt(this.f37526D);
    }

    public e(int i10) {
        this(0, 0, 10, i10);
    }

    public e(int i10, int i11, int i12, int i13) {
        this.f37527E = i10;
        this.f37528F = i11;
        this.f37529G = i12;
        this.f37526D = i13;
        this.f37530H = c(i10);
        this.f37524B = new b(59);
        this.f37525C = new b(i13 == 1 ? 23 : 12);
    }

    protected e(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
