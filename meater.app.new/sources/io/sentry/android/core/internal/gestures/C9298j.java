package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.internal.gestures.C9479b;
import io.sentry.internal.gestures.InterfaceC9478a;
import io.sentry.util.C9646q;
import java.util.Iterator;
import java.util.LinkedList;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: ViewUtils.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.internal.gestures.j */
/* loaded from: classes2.dex */
public final class C9298j {
    /* renamed from: a */
    static C9479b m30256a(SentryAndroidOptions sentryAndroidOptions, View view, float f2, float f3, C9479b.a aVar) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        C9479b c9479b = null;
        while (linkedList.size() > 0) {
            View view2 = (View) C9646q.m31802c((View) linkedList.poll(), "view is required");
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    linkedList.add(viewGroup.getChildAt(i2));
                }
            }
            Iterator<InterfaceC9478a> it = sentryAndroidOptions.getGestureTargetLocators().iterator();
            while (it.hasNext()) {
                C9479b c9479bMo30223a = it.next().mo30223a(view2, f2, f3, aVar);
                if (c9479bMo30223a != null) {
                    if (aVar != C9479b.a.CLICKABLE) {
                        return c9479bMo30223a;
                    }
                    c9479b = c9479bMo30223a;
                }
            }
        }
        return c9479b;
    }

    /* renamed from: b */
    public static String m30257b(View view) throws Resources.NotFoundException {
        int id = view.getId();
        if (id == -1 || m30258c(id)) {
            throw new Resources.NotFoundException();
        }
        Resources resources = view.getContext().getResources();
        return resources != null ? resources.getResourceEntryName(id) : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* renamed from: c */
    private static boolean m30258c(int i2) {
        return ((-16777216) & i2) == 0 && (i2 & 16777215) != 0;
    }
}
