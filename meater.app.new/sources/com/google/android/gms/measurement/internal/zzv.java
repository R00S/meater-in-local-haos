package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzv> CREATOR = new zzy();

    /* renamed from: f */
    @SafeParcelable.Field
    public String f29422f;

    /* renamed from: g */
    @SafeParcelable.Field
    public String f29423g;

    /* renamed from: h */
    @SafeParcelable.Field
    public zzkj f29424h;

    /* renamed from: i */
    @SafeParcelable.Field
    public long f29425i;

    /* renamed from: j */
    @SafeParcelable.Field
    public boolean f29426j;

    /* renamed from: k */
    @SafeParcelable.Field
    public String f29427k;

    /* renamed from: l */
    @SafeParcelable.Field
    public zzan f29428l;

    /* renamed from: m */
    @SafeParcelable.Field
    public long f29429m;

    /* renamed from: n */
    @SafeParcelable.Field
    public zzan f29430n;

    /* renamed from: o */
    @SafeParcelable.Field
    public long f29431o;

    /* renamed from: p */
    @SafeParcelable.Field
    public zzan f29432p;

    zzv(zzv zzvVar) {
        Preconditions.m14372k(zzvVar);
        this.f29422f = zzvVar.f29422f;
        this.f29423g = zzvVar.f29423g;
        this.f29424h = zzvVar.f29424h;
        this.f29425i = zzvVar.f29425i;
        this.f29426j = zzvVar.f29426j;
        this.f29427k = zzvVar.f29427k;
        this.f29428l = zzvVar.f29428l;
        this.f29429m = zzvVar.f29429m;
        this.f29430n = zzvVar.f29430n;
        this.f29431o = zzvVar.f29431o;
        this.f29432p = zzvVar.f29432p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14486u(parcel, 2, this.f29422f, false);
        SafeParcelWriter.m14486u(parcel, 3, this.f29423g, false);
        SafeParcelWriter.m14484s(parcel, 4, this.f29424h, i2, false);
        SafeParcelWriter.m14481p(parcel, 5, this.f29425i);
        SafeParcelWriter.m14468c(parcel, 6, this.f29426j);
        SafeParcelWriter.m14486u(parcel, 7, this.f29427k, false);
        SafeParcelWriter.m14484s(parcel, 8, this.f29428l, i2, false);
        SafeParcelWriter.m14481p(parcel, 9, this.f29429m);
        SafeParcelWriter.m14484s(parcel, 10, this.f29430n, i2, false);
        SafeParcelWriter.m14481p(parcel, 11, this.f29431o);
        SafeParcelWriter.m14484s(parcel, 12, this.f29432p, i2, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    @SafeParcelable.Constructor
    zzv(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) zzkj zzkjVar, @SafeParcelable.Param(id = 5) long j2, @SafeParcelable.Param(id = 6) boolean z, @SafeParcelable.Param(id = 7) String str3, @SafeParcelable.Param(id = 8) zzan zzanVar, @SafeParcelable.Param(id = 9) long j3, @SafeParcelable.Param(id = 10) zzan zzanVar2, @SafeParcelable.Param(id = 11) long j4, @SafeParcelable.Param(id = 12) zzan zzanVar3) {
        this.f29422f = str;
        this.f29423g = str2;
        this.f29424h = zzkjVar;
        this.f29425i = j2;
        this.f29426j = z;
        this.f29427k = str3;
        this.f29428l = zzanVar;
        this.f29429m = j3;
        this.f29430n = zzanVar2;
        this.f29431o = j4;
        this.f29432p = zzanVar3;
    }
}
