package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Counter.java */
/* loaded from: classes2.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0491a();

    /* renamed from: B, reason: collision with root package name */
    private final String f38547B;

    /* renamed from: C, reason: collision with root package name */
    private final AtomicLong f38548C;

    /* compiled from: Counter.java */
    /* renamed from: com.google.firebase.perf.metrics.a$a, reason: collision with other inner class name */
    class C0491a implements Parcelable.Creator<a> {
        C0491a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* synthetic */ a(Parcel parcel, C0491a c0491a) {
        this(parcel);
    }

    long a() {
        return this.f38548C.get();
    }

    String b() {
        return this.f38547B;
    }

    public void c(long j10) {
        this.f38548C.addAndGet(j10);
    }

    void d(long j10) {
        this.f38548C.set(j10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f38547B);
        parcel.writeLong(this.f38548C.get());
    }

    public a(String str) {
        this.f38547B = str;
        this.f38548C = new AtomicLong(0L);
    }

    private a(Parcel parcel) {
        this.f38547B = parcel.readString();
        this.f38548C = new AtomicLong(parcel.readLong());
    }
}
