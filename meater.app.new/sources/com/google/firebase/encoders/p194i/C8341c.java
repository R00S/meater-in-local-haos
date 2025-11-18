package com.google.firebase.encoders.p194i;

import com.google.firebase.encoders.p194i.InterfaceC8344f;
import java.lang.annotation.Annotation;

/* compiled from: AtProtobuf.java */
/* renamed from: com.google.firebase.encoders.i.c */
/* loaded from: classes2.dex */
public final class C8341c {

    /* renamed from: a */
    private int f31669a;

    /* renamed from: b */
    private InterfaceC8344f.a f31670b = InterfaceC8344f.a.DEFAULT;

    /* compiled from: AtProtobuf.java */
    /* renamed from: com.google.firebase.encoders.i.c$a */
    /* loaded from: classes.dex */
    private static final class a implements InterfaceC8344f {

        /* renamed from: a */
        private final int f31671a;

        /* renamed from: b */
        private final InterfaceC8344f.a f31672b;

        a(int i2, InterfaceC8344f.a aVar) {
            this.f31671a = i2;
            this.f31672b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return InterfaceC8344f.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InterfaceC8344f)) {
                return false;
            }
            InterfaceC8344f interfaceC8344f = (InterfaceC8344f) obj;
            return this.f31671a == interfaceC8344f.tag() && this.f31672b.equals(interfaceC8344f.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (this.f31671a ^ 14552422) + (this.f31672b.hashCode() ^ 2041407134);
        }

        @Override // com.google.firebase.encoders.p194i.InterfaceC8344f
        public InterfaceC8344f.a intEncoding() {
            return this.f31672b;
        }

        @Override // com.google.firebase.encoders.p194i.InterfaceC8344f
        public int tag() {
            return this.f31671a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f31671a + "intEncoding=" + this.f31672b + ')';
        }
    }

    /* renamed from: b */
    public static C8341c m26125b() {
        return new C8341c();
    }

    /* renamed from: a */
    public InterfaceC8344f m26126a() {
        return new a(this.f31669a, this.f31670b);
    }

    /* renamed from: c */
    public C8341c m26127c(int i2) {
        this.f31669a = i2;
        return this;
    }
}
