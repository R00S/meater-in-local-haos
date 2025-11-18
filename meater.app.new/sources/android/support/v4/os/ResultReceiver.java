package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.InterfaceC0029a;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new C0026a();

    /* renamed from: f */
    final boolean f77f = false;

    /* renamed from: g */
    final Handler f78g = null;

    /* renamed from: h */
    InterfaceC0029a f79h;

    /* renamed from: android.support.v4.os.ResultReceiver$a */
    class C0026a implements Parcelable.Creator<ResultReceiver> {
        C0026a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ResultReceiver[] newArray(int i2) {
            return new ResultReceiver[i2];
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$b */
    class BinderC0027b extends InterfaceC0029a.a {
        BinderC0027b() {
        }

        @Override // android.support.v4.os.InterfaceC0029a
        /* renamed from: d7 */
        public void mo122d7(int i2, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f78g;
            if (handler != null) {
                handler.post(resultReceiver.new RunnableC0028c(i2, bundle));
            } else {
                resultReceiver.mo5a(i2, bundle);
            }
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$c */
    class RunnableC0028c implements Runnable {

        /* renamed from: f */
        final int f81f;

        /* renamed from: g */
        final Bundle f82g;

        RunnableC0028c(int i2, Bundle bundle) {
            this.f81f = i2;
            this.f82g = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            ResultReceiver.this.mo5a(this.f81f, this.f82g);
        }
    }

    ResultReceiver(Parcel parcel) {
        this.f79h = InterfaceC0029a.a.m123H(parcel.readStrongBinder());
    }

    /* renamed from: a */
    protected void mo5a(int i2, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        synchronized (this) {
            if (this.f79h == null) {
                this.f79h = new BinderC0027b();
            }
            parcel.writeStrongBinder(this.f79h.asBinder());
        }
    }
}
