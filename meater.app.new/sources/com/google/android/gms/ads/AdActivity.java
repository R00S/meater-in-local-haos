package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaqg;
import com.google.android.gms.internal.ads.zzbad;
import com.google.android.gms.internal.ads.zzyt;

@KeepForSdkWithMembers
/* loaded from: classes2.dex */
public class AdActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    public static final String SIMPLE_CLASS_NAME = "AdActivity";
    private zzaqg zzaah;

    private final void zzdd() {
        zzaqg zzaqgVar = this.zzaah;
        if (zzaqgVar != null) {
            try {
                zzaqgVar.zzdd();
            } catch (RemoteException e2) {
                zzbad.m17350f("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        try {
            this.zzaah.onActivityResult(i2, i3, intent);
        } catch (Exception e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        boolean zZztg = true;
        try {
            zzaqg zzaqgVar = this.zzaah;
            if (zzaqgVar != null) {
                zZztg = zzaqgVar.zztg();
            }
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
        if (zZztg) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            this.zzaah.zzac(ObjectWrapper.m14708E0(configuration));
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzaqg zzaqgVarM20841e = zzyt.m20845b().m20841e(this);
        this.zzaah = zzaqgVarM20841e;
        if (zzaqgVarM20841e == null) {
            zzbad.m17350f("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            zzaqgVarM20841e.onCreate(bundle);
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        try {
            zzaqg zzaqgVar = this.zzaah;
            if (zzaqgVar != null) {
                zzaqgVar.onDestroy();
            }
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onPause() {
        try {
            zzaqg zzaqgVar = this.zzaah;
            if (zzaqgVar != null) {
                zzaqgVar.onPause();
            }
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        try {
            zzaqg zzaqgVar = this.zzaah;
            if (zzaqgVar != null) {
                zzaqgVar.onRestart();
            }
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        try {
            zzaqg zzaqgVar = this.zzaah;
            if (zzaqgVar != null) {
                zzaqgVar.onResume();
            }
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        try {
            zzaqg zzaqgVar = this.zzaah;
            if (zzaqgVar != null) {
                zzaqgVar.onSaveInstanceState(bundle);
            }
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        try {
            zzaqg zzaqgVar = this.zzaah;
            if (zzaqgVar != null) {
                zzaqgVar.onStart();
            }
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        try {
            zzaqg zzaqgVar = this.zzaah;
            if (zzaqgVar != null) {
                zzaqgVar.onStop();
            }
        } catch (RemoteException e2) {
            zzbad.m17350f("#007 Could not call remote method.", e2);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public void setContentView(int i2) {
        super.setContentView(i2);
        zzdd();
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        zzdd();
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zzdd();
    }
}
