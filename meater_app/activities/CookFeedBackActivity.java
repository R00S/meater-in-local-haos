package com.apptionlabs.meater_app.activities;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n0;
import com.apptionlabs.meater_app.cloud.requests.CookFeedBack;
import com.apptionlabs.meater_app.cloud.requests.CookMethod;
import com.apptionlabs.meater_app.data.Data;
import com.apptionlabs.meater_app.data.LocalStorage;
import com.apptionlabs.meater_app.data.Log;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.model.SavedCook;
import h6.c0;
import h6.f0;
import h6.h0;
import h6.q0;

/* loaded from: /tmp/meat/meat/classes.dex */
public class CookFeedBackActivity extends OrientationActivity {
    b6.g S;
    CookFeedBack T;
    SavedCook U = null;
    android.view.o V = new a(true);

    /* loaded from: /tmp/meat/meat/classes.dex */
    class a extends android.view.o {
        a(boolean z10) {
            super(z10);
        }

        @Override // android.view.o
        public void d() {
            if (CookFeedBackActivity.this.m0().i0(2131362015) instanceof f0) {
                CookFeedBackActivity.this.finish();
            } else {
                CookFeedBackActivity.this.finish();
            }
        }
    }

    public void L0(c0 c0Var, String str) {
        this.T.message = str;
        y5.a aVar = new y5.a();
        aVar.d(c0Var);
        aVar.c(this.T);
    }

    public SavedCook M0() {
        return this.U;
    }

    public void N0(Data data) {
        Q0(f0.C2(data));
    }

    public void O0(String str) {
        this.T.ovenGrillBrand = str;
        Q0(c0.A2());
    }

    public void P0(CookMethod cookMethod, String str) {
        this.T.cookMethod = Integer.valueOf(cookMethod.id);
        this.T.cookMethodOther = str;
        Q0(h0.y2());
    }

    public void Q0(Fragment fragment) {
        if (!isFinishing()) {
            m0().p().t(2131362015, fragment).h("").k();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.apptionlabs.meater_app.activities.OrientationActivity, androidx.fragment.app.s, android.view.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SavedCook f10 = LocalStorage.sharedStorage().savedCookDAO().f(getIntent().getLongExtra(MEATERIntent.EXTRA_COOK_ID, -1L));
        this.U = f10;
        if (f10 == null) {
            Log.info("[COOK_FEEDBACK]", "cook null onCreate()");
            finish();
            return;
        }
        this.T = new CookFeedBack(f10.cookIDString(), this.U.getFeedback());
        this.S = (b6.g) androidx.databinding.g.j(this, 2131558438);
        if (!isFinishing()) {
            n0 p10 = m0().p();
            p10.b(2131362015, q0.K2());
            p10.j();
        }
        getOnBackPressedDispatcher().h(this, this.V);
    }
}
