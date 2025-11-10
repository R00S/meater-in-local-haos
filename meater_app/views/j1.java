package com.apptionlabs.meater_app.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Locale;

/* compiled from: ScaleView.java */
/* loaded from: /tmp/meat/meat/classes.dex */
public class j1 extends RelativeLayout {

    /* renamed from: q, reason: collision with root package name */
    private int f10552q;

    /* renamed from: r, reason: collision with root package name */
    private String f10553r;

    /* renamed from: s, reason: collision with root package name */
    private LayoutInflater f10554s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f10555t;

    /* renamed from: u, reason: collision with root package name */
    private int f10556u;

    /* renamed from: v, reason: collision with root package name */
    int f10557v;

    public j1(Context context, int i10, String str, boolean z10, int i11, int i12) {
        super(context);
        this.f10552q = i10;
        this.f10553r = str;
        this.f10555t = z10;
        this.f10556u = i11;
        this.f10557v = i12;
        this.f10554s = (LayoutInflater) context.getSystemService("layout_inflater");
        a();
    }

    private void a() {
        View inflate = this.f10554s.inflate(2131558696, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(2131362337);
        TextView textView2 = (TextView) inflate.findViewById(2131362338);
        TextView textView3 = (TextView) inflate.findViewById(2131362339);
        textView.setTextSize(0, m0.d() * 0.85f);
        textView2.setTextSize(0, m0.d() * 0.85f);
        textView3.setTextSize(0, m0.d() * 0.85f);
        int i10 = this.f10557v;
        int i11 = (i10 / 45) * 5;
        if (this.f10555t) {
            i11 = (i10 / 40) * 5;
        }
        textView.getLayoutParams().width = i11;
        textView3.getLayoutParams().width = i11;
        textView2.getLayoutParams().width = i11;
        if (this.f10555t) {
            textView.setTextSize(0, m0.d() * 0.75f);
            textView2.setTextSize(0, m0.d() * 0.75f);
            textView3.setTextSize(0, m0.d() * 0.75f);
        }
        if (this.f10552q != 0) {
            textView.setVisibility(8);
        } else if (this.f10555t) {
            textView.setText(String.format(Locale.US, "|\n%dm", Integer.valueOf(this.f10556u)));
        } else {
            textView.setText("|\n" + this.f10556u + (char) 176);
        }
        textView2.setText(String.format("|\n%1$s", this.f10553r));
        addView(inflate);
    }
}
