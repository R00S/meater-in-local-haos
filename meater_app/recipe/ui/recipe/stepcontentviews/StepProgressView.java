package com.apptionlabs.meater_app.recipe.ui.recipe.stepcontentviews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.a;
import ih.r;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import wh.m;

/* compiled from: StepProgressView.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010/\u001a\u00020.\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103J2\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00062\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004H\u0002J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014J&\u0010\u0014\u001a\u00020\r2\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00042\u0006\u0010\u0013\u001a\u00020\bR\u0016\u0010\u0017\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0016\u0010\u0013\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001dR\u0014\u0010$\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001dR$\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(R\u0016\u0010-\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010(¨\u00064"}, d2 = {"Lcom/apptionlabs/meater_app/recipe/ui/recipe/stepcontentviews/StepProgressView;", "Landroid/view/View;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "timings", "Lih/r;", "a", "", "xNew", "yNew", "xOld", "yOld", "Lih/u;", "onSizeChanged", "Landroid/graphics/Canvas;", "canvas", "onDraw", "data", "currentStep", "b", "q", "I", "viewHeight", "r", "viewWidth", "s", "Landroid/graphics/Paint;", "t", "Landroid/graphics/Paint;", "blackPaint", "u", "meaterRedPaint", "v", "greyPaint", "w", "whitePaint", "x", "Ljava/util/ArrayList;", "y", "F", "minWidth", "z", "spacing", "A", "perMinute", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class StepProgressView extends View {

    /* renamed from: A, reason: from kotlin metadata */
    private float perMinute;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int viewHeight;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int viewWidth;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private int currentStep;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Paint blackPaint;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final Paint meaterRedPaint;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Paint greyPaint;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Paint whitePaint;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<Float> data;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private float minWidth;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private float spacing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.f(context, "context");
        Paint paint = new Paint();
        this.blackPaint = paint;
        Paint paint2 = new Paint();
        this.meaterRedPaint = paint2;
        Paint paint3 = new Paint();
        this.greyPaint = paint3;
        Paint paint4 = new Paint();
        this.whitePaint = paint4;
        this.data = new ArrayList<>();
        paint.setColor(a.c(context, 2131099682));
        paint3.setColor(a.c(context, 2131099783));
        paint2.setColor(a.c(context, 2131100400));
        paint4.setColor(a.c(context, 2131100532));
    }

    private final r<Float, Float, Float> a(ArrayList<Float> timings) {
        float size = timings.size();
        float f10 = 15.0f;
        float f11 = size * 15.0f;
        float f12 = this.viewWidth - ((float) ((size - 1.0d) * 8.0f));
        float f13 = 0.0f;
        float max = Float.max(0.0f, f12 - f11);
        if (f11 > max) {
            f10 = f12 / size;
        } else {
            f13 = max;
        }
        Iterator<T> it = timings.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = Float.valueOf(((Number) next).floatValue() + ((Number) it.next()).floatValue());
            }
            return new r<>(Float.valueOf(f10), Float.valueOf(8.0f), Float.valueOf(f13 / Float.max(1.0f, ((Number) next).floatValue() - size)));
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    public final void b(ArrayList<Float> arrayList, int i10) {
        m.f(arrayList, "data");
        this.data.clear();
        this.data.addAll(arrayList);
        this.currentStep = i10;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        m.f(canvas, "canvas");
        if (isInEditMode()) {
            return;
        }
        r<Float, Float, Float> a10 = a(this.data);
        float floatValue = ((Number) a10.a()).floatValue();
        float floatValue2 = ((Number) a10.b()).floatValue();
        float floatValue3 = ((Number) a10.c()).floatValue();
        this.minWidth = floatValue;
        this.spacing = floatValue2;
        this.perMinute = floatValue3;
        Iterator<Float> it = this.data.iterator();
        int i10 = 0;
        float f10 = 0.0f;
        while (it.hasNext()) {
            int i11 = i10 + 1;
            float floatValue4 = ((it.next().floatValue() - 1) * floatValue3) + floatValue;
            Paint paint = this.blackPaint;
            int i12 = this.currentStep;
            if (i10 < i12) {
                paint = this.meaterRedPaint;
            } else if (i10 > i12) {
                paint = this.greyPaint;
            }
            float f11 = f10 + floatValue4;
            canvas.drawRect(f10, 0.0f, f11, getHeight(), paint);
            if (i10 < this.data.size()) {
                float f12 = f11 + floatValue2;
                canvas.drawRect(f11, 0.0f, f12, getHeight(), this.whitePaint);
                f10 = f12;
                i10 = i11;
            } else {
                i10 = i11;
                f10 = f11;
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.viewWidth = i10;
        this.viewHeight = i11;
    }
}
