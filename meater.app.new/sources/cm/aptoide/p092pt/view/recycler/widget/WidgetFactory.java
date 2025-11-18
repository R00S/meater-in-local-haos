package cm.aptoide.p092pt.view.recycler.widget;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.WindowManager;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class WidgetFactory {
    private static final String TAG = "cm.aptoide.pt.view.recycler.widget.WidgetFactory";
    private static int columnSize = -1;
    private static int orientation = -1;

    private WidgetFactory() {
    }

    private static void computeColumnSize(Resources resources, WindowManager windowManager) {
        if (orientation != AptoideUtils.ScreenU.getCurrentOrientation(resources) || columnSize == -1 || orientation == -1) {
            columnSize = AptoideUtils.MathU.leastCommonMultiple(getDisplayablesSizes(windowManager, resources));
            orientation = AptoideUtils.ScreenU.getCurrentOrientation(resources);
        }
    }

    public static int getColumnSize(Resources resources, WindowManager windowManager) {
        computeColumnSize(resources, windowManager);
        return columnSize;
    }

    private static int[] getDisplayablesSizes(WindowManager windowManager, Resources resources) {
        List<Displayable> cachedDisplayables = AptoideApplication.getDisplayableWidgetMapping().getCachedDisplayables();
        int[] iArr = new int[cachedDisplayables.size()];
        Iterator<Displayable> it = cachedDisplayables.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = it.next().getPerLineCount(windowManager, resources);
            i2++;
        }
        return iArr;
    }

    public static Widget newBaseViewHolder(ViewGroup viewGroup, int i2) {
        return AptoideApplication.getDisplayableWidgetMapping().newWidget(LayoutInflater.from(viewGroup.getContext()).inflate(i2, viewGroup, false), i2);
    }
}
