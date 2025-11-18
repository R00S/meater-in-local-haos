package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class zzl {

    /* renamed from: a */
    private final String f26449a;

    /* renamed from: b */
    private final String f26450b;

    public zzl(String str, String str2) {
        this.f26449a = str;
        this.f26450b = str2;
    }

    /* renamed from: a */
    public final String m20195a() {
        return this.f26449a;
    }

    /* renamed from: b */
    public final String m20196b() {
        return this.f26450b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzl.class == obj.getClass()) {
            zzl zzlVar = (zzl) obj;
            if (TextUtils.equals(this.f26449a, zzlVar.f26449a) && TextUtils.equals(this.f26450b, zzlVar.f26450b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f26449a.hashCode() * 31) + this.f26450b.hashCode();
    }

    public final String toString() {
        String str = this.f26449a;
        String str2 = this.f26450b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length());
        sb.append("Header[name=");
        sb.append(str);
        sb.append(",value=");
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }
}
