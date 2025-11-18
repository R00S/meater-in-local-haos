package com.airbnb.epoxy;

import com.airbnb.epoxy.AbstractC5153n;
import java.util.List;

/* compiled from: ControllerHelper.java */
/* renamed from: com.airbnb.epoxy.f */
/* loaded from: classes.dex */
public abstract class AbstractC5137f<T extends AbstractC5153n> {
    public abstract void resetAutoModels();

    protected void setControllerToStageTo(AbstractC5166s<?> abstractC5166s, T t) {
        abstractC5166s.controllerToStageTo = t;
    }

    protected void validateModelHashCodesHaveNotChanged(T t) {
        List<AbstractC5166s<?>> listM9319D = t.getAdapter().m9319D();
        for (int i2 = 0; i2 < listM9319D.size(); i2++) {
            listM9319D.get(i2).validateStateHasNotChangedSinceAdded("Model has changed since it was added to the controller.", i2);
        }
    }
}
