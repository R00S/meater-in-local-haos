package com.apptionlabs.meater_app.qsg.ui.info;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.apptionlabs.meater_app.qsg.ui.info.a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.b;
import kotlin.Metadata;
import wh.m;

/* compiled from: DeviceSelectionBottomSheet.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fR$\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/apptionlabs/meater_app/qsg/ui/info/a;", "Lcom/google/android/material/bottomsheet/b;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "e1", "Lih/u;", "x1", "Lcom/apptionlabs/meater_app/qsg/ui/info/a$a;", "buttonListener", "U2", "K0", "Lcom/apptionlabs/meater_app/qsg/ui/info/a$a;", "getListener", "()Lcom/apptionlabs/meater_app/qsg/ui/info/a$a;", "setListener", "(Lcom/apptionlabs/meater_app/qsg/ui/info/a$a;)V", "listener", "<init>", "()V", "a", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class a extends b {

    /* renamed from: K0, reason: from kotlin metadata */
    private InterfaceC0137a listener;

    /* compiled from: DeviceSelectionBottomSheet.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0005"}, d2 = {"Lcom/apptionlabs/meater_app/qsg/ui/info/a$a;", "", "Lih/u;", "a", "b", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.apptionlabs.meater_app.qsg.ui.info.a$a, reason: collision with other inner class name */
    /* loaded from: /tmp/meat/meat/classes.dex */
    public interface InterfaceC0137a {
        void a();

        void b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V2(a aVar, View view) {
        m.f(aVar, "this$0");
        aVar.A2();
        InterfaceC0137a interfaceC0137a = aVar.listener;
        if (interfaceC0137a != null) {
            interfaceC0137a.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W2(a aVar, View view) {
        m.f(aVar, "this$0");
        aVar.A2();
        InterfaceC0137a interfaceC0137a = aVar.listener;
        if (interfaceC0137a != null) {
            interfaceC0137a.a();
        }
    }

    public final void U2(InterfaceC0137a interfaceC0137a) {
        m.f(interfaceC0137a, "buttonListener");
        this.listener = interfaceC0137a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View e1(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        m.f(inflater, "inflater");
        View inflate = inflater.inflate(2131558702, container, false);
        m.e(inflate, "inflate(...)");
        K2(false);
        Button button = (Button) inflate.findViewById(2131362085);
        Button button2 = (Button) inflate.findViewById(2131362086);
        button.setOnClickListener(new View.OnClickListener() { // from class: g7.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a.V2(a.this, view);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() { // from class: g7.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a.W2(a.this, view);
            }
        });
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void x1() {
        super/*androidx.fragment.app.m*/.x1();
        Object parent = f2().getParent();
        m.d(parent, "null cannot be cast to non-null type android.view.View");
        BottomSheetBehavior q02 = BottomSheetBehavior.q0((View) parent);
        m.e(q02, "from(...)");
        q02.W0(3);
    }
}
