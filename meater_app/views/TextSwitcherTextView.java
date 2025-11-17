package com.apptionlabs.meater_app.views;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.Timer;

/* loaded from: /tmp/meat/meat/classes.dex */
public class TextSwitcherTextView extends AppCompatTextView {
    private int A;

    /* renamed from: x, reason: collision with root package name */
    private Timer f10432x;

    /* renamed from: y, reason: collision with root package name */
    Handler f10433y;

    /* renamed from: z, reason: collision with root package name */
    private ArrayList<SpannableStringBuilder> f10434z;

    /* loaded from: /tmp/meat/meat/classes.dex */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            TextSwitcherTextView.this.t();
        }
    }

    public TextSwitcherTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10433y = new a(Looper.getMainLooper());
        this.f10434z = new ArrayList<>();
        this.A = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        if (this.f10434z.size() == 0) {
            return;
        }
        try {
            setText(this.f10434z.get(this.A));
        } catch (Resources.NotFoundException unused) {
            u();
        }
        if (this.A < this.f10434z.size() - 1) {
            this.A++;
        } else {
            this.A = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
    }

    public void setTextList(ArrayList<SpannableStringBuilder> arrayList) {
        this.f10434z = arrayList;
    }

    public void u() {
        Timer timer = this.f10432x;
        if (timer != null) {
            timer.cancel();
            this.f10432x = null;
        }
    }
}
