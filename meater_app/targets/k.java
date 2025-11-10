package com.apptionlabs.meater_app.targets;

import android.os.Bundle;
import com.apptionlabs.meater_app.meatCutStructure.Meat;
import com.apptionlabs.meater_app.meatCutStructure.MeatCutType;
import com.apptionlabs.meater_app.meatCutStructure.MeatCutsHelper;
import com.apptionlabs.meater_app.meatCutStructure.MeatModel;
import com.apptionlabs.meater_app.targets.b;
import java.util.Locale;

/* compiled from: CutTypeFragment.java */
/* loaded from: /tmp/meat/meat/classes.dex */
public class k extends b<MeatModel, MeatModel> {
    j6.h W0;

    public static k W2(MeatModel meatModel) {
        k kVar = new k();
        kVar.k2(a.x2(meatModel));
        return kVar;
    }

    @Override // com.apptionlabs.meater_app.targets.a, androidx.fragment.app.Fragment
    public void a1(Bundle bundle) {
        Meat firstMeatOfCategory;
        super.a1(bundle);
        j6.h hVar = (j6.h) S();
        this.W0 = hVar;
        if (hVar != null) {
            hVar.d();
        }
        this.f10093y0 = b.EnumC0148b.CutType;
        if (z2() != -1) {
            firstMeatOfCategory = MeatCutsHelper.getInstance().getMeatType(A2(), z2());
        } else {
            firstMeatOfCategory = MeatCutsHelper.getInstance().getFirstMeatOfCategory(A2());
        }
        if (firstMeatOfCategory == null) {
            S().finish();
            return;
        }
        C2(firstMeatOfCategory);
        R2(firstMeatOfCategory.category);
        U2(firstMeatOfCategory.cutTypes);
        MeatCutType meatCutType = firstMeatOfCategory.cutTypes.get(0);
        if (meatCutType == null) {
            S().finish();
        } else {
            T2(MeatCutsHelper.getInstance().getFilteredCutsByCountryBase(Locale.getDefault().getCountry(), meatCutType.cuts));
            lm.b.m(S(), "Setup Cook (Smart) > IMAGE URL ????>  Select Cut");
        }
    }
}
