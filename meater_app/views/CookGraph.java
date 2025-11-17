package com.apptionlabs.meater_app.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.model.CookNote;
import com.apptionlabs.meater_app.model.HighResTemperatureLog;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import com.apptionlabs.meater_app.model.NoteType;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.model.TemperatureRecordingFloat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* loaded from: /tmp/meat/meat/classes.dex */
public class CookGraph extends View {
    private int A;
    List<CookNote> B;

    /* renamed from: q, reason: collision with root package name */
    public HighResTemperatureLog f10240q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f10241r;

    /* renamed from: s, reason: collision with root package name */
    private b f10242s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f10243t;

    /* renamed from: u, reason: collision with root package name */
    private a f10244u;

    /* renamed from: v, reason: collision with root package name */
    private a f10245v;

    /* renamed from: w, reason: collision with root package name */
    private long f10246w;

    /* renamed from: x, reason: collision with root package name */
    protected long f10247x;

    /* renamed from: y, reason: collision with root package name */
    float f10248y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f10249z;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f10250a;

        /* renamed from: b, reason: collision with root package name */
        int f10251b;

        /* renamed from: c, reason: collision with root package name */
        int f10252c;

        /* renamed from: d, reason: collision with root package name */
        int f10253d;

        a(int i10, int i11, int i12, int i13) {
            this.f10250a = i10;
            this.f10251b = i11;
            this.f10252c = i12;
            this.f10253d = i13;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public int f10254a;

        /* renamed from: b, reason: collision with root package name */
        public int f10255b;

        /* renamed from: c, reason: collision with root package name */
        public int f10256c;

        /* renamed from: d, reason: collision with root package name */
        public int f10257d;

        public b(CookGraph cookGraph, int i10, int i11, int i12, int i13) {
            this.f10254a = i10;
            this.f10255b = i11;
            this.f10256c = i12;
            this.f10257d = i13;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public enum c {
        internal,
        ambient,
        target
    }

    public CookGraph(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10244u = new a(0, 0, 0, 0);
        this.f10245v = new a(0, 0, 0, 0);
        this.f10246w = 0L;
        this.f10247x = 0L;
        this.f10249z = true;
        this.A = 12;
        this.B = new ArrayList();
        this.f10243t = com.apptionlabs.meater_app.app.a.u().T1();
        setLayerType(1, null);
    }

    private Paint a() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setColor(-3355444);
        paint.setStrokeWidth(3.0f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        return paint;
    }

    private b b() {
        return new b(this, 20, 50, 40, 40);
    }

    private a c() {
        double graphDuration = this.f10240q.graphDuration();
        int i10 = 10;
        if (graphDuration <= 60.0d) {
            return new a(6, 10, 0, 60);
        }
        if (graphDuration <= 300.0d) {
            int ceil = (int) Math.ceil(graphDuration / 30.0d);
            int i11 = ceil + (ceil % 2);
            return new a(i11, 30, 0, i11 * 30);
        }
        if (graphDuration <= 600.0d) {
            double d10 = graphDuration / 60.0d;
            return new a((int) Math.ceil(d10), 60, 0, ((int) Math.ceil(d10)) * 60);
        }
        double d11 = Double.MAX_VALUE;
        for (int i12 = 5; i12 < 11; i12++) {
            double d12 = i12;
            double ceil2 = ((Math.ceil((graphDuration / d12) / 60.0d) * 60.0d) * d12) - graphDuration;
            if (ceil2 < d11) {
                i10 = i12;
                d11 = ceil2;
            }
        }
        int ceil3 = (int) (Math.ceil((graphDuration / i10) / 60.0d) * 60.0d);
        return new a(i10, ceil3, 0, ceil3 * i10);
    }

    private a d() {
        MEATERDeviceType mEATERDeviceType;
        int i10;
        Probe probe = this.f10240q.getProbe();
        if (probe != null) {
            mEATERDeviceType = probe.getMEATERDeviceType();
        } else {
            mEATERDeviceType = MEATERDeviceType.SECOND_GENERATION_PROBE;
        }
        int maximumInternalTemperatureForDevice = mEATERDeviceType.maximumInternalTemperatureForDevice();
        int floor = (int) Math.floor(Temperature.convertToUserScaleFloat(Math.min(this.f10248y, this.f10240q.getMinTemperature())));
        int max = (int) Math.max(Temperature.convertToUserScale(maximumInternalTemperatureForDevice), Math.ceil(Temperature.convertToUserScaleFloat(this.f10240q.getMaxTemperature())));
        if (u()) {
            max = Math.max(max, (int) Math.ceil(Math.max(Temperature.convertToUserScaleFloat(probe.getInternalTemperature()), Temperature.convertToUserScaleFloat(probe.getAmbientTemperature()))));
            floor = Math.min(floor, (int) Math.ceil(Math.min(Temperature.convertToUserScaleFloat(probe.getInternalTemperature()), Temperature.convertToUserScaleFloat(probe.getAmbientTemperature()))));
        }
        if (floor == max) {
            floor = 0;
        }
        if (com.apptionlabs.meater_app.app.a.u().T1()) {
            i10 = 40 - (max % 40);
        } else {
            i10 = 20 - (max % 20);
        }
        int i11 = max + i10;
        double d10 = i11 - floor;
        double d11 = Double.MAX_VALUE;
        int i12 = 10;
        for (int i13 = 5; i13 < 11; i13++) {
            double d12 = i13;
            double ceil = (Math.ceil(d10 / d12) * d12) - d10;
            if (ceil < d11) {
                i12 = i13;
                d11 = ceil;
            }
        }
        int ceil2 = (int) Math.ceil(d10 / i12);
        int max2 = Math.max(i11, ceil2 * i12);
        if (com.apptionlabs.meater_app.app.a.u().T1() == this.f10243t) {
            max2 = Math.max(max2, this.f10245v.f10253d);
        }
        this.f10243t = com.apptionlabs.meater_app.app.a.u().T1();
        return new a(i12, ceil2, floor, max2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0126 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void e(android.graphics.Canvas r23, com.apptionlabs.meater_app.views.CookGraph.c r24) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apptionlabs.meater_app.views.CookGraph.e(android.graphics.Canvas, com.apptionlabs.meater_app.views.CookGraph$c):void");
    }

    private void f(Canvas canvas) {
        Paint y10 = y();
        Rect t10 = t();
        a aVar = getyAxis();
        for (int i10 = 1; i10 <= aVar.f10250a; i10++) {
            int i11 = i10 - 1;
            PointF pointF = new PointF(t10.left, t10.top + ((t10.height() / aVar.f10250a) * i11));
            PointF pointF2 = new PointF(t10.left + t10.width(), t10.top + ((t10.height() / aVar.f10250a) * i11));
            canvas.drawLine(pointF.x, pointF.y, pointF2.x, pointF2.y, y10);
        }
    }

    private void h(Canvas canvas) {
        Paint.Style style;
        Rect t10 = t();
        a aVar = getxAxis();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(q(2.0f));
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStrokeWidth(2.0f);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(f8.l0.i(getContext(), 2131100532));
        for (CookNote cookNote : this.B) {
            if (cookNote.type != 0 && cookNote.timestamp > 0.0d) {
                if (cookNote.isExpanded()) {
                    style = Paint.Style.FILL;
                } else {
                    style = Paint.Style.STROKE;
                }
                paint.setStyle(style);
                paint.setColor(w(cookNote.type));
                float width = (((float) cookNote.timestamp) / aVar.f10253d) * t10.width();
                if (cookNote.type == 3) {
                    canvas.drawCircle(t10.left + width, t10.top + t10.height(), 10.0f, paint2);
                    canvas.drawCircle(t10.left + width, t10.top + t10.height(), 10.0f, paint);
                } else {
                    Rect t11 = t();
                    PointF pointF = new PointF(t11.left, t11.top + (t11.height() * A((long) cookNote.timestamp, cookNote.type)));
                    canvas.drawCircle(t10.left + width, pointF.y, 10.0f, paint2);
                    canvas.drawCircle(t10.left + width, pointF.y, 10.0f, paint);
                }
            }
        }
    }

    private void i(Canvas canvas) {
        if (this.f10241r && this.f10240q.shouldDisplayFetchingLogMessage()) {
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.argb(192, 255, 255, 255));
            paint.setAntiAlias(true);
            canvas.drawRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), paint);
        }
    }

