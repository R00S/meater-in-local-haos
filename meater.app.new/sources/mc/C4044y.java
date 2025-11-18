package mc;

import ic.InterfaceC3693a;
import jc.C3780a;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.C3865w;
import lc.InterfaceC3942b;

/* compiled from: PrimitiveArraysSerializers.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\b*\u00020\u0002H\u0014¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lmc/y;", "Lic/a;", "", "Lmc/L;", "", "", "<init>", "()V", "", "g", "([J)I", "Llc/b;", "encoder", "content", "size", "Loa/F;", "h", "(Llc/b;[JI)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mc.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4044y extends L<Long, long[], Object> implements InterfaceC3693a<long[]> {

    /* renamed from: c, reason: collision with root package name */
    public static final C4044y f45526c = new C4044y();

    private C4044y() {
        super(C3780a.u(C3865w.f44010a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mc.AbstractC4021a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int e(long[] jArr) {
        C3862t.g(jArr, "<this>");
        return jArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mc.L
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void f(InterfaceC3942b encoder, long[] content, int size) {
        C3862t.g(encoder, "encoder");
        C3862t.g(content, "content");
        for (int i10 = 0; i10 < size; i10++) {
            encoder.t(getDescriptor(), i10, content[i10]);
        }
    }
}
