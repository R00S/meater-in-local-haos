package Y9;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: PositionSavedState.java */
/* loaded from: classes2.dex */
public class c extends View.BaseSavedState {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: B, reason: collision with root package name */
    private int f19531B;

    /* renamed from: C, reason: collision with root package name */
    private int f19532C;

    /* renamed from: D, reason: collision with root package name */
    private int f19533D;

    /* compiled from: PositionSavedState.java */
    static class a implements Parcelable.Creator<c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    /* synthetic */ c(Parcel parcel, a aVar) {
        this(parcel);
    }

    public int a() {
        return this.f19533D;
    }

    public int b() {
        return this.f19531B;
    }

    public int c() {
        return this.f19532C;
    }

    public void d(int i10) {
        this.f19533D = i10;
    }

    public void e(int i10) {
        this.f19531B = i10;
    }

    public void f(int i10) {
        this.f19532C = i10;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f19531B);
        parcel.writeInt(this.f19532C);
        parcel.writeInt(this.f19533D);
    }

    public c(Parcelable parcelable) {
        super(parcelable);
    }

    private c(Parcel parcel) {
        super(parcel);
        this.f19531B = parcel.readInt();
        this.f19532C = parcel.readInt();
        this.f19533D = parcel.readInt();
    }
}
