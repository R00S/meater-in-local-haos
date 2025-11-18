package androidx.activity.result.p002d;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.p002d.AbstractC0053a;
import androidx.core.content.C0255a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p024c.p041e.C0867a;

/* compiled from: ActivityResultContracts.java */
/* renamed from: androidx.activity.result.d.b */
/* loaded from: classes.dex */
public final class C0054b extends AbstractC0053a<String[], Map<String, Boolean>> {
    /* renamed from: e */
    static Intent m177e(String[] strArr) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
    }

    @Override // androidx.activity.result.p002d.AbstractC0053a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent mo173a(Context context, String[] strArr) {
        return m177e(strArr);
    }

    @Override // androidx.activity.result.p002d.AbstractC0053a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public AbstractC0053a.a<Map<String, Boolean>> mo174b(Context context, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return new AbstractC0053a.a<>(Collections.emptyMap());
        }
        C0867a c0867a = new C0867a();
        boolean z = true;
        for (String str : strArr) {
            boolean z2 = C0255a.m1672a(context, str) == 0;
            c0867a.put(str, Boolean.valueOf(z2));
            if (!z2) {
                z = false;
            }
        }
        if (z) {
            return new AbstractC0053a.a<>(c0867a);
        }
        return null;
    }

    @Override // androidx.activity.result.p002d.AbstractC0053a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Map<String, Boolean> mo175c(int i2, Intent intent) {
        if (i2 != -1) {
            return Collections.emptyMap();
        }
        if (intent == null) {
            return Collections.emptyMap();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap();
        int length = stringArrayExtra.length;
        for (int i3 = 0; i3 < length; i3++) {
            map.put(stringArrayExtra[i3], Boolean.valueOf(intArrayExtra[i3] == 0));
        }
        return map;
    }
}
