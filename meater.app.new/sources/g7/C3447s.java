package g7;

import android.content.Context;
import android.content.res.Resources;
import c7.C2341j;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* renamed from: g7.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3447s {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f42111a;

    /* renamed from: b, reason: collision with root package name */
    private final String f42112b;

    public C3447s(Context context) {
        C3445p.k(context);
        Resources resources = context.getResources();
        this.f42111a = resources;
        this.f42112b = resources.getResourcePackageName(C2341j.f31093a);
    }

    public String a(String str) {
        int identifier = this.f42111a.getIdentifier(str, "string", this.f42112b);
        if (identifier == 0) {
            return null;
        }
        return this.f42111a.getString(identifier);
    }
}
