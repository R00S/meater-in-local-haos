package com.apptionlabs.meater_app.views;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* loaded from: /tmp/meat/meat/classes.dex */
public class ScaleButton extends RelativeLayout {

    /* renamed from: q, reason: collision with root package name */
    ImageView f10414q;

    /* renamed from: r, reason: collision with root package name */
    private b f10415r;

    /* renamed from: s, reason: collision with root package name */
    private long f10416s;

    /* renamed from: t, reason: collision with root package name */
    private int f10417t;

    /* renamed from: u, reason: collision with root package name */
    private int f10418u;

    /* renamed from: v, reason: collision with root package name */
    long f10419v;

    /* renamed from: w, reason: collision with root package name */
    Handler f10420w;

    /* renamed from: x, reason: collision with root package name */
    final Runnable f10421x;

    /* loaded from: /tmp/meat/meat/classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            double currentTimeMillis = System.currentTimeMillis() - ScaleButton.this.f10416s;
            if (currentTimeMillis < 2500.0d) {
                ScaleButton.this.f10417t = 1;
                ScaleButton.this.f10419v = 400L;
            } else if (currentTimeMillis >= 3000.0d) {
                ScaleButton.this.f10417t = 2;
                ScaleButton.this.f10419v = 100L;
            }
            ScaleButton.this.f10415r.a(ScaleButton.this.f10417t * ScaleButton.this.f10418u);
            ScaleButton scaleButton = ScaleButton.this;
            scaleButton.f10420w.postDelayed(this, scaleButton.f10419v);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public interface b {
        void a(int i10);
    }

    public ScaleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10417t = 1;
        this.f10419v = 700L;
        this.f10420w = new Handler(Looper.getMainLooper());
        this.f10421x = new a();
        g(context);
    }

    private void g(Context context) {
        View.inflate(context, 2131558670, this);
        ImageView imageView = (ImageView) findViewById(2131362092);
        this.f10414q = imageView;
        int i10 = (int) (b1.f10467g / 3.0f);
        imageView.getLayoutParams().width = i10;
        this.f10414q.getLayoutParams().height = i10;
        this.f10414q.requestLayout();
        this.f10414q.setOnTouchListener(new View.OnTouchListener() { // from class: com.apptionlabs.meater_app.views.i1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean h10;
                h10 = ScaleButton.this.h(view, motionEvent);
                return h10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean h(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                return false;
            }
            this.f10414q.clearColorFilter();
            this.f10420w.removeMessages(0);
            return true;
        }
        this.f10414q.setColorFilter(f8.l0.h(2131100472));
        this.f10416s = System.currentTimeMillis();
        this.f10415r.a(this.f10418u);
        this.f10420w.postDelayed(this.f10421x, 1000L);
        return true;
    }

    public ImageView getButtonImage() {
        return this.f10414q;
    }

    public void setButtonClickValue(int i10) {
        this.f10417t = i10;
        this.f10418u = i10;
    }

    public void setIcon(int i10) {
        this.f10414q.setImageResource(i10);
    }

    public void setListener(b bVar) {
        this.f10415r = bVar;
    }
}
