package y1;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: AbsSavedState.java */
@SuppressLint({"BanParcelableUsage"})
/* renamed from: y1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5121a implements Parcelable {

    /* renamed from: C, reason: collision with root package name */
    public static final AbstractC5121a f53100C = new C0777a();
    public static final Parcelable.Creator<AbstractC5121a> CREATOR = new b();

    /* renamed from: B, reason: collision with root package name */
    private final Parcelable f53101B;

    /* compiled from: AbsSavedState.java */
    /* renamed from: y1.a$a, reason: collision with other inner class name */
    class C0777a extends AbstractC5121a {
        C0777a() {
            super((C0777a) null);
        }
    }

    /* compiled from: AbsSavedState.java */
    /* renamed from: y1.a$b */
    class b implements Parcelable.ClassLoaderCreator<AbstractC5121a> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC5121a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC5121a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbstractC5121a.f53100C;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public AbstractC5121a[] newArray(int i10) {
            return new AbstractC5121a[i10];
        }
    }

    /* synthetic */ AbstractC5121a(C0777a c0777a) {
        this();
    }

    public final Parcelable a() {
        return this.f53101B;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f53101B, i10);
    }

    private AbstractC5121a() {
        this.f53101B = null;
    }

    protected AbstractC5121a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f53101B = parcelable == f53100C ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected AbstractC5121a(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f53101B = parcelable == null ? f53100C : parcelable;
    }
}
