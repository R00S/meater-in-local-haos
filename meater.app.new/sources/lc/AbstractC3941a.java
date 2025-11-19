package lc;

import ic.InterfaceC3698f;
import kc.f;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import lc.c;
import mc.C4020B;

/* compiled from: AbstractEncoder.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b1\u00102J%\u00103\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b3\u00104J%\u00105\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0017¢\u0006\u0004\b5\u00106J%\u00107\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u001a¢\u0006\u0004\b7\u00108J%\u00109\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b9\u0010:J%\u0010;\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u001f¢\u0006\u0004\b;\u0010<J%\u0010=\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\"¢\u0006\u0004\b=\u0010>J%\u0010?\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020%¢\u0006\u0004\b?\u0010@J%\u0010A\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020(¢\u0006\u0004\bA\u0010BJ%\u0010C\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020+¢\u0006\u0004\bC\u0010DJ\u001d\u0010E\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\bE\u0010FJ;\u0010J\u001a\u00020\t\"\u0004\b\u0000\u0010G2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\f\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000H2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0004\bJ\u0010K¨\u0006L"}, d2 = {"Llc/a;", "Llc/c;", "Llc/b;", "<init>", "()V", "Lkc/f;", "descriptor", "b", "(Lkc/f;)Llc/b;", "Loa/F;", "p", "(Lkc/f;)V", "", "index", "", "A", "(Lkc/f;I)Z", "", "value", "C", "(Ljava/lang/Object;)V", "g", "(Z)V", "", "f", "(B)V", "", "d", "(S)V", "u", "(I)V", "", "x", "(J)V", "", "m", "(F)V", "", "c", "(D)V", "", "o", "(C)V", "", "z", "(Ljava/lang/String;)V", "enumDescriptor", "s", "(Lkc/f;I)V", "i", "(Lkc/f;)Llc/c;", "l", "(Lkc/f;IZ)V", "a", "(Lkc/f;IB)V", "v", "(Lkc/f;IS)V", "q", "(Lkc/f;II)V", "t", "(Lkc/f;IJ)V", "y", "(Lkc/f;IF)V", "k", "(Lkc/f;ID)V", "h", "(Lkc/f;IC)V", "r", "(Lkc/f;ILjava/lang/String;)V", "w", "(Lkc/f;I)Llc/c;", "T", "Lic/f;", "serializer", "j", "(Lkc/f;ILic/f;Ljava/lang/Object;)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3941a implements c, InterfaceC3942b {
    public boolean A(f descriptor, int index) {
        C3862t.g(descriptor, "descriptor");
        return true;
    }

    public <T> void B(InterfaceC3698f<? super T> interfaceC3698f, T t10) {
        c.a.b(this, interfaceC3698f, t10);
    }

    public abstract void C(Object value);

    @Override // lc.InterfaceC3942b
    public final void a(f descriptor, int index, byte value) {
        C3862t.g(descriptor, "descriptor");
        if (A(descriptor, index)) {
            f(value);
        }
    }

    @Override // lc.c
    public InterfaceC3942b b(f descriptor) {
        C3862t.g(descriptor, "descriptor");
        return this;
    }

    @Override // lc.c
    public void c(double value) {
        C(Double.valueOf(value));
    }

    @Override // lc.c
    public void d(short value) {
        C(Short.valueOf(value));
    }

    @Override // lc.c
    public InterfaceC3942b e(f fVar, int i10) {
        return c.a.a(this, fVar, i10);
    }

    @Override // lc.c
    public void f(byte value) {
        C(Byte.valueOf(value));
    }

    @Override // lc.c
    public void g(boolean value) {
        C(Boolean.valueOf(value));
    }

    @Override // lc.InterfaceC3942b
    public final void h(f descriptor, int index, char value) {
        C3862t.g(descriptor, "descriptor");
        if (A(descriptor, index)) {
            o(value);
        }
    }

    @Override // lc.c
    public c i(f descriptor) {
        C3862t.g(descriptor, "descriptor");
        return this;
    }

    @Override // lc.InterfaceC3942b
    public <T> void j(f descriptor, int index, InterfaceC3698f<? super T> serializer, T value) {
        C3862t.g(descriptor, "descriptor");
        C3862t.g(serializer, "serializer");
        if (A(descriptor, index)) {
            B(serializer, value);
        }
    }

    @Override // lc.InterfaceC3942b
    public final void k(f descriptor, int index, double value) {
        C3862t.g(descriptor, "descriptor");
        if (A(descriptor, index)) {
            c(value);
        }
    }

    @Override // lc.InterfaceC3942b
    public final void l(f descriptor, int index, boolean value) {
        C3862t.g(descriptor, "descriptor");
        if (A(descriptor, index)) {
            g(value);
        }
    }

    @Override // lc.c
    public void m(float value) {
        C(Float.valueOf(value));
    }

    @Override // lc.c
    public void o(char value) {
        C(Character.valueOf(value));
    }

    @Override // lc.InterfaceC3942b
    public void p(f descriptor) {
        C3862t.g(descriptor, "descriptor");
    }

    @Override // lc.InterfaceC3942b
    public final void q(f descriptor, int index, int value) {
        C3862t.g(descriptor, "descriptor");
        if (A(descriptor, index)) {
            u(value);
        }
    }

    @Override // lc.InterfaceC3942b
    public final void r(f descriptor, int index, String value) {
        C3862t.g(descriptor, "descriptor");
        C3862t.g(value, "value");
        if (A(descriptor, index)) {
            z(value);
        }
    }

    @Override // lc.c
    public void s(f enumDescriptor, int index) {
        C3862t.g(enumDescriptor, "enumDescriptor");
        C(Integer.valueOf(index));
    }

    @Override // lc.InterfaceC3942b
    public final void t(f descriptor, int index, long value) {
        C3862t.g(descriptor, "descriptor");
        if (A(descriptor, index)) {
            x(value);
        }
    }

    @Override // lc.c
    public void u(int value) {
        C(Integer.valueOf(value));
    }

    @Override // lc.InterfaceC3942b
    public final void v(f descriptor, int index, short value) {
        C3862t.g(descriptor, "descriptor");
        if (A(descriptor, index)) {
            d(value);
        }
    }

    @Override // lc.InterfaceC3942b
    public final c w(f descriptor, int index) {
        C3862t.g(descriptor, "descriptor");
        return A(descriptor, index) ? i(descriptor.e(index)) : C4020B.f45437a;
    }

    @Override // lc.c
    public void x(long value) {
        C(Long.valueOf(value));
    }

    @Override // lc.InterfaceC3942b
    public final void y(f descriptor, int index, float value) {
        C3862t.g(descriptor, "descriptor");
        if (A(descriptor, index)) {
            m(value);
        }
    }

    @Override // lc.c
    public void z(String value) {
        C3862t.g(value, "value");
        C(value);
    }
}
