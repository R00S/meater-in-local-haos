package cm.aptoide.p092pt.view.custom;

import android.content.Context;
import android.graphics.Canvas;
import androidx.core.content.C0255a;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.C1146R;
import cm.aptoide.p092pt.themes.ThemeManager;

/* loaded from: classes.dex */
public class HorizontalDividerItemDecoration extends DrawableItemDecoration {
    public HorizontalDividerItemDecoration(Context context, ThemeManager themeManager) {
        this(context, 0, themeManager);
    }

    @Override // cm.aptoide.p092pt.view.custom.DrawableItemDecoration, androidx.recyclerview.widget.RecyclerView.AbstractC0601n
    public /* bridge */ /* synthetic */ void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0613z c0613z) {
        super.onDrawOver(canvas, recyclerView, c0613z);
    }

    public HorizontalDividerItemDecoration(Context context, int i2, ThemeManager themeManager) {
        super(C0255a.m1677f(context, themeManager.getAttributeForTheme(C1146R.attr.backgroundSecondary).resourceId), i2);
    }
}
