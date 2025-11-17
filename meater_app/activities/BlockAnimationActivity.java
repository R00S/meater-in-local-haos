package com.apptionlabs.meater_app.activities;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.a;
import b6.v0;
import com.apptionlabs.meater_app.activities.BlockAnimationActivity;
import com.apptionlabs.meater_app.views.m0;

/* loaded from: /tmp/meat/meat/classes.dex */
public class BlockAnimationActivity extends j {

    /* renamed from: a0, reason: collision with root package name */
    v0 f9222a0;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e2(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, com.apptionlabs.meater_app.activities.OrientationActivity, androidx.fragment.app.s, android.view.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9222a0 = (v0) androidx.databinding.g.j(this, 2131558465);
        androidx.appcompat.app.a x02 = x0();
        if (x02 != null) {
            View inflate = getLayoutInflater().inflate(2131558697, (ViewGroup) null);
            a.C0017a c0017a = new a.C0017a(-2, -1, 17);
            ((TextView) inflate.findViewById(f.f.L)).setText(getTitle());
            x02.u(inflate, c0017a);
            x02.y(true);
            x02.A(false);
            x02.D(2131100529);
            x02.C(true);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131689472, menu);
        View inflate = getLayoutInflater().inflate(2131558434, (ViewGroup) null);
        menu.findItem(2131361863).setActionView(inflate);
        TextView textView = (TextView) inflate.findViewById(2131361903);
        textView.setText(getString(2132018166));
        textView.setTextSize(0, m0.d());
        textView.setOnClickListener(new View.OnClickListener() { // from class: p5.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlockAnimationActivity.this.e2(view);
            }
        });
        return true;
    }
}