    private void j(Canvas canvas) {
        a aVar = getyAxis();
        float convertToUserScaleFloat = 1.0f - ((Temperature.convertToUserScaleFloat(this.f10248y) - aVar.f10252c) / (aVar.f10250a * aVar.f10251b));
        Rect t10 = t();
        PointF pointF = new PointF(t10.left, t10.top + (t10.height() * convertToUserScaleFloat));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(q(1.0f));
        paint.setPathEffect(new DashPathEffect(new float[]{7.0f, 7.0f}, 5.0f));
        paint.setColor(f8.l0.h(2131100389));
        float f10 = t10.left;
        float f11 = pointF.y;
        canvas.drawLine(f10, f11, t10.right, f11, paint);
        Drawable mutate = getResources().getDrawable(2131231524, null).mutate();
        mutate.setTint(f8.l0.h(2131100389));
        int i10 = (int) pointF.x;
        int i11 = (int) pointF.y;
        mutate.setBounds(i10, i11 - 14, i10 + 32, i11 + 14);
        mutate.draw(canvas);
        canvas.restore();
    }

    private void k(Canvas canvas) {
        float x10 = x();
        Rect t10 = t();
        Paint a10 = a();
        PointF pointF = new PointF(t10.left, t10.bottom);
        PointF pointF2 = new PointF(t10.right + (x10 * 4.0f), t10.bottom);
        canvas.drawLine(pointF.x, pointF.y, pointF2.x, pointF2.y, a10);
    }

