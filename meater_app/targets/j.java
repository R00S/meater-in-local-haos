package com.apptionlabs.meater_app.targets;

import android.os.Bundle;
import com.apptionlabs.meater_app.meatCutStructure.Meat;
import com.apptionlabs.meater_app.meatCutStructure.MeatCategory;
import com.apptionlabs.meater_app.meatCutStructure.MeatCutType;
import com.apptionlabs.meater_app.meatCutStructure.MeatCutsHelper;
import com.apptionlabs.meater_app.meatCutStructure.MeatModel;
import com.apptionlabs.meater_app.targets.MeaterTargetSetupActivity;
import com.apptionlabs.meater_app.targets.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: CutSelectFragment.java */
/* loaded from: /tmp/meat/meat/classes.dex */
public class j extends b<MeatModel, MeatModel> {
    j6.h W0;

    public static j W2(MeatModel meatModel) {
        j jVar = new j();
        jVar.k2(a.x2(meatModel));
        return jVar;
    }

    @Override // com.apptionlabs.meater_app.targets.a, androidx.fragment.app.Fragment
    public void a1(Bundle bundle) {
        List<Meat> filteredCutsByCountry;
        super.a1(bundle);
        j6.h hVar = (j6.h) S();
        this.W0 = hVar;
        if (hVar != null) {
            hVar.d();
        }
        this.f10093y0 = b.EnumC0148b.AnimalType;
        MeaterTargetSetupActivity.b bVar = ((MeaterTargetSetupActivity) S()).f10067a0;
        MeatCutType cutType = MeatCutsHelper.getInstance().getCutType(bVar.f10078a, bVar.f10079b, bVar.f10080c);
        MeatCategory category = MeatCutsHelper.getInstance().getCategory(bVar.f10078a);
        R2(category);
        if (category != null) {
            if (cutType == null) {
                filteredCutsByCountry = MeatCutsHelper.getInstance().getFilteredAnimalsByCountry(Locale.getDefault().getCountry(), L2().meats);
            } else {
                filteredCutsByCountry = MeatCutsHelper.getInstance().getFilteredCutsByCountry(Locale.getDefault().getCountry(), cutType.cuts);
            }
            T2(new ArrayList(filteredCutsByCountry));
        }
    }
}
