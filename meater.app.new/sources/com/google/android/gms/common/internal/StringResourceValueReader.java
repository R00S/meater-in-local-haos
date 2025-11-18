package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.C6349R;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class StringResourceValueReader {

    /* renamed from: a */
    private final Resources f17799a;

    /* renamed from: b */
    private final String f17800b;

    public StringResourceValueReader(Context context) {
        Preconditions.m14372k(context);
        Resources resources = context.getResources();
        this.f17799a = resources;
        this.f17800b = resources.getResourcePackageName(C6349R.string.f17225a);
    }

    @KeepForSdk
    /* renamed from: a */
    public String m14401a(String str) {
        int identifier = this.f17799a.getIdentifier(str, "string", this.f17800b);
        if (identifier == 0) {
            return null;
        }
        return this.f17799a.getString(identifier);
    }
}
