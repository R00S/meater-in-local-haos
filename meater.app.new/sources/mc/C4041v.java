package mc;

import ic.InterfaceC3693a;
import jc.C3780a;
import kotlin.Metadata;
import kotlin.jvm.internal.C3861s;
import kotlin.jvm.internal.C3862t;
import lc.InterfaceC3942b;

/* compiled from: PrimitiveArraysSerializers.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0002H\u0014¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lmc/v;", "Lic/a;", "", "Lmc/L;", "", "", "<init>", "()V", "g", "([I)I", "Llc/b;", "encoder", "content", "size", "Loa/F;", "h", "(Llc/b;[II)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mc.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4041v extends L<Integer, int[], Object> implements InterfaceC3693a<int[]> {

    /* renamed from: c, reason: collision with root package name */
    public static final C4041v f45521c = new C4041v();

    private C4041v() {
        super(C3780a.t(C3861s.f44009a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mc.AbstractC4021a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int e(int[] iArr) {
        C3862t.g(iArr, "<this>");
        return iArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mc.L
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void f(InterfaceC3942b encoder, int[] content, int size) {
        C3862t.g(encoder, "encoder");
        C3862t.g(content, "content");
        for (int i10 = 0; i10 < size; i10++) {
            encoder.q(getDescriptor(), i10, content[i10]);
        }
    }
}