    private void l(Canvas canvas) {
        int i10;
        float x10 = x();
        Paint v10 = v();
        Rect t10 = t();
        a aVar = getyAxis();
        if (aVar.f10250a < 10) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        for (int i11 = 0; i11 <= aVar.f10250a; i11 += i10) {
            String format = String.format(Locale.US, "%d˚", Integer.valueOf(aVar.f10252c + (aVar.f10251b * i11)));
            canvas.drawText(format, ((this.f10242s.f10255b - 4) * x10) - v10.measureText(format), ((t10.top + t10.height()) - ((t10.height() / aVar.f10250a) * i11)) + (6.0f * x10), v10);
        }
    }

    private void m(Canvas canvas) {
        float x10 = x();
        Rect t10 = t();
        Paint a10 = a();
        PointF pointF = new PointF(t10.left, t10.top - (x10 * 4.0f));
        PointF pointF2 = new PointF(t10.left, t10.top + t10.height());
        canvas.drawLine(pointF.x, pointF.y, pointF2.x, pointF2.y, a10);
    }

    private void n(Canvas canvas) {
        float x10 = x();
        Paint v10 = v();
        Rect t10 = t();
        a aVar = getxAxis();
        float f10 = 0.0f;
        int i10 = 0;
        for (int i11 = 0; i11 <= aVar.f10250a; i11++) {
            f10 = Math.max(f10, v10.measureText(r(aVar.f10251b * i11)));
        }
        int i12 = 1;
        while (f10 > (t10.width() / aVar.f10250a) * 0.75f) {
            i12++;
            f10 = (float) (f10 * 0.5d);
        }
        for (int i13 = i12; i13 <= aVar.f10250a; i13 += i12) {
            if (Math.floor(aVar.f10251b * i13) != i10) {
                String r10 = r(aVar.f10251b * i13);
                float measureText = v10.measureText(r10);
                PointF pointF = new PointF(t10.left + ((t10.width() / aVar.f10250a) * (i13 - 1)), t10.top + t10.height() + (4.0f * x10));
                canvas.drawText(r10, pointF.x + ((((t10.width() / aVar.f10250a) * 2) - measureText) * 0.5f), pointF.y + (15.0f * x10), v10);
                i10 = (int) Math.floor(aVar.f10251b * i13);
            }
        }
    }

    private void o(Canvas canvas) {
        Paint y10 = y();
        Rect t10 = t();
        a aVar = getxAxis();
        for (int i10 = 1; i10 <= aVar.f10250a; i10++) {
            PointF pointF = new PointF(t10.left + ((t10.width() / aVar.f10250a) * i10), t10.top);
            PointF pointF2 = new PointF(t10.left + ((t10.width() / aVar.f10250a) * i10), t10.top + t10.height());
            canvas.drawLine(pointF.x, pointF.y, pointF2.x, pointF2.y, y10);
        }
    }

    private boolean p() {
        if (this.f10247x != 0 && this.f10240q.getGraphData().count() != 0 && (!this.f10241r || !this.f10240q.shouldDisplayFetchingLogMessage())) {
            return true;
        }
        return false;
    }

    private String r(double d10) {
        return f8.c0.e(getContext(), d10);
    }

    private float s() {
        return (getWidth() - (this.f10242s.f10255b * x())) - (this.f10242s.f10257d * x());
    }

    private Paint v() {
        int i10;
        float x10 = x();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextSize(this.A * x10);
        if (this.f10249z) {
            if (f8.l0.w(getContext())) {
                i10 = -1;
            } else {
                i10 = -12303292;
            }
            paint.setColor(i10);
        } else {
            paint.setColor(-3355444);
        }
        return paint;
    }

