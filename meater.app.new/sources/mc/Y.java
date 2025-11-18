package mc;

import ic.InterfaceC3693a;
import jc.C3780a;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import lc.InterfaceC3942b;
import oa.C4151D;
import oa.C4152E;

/* compiled from: PrimitiveArraysSerializers.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\u00020\b*\u00020\u0002H\u0014ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ*\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\bH\u0014ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Lmc/Y;", "Lic/a;", "Loa/E;", "Lmc/L;", "Loa/D;", "", "<init>", "()V", "", "g", "([S)I", "Llc/b;", "encoder", "content", "size", "Loa/F;", "h", "(Llc/b;[SI)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Y extends L<C4151D, C4152E, Object> implements InterfaceC3693a<C4152E> {

    /* renamed from: c, reason: collision with root package name */
    public static final Y f45486c = new Y();

    private Y() {
        super(C3780a.A(C4151D.INSTANCE));
    }

    @Override // mc.AbstractC4021a
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return g(((C4152E) obj).getStorage());
    }

    @Override // mc.L
    public /* bridge */ /* synthetic */ void f(InterfaceC3942b interfaceC3942b, C4152E c4152e, int i10) {
        h(interfaceC3942b, c4152e.getStorage(), i10);
    }

    protected int g(short[] collectionSize) {
        C3862t.g(collectionSize, "$this$collectionSize");
        return C4152E.y(collectionSize);
    }

    protected void h(InterfaceC3942b encoder, short[] content, int size) {
        C3862t.g(encoder, "encoder");
        C3862t.g(content, "content");
        for (int i10 = 0; i10 < size; i10++) {
            encoder.w(getDescriptor(), i10).d(C4152E.w(content, i10));
        }
    }
}
