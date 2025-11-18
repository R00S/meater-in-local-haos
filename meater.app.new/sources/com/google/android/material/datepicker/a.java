package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import r1.C4337d;

/* compiled from: CalendarConstraints.java */
/* loaded from: classes2.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0466a();

    /* renamed from: B, reason: collision with root package name */
    private final n f36373B;

    /* renamed from: C, reason: collision with root package name */
    private final n f36374C;

    /* renamed from: D, reason: collision with root package name */
    private final c f36375D;

    /* renamed from: E, reason: collision with root package name */
    private n f36376E;

    /* renamed from: F, reason: collision with root package name */
    private final int f36377F;

    /* renamed from: G, reason: collision with root package name */
    private final int f36378G;

    /* renamed from: H, reason: collision with root package name */
    private final int f36379H;

    /* compiled from: CalendarConstraints.java */
    /* renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    class C0466a implements Parcelable.Creator<a> {
        C0466a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a((n) parcel.readParcelable(n.class.getClassLoader()), (n) parcel.readParcelable(n.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (n) parcel.readParcelable(n.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* compiled from: CalendarConstraints.java */
    public static final class b {

        /* renamed from: f, reason: collision with root package name */
        static final long f36380f = u.a(n.j(1900, 0).f36495G);

        /* renamed from: g, reason: collision with root package name */
        static final long f36381g = u.a(n.j(2100, 11).f36495G);

        /* renamed from: a, reason: collision with root package name */
        private long f36382a;

        /* renamed from: b, reason: collision with root package name */
        private long f36383b;

        /* renamed from: c, reason: collision with root package name */
        private Long f36384c;

        /* renamed from: d, reason: collision with root package name */
        private int f36385d;

        /* renamed from: e, reason: collision with root package name */
        private c f36386e;

        b(a aVar) {
            this.f36382a = f36380f;
            this.f36383b = f36381g;
            this.f36386e = f.a(Long.MIN_VALUE);
            this.f36382a = aVar.f36373B.f36495G;
            this.f36383b = aVar.f36374C.f36495G;
            this.f36384c = Long.valueOf(aVar.f36376E.f36495G);
            this.f36385d = aVar.f36377F;
            this.f36386e = aVar.f36375D;
        }

        public a a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f36386e);
            n nVarN = n.n(this.f36382a);
            n nVarN2 = n.n(this.f36383b);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l10 = this.f36384c;
            return new a(nVarN, nVarN2, cVar, l10 == null ? null : n.n(l10.longValue()), this.f36385d, null);
        }

        public b b(long j10) {
            this.f36384c = Long.valueOf(j10);
            return this;
        }
    }

    /* compiled from: CalendarConstraints.java */
    public interface c extends Parcelable {
        boolean S0(long j10);
    }

    /* synthetic */ a(n nVar, n nVar2, c cVar, n nVar3, int i10, C0466a c0466a) {
        this(nVar, nVar2, cVar, nVar3, i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f36373B.equals(aVar.f36373B) && this.f36374C.equals(aVar.f36374C) && C4337d.a(this.f36376E, aVar.f36376E) && this.f36377F == aVar.f36377F && this.f36375D.equals(aVar.f36375D);
    }

    n f(n nVar) {
        return nVar.compareTo(this.f36373B) < 0 ? this.f36373B : nVar.compareTo(this.f36374C) > 0 ? this.f36374C : nVar;
    }

    public c g() {
        return this.f36375D;
    }

    n h() {
        return this.f36374C;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f36373B, this.f36374C, this.f36376E, Integer.valueOf(this.f36377F), this.f36375D});
    }

    int i() {
        return this.f36377F;
    }

    int j() {
        return this.f36379H;
    }

    n k() {
        return this.f36376E;
    }

    n l() {
        return this.f36373B;
    }

    int m() {
        return this.f36378G;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f36373B, 0);
        parcel.writeParcelable(this.f36374C, 0);
        parcel.writeParcelable(this.f36376E, 0);
        parcel.writeParcelable(this.f36375D, 0);
        parcel.writeInt(this.f36377F);
    }

    private a(n nVar, n nVar2, c cVar, n nVar3, int i10) {
        Objects.requireNonNull(nVar, "start cannot be null");
        Objects.requireNonNull(nVar2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.f36373B = nVar;
        this.f36374C = nVar2;
        this.f36376E = nVar3;
        this.f36377F = i10;
        this.f36375D = cVar;
        if (nVar3 != null && nVar.compareTo(nVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (nVar3 != null && nVar3.compareTo(nVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 < 0 || i10 > u.i().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f36379H = nVar.y(nVar2) + 1;
        this.f36378G = (nVar2.f36492D - nVar.f36492D) + 1;
    }
}
