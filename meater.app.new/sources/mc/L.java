package mc;

import ic.InterfaceC3693a;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import lc.InterfaceC3942b;

/* compiled from: CollectionSerializers.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b!\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u000e\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B\u0017\b\u0000\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u00012\u0006\u0010\u000e\u001a\u00020\rH$¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lmc/L;", "Element", "Array", "", "Builder", "Lmc/k;", "Lic/a;", "primitiveSerializer", "<init>", "(Lic/a;)V", "Llc/b;", "encoder", "content", "", "size", "Loa/F;", "f", "(Llc/b;Ljava/lang/Object;I)V", "Llc/c;", "value", "a", "(Llc/c;Ljava/lang/Object;)V", "Lkc/f;", "b", "Lkc/f;", "c", "()Lkc/f;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class L<Element, Array, Builder> extends AbstractC4031k<Element, Array, Builder> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final kc.f descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(InterfaceC3693a<Element> primitiveSerializer) {
        super(primitiveSerializer, null);
        C3862t.g(primitiveSerializer, "primitiveSerializer");
        this.descriptor = new K(primitiveSerializer.getDescriptor());
    }

    @Override // ic.InterfaceC3698f
    public final void a(lc.c encoder, Array value) {
        C3862t.g(encoder, "encoder");
        int iE = e(value);
        kc.f fVar = this.descriptor;
        InterfaceC3942b interfaceC3942bE = encoder.e(fVar, iE);
        f(interfaceC3942bE, value, iE);
        interfaceC3942bE.p(fVar);
    }

    @Override // ic.InterfaceC3693a, ic.InterfaceC3698f
    /* renamed from: c, reason: from getter */
    public final kc.f getDescriptor() {
        return this.descriptor;
    }

    protected abstract void f(InterfaceC3942b encoder, Array content, int size);
}
