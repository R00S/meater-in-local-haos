package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.DialogInterfaceC0066c;
import androidx.appcompat.view.menu.InterfaceC0093m;
import p024c.p025a.C0829g;

/* compiled from: MenuDialogHelper.java */
/* renamed from: androidx.appcompat.view.menu.h */
/* loaded from: classes.dex */
class DialogInterfaceOnKeyListenerC0088h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0093m.a {

    /* renamed from: f */
    private C0087g f603f;

    /* renamed from: g */
    private DialogInterfaceC0066c f604g;

    /* renamed from: h */
    C0085e f605h;

    /* renamed from: i */
    private InterfaceC0093m.a f606i;

    public DialogInterfaceOnKeyListenerC0088h(C0087g c0087g) {
        this.f603f = c0087g;
    }

    /* renamed from: a */
    public void m606a() {
        DialogInterfaceC0066c dialogInterfaceC0066c = this.f604g;
        if (dialogInterfaceC0066c != null) {
            dialogInterfaceC0066c.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m.a
    /* renamed from: b */
    public void mo366b(C0087g c0087g, boolean z) {
        if (z || c0087g == this.f603f) {
            m606a();
        }
        InterfaceC0093m.a aVar = this.f606i;
        if (aVar != null) {
            aVar.mo366b(c0087g, z);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0093m.a
    /* renamed from: c */
    public boolean mo367c(C0087g c0087g) {
        InterfaceC0093m.a aVar = this.f606i;
        if (aVar != null) {
            return aVar.mo367c(c0087g);
        }
        return false;
    }

    /* renamed from: d */
    public void m607d(IBinder iBinder) {
        C0087g c0087g = this.f603f;
        DialogInterfaceC0066c.a aVar = new DialogInterfaceC0066c.a(c0087g.m602w());
        C0085e c0085e = new C0085e(aVar.m245b(), C0829g.f5171j);
        this.f605h = c0085e;
        c0085e.mo496g(this);
        this.f603f.m581b(this.f605h);
        aVar.m246c(this.f605h.m536a(), this);
        View viewM556A = c0087g.m556A();
        if (viewM556A != null) {
            aVar.m248e(viewM556A);
        } else {
            aVar.m250g(c0087g.m604y()).m265v(c0087g.m605z());
        }
        aVar.m259p(this);
        DialogInterfaceC0066c dialogInterfaceC0066cM244a = aVar.m244a();
        this.f604g = dialogInterfaceC0066cM244a;
        dialogInterfaceC0066cM244a.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f604g.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f604g.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        this.f603f.m568N((C0089i) this.f605h.m536a().getItem(i2), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f605h.mo492b(this.f603f, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i2 == 82 || i2 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f604g.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f604g.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f603f.m587e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f603f.performShortcut(i2, keyEvent, 0);
    }
}
