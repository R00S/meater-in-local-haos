package c;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import c.a;

/* compiled from: ResultReceiver.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: B, reason: collision with root package name */
    final boolean f30812B = false;

    /* renamed from: C, reason: collision with root package name */
    final Handler f30813C = null;

    /* renamed from: D, reason: collision with root package name */
    c.a f30814D;

    /* compiled from: ResultReceiver.java */
    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    /* compiled from: ResultReceiver.java */
    /* renamed from: c.b$b, reason: collision with other inner class name */
    class BinderC0430b extends a.AbstractBinderC0428a {
        BinderC0430b() {
        }

        @Override // c.a
        public void r1(int i10, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.f30813C;
            if (handler != null) {
                handler.post(bVar.new c(i10, bundle));
            } else {
                bVar.a(i10, bundle);
            }
        }
    }

    /* compiled from: ResultReceiver.java */
    class c implements Runnable {

        /* renamed from: B, reason: collision with root package name */
        final int f30816B;

        /* renamed from: C, reason: collision with root package name */
        final Bundle f30817C;

        c(int i10, Bundle bundle) {
            this.f30816B = i10;
            this.f30817C = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f30816B, this.f30817C);
        }
    }

    b(Parcel parcel) {
        this.f30814D = a.AbstractBinderC0428a.c(parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            try {
                if (this.f30814D == null) {
                    this.f30814D = new BinderC0430b();
                }
                parcel.writeStrongBinder(this.f30814D.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected void a(int i10, Bundle bundle) {
    }
}
