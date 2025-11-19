package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.v;
import java.util.ArrayList;

/* compiled from: FragmentManagerState.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new a();

    /* renamed from: B, reason: collision with root package name */
    ArrayList<String> f25811B;

    /* renamed from: C, reason: collision with root package name */
    ArrayList<String> f25812C;

    /* renamed from: D, reason: collision with root package name */
    C2081b[] f25813D;

    /* renamed from: E, reason: collision with root package name */
    int f25814E;

    /* renamed from: F, reason: collision with root package name */
    String f25815F;

    /* renamed from: G, reason: collision with root package name */
    ArrayList<String> f25816G;

    /* renamed from: H, reason: collision with root package name */
    ArrayList<C2082c> f25817H;

    /* renamed from: I, reason: collision with root package name */
    ArrayList<v.m> f25818I;

    /* compiled from: FragmentManagerState.java */
    class a implements Parcelable.Creator<x> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public x createFromParcel(Parcel parcel) {
            return new x(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public x[] newArray(int i10) {
            return new x[i10];
        }
    }

    public x() {
        this.f25815F = null;
        this.f25816G = new ArrayList<>();
        this.f25817H = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f25811B);
        parcel.writeStringList(this.f25812C);
        parcel.writeTypedArray(this.f25813D, i10);
        parcel.writeInt(this.f25814E);
        parcel.writeString(this.f25815F);
        parcel.writeStringList(this.f25816G);
        parcel.writeTypedList(this.f25817H);
        parcel.writeTypedList(this.f25818I);
    }

    public x(Parcel parcel) {
        this.f25815F = null;
        this.f25816G = new ArrayList<>();
        this.f25817H = new ArrayList<>();
        this.f25811B = parcel.createStringArrayList();
        this.f25812C = parcel.createStringArrayList();
        this.f25813D = (C2081b[]) parcel.createTypedArray(C2081b.CREATOR);
        this.f25814E = parcel.readInt();
        this.f25815F = parcel.readString();
        this.f25816G = parcel.createStringArrayList();
        this.f25817H = parcel.createTypedArrayList(C2082c.CREATOR);
        this.f25818I = parcel.createTypedArrayList(v.m.CREATOR);
    }
}
