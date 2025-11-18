package com.google.android.gms.common.internal;

import android.content.Intent;
import androidx.fragment.app.Fragment;

/* renamed from: com.google.android.gms.common.internal.b */
/* loaded from: classes2.dex */
final class C6419b extends DialogRedirect {

    /* renamed from: f */
    private final /* synthetic */ Intent f17804f;

    /* renamed from: g */
    private final /* synthetic */ Fragment f17805g;

    /* renamed from: h */
    private final /* synthetic */ int f17806h;

    C6419b(Intent intent, Fragment fragment, int i2) {
        this.f17804f = intent;
        this.f17805g = fragment;
        this.f17806h = i2;
    }

    @Override // com.google.android.gms.common.internal.DialogRedirect
    /* renamed from: d */
    public final void mo14324d() {
        Intent intent = this.f17804f;
        if (intent != null) {
            this.f17805g.startActivityForResult(intent, this.f17806h);
        }
    }
}
