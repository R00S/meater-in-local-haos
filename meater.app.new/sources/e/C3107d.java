package e;

import Ba.p;
import android.R;
import android.view.C2098e0;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import d.ActivityC3006j;
import kotlin.AbstractC1564q;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import oa.C4153F;
import t3.C4550g;

/* compiled from: ComponentActivity.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000b¨\u0006\r"}, d2 = {"Ld/j;", "LO/q;", "parent", "Lkotlin/Function0;", "Loa/F;", "content", "a", "(Ld/j;LO/q;LBa/p;)V", "c", "(Ld/j;)V", "Landroid/view/ViewGroup$LayoutParams;", "Landroid/view/ViewGroup$LayoutParams;", "DefaultActivityContentLayoutParams", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: e.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3107d {

    /* renamed from: a, reason: collision with root package name */
    private static final ViewGroup.LayoutParams f39936a = new ViewGroup.LayoutParams(-2, -2);

    public static final void a(ActivityC3006j activityC3006j, AbstractC1564q abstractC1564q, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar) {
        View childAt = ((ViewGroup) activityC3006j.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        ComposeView composeView = childAt instanceof ComposeView ? (ComposeView) childAt : null;
        if (composeView != null) {
            composeView.setParentCompositionContext(abstractC1564q);
            composeView.setContent(pVar);
            return;
        }
        ComposeView composeView2 = new ComposeView(activityC3006j, null, 0, 6, null);
        composeView2.setParentCompositionContext(abstractC1564q);
        composeView2.setContent(pVar);
        c(activityC3006j);
        activityC3006j.setContentView(composeView2, f39936a);
    }

    public static /* synthetic */ void b(ActivityC3006j activityC3006j, AbstractC1564q abstractC1564q, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            abstractC1564q = null;
        }
        a(activityC3006j, abstractC1564q, pVar);
    }

    private static final void c(ActivityC3006j activityC3006j) {
        View decorView = activityC3006j.getWindow().getDecorView();
        if (android.view.View.a(decorView) == null) {
            android.view.View.b(decorView, activityC3006j);
        }
        if (C2098e0.a(decorView) == null) {
            C2098e0.b(decorView, activityC3006j);
        }
        if (C4550g.a(decorView) == null) {
            C4550g.b(decorView, activityC3006j);
        }
    }
}
