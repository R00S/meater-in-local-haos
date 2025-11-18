package cm.aptoide.p092pt.root;

import android.util.Log;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.root.exceptions.RootDeniedException;
import cm.aptoide.p092pt.root.execution.Command;
import cm.aptoide.p092pt.root.execution.Shell;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeoutException;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class RootShell {
    private static final String TAG = "RootShell";
    public static boolean debugMode = false;
    public static int defaultCommandTimeout = 20000;
    public static boolean handlerEnabled = true;
    public static final String version = "RootShell v1.4.1-aptoide";

    /* renamed from: cm.aptoide.pt.root.RootShell$5 */
    static /* synthetic */ class C41515 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$root$RootShell$LogLevel;

        static {
            int[] iArr = new int[LogLevel.values().length];
            $SwitchMap$cm$aptoide$pt$root$RootShell$LogLevel = iArr;
            try {
                iArr[LogLevel.VERBOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$root$RootShell$LogLevel[LogLevel.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$root$RootShell$LogLevel[LogLevel.DEBUG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$root$RootShell$LogLevel[LogLevel.WARN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum LogLevel {
        VERBOSE,
        ERROR,
        DEBUG,
        WARN
    }

    public static void closeAllShells() throws IOException {
        Shell.closeAll();
    }

    public static void closeCustomShell() throws IOException {
        Shell.closeCustomShell();
    }

    public static void closeShell(boolean z) throws IOException {
        if (z) {
            Shell.closeRootShell();
        } else {
            Shell.closeShell();
        }
    }

    private static void commandWait(Shell shell, Command command) throws Exception {
        while (!command.isFinished()) {
            log(version, shell.getCommandQueuePositionString(command));
            log(version, "Processed " + command.totalOutputProcessed + " of " + command.totalOutput + " output from command.");
            synchronized (command) {
                try {
                    if (!command.isFinished()) {
                        command.wait(2000L);
                    }
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
            if (!command.isExecuting() && !command.isFinished()) {
                boolean z = shell.isExecuting;
                if (!z && !shell.isReading) {
                    log(version, "Waiting for a command to be executed in a shell that is not executing and not reading! \n\n Command: " + command.getCommand());
                    Exception exc = new Exception();
                    exc.setStackTrace(Thread.currentThread().getStackTrace());
                    exc.printStackTrace();
                } else if (!z || shell.isReading) {
                    log(version, "Waiting for a command to be executed in a shell that is not reading! \n\n Command: " + command.getCommand());
                    Exception exc2 = new Exception();
                    exc2.setStackTrace(Thread.currentThread().getStackTrace());
                    exc2.printStackTrace();
                } else {
                    log(version, "Waiting for a command to be executed in a shell that is executing but not reading! \n\n Command: " + command.getCommand());
                    Exception exc3 = new Exception();
                    exc3.setStackTrace(Thread.currentThread().getStackTrace());
                    exc3.printStackTrace();
                }
            }
        }
    }

    public static boolean exists(String str) {
        return exists(str, false);
    }

    public static List<String> findBinary(String str, boolean z) {
        return findBinary(str, null, z);
    }

    public static Shell getCustomShell(String str, int i2) throws RootDeniedException, TimeoutException, IOException {
        return getCustomShell(str, i2);
    }

    public static List<String> getPath() {
        return Arrays.asList(System.getenv("PATH").split(":"));
    }

    public static Shell getShell(boolean z, int i2, Shell.ShellContext shellContext, int i3) throws RootDeniedException, TimeoutException, IOException {
        return z ? Shell.startRootShell(i2, shellContext, i3) : Shell.startShell(i2);
    }

    public static boolean isAccessGiven() {
        final HashSet<String> hashSet = new HashSet();
        boolean z = false;
        try {
            log("Checking for Root access");
            Command command = new Command(158, z, new String[]{DeepLinkIntentReceiver.DeepLinksKeys.f7163ID}) { // from class: cm.aptoide.pt.root.RootShell.4
                @Override // cm.aptoide.p092pt.root.execution.Command
                public void commandOutput(int i2, String str) {
                    if (i2 == 158) {
                        hashSet.addAll(Arrays.asList(str.split(" ")));
                    }
                    super.commandOutput(i2, str);
                }
            };
            Shell.startRootShell().add(command);
            commandWait(Shell.startRootShell(), command);
            for (String str : hashSet) {
                log(str);
                if (str.toLowerCase().contains("uid=0")) {
                    log("Access Given");
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            Logger.getInstance().m8279e(TAG, (Throwable) e2);
            return false;
        }
    }

    public static boolean isBusyboxAvailable() {
        return findBinary("busybox", true).size() > 0 || findBinary("toybox", true).size() > 0;
    }

    public static boolean isRootAvailable() {
        return findBinary("su", true).size() > 0;
    }

    public static boolean islog() {
        return debugMode;
    }

    public static void log(String str) {
        log(null, str, LogLevel.DEBUG, null);
    }

    public static boolean exists(String str, boolean z) {
        final ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        sb.append("ls ");
        sb.append(z ? "-d " : " ");
        String string = sb.toString();
        byte b2 = 0;
        byte b3 = 0;
        Command command = new Command(0, 0 == true ? 1 : 0, new String[]{string + str}) { // from class: cm.aptoide.pt.root.RootShell.1
            @Override // cm.aptoide.p092pt.root.execution.Command
            public void commandOutput(int i2, String str2) {
                RootShell.log(str2);
                arrayList.add(str2);
                super.commandOutput(i2, str2);
            }
        };
        try {
            getShell(false).add(command);
            commandWait(getShell(false), command);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).trim().equals(str)) {
                    return true;
                }
            }
            arrayList.clear();
            Command command2 = new Command(b3 == true ? 1 : 0, b2 == true ? 1 : 0, new String[]{string + str}) { // from class: cm.aptoide.pt.root.RootShell.2
                @Override // cm.aptoide.p092pt.root.execution.Command
                public void commandOutput(int i2, String str2) {
                    RootShell.log(str2);
                    arrayList.add(str2);
                    super.commandOutput(i2, str2);
                }
            };
            try {
                getShell(true).add(command2);
                commandWait(getShell(true), command2);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(arrayList);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    if (((String) it2.next()).trim().equals(str)) {
                        return true;
                    }
                }
                return false;
            } catch (Exception e2) {
                if (e2 instanceof RootDeniedException) {
                    return true;
                }
                log("Exception: " + e2);
                return false;
            }
        } catch (Exception e3) {
            log("Exception: " + e3);
            return false;
        }
    }

    public static List<String> findBinary(final String str, List<String> list, boolean z) {
        final ArrayList arrayList = new ArrayList();
        if (list == null) {
            list = getPath();
        }
        log("Checking for " + str);
        boolean z2 = false;
        try {
            for (String str2 : list) {
                if (!str2.endsWith("/")) {
                    str2 = str2 + "/";
                }
                final String str3 = str2;
                commandWait(getShell(false), getShell(false).add(new Command(0, false, new String[]{"stat " + str3 + str}) { // from class: cm.aptoide.pt.root.RootShell.3
                    @Override // cm.aptoide.p092pt.root.execution.Command
                    public void commandOutput(int i2, String str4) {
                        if (str4.contains("File: ") && str4.contains(str)) {
                            arrayList.add(str3);
                            RootShell.log(str + " was found here: " + str3);
                        }
                        RootShell.log(str4);
                        super.commandOutput(i2, str4);
                    }
                }));
                if (arrayList.size() > 0 && z) {
                    break;
                }
            }
            z2 = !arrayList.isEmpty();
        } catch (Exception unused) {
            log(str + " was not found, more information MAY be available with Debugging on.");
        }
        if (!z2) {
            log("Trying second method");
            for (String str4 : list) {
                if (!str4.endsWith("/")) {
                    str4 = str4 + "/";
                }
                if (exists(str4 + str)) {
                    log(str + " was found here: " + str4);
                    arrayList.add(str4);
                    if (arrayList.size() > 0 && z) {
                        break;
                    }
                } else {
                    log(str + " was NOT found here: " + str4);
                }
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public static void log(String str, String str2) {
        log(str, str2, LogLevel.DEBUG, null);
    }

    public static Shell getShell(boolean z, int i2, Shell.ShellContext shellContext) throws RootDeniedException, TimeoutException, IOException {
        return getShell(z, i2, shellContext, 3);
    }

    public static void log(String str, LogLevel logLevel, Exception exc) {
        log(null, str, logLevel, exc);
    }

    public static Shell getShell(boolean z, Shell.ShellContext shellContext) throws RootDeniedException, TimeoutException, IOException {
        return getShell(z, 0, shellContext, 3);
    }

    public static void log(String str, String str2, LogLevel logLevel, Exception exc) {
        if (str2 == null || str2.equals(HttpUrl.FRAGMENT_ENCODE_SET) || !debugMode) {
            return;
        }
        if (str == null) {
            str = version;
        }
        int i2 = C41515.$SwitchMap$cm$aptoide$pt$root$RootShell$LogLevel[logLevel.ordinal()];
        if (i2 == 1) {
            Log.v(str, str2);
            return;
        }
        if (i2 == 2) {
            Log.e(str, str2, exc);
        } else if (i2 == 3) {
            Log.d(str, str2);
        } else {
            if (i2 != 4) {
                return;
            }
            Log.w(str, str2);
        }
    }

    public static Shell getShell(boolean z, int i2) throws RootDeniedException, TimeoutException, IOException {
        return getShell(z, i2, Shell.defaultContext, 3);
    }

    public static Shell getShell(boolean z) throws RootDeniedException, TimeoutException, IOException {
        return getShell(z, 0);
    }
}
