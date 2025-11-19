package N7;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: InsetDialogOnTouchListener.java */
/* loaded from: classes2.dex */
public class a implements View.OnTouchListener {

    /* renamed from: B, reason: collision with root package name */
    private final Dialog f12560B;

    /* renamed from: C, reason: collision with root package name */
    private final int f12561C;

    /* renamed from: D, reason: collision with root package name */
    private final int f12562D;

    /* renamed from: E, reason: collision with root package name */
    private final int f12563E;

    public a(Dialog dialog, Rect rect) {
        this.f12560B = dialog;
        this.f12561C = rect.left;
        this.f12562D = rect.top;
        this.f12563E = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.f12561C + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, this.f12562D + viewFindViewById.getTop(), width, viewFindViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i10 = this.f12563E;
            motionEventObtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f12560B.onTouchEvent(motionEventObtain);
    }
}
