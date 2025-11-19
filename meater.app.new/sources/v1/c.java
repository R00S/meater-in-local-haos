package v1;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import r1.C4337d;
import r1.i;
import s1.C4427d;
import s1.X;

/* compiled from: InputConnectionCompat.java */
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public final class c {

    /* compiled from: InputConnectionCompat.java */
    class a extends InputConnectionWrapper {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f51009a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InputConnection inputConnection, boolean z10, b bVar) {
            super(inputConnection, z10);
            this.f51009a = bVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
            if (this.f51009a.a(d.f(inputContentInfo), i10, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i10, bundle);
        }
    }

    /* compiled from: InputConnectionCompat.java */
    public interface b {
        boolean a(d dVar, int i10, Bundle bundle);
    }

    private static b b(final View view) {
        i.g(view);
        return new b() { // from class: v1.b
            @Override // v1.c.b
            public final boolean a(d dVar, int i10, Bundle bundle) {
                return c.e(view, dVar, i10, bundle);
            }
        };
    }

    public static InputConnection c(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return d(inputConnection, editorInfo, b(view));
    }

    @Deprecated
    public static InputConnection d(InputConnection inputConnection, EditorInfo editorInfo, b bVar) {
        C4337d.d(inputConnection, "inputConnection must be non-null");
        C4337d.d(editorInfo, "editorInfo must be non-null");
        C4337d.d(bVar, "onCommitContentListener must be non-null");
        return new a(inputConnection, false, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean e(View view, d dVar, int i10, Bundle bundle) {
        if ((i10 & 1) != 0) {
            try {
                dVar.d();
                Parcelable parcelable = (Parcelable) dVar.e();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        return X.d0(view, new C4427d.a(new ClipData(dVar.b(), new ClipData.Item(dVar.a())), 2).d(dVar.c()).b(bundle).a()) == null;
    }
}
