package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class zzrh {

    /* renamed from: a */
    public final String f26908a;

    /* renamed from: b */
    public final String f26909b;

    /* renamed from: c */
    public final boolean f26910c;

    /* renamed from: d */
    public final boolean f26911d;

    /* renamed from: e */
    public final int f26912e;

    /* renamed from: f */
    public final int f26913f;

    /* renamed from: g */
    public final int f26914g;

    /* renamed from: h */
    public final boolean f26915h;

    /* renamed from: i */
    public final boolean f26916i;

    /* renamed from: j */
    public final int f26917j;

    /* renamed from: k */
    public final int f26918k;

    /* renamed from: l */
    public final boolean f26919l;

    public zzrh() {
        this(null, null, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzrh.class == obj.getClass()) {
            zzrh zzrhVar = (zzrh) obj;
            if (this.f26911d == zzrhVar.f26911d && this.f26912e == zzrhVar.f26912e && this.f26913f == zzrhVar.f26913f && this.f26915h == zzrhVar.f26915h && this.f26916i == zzrhVar.f26916i && this.f26919l == zzrhVar.f26919l && this.f26917j == zzrhVar.f26917j && this.f26918k == zzrhVar.f26918k && this.f26914g == zzrhVar.f26914g && TextUtils.equals(null, null) && TextUtils.equals(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }

    private zzrh(String str, String str2, boolean z, boolean z2, int i2, int i3, int i4, boolean z3, boolean z4, int i5, int i6, boolean z5) {
        this.f26908a = null;
        this.f26909b = null;
        this.f26910c = false;
        this.f26911d = true;
        this.f26912e = Integer.MAX_VALUE;
        this.f26913f = Integer.MAX_VALUE;
        this.f26914g = Integer.MAX_VALUE;
        this.f26915h = true;
        this.f26916i = true;
        this.f26917j = Integer.MAX_VALUE;
        this.f26918k = Integer.MAX_VALUE;
        this.f26919l = true;
    }
}
