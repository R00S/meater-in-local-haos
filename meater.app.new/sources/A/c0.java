package A;

import A0.p0;
import b0.c;
import b0.i;
import kotlin.Metadata;

/* compiled from: RowColumnImpl.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n*\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0006¨\u0006\u0012"}, d2 = {"LA/c0;", "LA0/p0;", "Lb0/i$c;", "Lb0/c$c;", "vertical", "<init>", "(Lb0/c$c;)V", "LU0/d;", "", "parentData", "LA/T;", "j2", "(LU0/d;Ljava/lang/Object;)LA/T;", "O", "Lb0/c$c;", "getVertical", "()Lb0/c$c;", "k2", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c0 extends i.c implements p0 {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private c.InterfaceC0420c vertical;

    public c0(c.InterfaceC0420c interfaceC0420c) {
        this.vertical = interfaceC0420c;
    }

    @Override // A0.p0
    /* renamed from: j2, reason: merged with bridge method [inline-methods] */
    public RowColumnParentData r(U0.d dVar, Object obj) {
        RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData(0.0f, false, null, null, 15, null);
        }
        rowColumnParentData.e(AbstractC0805m.INSTANCE.b(this.vertical));
        return rowColumnParentData;
    }

    public final void k2(c.InterfaceC0420c interfaceC0420c) {
        this.vertical = interfaceC0420c;
    }
}
