package r0;

import Ba.l;
import kotlin.InterfaceC1563p0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.r1;

/* compiled from: InputModeManager.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR1\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00028V@VX\u0096\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\t\u0010\u000e\"\u0004\b\f\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Lr0/c;", "Lr0/b;", "Lr0/a;", "initialInputMode", "Lkotlin/Function1;", "", "onRequestInputModeChange", "<init>", "(ILBa/l;Lkotlin/jvm/internal/k;)V", "a", "LBa/l;", "<set-?>", "b", "LO/p0;", "()I", "(I)V", "inputMode", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: r0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4333c implements InterfaceC4332b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l<C4331a, Boolean> onRequestInputModeChange;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC1563p0 inputMode;

    public /* synthetic */ C4333c(int i10, l lVar, C3854k c3854k) {
        this(i10, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r0.InterfaceC4332b
    public int a() {
        return ((C4331a) this.inputMode.getValue()).getValue();
    }

    public void b(int i10) {
        this.inputMode.setValue(C4331a.c(i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C4333c(int i10, l<? super C4331a, Boolean> lVar) {
        this.onRequestInputModeChange = lVar;
        this.inputMode = r1.c(C4331a.c(i10), null, 2, null);
    }
}
