package V9;

import S9.b;
import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;

/* compiled from: ScaleDownAnimation.java */
/* loaded from: classes2.dex */
public class g extends f {
    public g(b.a aVar) {
        super(aVar);
    }

    @Override // V9.f
    protected PropertyValuesHolder n(boolean z10) {
        int i10;
        int i11;
        String str;
        if (z10) {
            i11 = this.f18204g;
            i10 = (int) (i11 * this.f18205h);
            str = "ANIMATION_SCALE_REVERSE";
        } else {
            i10 = this.f18204g;
            i11 = (int) (i10 * this.f18205h);
            str = "ANIMATION_SCALE";
        }
        PropertyValuesHolder propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, i10, i11);
        propertyValuesHolderOfInt.setEvaluator(new IntEvaluator());
        return propertyValuesHolderOfInt;
    }
}
