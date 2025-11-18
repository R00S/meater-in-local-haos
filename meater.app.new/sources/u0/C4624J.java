package u0;

import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;

/* compiled from: PointerInteropFilter.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lb0/i;", "Landroidx/compose/ui/viewinterop/c;", "view", "a", "(Lb0/i;Landroidx/compose/ui/viewinterop/c;)Lb0/i;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: u0.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4624J {

    /* compiled from: PointerInteropFilter.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/MotionEvent;", "motionEvent", "", "a", "(Landroid/view/MotionEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: u0.J$a */
    static final class a extends AbstractC3864v implements Ba.l<MotionEvent, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.viewinterop.c f50213B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.viewinterop.c cVar) {
            super(1);
            this.f50213B = cVar;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(MotionEvent motionEvent) {
            boolean zDispatchTouchEvent;
            switch (motionEvent.getActionMasked()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    zDispatchTouchEvent = this.f50213B.dispatchTouchEvent(motionEvent);
                    break;
                default:
                    zDispatchTouchEvent = this.f50213B.dispatchGenericMotionEvent(motionEvent);
                    break;
            }
            return Boolean.valueOf(zDispatchTouchEvent);
        }
    }

    public static final b0.i a(b0.i iVar, androidx.compose.ui.viewinterop.c cVar) {
        C4623I c4623i = new C4623I();
        c4623i.s(new a(cVar));
        C4630P c4630p = new C4630P();
        c4623i.v(c4630p);
        cVar.setOnRequestDisallowInterceptTouchEvent$ui_release(c4630p);
        return iVar.e(c4623i);
    }
}
