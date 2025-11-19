package C0;

import h0.C3478i;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import oa.C4153F;

/* compiled from: TextActionModeCallback.android.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0000\u0018\u00002\u00020\u0001Bk\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u001aR*\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001c\u0010\u0010\"\u0004\b\u001d\u0010\u001aR*\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u000e\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010\u001aR*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u000e\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010\u001a¨\u0006$"}, d2 = {"LC0/a;", "", "Lkotlin/Function0;", "Loa/F;", "onActionModeDestroy", "Lh0/i;", "rect", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "<init>", "(LBa/a;Lh0/i;LBa/a;LBa/a;LBa/a;LBa/a;)V", "a", "LBa/a;", "getOnActionModeDestroy", "()LBa/a;", "b", "Lh0/i;", "getRect", "()Lh0/i;", "setRect", "(Lh0/i;)V", "c", "getOnCopyRequested", "setOnCopyRequested", "(LBa/a;)V", "d", "getOnPasteRequested", "setOnPasteRequested", "e", "getOnCutRequested", "setOnCutRequested", "f", "getOnSelectAllRequested", "setOnSelectAllRequested", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ba.a<C4153F> onActionModeDestroy;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private C3478i rect;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Ba.a<C4153F> onCopyRequested;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Ba.a<C4153F> onPasteRequested;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Ba.a<C4153F> onCutRequested;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Ba.a<C4153F> onSelectAllRequested;

    public a(Ba.a<C4153F> aVar, C3478i c3478i, Ba.a<C4153F> aVar2, Ba.a<C4153F> aVar3, Ba.a<C4153F> aVar4, Ba.a<C4153F> aVar5) {
        this.onActionModeDestroy = aVar;
        this.rect = c3478i;
        this.onCopyRequested = aVar2;
        this.onPasteRequested = aVar3;
        this.onCutRequested = aVar4;
        this.onSelectAllRequested = aVar5;
    }

    public /* synthetic */ a(Ba.a aVar, C3478i c3478i, Ba.a aVar2, Ba.a aVar3, Ba.a aVar4, Ba.a aVar5, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? null : aVar, (i10 & 2) != 0 ? C3478i.INSTANCE.a() : c3478i, (i10 & 4) != 0 ? null : aVar2, (i10 & 8) != 0 ? null : aVar3, (i10 & 16) != 0 ? null : aVar4, (i10 & 32) != 0 ? null : aVar5);
    }
}
