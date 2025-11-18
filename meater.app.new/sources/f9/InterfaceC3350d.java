package f9;

/* compiled from: Protobuf.java */
/* renamed from: f9.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public @interface InterfaceC3350d {

    /* compiled from: Protobuf.java */
    /* renamed from: f9.d$a */
    public enum a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    a intEncoding() default a.DEFAULT;

    int tag();
}
