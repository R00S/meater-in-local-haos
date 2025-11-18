package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class zzn {

    /* renamed from: a */
    private static final Uri f17861a = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: b */
    private final String f17862b;

    /* renamed from: c */
    private final String f17863c;

    /* renamed from: d */
    private final ComponentName f17864d;

    /* renamed from: e */
    private final int f17865e;

    /* renamed from: f */
    private final boolean f17866f;

    public zzn(String str, String str2, int i2, boolean z) {
        Preconditions.m14368g(str);
        this.f17862b = str;
        Preconditions.m14368g(str2);
        this.f17863c = str2;
        this.f17864d = null;
        this.f17865e = i2;
        this.f17866f = z;
    }

    /* renamed from: a */
    public final int m14507a() {
        return this.f17865e;
    }

    /* renamed from: b */
    public final ComponentName m14508b() {
        return this.f17864d;
    }

    /* renamed from: c */
    public final Intent m14509c(Context context) {
        Bundle bundleCall;
        if (this.f17862b == null) {
            return new Intent().setComponent(this.f17864d);
        }
        if (this.f17866f) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", this.f17862b);
            try {
                bundleCall = context.getContentResolver().call(f17861a, "serviceIntentCall", (String) null, bundle);
            } catch (IllegalArgumentException e2) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e2.toString()));
                bundleCall = null;
            }
            intent = bundleCall != null ? (Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
            if (intent == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f17862b)));
            }
        }
        return intent != null ? intent : new Intent(this.f17862b).setPackage(this.f17863c);
    }

    /* renamed from: d */
    public final String m14510d() {
        return this.f17863c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzn)) {
            return false;
        }
        zzn zznVar = (zzn) obj;
        return Objects.m14355a(this.f17862b, zznVar.f17862b) && Objects.m14355a(this.f17863c, zznVar.f17863c) && Objects.m14355a(this.f17864d, zznVar.f17864d) && this.f17865e == zznVar.f17865e && this.f17866f == zznVar.f17866f;
    }

    public final int hashCode() {
        return Objects.m14356b(this.f17862b, this.f17863c, this.f17864d, Integer.valueOf(this.f17865e), Boolean.valueOf(this.f17866f));
    }

    public final String toString() {
        String str = this.f17862b;
        if (str != null) {
            return str;
        }
        Preconditions.m14372k(this.f17864d);
        return this.f17864d.flattenToString();
    }
}
