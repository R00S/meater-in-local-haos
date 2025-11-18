package f0;

import A0.r;
import Ba.l;
import b0.i;
import k0.InterfaceC3783c;
import kotlin.Metadata;
import oa.C4153F;

/* compiled from: DrawModifier.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\u0005*\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"Lf0/e;", "Lb0/i$c;", "LA0/r;", "Lkotlin/Function1;", "Lk0/f;", "Loa/F;", "onDraw", "<init>", "(LBa/l;)V", "Lk0/c;", "d", "(Lk0/c;)V", "O", "LBa/l;", "getOnDraw", "()LBa/l;", "j2", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: f0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3304e extends i.c implements r {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    private l<? super k0.f, C4153F> onDraw;

    public C3304e(l<? super k0.f, C4153F> lVar) {
        this.onDraw = lVar;
    }

    @Override // A0.r
    public void d(InterfaceC3783c interfaceC3783c) {
        this.onDraw.invoke(interfaceC3783c);
        interfaceC3783c.C1();
    }

    public final void j2(l<? super k0.f, C4153F> lVar) {
        this.onDraw = lVar;
    }
}
