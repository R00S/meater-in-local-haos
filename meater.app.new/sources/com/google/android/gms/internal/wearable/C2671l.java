package com.google.android.gms.internal.wearable;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* renamed from: com.google.android.gms.internal.wearable.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2671l {

    /* renamed from: a, reason: collision with root package name */
    private final String f34639a;

    /* renamed from: b, reason: collision with root package name */
    private final C2668k f34640b;

    /* renamed from: c, reason: collision with root package name */
    private C2668k f34641c;

    /* synthetic */ C2671l(String str, C2674m c2674m) {
        C2668k c2668k = new C2668k();
        this.f34640b = c2668k;
        this.f34641c = c2668k;
        str.getClass();
        this.f34639a = str;
    }

    public final C2671l a(String str, int i10) {
        String strValueOf = String.valueOf(i10);
        C2665j c2665j = new C2665j(null);
        this.f34641c.f34638c = c2665j;
        this.f34641c = c2665j;
        c2665j.f34637b = strValueOf;
        c2665j.f34636a = "filterType";
        return this;
    }

    public final C2671l b(String str, Object obj) {
        C2668k c2668k = new C2668k();
        this.f34641c.f34638c = c2668k;
        this.f34641c = c2668k;
        c2668k.f34637b = obj;
        c2668k.f34636a = str;
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f34639a);
        sb2.append('{');
        C2668k c2668k = this.f34640b.f34638c;
        String str = "";
        while (c2668k != null) {
            Object obj = c2668k.f34637b;
            sb2.append(str);
            String str2 = c2668k.f34636a;
            if (str2 != null) {
                sb2.append(str2);
                sb2.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                sb2.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
            }
            c2668k = c2668k.f34638c;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }
}
