package z;

import ac.s;
import ac.z;
import kotlin.Metadata;
import oa.C4153F;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: InteractionSource.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lz/l;", "Lz/k;", "<init>", "()V", "Lz/h;", "interaction", "Loa/F;", "c", "(Lz/h;Lta/d;)Ljava/lang/Object;", "", "a", "(Lz/h;)Z", "Lac/s;", "Lac/s;", "d", "()Lac/s;", "interactions", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: z.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5163l implements InterfaceC5162k {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s<InterfaceC5159h> interactions = z.b(0, 16, Zb.d.f19651C, 1, null);

    @Override // z.InterfaceC5162k
    public boolean a(InterfaceC5159h interaction) {
        return b().i(interaction);
    }

    @Override // z.InterfaceC5162k
    public Object c(InterfaceC5159h interfaceC5159h, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objA = b().a(interfaceC5159h, interfaceC4588d);
        return objA == C4696b.e() ? objA : C4153F.f46609a;
    }

    @Override // z.InterfaceC5160i
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public s<InterfaceC5159h> b() {
        return this.interactions;
    }
}
