package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import g1.C3377a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: FragmentHostCallback.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B+\b\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000eJ9\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00028\u0000H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001f\u0010 J1\u0010(\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J\u0019\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010*\u001a\u00020\tH\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0017\u0010D\u001a\u00020?8G¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C¨\u0006E"}, d2 = {"Landroidx/fragment/app/s;", "H", "LJ1/g;", "Landroid/app/Activity;", "activity", "Landroid/content/Context;", "context", "Landroid/os/Handler;", "handler", "", "windowAnimations", "<init>", "(Landroid/app/Activity;Landroid/content/Context;Landroid/os/Handler;I)V", "Landroidx/fragment/app/o;", "(Landroidx/fragment/app/o;)V", "", "prefix", "Ljava/io/FileDescriptor;", "fd", "Ljava/io/PrintWriter;", "writer", "", "args", "Loa/F;", "m", "(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "p", "()Landroid/view/LayoutInflater;", "n", "()Ljava/lang/Object;", "s", "()V", "Landroidx/fragment/app/Fragment;", "fragment", "Landroid/content/Intent;", "intent", "requestCode", "Landroid/os/Bundle;", "options", "q", "(Landroidx/fragment/app/Fragment;Landroid/content/Intent;ILandroid/os/Bundle;)V", "id", "Landroid/view/View;", "e", "(I)Landroid/view/View;", "", "f", "()Z", "B", "Landroid/app/Activity;", "h", "()Landroid/app/Activity;", "C", "Landroid/content/Context;", "i", "()Landroid/content/Context;", "D", "Landroid/os/Handler;", "l", "()Landroid/os/Handler;", "E", "I", "Landroidx/fragment/app/v;", "F", "Landroidx/fragment/app/v;", "k", "()Landroidx/fragment/app/v;", "fragmentManager", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class s<H> extends J1.g {

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final Activity activity;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private final Handler handler;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private final int windowAnimations;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private final v fragmentManager;

    public s(Activity activity, Context context, Handler handler, int i10) {
        C3862t.g(context, "context");
        C3862t.g(handler, "handler");
        this.activity = activity;
        this.context = context;
        this.handler = handler;
        this.windowAnimations = i10;
        this.fragmentManager = new w();
    }

    @Override // J1.g
    public View e(int id2) {
        return null;
    }

    @Override // J1.g
    public boolean f() {
        return true;
    }

    /* renamed from: h, reason: from getter */
    public final Activity getActivity() {
        return this.activity;
    }

    /* renamed from: i, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    /* renamed from: k, reason: from getter */
    public final v getFragmentManager() {
        return this.fragmentManager;
    }

    /* renamed from: l, reason: from getter */
    public final Handler getHandler() {
        return this.handler;
    }

    public void m(String prefix, FileDescriptor fd2, PrintWriter writer, String[] args) {
        C3862t.g(prefix, "prefix");
        C3862t.g(writer, "writer");
    }

    public abstract H n();

    public LayoutInflater p() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.context);
        C3862t.f(layoutInflaterFrom, "from(context)");
        return layoutInflaterFrom;
    }

    public void q(Fragment fragment, Intent intent, int requestCode, Bundle options) {
        C3862t.g(fragment, "fragment");
        C3862t.g(intent, "intent");
        if (requestCode != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        C3377a.o(this.context, intent, options);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(o activity) {
        this(activity, activity, new Handler(), 0);
        C3862t.g(activity, "activity");
    }

    public void s() {
    }
}
