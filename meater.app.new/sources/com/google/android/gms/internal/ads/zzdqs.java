package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
public final class zzdqs extends RuntimeException {

    /* renamed from: f */
    private final List<String> f25801f;

    public zzdqs(zzdpk zzdpkVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f25801f = null;
    }

    /* renamed from: a */
    public final zzdok m19780a() {
        return new zzdok(getMessage());
    }
}
