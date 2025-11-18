package com.android.installreferrer.api;

import android.os.Bundle;

/* loaded from: classes.dex */
public class ReferrerDetails {

    /* renamed from: a */
    private final Bundle f12954a;

    public ReferrerDetails(Bundle bundle) {
        this.f12954a = bundle;
    }

    /* renamed from: a */
    public String m9908a() {
        return this.f12954a.getString("install_referrer");
    }
}
