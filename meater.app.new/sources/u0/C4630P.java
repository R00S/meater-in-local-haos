package u0;

import kotlin.Metadata;
import oa.C4153F;

/* compiled from: PointerInteropFilter.android.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lu0/P;", "Lkotlin/Function1;", "", "Loa/F;", "<init>", "()V", "disallowIntercept", "a", "(Z)V", "Lu0/I;", "B", "Lu0/I;", "getPointerInteropFilter$ui_release", "()Lu0/I;", "b", "(Lu0/I;)V", "pointerInteropFilter", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: u0.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4630P implements Ba.l<Boolean, C4153F> {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private C4623I pointerInteropFilter;

    public void a(boolean disallowIntercept) {
        C4623I c4623i = this.pointerInteropFilter;
        if (c4623i == null) {
            return;
        }
        c4623i.p(disallowIntercept);
    }

    public final void b(C4623I c4623i) {
        this.pointerInteropFilter = c4623i;
    }

    @Override // Ba.l
    public /* bridge */ /* synthetic */ C4153F invoke(Boolean bool) {
        a(bool.booleanValue());
        return C4153F.f46609a;
    }
}
