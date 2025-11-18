package mc;

import ic.InterfaceC3693a;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;

/* compiled from: CollectionSerializers.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004B\u0017\b\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\u0082\u0001\u0001\u000b¨\u0006\f"}, d2 = {"Lmc/k;", "Element", "Collection", "Builder", "Lmc/a;", "Lic/a;", "elementSerializer", "<init>", "(Lic/a;)V", "a", "Lic/a;", "Lmc/L;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mc.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4031k<Element, Collection, Builder> extends AbstractC4021a<Element, Collection, Builder> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC3693a<Element> elementSerializer;

    public /* synthetic */ AbstractC4031k(InterfaceC3693a interfaceC3693a, C3854k c3854k) {
        this(interfaceC3693a);
    }

    private AbstractC4031k(InterfaceC3693a<Element> interfaceC3693a) {
        super(null);
        this.elementSerializer = interfaceC3693a;
    }
}
