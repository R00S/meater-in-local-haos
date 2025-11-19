package com.google.android.material.timepicker;

import C7.g;
import C7.i;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

/* loaded from: classes2.dex */
class TimePickerView extends ConstraintLayout {

    /* renamed from: d0, reason: collision with root package name */
    private final Chip f37508d0;

    /* renamed from: e0, reason: collision with root package name */
    private final Chip f37509e0;

    /* renamed from: f0, reason: collision with root package name */
    private final ClockHandView f37510f0;

    /* renamed from: g0, reason: collision with root package name */
    private final ClockFaceView f37511g0;

    /* renamed from: h0, reason: collision with root package name */
    private final MaterialButtonToggleGroup f37512h0;

    /* renamed from: i0, reason: collision with root package name */
    private final View.OnClickListener f37513i0;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView.E(TimePickerView.this);
        }
    }

    class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            TimePickerView.F(TimePickerView.this);
            return false;
        }
    }

    class c implements View.OnTouchListener {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ GestureDetector f37516B;

        c(GestureDetector gestureDetector) {
            this.f37516B = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f37516B.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    interface d {
    }

    interface e {
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    static /* synthetic */ e E(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    static /* synthetic */ d F(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    private void H() {
        Chip chip = this.f37508d0;
        int i10 = g.f2461R;
        chip.setTag(i10, 12);
        this.f37509e0.setTag(i10, 10);
        this.f37508d0.setOnClickListener(this.f37513i0);
        this.f37509e0.setOnClickListener(this.f37513i0);
        this.f37508d0.setAccessibilityClassName("android.view.View");
        this.f37509e0.setAccessibilityClassName("android.view.View");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void I() {
        c cVar = new c(new GestureDetector(getContext(), new b()));
        this.f37508d0.setOnTouchListener(cVar);
        this.f37509e0.setOnTouchListener(cVar);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            this.f37509e0.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f37513i0 = new a();
        LayoutInflater.from(context).inflate(i.f2517o, this);
        this.f37511g0 = (ClockFaceView) findViewById(g.f2484k);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(g.f2487n);
        this.f37512h0 = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new MaterialButtonToggleGroup.d() { // from class: com.google.android.material.timepicker.f
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
            public final void a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i11, boolean z10) {
                this.f37531a.G(materialButtonToggleGroup2, i11, z10);
            }
        });
        this.f37508d0 = (Chip) findViewById(g.f2490q);
        this.f37509e0 = (Chip) findViewById(g.f2488o);
        this.f37510f0 = (ClockHandView) findViewById(g.f2485l);
        I();
        H();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10) {
    }
}
