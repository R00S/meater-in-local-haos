package p241e.p254e.p256b.p271c.p279r;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: InsetDialogOnTouchListener.java */
/* renamed from: e.e.b.c.r.a */
/* loaded from: classes2.dex */
public class ViewOnTouchListenerC8938a implements View.OnTouchListener {

    /* renamed from: f */
    private final Dialog f34408f;

    /* renamed from: g */
    private final int f34409g;

    /* renamed from: h */
    private final int f34410h;

    /* renamed from: i */
    private final int f34411i;

    public ViewOnTouchListenerC8938a(Dialog dialog, Rect rect) {
        this.f34408f = dialog;
        this.f34409g = rect.left;
        this.f34410h = rect.top;
        this.f34411i = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.f34409g + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, this.f34410h + viewFindViewById.getTop(), width, viewFindViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i2 = this.f34411i;
            motionEventObtain.setLocation((-i2) - 1, (-i2) - 1);
        }
        view.performClick();
        return this.f34408f.onTouchEvent(motionEventObtain);
    }
}
