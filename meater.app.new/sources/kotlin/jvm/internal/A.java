package kotlin.jvm.internal;

/* compiled from: MutablePropertyReference1Impl.java */
/* loaded from: classes2.dex */
public class A extends z {
    public A(Ia.g gVar, String str, String str2) {
        super(AbstractC3849f.NO_RECEIVER, ((InterfaceC3851h) gVar).f(), str, str2, !(gVar instanceof Ia.d) ? 1 : 0);
    }

    @Override // Ia.o
    public Object get(Object obj) {
        return h0().call(obj);
    }

    public A(Class cls, String str, String str2, int i10) {
        super(AbstractC3849f.NO_RECEIVER, cls, str, str2, i10);
    }
}
