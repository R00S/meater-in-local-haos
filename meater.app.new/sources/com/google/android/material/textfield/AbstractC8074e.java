package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: EndIconDelegate.java */
/* renamed from: com.google.android.material.textfield.e */
/* loaded from: classes2.dex */
abstract class AbstractC8074e {

    /* renamed from: a */
    TextInputLayout f30559a;

    /* renamed from: b */
    Context f30560b;

    /* renamed from: c */
    CheckableImageButton f30561c;

    AbstractC8074e(TextInputLayout textInputLayout) {
        this.f30559a = textInputLayout;
        this.f30560b = textInputLayout.getContext();
        this.f30561c = textInputLayout.getEndIconView();
    }

    /* renamed from: a */
    abstract void mo24807a();

    /* renamed from: b */
    boolean mo24846b(int i2) {
        return true;
    }

    /* renamed from: c */
    void mo24808c(boolean z) {
    }

    /* renamed from: d */
    boolean mo24847d() {
        return false;
    }
}
