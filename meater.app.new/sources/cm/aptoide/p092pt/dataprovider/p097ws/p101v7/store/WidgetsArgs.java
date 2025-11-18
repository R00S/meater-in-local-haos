package cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store;

import android.content.res.Resources;
import android.view.WindowManager;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Type;
import cm.aptoide.p092pt.dataprovider.util.HashMapNotNull;

/* loaded from: classes.dex */
public class WidgetsArgs extends HashMapNotNull<Key, GridSizeObject> {

    protected static class GridSizeObject {
        private int grid_row_size;

        public GridSizeObject(int i2) {
            this.grid_row_size = i2;
        }

        public int getGrid_row_size() {
            return this.grid_row_size;
        }

        public void setGrid_row_size(int i2) {
            this.grid_row_size = i2;
        }
    }

    public enum Key {
        APPS_GROUP,
        MY_STORES_SUBSCRIBED,
        STORES_RECOMMENDED,
        STORES_GROUP
    }

    public WidgetsArgs() {
    }

    public static WidgetsArgs createDefault(Resources resources, WindowManager windowManager) {
        return new WidgetsArgs().add(Key.APPS_GROUP, Type.APPS_GROUP.getPerLineCount(resources, windowManager)).add(Key.STORES_GROUP, Type.STORES_GROUP.getPerLineCount(resources, windowManager)).add(Key.MY_STORES_SUBSCRIBED, Type.MY_STORES_SUBSCRIBED.getPerLineCount(resources, windowManager)).add(Key.STORES_RECOMMENDED, Type.STORES_RECOMMENDED.getPerLineCount(resources, windowManager));
    }

    public static WidgetsArgs createWithLineMultiplier(Resources resources, WindowManager windowManager, int i2) {
        return new WidgetsArgs().add(Key.APPS_GROUP, Type.APPS_GROUP.getPerLineCount(resources, windowManager) * i2).add(Key.STORES_GROUP, Type.STORES_GROUP.getPerLineCount(resources, windowManager)).add(Key.MY_STORES_SUBSCRIBED, Type.MY_STORES_SUBSCRIBED.getPerLineCount(resources, windowManager)).add(Key.STORES_RECOMMENDED, Type.STORES_RECOMMENDED.getPerLineCount(resources, windowManager));
    }

    public WidgetsArgs add(Key key, int i2) {
        if (!containsKey(key)) {
            put(key, new GridSizeObject(i2));
        }
        return this;
    }

    public WidgetsArgs(int i2, int i3) {
        add(Key.APPS_GROUP, i2);
        add(Key.STORES_GROUP, i3);
    }
}
