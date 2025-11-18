package cm.aptoide.p092pt.util;

import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.logger.Logger;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ScreenTrackingUtils {
    static final String LIFE_CYCLE_STATE = "LIFE_CYCLE_STATE";
    static final String NUMBER_OF_SCREENS = "NUMBER_OF_SCREENS";
    static final String NUMBER_OF_SCREENS_ON_BACK_STACK = "NUMBER_OF_SCREENS_ON_BACK_STACK";
    static final String SCREEN_HISTORY = "SCREEN_HISTORY";
    private static final String TAG = "ScreenTrackingUtils";
    private int MAX_HISTORY;
    private ArrayList<String> history;
    private int numberScreensOnBackStack;
    private int totalNumberScreens;

    public enum LifeCycle {
        CREATE,
        DESTROY
    }

    private static class ScreenUtilsHelper {
        private static final ScreenTrackingUtils INSTANCE = new ScreenTrackingUtils();

        private ScreenUtilsHelper() {
        }
    }

    public static ScreenTrackingUtils getInstance() {
        return ScreenUtilsHelper.INSTANCE;
    }

    public void addScreenToHistory(String str) {
        if (this.history.size() >= this.MAX_HISTORY) {
            this.history.remove(0);
        }
        this.history.add(str);
        CrashReport.getInstance().log(SCREEN_HISTORY, this.history.toString());
        Logger.getInstance().m8273d(TAG, "addScreenToHistory: " + this.history.toString());
    }

    public void decrementNumberOfScreens() {
        this.numberScreensOnBackStack--;
        CrashReport.getInstance().log(NUMBER_OF_SCREENS_ON_BACK_STACK, String.valueOf(this.numberScreensOnBackStack));
        CrashReport.getInstance().log(LIFE_CYCLE_STATE, LifeCycle.DESTROY.toString());
        Logger.getInstance().m8273d(TAG, "decrementNumberOfScreens: NOSOBS: " + String.valueOf(this.numberScreensOnBackStack));
    }

    public void incrementNumberOfScreens() {
        this.totalNumberScreens++;
        this.numberScreensOnBackStack++;
        CrashReport.getInstance().log(NUMBER_OF_SCREENS, String.valueOf(this.totalNumberScreens));
        CrashReport.getInstance().log(NUMBER_OF_SCREENS_ON_BACK_STACK, String.valueOf(this.numberScreensOnBackStack));
        CrashReport.getInstance().log(LIFE_CYCLE_STATE, LifeCycle.CREATE.toString());
        Logger.getInstance().m8273d(TAG, "incrementNumberOfScreens: NOS: NUMBER_OF_SCREENS, NOSOBS: NUMBER_OF_SCREENS_ON_BACK_STACK");
    }

    private ScreenTrackingUtils() {
        this.history = new ArrayList<>();
        this.MAX_HISTORY = 10;
        this.totalNumberScreens = 0;
        this.numberScreensOnBackStack = 0;
    }
}
