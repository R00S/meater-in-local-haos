package androidx.preference;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC0066c;
import androidx.fragment.app.ActivityC0468d;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c;
import androidx.preference.DialogPreference;
import androidx.savedstate.InterfaceC0674c;
import cm.aptoide.p092pt.database.room.RoomNotification;

/* compiled from: PreferenceDialogFragmentCompat.java */
/* renamed from: androidx.preference.f */
/* loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC0562f extends DialogInterfaceOnCancelListenerC0466c implements DialogInterface.OnClickListener {

    /* renamed from: f */
    private DialogPreference f3658f;

    /* renamed from: g */
    private CharSequence f3659g;

    /* renamed from: h */
    private CharSequence f3660h;

    /* renamed from: i */
    private CharSequence f3661i;

    /* renamed from: j */
    private CharSequence f3662j;

    /* renamed from: k */
    private int f3663k;

    /* renamed from: l */
    private BitmapDrawable f3664l;

    /* renamed from: m */
    private int f3665m;

    /* renamed from: j */
    private void m4111j(Dialog dialog) {
        dialog.getWindow().setSoftInputMode(5);
    }

    /* renamed from: d */
    public DialogPreference m4112d() {
        if (this.f3658f == null) {
            this.f3658f = (DialogPreference) ((DialogPreference.InterfaceC0532a) getTargetFragment()).findPreference(getArguments().getString(RoomNotification.KEY));
        }
        return this.f3658f;
    }

    /* renamed from: e */
    protected boolean mo4101e() {
        return false;
    }

    /* renamed from: f */
    protected void mo4102f(View view) {
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.f3662j;
            int i2 = 8;
            if (!TextUtils.isEmpty(charSequence)) {
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(charSequence);
                }
                i2 = 0;
            }
            if (viewFindViewById.getVisibility() != i2) {
                viewFindViewById.setVisibility(i2);
            }
        }
    }

    /* renamed from: g */
    protected View m4113g(Context context) {
        int i2 = this.f3663k;
        if (i2 == 0) {
            return null;
        }
        return LayoutInflater.from(context).inflate(i2, (ViewGroup) null);
    }

    /* renamed from: h */
    public abstract void mo4103h(boolean z);

    /* renamed from: i */
    protected void mo4108i(DialogInterfaceC0066c.a aVar) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i2) {
        this.f3665m = i2;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InterfaceC0674c targetFragment = getTargetFragment();
        if (!(targetFragment instanceof DialogPreference.InterfaceC0532a)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        DialogPreference.InterfaceC0532a interfaceC0532a = (DialogPreference.InterfaceC0532a) targetFragment;
        String string = getArguments().getString(RoomNotification.KEY);
        if (bundle != null) {
            this.f3659g = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f3660h = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.f3661i = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f3662j = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f3663k = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.f3664l = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) interfaceC0532a.findPreference(string);
        this.f3658f = dialogPreference;
        this.f3659g = dialogPreference.m3936c1();
        this.f3660h = this.f3658f.m3938e1();
        this.f3661i = this.f3658f.m3937d1();
        this.f3662j = this.f3658f.m3935b1();
        this.f3663k = this.f3658f.m3934a1();
        Drawable drawableM3933Z0 = this.f3658f.m3933Z0();
        if (drawableM3933Z0 == null || (drawableM3933Z0 instanceof BitmapDrawable)) {
            this.f3664l = (BitmapDrawable) drawableM3933Z0;
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableM3933Z0.getIntrinsicWidth(), drawableM3933Z0.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawableM3933Z0.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawableM3933Z0.draw(canvas);
        this.f3664l = new BitmapDrawable(getResources(), bitmapCreateBitmap);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c
    public Dialog onCreateDialog(Bundle bundle) {
        ActivityC0468d activity = getActivity();
        this.f3665m = -2;
        DialogInterfaceC0066c.a aVarM256m = new DialogInterfaceC0066c.a(activity).m265v(this.f3659g).m250g(this.f3664l).m261r(this.f3660h, this).m256m(this.f3661i, this);
        View viewM4113g = m4113g(activity);
        if (viewM4113g != null) {
            mo4102f(viewM4113g);
            aVarM256m.m266w(viewM4113g);
        } else {
            aVarM256m.m253j(this.f3662j);
        }
        mo4108i(aVarM256m);
        DialogInterfaceC0066c dialogInterfaceC0066cM244a = aVarM256m.m244a();
        if (mo4101e()) {
            m4111j(dialogInterfaceC0066cM244a);
        }
        return dialogInterfaceC0066cM244a;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        mo4103h(this.f3665m == -1);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f3659g);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f3660h);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f3661i);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f3662j);
        bundle.putInt("PreferenceDialogFragment.layout", this.f3663k);
        BitmapDrawable bitmapDrawable = this.f3664l;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }
}
