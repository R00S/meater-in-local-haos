package f1;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import f1.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: NotificationCompatJellybean.java */
/* loaded from: classes.dex */
class p {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f41168a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f41169b = new Object();

    static Bundle a(m.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat iconCompatD = aVar.d();
        bundle.putInt("icon", iconCompatD != null ? iconCompatD.f() : 0);
        bundle.putCharSequence("title", aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    private static Bundle b(w wVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", wVar.i());
        bundle.putCharSequence("label", wVar.h());
        bundle.putCharSequenceArray("choices", wVar.e());
        bundle.putBoolean("allowFreeFormInput", wVar.c());
        bundle.putBundle("extras", wVar.g());
        Set<String> setD = wVar.d();
        if (setD != null && !setD.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(setD.size());
            Iterator<String> it = setD.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    private static Bundle[] c(w[] wVarArr) {
        if (wVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[wVarArr.length];
        for (int i10 = 0; i10 < wVarArr.length; i10++) {
            bundleArr[i10] = b(wVarArr[i10]);
        }
        return bundleArr;
    }
}
