package mc;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: CollectionDescriptors.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lmc/K;", "Lmc/x;", "Lkc/f;", "primitive", "<init>", "(Lkc/f;)V", "", "c", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "serialName", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class K extends AbstractC4043x {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String serialName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(kc.f primitive) {
        super(primitive, null);
        C3862t.g(primitive, "primitive");
        this.serialName = primitive.getSerialName() + "Array";
    }

    @Override // kc.f
    /* renamed from: a, reason: from getter */
    public String getSerialName() {
        return this.serialName;
    }
}
