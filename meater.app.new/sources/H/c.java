package H;

import H0.TextLayoutResult;
import kotlin.Metadata;
import y0.InterfaceC5116v;

/* compiled from: MultiWidgetSelectionDelegate.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"LH/c;", "LH/d;", "", "selectableId", "Lkotlin/Function0;", "Ly0/v;", "coordinatesCallback", "LH0/F;", "layoutResultCallback", "<init>", "(JLBa/a;LBa/a;)V", "a", "J", "getSelectableId", "()J", "b", "LBa/a;", "c", "", "d", "I", "_previousLastVisibleOffset", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long selectableId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Ba.a<InterfaceC5116v> coordinatesCallback;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Ba.a<TextLayoutResult> layoutResultCallback;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int _previousLastVisibleOffset = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public c(long j10, Ba.a<? extends InterfaceC5116v> aVar, Ba.a<TextLayoutResult> aVar2) {
        this.selectableId = j10;
        this.coordinatesCallback = aVar;
        this.layoutResultCallback = aVar2;
    }
}
