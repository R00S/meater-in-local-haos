package f9;

import f9.InterfaceC3350d;
import java.lang.annotation.Annotation;

/* compiled from: AtProtobuf.java */
/* renamed from: f9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3347a {

    /* renamed from: a, reason: collision with root package name */
    private int f41382a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC3350d.a f41383b = InterfaceC3350d.a.DEFAULT;

    /* compiled from: AtProtobuf.java */
    /* renamed from: f9.a$a, reason: collision with other inner class name */
    private static final class C0519a implements InterfaceC3350d {

        /* renamed from: a, reason: collision with root package name */
        private final int f41384a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3350d.a f41385b;

        C0519a(int i10, InterfaceC3350d.a aVar) {
            this.f41384a = i10;
            this.f41385b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return InterfaceC3350d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InterfaceC3350d)) {
                return false;
            }
            InterfaceC3350d interfaceC3350d = (InterfaceC3350d) obj;
            return this.f41384a == interfaceC3350d.tag() && this.f41385b.equals(interfaceC3350d.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f41384a) + (this.f41385b.hashCode() ^ 2041407134);
        }

        @Override // f9.InterfaceC3350d
        public InterfaceC3350d.a intEncoding() {
            return this.f41385b;
        }

        @Override // f9.InterfaceC3350d
        public int tag() {
            return this.f41384a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f41384a + "intEncoding=" + this.f41385b + ')';
        }
    }

    public static C3347a b() {
        return new C3347a();
    }

    public InterfaceC3350d a() {
        return new C0519a(this.f41382a, this.f41383b);
    }

    public C3347a c(int i10) {
        this.f41382a = i10;
        return this;
    }
}
