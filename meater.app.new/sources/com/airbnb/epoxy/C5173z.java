package com.airbnb.epoxy;

import okhttp3.HttpUrl;

/* compiled from: ImmutableModelException.java */
/* renamed from: com.airbnb.epoxy.z */
/* loaded from: classes.dex */
class C5173z extends RuntimeException {
    C5173z(AbstractC5166s abstractC5166s, int i2) {
        this(abstractC5166s, HttpUrl.FRAGMENT_ENCODE_SET, i2);
    }

    /* renamed from: a */
    private static String m9370a(AbstractC5166s abstractC5166s, String str, int i2) {
        return str + " Position: " + i2 + " Model: " + abstractC5166s.toString() + "\n\nEpoxy attribute fields on a model cannot be changed once the model is added to a controller. Check that these fields are not updated, or that the assigned objects are not mutated, outside of the buildModels method. The only exception is if the change is made inside an Interceptor callback. Consider using an interceptor if you need to change a model after it is added to the controller and before it is set on the adapter. If the model is already set on the adapter then you must call `requestModelBuild` instead to recreate all models.";
    }

    C5173z(AbstractC5166s abstractC5166s, String str, int i2) {
        super(m9370a(abstractC5166s, str, i2));
    }
}