    private float x() {
        return Math.min(getWidth(), getHeight()) / 450.0f;
    }

    private Paint y() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-3355444);
        paint.setStrokeWidth(1.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setPathEffect(new DashPathEffect(new float[]{x() * 2.0f, x() * 2.0f}, 0.0f));
        return paint;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float A(long j10, int i10) {
        TemperatureRecordingFloat temperatureRecordingForTime = this.f10240q.temperatureRecordingForTime(j10);
        a aVar = getyAxis();
        return 1.0f - ((Temperature.convertToUserScaleFloat(z(temperatureRecordingForTime, i10)) - aVar.f10252c) / (aVar.f10250a * aVar.f10251b));
    }

    public long B(MotionEvent motionEvent) {
        return (long) Math.min(this.f10240q.graphDuration(), Math.max(0.0f, ((motionEvent.getX() - (this.f10242s.f10255b * x())) / s()) * getxAxis().f10253d));
    }

    public void g(Canvas canvas) {
        boolean z10;
        RectF rectF;
        if (!p()) {
            return;
        }
        Rect t10 = t();
        float width = (((float) this.f10247x) / getxAxis().f10253d) * t10.width();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(q(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(f8.l0.i(getContext(), 2131099779));
        int i10 = t10.left;
        canvas.drawLine(i10 + width, t10.top, i10 + width, r3 + t10.height(), paint);
        float q10 = (q(33.0f) + q(15.0f)) / x();
        RectF rectF2 = new RectF(t10.left + width + q(8.15f), t10.top + ((t10.height() / 2) - q(41.5f)), t10.left + width + q(104.15f), t10.top + (t10.height() / 2) + q(q10));
        if (rectF2.left > (getWidth() - rectF2.width()) - q(this.f10242s.f10257d)) {
            rectF2 = new RectF((t10.left + width) - q(104.15f), t10.top + ((t10.height() / 2) - q(41.5f)), (t10.left + width) - q(8.2f), t10.top + (t10.height() / 2) + q(q10));
            z10 = true;
        } else {
            z10 = false;
        }
        Path path = new Path();
        path.addRoundRect(rectF2, q(6.25f), q(6.25f), Path.Direction.CW);
        Paint paint2 = new Paint();
        paint2.setColor(f8.l0.i(getContext(), 2131099682));
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAlpha(127);
        canvas.drawPath(path, paint2);
        if (z10) {
            rectF = new RectF((t10.left + width) - q(105.0f), t10.top + ((t10.height() / 2) - q(28.0f)), t10.left + width, t10.top + ((t10.height() / 2) - q(32.0f)) + q(63.0f));
        } else {
            rectF = new RectF(t10.left + width + q(6.2f), t10.top + ((t10.height() / 2) - q(28.0f)), t10.left + width + q(112.0f), t10.top + ((t10.height() / 2) - q(32.0f)) + q(63.0f));
        }
        RectF rectF3 = new RectF(rectF.left + q(16.0f), rectF.top + q(8.15f), q(8.33f), q(8.33f));
        float x10 = x();
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setTextSize(x10 * 16.5f);
        paint3.setColor(f8.l0.h(2131100398));
        canvas.drawCircle(rectF3.left, rectF3.top - q(4.0f), q(11.0f), paint3);
        paint3.setColor(-1);
        paint3.setAntiAlias(true);
        Typeface typeface = Typeface.DEFAULT;
        paint3.setTypeface(Typeface.create(typeface, 1));
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.getTextBounds("T", 0, 1, new Rect());
        canvas.drawText("T", rectF3.left, (rectF3.top - q(4.0f)) + (r12.height() / 2), paint3);
        RectF rectF4 = new RectF(rectF.left + q(16.0f), rectF.top + q(39.0f), q(12.5f), q(12.5f));
        paint3.setColor(f8.l0.h(2131100399));
        canvas.drawCircle(rectF4.left, rectF4.top - q(5.0f), q(11.0f), paint3);
        paint3.setColor(-1);
        paint3.getTextBounds("I", 0, 1, new Rect());
        canvas.drawText("I", rectF4.left, (rectF4.top - q(5.0f)) + (r9.height() / 2), paint3);
        RectF rectF5 = new RectF(rectF.left + q(16.0f), rectF.top + q(69.0f), q(12.5f), 12.5f);
        paint3.setColor(f8.l0.h(2131100392));
        canvas.drawCircle(rectF5.left, rectF5.top - q(5.0f), q(11.0f), paint3);
        paint3.setColor(-1);
        paint3.getTextBounds("A", 0, 1, new Rect());
        canvas.drawText("A", rectF5.left, (rectF5.top - q(5.0f)) + (r6.height() / 2), paint3);
        paint3.setColor(-1);
        paint3.setTypeface(Typeface.create(typeface, 0));
        paint3.setTextAlign(Paint.Align.LEFT);
        PointF pointF = new PointF(rectF.left + q(31.0f), rectF.top + q(10.0f));
        canvas.drawText(f8.c0.b(this.f10247x), pointF.x, pointF.y, paint3);
        TemperatureRecordingFloat temperatureRecordingForTime = this.f10240q.temperatureRecordingForTime(this.f10247x);
        PointF pointF2 = new PointF(rectF.left + q(31.0f), rectF.top + q(39.0f));
        canvas.drawText(Temperature.displayTemperatureFloat(temperatureRecordingForTime.internal), pointF2.x, pointF2.y, paint3);
        PointF pointF3 = new PointF(rectF.left + q(31.0f), rectF.top + q(69.0f));
        canvas.drawText(Temperature.displayTemperatureFloat(temperatureRecordingForTime.ambient), pointF3.x, pointF3.y, paint3);
    }

    public long getLastUpdatedTime() {
        return this.f10246w;
    }

    public float getTargetTemp() {
        return this.f10248y;
    }

    public HighResTemperatureLog getTemperatureLog() {
        return this.f10240q;
    }

    public a getxAxis() {
        return this.f10244u;
    }

    public a getyAxis() {
        return this.f10245v;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        setLastUpdatedTime(System.currentTimeMillis());
        super.onDraw(canvas);
        if (this.f10240q != null) {
            setxAxis(c());
            setyAxis(d());
            o(canvas);
            f(canvas);
            n(canvas);
            l(canvas);
        }
        k(canvas);
        m(canvas);
        if (this.f10240q != null) {
            e(canvas, c.ambient);
            e(canvas, c.internal);
            j(canvas);
            i(canvas);
        }
        g(canvas);
        h(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f10242s = b();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f10249z) {
            return true;
        }
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
            this.f10247x = 0L;
        } else {
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            this.f10247x = B(motionEvent);
        }
        invalidate();
        return true;
    }

    protected float q(float f10) {
        return x() * f10 * 1.15f;
    }

    public void setConnectedState(boolean z10) {
        this.f10249z = z10;
    }

    public void setLabelTextSize(int i10) {
        this.A = i10;
    }

    public void setLastUpdatedTime(long j10) {
        this.f10246w = j10;
    }

    public void setNoteList(List<CookNote> list) {
        this.B = list;
        invalidate();
    }

    public void setRealTimeGraph(boolean z10) {
        if (this.f10241r != z10) {
            this.f10241r = z10;
            invalidate();
        }
    }

    public void setTargetTemp(float f10) {
        this.f10248y = f10;
    }

    public void setTemperatureLog(HighResTemperatureLog highResTemperatureLog) {
        if (!Objects.equals(this.f10240q, highResTemperatureLog)) {
            this.f10240q = highResTemperatureLog;
            invalidate();
        }
    }

    public void setxAxis(a aVar) {
        this.f10244u = aVar;
    }

    public void setyAxis(a aVar) {
        this.f10245v = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Rect t() {
        float x10 = x();
        b bVar = this.f10242s;
        return new Rect((int) (bVar.f10255b * x10), (int) (bVar.f10254a * x10), getWidth() - ((int) (this.f10242s.f10257d * x10)), getHeight() - ((int) (this.f10242s.f10256c * x10)));
    }

    public boolean u() {
        if (this.f10241r && this.f10240q.getProbe() != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int w(int i10) {
        if (i10 == NoteType.INTERNAL.getValue()) {
            return f8.l0.h(2131100399);
        }
        if (i10 == NoteType.AMBIENT.getValue()) {
            return f8.l0.h(2131100392);
        }
        return f8.l0.h(2131100398);
    }

    protected float z(TemperatureRecordingFloat temperatureRecordingFloat, int i10) {
        if (i10 == NoteType.INTERNAL.getValue()) {
            return temperatureRecordingFloat.internal;
        }
        if (i10 == NoteType.AMBIENT.getValue()) {
            return temperatureRecordingFloat.ambient;
        }
        return temperatureRecordingFloat.internal;
    }
}
