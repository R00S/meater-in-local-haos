package M5;

import android.os.Bundle;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.meatCutStructure.MeatCutsHelper;
import com.apptionlabs.meater_app.meatCutStructure.MeatModel;

/* compiled from: MeatSelectFragment.java */
/* loaded from: classes2.dex */
public class v extends com.apptionlabs.meater_app.targets.l<MeatModel, MeatModel> {
    @Override // androidx.fragment.app.Fragment
    public void a1(Bundle bundle) {
        super.a1(bundle);
        MeatCutsHelper.getInstance().init();
        J2(R.string.guided_cook_fragment_label_1);
        H2(MeatCutsHelper.getInstance().getCategoriesBase());
        x4.b.l(T(), "Setup Cook (Smart)");
    }
}
