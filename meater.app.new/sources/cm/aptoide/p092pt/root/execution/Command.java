package cm.aptoide.p092pt.root.execution;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import cm.aptoide.p092pt.install.installer.RootCommandOnSubscribe;
import cm.aptoide.p092pt.root.RootShell;
import java.io.IOException;

/* loaded from: classes.dex */
public class Command {
    String[] command;
    protected Context context;
    boolean executing;
    ExecutionMonitor executionMonitor;
    int exitCode;
    boolean finished;
    boolean handlerEnabled;

    /* renamed from: id */
    int f10975id;
    protected boolean javaCommand;
    Handler mHandler;
    boolean terminated;
    int timeout;
    public int totalOutput;
    public int totalOutputProcessed;
    protected boolean used;

    private class CommandHandler extends Handler {
        public static final String ACTION = "action";
        public static final int COMMAND_COMPLETED = 2;
        public static final int COMMAND_OUTPUT = 1;
        public static final int COMMAND_TERMINATED = 3;
        public static final String TEXT = "text";

        private CommandHandler() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i2 = message.getData().getInt("action");
            String string = message.getData().getString(TEXT);
            if (i2 == 1) {
                Command command = Command.this;
                command.commandOutput(command.f10975id, string);
            } else if (i2 == 2) {
                Command command2 = Command.this;
                command2.commandCompleted(command2.f10975id, command2.exitCode);
            } else {
                if (i2 != 3) {
                    return;
                }
                Command command3 = Command.this;
                command3.commandTerminated(command3.f10975id, string);
            }
        }
    }

    private class ExecutionMonitor extends Thread {
        private final Command command;

        public ExecutionMonitor(Command command) {
            this.command = command;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Command command = this.command;
            if (command.timeout > 0) {
                synchronized (command) {
                    try {
                        RootShell.log("Command " + this.command.f10975id + " is waiting for: " + this.command.timeout);
                        Command command2 = this.command;
                        command2.wait((long) command2.timeout);
                    } catch (InterruptedException e2) {
                        RootShell.log("Exception: " + e2);
                    }
                    if (!this.command.isFinished()) {
                        RootShell.log("Timeout Exception has occurred for command: " + this.command.f10975id + ".");
                        Command.this.terminate(RootCommandOnSubscribe.TIMEOUT_EXCEPTION);
                    }
                }
            }
        }
    }

    public Command(int i2, String... strArr) {
        this.totalOutput = 0;
        this.totalOutputProcessed = 0;
        this.javaCommand = false;
        this.context = null;
        this.used = false;
        this.executionMonitor = null;
        this.mHandler = null;
        this.executing = false;
        this.command = new String[0];
        this.finished = false;
        this.terminated = false;
        this.handlerEnabled = true;
        this.exitCode = -1;
        this.f10975id = 0;
        this.timeout = RootShell.defaultCommandTimeout;
        this.command = strArr;
        this.f10975id = i2;
        createHandler(RootShell.handlerEnabled);
    }

    private void createHandler(boolean z) {
        this.handlerEnabled = z;
        if (Looper.myLooper() == null || !z) {
            RootShell.log("CommandHandler not created");
        } else {
            RootShell.log("CommandHandler created");
            this.mHandler = new CommandHandler();
        }
    }

    public void commandCompleted(int i2, int i3) {
    }

    protected final void commandFinished() {
        if (this.terminated) {
            return;
        }
        synchronized (this) {
            Handler handler = this.mHandler;
            if (handler == null || !this.handlerEnabled) {
                commandCompleted(this.f10975id, this.exitCode);
            } else {
                Message messageObtainMessage = handler.obtainMessage();
                Bundle bundle = new Bundle();
                bundle.putInt("action", 2);
                messageObtainMessage.setData(bundle);
                this.mHandler.sendMessage(messageObtainMessage);
            }
            RootShell.log("Command " + this.f10975id + " finished.");
            finishCommand();
        }
    }

    public void commandOutput(int i2, String str) {
        RootShell.log("Command", "ID: " + i2 + ", " + str);
        this.totalOutputProcessed = this.totalOutputProcessed + 1;
    }

    public void commandTerminated(int i2, String str) {
    }

    public final void finish() {
        RootShell.log("Command finished at users request!");
        commandFinished();
    }

    protected final void finishCommand() {
        this.executing = false;
        this.finished = true;
        notifyAll();
    }

    public final String getCommand() {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < this.command.length; i2++) {
            if (i2 > 0) {
                sb.append('\n');
            }
            sb.append(this.command[i2]);
        }
        return sb.toString();
    }

    public final int getExitCode() {
        return this.exitCode;
    }

    public final boolean isExecuting() {
        return this.executing;
    }

    public final boolean isFinished() {
        return this.finished;
    }

    public final boolean isHandlerEnabled() {
        return this.handlerEnabled;
    }

    protected final void output(int i2, String str) {
        this.totalOutput++;
        Handler handler = this.mHandler;
        if (handler == null || !this.handlerEnabled) {
            commandOutput(i2, str);
            return;
        }
        Message messageObtainMessage = handler.obtainMessage();
        Bundle bundle = new Bundle();
        bundle.putInt("action", 1);
        bundle.putString(CommandHandler.TEXT, str);
        messageObtainMessage.setData(bundle);
        this.mHandler.sendMessage(messageObtainMessage);
    }

    protected final void setExitCode(int i2) {
        synchronized (this) {
            this.exitCode = i2;
        }
    }

    protected final void startExecution() {
        this.used = true;
        ExecutionMonitor executionMonitor = new ExecutionMonitor(this);
        this.executionMonitor = executionMonitor;
        executionMonitor.setPriority(1);
        this.executionMonitor.start();
        this.executing = true;
    }

    public final void terminate() {
        RootShell.log("Terminating command at users request!");
        terminated("Terminated at users request!");
    }

    protected final void terminated(String str) {
        synchronized (this) {
            Handler handler = this.mHandler;
            if (handler == null || !this.handlerEnabled) {
                commandTerminated(this.f10975id, str);
            } else {
                Message messageObtainMessage = handler.obtainMessage();
                Bundle bundle = new Bundle();
                bundle.putInt("action", 3);
                bundle.putString(CommandHandler.TEXT, str);
                messageObtainMessage.setData(bundle);
                this.mHandler.sendMessage(messageObtainMessage);
            }
            RootShell.log("Command " + this.f10975id + " did not finish because it was terminated. Termination reason: " + str);
            setExitCode(-1);
            this.terminated = true;
            finishCommand();
        }
    }

    protected final void terminate(String str) {
        try {
            Shell.closeAll();
            RootShell.log("Terminating all shells.");
            terminated(str);
        } catch (IOException unused) {
        }
    }

    public Command(int i2, boolean z, String... strArr) {
        this.totalOutput = 0;
        this.totalOutputProcessed = 0;
        this.javaCommand = false;
        this.context = null;
        this.used = false;
        this.executionMonitor = null;
        this.mHandler = null;
        this.executing = false;
        this.command = new String[0];
        this.finished = false;
        this.terminated = false;
        this.handlerEnabled = true;
        this.exitCode = -1;
        this.f10975id = 0;
        this.timeout = RootShell.defaultCommandTimeout;
        this.command = strArr;
        this.f10975id = i2;
        createHandler(z);
    }

    public Command(int i2, int i3, String... strArr) {
        this.totalOutput = 0;
        this.totalOutputProcessed = 0;
        this.javaCommand = false;
        this.context = null;
        this.used = false;
        this.executionMonitor = null;
        this.mHandler = null;
        this.executing = false;
        this.command = new String[0];
        this.finished = false;
        this.terminated = false;
        this.handlerEnabled = true;
        this.exitCode = -1;
        this.f10975id = 0;
        this.timeout = RootShell.defaultCommandTimeout;
        this.command = strArr;
        this.f10975id = i2;
        this.timeout = i3;
        createHandler(RootShell.handlerEnabled);
    }
}
