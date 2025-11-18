package P5;

import android.app.Activity;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.data.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: MEATERPopUp.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0018\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010\u001f\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"LP5/y;", "Landroid/widget/PopupWindow;", "Landroid/app/Activity;", "context", "", "inflateLayout", "<init>", "(Landroid/app/Activity;I)V", "a", "()I", "Landroid/view/View;", "view", "Loa/F;", "c", "(Landroid/view/View;)V", "v", "Landroid/graphics/Rect;", "b", "(Landroid/view/View;)Landroid/graphics/Rect;", "", "information", "buttonText", "Landroid/view/View$OnClickListener;", "clickListener", "d", "(Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)V", "Landroid/widget/PopupWindow;", "getPopup", "()Landroid/widget/PopupWindow;", "setPopup", "(Landroid/widget/PopupWindow;)V", "popup", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class y extends PopupWindow {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private PopupWindow popup;

    public y(Activity context, int i10) {
        C3862t.g(context, "context");
        PopupWindow popupWindow = new PopupWindow(context);
        this.popup = popupWindow;
        C3862t.d(popupWindow);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        View viewInflate = context.getLayoutInflater().inflate(i10, (ViewGroup) null);
        PopupWindow popupWindow2 = this.popup;
        C3862t.d(popupWindow2);
        popupWindow2.setContentView(viewInflate);
        PopupWindow popupWindow3 = this.popup;
        C3862t.d(popupWindow3);
        popupWindow3.setHeight(-2);
        PopupWindow popupWindow4 = this.popup;
        C3862t.d(popupWindow4);
        popupWindow4.setWidth(-2);
        PopupWindow popupWindow5 = this.popup;
        C3862t.d(popupWindow5);
        popupWindow5.setOutsideTouchable(true);
        PopupWindow popupWindow6 = this.popup;
        C3862t.d(popupWindow6);
        popupWindow6.setFocusable(true);
        PopupWindow popupWindow7 = this.popup;
        C3862t.d(popupWindow7);
        popupWindow7.setClippingEnabled(false);
        PopupWindow popupWindow8 = this.popup;
        C3862t.d(popupWindow8);
        popupWindow8.getContentView().measure(0, 0);
        PopupWindow popupWindow9 = this.popup;
        C3862t.d(popupWindow9);
        popupWindow9.dismiss();
    }

    private final int a() {
        if (x4.g.h().getResources().getConfiguration().orientation == 2) {
            return Q.g(6);
        }
        return 0;
    }

    public final Rect b(View v10) {
        int[] iArr = new int[2];
        if (v10 == null) {
            return null;
        }
        try {
            v10.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            int i10 = iArr[0];
            rect.left = i10;
            rect.top = iArr[1];
            rect.right = i10 + (v10.getWidth() / 2);
            rect.bottom = rect.top + v10.getHeight();
            return rect;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public final void c(View view) {
        C3862t.g(view, "view");
        Rect rectB = b(view);
        if (rectB == null) {
            return;
        }
        PopupWindow popupWindow = this.popup;
        C3862t.d(popupWindow);
        int measuredWidth = rectB.left + (view.getMeasuredWidth() / 2);
        PopupWindow popupWindow2 = this.popup;
        C3862t.d(popupWindow2);
        popupWindow.showAtLocation(view, 51, measuredWidth - popupWindow2.getContentView().getMeasuredWidth(), view.getBottom() + (view.getMeasuredHeight() / 2) + a());
    }

    public final void d(String information, String buttonText, View.OnClickListener clickListener) {
        if (this.popup == null) {
            return;
        }
        if (information == null) {
            information = "";
        }
        Log.info("POPUP", information);
        PopupWindow popupWindow = this.popup;
        C3862t.d(popupWindow);
        ((TextView) popupWindow.getContentView().findViewById(R.id.moreInfoText)).setText(buttonText);
        PopupWindow popupWindow2 = this.popup;
        C3862t.d(popupWindow2);
        LinearLayout linearLayout = (LinearLayout) popupWindow2.getContentView().findViewById(R.id.moreInfoView);
        PopupWindow popupWindow3 = this.popup;
        C3862t.d(popupWindow3);
        TextView textView = (TextView) popupWindow3.getContentView().findViewById(R.id.toolViewButton);
        linearLayout.setOnClickListener(clickListener);
        textView.setVisibility(8);
        linearLayout.setVisibility(0);
    }
}
