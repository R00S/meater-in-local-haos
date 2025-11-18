package com.google.firebase.encoders.p194i;

import com.google.firebase.encoders.C8326b;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.InterfaceC8330f;
import java.io.IOException;

/* compiled from: ProtobufValueEncoderContext.java */
/* renamed from: com.google.firebase.encoders.i.i */
/* loaded from: classes2.dex */
class C8347i implements InterfaceC8330f {

    /* renamed from: a */
    private boolean f31695a = false;

    /* renamed from: b */
    private boolean f31696b = false;

    /* renamed from: c */
    private C8326b f31697c;

    /* renamed from: d */
    private final C8345g f31698d;

    C8347i(C8345g c8345g) {
        this.f31698d = c8345g;
    }

    /* renamed from: a */
    private void m26156a() {
        if (this.f31695a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f31695a = true;
    }

    /* renamed from: b */
    void m26157b(C8326b c8326b, boolean z) {
        this.f31695a = false;
        this.f31697c = c8326b;
        this.f31696b = z;
    }

    @Override // com.google.firebase.encoders.InterfaceC8330f
    /* renamed from: f */
    public InterfaceC8330f mo26090f(String str) throws IOException {
        m26156a();
        this.f31698d.m26141j(this.f31697c, str, this.f31696b);
        return this;
    }

    @Override // com.google.firebase.encoders.InterfaceC8330f
    /* renamed from: g */
    public InterfaceC8330f mo26091g(boolean z) throws IOException {
        m26156a();
        this.f31698d.m26147p(this.f31697c, z, this.f31696b);
        return this;
    }
}
