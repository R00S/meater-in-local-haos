package c0;

import android.view.View;
import android.view.autofill.AutofillManager;
import kotlin.Metadata;

/* compiled from: AndroidAutofill.android.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\b\u0010\u0011¨\u0006\u0013"}, d2 = {"Lc0/a;", "Lc0/d;", "Landroid/view/View;", "view", "Lc0/i;", "autofillTree", "<init>", "(Landroid/view/View;Lc0/i;)V", "a", "Landroid/view/View;", "c", "()Landroid/view/View;", "b", "Lc0/i;", "()Lc0/i;", "Landroid/view/autofill/AutofillManager;", "Landroid/view/autofill/AutofillManager;", "()Landroid/view/autofill/AutofillManager;", "autofillManager", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: c0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2305a implements d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i autofillTree;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AutofillManager autofillManager;

    public C2305a(View view, i iVar) {
        this.view = view;
        this.autofillTree = iVar;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.autofillManager = autofillManager;
        view.setImportantForAutofill(1);
    }

    /* renamed from: a, reason: from getter */
    public final AutofillManager getAutofillManager() {
        return this.autofillManager;
    }

    /* renamed from: b, reason: from getter */
    public final i getAutofillTree() {
        return this.autofillTree;
    }

    /* renamed from: c, reason: from getter */
    public final View getView() {
        return this.view;
    }
}
