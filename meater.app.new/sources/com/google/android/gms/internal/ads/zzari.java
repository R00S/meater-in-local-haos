package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

@zzard
@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzari extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzari> CREATOR = new zzarj();

    /* renamed from: A */
    @SafeParcelable.Field
    private final boolean f22354A;

    /* renamed from: B */
    @SafeParcelable.Field
    private final boolean f22355B;

    /* renamed from: C */
    @SafeParcelable.Field
    private zzaru f22356C;

    /* renamed from: D */
    @SafeParcelable.Field
    private String f22357D;

    /* renamed from: E */
    @SafeParcelable.Field
    private final String f22358E;

    /* renamed from: F */
    @SafeParcelable.Field
    private final boolean f22359F;

    /* renamed from: G */
    @SafeParcelable.Field
    private final boolean f22360G;

    /* renamed from: H */
    @SafeParcelable.Field
    private final zzato f22361H;

    /* renamed from: I */
    @SafeParcelable.Field
    private final List<String> f22362I;

    /* renamed from: J */
    @SafeParcelable.Field
    private final List<String> f22363J;

    /* renamed from: K */
    @SafeParcelable.Field
    private final boolean f22364K;

    /* renamed from: L */
    @SafeParcelable.Field
    private final zzark f22365L;

    /* renamed from: M */
    @SafeParcelable.Field
    private final boolean f22366M;

    /* renamed from: N */
    @SafeParcelable.Field
    private String f22367N;

    /* renamed from: O */
    @SafeParcelable.Field
    private final List<String> f22368O;

    /* renamed from: P */
    @SafeParcelable.Field
    private final boolean f22369P;

    /* renamed from: Q */
    @SafeParcelable.Field
    private final String f22370Q;

    /* renamed from: R */
    @SafeParcelable.Field
    private final zzauy f22371R;

    /* renamed from: S */
    @SafeParcelable.Field
    private final String f22372S;

    /* renamed from: T */
    @SafeParcelable.Field
    private final boolean f22373T;

    /* renamed from: U */
    @SafeParcelable.Field
    private final boolean f22374U;

    /* renamed from: V */
    @SafeParcelable.Field
    private Bundle f22375V;

    /* renamed from: W */
    @SafeParcelable.Field
    private final boolean f22376W;

    /* renamed from: X */
    @SafeParcelable.Field
    private final int f22377X;

    /* renamed from: Y */
    @SafeParcelable.Field
    private final boolean f22378Y;

    /* renamed from: Z */
    @SafeParcelable.Field
    private final List<String> f22379Z;

    /* renamed from: a0 */
    @SafeParcelable.Field
    private final boolean f22380a0;

    /* renamed from: b0 */
    @SafeParcelable.Field
    private final String f22381b0;

    /* renamed from: c0 */
    @SafeParcelable.Field
    private String f22382c0;

    /* renamed from: d0 */
    @SafeParcelable.Field
    private boolean f22383d0;

    /* renamed from: e0 */
    @SafeParcelable.Field
    private boolean f22384e0;

    /* renamed from: f */
    @SafeParcelable.Field
    private final int f22385f;

    /* renamed from: g */
    @SafeParcelable.Field
    private final String f22386g;

    /* renamed from: h */
    @SafeParcelable.Field
    private String f22387h;

    /* renamed from: i */
    @SafeParcelable.Field
    private final List<String> f22388i;

    /* renamed from: j */
    @SafeParcelable.Field
    private final int f22389j;

    /* renamed from: k */
    @SafeParcelable.Field
    private final List<String> f22390k;

    /* renamed from: l */
    @SafeParcelable.Field
    private final long f22391l;

    /* renamed from: m */
    @SafeParcelable.Field
    private final boolean f22392m;

    /* renamed from: n */
    @SafeParcelable.Field
    private final long f22393n;

    /* renamed from: o */
    @SafeParcelable.Field
    private final List<String> f22394o;

    /* renamed from: p */
    @SafeParcelable.Field
    private final long f22395p;

    /* renamed from: q */
    @SafeParcelable.Field
    private final int f22396q;

    /* renamed from: r */
    @SafeParcelable.Field
    private final String f22397r;

    /* renamed from: s */
    @SafeParcelable.Field
    private final long f22398s;

    /* renamed from: t */
    @SafeParcelable.Field
    private final String f22399t;

    /* renamed from: u */
    @SafeParcelable.Field
    private final boolean f22400u;

    /* renamed from: v */
    @SafeParcelable.Field
    private final String f22401v;

    /* renamed from: w */
    @SafeParcelable.Field
    private final String f22402w;

    /* renamed from: x */
    @SafeParcelable.Field
    private final boolean f22403x;

    /* renamed from: y */
    @SafeParcelable.Field
    private final boolean f22404y;

    /* renamed from: z */
    @SafeParcelable.Field
    private final boolean f22405z;

    @SafeParcelable.Constructor
    zzari(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) List<String> list, @SafeParcelable.Param(id = 5) int i3, @SafeParcelable.Param(id = 6) List<String> list2, @SafeParcelable.Param(id = 7) long j2, @SafeParcelable.Param(id = 8) boolean z, @SafeParcelable.Param(id = 9) long j3, @SafeParcelable.Param(id = 10) List<String> list3, @SafeParcelable.Param(id = 11) long j4, @SafeParcelable.Param(id = 12) int i4, @SafeParcelable.Param(id = 13) String str3, @SafeParcelable.Param(id = 14) long j5, @SafeParcelable.Param(id = 15) String str4, @SafeParcelable.Param(id = 18) boolean z2, @SafeParcelable.Param(id = 19) String str5, @SafeParcelable.Param(id = 21) String str6, @SafeParcelable.Param(id = 22) boolean z3, @SafeParcelable.Param(id = 23) boolean z4, @SafeParcelable.Param(id = 24) boolean z5, @SafeParcelable.Param(id = 25) boolean z6, @SafeParcelable.Param(id = 26) boolean z7, @SafeParcelable.Param(id = 28) zzaru zzaruVar, @SafeParcelable.Param(id = 29) String str7, @SafeParcelable.Param(id = 30) String str8, @SafeParcelable.Param(id = 31) boolean z8, @SafeParcelable.Param(id = 32) boolean z9, @SafeParcelable.Param(id = 33) zzato zzatoVar, @SafeParcelable.Param(id = 34) List<String> list4, @SafeParcelable.Param(id = 35) List<String> list5, @SafeParcelable.Param(id = 36) boolean z10, @SafeParcelable.Param(id = 37) zzark zzarkVar, @SafeParcelable.Param(id = 38) boolean z11, @SafeParcelable.Param(id = 39) String str9, @SafeParcelable.Param(id = 40) List<String> list6, @SafeParcelable.Param(id = 42) boolean z12, @SafeParcelable.Param(id = 43) String str10, @SafeParcelable.Param(id = 44) zzauy zzauyVar, @SafeParcelable.Param(id = 45) String str11, @SafeParcelable.Param(id = 46) boolean z13, @SafeParcelable.Param(id = 47) boolean z14, @SafeParcelable.Param(id = 48) Bundle bundle, @SafeParcelable.Param(id = 49) boolean z15, @SafeParcelable.Param(id = 50) int i5, @SafeParcelable.Param(id = 51) boolean z16, @SafeParcelable.Param(id = 52) List<String> list7, @SafeParcelable.Param(id = 53) boolean z17, @SafeParcelable.Param(id = 54) String str12, @SafeParcelable.Param(id = 55) String str13, @SafeParcelable.Param(id = 56) boolean z18, @SafeParcelable.Param(id = 57) boolean z19) {
        zzarz zzarzVar;
        this.f22385f = i2;
        this.f22386g = str;
        this.f22387h = str2;
        this.f22388i = list != null ? Collections.unmodifiableList(list) : null;
        this.f22389j = i3;
        this.f22390k = list2 != null ? Collections.unmodifiableList(list2) : null;
        this.f22391l = j2;
        this.f22392m = z;
        this.f22393n = j3;
        this.f22394o = list3 != null ? Collections.unmodifiableList(list3) : null;
        this.f22395p = j4;
        this.f22396q = i4;
        this.f22397r = str3;
        this.f22398s = j5;
        this.f22399t = str4;
        this.f22400u = z2;
        this.f22401v = str5;
        this.f22402w = str6;
        this.f22403x = z3;
        this.f22404y = z4;
        this.f22405z = z5;
        this.f22354A = z6;
        this.f22373T = z13;
        this.f22355B = z7;
        this.f22356C = zzaruVar;
        this.f22357D = str7;
        this.f22358E = str8;
        if (this.f22387h == null && zzaruVar != null && (zzarzVar = (zzarz) zzaruVar.m16900y(zzarz.CREATOR)) != null && !TextUtils.isEmpty(zzarzVar.f22420f)) {
            this.f22387h = zzarzVar.f22420f;
        }
        this.f22359F = z8;
        this.f22360G = z9;
        this.f22361H = zzatoVar;
        this.f22362I = list4;
        this.f22363J = list5;
        this.f22364K = z10;
        this.f22365L = zzarkVar;
        this.f22366M = z11;
        this.f22367N = str9;
        this.f22368O = list6;
        this.f22369P = z12;
        this.f22370Q = str10;
        this.f22371R = zzauyVar;
        this.f22372S = str11;
        this.f22374U = z14;
        this.f22375V = bundle;
        this.f22376W = z15;
        this.f22377X = i5;
        this.f22378Y = z16;
        this.f22379Z = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f22380a0 = z17;
        this.f22381b0 = str12;
        this.f22382c0 = str13;
        this.f22383d0 = z18;
        this.f22384e0 = z19;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f22385f);
        SafeParcelWriter.m14486u(parcel, 2, this.f22386g, false);
        SafeParcelWriter.m14486u(parcel, 3, this.f22387h, false);
        SafeParcelWriter.m14488w(parcel, 4, this.f22388i, false);
        SafeParcelWriter.m14477l(parcel, 5, this.f22389j);
        SafeParcelWriter.m14488w(parcel, 6, this.f22390k, false);
        SafeParcelWriter.m14481p(parcel, 7, this.f22391l);
        SafeParcelWriter.m14468c(parcel, 8, this.f22392m);
        SafeParcelWriter.m14481p(parcel, 9, this.f22393n);
        SafeParcelWriter.m14488w(parcel, 10, this.f22394o, false);
        SafeParcelWriter.m14481p(parcel, 11, this.f22395p);
        SafeParcelWriter.m14477l(parcel, 12, this.f22396q);
        SafeParcelWriter.m14486u(parcel, 13, this.f22397r, false);
        SafeParcelWriter.m14481p(parcel, 14, this.f22398s);
        SafeParcelWriter.m14486u(parcel, 15, this.f22399t, false);
        SafeParcelWriter.m14468c(parcel, 18, this.f22400u);
        SafeParcelWriter.m14486u(parcel, 19, this.f22401v, false);
        SafeParcelWriter.m14486u(parcel, 21, this.f22402w, false);
        SafeParcelWriter.m14468c(parcel, 22, this.f22403x);
        SafeParcelWriter.m14468c(parcel, 23, this.f22404y);
        SafeParcelWriter.m14468c(parcel, 24, this.f22405z);
        SafeParcelWriter.m14468c(parcel, 25, this.f22354A);
        SafeParcelWriter.m14468c(parcel, 26, this.f22355B);
        SafeParcelWriter.m14484s(parcel, 28, this.f22356C, i2, false);
        SafeParcelWriter.m14486u(parcel, 29, this.f22357D, false);
        SafeParcelWriter.m14486u(parcel, 30, this.f22358E, false);
        SafeParcelWriter.m14468c(parcel, 31, this.f22359F);
        SafeParcelWriter.m14468c(parcel, 32, this.f22360G);
        SafeParcelWriter.m14484s(parcel, 33, this.f22361H, i2, false);
        SafeParcelWriter.m14488w(parcel, 34, this.f22362I, false);
        SafeParcelWriter.m14488w(parcel, 35, this.f22363J, false);
        SafeParcelWriter.m14468c(parcel, 36, this.f22364K);
        SafeParcelWriter.m14484s(parcel, 37, this.f22365L, i2, false);
        SafeParcelWriter.m14468c(parcel, 38, this.f22366M);
        SafeParcelWriter.m14486u(parcel, 39, this.f22367N, false);
        SafeParcelWriter.m14488w(parcel, 40, this.f22368O, false);
        SafeParcelWriter.m14468c(parcel, 42, this.f22369P);
        SafeParcelWriter.m14486u(parcel, 43, this.f22370Q, false);
        SafeParcelWriter.m14484s(parcel, 44, this.f22371R, i2, false);
        SafeParcelWriter.m14486u(parcel, 45, this.f22372S, false);
        SafeParcelWriter.m14468c(parcel, 46, this.f22373T);
        SafeParcelWriter.m14468c(parcel, 47, this.f22374U);
        SafeParcelWriter.m14470e(parcel, 48, this.f22375V, false);
        SafeParcelWriter.m14468c(parcel, 49, this.f22376W);
        SafeParcelWriter.m14477l(parcel, 50, this.f22377X);
        SafeParcelWriter.m14468c(parcel, 51, this.f22378Y);
        SafeParcelWriter.m14488w(parcel, 52, this.f22379Z, false);
        SafeParcelWriter.m14468c(parcel, 53, this.f22380a0);
        SafeParcelWriter.m14486u(parcel, 54, this.f22381b0, false);
        SafeParcelWriter.m14486u(parcel, 55, this.f22382c0, false);
        SafeParcelWriter.m14468c(parcel, 56, this.f22383d0);
        SafeParcelWriter.m14468c(parcel, 57, this.f22384e0);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }
}
