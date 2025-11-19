package kotlin;

import Zb.d;
import ac.H;
import ac.y;
import kotlin.Metadata;

/* compiled from: AbstractSharedFlow.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lbc/t;", "Lac/H;", "", "Lac/y;", "initialValue", "<init>", "(I)V", "delta", "", "b0", "(I)Z", "a0", "()Ljava/lang/Integer;", "value", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bc.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2303t extends y<Integer> implements H<Integer> {
    public C2303t(int i10) {
        super(1, Integer.MAX_VALUE, d.f19651C);
        i(Integer.valueOf(i10));
    }

    @Override // ac.H
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public Integer getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(N().intValue());
        }
        return numValueOf;
    }

    public final boolean b0(int delta) {
        boolean zI;
        synchronized (this) {
            zI = i(Integer.valueOf(N().intValue() + delta));
        }
        return zI;
    }
}
