package q9;

import com.google.firebase.messaging.I;
import f9.InterfaceC3350d;

/* compiled from: MessagingClientEventExtension.java */
/* renamed from: q9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4321b {

    /* renamed from: b, reason: collision with root package name */
    private static final C4321b f48167b = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final C4320a f48168a;

    /* compiled from: MessagingClientEventExtension.java */
    /* renamed from: q9.b$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private C4320a f48169a = null;

        a() {
        }

        public C4321b a() {
            return new C4321b(this.f48169a);
        }

        public a b(C4320a c4320a) {
            this.f48169a = c4320a;
            return this;
        }
    }

    C4321b(C4320a c4320a) {
        this.f48168a = c4320a;
    }

    public static a b() {
        return new a();
    }

    @InterfaceC3350d(tag = 1)
    public C4320a a() {
        return this.f48168a;
    }

    public byte[] c() {
        return I.a(this);
    }
}
