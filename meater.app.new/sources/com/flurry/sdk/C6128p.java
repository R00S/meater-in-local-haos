package com.flurry.sdk;

import android.os.Bundle;

/* renamed from: com.flurry.sdk.p */
/* loaded from: classes2.dex */
public final class C6128p {

    /* renamed from: a */
    public final a f16208a;

    /* renamed from: b */
    public final Bundle f16209b;

    /* renamed from: com.flurry.sdk.p$a */
    public enum a {
        CREATED,
        STARTED,
        RESUMED,
        PAUSED,
        STOPPED,
        DESTROYED,
        SAVE_STATE,
        APP_ORIENTATION_CHANGE,
        APP_BACKGROUND,
        TRIM_MEMORY
    }

    public C6128p(a aVar, Bundle bundle) {
        this.f16208a = aVar;
        this.f16209b = bundle;
    }
}
