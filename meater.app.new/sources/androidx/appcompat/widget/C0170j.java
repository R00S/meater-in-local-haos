package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* compiled from: AppCompatHintHelper.java */
/* renamed from: androidx.appcompat.widget.j */
/* loaded from: classes.dex */
class C0170j {
    /* renamed from: a */
    static InputConnection m1030a(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                }
                if (parent instanceof InterfaceC0199x0) {
                    editorInfo.hintText = ((InterfaceC0199x0) parent).m1233a();
                    break;
                }
                parent = parent.getParent();
            }
        }
        return inputConnection;
    }
}
