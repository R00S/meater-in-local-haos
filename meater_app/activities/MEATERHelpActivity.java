package com.apptionlabs.meater_app.activities;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n0;
import f8.l0;
import h6.x0;
import java.util.Iterator;

/* loaded from: /tmp/meat/meat/classes.dex */
public class MEATERHelpActivity extends j {

    /* renamed from: a0, reason: collision with root package name */
    b6.o f9419a0;

    /* renamed from: b0, reason: collision with root package name */
    private x0 f9420b0;

    /* renamed from: c0, reason: collision with root package name */
    private Menu f9421c0;

    /* renamed from: d0, reason: collision with root package name */
    android.view.o f9422d0 = new a(true);

    /* loaded from: /tmp/meat/meat/classes.dex */
    class a extends android.view.o {
        a(boolean z10) {
            super(z10);
        }

        @Override // android.view.o
        public void d() {
            if (MEATERHelpActivity.this.f9420b0 != null) {
                MEATERHelpActivity.this.f9420b0.I2();
            } else {
                MEATERHelpActivity.this.finish();
            }
        }
    }

    private void e2() {
        x0 G2 = x0.G2();
        this.f9420b0 = G2;
        f2(G2);
    }

    private void f2(Fragment fragment) {
        FragmentManager m02 = m0();
        n0 p10 = m02.p();
        Iterator<Fragment> it = m02.y0().iterator();
        while (it.hasNext()) {
            p10.q(it.next());
        }
        Fragment j02 = m02.j0(fragment.getClass().getSimpleName());
        if (j02 != null) {
            p10.B(j02);
        } else {
            p10.c(2131362206, fragment, fragment.getClass().getSimpleName());
        }
        p10.j();
    }

    private void h2(View view) {
        int f10;
        ConstraintLayout.b bVar = (ConstraintLayout.b) view.getLayoutParams();
        if (getResources().getConfiguration().orientation == 2) {
            f10 = (int) getResources().getDimension(2131165827);
        } else {
            f10 = l0.f(com.apptionlabs.meater_app.app.a.i().getResources().getDisplayMetrics().widthPixels);
        }
        bVar.T = f10;
    }

    public void g2() {
        this.f9421c0.findItem(2131362371).setVisible(this.f9420b0.J2());
    }

    @Override // com.apptionlabs.meater_app.activities.j, androidx.appcompat.app.c, android.view.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        h2(this.f9419a0.R);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.j, com.apptionlabs.meater_app.activities.OrientationActivity, androidx.fragment.app.s, android.view.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9419a0 = (b6.o) androidx.databinding.g.j(this, 2131558443);
        e2();
        getOnBackPressedDispatcher().h(this, this.f9422d0);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131689478, menu);
        this.f9421c0 = menu;
        menu.findItem(2131362371).setVisible(false);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 2131362371) {
            this.f9420b0.H2();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
