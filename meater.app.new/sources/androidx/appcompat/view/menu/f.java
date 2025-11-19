package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.j;

/* compiled from: MenuDialogHelper.java */
/* loaded from: classes.dex */
class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* renamed from: B, reason: collision with root package name */
    private e f21040B;

    /* renamed from: C, reason: collision with root package name */
    private androidx.appcompat.app.b f21041C;

    /* renamed from: D, reason: collision with root package name */
    c f21042D;

    /* renamed from: E, reason: collision with root package name */
    private j.a f21043E;

    public f(e eVar) {
        this.f21040B = eVar;
    }

    public void a() {
        androidx.appcompat.app.b bVar = this.f21041C;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    public void b(IBinder iBinder) {
        e eVar = this.f21040B;
        b.a aVar = new b.a(eVar.w());
        c cVar = new c(aVar.getContext(), i.g.f42535j);
        this.f21042D = cVar;
        cVar.i(this);
        this.f21040B.b(this.f21042D);
        aVar.a(this.f21042D.a(), this);
        View viewA = eVar.A();
        if (viewA != null) {
            aVar.b(viewA);
        } else {
            aVar.c(eVar.y()).setTitle(eVar.z());
        }
        aVar.d(this);
        androidx.appcompat.app.b bVarCreate = aVar.create();
        this.f21041C = bVarCreate;
        bVarCreate.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f21041C.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f21041C.show();
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void d(e eVar, boolean z10) {
        if (z10 || eVar == this.f21040B) {
            a();
        }
        j.a aVar = this.f21043E;
        if (aVar != null) {
            aVar.d(eVar, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean e(e eVar) {
        j.a aVar = this.f21043E;
        if (aVar != null) {
            return aVar.e(eVar);
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f21040B.O((g) this.f21042D.a().getItem(i10), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f21042D.d(this.f21040B, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f21041C.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f21041C.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f21040B.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f21040B.performShortcut(i10, keyEvent, 0);
    }
}
