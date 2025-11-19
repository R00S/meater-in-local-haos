package u2;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import u2.d;

/* compiled from: TouchTracker.java */
/* loaded from: classes.dex */
final class m extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, d.a {

    /* renamed from: D, reason: collision with root package name */
    private final a f50418D;

    /* renamed from: E, reason: collision with root package name */
    private final float f50419E;

    /* renamed from: F, reason: collision with root package name */
    private final GestureDetector f50420F;

    /* renamed from: B, reason: collision with root package name */
    private final PointF f50416B = new PointF();

    /* renamed from: C, reason: collision with root package name */
    private final PointF f50417C = new PointF();

    /* renamed from: G, reason: collision with root package name */
    private volatile float f50421G = 3.1415927f;

    /* compiled from: TouchTracker.java */
    public interface a {
        void b(PointF pointF);

        default boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }
    }

    public m(Context context, a aVar, float f10) {
        this.f50418D = aVar;
        this.f50419E = f10;
        this.f50420F = new GestureDetector(context, this);
    }

    @Override // u2.d.a
    public void a(float[] fArr, float f10) {
        this.f50421G = -f10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f50416B.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = (motionEvent2.getX() - this.f50416B.x) / this.f50419E;
        float y10 = motionEvent2.getY();
        PointF pointF = this.f50416B;
        float f12 = (y10 - pointF.y) / this.f50419E;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d10 = this.f50421G;
        float fCos = (float) Math.cos(d10);
        float fSin = (float) Math.sin(d10);
        PointF pointF2 = this.f50417C;
        pointF2.x -= (fCos * x10) - (fSin * f12);
        float f13 = pointF2.y + (fSin * x10) + (fCos * f12);
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f13));
        this.f50418D.b(this.f50417C);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f50418D.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f50420F.onTouchEvent(motionEvent);
    }
}
