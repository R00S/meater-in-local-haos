package lc;

import ic.InterfaceC3698f;
import kc.f;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: Encoding.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0019H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u001cH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0010H&¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u001fH&¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020\u001fH&¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020'2\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u0010H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u00100\u001a\u00020-8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Llc/c;", "", "", "value", "Loa/F;", "g", "(Z)V", "", "f", "(B)V", "", "d", "(S)V", "", "o", "(C)V", "", "u", "(I)V", "", "x", "(J)V", "", "m", "(F)V", "", "c", "(D)V", "", "z", "(Ljava/lang/String;)V", "Lkc/f;", "enumDescriptor", "index", "s", "(Lkc/f;I)V", "descriptor", "i", "(Lkc/f;)Llc/c;", "Llc/b;", "b", "(Lkc/f;)Llc/b;", "collectionSize", "e", "(Lkc/f;I)Llc/b;", "Lnc/b;", "n", "()Lnc/b;", "serializersModule", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface c {

    /* compiled from: Encoding.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static InterfaceC3942b a(c cVar, f descriptor, int i10) {
            C3862t.g(descriptor, "descriptor");
            return cVar.b(descriptor);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <T> void b(c cVar, InterfaceC3698f<? super T> serializer, T t10) {
            C3862t.g(serializer, "serializer");
            serializer.a(cVar, t10);
        }
    }

    InterfaceC3942b b(f descriptor);

    void c(double value);

    void d(short value);

    InterfaceC3942b e(f descriptor, int collectionSize);

    void f(byte value);

    void g(boolean value);

    c i(f descriptor);

    void m(float value);

    nc.b n();

    void o(char value);

    void s(f enumDescriptor, int index);

    void u(int value);

    void x(long value);

    void z(String value);
}
