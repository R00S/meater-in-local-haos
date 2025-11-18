package com.google.firebase.encoders.p194i;

/* compiled from: Protobuf.java */
/* renamed from: com.google.firebase.encoders.i.f */
/* loaded from: classes.dex */
public @interface InterfaceC8344f {

    /* compiled from: Protobuf.java */
    /* renamed from: com.google.firebase.encoders.i.f$a */
    public enum a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    a intEncoding() default a.DEFAULT;

    int tag();
}
