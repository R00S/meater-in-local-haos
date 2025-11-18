package mc;

import ic.InterfaceC3693a;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: Primitives.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lmc/a0;", "Lic/a;", "Loa/F;", "<init>", "()V", "Llc/c;", "encoder", "value", "e", "(Llc/c;Loa/F;)V", "Lkc/f;", "c", "()Lkc/f;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a0 implements InterfaceC3693a<C4153F> {

    /* renamed from: b, reason: collision with root package name */
    public static final a0 f45489b = new a0();

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ E<C4153F> f45490a = new E<>("kotlin.Unit", C4153F.f46609a);

    private a0() {
    }

    @Override // ic.InterfaceC3693a, ic.InterfaceC3698f
    public kc.f c() {
        return this.f45490a.c();
    }

    @Override // ic.InterfaceC3698f
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void a(lc.c encoder, C4153F value) {
        C3862t.g(encoder, "encoder");
        C3862t.g(value, "value");
        this.f45490a.a(encoder, value);
    }
}
