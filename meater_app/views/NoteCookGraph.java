package com.apptionlabs.meater_app.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.apptionlabs.meater_app.data.GraphSelectedData;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.model.NoteType;
import com.apptionlabs.meater_app.model.TemperatureRecordingFloat;

/* loaded from: /tmp/meat/meat/classes.dex */
public class NoteCookGraph extends CookGraph {
    int C;
    private a D;

    /* loaded from: /tmp/meat/meat/classes.dex */
    public interface a {
        void u();
    }

    public NoteCookGraph(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C = 0;
    }

    protected void C(Canvas canvas) {
        if (this.f10247x != 0) {
            Rect t10 = t();
            float width = (((float) this.f10247x) / getxAxis().f10253d) * t10.width();
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStrokeWidth(2.0f);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(w(this.C));
            int i10 = t10.left;
            canvas.drawLine(i10 + width, t10.top, i10 + width, r5 + t10.height(), paint);
            if (this.C == NoteType.TIME.getValue()) {
                canvas.drawCircle(t10.left + width, t10.top + t10.height(), 10.0f, paint);
            } else {
                Rect t11 = t();
                canvas.drawCircle(t10.left + width, new PointF(t11.left, t11.top + (t11.height() * A(this.f10247x, this.C))).y, 10.0f, paint);
            }
            a aVar = this.D;
            if (aVar != null) {
                aVar.u();
            }
        }
    }

    public GraphSelectedData getCurrentSelectData() {
        GraphSelectedData graphSelectedData = new GraphSelectedData();
        graphSelectedData.timeTemperature = f8.c0.f(this.f10247x);
        TemperatureRecordingFloat temperatureRecordingForTime = this.f10240q.temperatureRecordingForTime(this.f10247x);
        graphSelectedData.internalTemperature = Temperature.displayTemperature((int) temperatureRecordingForTime.internal);
        graphSelectedData.ambientTemperature = Temperature.displayTemperature((int) temperatureRecordingForTime.ambient);
        graphSelectedData.timeStamp = this.f10247x;
        return graphSelectedData;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.views.CookGraph, android.view.View
    public void onDraw(Canvas canvas) {
        setLastUpdatedTime(System.currentTimeMillis());
        super.onDraw(canvas);
        g(canvas);
        C(canvas);
    }

    @Override // com.apptionlabs.meater_app.views.CookGraph, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                } else {
                    this.f10247x = B(motionEvent);
                }
            }
        } else {
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            this.f10247x = B(motionEvent);
        }
        invalidate();
        return true;
    }

    public void setHoverTime(long j10) {
        this.f10247x = j10;
    }

    public void setListener(a aVar) {
        this.D = aVar;
    }

    public void setNoteGraphType(int i10) {
        this.C = i10;
    }
}
