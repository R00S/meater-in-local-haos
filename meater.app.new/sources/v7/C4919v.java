package v7;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import c7.C2341j;
import g7.C3445p;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.2.0 */
/* renamed from: v7.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4919v {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f51576a;

    /* renamed from: b, reason: collision with root package name */
    private final String f51577b;

    public C4919v(Context context, String str) {
        C3445p.k(context);
        this.f51576a = context.getResources();
        if (TextUtils.isEmpty(str)) {
            this.f51577b = a(context);
        } else {
            this.f51577b = str;
        }
    }

    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(C2341j.f31093a);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public final String b(String str) {
        int identifier = this.f51576a.getIdentifier(str, "string", this.f51577b);
        if (identifier == 0) {
            return null;
        }
        try {
            return this.f51576a.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
